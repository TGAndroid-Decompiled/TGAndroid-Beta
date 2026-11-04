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
public abstract class kz {
    public static final double[] f23914a = new double[128];
    public static final Pattern f23915b;

    static {
        int i3 = 0;
        while (true) {
            double[] dArr = f23914a;
            if (i3 < dArr.length) {
                dArr[i3] = Math.pow(10.0d, i3);
                i3++;
            } else {
                f23915b = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            }
        }
    }

    public static String a(byte[] bArr) {
        try {
            StringBuilder sb2 = new StringBuilder(bArr.length * 2);
            sb2.append('M');
            for (byte b10 : bArr) {
                int i3 = b10 & 255;
                if (i3 >= 192) {
                    sb2.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i3 - 192));
                } else {
                    if (i3 >= 128) {
                        sb2.append(',');
                    } else if (i3 >= 64) {
                        sb2.append('-');
                    }
                    sb2.append(b10 & 63);
                }
            }
            sb2.append('z');
            return sb2.toString();
        } catch (Exception e10) {
            a8.g(e10, true);
            return "";
        }
    }

    public static android.graphics.Path b(java.lang.String r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kz.b(java.lang.String):android.graphics.Path");
    }

    public static Bitmap c(float f10, int i3, int i10, int i11, int i12, int i13) {
        try {
            InputStream openRawResource = t0.f25457b.getResources().openRawResource(i3);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            hz hzVar = new hz(i10, i11, Integer.valueOf(i12), false, f10, i13);
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(openRawResource));
            Bitmap bitmap = hzVar.f23400b;
            if (openRawResource != null) {
                openRawResource.close();
            }
            return bitmap;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static Bitmap d(int i3, int i10, int i11, int i12) {
        return c(1.0f, i3, i10, i11, i12, 1);
    }

    public static Bitmap e(int i3, int i10, String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            hz hzVar = new hz(i3, i10, null, false);
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return hzVar.f23400b;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static Bitmap f(File file, int i3, int i10, int i11) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            hz hzVar = new hz(i3, i10, null, false, 1.0f, i11);
            hzVar.F = true;
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(fileInputStream));
            Bitmap bitmap = hzVar.f23400b;
            fileInputStream.close();
            return bitmap;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static Bitmap g(FilterInputStream filterInputStream, int i3, int i10) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            hz hzVar = new hz(i3, i10, null, false);
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(filterInputStream));
            return hzVar.f23400b;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static jz h(int i3, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            hz hzVar = new hz(0, 0, num, true);
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(t0.f25457b.getResources().openRawResource(i3)));
            return hzVar.f23401c;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static jz i(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            hz hzVar = new hz(0, 0, null, true);
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return hzVar.f23401c;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static jz j(int i3, int i10, Path path) {
        try {
            jz jzVar = new jz();
            jzVar.f23760a.add(path);
            jzVar.f23761b.put(path, new Paint(1));
            jzVar.f23763e = i3;
            jzVar.f23764f = i10;
            return jzVar;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static Float k(String str, Attributes attributes) {
        String l10 = l(str, attributes);
        if (l10 == null) {
            return null;
        }
        if (l10.endsWith("px")) {
            l10 = com.google.android.recaptcha.internal.a.j(l10, 2, 0);
        } else if (l10.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(l10));
    }

    public static String l(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i3 = 0; i3 < length; i3++) {
            if (attributes.getLocalName(i3).equals(str)) {
                return attributes.getValue(i3);
            }
        }
        return null;
    }

    public static hz m(File file, int i3, int i10, boolean z10) {
        Integer num;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            if (z10) {
                num = -1;
            } else {
                num = null;
            }
            hz hzVar = new hz(i3, i10, num, false);
            if (!z10) {
                hzVar.F = true;
            }
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(fileInputStream));
            fileInputStream.close();
            return hzVar;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static mi.z3 n(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        boolean z10 = false;
        for (int i10 = 1; i10 < length; i10++) {
            if (z10) {
                z10 = false;
            } else {
                char charAt = str.charAt(i10);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (charAt == '-' && str.charAt(i10 - 1) == 'e') {
                            break;
                        } else {
                            String substring = str.substring(i3, i10);
                            if (substring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                                if (charAt == '-') {
                                    i3 = i10;
                                    break;
                                } else {
                                    i3 = i10 + 1;
                                    z10 = true;
                                    break;
                                }
                            } else {
                                i3++;
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
                        String substring2 = str.substring(i3, i10);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new mi.z3(arrayList);
                }
            }
        }
        String substring3 = str.substring(i3);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
        }
        return new mi.z3(arrayList);
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
                String[] split = f23915b.split(trim);
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
            float f10 = 0.0f;
            if (str3.startsWith("matrix(")) {
                ArrayList arrayList2 = n(str3.substring(7)).f20086a;
                if (arrayList2.size() == 6) {
                    matrix = new Matrix();
                    matrix.setValues(new float[]{((Float) arrayList2.get(0)).floatValue(), ((Float) arrayList2.get(2)).floatValue(), ((Float) arrayList2.get(4)).floatValue(), ((Float) arrayList2.get(1)).floatValue(), ((Float) arrayList2.get(3)).floatValue(), ((Float) arrayList2.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                }
                matrix = null;
            } else if (str3.startsWith("translate(")) {
                ArrayList arrayList3 = n(str3.substring(10)).f20086a;
                if (arrayList3.size() > 0) {
                    float floatValue = ((Float) arrayList3.get(0)).floatValue();
                    if (arrayList3.size() > 1) {
                        f10 = ((Float) arrayList3.get(1)).floatValue();
                    }
                    matrix2 = new Matrix();
                    matrix2.postTranslate(floatValue, f10);
                    matrix = matrix2;
                }
                matrix = null;
            } else {
                if (str3.startsWith("scale(")) {
                    ArrayList arrayList4 = n(str3.substring(6)).f20086a;
                    if (arrayList4.size() > 0) {
                        float floatValue2 = ((Float) arrayList4.get(0)).floatValue();
                        if (arrayList4.size() > 1) {
                            f10 = ((Float) arrayList4.get(1)).floatValue();
                        }
                        matrix2 = new Matrix();
                        matrix2.postScale(floatValue2, f10);
                        matrix = matrix2;
                    }
                } else if (str3.startsWith("skewX(")) {
                    ArrayList arrayList5 = n(str3.substring(6)).f20086a;
                    if (arrayList5.size() > 0) {
                        float floatValue3 = ((Float) arrayList5.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew((float) Math.tan(floatValue3), 0.0f);
                    }
                } else if (str3.startsWith("skewY(")) {
                    ArrayList arrayList6 = n(str3.substring(6)).f20086a;
                    if (arrayList6.size() > 0) {
                        float floatValue4 = ((Float) arrayList6.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew(0.0f, (float) Math.tan(floatValue4));
                    }
                } else if (str3.startsWith("rotate(")) {
                    ArrayList arrayList7 = n(str3.substring(7)).f20086a;
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
