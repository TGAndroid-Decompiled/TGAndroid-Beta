package defpackage;

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
import org.telegram.messenger.a;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
public abstract class neb {
    public static final double[] a = new double[128];
    public static final Pattern b;

    static {
        int i = 0;
        while (true) {
            double[] dArr = a;
            if (i < 128) {
                dArr[i] = Math.pow(10.0d, i);
                i++;
            } else {
                b = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            }
        }
    }

    public static String a(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder(bArr.length << 1);
            sb.append('M');
            for (byte b2 : bArr) {
                int i = b2 & 255;
                if (i >= 192) {
                    sb.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i - 192));
                } else {
                    if (i >= 128) {
                        sb.append(',');
                    } else if (i >= 64) {
                        sb.append('-');
                    }
                    sb.append(b2 & 63);
                }
            }
            sb.append('z');
            return sb.toString();
        } catch (Exception e) {
            fc4.g(e, true);
            return "";
        }
    }

    public static android.graphics.Path b(java.lang.String r50) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.neb.b(java.lang.String):android.graphics.Path");
    }

    public static Bitmap c(float f, int i, int i2, int i3, int i4, int i5) {
        try {
            InputStream openRawResource = a.b.getResources().openRawResource(i);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            keb kebVar = new keb(i2, i3, Integer.valueOf(i4), false, f, i5);
            xMLReader.setContentHandler(kebVar);
            xMLReader.parse(new InputSource(openRawResource));
            Bitmap bitmap = kebVar.b;
            if (openRawResource != null) {
                openRawResource.close();
            }
            return bitmap;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static Bitmap d(int i, int i2, int i3, int i4) {
        return c(1.0f, i, i2, i3, i4, 1);
    }

    public static Bitmap e(int i, int i2, String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            keb kebVar = new keb(i, i2, null, false);
            xMLReader.setContentHandler(kebVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return kebVar.b;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static Bitmap f(FilterInputStream filterInputStream, int i, int i2) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            keb kebVar = new keb(i, i2, null, false);
            xMLReader.setContentHandler(kebVar);
            xMLReader.parse(new InputSource(filterInputStream));
            return kebVar.b;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static meb g(int i, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            keb kebVar = new keb(0, 0, num, true);
            xMLReader.setContentHandler(kebVar);
            xMLReader.parse(new InputSource(a.b.getResources().openRawResource(i)));
            return kebVar.c;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static meb h(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            keb kebVar = new keb(0, 0, null, true);
            xMLReader.setContentHandler(kebVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return kebVar.c;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static meb i(int i, int i2, Path path) {
        try {
            meb mebVar = new meb();
            mebVar.a.add(path);
            mebVar.b.put(path, new Paint(1));
            mebVar.e = i;
            mebVar.f = i2;
            return mebVar;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static Float j(String str, Attributes attributes) {
        String k = k(str, attributes);
        if (k == null) {
            return null;
        }
        if (k.endsWith("px")) {
            k = ts2.m(2, 0, k);
        } else if (k.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(k));
    }

    public static String k(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public static keb l(File file, int i, int i2, boolean z) {
        Integer num;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            if (z) {
                num = -1;
            } else {
                num = null;
            }
            keb kebVar = new keb(i, i2, num, false);
            if (!z) {
                kebVar.F = true;
            }
            xMLReader.setContentHandler(kebVar);
            xMLReader.parse(new InputSource(fileInputStream));
            fileInputStream.close();
            return kebVar;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static jk4 m(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 1; i2 < length; i2++) {
            if (z) {
                z = false;
            } else {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (charAt == '-' && str.charAt(i2 - 1) == 'e') {
                            break;
                        } else {
                            String substring = str.substring(i, i2);
                            if (substring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                                if (charAt == '-') {
                                    i = i2;
                                    break;
                                } else {
                                    i = i2 + 1;
                                    z = true;
                                    break;
                                }
                            } else {
                                i++;
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
                        String substring2 = str.substring(i, i2);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new jk4(arrayList);
                }
            }
        }
        String substring3 = str.substring(i);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
        }
        return new jk4(arrayList);
    }

    public static Matrix n(String str) {
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
                String[] split = b.split(trim);
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
            float f = 0.0f;
            if (str3.startsWith("matrix(")) {
                ArrayList arrayList2 = m(str3.substring(7)).a;
                if (arrayList2.size() == 6) {
                    matrix = new Matrix();
                    matrix.setValues(new float[]{((Float) arrayList2.get(0)).floatValue(), ((Float) arrayList2.get(2)).floatValue(), ((Float) arrayList2.get(4)).floatValue(), ((Float) arrayList2.get(1)).floatValue(), ((Float) arrayList2.get(3)).floatValue(), ((Float) arrayList2.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                }
                matrix = null;
            } else if (str3.startsWith("translate(")) {
                ArrayList arrayList3 = m(str3.substring(10)).a;
                if (arrayList3.size() > 0) {
                    float floatValue = ((Float) arrayList3.get(0)).floatValue();
                    if (arrayList3.size() > 1) {
                        f = ((Float) arrayList3.get(1)).floatValue();
                    }
                    matrix2 = new Matrix();
                    matrix2.postTranslate(floatValue, f);
                    matrix = matrix2;
                }
                matrix = null;
            } else {
                if (str3.startsWith("scale(")) {
                    ArrayList arrayList4 = m(str3.substring(6)).a;
                    if (arrayList4.size() > 0) {
                        float floatValue2 = ((Float) arrayList4.get(0)).floatValue();
                        if (arrayList4.size() > 1) {
                            f = ((Float) arrayList4.get(1)).floatValue();
                        }
                        matrix2 = new Matrix();
                        matrix2.postScale(floatValue2, f);
                        matrix = matrix2;
                    }
                } else if (str3.startsWith("skewX(")) {
                    ArrayList arrayList5 = m(str3.substring(6)).a;
                    if (arrayList5.size() > 0) {
                        float floatValue3 = ((Float) arrayList5.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew((float) Math.tan(floatValue3), 0.0f);
                    }
                } else if (str3.startsWith("skewY(")) {
                    ArrayList arrayList6 = m(str3.substring(6)).a;
                    if (arrayList6.size() > 0) {
                        float floatValue4 = ((Float) arrayList6.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew(0.0f, (float) Math.tan(floatValue4));
                    }
                } else if (str3.startsWith("rotate(")) {
                    ArrayList arrayList7 = m(str3.substring(7)).a;
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
