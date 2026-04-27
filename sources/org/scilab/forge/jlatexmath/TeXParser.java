package org.scilab.forge.jlatexmath;

import java.util.HashSet;
import java.util.Set;
import ru.noties.jlatexmath.awt.Color;

public class TeXParser {
    protected static boolean isLoading = false;
    private static final Set unparsedContents;
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

    private static char convertToRomanNumber(char c) {
        int i;
        if (c == 1643) {
            return '.';
        }
        if (1632 <= c && c <= 1641) {
            i = c - 1584;
        } else if (1776 <= c && c <= 1785) {
            i = c - 1728;
        } else if (2406 <= c && c <= 2415) {
            i = c - 2358;
        } else if (2534 <= c && c <= 2543) {
            i = c - 2486;
        } else if (2662 <= c && c <= 2671) {
            i = c - 2614;
        } else if (2790 <= c && c <= 2799) {
            i = c - 2742;
        } else if (2918 <= c && c <= 2927) {
            i = c - 2870;
        } else if (3174 <= c && c <= 3183) {
            i = c - 3126;
        } else if (3430 <= c && c <= 3439) {
            i = c - 3382;
        } else if (3664 <= c && c <= 3673) {
            i = c - 3616;
        } else if (3792 <= c && c <= 3801) {
            i = c - 3744;
        } else if (3872 <= c && c <= 3881) {
            i = c - 3728;
        } else if (4160 <= c && c <= 4169) {
            i = c - 4112;
        } else if (6112 <= c && c <= 6121) {
            i = c - 6064;
        } else if (6160 <= c && c <= 6169) {
            i = c - 6112;
        } else if (6992 <= c && c <= 7001) {
            i = c - 6944;
        } else if (7088 <= c && c <= 7097) {
            i = c - 7040;
        } else if (7232 <= c && c <= 7241) {
            i = c - 7184;
        } else if (7248 <= c && c <= 7257) {
            i = c - 7200;
        } else {
            if (43216 > c || c > 43225) {
                return c;
            }
            i = c - 43168;
        }
        return (char) i;
    }

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

    public TeXParser(boolean z, String str, TeXFormula teXFormula) {
        this(str, teXFormula, false);
        this.isPartial = z;
        firstpass();
    }

    public TeXParser(boolean z, String str, TeXFormula teXFormula, boolean z2) {
        this.ignoreWhiteSpace = true;
        this.formula = teXFormula;
        this.isPartial = z;
        if (str != null) {
            this.parseString = new StringBuffer(str);
            this.len = str.length();
            this.pos = 0;
            if (z2) {
                firstpass();
                return;
            }
            return;
        }
        this.parseString = null;
        this.pos = 0;
        this.len = 0;
    }

    public TeXParser(String str, TeXFormula teXFormula, boolean z) {
        this(false, str, teXFormula, z);
    }

    public TeXParser(boolean z, String str, ArrayOfAtoms arrayOfAtoms, boolean z2) {
        this(z, str, (TeXFormula) arrayOfAtoms, z2);
        this.arrayMode = true;
    }

    public TeXParser(boolean z, String str, ArrayOfAtoms arrayOfAtoms, boolean z2, boolean z3) {
        this(z, str, (TeXFormula) arrayOfAtoms, z2, z3);
        this.arrayMode = true;
    }

    public TeXParser(boolean z, String str, TeXFormula teXFormula, boolean z2, boolean z3) {
        this(z, str, teXFormula, z2);
        this.ignoreWhiteSpace = z3;
    }

    public boolean getIsPartial() {
        return this.isPartial;
    }

    public int getLine() {
        return this.line;
    }

