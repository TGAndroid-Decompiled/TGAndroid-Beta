package org.scilab.forge.jlatexmath;

import android.support.v4.media.a;
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
        if (atom2 instanceof SymbolAtom) {
            this.accent = (SymbolAtom) atom2;
            this.acc = true;
            return;
        }
        throw new InvalidSymbolTypeException("Invalid accent");
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        HorizontalBox createBox;
        float f10;
        float f11;
        float f12;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Atom atom = this.base;
        if (atom == null) {
            createBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            createBox = atom.createBox(teXEnvironment.crampStyle());
        }
        float width = createBox.getWidth();
        Atom atom2 = this.underbase;
        if (atom2 instanceof CharSymbol) {
            f10 = teXFont.getSkew(((CharSymbol) atom2).getCharFont(teXFont), style);
        } else {
            f10 = 0.0f;
        }
        Char r62 = teXFont.getChar(this.accent.getName(), style);
        while (teXFont.hasNextLarger(r62)) {
            Char nextLarger = teXFont.getNextLarger(r62, style);
            if (nextLarger.getWidth() > width) {
                break;
            }
            r62 = nextLarger;
        }
        float f13 = -SpaceAtom.getFactor(5, teXEnvironment);
        if (!this.acc) {
            f13 = Math.min(createBox.getHeight(), teXFont.getXHeight(style, r62.getFontCode()));
        }
        VerticalBox verticalBox = new VerticalBox();
        float italic = r62.getItalic();
        HorizontalBox charBox = new CharBox(r62);
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
        if (width2 > 0.0f) {
            f11 = width2;
        } else {
            f11 = 0.0f;
        }
        charBox.setShift(f10 + f11);
        int i10 = (width2 > 0.0f ? 1 : (width2 == 0.0f ? 0 : -1));
        if (i10 < 0) {
            createBox = new HorizontalBox(createBox, charBox.getWidth(), 2);
        }
        verticalBox.add(charBox);
        if (this.changeSize) {
            f12 = -f13;
        } else {
            f12 = -createBox.getHeight();
        }
        verticalBox.add(new StrutBox(0.0f, f12, 0.0f, 0.0f));
        verticalBox.add(createBox);
        float height = verticalBox.getHeight();
        float depth = createBox.getDepth();
        verticalBox.setDepth(depth);
        verticalBox.setHeight((verticalBox.getDepth() + height) - depth);
        if (i10 < 0) {
            HorizontalBox horizontalBox2 = new HorizontalBox(new StrutBox(width2, 0.0f, 0.0f, 0.0f));
            horizontalBox2.add(verticalBox);
            horizontalBox2.setWidth(width);
            return horizontalBox2;
        }
        return verticalBox;
    }

    public AccentedAtom(Atom atom, Atom atom2, boolean z4) {
        this(atom, atom2);
        this.changeSize = z4;
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
        throw new InvalidSymbolTypeException(a.o("The symbol with the name '", str, "' is not defined as an accent (type='acc') in 'TeXSymbols.xml'!"));
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
