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

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, String str, boolean z2) {
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

    private void parsePositions(StringBuffer stringBuffer) {
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
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironment2;
        VerticalBox verticalBox;
        float f;
        HorizontalBox horizontalBox;
        boolean zHasRightVline;
        int i;
        int i2;
        Box boxCreateBox;
        int i3;
        Atom atom;
        ArrayOfAtoms arrayOfAtoms = this.matrix;
        int i4 = arrayOfAtoms.row;
        int i5 = arrayOfAtoms.col;
        Integer num = 0;
        Box[][] boxArr = (Box[][]) Array.newInstance((Class<?>) Box.class, i4, i5);
        float[] fArr = new float[i4];
        float[] fArr2 = new float[i4];
        float[] fArr3 = new float[i5];
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        if (this.type == 5) {
            TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy();
            teXEnvironmentCopy.setStyle(4);
            teXEnvironment2 = teXEnvironmentCopy;
        } else {
            teXEnvironment2 = teXEnvironment;
        }
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < i4; i6++) {
            fArr[i6] = 0.0f;
            fArr2[i6] = 0.0f;
            int i7 = 0;
            while (i7 < i5) {
                try {
                    atom = this.matrix.array.get(i6).get(i7);
                } catch (Exception unused) {
                    boxArr[i6][i7 - 1].type = 11;
                    i7 = i5 - 1;
                    atom = null;
                }
                boxArr[i6][i7] = atom == null ? nullBox : atom.createBox(teXEnvironment2);
                fArr[i6] = Math.max(boxArr[i6][i7].getDepth(), fArr[i6]);
                fArr2[i6] = Math.max(boxArr[i6][i7].getHeight(), fArr2[i6]);
                Box box = boxArr[i6][i7];
                if (box.type != 12) {
                    fArr3[i7] = Math.max(box.getWidth(), fArr3[i7]);
                } else {
                    MulticolumnAtom multicolumnAtom = (MulticolumnAtom) atom;
                    multicolumnAtom.setRowColumn(i6, i7);
                    arrayList.add(multicolumnAtom);
                }
                i7++;
            }
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            MulticolumnAtom multicolumnAtom2 = (MulticolumnAtom) arrayList.get(i8);
            int col = multicolumnAtom2.getCol();
            int row = multicolumnAtom2.getRow();
            int skipped = multicolumnAtom2.getSkipped();
            int i9 = col;
            float f2 = 0.0f;
            while (true) {
                i3 = col + skipped;
                if (i9 >= i3) {
                    break;
                }
                f2 += fArr3[i9];
                i9++;
            }
            if (boxArr[row][col].getWidth() > f2) {
                float width = (boxArr[row][col].getWidth() - f2) / skipped;
                while (col < i3) {
                    fArr3[col] = fArr3[col] + width;
                    col++;
                }
            }
        }
        float f3 = 0.0f;
        for (int i10 = 0; i10 < i5; i10++) {
            f3 += fArr3[i10];
        }
        Box[] columnSep = getColumnSep(teXEnvironment2, f3);
        float width2 = f3;
        for (int i11 = 0; i11 < i5 + 1; i11++) {
            width2 += columnSep[i11].getWidth();
            if (this.vlines.get(Integer.valueOf(i11)) != null) {
                width2 += this.vlines.get(Integer.valueOf(i11)).getWidth(teXEnvironment2);
            }
        }
        VerticalBox verticalBox2 = new VerticalBox();
        Box boxCreateBox2 = vsep_in.createBox(teXEnvironment2);
        verticalBox2.add(vsep_ext_top.createBox(teXEnvironment2));
        int i12 = 0;
        while (i12 < i4) {
            HorizontalBox horizontalBox2 = new HorizontalBox();
            int i13 = 0;
            while (i13 < i5) {
                int i14 = i4;
                int i15 = boxArr[i12][i13].type;
                VerticalBox verticalBox3 = verticalBox2;
                if (i15 == -1) {
                    f = width2;
                    if (i13 != 0) {
                        if (this.vlines.get(num) != null) {
                            VlineAtom vlineAtom = this.vlines.get(num);
                            vlineAtom.setHeight(fArr2[i12] + fArr[i12] + boxCreateBox2.getHeight());
                            vlineAtom.setShift(fArr[i12] + (boxCreateBox2.getHeight() / 2.0f));
                            Box boxCreateBox3 = vlineAtom.createBox(teXEnvironment2);
                            horizontalBox2.add(new HorizontalBox(boxCreateBox3, columnSep[0].getWidth() + boxCreateBox3.getWidth(), 0));
                        } else {
                            horizontalBox2.add(columnSep[0]);
                        }
                    }
                    if (boxArr[i12][i13].type == -1) {
                        horizontalBox2.add(new HorizontalBox(boxArr[i12][i13], fArr3[i13], this.position[i13]));
                        horizontalBox = horizontalBox2;
                        i12 = i12;
                        zHasRightVline = true;
                    } else {
                        int i16 = i13;
                        horizontalBox = horizontalBox2;
                        i12 = i12;
                        Box boxGenerateMulticolumn = generateMulticolumn(teXEnvironment2, columnSep, fArr3, i12, i16);
                        MulticolumnAtom multicolumnAtom3 = (MulticolumnAtom) this.matrix.array.get(i12).get(i16);
                        int skipped2 = (multicolumnAtom3.getSkipped() - 1) + i16;
                        horizontalBox.add(boxGenerateMulticolumn);
                        zHasRightVline = multicolumnAtom3.hasRightVline();
                        i13 = skipped2;
                    }
                    if (zHasRightVline) {
                        i2 = i13 + 1;
                        if (this.vlines.get(Integer.valueOf(i2)) != null) {
                            VlineAtom vlineAtom2 = this.vlines.get(Integer.valueOf(i2));
                            vlineAtom2.setHeight(fArr2[i12] + fArr[i12] + boxCreateBox2.getHeight());
                            vlineAtom2.setShift(fArr[i12] + (boxCreateBox2.getHeight() / 2.0f));
                            boxCreateBox = vlineAtom2.createBox(teXEnvironment2);
                            if (i13 < i5 - 1) {
                                horizontalBox.add(new HorizontalBox(boxCreateBox, columnSep[i2].getWidth() + boxCreateBox.getWidth(), 2));
                            } else {
                                horizontalBox.add(new HorizontalBox(boxCreateBox, columnSep[i2].getWidth() + boxCreateBox.getWidth(), 1));
                            }
                        } else {
                            horizontalBox.add(columnSep[i13 + 1]);
                        }
                    } else {
                        horizontalBox.add(columnSep[i13 + 1]);
                    }
                    horizontalBox2 = horizontalBox;
                    i = 1;
                } else {
                    switch (i15) {
                        case 11:
                            f = width2;
                            float textwidth = teXEnvironment2.getTextwidth();
                            if (textwidth == Float.POSITIVE_INFINITY) {
                                textwidth = fArr3[i13];
                            }
                            HorizontalBox horizontalBox3 = new HorizontalBox(boxArr[i12][i13], textwidth, 0);
                            i13 = i5 - 1;
                            horizontalBox2 = horizontalBox3;
                            num = num;
                            i = 1;
                            teXEnvironment2 = teXEnvironment2;
                            break;
                        case 12:
                            f = width2;
                            if (i13 != 0) {
                                if (this.vlines.get(num) != null) {
                                    VlineAtom vlineAtom3 = this.vlines.get(num);
                                    vlineAtom3.setHeight(fArr2[i12] + fArr[i12] + boxCreateBox2.getHeight());
                                    vlineAtom3.setShift(fArr[i12] + (boxCreateBox2.getHeight() / 2.0f));
                                    Box boxCreateBox4 = vlineAtom3.createBox(teXEnvironment2);
                                    horizontalBox2.add(new HorizontalBox(boxCreateBox4, columnSep[0].getWidth() + boxCreateBox4.getWidth(), 0));
                                } else {
                                    horizontalBox2.add(columnSep[0]);
                                }
                            }
                            if (boxArr[i12][i13].type == -1) {
                                horizontalBox2.add(new HorizontalBox(boxArr[i12][i13], fArr3[i13], this.position[i13]));
                                horizontalBox = horizontalBox2;
                                i12 = i12;
                                zHasRightVline = true;
                            } else {
                                int i17 = i13;
                                horizontalBox = horizontalBox2;
                                i12 = i12;
                                Box boxGenerateMulticolumn2 = generateMulticolumn(teXEnvironment2, columnSep, fArr3, i12, i17);
                                MulticolumnAtom multicolumnAtom4 = (MulticolumnAtom) this.matrix.array.get(i12).get(i17);
                                int skipped3 = (multicolumnAtom4.getSkipped() - 1) + i17;
                                horizontalBox.add(boxGenerateMulticolumn2);
                                zHasRightVline = multicolumnAtom4.hasRightVline();
                                i13 = skipped3;
                            }
                            if (zHasRightVline) {
                                i2 = i13 + 1;
                                if (this.vlines.get(Integer.valueOf(i2)) != null) {
                                    VlineAtom vlineAtom4 = this.vlines.get(Integer.valueOf(i2));
                                    vlineAtom4.setHeight(fArr2[i12] + fArr[i12] + boxCreateBox2.getHeight());
                                    vlineAtom4.setShift(fArr[i12] + (boxCreateBox2.getHeight() / 2.0f));
                                    boxCreateBox = vlineAtom4.createBox(teXEnvironment2);
                                    if (i13 < i5 - 1) {
                                        horizontalBox.add(new HorizontalBox(boxCreateBox, columnSep[i2].getWidth() + boxCreateBox.getWidth(), 2));
                                    } else {
                                        horizontalBox.add(new HorizontalBox(boxCreateBox, columnSep[i2].getWidth() + boxCreateBox.getWidth(), 1));
                                    }
                                } else {
                                    horizontalBox.add(columnSep[i13 + 1]);
                                }
                            } else {
                                horizontalBox.add(columnSep[i13 + 1]);
                            }
                            horizontalBox2 = horizontalBox;
                            i = 1;
                            break;
                        case 13:
                            HlineAtom hlineAtom = (HlineAtom) this.matrix.array.get(i12).get(i13);
                            hlineAtom.setWidth(width2);
                            if (i12 >= 1) {
                                f = width2;
                                if (this.matrix.array.get(i12 - 1).get(i13) instanceof HlineAtom) {
                                    horizontalBox2.add(new StrutBox(0.0f, defaultRuleThickness * 2.0f, 0.0f, 0.0f));
                                    hlineAtom.setShift(((-boxCreateBox2.getHeight()) / 2.0f) + defaultRuleThickness);
                                }
                                horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                                i13 = i5;
                                num = num;
                                i = 1;
                                teXEnvironment2 = teXEnvironment2;
                            } else {
                                f = width2;
                            }
                            hlineAtom.setShift((-boxCreateBox2.getHeight()) / 2.0f);
                            horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                            i13 = i5;
                            num = num;
                            i = 1;
                            teXEnvironment2 = teXEnvironment2;
                            break;
                        default:
                            f = width2;
                            num = num;
                            i = 1;
                            teXEnvironment2 = teXEnvironment2;
                            break;
                    }
                }
                i13 += i;
                i12 = i12;
                teXEnvironment2 = teXEnvironment2;
                verticalBox2 = verticalBox3;
                i4 = i14;
                width2 = f;
                num = num;
                boxCreateBox2 = boxCreateBox2;
                fArr3 = fArr3;
            }
            Box box2 = boxCreateBox2;
            float[] fArr4 = fArr3;
            int i18 = i4;
            float f4 = width2;
            VerticalBox verticalBox4 = verticalBox2;
            Integer num2 = num;
            HorizontalBox horizontalBox4 = horizontalBox2;
            int i19 = i12;
            TeXEnvironment teXEnvironment3 = teXEnvironment2;
            if (boxArr[i19][0].type != 13) {
                horizontalBox4.setHeight(fArr2[i19]);
                horizontalBox4.setDepth(fArr[i19]);
                verticalBox = verticalBox4;
                verticalBox.add(horizontalBox4);
                boxCreateBox2 = box2;
                if (i19 < i18 - 1) {
                    verticalBox.add(boxCreateBox2);
                }
            } else {
                verticalBox = verticalBox4;
                boxCreateBox2 = box2;
                verticalBox.add(horizontalBox4);
            }
            int i20 = i19 + 1;
            verticalBox2 = verticalBox;
            i12 = i20;
            teXEnvironment2 = teXEnvironment3;
            i4 = i18;
            width2 = f4;
            num = num2;
            fArr3 = fArr4;
        }
        TeXEnvironment teXEnvironment4 = teXEnvironment2;
        VerticalBox verticalBox5 = verticalBox2;
        verticalBox5.add(vsep_ext_bot.createBox(teXEnvironment4));
        float height = verticalBox5.getHeight() + verticalBox5.getDepth();
        float axisHeight = teXEnvironment4.getTeXFont().getAxisHeight(teXEnvironment4.getStyle());
        float f5 = height / 2.0f;
        verticalBox5.setHeight(f5 + axisHeight);
        verticalBox5.setDepth(f5 - axisHeight);
        return verticalBox5;
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
