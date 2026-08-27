package a5;

import android.text.TextUtils;
import d5.g0;
import d5.z;
import h3.t1;
import h7.d0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l extends r4.f {

    public final z f95b;

    public final c f96c;

    public l() {
        super("WebvttDecoder");
        this.f95b = new z();
        this.f96c = new c();
    }

    @Override
    public final r4.g c(int i10, boolean z10, byte[] bArr) throws r4.i {
        e eVarD;
        String strTrim;
        String str;
        String string;
        Matcher matcher;
        String strGroup;
        byte b10;
        int i11;
        boolean z11;
        String strSubstring;
        l lVar = this;
        z zVar = lVar.f95b;
        zVar.A(i10, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            m.d(zVar);
            while (!TextUtils.isEmpty(zVar.f(o8.d.f19363c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ?? r10 = 0;
                int i12 = -1;
                byte b11 = -1;
                int i13 = 0;
                while (true) {
                    int i14 = 1;
                    if (b11 == -1) {
                        i13 = zVar.f4859b;
                        String strF = zVar.f(o8.d.f19363c);
                        if (strF == null) {
                            b11 = 0;
                        } else if ("STYLE".equals(strF)) {
                            b11 = 2;
                        } else {
                            b11 = strF.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        zVar.C(i13);
                        if (b11 == 0) {
                            return new n(arrayList2);
                        }
                        if (b11 == 1) {
                            while (!TextUtils.isEmpty(zVar.f(o8.d.f19363c))) {
                            }
                        } else {
                            String str2 = null;
                            if (b11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new r4.i("A style block was found after the first cue.");
                                }
                                zVar.f(o8.d.f19363c);
                                c cVar = lVar.f96c;
                                z zVar2 = cVar.f54a;
                                StringBuilder sb2 = cVar.f55b;
                                sb2.setLength(0);
                                int i15 = zVar.f4859b;
                                while (!TextUtils.isEmpty(zVar.f(o8.d.f19363c))) {
                                }
                                zVar2.A(zVar.f4859b, zVar.f4858a);
                                zVar2.C(i15);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    c.c(zVar2);
                                    if (zVar2.a() >= 5 && "::cue".equals(zVar2.p(5, o8.d.f19363c))) {
                                        int i16 = zVar2.f4859b;
                                        String strB = c.b(zVar2, sb2);
                                        if (strB == null) {
                                            str = str2;
                                        } else if ("{".equals(strB)) {
                                            zVar2.C(i16);
                                            str = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i17 = zVar2.f4859b;
                                                int i18 = zVar2.f4860c;
                                                boolean z12 = false;
                                                while (i17 < i18 && !z12) {
                                                    int i19 = i17 + 1;
                                                    z12 = ((char) zVar2.f4858a[i17]) == ')';
                                                    i17 = i19;
                                                }
                                                strTrim = zVar2.p((i17 - 1) - zVar2.f4859b, o8.d.f19363c).trim();
                                            } else {
                                                strTrim = str2;
                                            }
                                            str = strTrim;
                                            if (!")".equals(c.b(zVar2, sb2))) {
                                                str = str2;
                                            }
                                        }
                                    } else {
                                        str = str2;
                                    }
                                    if (str != 0 && "{".equals(c.b(zVar2, sb2))) {
                                        d dVar = new d();
                                        dVar.f56a = "";
                                        dVar.f57b = "";
                                        dVar.f58c = Collections.EMPTY_SET;
                                        dVar.d = "";
                                        dVar.f59e = str2;
                                        dVar.f61g = r10;
                                        dVar.f62i = r10;
                                        dVar.f63j = i12;
                                        dVar.f64k = i12;
                                        dVar.f65l = i12;
                                        dVar.f66m = i12;
                                        dVar.f67n = i12;
                                        dVar.f69p = i12;
                                        dVar.f70q = r10;
                                        if (!"".equals(str)) {
                                            int iIndexOf = str.indexOf(91);
                                            if (iIndexOf != i12) {
                                                Matcher matcher2 = c.f53c.matcher(str.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    strSubstring = str;
                                                    String strGroup2 = matcher2.group(i14);
                                                    strGroup2.getClass();
                                                    dVar.d = strGroup2;
                                                }
                                                strSubstring = str;
                                                strSubstring = str.substring(r10, iIndexOf);
                                            }
                                            strSubstring = str;
                                            int i20 = g0.f4795a;
                                            String[] strArrSplit = strSubstring.split("\\.", i12);
                                            String str3 = strArrSplit[r10];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i12) {
                                                dVar.f57b = str3.substring(r10, iIndexOf2);
                                                dVar.f56a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                dVar.f57b = str3;
                                            }
                                            if (strArrSplit.length > i14) {
                                                int length = strArrSplit.length;
                                                d5.a.f(length <= strArrSplit.length);
                                                dVar.f58c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i14, length)));
                                            }
                                        }
                                        boolean z13 = false;
                                        String strB2 = null;
                                        while (!z13) {
                                            int i21 = zVar2.f4859b;
                                            strB2 = c.b(zVar2, sb2);
                                            boolean z14 = strB2 == null || "}".equals(strB2);
                                            if (!z14) {
                                                zVar2.C(i21);
                                                c.c(zVar2);
                                                String strA = c.a(zVar2, sb2);
                                                if (!"".equals(strA) && ":".equals(c.b(zVar2, sb2))) {
                                                    c.c(zVar2);
                                                    StringBuilder sb3 = new StringBuilder();
                                                    boolean z15 = false;
                                                    while (true) {
                                                        if (z15) {
                                                            string = sb3.toString();
                                                        } else {
                                                            int i22 = zVar2.f4859b;
                                                            boolean z16 = z15;
                                                            String strB3 = c.b(zVar2, sb2);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                zVar2.C(i22);
                                                                z15 = true;
                                                            } else {
                                                                sb3.append(strB3);
                                                                z15 = z16;
                                                            }
                                                        }
                                                    }
                                                    if (string != null && !"".equals(string)) {
                                                        int i23 = zVar2.f4859b;
                                                        String strB4 = c.b(zVar2, sb2);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                dVar.f60f = d5.b.a(string, true);
                                                                dVar.f61g = true;
                                                            } else if ("background-color".equals(strA)) {
                                                                dVar.h = d5.b.a(string, true);
                                                                dVar.f62i = true;
                                                            } else if ("ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    dVar.f69p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    dVar.f69p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string)) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = true;
                                                                }
                                                                dVar.f70q = z11;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if ("underline".equals(string)) {
                                                                    dVar.f64k = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                dVar.f59e = d0.b(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                if ("bold".equals(string)) {
                                                                    dVar.f65l = 1;
                                                                }
                                                            } else if ("font-style".equals(strA)) {
                                                                if ("italic".equals(string)) {
                                                                    dVar.f66m = 1;
                                                                }
                                                            } else if ("font-size".equals(strA)) {
                                                                matcher = c.d.matcher(d0.b(string));
                                                                if (matcher.matches()) {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case 37:
                                                                            if (!strGroup.equals("%")) {
                                                                                b10 = 0;
                                                                            }
                                                                            switch (b10) {
                                                                                case 0:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup3 = matcher.group(i11);
                                                                            strGroup3.getClass();
                                                                            dVar.f68o = Float.parseFloat(strGroup3);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b10 = 1;
                                                                            }
                                                                            switch (b10) {
                                                                                case 0:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup4 = matcher.group(i11);
                                                                            strGroup4.getClass();
                                                                            dVar.f68o = Float.parseFloat(strGroup4);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b10 = 2;
                                                                            }
                                                                            switch (b10) {
                                                                                case 0:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup5 = matcher.group(i11);
                                                                            strGroup5.getClass();
                                                                            dVar.f68o = Float.parseFloat(strGroup5);
                                                                            break;
                                                                    }
                                                                    b10 = -1;
                                                                    switch (b10) {
                                                                        case 0:
                                                                            i11 = 1;
                                                                            dVar.f67n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i11 = 1;
                                                                            dVar.f67n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i11 = 1;
                                                                            dVar.f67n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup6 = matcher.group(i11);
                                                                    strGroup6.getClass();
                                                                    dVar.f68o = Float.parseFloat(strGroup6);
                                                                } else {
                                                                    d5.a.K("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                }
                                                            }
                                                        } else if ("}".equals(strB4)) {
                                                            zVar2.C(i23);
                                                            if ("color".equals(strA)) {
                                                                dVar.f60f = d5.b.a(string, true);
                                                                dVar.f61g = true;
                                                            } else if ("background-color".equals(strA)) {
                                                                dVar.h = d5.b.a(string, true);
                                                                dVar.f62i = true;
                                                            } else if ("ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    dVar.f69p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    dVar.f69p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string) || string.startsWith("digits")) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                                dVar.f70q = z11;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if ("underline".equals(string)) {
                                                                    dVar.f64k = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                dVar.f59e = d0.b(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                if ("bold".equals(string)) {
                                                                    dVar.f65l = 1;
                                                                }
                                                            } else if ("font-style".equals(strA)) {
                                                                if ("italic".equals(string)) {
                                                                    dVar.f66m = 1;
                                                                }
                                                            } else if ("font-size".equals(strA)) {
                                                                matcher = c.d.matcher(d0.b(string));
                                                                if (matcher.matches()) {
                                                                    d5.a.K("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                } else {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case 37:
                                                                            if (!strGroup.equals("%")) {
                                                                                b10 = 0;
                                                                            }
                                                                            switch (b10) {
                                                                                case 0:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup7 = matcher.group(i11);
                                                                            strGroup7.getClass();
                                                                            dVar.f68o = Float.parseFloat(strGroup7);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b10 = 1;
                                                                            }
                                                                            switch (b10) {
                                                                                case 0:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup8 = matcher.group(i11);
                                                                            strGroup8.getClass();
                                                                            dVar.f68o = Float.parseFloat(strGroup8);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b10 = 2;
                                                                            }
                                                                            switch (b10) {
                                                                                case 0:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i11 = 1;
                                                                                    dVar.f67n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup9 = matcher.group(i11);
                                                                            strGroup9.getClass();
                                                                            dVar.f68o = Float.parseFloat(strGroup9);
                                                                            break;
                                                                    }
                                                                    b10 = -1;
                                                                    switch (b10) {
                                                                        case 0:
                                                                            i11 = 1;
                                                                            dVar.f67n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i11 = 1;
                                                                            dVar.f67n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i11 = 1;
                                                                            dVar.f67n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup10 = matcher.group(i11);
                                                                    strGroup10.getClass();
                                                                    dVar.f68o = Float.parseFloat(strGroup10);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z13 = z14;
                                        }
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(dVar);
                                        }
                                        r10 = 0;
                                        i12 = -1;
                                        str2 = null;
                                        i14 = 1;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b11 == 3) {
                                Pattern pattern = k.f92a;
                                Charset charset = o8.d.f19363c;
                                String strF2 = zVar.f(charset);
                                if (strF2 == null) {
                                    eVarD = null;
                                } else {
                                    Pattern pattern2 = k.f92a;
                                    Matcher matcher3 = pattern2.matcher(strF2);
                                    if (matcher3.matches()) {
                                        eVarD = k.d(null, matcher3, zVar, arrayList);
                                    } else {
                                        eVarD = null;
                                        String strF3 = zVar.f(charset);
                                        if (strF3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strF3);
                                            if (matcher4.matches()) {
                                                eVarD = k.d(strF2.trim(), matcher4, zVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (eVarD != null) {
                                    arrayList2.add(eVarD);
                                }
                            }
                            lVar = this;
                        }
                    }
                }
            }
        } catch (t1 e9) {
            throw new r4.i(e9);
        }
    }
}
