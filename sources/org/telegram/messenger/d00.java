package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
public abstract class d00 {
    public static final double[] f15134a = new double[128];
    public static final Pattern f15135b;

    static {
        int i10 = 0;
        while (true) {
            double[] dArr = f15134a;
            if (i10 < dArr.length) {
                dArr[i10] = Math.pow(10.0d, i10);
                i10++;
            } else {
                f15135b = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            }
        }
    }

    public static String a(byte[] bArr) {
        try {
            StringBuilder sb2 = new StringBuilder(bArr.length * 2);
            sb2.append('M');
            for (byte b10 : bArr) {
                int i10 = b10 & 255;
                if (i10 >= 192) {
                    sb2.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i10 - 192));
                } else {
                    if (i10 >= 128) {
                        sb2.append(',');
                    } else if (i10 >= 64) {
                        sb2.append('-');
                    }
                    sb2.append(b10 & 63);
                }
            }
            sb2.append('z');
            return sb2.toString();
        } catch (Exception e) {
            f8.g(e, true);
            return "";
        }
    }

    public static android.graphics.Path b(java.lang.String r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d00.b(java.lang.String):android.graphics.Path");
    }

    public static Bitmap c(float f7, int i10, int i11, int i12, int i13, int i14) {
        try {
            InputStream openRawResource = w0.f19025b.getResources().openRawResource(i10);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a00 a00Var = new a00(i11, i12, Integer.valueOf(i13), false, f7, i14);
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(openRawResource));
            Bitmap bitmap = a00Var.f14543b;
            if (openRawResource != null) {
                openRawResource.close();
            }
            return bitmap;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static Bitmap d(int i10, int i11, int i12, int i13) {
        return c(1.0f, i10, i11, i12, i13, 1);
    }

    public static Bitmap e(int i10, int i11, String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a00 a00Var = new a00(i10, i11, null, false);
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return a00Var.f14543b;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static Bitmap f(File file, int i10, int i11, int i12) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a00 a00Var = new a00(i10, i11, null, false, 1.0f, i12);
            a00Var.E = true;
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(fileInputStream));
            Bitmap bitmap = a00Var.f14543b;
            fileInputStream.close();
            return bitmap;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static Bitmap g(FilterInputStream filterInputStream, int i10, int i11) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a00 a00Var = new a00(i10, i11, null, false);
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(filterInputStream));
            return a00Var.f14543b;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static c00 h(int i10, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a00 a00Var = new a00(0, 0, num, true);
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(w0.f19025b.getResources().openRawResource(i10)));
            return a00Var.f14544c;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static c00 i(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a00 a00Var = new a00(0, 0, null, true);
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return a00Var.f14544c;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static c00 j(int i10, int i11, Path path) {
        try {
            c00 c00Var = new c00();
            c00Var.f14872a.add(path);
            c00Var.f14873b.put(path, new Paint(1));
            c00Var.e = i10;
            c00Var.f14875f = i11;
            return c00Var;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static Float k(String str, Attributes attributes) {
        String l4 = l(str, attributes);
        if (l4 == null) {
            return null;
        }
        if (l4.endsWith("px")) {
            l4 = c3.i0.m(2, 0, l4);
        } else if (l4.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(l4));
    }

    public static String l(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            if (attributes.getLocalName(i10).equals(str)) {
                return attributes.getValue(i10);
            }
        }
        return null;
    }

    public static a00 m(File file, int i10, int i11, boolean z10) {
        Integer num;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            if (z10) {
                num = -1;
            } else {
                num = null;
            }
            a00 a00Var = new a00(i10, i11, num, false);
            if (!z10) {
                a00Var.E = true;
            }
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(fileInputStream));
            fileInputStream.close();
            return a00Var;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static c5.k n(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 1; i11 < length; i11++) {
            if (z10) {
                z10 = false;
            } else {
                char charAt = str.charAt(i11);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (charAt == '-' && str.charAt(i11 - 1) == 'e') {
                            break;
                        } else {
                            String substring = str.substring(i10, i11);
                            if (substring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                                if (charAt == '-') {
                                    i10 = i11;
                                    break;
                                } else {
                                    i10 = i11 + 1;
                                    z10 = true;
                                    break;
                                }
                            } else {
                                i10++;
                                continue;
                            }
                        }
                    case ')':
                    case 'A':
                    case 'C':
                    case 'H':
                    case 'L':
                    case 'M':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'Z':
                    case 'a':
                    case 'c':
                    case 'h':
                    case 'l':
                    case 'm':
                    case 'q':
                    case 's':
                    case 't':
                    case 'v':
                    case 'z':
                        String substring2 = str.substring(i10, i11);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new c5.k(arrayList);
                }
            }
        }
        String substring3 = str.substring(i10);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
        }
        return new c5.k(arrayList);
    }

    public static Matrix o(String str) {
        List<String> list;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3 = new Matrix();
        if (str == null) {
            list = Collections.EMPTY_LIST;
        } else {
            String trim = str.trim();
            if (trim.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                String[] split = f15135b.split(trim);
                ArrayList arrayList = new ArrayList(split.length);
                for (String str2 : split) {
                    String trim2 = str2.trim();
                    if (!trim2.isEmpty()) {
                        arrayList.add(trim2);
                    }
                }
                list = arrayList;
            }
        }
        for (String str3 : list) {
            float f7 = 0.0f;
            if (str3.startsWith("matrix(")) {
                ArrayList arrayList2 = n(str3.substring(7)).f3796a;
                if (arrayList2.size() == 6) {
                    matrix = new Matrix();
                    matrix.setValues(new float[]{((Float) arrayList2.get(0)).floatValue(), ((Float) arrayList2.get(2)).floatValue(), ((Float) arrayList2.get(4)).floatValue(), ((Float) arrayList2.get(1)).floatValue(), ((Float) arrayList2.get(3)).floatValue(), ((Float) arrayList2.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                }
                matrix = null;
            } else if (str3.startsWith("translate(")) {
                ArrayList arrayList3 = n(str3.substring(10)).f3796a;
                if (arrayList3.size() > 0) {
                    float floatValue = ((Float) arrayList3.get(0)).floatValue();
                    if (arrayList3.size() > 1) {
                        f7 = ((Float) arrayList3.get(1)).floatValue();
                    }
                    matrix2 = new Matrix();
                    matrix2.postTranslate(floatValue, f7);
                    matrix = matrix2;
                }
                matrix = null;
            } else {
                if (str3.startsWith("scale(")) {
                    ArrayList arrayList4 = n(str3.substring(6)).f3796a;
                    if (arrayList4.size() > 0) {
                        float floatValue2 = ((Float) arrayList4.get(0)).floatValue();
                        if (arrayList4.size() > 1) {
                            f7 = ((Float) arrayList4.get(1)).floatValue();
                        }
                        matrix2 = new Matrix();
                        matrix2.postScale(floatValue2, f7);
                        matrix = matrix2;
                    }
                } else if (str3.startsWith("skewX(")) {
                    ArrayList arrayList5 = n(str3.substring(6)).f3796a;
                    if (arrayList5.size() > 0) {
                        float floatValue3 = ((Float) arrayList5.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew((float) Math.tan(floatValue3), 0.0f);
                    }
                } else if (str3.startsWith("skewY(")) {
                    ArrayList arrayList6 = n(str3.substring(6)).f3796a;
                    if (arrayList6.size() > 0) {
                        float floatValue4 = ((Float) arrayList6.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew(0.0f, (float) Math.tan(floatValue4));
                    }
                } else if (str3.startsWith("rotate(")) {
                    ArrayList arrayList7 = n(str3.substring(7)).f3796a;
                    if (arrayList7.size() > 0) {
                        matrix = new Matrix();
                        float floatValue5 = ((Float) arrayList7.get(0)).floatValue();
                        if (arrayList7.size() > 2) {
                            matrix.postRotate(floatValue5, ((Float) arrayList7.get(1)).floatValue(), ((Float) arrayList7.get(2)).floatValue());
                        } else {
                            matrix.postRotate(floatValue5);
                        }
                    }
                }
                matrix = null;
            }
            if (matrix != null) {
                matrix3.preConcat(matrix);
            }
        }
        return matrix3;
    }
}
