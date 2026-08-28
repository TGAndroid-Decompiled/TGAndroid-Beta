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

    private Box generateMulticolumn(TeXEnvironment teXEnvironment, Box[] boxArr, float[] fArr, int i9, int i10) {
        MulticolumnAtom multicolumnAtom = (MulticolumnAtom) this.matrix.array.get(i9).get(i10);
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
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            i10++;
            if (i10 <= 100000 && length <= 10000) {
                char charAt = stringBuffer.charAt(i9);
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
                                                int i12 = i9 + 1;
                                                if (i12 < length) {
                                                    if (stringBuffer.charAt(i12) != '|') {
                                                        break;
                                                    }
                                                    i11++;
                                                    i9 = i12;
                                                } else {
                                                    i9 = i12;
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
                            int i13 = i9 + 1;
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
                        int i15 = i9 + 1;
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
                    i9 = pos - 1;
                }
                i9++;
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
        TeXEnvironment teXEnvironment3;
        HorizontalBox horizontalBox;
        float[] fArr;
        int i9;
        Box[] boxArr;
        boolean hasRightVline;
        float[] fArr2;
        int i10;
        int i11;
        Atom atom;
        Box createBox;
        MatrixAtom matrixAtom = this;
        ArrayOfAtoms arrayOfAtoms = matrixAtom.matrix;
        int i12 = arrayOfAtoms.row;
        int i13 = arrayOfAtoms.col;
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
        for (int i14 = 0; i14 < i12; i14++) {
            fArr3[i14] = 0.0f;
            fArr4[i14] = 0.0f;
            int i15 = 0;
            while (i15 < i13) {
                try {
                    atom = matrixAtom.matrix.array.get(i14).get(i15);
                } catch (Exception unused) {
                    boxArr2[i14][i15 - 1].type = 11;
                    i15 = i13 - 1;
                    atom = null;
                }
                Box[] boxArr3 = boxArr2[i14];
                if (atom == null) {
                    createBox = nullBox;
                } else {
                    createBox = atom.createBox(teXEnvironment2);
                }
                boxArr3[i15] = createBox;
                fArr3[i14] = Math.max(boxArr2[i14][i15].getDepth(), fArr3[i14]);
                fArr4[i14] = Math.max(boxArr2[i14][i15].getHeight(), fArr4[i14]);
                Box box = boxArr2[i14][i15];
                float[] fArr6 = fArr5;
                if (box.type != 12) {
                    fArr6[i15] = Math.max(box.getWidth(), fArr6[i15]);
                } else {
                    MulticolumnAtom multicolumnAtom = (MulticolumnAtom) atom;
                    multicolumnAtom.setRowColumn(i14, i15);
                    arrayList.add(multicolumnAtom);
                }
                i15++;
                fArr5 = fArr6;
            }
        }
        float[] fArr7 = fArr5;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            MulticolumnAtom multicolumnAtom2 = (MulticolumnAtom) arrayList.get(i16);
            int col = multicolumnAtom2.getCol();
            int row = multicolumnAtom2.getRow();
            int skipped = multicolumnAtom2.getSkipped();
            int i17 = col;
            float f10 = 0.0f;
            while (true) {
                i11 = col + skipped;
                if (i17 >= i11) {
                    break;
                }
                f10 += fArr7[i17];
                i17++;
            }
            if (boxArr2[row][col].getWidth() > f10) {
                float width = (boxArr2[row][col].getWidth() - f10) / skipped;
                while (col < i11) {
                    fArr7[col] = fArr7[col] + width;
                    col++;
                }
            }
        }
        float f11 = 0.0f;
        for (int i18 = 0; i18 < i13; i18++) {
            f11 += fArr7[i18];
        }
        Box[] columnSep = matrixAtom.getColumnSep(teXEnvironment2, f11);
        float f12 = f11;
        for (int i19 = 0; i19 < i13 + 1; i19++) {
            float width2 = columnSep[i19].getWidth() + f12;
            if (matrixAtom.vlines.get(Integer.valueOf(i19)) != null) {
                f12 = matrixAtom.vlines.get(Integer.valueOf(i19)).getWidth(teXEnvironment2) + width2;
            } else {
                f12 = width2;
            }
        }
        VerticalBox verticalBox = new VerticalBox();
        Box createBox2 = vsep_in.createBox(teXEnvironment2);
        verticalBox.add(vsep_ext_top.createBox(teXEnvironment2));
        int i20 = 0;
        while (i20 < i12) {
            HorizontalBox horizontalBox2 = new HorizontalBox();
            int i21 = 0;
            while (i21 < i13) {
                Box[] boxArr4 = columnSep;
                int i22 = boxArr2[i20][i21].type;
                int i23 = i12;
                if (i22 != -1) {
                    switch (i22) {
                        case 11:
                            int i24 = i20;
                            float textwidth = teXEnvironment2.getTextwidth();
                            if (textwidth == Float.POSITIVE_INFINITY) {
                                textwidth = fArr7[i21];
                            }
                            HorizontalBox horizontalBox3 = new HorizontalBox(boxArr2[i24][i21], textwidth, 0);
                            i21 = i13 - 1;
                            horizontalBox2 = horizontalBox3;
                            boxArr = boxArr4;
                            i20 = i24;
                            i9 = i13;
                            fArr2 = fArr7;
                            break;
                        case 12:
                            break;
                        case 13:
                            HlineAtom hlineAtom = (HlineAtom) matrixAtom.matrix.array.get(i20).get(i21);
                            hlineAtom.setWidth(f12);
                            if (i20 >= 1) {
                                i10 = i20;
                                if (matrixAtom.matrix.array.get(i10 - 1).get(i21) instanceof HlineAtom) {
                                    horizontalBox2.add(new StrutBox(0.0f, defaultRuleThickness * 2.0f, 0.0f, 0.0f));
                                    hlineAtom.setShift(((-createBox2.getHeight()) / 2.0f) + defaultRuleThickness);
                                    horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                                    i21 = i13;
                                    boxArr = boxArr4;
                                    i20 = i10;
                                    i9 = i21;
                                    fArr2 = fArr7;
                                    break;
                                }
                            } else {
                                i10 = i20;
                            }
                            hlineAtom.setShift((-createBox2.getHeight()) / 2.0f);
                            horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                            i21 = i13;
                            boxArr = boxArr4;
                            i20 = i10;
                            i9 = i21;
                            fArr2 = fArr7;
                        default:
                            fArr2 = fArr7;
                            boxArr = boxArr4;
                            i9 = i13;
                            break;
                    }
                    i21++;
                    matrixAtom = this;
                    columnSep = boxArr;
                    i12 = i23;
                    i13 = i9;
                    fArr7 = fArr2;
                }
                int i25 = i20;
                if (i21 == 0) {
                    if (matrixAtom.vlines.get(0) != null) {
                        VlineAtom vlineAtom = matrixAtom.vlines.get(0);
                        vlineAtom.setHeight(createBox2.getHeight() + fArr4[i25] + fArr3[i25]);
                        vlineAtom.setShift((createBox2.getHeight() / 2.0f) + fArr3[i25]);
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
                if (boxArr2[i25][i21].type == -1) {
                    horizontalBox2.add(new HorizontalBox(boxArr2[i25][i21], fArr7[i21], matrixAtom.position[i21]));
                    horizontalBox = horizontalBox2;
                    fArr = fArr7;
                    boxArr = boxArr4;
                    i20 = i25;
                    teXEnvironment2 = teXEnvironment3;
                    hasRightVline = true;
                    i9 = i13;
                } else {
                    horizontalBox = horizontalBox2;
                    fArr = fArr7;
                    i20 = i25;
                    teXEnvironment2 = teXEnvironment3;
                    i9 = i13;
                    Box generateMulticolumn = matrixAtom.generateMulticolumn(teXEnvironment2, boxArr4, fArr, i20, i21);
                    boxArr = boxArr4;
                    MulticolumnAtom multicolumnAtom3 = (MulticolumnAtom) matrixAtom.matrix.array.get(i20).get(i21);
                    i21 = (multicolumnAtom3.getSkipped() - 1) + i21;
                    horizontalBox.add(generateMulticolumn);
                    hasRightVline = multicolumnAtom3.hasRightVline();
                }
                if (hasRightVline) {
                    int i26 = i21 + 1;
                    fArr2 = fArr;
                    if (matrixAtom.vlines.get(Integer.valueOf(i26)) != null) {
                        VlineAtom vlineAtom2 = matrixAtom.vlines.get(Integer.valueOf(i26));
                        vlineAtom2.setHeight(createBox2.getHeight() + fArr4[i20] + fArr3[i20]);
                        vlineAtom2.setShift((createBox2.getHeight() / 2.0f) + fArr3[i20]);
                        Box createBox4 = vlineAtom2.createBox(teXEnvironment2);
                        if (i21 < i9 - 1) {
                            horizontalBox.add(new HorizontalBox(createBox4, createBox4.getWidth() + boxArr[i26].getWidth(), 2));
                        } else {
                            horizontalBox.add(new HorizontalBox(createBox4, createBox4.getWidth() + boxArr[i26].getWidth(), 1));
                        }
                        horizontalBox2 = horizontalBox;
                        i21++;
                        matrixAtom = this;
                        columnSep = boxArr;
                        i12 = i23;
                        i13 = i9;
                        fArr7 = fArr2;
                    }
                } else {
                    fArr2 = fArr;
                }
                horizontalBox.add(boxArr[i21 + 1]);
                horizontalBox2 = horizontalBox;
                i21++;
                matrixAtom = this;
                columnSep = boxArr;
                i12 = i23;
                i13 = i9;
                fArr7 = fArr2;
            }
            Box[] boxArr5 = columnSep;
            int i27 = i12;
            int i28 = i13;
            float[] fArr8 = fArr7;
            HorizontalBox horizontalBox4 = horizontalBox2;
            if (boxArr2[i20][0].type != 13) {
                horizontalBox4.setHeight(fArr4[i20]);
                horizontalBox4.setDepth(fArr3[i20]);
                verticalBox.add(horizontalBox4);
                if (i20 < i27 - 1) {
                    verticalBox.add(createBox2);
                }
            } else {
                verticalBox.add(horizontalBox4);
            }
            i20++;
            matrixAtom = this;
            columnSep = boxArr5;
            i12 = i27;
            i13 = i28;
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

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i9) {
        this(z10, arrayOfAtoms, i9, false);
    }

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i9, boolean z11) {
        this.vlines = new HashMap();
        this.isPartial = z10;
        this.matrix = arrayOfAtoms;
        this.type = i9;
        this.spaceAround = z11;
        if (i9 != 1 && i9 != 5) {
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

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i9, int i10) {
        this(z10, arrayOfAtoms, i9, i10, true);
    }

    public MatrixAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i9, int i10, boolean z11) {
        this.vlines = new HashMap();
        this.isPartial = z10;
        this.matrix = arrayOfAtoms;
        this.type = i9;
        this.spaceAround = z11;
        this.position = new int[arrayOfAtoms.col];
        for (int i11 = 0; i11 < this.matrix.col; i11++) {
            this.position[i11] = i10;
        }
    }

    public MatrixAtom(ArrayOfAtoms arrayOfAtoms, int i9) {
        this(false, arrayOfAtoms, i9);
    }
}