    public int getCol() {
        return (this.pos - this.col) - 1;
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

    public Atom getFormulaAtom() {
        TeXFormula teXFormula = this.formula;
        Atom atom = teXFormula.root;
        teXFormula.root = null;
        return atom;
    }

    public void addAtom(Atom atom) {
        this.formula.add(atom);
    }

    public void makeAtLetter() {
        this.atIsLetter++;
    }

    public void makeAtOther() {
        this.atIsLetter--;
    }

    public boolean isArrayMode() {
        return this.arrayMode;
    }

    public boolean isIgnoreWhiteSpace() {
        return this.ignoreWhiteSpace;
    }

    public boolean isMathMode() {
        return this.ignoreWhiteSpace;
    }

    public int getPos() {
        return this.pos;
    }

    public String getStringFromCurrentPos() {
        return this.parseString.substring(this.pos);
    }

    public void finish() {
        this.pos = this.parseString.length();
    }

    public void addRow() {
        if (!this.arrayMode) {
            throw new ParseException("You can add a row only in array mode !");
        }
        ((ArrayOfAtoms) this.formula).addRow();
    }

    private void firstpass() {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.TeXParser.firstpass():void");
    }

    public void parse() {
        int i;
        boolean z;
        char cCharAt;
        if (this.len != 0) {
            while (true) {
                int i2 = this.pos;
                if (i2 >= this.len) {
                    break;
                }
                char cCharAt2 = this.parseString.charAt(i2);
                if (cCharAt2 != '\t') {
                    if (cCharAt2 == '\n') {
                        this.line++;
                        this.col = this.pos;
                    } else if (cCharAt2 != '\r') {
                        if (cCharAt2 == ' ') {
                            this.pos++;
                            if (!this.ignoreWhiteSpace) {
                                this.formula.add(new SpaceAtom());
                                this.formula.add(new BreakMarkAtom());
                                while (true) {
                                    int i3 = this.pos;
                                    if (i3 >= this.len || (cCharAt = this.parseString.charAt(i3)) != ' ' || cCharAt != '\t' || cCharAt != '\r') {
                                        break;
                                    } else {
                                        this.pos++;
                                    }
                                }
                            }
                        } else if (cCharAt2 == '\"') {
                            if (this.ignoreWhiteSpace) {
                                this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                            } else {
                                this.formula.add(convertCharacter('\'', true));
                                this.formula.add(convertCharacter('\'', true));
                            }
                            this.pos++;
                        } else if (cCharAt2 == '$') {
                            int i4 = this.pos + 1;
                            this.pos = i4;
                            if (!this.ignoreWhiteSpace) {
                                if (this.parseString.charAt(i4) == '$') {
                                    this.pos++;
                                    i = 0;
                                    z = true;
                                } else {
                                    i = 2;
                                    z = false;
                                }
                                this.formula.add(new MathAtom(new TeXFormula(this, getDollarGroup('$'), false).root, i));
                                if (z && this.parseString.charAt(this.pos) == '$') {
                                    this.pos++;
                                }
                            }
                        } else if (cCharAt2 == '\\') {
                            Atom atomProcessEscape = processEscape();
                            this.formula.add(atomProcessEscape);
                            if (this.arrayMode && (atomProcessEscape instanceof HlineAtom)) {
                                ((ArrayOfAtoms) this.formula).addRow();
                            }
                            if (this.insertion) {
                                this.insertion = false;
                            }
                        } else if (cCharAt2 == '{') {
                            Atom argument = getArgument();
                            if (argument != null) {
                                argument.type = 0;
                            }
                            this.formula.add(argument);
                        } else if (cCharAt2 == 8245) {
                            if (this.ignoreWhiteSpace) {
                                this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("backprime")));
                            } else {
                                this.formula.add(convertCharacter((char) 8245, true));
                            }
                            this.pos++;
                        } else if (cCharAt2 != '&') {
                            if (cCharAt2 == '\'') {
                                if (this.ignoreWhiteSpace) {
                                    this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                } else {
                                    this.formula.add(convertCharacter('\'', true));
                                }
                                this.pos++;
                            } else if (cCharAt2 == '^') {
                                this.formula.add(getScripts(cCharAt2));
                            } else if (cCharAt2 != '_') {
                                if (cCharAt2 == '}') {
                                    int i5 = this.group - 1;
                                    this.group = i5;
                                    this.pos++;
                                    if (i5 == -1) {
                                        throw new ParseException("Found a closing '}' without an opening '{'!");
                                    }
                                    return;
                                }
                                if (cCharAt2 == '~') {
                                    this.formula.add(new SpaceAtom());
                                    this.pos++;
                                } else {
                                    this.formula.add(convertCharacter(cCharAt2, false));
                                    this.pos++;
                                }
                            } else if (this.ignoreWhiteSpace) {
                                this.formula.add(getScripts(cCharAt2));
                            } else {
                                this.formula.add(new UnderscoreAtom());
                                this.pos++;
                            }
                        } else {
                            if (!this.arrayMode) {
                                throw new ParseException("Character '&' is only available in array mode !");
                            }
                            ((ArrayOfAtoms) this.formula).addCol();
                            this.pos++;
                        }
                    }
                }
                this.pos++;
            }
        }
        TeXFormula teXFormula = this.formula;
        if (teXFormula.root != null || this.arrayMode) {
            return;
        }
        teXFormula.add(new EmptyAtom());
    }

    private org.scilab.forge.jlatexmath.Atom getScripts(char r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.TeXParser.getScripts(char):org.scilab.forge.jlatexmath.Atom");
    }

    public String getDollarGroup(char c) {
        char cCharAt;
        int i;
        int i2 = this.pos;
        do {
            StringBuffer stringBuffer = this.parseString;
            int i3 = this.pos;
            this.pos = i3 + 1;
            cCharAt = stringBuffer.charAt(i3);
            if (cCharAt == '\\') {
                this.pos++;
            }
            i = this.pos;
            if (i >= this.len) {
                break;
            }
        } while (cCharAt != c);
        if (cCharAt == c) {
            return this.parseString.substring(i2, i - 1);
        }
        return this.parseString.substring(i2, i);
    }

    public String getGroup(char c, char c2) {
        int i;
        int i2;
        int i3 = this.pos;
        if (i3 == this.len) {
            return null;
        }
        char cCharAt = this.parseString.charAt(i3);
        int i4 = this.pos;
        if (i4 < this.len && cCharAt == c) {
            int i5 = 1;
            while (true) {
                i = this.pos;
                if (i >= this.len - 1 || i5 == 0) {
                    break;
                }
                int i6 = i + 1;
                this.pos = i6;
                char cCharAt2 = this.parseString.charAt(i6);
                if (cCharAt2 == c) {
                    i5++;
                } else if (cCharAt2 == c2) {
                    i5--;
                } else if (cCharAt2 == '\\' && (i2 = this.pos) != this.len - 1) {
                    this.pos = i2 + 1;
                }
            }
            int i7 = i + 1;
            this.pos = i7;
            if (i5 != 0) {
                return this.parseString.substring(i4 + 1, i7);
            }
            return this.parseString.substring(i4 + 1, i);
        }
        throw new ParseException("missing '" + c + "'!");
    }

    public String getGroup(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        boolean zIsValidCharacterInCommand = isValidCharacterInCommand(str.charAt(length - 1));
        boolean zIsValidCharacterInCommand2 = isValidCharacterInCommand(str2.charAt(length2 - 1));
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        int i2 = 0;
        char c = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.pos;
            if (i5 >= this.len || i == 0) {
                break;
            }
            char cCharAt = this.parseString.charAt(i5);
            if (c == '\\' || cCharAt != ' ') {
                c = cCharAt;
            } else {
                while (true) {
                    int i6 = this.pos;
                    if (i6 >= this.len) {
                        break;
                    }
                    StringBuffer stringBuffer2 = this.parseString;
                    this.pos = i6 + 1;
                    if (stringBuffer2.charAt(i6) != ' ') {
                        break;
                    }
                    stringBuffer.append(' ');
                }
                StringBuffer stringBuffer3 = this.parseString;
                int i7 = this.pos - 1;
                this.pos = i7;
                char cCharAt2 = stringBuffer3.charAt(i7);
                if (isValidCharacterInCommand(c) && isValidCharacterInCommand(cCharAt2)) {
                    c = cCharAt2;
                    i3 = 0;
                    i4 = 0;
                } else {
                    c = cCharAt2;
                }
            }
            i3 = c == str.charAt(i3) ? i3 + 1 : 0;
            if (c == str2.charAt(i4)) {
                if (i4 == 0) {
                    i2 = this.pos;
                }
                i4++;
            } else {
                i4 = 0;
            }
            int i8 = this.pos;
            if (i8 + 1 < this.len) {
                char cCharAt3 = this.parseString.charAt(i8 + 1);
                if (i3 == length) {
                    if (!zIsValidCharacterInCommand || !isValidCharacterInCommand(cCharAt3)) {
                        i++;
                    }
                    i3 = 0;
                }
                if (i4 == length2) {
                    if (!zIsValidCharacterInCommand2 || !isValidCharacterInCommand(cCharAt3)) {
                        i--;
                    }
                } else {
                    stringBuffer.append(c);
                    this.pos++;
                }
            } else {
                if (i3 == length) {
                    i++;
                    i3 = 0;
                }
                if (i4 != length2) {
                    stringBuffer.append(c);
                    this.pos++;
                }
                i--;
            }
            i4 = 0;
            stringBuffer.append(c);
            this.pos++;
        }
        if (i != 0) {
            if (this.isPartial) {
                return stringBuffer.toString();
            }
            throw new ParseException("The token " + str + " must be closed by " + str2);
        }
        return stringBuffer.substring(0, (stringBuffer.length() - this.pos) + i2);
    }

    public Atom getArgument() {
        skipWhiteSpace();
        int i = this.pos;
        if (i < this.len) {
            char cCharAt = this.parseString.charAt(i);
            if (cCharAt != '{') {
                if (cCharAt == '\\') {
                    Atom atomProcessEscape = processEscape();
                    if (!this.insertion) {
                        return atomProcessEscape;
                    }
                    this.insertion = false;
                    return getArgument();
                }
                Atom atomConvertCharacter = convertCharacter(cCharAt, true);
                this.pos++;
                return atomConvertCharacter;
            }
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
        }
        return new EmptyAtom();
    }

    public java.lang.String getOverArgument() {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.TeXParser.getOverArgument():java.lang.String");
    }

    public float[] getLength() {
        if (this.pos == this.len) {
            return null;
        }
        skipWhiteSpace();
        int i = this.pos;
        char cCharAt = 0;
        while (true) {
            int i2 = this.pos;
            if (i2 >= this.len || cCharAt == ' ') {
                break;
            }
            StringBuffer stringBuffer = this.parseString;
            this.pos = i2 + 1;
            cCharAt = stringBuffer.charAt(i2);
        }
        skipWhiteSpace();
        return SpaceAtom.getLength(this.parseString.substring(i, this.pos - 1));
    }

    public org.scilab.forge.jlatexmath.Atom convertCharacter(char r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.TeXParser.convertCharacter(char, boolean):org.scilab.forge.jlatexmath.Atom");
    }

    private String getCommand() {
        int i;
        int i2 = this.pos + 1;
        this.pos = i2;
        char cCharAt = 0;
        while (true) {
            int i3 = this.pos;
            if (i3 >= this.len || (((cCharAt = this.parseString.charAt(i3)) < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && (this.atIsLetter == 0 || cCharAt != '@')))) {
                break;
            }
            this.pos++;
        }
        if (cCharAt == 0) {
            return "";
        }
        int i4 = this.pos;
        if (i4 == i2) {
            this.pos = i4 + 1;
        }
        String strSubstring = this.parseString.substring(i2, this.pos);
        if ("cr".equals(strSubstring) && (i = this.pos) < this.len && this.parseString.charAt(i) == ' ') {
            this.pos++;
        }
        return strSubstring;
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
                if (!this.isPartial) {
                    throw new ParseException("Unknown symbol or command or predefined TeXFormula: '" + command + "'");
                }
                return new ColorAtom(new RomanAtom(new TeXFormula("\\backslash " + command).root), null, Color.RED);
            }
        } catch (FormulaNotFoundException unused2) {
            return SymbolAtom.get(command);
        }
    }

    private void insert(int i, int i2, String str) {
        this.parseString.replace(i, i2, str);
        this.len = this.parseString.length();
        this.pos = i;
        this.insertion = true;
    }

    public String[] getOptsArgs(int i, int i2) {
        String[] strArr = new String[i + 11];
        if (i != 0) {
            if (i2 == 1) {
                for (int i3 = i + 1; i3 < i + 11; i3++) {
                    try {
                        skipWhiteSpace();
                        strArr[i3] = getGroup('[', ']');
                    } catch (ParseException unused) {
                        strArr[i3] = null;
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
            if (i2 == 2) {
                for (int i4 = i + 1; i4 < i + 11; i4++) {
                    try {
                        skipWhiteSpace();
                        strArr[i4] = getGroup('[', ']');
                    } catch (ParseException unused3) {
                        strArr[i4] = null;
                    }
                }
            }
            for (int i5 = 2; i5 <= i; i5++) {
                skipWhiteSpace();
                try {
                    strArr[i5] = getGroup('{', '}');
                } catch (ParseException unused4) {
                    if (this.parseString.charAt(this.pos) != '\\') {
                        strArr[i5] = "" + this.parseString.charAt(this.pos);
                        this.pos = this.pos + 1;
                    } else {
                        strArr[i5] = getCommandWithArgs(getCommand());
                    }
                }
            }
            if (this.ignoreWhiteSpace) {
                skipWhiteSpace();
            }
        }
        return strArr;
    }

    private String getCommandWithArgs(String str) {
        if (str.equals("left")) {
            return getGroup("\\left", "\\right");
        }
        MacroInfo macroInfo = (MacroInfo) MacroInfo.Commands.get(str);
        if (macroInfo != null) {
            int i = 0;
            String[] optsArgs = getOptsArgs(macroInfo.nbArgs, macroInfo.hasOptions ? macroInfo.posOpts : 0);
            StringBuffer stringBuffer = new StringBuffer("\\");
            stringBuffer.append(str);
            for (int i2 = 0; i2 < macroInfo.posOpts; i2++) {
                String str2 = optsArgs[macroInfo.nbArgs + i2 + 1];
                if (str2 != null) {
                    stringBuffer.append("[");
                    stringBuffer.append(str2);
                    stringBuffer.append("]");
                }
            }
            while (i < macroInfo.nbArgs) {
                i++;
                String str3 = optsArgs[i];
                if (str3 != null) {
                    stringBuffer.append("{");
                    stringBuffer.append(str3);
                    stringBuffer.append("}");
                }
            }
            return stringBuffer.toString();
        }
        return "\\" + str;
    }

    private Atom processCommands(String str) {
        MacroInfo macroInfo = (MacroInfo) MacroInfo.Commands.get(str);
        String[] optsArgs = getOptsArgs(macroInfo.nbArgs, macroInfo.hasOptions ? macroInfo.posOpts : 0);
        optsArgs[0] = str;
        if (NewCommandMacro.isMacro(str)) {
            insert(this.spos, this.pos, (String) macroInfo.invoke(this, optsArgs));
            return null;
        }
        return (Atom) macroInfo.invoke(this, optsArgs);
    }

    public final boolean isValidName(String str) {
        char cCharAt = 0;
        if (str == null || "".equals(str) || str.charAt(0) != '\\') {
            return false;
        }
        int length = str.length();
        for (int i = 1; i < length; i++) {
            cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt) && (this.atIsLetter == 0 || cCharAt != '@')) {
                break;
            }
        }
        return Character.isLetter(cCharAt);
    }

    public final boolean isValidCharacterInCommand(char c) {
        return Character.isLetter(c) || (this.atIsLetter != 0 && c == '@');
    }

    private final void skipWhiteSpace() {
        while (true) {
            int i = this.pos;
            if (i >= this.len) {
                return;
            }
            char cCharAt = this.parseString.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                return;
            }
            if (cCharAt == '\n') {
                this.line++;
                this.col = this.pos;
            }
            this.pos++;
        }
    }
}
