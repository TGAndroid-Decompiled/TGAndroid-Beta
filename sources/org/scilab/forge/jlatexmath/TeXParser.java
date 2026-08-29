package org.scilab.forge.jlatexmath;

import a4.w;
import j7.l1;
import java.lang.Character;
import java.util.HashSet;
import java.util.Set;
import org.scilab.forge.jlatexmath.TeXFormula;
import ru.noties.jlatexmath.awt.Color;
public class TeXParser {
    private static final char BACKPRIME = 8245;
    private static final char DEGRE = 176;
    private static final char DOLLAR = '$';
    private static final char DQUOTE = '\"';
    private static final char ESCAPE = '\\';
    private static final char L_BRACK = '[';
    private static final char L_GROUP = '{';
    private static final int MAX_FIRSTPASS_EXPANSIONS = 10000;
    private static final int MAX_FIRSTPASS_LENGTH = 65536;
    private static final long MAX_FIRSTPASS_WORK = 33554432;
    private static final int MAX_LASTPASS_EXPANSIONS = 10000;
    private static final int MAX_MACRO_ARGS = 256;
    private static final int MAX_PARSE_DEPTH = 64;
    private static final char PERCENT = '%';
    private static final char PRIME = '\'';
    private static final char R_BRACK = ']';
    private static final char R_GROUP = '}';
    private static final char SUBEIGHT = 8328;
    private static final char SUBEQUAL = 8332;
    private static final char SUBFIVE = 8325;
    private static final char SUBFOUR = 8324;
    private static final char SUBLPAR = 8333;
    private static final char SUBMINUS = 8331;
    private static final char SUBNINE = 8329;
    private static final char SUBONE = 8321;
    private static final char SUBPLUS = 8330;
    private static final char SUBRPAR = 8334;
    private static final char SUBSEVEN = 8327;
    private static final char SUBSIX = 8326;
    private static final char SUBTHREE = 8323;
    private static final char SUBTWO = 8322;
    private static final char SUBZERO = 8320;
    private static final char SUB_SCRIPT = '_';
    private static final char SUPEIGHT = 8312;
    private static final char SUPEQUAL = 8316;
    private static final char SUPER_SCRIPT = '^';
    private static final char SUPFIVE = 8309;
    private static final char SUPFOUR = 8308;
    private static final char SUPLPAR = 8317;
    private static final char SUPMINUS = 8315;
    private static final char SUPN = 8319;
    private static final char SUPNINE = 8313;
    private static final char SUPONE = 185;
    private static final char SUPPLUS = 8314;
    private static final char SUPRPAR = 8318;
    private static final char SUPSEVEN = 8311;
    private static final char SUPSIX = 8310;
    private static final char SUPTHREE = 179;
    private static final char SUPTWO = 178;
    private static final char SUPZERO = 8304;
    private static long firstpassExpansionWork = 0;
    protected static boolean isLoading = false;
    private static int lastpassExpansions;
    private static int parseDepth;
    private static final Set<String> unparsedContents;
    private boolean arrayMode;
    private int atIsLetter;
    private int col;
    TeXFormula formula;
    private int group;
    private boolean ignoreWhiteSpace;
    private boolean insertion;
    private boolean isPartial;
    private int len;
    private int line;
    private StringBuffer parseString;
    private int pos;
    private int spos;

    static {
        HashSet hashSet = new HashSet(6);
        unparsedContents = hashSet;
        hashSet.add("jlmDynamic");
        hashSet.add("jlmText");
        hashSet.add("jlmTextit");
        hashSet.add("jlmTextbf");
        hashSet.add("jlmTextitbf");
        hashSet.add("jlmExternalFont");
    }

    public TeXParser(String str, TeXFormula teXFormula) {
        this(str, teXFormula, true);
    }

