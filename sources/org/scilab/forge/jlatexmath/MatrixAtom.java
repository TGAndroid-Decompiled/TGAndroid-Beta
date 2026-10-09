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

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, String str, boolean z11) {
        this.vlines = new HashMap();
        this.isPartial = z10;
        this.matrix = arrayOfAtoms;
        this.type = 0;
        this.spaceAround = z11;
        parsePositions(new StringBuffer(str));
    }

    private Box generateMulticolumn(TeXEnvironment teXEnvironment, Box[] boxArr, float[] fArr, int i10, int i11) {
        MulticolumnAtom multicolumnAtom = (MulticolumnAtom) this.matrix.array.get(i10).get(i11);
        int skipped = multicolumnAtom.getSkipped();
        float f7 = 0.0f;
        int i12 = i11;
        float f10 = 0.0f;
        while (i12 < (i11 + skipped) - 1) {
            float f11 = fArr[i12];
            i12++;
            float width = boxArr[i12].getWidth() + f11 + f10;
            if (this.vlines.get(Integer.valueOf(i12)) != null) {
                f10 = this.vlines.get(Integer.valueOf(i12)).getWidth(teXEnvironment) + width;
            } else {
                f10 = width;
            }
        }
        float f12 = f10 + fArr[i12];
        if (multicolumnAtom.createBox(teXEnvironment).getWidth() <= f12) {
            f7 = f12;
        }
        multicolumnAtom.setWidth(f7);
        return multicolumnAtom.createBox(teXEnvironment);
    }

    private void parsePositions(StringBuffer stringBuffer) {
        int pos;
        int length = stringBuffer.length();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            i11++;
            if (i11 <= 100000 && length <= 10000) {
                char charAt = stringBuffer.charAt(i10);
                if (charAt != '\t' && charAt != ' ') {
                    if (charAt != '*') {
                        if (charAt != '@') {
                            if (charAt != 'c') {
                                if (charAt != 'l') {
                                    if (charAt != 'r') {
                                        if (charAt != '|') {
                                            arrayList.add(2);
                                        } else {
                                            int i12 = 1;
                                            while (true) {
                                                int i13 = i10 + 1;
                                                if (i13 < length) {
                                                    if (stringBuffer.charAt(i13) != '|') {
                                                        break;
                                                    }
                                                    i12++;
                                                    i10 = i13;
                                                } else {
                                                    i10 = i13;
                                                    break;
                                                }
                                            }
                                            this.vlines.put(Integer.valueOf(arrayList.size()), new VlineAtom(i12));
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
                            int i14 = i10 + 1;
                            TeXParser teXParser = new TeXParser(this.isPartial, stringBuffer.substring(i14), new TeXFormula(), false);
                            Atom argument = teXParser.getArgument();
                            this.matrix.col++;
                            int i15 = 0;
                            while (true) {
                                ArrayOfAtoms arrayOfAtoms = this.matrix;
                                if (i15 >= arrayOfAtoms.row) {
                                    break;
                                }
                                arrayOfAtoms.array.get(i15).add(arrayList.size(), argument);
                                i15++;
                            }
                            arrayList.add(5);
                            pos = teXParser.getPos() + i14;
                        }
                    } else {
                        int i16 = i10 + 1;
                        TeXParser teXParser2 = new TeXParser(this.isPartial, stringBuffer.substring(i16), new TeXFormula(), false);
                        String[] optsArgs = teXParser2.getOptsArgs(2, 0);
                        pos = teXParser2.getPos() + i16;
                        int parseInt = Integer.parseInt(optsArgs[1]);
                        parseInt = (parseInt < 0 || parseInt > 4096) ? 4096 : 4096;
                        StringBuilder sb2 = new StringBuilder(optsArgs[2].length() * parseInt);
                        for (int i17 = 0; i17 < parseInt; i17++) {
                            sb2.append(optsArgs[2]);
                        }
                        stringBuffer.insert(pos, sb2.toString());
                        length = stringBuffer.length();
                    }
                    i10 = pos - 1;
                }
                i10++;
            } else {
                throw new ParseException("Column specification is too complex");
            }
        }
        for (int size = arrayList.size(); size < this.matrix.col; size++) {
            arrayList.add(2);
        }
        if (arrayList.size() != 0) {
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            this.position = new int[numArr.length];
            for (int i18 = 0; i18 < numArr.length; i18++) {
                this.position[i18] = numArr[i18].intValue();
            }
            return;
        }
        this.position = new int[]{2};
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironment2;
        float f7;
        TeXEnvironment teXEnvironment3;
        HorizontalBox horizontalBox;
        float[] fArr;
        int i10;
        Box[] boxArr;
        boolean hasRightVline;
        float[] fArr2;
        int i11;
        boolean z10;
        int i12;
        Atom atom;
        Box createBox;
        MatrixAtom matrixAtom = this;
        ArrayOfAtoms arrayOfAtoms = matrixAtom.matrix;
        int i13 = arrayOfAtoms.row;
        int i14 = arrayOfAtoms.col;
        int i15 = 0;
        Box[][] boxArr2 = (Box[][]) Array.newInstance(Box.class, i13, i14);
        float[] fArr3 = new float[i13];
        float[] fArr4 = new float[i13];
        float[] fArr5 = new float[i14];
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        if (matrixAtom.type == 5) {
            teXEnvironment2 = teXEnvironment.copy();
            teXEnvironment2.setStyle(4);
        } else {
            teXEnvironment2 = teXEnvironment;
        }
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        while (true) {
            f7 = 0.0f;
            if (i16 >= i13) {
                break;
            }
            fArr3[i16] = 0.0f;
            fArr4[i16] = 0.0f;
            int i17 = i15;
            while (i17 < i14) {
                try {
                    atom = matrixAtom.matrix.array.get(i16).get(i17);
                } catch (Exception unused) {
                    boxArr2[i16][i17 - 1].type = 11;
                    i17 = i14 - 1;
                    atom = null;
                }
                Box[] boxArr3 = boxArr2[i16];
                if (atom == null) {
                    createBox = nullBox;
                } else {
                    createBox = atom.createBox(teXEnvironment2);
                }
                boxArr3[i17] = createBox;
                fArr3[i16] = Math.max(boxArr2[i16][i17].getDepth(), fArr3[i16]);
                fArr4[i16] = Math.max(boxArr2[i16][i17].getHeight(), fArr4[i16]);
                Box box = boxArr2[i16][i17];
                float[] fArr6 = fArr5;
                if (box.type != 12) {
                    fArr6[i17] = Math.max(box.getWidth(), fArr6[i17]);
                } else {
                    MulticolumnAtom multicolumnAtom = (MulticolumnAtom) atom;
                    multicolumnAtom.setRowColumn(i16, i17);
                    arrayList.add(multicolumnAtom);
                }
                i17++;
                fArr5 = fArr6;
            }
            i16++;
            i15 = 0;
        }
        float[] fArr7 = fArr5;
        int i18 = 0;
        while (i18 < arrayList.size()) {
            MulticolumnAtom multicolumnAtom2 = (MulticolumnAtom) arrayList.get(i18);
            int col = multicolumnAtom2.getCol();
            int row = multicolumnAtom2.getRow();
            int skipped = multicolumnAtom2.getSkipped();
            float f10 = f7;
            int i19 = col;
            while (true) {
                i12 = col + skipped;
                if (i19 >= i12) {
                    break;
                }
                f10 += fArr7[i19];
                i19++;
            }
            if (boxArr2[row][col].getWidth() > f10) {
                float width = (boxArr2[row][col].getWidth() - f10) / skipped;
                while (col < i12) {
                    fArr7[col] = fArr7[col] + width;
                    col++;
                }
            }
            i18++;
            f7 = 0.0f;
        }
        float f11 = 0.0f;
        for (int i20 = 0; i20 < i14; i20++) {
            f11 += fArr7[i20];
        }
        Box[] columnSep = matrixAtom.getColumnSep(teXEnvironment2, f11);
        float f12 = f11;
        for (int i21 = 0; i21 < i14 + 1; i21++) {
            float width2 = columnSep[i21].getWidth() + f12;
            if (matrixAtom.vlines.get(Integer.valueOf(i21)) != null) {
                f12 = matrixAtom.vlines.get(Integer.valueOf(i21)).getWidth(teXEnvironment2) + width2;
            } else {
                f12 = width2;
            }
        }
        VerticalBox verticalBox = new VerticalBox();
        Box createBox2 = vsep_in.createBox(teXEnvironment2);
        verticalBox.add(vsep_ext_top.createBox(teXEnvironment2));
        int i22 = 0;
        while (i22 < i13) {
            HorizontalBox horizontalBox2 = new HorizontalBox();
            int i23 = 0;
            while (i23 < i14) {
                Box[] boxArr4 = columnSep;
                int i24 = boxArr2[i22][i23].type;
                int i25 = i13;
                if (i24 != -1) {
                    switch (i24) {
                        case 11:
                            int i26 = i22;
                            float textwidth = teXEnvironment2.getTextwidth();
                            if (textwidth == Float.POSITIVE_INFINITY) {
                                textwidth = fArr7[i23];
                            }
                            HorizontalBox horizontalBox3 = new HorizontalBox(boxArr2[i26][i23], textwidth, 0);
                            i23 = i14 - 1;
                            horizontalBox2 = horizontalBox3;
                            boxArr = boxArr4;
                            i22 = i26;
                            i10 = i14;
                            fArr2 = fArr7;
                            break;
                        case 12:
                            break;
                        case 13:
                            HlineAtom hlineAtom = (HlineAtom) matrixAtom.matrix.array.get(i22).get(i23);
                            hlineAtom.setWidth(f12);
                            if (i22 >= 1) {
                                i11 = i22;
                                if (matrixAtom.matrix.array.get(i11 - 1).get(i23) instanceof HlineAtom) {
                                    z10 = false;
                                    horizontalBox2.add(new StrutBox(0.0f, defaultRuleThickness * 2.0f, 0.0f, 0.0f));
                                    hlineAtom.setShift(((-createBox2.getHeight()) / 2.0f) + defaultRuleThickness);
                                    horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                                    i23 = i14;
                                    boxArr = boxArr4;
                                    i22 = i11;
                                    i10 = i23;
                                    fArr2 = fArr7;
                                    break;
                                }
                            } else {
                                i11 = i22;
                            }
                            z10 = false;
                            hlineAtom.setShift((-createBox2.getHeight()) / 2.0f);
                            horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                            i23 = i14;
                            boxArr = boxArr4;
                            i22 = i11;
                            i10 = i23;
                            fArr2 = fArr7;
                        default:
                            fArr2 = fArr7;
                            boxArr = boxArr4;
                            i10 = i14;
                            break;
                    }
                    i23++;
                    matrixAtom = this;
                    columnSep = boxArr;
                    i13 = i25;
                    i14 = i10;
                    fArr7 = fArr2;
                }
                int i27 = i22;
                if (i23 == 0) {
                    if (matrixAtom.vlines.get(0) != null) {
                        VlineAtom vlineAtom = matrixAtom.vlines.get(0);
                        vlineAtom.setHeight(createBox2.getHeight() + fArr4[i27] + fArr3[i27]);
                        vlineAtom.setShift((createBox2.getHeight() / 2.0f) + fArr3[i27]);
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
                if (boxArr2[i27][i23].type == -1) {
                    horizontalBox2.add(new HorizontalBox(boxArr2[i27][i23], fArr7[i23], matrixAtom.position[i23]));
                    horizontalBox = horizontalBox2;
                    fArr = fArr7;
                    boxArr = boxArr4;
                    i22 = i27;
                    teXEnvironment2 = teXEnvironment3;
                    hasRightVline = true;
                    i10 = i14;
                } else {
                    horizontalBox = horizontalBox2;
                    fArr = fArr7;
                    i22 = i27;
                    teXEnvironment2 = teXEnvironment3;
                    i10 = i14;
                    Box generateMulticolumn = matrixAtom.generateMulticolumn(teXEnvironment2, boxArr4, fArr, i22, i23);
                    boxArr = boxArr4;
                    MulticolumnAtom multicolumnAtom3 = (MulticolumnAtom) matrixAtom.matrix.array.get(i22).get(i23);
                    i23 = (multicolumnAtom3.getSkipped() - 1) + i23;
                    horizontalBox.add(generateMulticolumn);
                    hasRightVline = multicolumnAtom3.hasRightVline();
                }
                if (hasRightVline) {
                    int i28 = i23 + 1;
                    fArr2 = fArr;
                    if (matrixAtom.vlines.get(Integer.valueOf(i28)) != null) {
                        VlineAtom vlineAtom2 = matrixAtom.vlines.get(Integer.valueOf(i28));
                        vlineAtom2.setHeight(createBox2.getHeight() + fArr4[i22] + fArr3[i22]);
                        vlineAtom2.setShift((createBox2.getHeight() / 2.0f) + fArr3[i22]);
                        Box createBox4 = vlineAtom2.createBox(teXEnvironment2);
                        if (i23 < i10 - 1) {
                            horizontalBox.add(new HorizontalBox(createBox4, createBox4.getWidth() + boxArr[i28].getWidth(), 2));
                        } else {
                            horizontalBox.add(new HorizontalBox(createBox4, createBox4.getWidth() + boxArr[i28].getWidth(), 1));
                        }
                        horizontalBox2 = horizontalBox;
                        i23++;
                        matrixAtom = this;
                        columnSep = boxArr;
                        i13 = i25;
                        i14 = i10;
                        fArr7 = fArr2;
                    }
                } else {
                    fArr2 = fArr;
                }
                horizontalBox.add(boxArr[i23 + 1]);
                horizontalBox2 = horizontalBox;
                i23++;
                matrixAtom = this;
                columnSep = boxArr;
                i13 = i25;
                i14 = i10;
                fArr7 = fArr2;
            }
            Box[] boxArr5 = columnSep;
            int i29 = i13;
            int i30 = i14;
            float[] fArr8 = fArr7;
            HorizontalBox horizontalBox4 = horizontalBox2;
            if (boxArr2[i22][0].type != 13) {
                horizontalBox4.setHeight(fArr4[i22]);
                horizontalBox4.setDepth(fArr3[i22]);
                verticalBox.add(horizontalBox4);
                if (i22 < i29 - 1) {
                    verticalBox.add(createBox2);
                }
            } else {
                verticalBox.add(horizontalBox4);
            }
            i22++;
            matrixAtom = this;
            columnSep = boxArr5;
            i13 = i29;
            i14 = i30;
            fArr7 = fArr8;
        }
        verticalBox.add(vsep_ext_bot.createBox(teXEnvironment2));
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        float axisHeight = teXEnvironment2.getTeXFont().getAxisHeight(teXEnvironment2.getStyle());
        float f13 = depth / 2.0f;
        verticalBox.setHeight(f13 + axisHeight);
        verticalBox.setDepth(f13 - axisHeight);
        return verticalBox;
    }

    public org.scilab.forge.jlatexmath.Box[] getColumnSep(org.scilab.forge.jlatexmath.TeXEnvironment r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.MatrixAtom.getColumnSep(org.scilab.forge.jlatexmath.TeXEnvironment, float):org.scilab.forge.jlatexmath.Box[]");
    }

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, String str) {
        this(z10, arrayOfAtoms, str, false);
    }

    public MatrixAtom(ArrayOfAtoms arrayOfAtoms, String str) {
        this(false, arrayOfAtoms, str);
    }

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i10) {
        this(z10, arrayOfAtoms, i10, false);
    }

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i10, boolean z11) {
        this.vlines = new HashMap();
        this.isPartial = z10;
        this.matrix = arrayOfAtoms;
        this.type = i10;
        this.spaceAround = z11;
        if (i10 != 1 && i10 != 5) {
            this.position = new int[arrayOfAtoms.col];
            int i11 = 0;
            while (true) {
                int i12 = this.matrix.col;
                if (i11 >= i12) {
                    return;
                }
                int[] iArr = this.position;
                iArr[i11] = 1;
                int i13 = i11 + 1;
                if (i13 < i12) {
                    iArr[i13] = 0;
                }
                i11 += 2;
            }
        } else {
            this.position = new int[arrayOfAtoms.col];
            for (int i14 = 0; i14 < this.matrix.col; i14++) {
                this.position[i14] = 2;
            }
        }
    }

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i10, int i11) {
        this(z10, arrayOfAtoms, i10, i11, true);
    }

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i10, int i11, boolean z11) {
        this.vlines = new HashMap();
        this.isPartial = z10;
        this.matrix = arrayOfAtoms;
        this.type = i10;
        this.spaceAround = z11;
        this.position = new int[arrayOfAtoms.col];
        for (int i12 = 0; i12 < this.matrix.col; i12++) {
            this.position[i12] = i11;
        }
    }

    public MatrixAtom(ArrayOfAtoms arrayOfAtoms, int i10) {
        this(false, arrayOfAtoms, i10);
    }
}
