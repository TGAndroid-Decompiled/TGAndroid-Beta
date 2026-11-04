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

    private Box generateMulticolumn(TeXEnvironment teXEnvironment, Box[] boxArr, float[] fArr, int i3, int i10) {
        MulticolumnAtom multicolumnAtom = (MulticolumnAtom) this.matrix.array.get(i3).get(i10);
        int skipped = multicolumnAtom.getSkipped();
        float f10 = 0.0f;
        int i11 = i10;
        float f11 = 0.0f;
        while (i11 < (i10 + skipped) - 1) {
            float f12 = fArr[i11];
            i11++;
            float width = boxArr[i11].getWidth() + f12 + f11;
            if (this.vlines.get(Integer.valueOf(i11)) != null) {
                f11 = this.vlines.get(Integer.valueOf(i11)).getWidth(teXEnvironment) + width;
            } else {
                f11 = width;
            }
        }
        float f13 = f11 + fArr[i11];
        if (multicolumnAtom.createBox(teXEnvironment).getWidth() <= f13) {
            f10 = f13;
        }
        multicolumnAtom.setWidth(f10);
        return multicolumnAtom.createBox(teXEnvironment);
    }

    private void parsePositions(StringBuffer stringBuffer) {
        int pos;
        int length = stringBuffer.length();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i10 = 0;
        while (i3 < length) {
            i10++;
            if (i10 <= 100000 && length <= 10000) {
                char charAt = stringBuffer.charAt(i3);
                if (charAt != '\t' && charAt != ' ') {
                    if (charAt != '*') {
                        if (charAt != '@') {
                            if (charAt != 'c') {
                                if (charAt != 'l') {
                                    if (charAt != 'r') {
                                        if (charAt != '|') {
                                            arrayList.add(2);
                                        } else {
                                            int i11 = 1;
                                            while (true) {
                                                int i12 = i3 + 1;
                                                if (i12 < length) {
                                                    if (stringBuffer.charAt(i12) != '|') {
                                                        break;
                                                    }
                                                    i11++;
                                                    i3 = i12;
                                                } else {
                                                    i3 = i12;
                                                    break;
                                                }
                                            }
                                            this.vlines.put(Integer.valueOf(arrayList.size()), new VlineAtom(i11));
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
                            int i13 = i3 + 1;
                            TeXParser teXParser = new TeXParser(this.isPartial, stringBuffer.substring(i13), new TeXFormula(), false);
                            Atom argument = teXParser.getArgument();
                            this.matrix.col++;
                            int i14 = 0;
                            while (true) {
                                ArrayOfAtoms arrayOfAtoms = this.matrix;
                                if (i14 >= arrayOfAtoms.row) {
                                    break;
                                }
                                arrayOfAtoms.array.get(i14).add(arrayList.size(), argument);
                                i14++;
                            }
                            arrayList.add(5);
                            pos = teXParser.getPos() + i13;
                        }
                    } else {
                        int i15 = i3 + 1;
                        TeXParser teXParser2 = new TeXParser(this.isPartial, stringBuffer.substring(i15), new TeXFormula(), false);
                        String[] optsArgs = teXParser2.getOptsArgs(2, 0);
                        pos = teXParser2.getPos() + i15;
                        int parseInt = Integer.parseInt(optsArgs[1]);
                        parseInt = (parseInt < 0 || parseInt > 4096) ? 4096 : 4096;
                        StringBuilder sb2 = new StringBuilder(optsArgs[2].length() * parseInt);
                        for (int i16 = 0; i16 < parseInt; i16++) {
                            sb2.append(optsArgs[2]);
                        }
                        stringBuffer.insert(pos, sb2.toString());
                        length = stringBuffer.length();
                    }
                    i3 = pos - 1;
                }
                i3++;
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
            for (int i17 = 0; i17 < numArr.length; i17++) {
                this.position[i17] = numArr[i17].intValue();
            }
            return;
        }
        this.position = new int[]{2};
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironment2;
        float f10;
        TeXEnvironment teXEnvironment3;
        HorizontalBox horizontalBox;
        float[] fArr;
        int i3;
        Box[] boxArr;
        boolean hasRightVline;
        float[] fArr2;
        int i10;
        boolean z10;
        int i11;
        Atom atom;
        Box createBox;
        MatrixAtom matrixAtom = this;
        ArrayOfAtoms arrayOfAtoms = matrixAtom.matrix;
        int i12 = arrayOfAtoms.row;
        int i13 = arrayOfAtoms.col;
        int i14 = 0;
        Box[][] boxArr2 = (Box[][]) Array.newInstance(Box.class, i12, i13);
        float[] fArr3 = new float[i12];
        float[] fArr4 = new float[i12];
        float[] fArr5 = new float[i13];
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        if (matrixAtom.type == 5) {
            teXEnvironment2 = teXEnvironment.copy();
            teXEnvironment2.setStyle(4);
        } else {
            teXEnvironment2 = teXEnvironment;
        }
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (true) {
            f10 = 0.0f;
            if (i15 >= i12) {
                break;
            }
            fArr3[i15] = 0.0f;
            fArr4[i15] = 0.0f;
            int i16 = i14;
            while (i16 < i13) {
                try {
                    atom = matrixAtom.matrix.array.get(i15).get(i16);
                } catch (Exception unused) {
                    boxArr2[i15][i16 - 1].type = 11;
                    i16 = i13 - 1;
                    atom = null;
                }
                Box[] boxArr3 = boxArr2[i15];
                if (atom == null) {
                    createBox = nullBox;
                } else {
                    createBox = atom.createBox(teXEnvironment2);
                }
                boxArr3[i16] = createBox;
                fArr3[i15] = Math.max(boxArr2[i15][i16].getDepth(), fArr3[i15]);
                fArr4[i15] = Math.max(boxArr2[i15][i16].getHeight(), fArr4[i15]);
                Box box = boxArr2[i15][i16];
                float[] fArr6 = fArr5;
                if (box.type != 12) {
                    fArr6[i16] = Math.max(box.getWidth(), fArr6[i16]);
                } else {
                    MulticolumnAtom multicolumnAtom = (MulticolumnAtom) atom;
                    multicolumnAtom.setRowColumn(i15, i16);
                    arrayList.add(multicolumnAtom);
                }
                i16++;
                fArr5 = fArr6;
            }
            i15++;
            i14 = 0;
        }
        float[] fArr7 = fArr5;
        int i17 = 0;
        while (i17 < arrayList.size()) {
            MulticolumnAtom multicolumnAtom2 = (MulticolumnAtom) arrayList.get(i17);
            int col = multicolumnAtom2.getCol();
            int row = multicolumnAtom2.getRow();
            int skipped = multicolumnAtom2.getSkipped();
            float f11 = f10;
            int i18 = col;
            while (true) {
                i11 = col + skipped;
                if (i18 >= i11) {
                    break;
                }
                f11 += fArr7[i18];
                i18++;
            }
            if (boxArr2[row][col].getWidth() > f11) {
                float width = (boxArr2[row][col].getWidth() - f11) / skipped;
                while (col < i11) {
                    fArr7[col] = fArr7[col] + width;
                    col++;
                }
            }
            i17++;
            f10 = 0.0f;
        }
        float f12 = 0.0f;
        for (int i19 = 0; i19 < i13; i19++) {
            f12 += fArr7[i19];
        }
        Box[] columnSep = matrixAtom.getColumnSep(teXEnvironment2, f12);
        float f13 = f12;
        for (int i20 = 0; i20 < i13 + 1; i20++) {
            float width2 = columnSep[i20].getWidth() + f13;
            if (matrixAtom.vlines.get(Integer.valueOf(i20)) != null) {
                f13 = matrixAtom.vlines.get(Integer.valueOf(i20)).getWidth(teXEnvironment2) + width2;
            } else {
                f13 = width2;
            }
        }
        VerticalBox verticalBox = new VerticalBox();
        Box createBox2 = vsep_in.createBox(teXEnvironment2);
        verticalBox.add(vsep_ext_top.createBox(teXEnvironment2));
        int i21 = 0;
        while (i21 < i12) {
            HorizontalBox horizontalBox2 = new HorizontalBox();
            int i22 = 0;
            while (i22 < i13) {
                Box[] boxArr4 = columnSep;
                int i23 = boxArr2[i21][i22].type;
                int i24 = i12;
                if (i23 != -1) {
                    switch (i23) {
                        case 11:
                            int i25 = i21;
                            float textwidth = teXEnvironment2.getTextwidth();
                            if (textwidth == Float.POSITIVE_INFINITY) {
                                textwidth = fArr7[i22];
                            }
                            HorizontalBox horizontalBox3 = new HorizontalBox(boxArr2[i25][i22], textwidth, 0);
                            i22 = i13 - 1;
                            horizontalBox2 = horizontalBox3;
                            boxArr = boxArr4;
                            i21 = i25;
                            i3 = i13;
                            fArr2 = fArr7;
                            break;
                        case 12:
                            break;
                        case 13:
                            HlineAtom hlineAtom = (HlineAtom) matrixAtom.matrix.array.get(i21).get(i22);
                            hlineAtom.setWidth(f13);
                            if (i21 >= 1) {
                                i10 = i21;
                                if (matrixAtom.matrix.array.get(i10 - 1).get(i22) instanceof HlineAtom) {
                                    z10 = false;
                                    horizontalBox2.add(new StrutBox(0.0f, defaultRuleThickness * 2.0f, 0.0f, 0.0f));
                                    hlineAtom.setShift(((-createBox2.getHeight()) / 2.0f) + defaultRuleThickness);
                                    horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                                    i22 = i13;
                                    boxArr = boxArr4;
                                    i21 = i10;
                                    i3 = i22;
                                    fArr2 = fArr7;
                                    break;
                                }
                            } else {
                                i10 = i21;
                            }
                            z10 = false;
                            hlineAtom.setShift((-createBox2.getHeight()) / 2.0f);
                            horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                            i22 = i13;
                            boxArr = boxArr4;
                            i21 = i10;
                            i3 = i22;
                            fArr2 = fArr7;
                        default:
                            fArr2 = fArr7;
                            boxArr = boxArr4;
                            i3 = i13;
                            break;
                    }
                    i22++;
                    matrixAtom = this;
                    columnSep = boxArr;
                    i12 = i24;
                    i13 = i3;
                    fArr7 = fArr2;
                }
                int i26 = i21;
                if (i22 == 0) {
                    if (matrixAtom.vlines.get(0) != null) {
                        VlineAtom vlineAtom = matrixAtom.vlines.get(0);
                        vlineAtom.setHeight(createBox2.getHeight() + fArr4[i26] + fArr3[i26]);
                        vlineAtom.setShift((createBox2.getHeight() / 2.0f) + fArr3[i26]);
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
                if (boxArr2[i26][i22].type == -1) {
                    horizontalBox2.add(new HorizontalBox(boxArr2[i26][i22], fArr7[i22], matrixAtom.position[i22]));
                    horizontalBox = horizontalBox2;
                    fArr = fArr7;
                    boxArr = boxArr4;
                    i21 = i26;
                    teXEnvironment2 = teXEnvironment3;
                    hasRightVline = true;
                    i3 = i13;
                } else {
                    horizontalBox = horizontalBox2;
                    fArr = fArr7;
                    i21 = i26;
                    teXEnvironment2 = teXEnvironment3;
                    i3 = i13;
                    Box generateMulticolumn = matrixAtom.generateMulticolumn(teXEnvironment2, boxArr4, fArr, i21, i22);
                    boxArr = boxArr4;
                    MulticolumnAtom multicolumnAtom3 = (MulticolumnAtom) matrixAtom.matrix.array.get(i21).get(i22);
                    i22 = (multicolumnAtom3.getSkipped() - 1) + i22;
                    horizontalBox.add(generateMulticolumn);
                    hasRightVline = multicolumnAtom3.hasRightVline();
                }
                if (hasRightVline) {
                    int i27 = i22 + 1;
                    fArr2 = fArr;
                    if (matrixAtom.vlines.get(Integer.valueOf(i27)) != null) {
                        VlineAtom vlineAtom2 = matrixAtom.vlines.get(Integer.valueOf(i27));
                        vlineAtom2.setHeight(createBox2.getHeight() + fArr4[i21] + fArr3[i21]);
                        vlineAtom2.setShift((createBox2.getHeight() / 2.0f) + fArr3[i21]);
                        Box createBox4 = vlineAtom2.createBox(teXEnvironment2);
                        if (i22 < i3 - 1) {
                            horizontalBox.add(new HorizontalBox(createBox4, createBox4.getWidth() + boxArr[i27].getWidth(), 2));
                        } else {
                            horizontalBox.add(new HorizontalBox(createBox4, createBox4.getWidth() + boxArr[i27].getWidth(), 1));
                        }
                        horizontalBox2 = horizontalBox;
                        i22++;
                        matrixAtom = this;
                        columnSep = boxArr;
                        i12 = i24;
                        i13 = i3;
                        fArr7 = fArr2;
                    }
                } else {
                    fArr2 = fArr;
                }
                horizontalBox.add(boxArr[i22 + 1]);
                horizontalBox2 = horizontalBox;
                i22++;
                matrixAtom = this;
                columnSep = boxArr;
                i12 = i24;
                i13 = i3;
                fArr7 = fArr2;
            }
            Box[] boxArr5 = columnSep;
            int i28 = i12;
            int i29 = i13;
            float[] fArr8 = fArr7;
            HorizontalBox horizontalBox4 = horizontalBox2;
            if (boxArr2[i21][0].type != 13) {
                horizontalBox4.setHeight(fArr4[i21]);
                horizontalBox4.setDepth(fArr3[i21]);
                verticalBox.add(horizontalBox4);
                if (i21 < i28 - 1) {
                    verticalBox.add(createBox2);
                }
            } else {
                verticalBox.add(horizontalBox4);
            }
            i21++;
            matrixAtom = this;
            columnSep = boxArr5;
            i12 = i28;
            i13 = i29;
            fArr7 = fArr8;
        }
        verticalBox.add(vsep_ext_bot.createBox(teXEnvironment2));
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        float axisHeight = teXEnvironment2.getTeXFont().getAxisHeight(teXEnvironment2.getStyle());
        float f14 = depth / 2.0f;
        verticalBox.setHeight(f14 + axisHeight);
        verticalBox.setDepth(f14 - axisHeight);
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

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i3) {
        this(z10, arrayOfAtoms, i3, false);
    }

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i3, boolean z11) {
        this.vlines = new HashMap();
        this.isPartial = z10;
        this.matrix = arrayOfAtoms;
        this.type = i3;
        this.spaceAround = z11;
        if (i3 != 1 && i3 != 5) {
            this.position = new int[arrayOfAtoms.col];
            int i10 = 0;
            while (true) {
                int i11 = this.matrix.col;
                if (i10 >= i11) {
                    return;
                }
                int[] iArr = this.position;
                iArr[i10] = 1;
                int i12 = i10 + 1;
                if (i12 < i11) {
                    iArr[i12] = 0;
                }
                i10 += 2;
            }
        } else {
            this.position = new int[arrayOfAtoms.col];
            for (int i13 = 0; i13 < this.matrix.col; i13++) {
                this.position[i13] = 2;
            }
        }
    }

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i3, int i10) {
        this(z10, arrayOfAtoms, i3, i10, true);
    }

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i3, int i10, boolean z11) {
        this.vlines = new HashMap();
        this.isPartial = z10;
        this.matrix = arrayOfAtoms;
        this.type = i3;
        this.spaceAround = z11;
        this.position = new int[arrayOfAtoms.col];
        for (int i11 = 0; i11 < this.matrix.col; i11++) {
            this.position[i11] = i10;
        }
    }

    public MatrixAtom(ArrayOfAtoms arrayOfAtoms, int i3) {
        this(false, arrayOfAtoms, i3);
    }
}
