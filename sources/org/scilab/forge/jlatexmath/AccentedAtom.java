package org.scilab.forge.jlatexmath;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;

public class AccentedAtom extends Atom {
    private boolean acc;
    private final SymbolAtom accent;
    protected Atom base;
    private boolean changeSize;
    protected Atom underbase;

    public AccentedAtom(Atom atom, Atom atom2) {
        this.acc = false;
        this.changeSize = true;
        this.underbase = null;
        this.base = atom;
        if (atom instanceof AccentedAtom) {
            this.underbase = ((AccentedAtom) atom).underbase;
        } else {
            this.underbase = atom;
        }
        if (!(atom2 instanceof SymbolAtom)) {
            throw new InvalidSymbolTypeException("Invalid accent");
        }
        this.accent = (SymbolAtom) atom2;
        this.acc = true;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Atom atom = this.base;
        Box strutBox = atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment.crampStyle());
        float width = strutBox.getWidth();
        Atom atom2 = this.underbase;
        float skew = atom2 instanceof CharSymbol ? teXFont.getSkew(((CharSymbol) atom2).getCharFont(teXFont), style) : 0.0f;
        Char r6 = teXFont.getChar(this.accent.getName(), style);
        while (teXFont.hasNextLarger(r6)) {
            Char nextLarger = teXFont.getNextLarger(r6, style);
            if (nextLarger.getWidth() > width) {
                break;
            }
            r6 = nextLarger;
        }
        float fMin = -SpaceAtom.getFactor(5, teXEnvironment);
        if (!this.acc) {
            fMin = Math.min(strutBox.getHeight(), teXFont.getXHeight(style, r6.getFontCode()));
        }
        VerticalBox verticalBox = new VerticalBox();
        float italic = r6.getItalic();
        Box charBox = new CharBox(r6);
        if (this.acc) {
            SymbolAtom symbolAtom = this.accent;
            if (this.changeSize) {
                teXEnvironment = teXEnvironment.subStyle();
            }
            charBox = symbolAtom.createBox(teXEnvironment);
        }
        if (Math.abs(italic) > 1.0E-7f) {
            HorizontalBox horizontalBox = new HorizontalBox(new StrutBox(-italic, 0.0f, 0.0f, 0.0f));
            horizontalBox.add(charBox);
            charBox = horizontalBox;
        }
        float width2 = (width - charBox.getWidth()) / 2.0f;
        charBox.setShift(skew + (width2 > 0.0f ? width2 : 0.0f));
        if (width2 < 0.0f) {
            strutBox = new HorizontalBox(strutBox, charBox.getWidth(), 2);
        }
        verticalBox.add(charBox);
        verticalBox.add(new StrutBox(0.0f, this.changeSize ? -fMin : -strutBox.getHeight(), 0.0f, 0.0f));
        verticalBox.add(strutBox);
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        float depth2 = strutBox.getDepth();
        verticalBox.setDepth(depth2);
        verticalBox.setHeight(depth - depth2);
        if (width2 >= 0.0f) {
            return verticalBox;
        }
        HorizontalBox horizontalBox2 = new HorizontalBox(new StrutBox(width2, 0.0f, 0.0f, 0.0f));
        horizontalBox2.add(verticalBox);
        horizontalBox2.setWidth(width);
        return horizontalBox2;
    }

    public AccentedAtom(Atom atom, Atom atom2, boolean z) {
        this(atom, atom2);
        this.changeSize = z;
    }

    public AccentedAtom(Atom atom, String str) {
        this.acc = false;
        this.changeSize = true;
        this.base = null;
        this.underbase = null;
        SymbolAtom symbolAtom = SymbolAtom.get(str);
        this.accent = symbolAtom;
        if (symbolAtom.type == 10) {
            this.base = atom;
            if (atom instanceof AccentedAtom) {
                this.underbase = ((AccentedAtom) atom).underbase;
                return;
            } else {
                this.underbase = atom;
                return;
            }
        }
        throw new InvalidSymbolTypeException(Fragment$$ExternalSyntheticOutline0.m("The symbol with the name '", str, "' is not defined as an accent (type='acc') in 'TeXSymbols.xml'!"));
    }

    public AccentedAtom(Atom atom, TeXFormula teXFormula) {
        this.acc = false;
        this.changeSize = true;
        this.base = null;
        this.underbase = null;
        if (teXFormula != null) {
            Atom atom2 = teXFormula.root;
            if (atom2 instanceof SymbolAtom) {
                SymbolAtom symbolAtom = (SymbolAtom) atom2;
                this.accent = symbolAtom;
                if (symbolAtom.type == 10) {
                    this.base = atom;
                    return;
                }
                throw new InvalidSymbolTypeException("The accent TeXFormula represents a single symbol with the name '" + symbolAtom.getName() + "', but this symbol is not defined as an accent (type='acc') in 'TeXSymbols.xml'!");
            }
            throw new InvalidTeXFormulaException("The accent TeXFormula does not represent a single symbol!");
        }
        throw new InvalidTeXFormulaException("The accent TeXFormula can't be null!");
    }
}
