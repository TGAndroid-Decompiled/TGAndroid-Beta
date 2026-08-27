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
        int i12 = i11;
        float width = 0.0f;
        while (i12 < (i11 + skipped) - 1) {
            float f10 = fArr[i12];
            i12++;
            float width2 = boxArr[i12].getWidth() + f10 + width;
            width = this.vlines.get(Integer.valueOf(i12)) != null ? this.vlines.get(Integer.valueOf(i12)).getWidth(teXEnvironment) + width2 : width2;
        }
        float f11 = width + fArr[i12];
        multicolumnAtom.setWidth(multicolumnAtom.createBox(teXEnvironment).getWidth() <= f11 ? f11 : 0.0f);
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
            if (i11 > 100000 || length > 10000) {
                throw new ParseException("Column specification is too complex");
            }
            char cCharAt = stringBuffer.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    int i12 = i10 + 1;
                    TeXParser teXParser = new TeXParser(this.isPartial, stringBuffer.substring(i12), new TeXFormula(), false);
                    String[] optsArgs = teXParser.getOptsArgs(2, 0);
                    pos = teXParser.getPos() + i12;
                    int i13 = Integer.parseInt(optsArgs[1]);
                    if (i13 < 0 || i13 > 4096) {
                        i13 = 4096;
                    }
                    StringBuilder sb2 = new StringBuilder(optsArgs[2].length() * i13);
                    for (int i14 = 0; i14 < i13; i14++) {
                        sb2.append(optsArgs[2]);
                    }
                    stringBuffer.insert(pos, sb2.toString());
                    length = stringBuffer.length();
                } else if (cCharAt == '@') {
                    int i15 = i10 + 1;
                    TeXParser teXParser2 = new TeXParser(this.isPartial, stringBuffer.substring(i15), new TeXFormula(), false);
                    Atom argument = teXParser2.getArgument();
                    this.matrix.col++;
                    int i16 = 0;
                    while (true) {
                        ArrayOfAtoms arrayOfAtoms = this.matrix;
                        if (i16 >= arrayOfAtoms.row) {
                            break;
                        }
                        arrayOfAtoms.array.get(i16).add(arrayList.size(), argument);
                        i16++;
                    }
                    arrayList.add(5);
                    pos = teXParser2.getPos() + i15;
                } else if (cCharAt == 'c') {
                    arrayList.add(2);
                } else if (cCharAt == 'l') {
                    arrayList.add(0);
                } else if (cCharAt == 'r') {
                    arrayList.add(1);
                } else if (cCharAt != '|') {
                    arrayList.add(2);
                } else {
                    int i17 = 1;
                    while (true) {
                        int i18 = i10 + 1;
                        if (i18 >= length) {
                            i10 = i18;
                            break;
                        } else {
                            if (stringBuffer.charAt(i18) != '|') {
                                break;
                            }
                            i17++;
                            i10 = i18;
                        }
                    }
                    this.vlines.put(Integer.valueOf(arrayList.size()), new VlineAtom(i17));
                }
                i10 = pos - 1;
            }
            i10++;
        }
        for (int size = arrayList.size(); size < this.matrix.col; size++) {
            arrayList.add(2);
        }
        if (arrayList.size() == 0) {
            this.position = new int[]{2};
            return;
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        this.position = new int[numArr.length];
        for (int i19 = 0; i19 < numArr.length; i19++) {
            this.position[i19] = numArr[i19].intValue();
        }
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironmentCopy;
        int i10;
        HorizontalBox horizontalBox;
        float[] fArr;
        boolean zHasRightVline;
        float[] fArr2;
        int i11;
        Box boxCreateBox;
        int i12;
        int i13;
        Atom atom;
        MatrixAtom matrixAtom = this;
        ArrayOfAtoms arrayOfAtoms = matrixAtom.matrix;
        int i14 = arrayOfAtoms.row;
        int i15 = arrayOfAtoms.col;
        Box[][] boxArr = (Box[][]) Array.newInstance((Class<?>) Box.class, i14, i15);
        float[] fArr3 = new float[i14];
        float[] fArr4 = new float[i14];
        float[] fArr5 = new float[i15];
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        if (matrixAtom.type == 5) {
            teXEnvironmentCopy = teXEnvironment.copy();
            teXEnvironmentCopy.setStyle(4);
        } else {
            teXEnvironmentCopy = teXEnvironment;
        }
        ArrayList arrayList = new ArrayList();
        for (int i16 = 0; i16 < i14; i16++) {
            fArr3[i16] = 0.0f;
            fArr4[i16] = 0.0f;
            int i17 = 0;
            while (i17 < i15) {
                try {
                    atom = matrixAtom.matrix.array.get(i16).get(i17);
                } catch (Exception unused) {
                    boxArr[i16][i17 - 1].type = 11;
                    i17 = i15 - 1;
                    atom = null;
                }
                boxArr[i16][i17] = atom == null ? nullBox : atom.createBox(teXEnvironmentCopy);
                fArr3[i16] = Math.max(boxArr[i16][i17].getDepth(), fArr3[i16]);
                fArr4[i16] = Math.max(boxArr[i16][i17].getHeight(), fArr4[i16]);
                Box box = boxArr[i16][i17];
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
        }
        float[] fArr7 = fArr5;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            MulticolumnAtom multicolumnAtom2 = (MulticolumnAtom) arrayList.get(i18);
            int col = multicolumnAtom2.getCol();
            int row = multicolumnAtom2.getRow();
            int skipped = multicolumnAtom2.getSkipped();
            int i19 = col;
            float f10 = 0.0f;
            while (true) {
                i13 = col + skipped;
                if (i19 >= i13) {
                    break;
                }
                f10 += fArr7[i19];
                i19++;
            }
            if (boxArr[row][col].getWidth() > f10) {
                float width = (boxArr[row][col].getWidth() - f10) / skipped;
                while (col < i13) {
                    fArr7[col] = fArr7[col] + width;
                    col++;
                }
            }
        }
        float f11 = 0.0f;
        for (int i20 = 0; i20 < i15; i20++) {
            f11 += fArr7[i20];
        }
        Box[] columnSep = matrixAtom.getColumnSep(teXEnvironmentCopy, f11);
        float width2 = f11;
        for (int i21 = 0; i21 < i15 + 1; i21++) {
            float width3 = columnSep[i21].getWidth() + width2;
            width2 = matrixAtom.vlines.get(Integer.valueOf(i21)) != null ? matrixAtom.vlines.get(Integer.valueOf(i21)).getWidth(teXEnvironmentCopy) + width3 : width3;
        }
        VerticalBox verticalBox = new VerticalBox();
        Box boxCreateBox2 = vsep_in.createBox(teXEnvironmentCopy);
        verticalBox.add(vsep_ext_top.createBox(teXEnvironmentCopy));
        int i22 = 0;
        while (i22 < i14) {
            HorizontalBox horizontalBox2 = new HorizontalBox();
            int skipped2 = 0;
            while (skipped2 < i15) {
                Box[] boxArr2 = columnSep;
                int i23 = boxArr[i22][skipped2].type;
                int i24 = i14;
                if (i23 != -1) {
                    switch (i23) {
                        case 11:
                            int i25 = i22;
                            float textwidth = teXEnvironmentCopy.getTextwidth();
                            if (textwidth == Float.POSITIVE_INFINITY) {
                                textwidth = fArr7[skipped2];
                            }
                            HorizontalBox horizontalBox3 = new HorizontalBox(boxArr[i25][skipped2], textwidth, 0);
                            skipped2 = i15 - 1;
                            horizontalBox2 = horizontalBox3;
                            i22 = i25;
                            i15 = i15;
                            fArr2 = fArr7;
                            break;
                        case 12:
                            i10 = i22;
                            if (skipped2 != 0) {
                                if (matrixAtom.vlines.get(0) != null) {
                                    VlineAtom vlineAtom = matrixAtom.vlines.get(0);
                                    vlineAtom.setHeight(boxCreateBox2.getHeight() + fArr4[i10] + fArr3[i10]);
                                    vlineAtom.setShift((boxCreateBox2.getHeight() / 2.0f) + fArr3[i10]);
                                    Box boxCreateBox3 = vlineAtom.createBox(teXEnvironmentCopy);
                                    horizontalBox2.add(new HorizontalBox(boxCreateBox3, boxCreateBox3.getWidth() + boxArr2[0].getWidth(), 0));
                                } else {
                                    horizontalBox2.add(boxArr2[0]);
                                }
                            }
                            if (boxArr[i10][skipped2].type == -1) {
                                horizontalBox2.add(new HorizontalBox(boxArr[i10][skipped2], fArr7[skipped2], matrixAtom.position[skipped2]));
                                horizontalBox = horizontalBox2;
                                fArr = fArr7;
                                boxArr2 = boxArr2;
                                i22 = i10;
                                zHasRightVline = true;
                            } else {
                                horizontalBox = horizontalBox2;
                                fArr = fArr7;
                                i22 = i10;
                                Box boxGenerateMulticolumn = matrixAtom.generateMulticolumn(teXEnvironmentCopy, boxArr2, fArr, i22, skipped2);
                                boxArr2 = boxArr2;
                                MulticolumnAtom multicolumnAtom3 = (MulticolumnAtom) matrixAtom.matrix.array.get(i22).get(skipped2);
                                skipped2 = (multicolumnAtom3.getSkipped() - 1) + skipped2;
                                horizontalBox.add(boxGenerateMulticolumn);
                                zHasRightVline = multicolumnAtom3.hasRightVline();
                            }
                            if (zHasRightVline) {
                                teXEnvironmentCopy = teXEnvironmentCopy;
                                i11 = skipped2 + 1;
                                fArr2 = fArr;
                                if (matrixAtom.vlines.get(Integer.valueOf(i11)) != null) {
                                    VlineAtom vlineAtom2 = matrixAtom.vlines.get(Integer.valueOf(i11));
                                    vlineAtom2.setHeight(boxCreateBox2.getHeight() + fArr4[i22] + fArr3[i22]);
                                    vlineAtom2.setShift((boxCreateBox2.getHeight() / 2.0f) + fArr3[i22]);
                                    boxCreateBox = vlineAtom2.createBox(teXEnvironmentCopy);
                                    if (skipped2 < i15 - 1) {
                                        teXEnvironmentCopy = teXEnvironmentCopy;
                                        horizontalBox.add(new HorizontalBox(boxCreateBox, boxCreateBox.getWidth() + boxArr2[i11].getWidth(), 2));
                                    } else {
                                        teXEnvironmentCopy = teXEnvironmentCopy;
                                        horizontalBox.add(new HorizontalBox(boxCreateBox, boxCreateBox.getWidth() + boxArr2[i11].getWidth(), 1));
                                    }
                                }
                                horizontalBox2 = horizontalBox;
                            } else {
                                teXEnvironmentCopy = teXEnvironmentCopy;
                                teXEnvironmentCopy = teXEnvironmentCopy;
                                fArr2 = fArr;
                            }
                            teXEnvironmentCopy = teXEnvironmentCopy;
                            horizontalBox.add(boxArr2[skipped2 + 1]);
                            horizontalBox2 = horizontalBox;
                            break;
                        case 13:
                            HlineAtom hlineAtom = (HlineAtom) matrixAtom.matrix.array.get(i22).get(skipped2);
                            hlineAtom.setWidth(width2);
                            if (i22 >= 1) {
                                i12 = i22;
                                if (matrixAtom.matrix.array.get(i12 - 1).get(skipped2) instanceof HlineAtom) {
                                    horizontalBox2.add(new StrutBox(0.0f, defaultRuleThickness * 2.0f, 0.0f, 0.0f));
                                    hlineAtom.setShift(((-boxCreateBox2.getHeight()) / 2.0f) + defaultRuleThickness);
                                }
                                horizontalBox2.add(hlineAtom.createBox(teXEnvironmentCopy));
                                skipped2 = i15;
                                i22 = i12;
                                i15 = skipped2;
                                fArr2 = fArr7;
                            } else {
                                i12 = i22;
                            }
                            hlineAtom.setShift((-boxCreateBox2.getHeight()) / 2.0f);
                            horizontalBox2.add(hlineAtom.createBox(teXEnvironmentCopy));
                            skipped2 = i15;
                            i22 = i12;
                            i15 = skipped2;
                            fArr2 = fArr7;
                            break;
                        default:
                            fArr2 = fArr7;
                            boxArr2 = boxArr2;
                            i15 = i15;
                            break;
                    }
                } else {
                    i10 = i22;
                    if (skipped2 != 0) {
                        if (matrixAtom.vlines.get(0) != null) {
                            VlineAtom vlineAtom3 = matrixAtom.vlines.get(0);
                            vlineAtom3.setHeight(boxCreateBox2.getHeight() + fArr4[i10] + fArr3[i10]);
                            vlineAtom3.setShift((boxCreateBox2.getHeight() / 2.0f) + fArr3[i10]);
                            Box boxCreateBox4 = vlineAtom3.createBox(teXEnvironmentCopy);
                            horizontalBox2.add(new HorizontalBox(boxCreateBox4, boxCreateBox4.getWidth() + boxArr2[0].getWidth(), 0));
                        } else {
                            horizontalBox2.add(boxArr2[0]);
                        }
                    }
                    if (boxArr[i10][skipped2].type == -1) {
                        horizontalBox2.add(new HorizontalBox(boxArr[i10][skipped2], fArr7[skipped2], matrixAtom.position[skipped2]));
                        horizontalBox = horizontalBox2;
                        fArr = fArr7;
                        boxArr2 = boxArr2;
                        i22 = i10;
                        zHasRightVline = true;
                    } else {
                        horizontalBox = horizontalBox2;
                        fArr = fArr7;
                        i22 = i10;
                        Box boxGenerateMulticolumn2 = matrixAtom.generateMulticolumn(teXEnvironmentCopy, boxArr2, fArr, i22, skipped2);
                        boxArr2 = boxArr2;
                        MulticolumnAtom multicolumnAtom4 = (MulticolumnAtom) matrixAtom.matrix.array.get(i22).get(skipped2);
                        skipped2 = (multicolumnAtom4.getSkipped() - 1) + skipped2;
                        horizontalBox.add(boxGenerateMulticolumn2);
                        zHasRightVline = multicolumnAtom4.hasRightVline();
                    }
                    if (zHasRightVline) {
                        teXEnvironmentCopy = teXEnvironmentCopy;
                        i11 = skipped2 + 1;
                        fArr2 = fArr;
                        if (matrixAtom.vlines.get(Integer.valueOf(i11)) != null) {
                            VlineAtom vlineAtom4 = matrixAtom.vlines.get(Integer.valueOf(i11));
                            vlineAtom4.setHeight(boxCreateBox2.getHeight() + fArr4[i22] + fArr3[i22]);
                            vlineAtom4.setShift((boxCreateBox2.getHeight() / 2.0f) + fArr3[i22]);
                            boxCreateBox = vlineAtom4.createBox(teXEnvironmentCopy);
                            if (skipped2 < i15 - 1) {
                                teXEnvironmentCopy = teXEnvironmentCopy;
                                horizontalBox.add(new HorizontalBox(boxCreateBox, boxCreateBox.getWidth() + boxArr2[i11].getWidth(), 2));
                            } else {
                                teXEnvironmentCopy = teXEnvironmentCopy;
                                horizontalBox.add(new HorizontalBox(boxCreateBox, boxCreateBox.getWidth() + boxArr2[i11].getWidth(), 1));
                            }
                        }
                        horizontalBox2 = horizontalBox;
                    } else {
                        teXEnvironmentCopy = teXEnvironmentCopy;
                        teXEnvironmentCopy = teXEnvironmentCopy;
                        fArr2 = fArr;
                    }
                    teXEnvironmentCopy = teXEnvironmentCopy;
                    horizontalBox.add(boxArr2[skipped2 + 1]);
                    horizontalBox2 = horizontalBox;
                }
                skipped2++;
                matrixAtom = this;
                columnSep = boxArr2;
                i14 = i24;
                i15 = i15;
                fArr7 = fArr2;
            }
            Box[] boxArr3 = columnSep;
            int i26 = i14;
            int i27 = i15;
            float[] fArr8 = fArr7;
            HorizontalBox horizontalBox4 = horizontalBox2;
            if (boxArr[i22][0].type != 13) {
                horizontalBox4.setHeight(fArr4[i22]);
                horizontalBox4.setDepth(fArr3[i22]);
                verticalBox.add(horizontalBox4);
                if (i22 < i26 - 1) {
                    verticalBox.add(boxCreateBox2);
                }
            } else {
                verticalBox.add(horizontalBox4);
            }
            i22++;
            matrixAtom = this;
            columnSep = boxArr3;
            i14 = i26;
            i15 = i27;
            fArr7 = fArr8;
        }
        verticalBox.add(vsep_ext_bot.createBox(teXEnvironmentCopy));
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        float axisHeight = teXEnvironmentCopy.getTeXFont().getAxisHeight(teXEnvironmentCopy.getStyle());
        float f12 = depth / 2.0f;
        verticalBox.setHeight(f12 + axisHeight);
        verticalBox.setDepth(f12 - axisHeight);
        return verticalBox;
    }

    public Box[] getColumnSep(TeXEnvironment teXEnvironment, float f10) {
        int i10 = this.matrix.col;
        Box[] boxArr = new Box[i10 + 1];
        float textwidth = teXEnvironment.getTextwidth();
        int i11 = this.type;
        if (i11 == 6 || i11 == 7) {
            textwidth = Float.POSITIVE_INFINITY;
        }
        int i12 = 2;
        int i13 = 1;
        switch (i11) {
            case 0:
                if (this.position[0] == 5) {
                    boxArr[1] = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    i12 = 1;
                }
                if (this.spaceAround) {
                    boxArr[0] = semihsep.createBox(teXEnvironment);
                } else {
                    boxArr[0] = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                }
                boxArr[i10] = boxArr[0];
                Box boxCreateBox = hsep.createBox(teXEnvironment);
                while (i12 < i10) {
                    if (this.position[i12] == 5) {
                        StrutBox strutBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                        boxArr[i12] = strutBox;
                        i12++;
                        boxArr[i12] = strutBox;
                    } else {
                        boxArr[i12] = boxCreateBox;
                    }
                    i12++;
                }
                break;
            case 1:
            case 5:
                Box box = nullBox;
                boxArr[0] = box;
                boxArr[i10] = box;
                Box boxCreateBox2 = hsep.createBox(teXEnvironment);
                while (i13 < i10) {
                    boxArr[i13] = boxCreateBox2;
                    i13++;
                }
                break;
            case 2:
            case 6:
                Box boxCreateBox3 = align.createBox(teXEnvironment);
                Box strutBox2 = textwidth != Float.POSITIVE_INFINITY ? new StrutBox(Math.max(((textwidth - f10) - (boxCreateBox3.getWidth() * (i10 / 2))) / ((float) Math.floor((i10 + 3) / 2)), 0.0f), 0.0f, 0.0f, 0.0f) : hsep.createBox(teXEnvironment);
                boxArr[i10] = strutBox2;
                for (int i14 = 0; i14 < i10; i14++) {
                    if (i14 % 2 == 0) {
                        boxArr[i14] = strutBox2;
                    } else {
                        boxArr[i14] = boxCreateBox3;
                    }
                }
                if (textwidth == Float.POSITIVE_INFINITY) {
                    Box box2 = nullBox;
                    boxArr[0] = box2;
                    boxArr[i10] = box2;
                }
                break;
            case 3:
            case 7:
                float fMax = textwidth != Float.POSITIVE_INFINITY ? Math.max((textwidth - f10) / 2.0f, 0.0f) : 0.0f;
                Box boxCreateBox4 = align.createBox(teXEnvironment);
                Box box3 = nullBox;
                StrutBox strutBox3 = new StrutBox(fMax, 0.0f, 0.0f, 0.0f);
                boxArr[0] = strutBox3;
                boxArr[i10] = strutBox3;
                while (i13 < i10) {
                    if (i13 % 2 == 0) {
                        boxArr[i13] = box3;
                    } else {
                        boxArr[i13] = boxCreateBox4;
                    }
                    i13++;
                }
                if (textwidth == Float.POSITIVE_INFINITY) {
                    Box box4 = nullBox;
                    boxArr[0] = box4;
                    boxArr[i10] = box4;
                }
                break;
            case 4:
                Box boxCreateBox5 = align.createBox(teXEnvironment);
                Box strutBox4 = textwidth != Float.POSITIVE_INFINITY ? new StrutBox(Math.max(((textwidth - f10) - (boxCreateBox5.getWidth() * (i10 / 2))) / ((float) Math.floor((i10 - 1) / 2)), 0.0f), 0.0f, 0.0f, 0.0f) : hsep.createBox(teXEnvironment);
                Box box5 = nullBox;
                boxArr[0] = box5;
                boxArr[i10] = box5;
                while (i13 < i10) {
                    if (i13 % 2 == 0) {
                        boxArr[i13] = strutBox4;
                    } else {
                        boxArr[i13] = boxCreateBox5;
                    }
                    i13++;
                }
                if (textwidth == Float.POSITIVE_INFINITY) {
                    Box box6 = nullBox;
                    boxArr[0] = box6;
                    boxArr[i10] = box6;
                }
                break;
            default:
                if (textwidth == Float.POSITIVE_INFINITY) {
                    Box box7 = nullBox;
                    boxArr[0] = box7;
                    boxArr[i10] = box7;
                }
                break;
        }
        return boxArr;
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