    private static char convertToRomanNumber(char c3) {
        int i10;
        if (c3 == 1643) {
            return '.';
        }
        if (1632 <= c3 && c3 <= 1641) {
            i10 = c3 - 1584;
        } else if (1776 <= c3 && c3 <= 1785) {
            i10 = c3 - 1728;
        } else if (2406 <= c3 && c3 <= 2415) {
            i10 = c3 - 2358;
        } else if (2534 <= c3 && c3 <= 2543) {
            i10 = c3 - 2486;
        } else if (2662 <= c3 && c3 <= 2671) {
            i10 = c3 - 2614;
        } else if (2790 <= c3 && c3 <= 2799) {
            i10 = c3 - 2742;
        } else if (2918 <= c3 && c3 <= 2927) {
            i10 = c3 - 2870;
        } else if (3174 <= c3 && c3 <= 3183) {
            i10 = c3 - 3126;
        } else if (3430 <= c3 && c3 <= 3439) {
            i10 = c3 - 3382;
        } else if (3664 <= c3 && c3 <= 3673) {
            i10 = c3 - 3616;
        } else if (3792 <= c3 && c3 <= 3801) {
            i10 = c3 - 3744;
        } else if (3872 <= c3 && c3 <= 3881) {
            i10 = c3 - 3728;
        } else if (4160 <= c3 && c3 <= 4169) {
            i10 = c3 - 4112;
        } else if (6112 <= c3 && c3 <= 6121) {
            i10 = c3 - 6064;
        } else if (6160 <= c3 && c3 <= 6169) {
            i10 = c3 - 6112;
        } else if (6992 <= c3 && c3 <= 7001) {
            i10 = c3 - 6944;
        } else if (7088 <= c3 && c3 <= 7097) {
            i10 = c3 - 7040;
        } else if (7232 <= c3 && c3 <= 7241) {
            i10 = c3 - 7184;
        } else if (7248 <= c3 && c3 <= 7257) {
            i10 = c3 - 7200;
        } else if (43216 <= c3 && c3 <= 43225) {
            i10 = c3 - 43168;
        } else {
            return c3;
        }
        return (char) i10;
    }

    private void firstpass() {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.TeXParser.firstpass():void");
    }

    private java.lang.String getCommand() {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.TeXParser.getCommand():java.lang.String");
    }

    private String getCommandWithArgs(String str) {
        int i10;
        if (str.equals("left")) {
            return getGroup("\\left", "\\right");
        }
        MacroInfo macroInfo = MacroInfo.Commands.get(str);
        if (macroInfo != null) {
            int i11 = 0;
            if (macroInfo.hasOptions) {
                i10 = macroInfo.posOpts;
            } else {
                i10 = 0;
            }
            String[] optsArgs = getOptsArgs(macroInfo.nbArgs, i10);
            StringBuffer stringBuffer = new StringBuffer("\\");
            stringBuffer.append(str);
            for (int i12 = 0; i12 < macroInfo.posOpts; i12++) {
                String str2 = optsArgs[macroInfo.nbArgs + i12 + 1];
                if (str2 != null) {
                    stringBuffer.append("[");
                    stringBuffer.append(str2);
                    stringBuffer.append("]");
                }
            }
            while (i11 < macroInfo.nbArgs) {
                i11++;
                String str3 = optsArgs[i11];
                if (str3 != null) {
                    stringBuffer.append("{");
                    stringBuffer.append(str3);
                    stringBuffer.append("}");
                }
            }
            return stringBuffer.toString();
        }
        return "\\".concat(str);
    }

    private org.scilab.forge.jlatexmath.Atom getScripts(char r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.TeXParser.getScripts(char):org.scilab.forge.jlatexmath.Atom");
    }

    private void insert(int i10, int i11, String str) {
        this.parseString.replace(i10, i11, str);
        this.len = this.parseString.length();
        this.pos = i10;
        this.insertion = true;
    }

    private Atom processCommands(String str) {
        int i10;
        MacroInfo macroInfo = MacroInfo.Commands.get(str);
        if (macroInfo.hasOptions) {
            i10 = macroInfo.posOpts;
        } else {
            i10 = 0;
        }
        String[] optsArgs = getOptsArgs(macroInfo.nbArgs, i10);
        optsArgs[0] = str;
        if (NewCommandMacro.isMacro(str)) {
            int i11 = lastpassExpansions + 1;
            lastpassExpansions = i11;
            if (i11 <= 10000) {
                insert(this.spos, this.pos, (String) macroInfo.invoke(this, optsArgs));
                return null;
            }
            throw new ParseException("Macro expansion limit exceeded");
        }
        return (Atom) macroInfo.invoke(this, optsArgs);
    }

