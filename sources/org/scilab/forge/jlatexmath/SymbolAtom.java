package org.scilab.forge.jlatexmath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.BitSet;
import java.util.Map;

public class SymbolAtom extends CharSymbol {
    public static Map<String, SymbolAtom> symbols = new TeXSymbolParser().readSymbols();
    private static BitSet validSymbolTypes;
    private final boolean delimiter;
    private final String name;
    private char unicode;

    static {
        BitSet bitSet = new BitSet(16);
        validSymbolTypes = bitSet;
        bitSet.set(0);
        validSymbolTypes.set(1);
        validSymbolTypes.set(2);
        validSymbolTypes.set(3);
        validSymbolTypes.set(4);
        validSymbolTypes.set(5);
        validSymbolTypes.set(6);
        validSymbolTypes.set(10);
    }

    public SymbolAtom(SymbolAtom symbolAtom, int i) {
        if (!validSymbolTypes.get(i)) {
            throw new InvalidSymbolTypeException("The symbol type was not valid! Use one of the symbol type constants from the class 'TeXConstants'.");
        }
        this.name = symbolAtom.name;
        this.type = i;
        if (i == 1) {
            this.type_limits = 0;
        }
        this.delimiter = symbolAtom.delimiter;
    }

    public static void addSymbolAtom(String str) {
        try {
            addSymbolAtom(new FileInputStream(str), str);
        } catch (FileNotFoundException e) {
            throw new ResourceParseException(str, e);
        }
    }

    public static SymbolAtom get(String str) {
        SymbolAtom symbolAtom = symbols.get(str);
        if (symbolAtom != null) {
            return symbolAtom;
        }
        throw new SymbolNotFoundException(str);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        char c;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Char nextLarger = teXFont.getChar(this.name, style);
        Box charBox = new CharBox(nextLarger);
        if (teXEnvironment.getSmallCap() && (c = this.unicode) != 0 && Character.isLowerCase(c)) {
            try {
                charBox = new ScaleBox(new CharBox(teXFont.getChar(TeXFormula.symbolTextMappings[Character.toUpperCase(this.unicode)], style)), 0.8d, 0.8d);
            } catch (SymbolMappingNotFoundException unused) {
            }
        }
        if (this.type != 1) {
            return charBox;
        }
        if (style < 2 && teXFont.hasNextLarger(nextLarger)) {
            nextLarger = teXFont.getNextLarger(nextLarger, style);
        }
        CharBox charBox2 = new CharBox(nextLarger);
        charBox2.setShift(((-(charBox2.getDepth() + charBox2.getHeight())) / 2.0f) - teXEnvironment.getTeXFont().getAxisHeight(teXEnvironment.getStyle()));
        float italic = nextLarger.getItalic();
        HorizontalBox horizontalBox = new HorizontalBox(charBox2);
        if (italic > 1.0E-7f) {
            horizontalBox.add(new StrutBox(italic, 0.0f, 0.0f, 0.0f));
        }
        return horizontalBox;
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return teXFont.getChar(this.name, 0).getCharFont();
    }

    public String getName() {
        return this.name;
    }

    public char getUnicode() {
        return this.unicode;
    }

    public boolean isDelimiter() {
        return this.delimiter;
    }

    public SymbolAtom setUnicode(char c) {
        this.unicode = c;
        return this;
    }

    public static void addSymbolAtom(InputStream inputStream, String str) {
        symbols.putAll(new TeXSymbolParser(inputStream, str).readSymbols());
    }

    public static void addSymbolAtom(SymbolAtom symbolAtom) {
        symbols.put(symbolAtom.name, symbolAtom);
    }

    public SymbolAtom(String str, int i, boolean z) {
        this.name = str;
        this.type = i;
        if (i == 1) {
            this.type_limits = 0;
        }
        this.delimiter = z;
    }
}
