package org.scilab.forge.jlatexmath;

import java.lang.reflect.Array;
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
                if (i2 < i3) {
                    int[] iArr = this.position;
                    iArr[i2] = 1;
                    int i4 = i2 + 1;
                    if (i4 < i3) {
                        iArr[i4] = 0;
                    }
                    i2 += 2;
                } else {
                    return;
                }
            }
        } else {
            this.position = new int[arrayOfAtoms.col];
            for (int i5 = 0; i5 < this.matrix.col; i5++) {
                this.position[i5] = 2;
            }
        }
    }

    private Box generateMulticolumn(TeXEnvironment teXEnvironment, Box[] boxArr, float[] fArr, int i, int i2) {
        MulticolumnAtom multicolumnAtom = (MulticolumnAtom) this.matrix.array.get(i).get(i2);
        int skipped = multicolumnAtom.getSkipped();
        float f = 0.0f;
        int i3 = i2;
        float f2 = 0.0f;
        while (i3 < (i2 + skipped) - 1) {
            float f3 = fArr[i3];
            i3++;
            float width = boxArr[i3].getWidth() + f3 + f2;
            if (this.vlines.get(Integer.valueOf(i3)) != null) {
                f2 = this.vlines.get(Integer.valueOf(i3)).getWidth(teXEnvironment) + width;
            } else {
                f2 = width;
            }
        }
        float f4 = f2 + fArr[i3];
        if (multicolumnAtom.createBox(teXEnvironment).getWidth() <= f4) {
            f = f4;
        }
        multicolumnAtom.setWidth(f);
        return multicolumnAtom.createBox(teXEnvironment);
    }

    private void parsePositions(StringBuffer stringBuffer) {
        int pos;
        int length = stringBuffer.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i2++;
            if (i2 <= 100000 && length <= 10000) {
                char charAt = stringBuffer.charAt(i);
                if (charAt != '\t' && charAt != ' ') {
                    if (charAt != '*') {
                        if (charAt != '@') {
                            if (charAt != 'c') {
                                if (charAt != 'l') {
                                    if (charAt != 'r') {
                                        if (charAt != '|') {
                                            arrayList.add(2);
                                        } else {
                                            int i3 = 1;
                                            while (true) {
                                                int i4 = i + 1;
                                                if (i4 < length) {
                                                    if (stringBuffer.charAt(i4) != '|') {
                                                        break;
                                                    }
                                                    i3++;
                                                    i = i4;
                                                } else {
                                                    i = i4;
                                                    break;
                                                }
                                            }
                                            this.vlines.put(Integer.valueOf(arrayList.size()), new VlineAtom(i3));
                                        }
                                    } else {
                                        arrayList.add(1);
                                    }
                                } else {
                                    arrayList.add(0);
                                }
                            } else {
                                arrayList.add(2);
                            }
                        } else {
                            int i5 = i + 1;
                            TeXParser teXParser = new TeXParser(this.isPartial, stringBuffer.substring(i5), new TeXFormula(), false);
                            Atom argument = teXParser.getArgument();
                            this.matrix.col++;
                            int i6 = 0;
                            while (true) {
                                ArrayOfAtoms arrayOfAtoms = this.matrix;
                                if (i6 >= arrayOfAtoms.row) {
                                    break;
                                }
                                arrayOfAtoms.array.get(i6).add(arrayList.size(), argument);
                                i6++;
                            }
                            arrayList.add(5);
                            pos = teXParser.getPos() + i5;
                        }
                    } else {
                        int i7 = i + 1;
                        TeXParser teXParser2 = new TeXParser(this.isPartial, stringBuffer.substring(i7), new TeXFormula(), false);
                        String[] optsArgs = teXParser2.getOptsArgs(2, 0);
                        pos = teXParser2.getPos() + i7;
                        int parseInt = Integer.parseInt(optsArgs[1]);
                        parseInt = (parseInt < 0 || parseInt > 4096) ? 4096 : 4096;
                        StringBuilder sb = new StringBuilder(optsArgs[2].length() * parseInt);
                        for (int i8 = 0; i8 < parseInt; i8++) {
                            sb.append(optsArgs[2]);
                        }
                        stringBuffer.insert(pos, sb.toString());
                        length = stringBuffer.length();
                    }
                    i = pos - 1;
                }
                i++;
            } else {
                rm0.k("Column specification is too complex");
                return;
            }
        }
        for (int size = arrayList.size(); size < this.matrix.col; size++) {
            arrayList.add(2);
        }
        if (arrayList.size() != 0) {
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            this.position = new int[numArr.length];
            for (int i9 = 0; i9 < numArr.length; i9++) {
                this.position[i9] = numArr[i9].intValue();
            }
            return;
        }
        this.position = new int[]{2};
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironment2;
        float f;
        TeXEnvironment teXEnvironment3;
        HorizontalBox horizontalBox;
        float[] fArr;
        int i;
        Box[] boxArr;
        boolean hasRightVline;
        float[] fArr2;
        int i2;
        int i3;
        Atom atom;
        Box createBox;
        MatrixAtom matrixAtom = this;
        ArrayOfAtoms arrayOfAtoms = matrixAtom.matrix;
        int i4 = arrayOfAtoms.row;
        int i5 = arrayOfAtoms.col;
        int i6 = 0;
        Box[][] boxArr2 = (Box[][]) Array.newInstance(Box.class, i4, i5);
        float[] fArr3 = new float[i4];
        float[] fArr4 = new float[i4];
        float[] fArr5 = new float[i5];
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        if (matrixAtom.type == 5) {
            teXEnvironment2 = teXEnvironment.copy();
            teXEnvironment2.setStyle(4);
        } else {
            teXEnvironment2 = teXEnvironment;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            f = 0.0f;
            if (i7 >= i4) {
                break;
            }
            fArr3[i7] = 0.0f;
            fArr4[i7] = 0.0f;
            int i8 = i6;
            while (i8 < i5) {
                try {
                    atom = matrixAtom.matrix.array.get(i7).get(i8);
                } catch (Exception unused) {
                    boxArr2[i7][i8 - 1].type = 11;
                    i8 = i5 - 1;
                    atom = null;
                }
                Box[] boxArr3 = boxArr2[i7];
                if (atom == null) {
                    createBox = nullBox;
                } else {
                    createBox = atom.createBox(teXEnvironment2);
                }
                boxArr3[i8] = createBox;
                fArr3[i7] = Math.max(boxArr2[i7][i8].getDepth(), fArr3[i7]);
                fArr4[i7] = Math.max(boxArr2[i7][i8].getHeight(), fArr4[i7]);
                Box box = boxArr2[i7][i8];
                float[] fArr6 = fArr5;
                if (box.type != 12) {
                    fArr6[i8] = Math.max(box.getWidth(), fArr6[i8]);
                } else {
                    MulticolumnAtom multicolumnAtom = (MulticolumnAtom) atom;
                    multicolumnAtom.setRowColumn(i7, i8);
                    arrayList.add(multicolumnAtom);
                }
                i8++;
                fArr5 = fArr6;
            }
            i7++;
            i6 = 0;
        }
        float[] fArr7 = fArr5;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            MulticolumnAtom multicolumnAtom2 = (MulticolumnAtom) arrayList.get(i9);
            int col = multicolumnAtom2.getCol();
            int row = multicolumnAtom2.getRow();
            int skipped = multicolumnAtom2.getSkipped();
            float f2 = f;
            int i10 = col;
            while (true) {
                i3 = col + skipped;
                if (i10 >= i3) {
                    break;
                }
                f2 += fArr7[i10];
                i10++;
            }
            if (boxArr2[row][col].getWidth() > f2) {
                float width = (boxArr2[row][col].getWidth() - f2) / skipped;
                while (col < i3) {
                    fArr7[col] = fArr7[col] + width;
                    col++;
                }
            }
            i9++;
            f = 0.0f;
        }
        float f3 = 0.0f;
        for (int i11 = 0; i11 < i5; i11++) {
            f3 += fArr7[i11];
        }
        Box[] columnSep = matrixAtom.getColumnSep(teXEnvironment2, f3);
        float f4 = f3;
        for (int i12 = 0; i12 < i5 + 1; i12++) {
            float width2 = columnSep[i12].getWidth() + f4;
            if (matrixAtom.vlines.get(Integer.valueOf(i12)) != null) {
                f4 = matrixAtom.vlines.get(Integer.valueOf(i12)).getWidth(teXEnvironment2) + width2;
            } else {
                f4 = width2;
            }
        }
        VerticalBox verticalBox = new VerticalBox();
        Box createBox2 = vsep_in.createBox(teXEnvironment2);
        verticalBox.add(vsep_ext_top.createBox(teXEnvironment2));
        int i13 = 0;
        while (i13 < i4) {
            HorizontalBox horizontalBox2 = new HorizontalBox();
            int i14 = 0;
            while (i14 < i5) {
                Box[] boxArr4 = columnSep;
                int i15 = boxArr2[i13][i14].type;
                int i16 = i4;
                if (i15 != -1) {
                    switch (i15) {
                        case 11:
                            int i17 = i13;
                            float textwidth = teXEnvironment2.getTextwidth();
                            if (textwidth == Float.POSITIVE_INFINITY) {
                                textwidth = fArr7[i14];
                            }
                            HorizontalBox horizontalBox3 = new HorizontalBox(boxArr2[i17][i14], textwidth, 0);
                            i14 = i5 - 1;
                            horizontalBox2 = horizontalBox3;
                            boxArr = boxArr4;
                            i13 = i17;
                            i = i5;
                            fArr2 = fArr7;
                            break;
                        case 12:
                            break;
                        case 13:
                            HlineAtom hlineAtom = (HlineAtom) matrixAtom.matrix.array.get(i13).get(i14);
                            hlineAtom.setWidth(f4);
                            if (i13 >= 1) {
                                i2 = i13;
                                if (matrixAtom.matrix.array.get(i2 - 1).get(i14) instanceof HlineAtom) {
                                    horizontalBox2.add(new StrutBox(0.0f, defaultRuleThickness * 2.0f, 0.0f, 0.0f));
                                    hlineAtom.setShift(((-createBox2.getHeight()) / 2.0f) + defaultRuleThickness);
                                    horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                                    i14 = i5;
                                    boxArr = boxArr4;
                                    i13 = i2;
                                    i = i14;
                                    fArr2 = fArr7;
                                    break;
                                }
                            } else {
                                i2 = i13;
                            }
                            hlineAtom.setShift((-createBox2.getHeight()) / 2.0f);
                            horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                            i14 = i5;
                            boxArr = boxArr4;
                            i13 = i2;
                            i = i14;
                            fArr2 = fArr7;
                        default:
                            fArr2 = fArr7;
                            boxArr = boxArr4;
                            i = i5;
                            break;
                    }
                    i14++;
                    matrixAtom = this;
                    columnSep = boxArr;
                    i4 = i16;
                    i5 = i;
                    fArr7 = fArr2;
                }
                int i18 = i13;
                if (i14 == 0) {
                    if (matrixAtom.vlines.get(0) != null) {
                        VlineAtom vlineAtom = matrixAtom.vlines.get(0);
                        vlineAtom.setHeight(createBox2.getHeight() + fArr4[i18] + fArr3[i18]);
                        vlineAtom.setShift((createBox2.getHeight() / 2.0f) + fArr3[i18]);
                        Box createBox3 = vlineAtom.createBox(teXEnvironment2);
                        teXEnvironment3 = teXEnvironment2;
                        horizontalBox2.add(new HorizontalBox(createBox3, createBox3.getWidth() + boxArr4[0].getWidth(), 0));
                    } else {
                        teXEnvironment3 = teXEnvironment2;
                        horizontalBox2.add(boxArr4[0]);
                    }
                } else {
                    teXEnvironment3 = teXEnvironment2;
                }
                if (boxArr2[i18][i14].type == -1) {
                    horizontalBox2.add(new HorizontalBox(boxArr2[i18][i14], fArr7[i14], matrixAtom.position[i14]));
                    horizontalBox = horizontalBox2;
                    fArr = fArr7;
                    boxArr = boxArr4;
                    i13 = i18;
                    teXEnvironment2 = teXEnvironment3;
                    hasRightVline = true;
                    i = i5;
                } else {
                    horizontalBox = horizontalBox2;
                    fArr = fArr7;
                    i13 = i18;
                    teXEnvironment2 = teXEnvironment3;
                    i = i5;
                    Box generateMulticolumn = matrixAtom.generateMulticolumn(teXEnvironment2, boxArr4, fArr, i13, i14);
                    boxArr = boxArr4;
                    MulticolumnAtom multicolumnAtom3 = (MulticolumnAtom) matrixAtom.matrix.array.get(i13).get(i14);
                    i14 = (multicolumnAtom3.getSkipped() - 1) + i14;
                    horizontalBox.add(generateMulticolumn);
                    hasRightVline = multicolumnAtom3.hasRightVline();
                }
                if (hasRightVline) {
                    int i19 = i14 + 1;
                    fArr2 = fArr;
                    if (matrixAtom.vlines.get(Integer.valueOf(i19)) != null) {
                        VlineAtom vlineAtom2 = matrixAtom.vlines.get(Integer.valueOf(i19));
                        vlineAtom2.setHeight(createBox2.getHeight() + fArr4[i13] + fArr3[i13]);
                        vlineAtom2.setShift((createBox2.getHeight() / 2.0f) + fArr3[i13]);
                        Box createBox4 = vlineAtom2.createBox(teXEnvironment2);
                        if (i14 < i - 1) {
                            horizontalBox.add(new HorizontalBox(createBox4, createBox4.getWidth() + boxArr[i19].getWidth(), 2));
                        } else {
                            horizontalBox.add(new HorizontalBox(createBox4, createBox4.getWidth() + boxArr[i19].getWidth(), 1));
                        }
                        horizontalBox2 = horizontalBox;
                        i14++;
                        matrixAtom = this;
                        columnSep = boxArr;
                        i4 = i16;
                        i5 = i;
                        fArr7 = fArr2;
                    }
                } else {
                    fArr2 = fArr;
                }
                horizontalBox.add(boxArr[i14 + 1]);
                horizontalBox2 = horizontalBox;
                i14++;
                matrixAtom = this;
                columnSep = boxArr;
                i4 = i16;
                i5 = i;
                fArr7 = fArr2;
            }
            Box[] boxArr5 = columnSep;
            int i20 = i4;
            int i21 = i5;
            float[] fArr8 = fArr7;
            HorizontalBox horizontalBox4 = horizontalBox2;
            if (boxArr2[i13][0].type != 13) {
                horizontalBox4.setHeight(fArr4[i13]);
                horizontalBox4.setDepth(fArr3[i13]);
                verticalBox.add(horizontalBox4);
                if (i13 < i20 - 1) {
                    verticalBox.add(createBox2);
                }
            } else {
                verticalBox.add(horizontalBox4);
            }
            i13++;
            matrixAtom = this;
            columnSep = boxArr5;
            i4 = i20;
            i5 = i21;
            fArr7 = fArr8;
        }
        verticalBox.add(vsep_ext_bot.createBox(teXEnvironment2));
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        float axisHeight = teXEnvironment2.getTeXFont().getAxisHeight(teXEnvironment2.getStyle());
        float f5 = depth / 2.0f;
        verticalBox.setHeight(f5 + axisHeight);
        verticalBox.setDepth(f5 - axisHeight);
        return verticalBox;
    }

    public org.scilab.forge.jlatexmath.Box[] getColumnSep(org.scilab.forge.jlatexmath.TeXEnvironment r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.MatrixAtom.getColumnSep(org.scilab.forge.jlatexmath.TeXEnvironment, float):org.scilab.forge.jlatexmath.Box[]");
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

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, String str, boolean z2) {
        this.vlines = new HashMap();
        this.isPartial = z;
        this.matrix = arrayOfAtoms;
        this.type = 0;
        this.spaceAround = z2;
        parsePositions(new StringBuffer(str));
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
}