    private Atom processEscape() {
        this.spos = this.pos;
        String command = getCommand();
        if (command.length() == 0) {
            return new EmptyAtom();
        }
        if (MacroInfo.Commands.get(command) != null) {
            return processCommands(command);
        }
        try {
            try {
                return TeXFormula.get(command).root;
            } catch (SymbolNotFoundException unused) {
                if (this.isPartial) {
                    return new ColorAtom(new RomanAtom(new TeXFormula("\\backslash ".concat(command)).root), (Color) null, Color.RED);
                }
                throw new ParseException(w.n("Unknown symbol or command or predefined TeXFormula: '", command, "'"));
            }
        } catch (FormulaNotFoundException unused2) {
            return SymbolAtom.get(command);
        }
    }

    private final void skipWhiteSpace() {
        while (true) {
            int i10 = this.pos;
            if (i10 < this.len) {
                char charAt = this.parseString.charAt(i10);
                if (charAt == ' ' || charAt == '\t' || charAt == '\n' || charAt == '\r') {
                    if (charAt == '\n') {
                        this.line++;
                        this.col = this.pos;
                    }
                    this.pos++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void addAtom(Atom atom) {
        this.formula.add(atom);
    }

    public void addRow() {
        if (this.arrayMode) {
            ((ArrayOfAtoms) this.formula).addRow();
            return;
        }
        throw new ParseException("You can add a row only in array mode !");
    }

    public Atom convertCharacter(char c3, boolean z10) {
        String str;
        String[] strArr;
        TeXFormula.FontInfos fontInfos;
        if (this.ignoreWhiteSpace) {
            if (c3 >= 945 && c3 <= 969) {
                return SymbolAtom.get(TeXFormula.symbolMappings[c3]);
            }
            if (c3 >= 913 && c3 <= 937) {
                return new TeXFormula(TeXFormula.symbolFormulaMappings[c3]).root;
            }
        }
        char convertToRomanNumber = convertToRomanNumber(c3);
        if ((convertToRomanNumber >= '0' && convertToRomanNumber <= '9') || ((convertToRomanNumber >= 'a' && convertToRomanNumber <= 'z') || (convertToRomanNumber >= 'A' && convertToRomanNumber <= 'Z'))) {
            TeXFormula.FontInfos fontInfos2 = TeXFormula.externalFontMap.get(Character.UnicodeBlock.BASIC_LATIN);
            if (fontInfos2 != null) {
                if (z10) {
                    return new JavaFontRenderingAtom(Character.toString(convertToRomanNumber), fontInfos2);
                }
                int i10 = this.pos;
                this.pos = i10 + 1;
                int i11 = this.len - 1;
                while (true) {
                    int i12 = this.pos;
                    if (i12 >= this.len) {
                        break;
                    }
                    char charAt = this.parseString.charAt(i12);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z'))) {
                        break;
                    }
                    this.pos++;
                }
                i11 = this.pos - 1;
                this.pos = i11;
                return new JavaFontRenderingAtom(this.parseString.substring(i10, i11 + 1), fontInfos2);
            }
            return new CharAtom(convertToRomanNumber, this.formula.textStyle, this.ignoreWhiteSpace);
        }
        Character.UnicodeBlock of2 = Character.UnicodeBlock.of(convertToRomanNumber);
        if (!isLoading && !DefaultTeXFont.loadedAlphabets.contains(of2)) {
            DefaultTeXFont.addAlphabet(DefaultTeXFont.registeredAlphabets.get(of2));
        }
        String str2 = TeXFormula.symbolMappings[convertToRomanNumber];
        if (str2 == null && ((strArr = TeXFormula.symbolFormulaMappings) == null || strArr[convertToRomanNumber] == null)) {
            Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.BASIC_LATIN;
            boolean equals = unicodeBlock.equals(of2);
            if ((equals && TeXFormula.isRegisteredBlock(unicodeBlock)) || !equals) {
                fontInfos = TeXFormula.getExternalFont(of2);
            } else {
                fontInfos = null;
            }
            if (fontInfos != null) {
                if (z10) {
                    return new JavaFontRenderingAtom(Character.toString(convertToRomanNumber), fontInfos);
                }
                int i13 = this.pos;
                this.pos = i13 + 1;
                int i14 = this.len - 1;
                while (true) {
                    int i15 = this.pos;
                    if (i15 >= this.len) {
                        break;
                    } else if (!Character.UnicodeBlock.of(this.parseString.charAt(i15)).equals(of2)) {
                        i14 = this.pos - 1;
                        this.pos = i14;
                        break;
                    } else {
                        this.pos++;
                    }
                }
                return new JavaFontRenderingAtom(this.parseString.substring(i13, i14 + 1), fontInfos);
            } else if (this.isPartial) {
                return new ColorAtom(new RomanAtom(new TeXFormula(l1.l(convertToRomanNumber, "\\text{(Unknown char ", ")}")).root), (Color) null, Color.RED);
            } else {
                throw new ParseException("Unknown character : '" + Character.toString(convertToRomanNumber) + "' (or " + ((int) convertToRomanNumber) + ")");
            }
        } else if (!this.ignoreWhiteSpace && (str = TeXFormula.symbolTextMappings[convertToRomanNumber]) != null) {
            return SymbolAtom.get(str).setUnicode(convertToRomanNumber);
        } else {
            String[] strArr2 = TeXFormula.symbolFormulaMappings;
            if (strArr2 != null && strArr2[convertToRomanNumber] != null) {
                return new TeXFormula(TeXFormula.symbolFormulaMappings[convertToRomanNumber]).root;
            }
            try {
                return SymbolAtom.get(str2);
            } catch (SymbolNotFoundException e10) {
                throw new ParseException("The character '" + Character.toString(convertToRomanNumber) + "' was mapped to an unknown symbol with the name '" + str2 + "'!", e10);
            }
        }
    }

    public void finish() {
        this.pos = this.parseString.length();
    }

    public Atom getArgument() {
        skipWhiteSpace();
        int i10 = this.pos;
        if (i10 < this.len) {
            char charAt = this.parseString.charAt(i10);
            if (charAt == '{') {
                TeXFormula teXFormula = new TeXFormula();
                TeXFormula teXFormula2 = this.formula;
                this.formula = teXFormula;
                this.pos++;
                this.group++;
                parse();
                this.formula = teXFormula2;
                if (teXFormula2.root == null) {
                    RowAtom rowAtom = new RowAtom();
                    rowAtom.add(teXFormula.root);
                    return rowAtom;
                }
                return teXFormula.root;
            } else if (charAt == '\\') {
                Atom processEscape = processEscape();
                if (this.insertion) {
                    this.insertion = false;
                    return getArgument();
                }
                return processEscape;
            } else {
                Atom convertCharacter = convertCharacter(charAt, true);
                this.pos++;
                return convertCharacter;
            }
        }
        return new EmptyAtom();
    }

    public int getCol() {
        return (this.pos - this.col) - 1;
    }

    public String getDollarGroup(char c3) {
        char charAt;
        int i10;
        int i11 = this.pos;
        do {
            StringBuffer stringBuffer = this.parseString;
            int i12 = this.pos;
            this.pos = i12 + 1;
            charAt = stringBuffer.charAt(i12);
            if (charAt == '\\') {
                this.pos++;
            }
            i10 = this.pos;
            if (i10 >= this.len) {
                break;
            }
        } while (charAt != c3);
        if (charAt == c3) {
            return this.parseString.substring(i11, i10 - 1);
        }
        return this.parseString.substring(i11, i10);
    }

    public Atom getFormulaAtom() {
        TeXFormula teXFormula = this.formula;
        Atom atom = teXFormula.root;
        teXFormula.root = null;
        return atom;
    }

    public String getGroup(char c3, char c6) {
        int i10;
        int i11;
        int i12 = this.pos;
        if (i12 == this.len) {
            return null;
        }
        char charAt = this.parseString.charAt(i12);
        int i13 = this.pos;
        if (i13 < this.len && charAt == c3) {
            int i14 = 1;
            while (true) {
                i10 = this.pos;
                if (i10 >= this.len - 1 || i14 == 0) {
                    break;
                }
                int i15 = i10 + 1;
                this.pos = i15;
                char charAt2 = this.parseString.charAt(i15);
                if (charAt2 == c3) {
                    i14++;
                } else if (charAt2 == c6) {
                    i14--;
                } else if (charAt2 == '\\' && (i11 = this.pos) != this.len - 1) {
                    this.pos = i11 + 1;
                }
            }
            int i16 = i10 + 1;
            this.pos = i16;
            if (i14 != 0) {
                return this.parseString.substring(i13 + 1, i16);
            }
            return this.parseString.substring(i13 + 1, i10);
        }
        throw new ParseException("missing '" + c3 + "'!");
    }

    public boolean getIsPartial() {
        return this.isPartial;
    }

    public Atom getLastAtom() {
        TeXFormula teXFormula = this.formula;
        Atom atom = teXFormula.root;
        if (atom instanceof RowAtom) {
            return ((RowAtom) atom).getLastAtom();
        }
        teXFormula.root = null;
        return atom;
    }

    public float[] getLength() {
        if (this.pos == this.len) {
            return null;
        }
        skipWhiteSpace();
        int i10 = this.pos;
        char c3 = 0;
        while (true) {
            int i11 = this.pos;
            if (i11 >= this.len || c3 == ' ') {
                break;
            }
            StringBuffer stringBuffer = this.parseString;
            this.pos = i11 + 1;
            c3 = stringBuffer.charAt(i11);
        }
        skipWhiteSpace();
        return SpaceAtom.getLength(this.parseString.substring(i10, this.pos - 1));
    }

    public int getLine() {
        return this.line;
    }

    public String[] getOptsArgs(int i10, int i11) {
        i10 = (i10 < 0 || i10 > 256) ? 256 : 256;
        String[] strArr = new String[i10 + 11];
        if (i10 != 0) {
            if (i11 == 1) {
                for (int i12 = i10 + 1; i12 < i10 + 11; i12++) {
                    try {
                        skipWhiteSpace();
                        strArr[i12] = getGroup('[', ']');
                    } catch (ParseException unused) {
                        strArr[i12] = null;
                    }
                }
            }
            skipWhiteSpace();
            try {
                strArr[1] = getGroup('{', '}');
            } catch (ParseException unused2) {
                if (this.parseString.charAt(this.pos) != '\\') {
                    strArr[1] = "" + this.parseString.charAt(this.pos);
                    this.pos = this.pos + 1;
                } else {
                    strArr[1] = getCommandWithArgs(getCommand());
                }
            }
            if (i11 == 2) {
                for (int i13 = i10 + 1; i13 < i10 + 11; i13++) {
                    try {
                        skipWhiteSpace();
                        strArr[i13] = getGroup('[', ']');
                    } catch (ParseException unused3) {
                        strArr[i13] = null;
                    }
                }
            }
            for (int i14 = 2; i14 <= i10; i14++) {
                skipWhiteSpace();
                try {
                    strArr[i14] = getGroup('{', '}');
                } catch (ParseException unused4) {
                    if (this.parseString.charAt(this.pos) != '\\') {
                        strArr[i14] = "" + this.parseString.charAt(this.pos);
                        this.pos = this.pos + 1;
                    } else {
                        strArr[i14] = getCommandWithArgs(getCommand());
                    }
                }
            }
            if (this.ignoreWhiteSpace) {
                skipWhiteSpace();
            }
        }
        return strArr;
    }

    public String getOverArgument() {
        int i10;
        String substring;
        int i11 = this.pos;
        if (i11 == this.len) {
            return null;
        }
        char c3 = 0;
        int i12 = 1;
        char c6 = 0;
        while (true) {
            i10 = this.pos;
            if (i10 >= this.len || i12 == 0) {
                break;
            }
            c6 = this.parseString.charAt(i10);
            if (c6 != '&') {
                if (c6 != '\\') {
                    if (c6 != '{') {
                        if (c6 != '}') {
                        }
                        i12--;
                    } else {
                        i12++;
                    }
                } else {
                    int i13 = this.pos + 1;
                    this.pos = i13;
                    if (i13 < this.len && this.parseString.charAt(i13) == '\\' && i12 == 1) {
                        i12--;
                        this.pos--;
                    } else {
                        int i14 = this.pos;
                        if (i14 < this.len - 1 && this.parseString.charAt(i14) == 'c' && this.parseString.charAt(this.pos + 1) == 'r' && i12 == 1) {
                            i12--;
                            this.pos--;
                        }
                    }
                }
                this.pos++;
            } else {
                if (i12 != 1) {
                    this.pos++;
                }
                i12--;
                this.pos++;
            }
        }
        if (i12 < 2) {
            if (i12 == 0) {
                substring = this.parseString.substring(i11, i10 - 1);
                c3 = c6;
            } else {
                substring = this.parseString.substring(i11, i10);
            }
            if (c3 != '&' && c3 != '\\' && c3 != '}') {
                return substring;
            }
            this.pos--;
            return substring;
        }
        throw new ParseException("Illegal end,  missing '}' !");
    }

    public int getPos() {
        return this.pos;
    }

    public String getStringFromCurrentPos() {
        return this.parseString.substring(this.pos);
    }

    public boolean isArrayMode() {
        return this.arrayMode;
    }

    public boolean isAtLetter() {
        if (this.atIsLetter != 0) {
            return true;
        }
        return false;
    }

    public boolean isIgnoreWhiteSpace() {
        return this.ignoreWhiteSpace;
    }

    public boolean isMathMode() {
        return this.ignoreWhiteSpace;
    }

    public final boolean isValidCharacterInCommand(char c3) {
        if (!Character.isLetter(c3)) {
            if (this.atIsLetter == 0 || c3 != '@') {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean isValidName(String str) {
        char c3 = 0;
        if (str == null || "".equals(str) || str.charAt(0) != '\\') {
            return false;
        }
        int length = str.length();
        for (int i10 = 1; i10 < length; i10++) {
            c3 = str.charAt(i10);
            if (!Character.isLetter(c3) && (this.atIsLetter == 0 || c3 != '@')) {
                break;
            }
        }
        return Character.isLetter(c3);
    }

    public void makeAtLetter() {
        this.atIsLetter++;
    }

    public void makeAtOther() {
        this.atIsLetter--;
    }

    public void parse() {
        int i10;
        boolean z10;
        char charAt;
        int i11 = parseDepth;
        int i12 = i11 + 1;
        parseDepth = i12;
        if (i12 <= 64) {
            try {
                if (this.len != 0) {
                    while (true) {
                        int i13 = this.pos;
                        if (i13 >= this.len) {
                            break;
                        }
                        char charAt2 = this.parseString.charAt(i13);
                        if (charAt2 != '\t') {
                            if (charAt2 != '\n') {
                                if (charAt2 != '\r') {
                                    if (charAt2 != ' ') {
                                        if (charAt2 != '\"') {
                                            if (charAt2 != '$') {
                                                if (charAt2 != '\\') {
                                                    if (charAt2 != '{') {
                                                        if (charAt2 != 8245) {
                                                            if (charAt2 != '&') {
                                                                if (charAt2 != '\'') {
                                                                    if (charAt2 != '^') {
                                                                        if (charAt2 != '_') {
                                                                            if (charAt2 != '}') {
                                                                                if (charAt2 != '~') {
                                                                                    this.formula.add(convertCharacter(charAt2, false));
                                                                                    this.pos++;
                                                                                } else {
                                                                                    this.formula.add(new SpaceAtom());
                                                                                    this.pos++;
                                                                                }
                                                                            } else {
                                                                                int i14 = this.group - 1;
                                                                                this.group = i14;
                                                                                this.pos++;
                                                                                if (i14 == -1) {
                                                                                    throw new ParseException("Found a closing '}' without an opening '{'!");
                                                                                }
                                                                            }
                                                                        } else if (this.ignoreWhiteSpace) {
                                                                            this.formula.add(getScripts(charAt2));
                                                                        } else {
                                                                            this.formula.add(new UnderscoreAtom());
                                                                            this.pos++;
                                                                        }
                                                                    } else {
                                                                        this.formula.add(getScripts(charAt2));
                                                                    }
                                                                } else {
                                                                    if (this.ignoreWhiteSpace) {
                                                                        this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                                                    } else {
                                                                        this.formula.add(convertCharacter('\'', true));
                                                                    }
                                                                    this.pos++;
                                                                }
                                                            } else if (this.arrayMode) {
                                                                ((ArrayOfAtoms) this.formula).addCol();
                                                                this.pos++;
                                                            } else {
                                                                throw new ParseException("Character '&' is only available in array mode !");
                                                            }
                                                        } else {
                                                            if (this.ignoreWhiteSpace) {
                                                                this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("backprime")));
                                                            } else {
                                                                this.formula.add(convertCharacter((char) 8245, true));
                                                            }
                                                            this.pos++;
                                                        }
                                                    } else {
                                                        Atom argument = getArgument();
                                                        if (argument != null) {
                                                            argument.type = 0;
                                                        }
                                                        this.formula.add(argument);
                                                    }
                                                } else {
                                                    Atom processEscape = processEscape();
                                                    this.formula.add(processEscape);
                                                    if (this.arrayMode && (processEscape instanceof HlineAtom)) {
                                                        ((ArrayOfAtoms) this.formula).addRow();
                                                    }
                                                    if (this.insertion) {
                                                        this.insertion = false;
                                                    }
                                                }
                                            } else {
                                                int i15 = this.pos + 1;
                                                this.pos = i15;
                                                if (!this.ignoreWhiteSpace) {
                                                    if (this.parseString.charAt(i15) == '$') {
                                                        this.pos++;
                                                        i10 = 0;
                                                        z10 = true;
                                                    } else {
                                                        i10 = 2;
                                                        z10 = false;
                                                    }
                                                    this.formula.add(new MathAtom(new TeXFormula(this, getDollarGroup('$'), false).root, i10));
                                                    if (z10 && this.parseString.charAt(this.pos) == '$') {
                                                        this.pos++;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (this.ignoreWhiteSpace) {
                                                this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                                this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                            } else {
                                                this.formula.add(convertCharacter('\'', true));
                                                this.formula.add(convertCharacter('\'', true));
                                            }
                                            this.pos++;
                                        }
                                    } else {
                                        this.pos++;
                                        if (!this.ignoreWhiteSpace) {
                                            this.formula.add(new SpaceAtom());
                                            this.formula.add(new BreakMarkAtom());
                                            while (true) {
                                                int i16 = this.pos;
                                                if (i16 < this.len && (charAt = this.parseString.charAt(i16)) == ' ' && charAt == '\t' && charAt == '\r') {
                                                    this.pos++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.line++;
                                this.col = this.pos;
                            }
                        }
                        this.pos++;
                    }
                }
                TeXFormula teXFormula = this.formula;
                if (teXFormula.root == null && !this.arrayMode) {
                    teXFormula.add(new EmptyAtom());
                }
                parseDepth--;
                return;
            } catch (Throwable th2) {
                parseDepth--;
                throw th2;
            }
        }
        parseDepth = i11;
        throw new DepthLimitExceededException();
    }

    public void reset(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        this.parseString = stringBuffer;
        this.len = stringBuffer.length();
        this.formula.root = null;
        this.pos = 0;
        this.spos = 0;
        this.line = 0;
        this.col = 0;
        this.group = 0;
        this.insertion = false;
        this.atIsLetter = 0;
        this.arrayMode = false;
        this.ignoreWhiteSpace = true;
        firstpass();
    }

    public int rewind(int i10) {
        int i11 = this.pos - i10;
        this.pos = i11;
        return i11;
    }

    public void setArrayMode(boolean z10) {
        this.arrayMode = z10;
    }

    public TeXParser(boolean z10, String str, TeXFormula teXFormula) {
        this(str, teXFormula, false);
        this.isPartial = z10;
        firstpass();
    }

    public TeXParser(boolean z10, String str, TeXFormula teXFormula, boolean z11) {
        this.ignoreWhiteSpace = true;
        this.formula = teXFormula;
        this.isPartial = z10;
        if (str != null) {
            this.parseString = new StringBuffer(str);
            this.len = str.length();
            this.pos = 0;
            if (z11) {
                firstpass();
                return;
            }
            return;
        }
        this.parseString = null;
        this.pos = 0;
        this.len = 0;
    }

    public java.lang.String getGroup(java.lang.String r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.TeXParser.getGroup(java.lang.String, java.lang.String):java.lang.String");
    }

    public TeXParser(String str, TeXFormula teXFormula, boolean z10) {
        this(false, str, teXFormula, z10);
    }

    public TeXParser(boolean z10, String str, ArrayOfAtoms arrayOfAtoms, boolean z11) {
        this(z10, str, (TeXFormula) arrayOfAtoms, z11);
        this.arrayMode = true;
    }

    public TeXParser(boolean z10, String str, ArrayOfAtoms arrayOfAtoms, boolean z11, boolean z12) {
        this(z10, str, (TeXFormula) arrayOfAtoms, z11, z12);
        this.arrayMode = true;
    }

    public TeXParser(String str, ArrayOfAtoms arrayOfAtoms, boolean z10) {
        this(false, str, (TeXFormula) arrayOfAtoms, z10);
    }

    public TeXParser(boolean z10, String str, TeXFormula teXFormula, boolean z11, boolean z12) {
        this(z10, str, teXFormula, z11);
        this.ignoreWhiteSpace = z12;
    }

    public TeXParser(String str, TeXFormula teXFormula, boolean z10, boolean z11) {
        this(false, str, teXFormula, z10);
        this.ignoreWhiteSpace = z11;
    }
}
