package org.scilab.forge.jlatexmath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MatrixAtom extends Atom {
    public static final int ALIGN = 2;
    public static final int ALIGNAT = 3;
    public static final int ALIGNED = 6;
    public static final int ALIGNEDAT = 7;
    public static final int ARRAY = 0;
    public static final int FLALIGN = 4;
    public static final int MATRIX = 1;
    public static final int SMALLMATRIX = 5;
    private boolean isPartial;
    private ArrayOfAtoms matrix;
    private int[] position;
    private boolean spaceAround;
    private int type;
    private Map<Integer, VlineAtom> vlines;
    public static SpaceAtom hsep = new SpaceAtom(0, 1.0f, 0.0f, 0.0f);
    public static SpaceAtom semihsep = new SpaceAtom(0, 0.5f, 0.0f, 0.0f);
    public static SpaceAtom vsep_in = new SpaceAtom(1, 0.0f, 1.0f, 0.0f);
    public static SpaceAtom vsep_ext_top = new SpaceAtom(1, 0.0f, 0.4f, 0.0f);
    public static SpaceAtom vsep_ext_bot = new SpaceAtom(1, 0.0f, 0.4f, 0.0f);
    private static final Box nullBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    private static SpaceAtom align = new SpaceAtom(2);

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, String str, boolean z2) throws NumberFormatException {
        this.vlines = new HashMap();
        this.isPartial = z;
        this.matrix = arrayOfAtoms;
        this.type = 0;
        this.spaceAround = z2;
        parsePositions(new StringBuffer(str));
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, String str) {
        this(z, arrayOfAtoms, str, false);
    }

    public MatrixAtom(ArrayOfAtoms arrayOfAtoms, String str) {
        this(false, arrayOfAtoms, str);
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i) {
        this(z, arrayOfAtoms, i, false);
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i, boolean z2) {
        this.vlines = new HashMap();
        this.isPartial = z;
        this.matrix = arrayOfAtoms;
        this.type = i;
        this.spaceAround = z2;
        if (i != 1 && i != 5) {
            this.position = new int[arrayOfAtoms.col];
            int i2 = 0;
            while (true) {
                int i3 = this.matrix.col;
                if (i2 >= i3) {
                    return;
                }
                int[] iArr = this.position;
                iArr[i2] = 1;
                int i4 = i2 + 1;
                if (i4 < i3) {
                    iArr[i4] = 0;
                }
                i2 += 2;
            }
        } else {
            this.position = new int[arrayOfAtoms.col];
            for (int i5 = 0; i5 < this.matrix.col; i5++) {
                this.position[i5] = 2;
            }
        }
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i, int i2) {
        this(z, arrayOfAtoms, i, i2, true);
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i, int i2, boolean z2) {
        this.vlines = new HashMap();
        this.isPartial = z;
        this.matrix = arrayOfAtoms;
        this.type = i;
        this.spaceAround = z2;
        this.position = new int[arrayOfAtoms.col];
        for (int i3 = 0; i3 < this.matrix.col; i3++) {
            this.position[i3] = i2;
        }
    }

    public MatrixAtom(ArrayOfAtoms arrayOfAtoms, int i) {
        this(false, arrayOfAtoms, i);
    }

    private void parsePositions(StringBuffer stringBuffer) throws NumberFormatException {
        int pos;
        int length = stringBuffer.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i2++;
            if (i2 > 100000 || length > 10000) {
                throw new ParseException("Column specification is too complex");
            }
            char cCharAt = stringBuffer.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    int i3 = i + 1;
                    TeXParser teXParser = new TeXParser(this.isPartial, stringBuffer.substring(i3), new TeXFormula(), false);
                    String[] optsArgs = teXParser.getOptsArgs(2, 0);
                    pos = i3 + teXParser.getPos();
                    int i4 = Integer.parseInt(optsArgs[1]);
                    if (i4 < 0 || i4 > 4096) {
                        i4 = 4096;
                    }
                    StringBuilder sb = new StringBuilder(optsArgs[2].length() * i4);
                    for (int i5 = 0; i5 < i4; i5++) {
                        sb.append(optsArgs[2]);
                    }
                    stringBuffer.insert(pos, sb.toString());
                    length = stringBuffer.length();
                } else if (cCharAt == '@') {
                    int i6 = i + 1;
                    TeXParser teXParser2 = new TeXParser(this.isPartial, stringBuffer.substring(i6), new TeXFormula(), false);
                    Atom argument = teXParser2.getArgument();
                    this.matrix.col++;
                    int i7 = 0;
                    while (true) {
                        ArrayOfAtoms arrayOfAtoms = this.matrix;
                        if (i7 >= arrayOfAtoms.row) {
                            break;
                        }
                        arrayOfAtoms.array.get(i7).add(arrayList.size(), argument);
                        i7++;
                    }
                    arrayList.add(5);
                    pos = i6 + teXParser2.getPos();
                } else if (cCharAt == 'c') {
                    arrayList.add(2);
                } else if (cCharAt == 'l') {
                    arrayList.add(0);
                } else if (cCharAt == 'r') {
                    arrayList.add(1);
                } else if (cCharAt == '|') {
                    int i8 = 1;
                    while (true) {
                        int i9 = i + 1;
                        if (i9 >= length) {
                            i = i9;
                            break;
                        } else {
                            if (stringBuffer.charAt(i9) != '|') {
                                break;
                            }
                            i8++;
                            i = i9;
                        }
                    }
                    this.vlines.put(Integer.valueOf(arrayList.size()), new VlineAtom(i8));
                } else {
                    arrayList.add(2);
                }
                i = pos - 1;
            }
            i++;
        }
        for (int size = arrayList.size(); size < this.matrix.col; size++) {
            arrayList.add(2);
        }
        if (arrayList.size() != 0) {
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            this.position = new int[numArr.length];
            for (int i10 = 0; i10 < numArr.length; i10++) {
                this.position[i10] = numArr[i10].intValue();
            }
            return;
        }
        this.position = new int[]{2};
    }

    public Box[] getColumnSep(TeXEnvironment teXEnvironment, float f) {
        Box boxCreateBox;
        Box boxCreateBox2;
        int i = this.matrix.col;
        Box[] boxArr = new Box[i + 1];
        float textwidth = teXEnvironment.getTextwidth();
        int i2 = this.type;
        if (i2 == 6 || i2 == 7) {
            textwidth = Float.POSITIVE_INFINITY;
        }
        int i3 = 2;
        int i4 = 1;
        switch (i2) {
            case 0:
                if (this.position[0] == 5) {
                    boxArr[1] = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    i3 = 1;
                }
                if (this.spaceAround) {
                    boxArr[0] = semihsep.createBox(teXEnvironment);
                } else {
                    boxArr[0] = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                }
                boxArr[i] = boxArr[0];
                Box boxCreateBox3 = hsep.createBox(teXEnvironment);
                while (i3 < i) {
                    if (this.position[i3] == 5) {
                        StrutBox strutBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                        boxArr[i3] = strutBox;
                        i3++;
                        boxArr[i3] = strutBox;
                    } else {
                        boxArr[i3] = boxCreateBox3;
                    }
                    i3++;
                }
                return boxArr;
            case 1:
            case 5:
                Box box = nullBox;
                boxArr[0] = box;
                boxArr[i] = box;
                Box boxCreateBox4 = hsep.createBox(teXEnvironment);
                while (i4 < i) {
                    boxArr[i4] = boxCreateBox4;
                    i4++;
                }
                return boxArr;
            case 2:
            case 6:
                Box boxCreateBox5 = align.createBox(teXEnvironment);
                if (textwidth != Float.POSITIVE_INFINITY) {
                    boxCreateBox = new StrutBox(Math.max(((textwidth - f) - ((i / 2) * boxCreateBox5.getWidth())) / ((float) Math.floor((i + 3) / 2)), 0.0f), 0.0f, 0.0f, 0.0f);
                } else {
                    boxCreateBox = hsep.createBox(teXEnvironment);
                }
                boxArr[i] = boxCreateBox;
                for (int i5 = 0; i5 < i; i5++) {
                    if (i5 % 2 == 0) {
                        boxArr[i5] = boxCreateBox;
                    } else {
                        boxArr[i5] = boxCreateBox5;
                    }
                }
                break;
            case 3:
            case 7:
                float fMax = textwidth != Float.POSITIVE_INFINITY ? Math.max((textwidth - f) / 2.0f, 0.0f) : 0.0f;
                Box boxCreateBox6 = align.createBox(teXEnvironment);
                Box box2 = nullBox;
                StrutBox strutBox2 = new StrutBox(fMax, 0.0f, 0.0f, 0.0f);
                boxArr[0] = strutBox2;
                boxArr[i] = strutBox2;
                while (i4 < i) {
                    if (i4 % 2 == 0) {
                        boxArr[i4] = box2;
                    } else {
                        boxArr[i4] = boxCreateBox6;
                    }
                    i4++;
                }
                break;
            case 4:
                Box boxCreateBox7 = align.createBox(teXEnvironment);
                if (textwidth != Float.POSITIVE_INFINITY) {
                    boxCreateBox2 = new StrutBox(Math.max(((textwidth - f) - ((i / 2) * boxCreateBox7.getWidth())) / ((float) Math.floor((i - 1) / 2)), 0.0f), 0.0f, 0.0f, 0.0f);
                } else {
                    boxCreateBox2 = hsep.createBox(teXEnvironment);
                }
                Box box3 = nullBox;
                boxArr[0] = box3;
                boxArr[i] = box3;
                while (i4 < i) {
                    if (i4 % 2 == 0) {
                        boxArr[i4] = boxCreateBox2;
                    } else {
                        boxArr[i4] = boxCreateBox7;
                    }
                    i4++;
                }
                break;
        }
        if (textwidth == Float.POSITIVE_INFINITY) {
            Box box4 = nullBox;
            boxArr[0] = box4;
            boxArr[i] = box4;
        }
        return boxArr;
    }

    @Override
    public org.scilab.forge.jlatexmath.Box createBox(org.scilab.forge.jlatexmath.TeXEnvironment r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.MatrixAtom.createBox(org.scilab.forge.jlatexmath.TeXEnvironment):org.scilab.forge.jlatexmath.Box");
    }

    private Box generateMulticolumn(TeXEnvironment teXEnvironment, Box[] boxArr, float[] fArr, int i, int i2) {
        MulticolumnAtom multicolumnAtom = (MulticolumnAtom) this.matrix.array.get(i).get(i2);
        int skipped = multicolumnAtom.getSkipped();
        int i3 = i2;
        float width = 0.0f;
        while (i3 < (i2 + skipped) - 1) {
            float f = fArr[i3];
            i3++;
            width += f + boxArr[i3].getWidth();
            if (this.vlines.get(Integer.valueOf(i3)) != null) {
                width += this.vlines.get(Integer.valueOf(i3)).getWidth(teXEnvironment);
            }
        }
        float f2 = width + fArr[i3];
        multicolumnAtom.setWidth(multicolumnAtom.createBox(teXEnvironment).getWidth() <= f2 ? f2 : 0.0f);
        return multicolumnAtom.createBox(teXEnvironment);
    }
}
