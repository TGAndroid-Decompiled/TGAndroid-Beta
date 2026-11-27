package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
public final class xe8 {
    public static final Pattern e = Pattern.compile("^(?:([A-Za-z0-9_-]{1,24})\\.lproj/)?(icon|logo|strip|thumbnail|background|footer)(@[23]x)?\\.png$");
    public static final Pattern f = Pattern.compile("^([A-Za-z0-9_-]{1,24})\\.lproj/pass\\.strings$");
    public static final Pattern g = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})(?:[T ](\\d{2}):(\\d{2})(?::(\\d{2}))?(?:\\.\\d{1,9})?)?\\s*(Z|[+-]\\d{2}(?::?\\d{2})?)?$");
    public static final Pattern h = Pattern.compile("^rgba?\\(\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*(?:,\\s*[0-9.]+\\s*)?\\)$");
    public final String a;
    public final float b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public xe8(String str, float f2) {
        String lowerCase;
        if (str == null) {
            lowerCase = "en";
        } else {
            lowerCase = str.toLowerCase(Locale.ROOT);
        }
        this.a = lowerCase;
        this.b = f2;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() > 512) {
            return str.substring(0, 512);
        }
        return str;
    }

    public static qe8 e(File file, String str, float f2) {
        int i;
        int i2;
        int i3;
        JSONObject jSONObject;
        int i4;
        int i5;
        bf0 bf0Var;
        l3d l3dVar;
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        if (file.isFile()) {
            if (file.length() <= 2097152) {
                xe8 xe8Var = new xe8(str, f2);
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    xe8Var.h(bufferedInputStream);
                    bufferedInputStream.close();
                    HashMap hashMap = xe8Var.c;
                    byte[] bArr = (byte[]) hashMap.get("pass.json");
                    if (bArr != null) {
                        Iterator it = hashMap.keySet().iterator();
                        String str3 = null;
                        int i10 = Integer.MAX_VALUE;
                        String str4 = null;
                        while (true) {
                            i = 0;
                            i2 = 1;
                            if (!it.hasNext()) {
                                break;
                            }
                            String str5 = (String) it.next();
                            Matcher matcher = f.matcher(str5);
                            if (matcher.matches()) {
                                String replace = matcher.group(1).toLowerCase(Locale.ROOT).replace('_', '-');
                                String str6 = xe8Var.a;
                                if (!replace.equals(str6)) {
                                    if (replace.startsWith(str6 + "-")) {
                                        i = 1;
                                    } else if (replace.equals("en")) {
                                        i = 2;
                                    } else if (replace.startsWith("en-")) {
                                        i = 3;
                                    } else {
                                        i = 4;
                                    }
                                }
                                if (i < i10) {
                                    str4 = str5;
                                    i10 = i;
                                }
                            }
                        }
                        int i11 = 2048;
                        if (str4 != null) {
                            byte[] bArr2 = (byte[]) hashMap.get(str4);
                            if (bArr2.length >= 2 && (bArr2[0] & 255) == 255 && (bArr2[1] & 255) == 254) {
                                str2 = new String(bArr2, 2, bArr2.length - 2, Charset.forName("UTF-16LE"));
                            } else if (bArr2.length >= 2 && (bArr2[0] & 255) == 254 && (bArr2[1] & 255) == 255) {
                                str2 = new String(bArr2, 2, bArr2.length - 2, Charset.forName("UTF-16BE"));
                            } else if (bArr2.length >= 2 && bArr2[1] == 0) {
                                str2 = new String(bArr2, Charset.forName("UTF-16LE"));
                            } else if (bArr2.length >= 2 && bArr2[0] == 0) {
                                str2 = new String(bArr2, Charset.forName("UTF-16BE"));
                            } else {
                                str2 = new String(bArr2, StandardCharsets.UTF_8);
                                if (str2.length() > 0 && str2.charAt(0) == 65279) {
                                    str2 = str2.substring(1);
                                }
                            }
                            int length = str2.length();
                            StringBuilder sb = new StringBuilder();
                            StringBuilder sb2 = new StringBuilder();
                            int i12 = 0;
                            while (i12 < length) {
                                HashMap hashMap2 = xe8Var.d;
                                if (hashMap2.size() < i11) {
                                    char charAt = str2.charAt(i12);
                                    if (charAt == '/' && (i9 = i12 + 1) < length && str2.charAt(i9) == '*') {
                                        int indexOf = str2.indexOf("*/", i12 + 2);
                                        if (indexOf >= 0) {
                                            i7 = indexOf + 2;
                                            i12 = i7;
                                        }
                                    } else if (charAt == '/' && (i8 = i12 + 1) < length && str2.charAt(i8) == '/') {
                                        int indexOf2 = str2.indexOf(10, i12 + 2);
                                        if (indexOf2 >= 0) {
                                            i7 = indexOf2 + 1;
                                            i12 = i7;
                                        }
                                    } else if (charAt == '\"') {
                                        int i13 = i(i12, 4096, str2, sb);
                                        if (i13 >= 0) {
                                            i12 = i13;
                                            while (i12 < str2.length() && Character.isWhitespace(str2.charAt(i12))) {
                                                i12++;
                                            }
                                            if (i12 < length && str2.charAt(i12) == '=') {
                                                do {
                                                    i12++;
                                                    if (i12 >= str2.length()) {
                                                        break;
                                                    }
                                                } while (Character.isWhitespace(str2.charAt(i12)));
                                                if (i12 < length && str2.charAt(i12) == '\"') {
                                                    i7 = i(i12, 8192, str2, sb2);
                                                    if (i7 >= 0) {
                                                        hashMap2.put(sb.toString(), sb2.toString());
                                                        i12 = i7;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i12++;
                                    }
                                    i11 = 2048;
                                }
                            }
                        }
                        try {
                            JSONObject g2 = g(bArr);
                            ?? obj = new Object();
                            byte[] bArr3 = (byte[]) hashMap.get("manifest.json");
                            if (bArr3 != null) {
                                try {
                                    JSONObject g3 = g(bArr3);
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                                    for (Map.Entry entry : hashMap.entrySet()) {
                                        if (!"manifest.json".equals(entry.getKey())) {
                                            String optString = g3.optString((String) entry.getKey(), str3);
                                            if (optString == null) {
                                                break;
                                            }
                                            messageDigest.reset();
                                            byte[] digest = messageDigest.digest((byte[]) entry.getValue());
                                            StringBuilder sb3 = new StringBuilder(digest.length << i2);
                                            for (byte b : digest) {
                                                sb3.append(Character.forDigit((b >> 4) & 15, 16));
                                                sb3.append(Character.forDigit(b & 15, 16));
                                            }
                                            if (!optString.equalsIgnoreCase(sb3.toString())) {
                                                break;
                                            }
                                            str3 = null;
                                            i2 = 1;
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            xe8Var.j("organizationName", g2);
                            xe8Var.j("description", g2);
                            obj.e = xe8Var.j("logoText", g2);
                            g2.optBoolean("voided", false);
                            obj.b = f(-1, g2.optString("backgroundColor", null));
                            obj.c = f(-16777216, g2.optString("foregroundColor", null));
                            obj.d = f((obj.c & 16777215) | (-1728053248), g2.optString("labelColor", null));
                            String[] strArr = {"boardingPass", "eventTicket", "coupon", "storeCard", "generic"};
                            int[] iArr = {1, 2, 3, 4, 0};
                            int i14 = 0;
                            JSONObject jSONObject2 = null;
                            while (true) {
                                if (i14 >= 5) {
                                    break;
                                }
                                jSONObject2 = g2.optJSONObject(strArr[i14]);
                                if (jSONObject2 != null) {
                                    obj.a = iArr[i14];
                                    break;
                                }
                                i14++;
                            }
                            if (jSONObject2 != null) {
                                jSONObject2.optString("transitType", null);
                                obj.f = xe8Var.b(jSONObject2.optJSONArray("headerFields"));
                                obj.g = xe8Var.b(jSONObject2.optJSONArray("primaryFields"));
                                obj.h = xe8Var.b(jSONObject2.optJSONArray("secondaryFields"));
                                obj.i = xe8Var.b(jSONObject2.optJSONArray("auxiliaryFields"));
                                xe8Var.b(jSONObject2.optJSONArray("backFields"));
                                obj.j = xe8Var.c(160, "icon");
                                obj.k = xe8Var.c(480, "logo");
                                obj.l = xe8Var.c(1200, "strip");
                                obj.m = xe8Var.c(360, "thumbnail");
                                obj.n = xe8Var.c(480, "background");
                                obj.o = xe8Var.c(1200, "footer");
                                String str7 = "ISO-8859-1";
                                JSONArray optJSONArray = g2.optJSONArray("barcodes");
                                if (optJSONArray != null) {
                                    int i15 = 0;
                                    jSONObject = null;
                                    while (true) {
                                        i3 = i;
                                        if (i15 < Math.min(optJSONArray.length(), 8) && jSONObject == null) {
                                            JSONObject optJSONObject = optJSONArray.optJSONObject(i15);
                                            if (optJSONObject != null) {
                                                String optString2 = optJSONObject.optString("format", "");
                                                optString2.getClass();
                                                switch (optString2.hashCode()) {
                                                    case -714226307:
                                                        if (optString2.equals("PKBarcodeFormatQR")) {
                                                            i6 = i3;
                                                            break;
                                                        }
                                                        i6 = -1;
                                                        break;
                                                    case -649575634:
                                                        if (optString2.equals("PKBarcodeFormatCode128")) {
                                                            i6 = 1;
                                                            break;
                                                        }
                                                        i6 = -1;
                                                        break;
                                                    case -261397443:
                                                        if (optString2.equals("PKBarcodeFormatAztec")) {
                                                            i6 = 2;
                                                            break;
                                                        }
                                                        i6 = -1;
                                                        break;
                                                    case 864762020:
                                                        if (optString2.equals("PKBarcodeFormatPDF417")) {
                                                            i6 = 3;
                                                            break;
                                                        }
                                                        i6 = -1;
                                                        break;
                                                    default:
                                                        i6 = -1;
                                                        break;
                                                }
                                                switch (i6) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                        jSONObject = optJSONObject;
                                                        continue;
                                                }
                                            }
                                            i15++;
                                            i = i3;
                                        }
                                    }
                                } else {
                                    i3 = 0;
                                    jSONObject = null;
                                }
                                if (jSONObject == null) {
                                    jSONObject = g2.optJSONObject("barcode");
                                }
                                if (jSONObject != null) {
                                    String optString3 = jSONObject.optString("format", "");
                                    optString3.getClass();
                                    switch (optString3.hashCode()) {
                                        case -714226307:
                                            if (optString3.equals("PKBarcodeFormatQR")) {
                                                i4 = i3;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case -649575634:
                                            if (optString3.equals("PKBarcodeFormatCode128")) {
                                                i4 = 1;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case -261397443:
                                            if (optString3.equals("PKBarcodeFormatAztec")) {
                                                i4 = 2;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case 864762020:
                                            if (optString3.equals("PKBarcodeFormatPDF417")) {
                                                i4 = 3;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        default:
                                            i4 = -1;
                                            break;
                                    }
                                    switch (i4) {
                                        case 0:
                                            i5 = 1;
                                            break;
                                        case 1:
                                            i5 = 4;
                                            break;
                                        case 2:
                                            i5 = 3;
                                            break;
                                        case 3:
                                            i5 = 2;
                                            break;
                                        default:
                                            i5 = i3;
                                            break;
                                    }
                                    String optString4 = jSONObject.optString("message", null);
                                    if (i5 != 0 && !TextUtils.isEmpty(optString4) && optString4.length() <= 2048) {
                                        String optString5 = jSONObject.optString("messageEncoding", "iso-8859-1");
                                        try {
                                            if (Charset.isSupported(optString5)) {
                                                str7 = optString5;
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        EnumMap enumMap = new EnumMap(i34.class);
                                        enumMap.put((EnumMap) i34.c, (i34) Integer.valueOf(i3));
                                        i34 i34Var = i34.b;
                                        enumMap.put((EnumMap) i34Var, (i34) str7);
                                        if (i5 != 1) {
                                            if (i5 != 2) {
                                                if (i5 != 3) {
                                                    Object obj2 = new Object();
                                                    enumMap.remove(i34Var);
                                                    bf0Var = bf0.b;
                                                    l3dVar = obj2;
                                                } else {
                                                    l3d sg7Var = new sg7((byte) 14);
                                                    bf0Var = bf0.a;
                                                    l3dVar = sg7Var;
                                                }
                                            } else {
                                                l3d uifVar = new uif((byte) 22);
                                                bf0Var = bf0.c;
                                                l3dVar = uifVar;
                                            }
                                        } else {
                                            l3d z6fVar = new z6f((byte) 24);
                                            enumMap.put((EnumMap) i34.a, (i34) "M");
                                            bf0Var = bf0.d;
                                            l3dVar = z6fVar;
                                        }
                                        try {
                                            rj0 o = l3dVar.o(optString4, bf0Var, enumMap);
                                            int i16 = o.a;
                                            int i17 = o.b;
                                            if (i16 > 0 && i17 > 0 && i16 <= 1024 && i17 <= 1024) {
                                                Bitmap createBitmap = Bitmap.createBitmap(i16, i17, Bitmap.Config.ALPHA_8);
                                                int rowBytes = createBitmap.getRowBytes();
                                                byte[] bArr4 = new byte[rowBytes * i17];
                                                for (int i18 = i3; i18 < i17; i18++) {
                                                    for (int i19 = i3; i19 < i16; i19++) {
                                                        if (o.b(i19, i18)) {
                                                            bArr4[(i18 * rowBytes) + i19] = -1;
                                                        }
                                                    }
                                                }
                                                createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr4));
                                                obj.q = createBitmap;
                                                obj.p = i5;
                                                obj.r = a(jSONObject.optString("altText", null));
                                            }
                                        } catch (Throwable th) {
                                            cc4.g(th, true);
                                        }
                                    }
                                }
                                hashMap.clear();
                                return obj;
                            }
                            throw new Exception("no pass style");
                        } catch (we8 e2) {
                            throw e2;
                        } catch (Exception unused3) {
                            throw new Exception("bad pass.json");
                        }
                    }
                    throw new Exception("no pass.json");
                } catch (IOException e3) {
                    throw new Exception("bad archive: " + e3.getMessage());
                }
            }
            throw new Exception("archive too large");
        }
        throw new Exception("no file");
    }

    public static int f(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            Matcher matcher = h.matcher(trim);
            if (matcher.matches()) {
                return Color.rgb(Math.min(255, Integer.parseInt(matcher.group(1))), Math.min(255, Integer.parseInt(matcher.group(2))), Math.min(255, Integer.parseInt(matcher.group(3))));
            }
            if (trim.startsWith("#")) {
                if (trim.length() == 7 || trim.length() == 4) {
                    try {
                        if (trim.length() == 4) {
                            trim = "#" + trim.charAt(1) + trim.charAt(1) + trim.charAt(2) + trim.charAt(2) + trim.charAt(3) + trim.charAt(3);
                        }
                        return Integer.parseInt(trim.substring(1), 16) | (-16777216);
                    } catch (NumberFormatException unused) {
                        return i;
                    }
                }
                return i;
            }
            return i;
        }
        return i;
    }

    public static JSONObject g(byte[] bArr) {
        String str = new String(bArr, StandardCharsets.UTF_8);
        if (str.length() > 0 && str.charAt(0) == 65279) {
            str = str.substring(1);
        }
        int length = str.length();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (z) {
                if (charAt == '\\') {
                    i++;
                } else if (charAt == '\"') {
                    z = false;
                }
            } else if (charAt == '\"') {
                z = true;
            } else if (charAt != '{' && charAt != '[') {
                if (charAt == '}' || charAt == ']') {
                    i2--;
                }
            } else {
                i2++;
                if (i2 > 32) {
                    throw new Exception("json too deep");
                }
            }
            i++;
        }
        return new JSONObject(str);
    }

    public static int i(int i, int i2, String str, StringBuilder sb) {
        sb.setLength(0);
        int length = str.length();
        int i3 = i + 1;
        while (true) {
            int i4 = -1;
            if (i3 >= length) {
                break;
            }
            int i5 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt == '\"') {
                return i5;
            }
            if (sb.length() >= i2) {
                break;
            } else if (charAt == '\\' && i5 < length) {
                int i6 = i3 + 2;
                char charAt2 = str.charAt(i5);
                if (charAt2 != 'U') {
                    if (charAt2 != 'n') {
                        if (charAt2 != 'r') {
                            if (charAt2 != 't') {
                                if (charAt2 != 'u') {
                                    sb.append(charAt2);
                                }
                            } else {
                                sb.append('\t');
                            }
                        } else {
                            sb.append('\r');
                        }
                    } else {
                        sb.append('\n');
                    }
                    i3 = i6;
                }
                i3 += 6;
                if (i3 <= length) {
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (i7 < 4) {
                            int digit = Character.digit(str.charAt(i6 + i7), 16);
                            if (digit < 0) {
                                break;
                            }
                            i8 = (i8 << 4) | digit;
                            i7++;
                        } else {
                            i4 = i8;
                            break;
                        }
                    }
                    if (i4 >= 0) {
                        sb.append((char) i4);
                    }
                }
                sb.append(charAt2);
                i3 = i6;
            } else {
                sb.append(charAt);
                i3 = i5;
            }
        }
        return -1;
    }

    public final defpackage.pe8[] b(org.json.JSONArray r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe8.b(org.json.JSONArray):pe8[]");
    }

    public final Bitmap c(int i, String str) {
        String[] strArr;
        byte[] bArr;
        char c;
        float f2 = this.b;
        if (f2 >= 2.5f) {
            strArr = new String[]{"@3x", "@2x", ""};
        } else {
            strArr = f2 >= 1.5f ? new String[]{"@2x", "@3x", ""} : new String[]{"", "@2x", "@3x"};
        }
        HashMap hashMap = this.c;
        char c2 = 65535;
        String str2 = null;
        for (String str3 : hashMap.keySet()) {
            Matcher matcher = e.matcher(str3);
            if (matcher.matches() && matcher.group(1) != null && str.equals(matcher.group(2))) {
                String replace = matcher.group(1).toLowerCase(Locale.ROOT).replace('_', '-');
                String str4 = this.a;
                if (replace.equals(str4)) {
                    c = 0;
                } else {
                    if (replace.startsWith(str4 + "-")) {
                        c = 1;
                    } else if (replace.equals("en")) {
                        c = 2;
                    } else if (replace.startsWith("en-")) {
                        c = 3;
                    } else {
                        c = 4;
                    }
                }
                if (c < c2) {
                    str2 = matcher.group(1);
                    c2 = c;
                }
            }
        }
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                String str5 = strArr[i2];
                if (str2 != null && (bArr = (byte[]) hashMap.get(c00.j(str2, ".lproj/", str, str5, ".png"))) != null) {
                    break;
                }
                i2++;
            } else {
                int length2 = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        byte[] bArr2 = (byte[]) hashMap.get(str + strArr[i3] + ".png");
                        if (bArr2 != null) {
                            bArr = bArr2;
                            break;
                        }
                        i3++;
                    } else {
                        bArr = null;
                        break;
                    }
                }
            }
        }
        if (bArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i4 = options.outWidth;
                int i5 = options.outHeight;
                if (i4 > 0 && i5 > 0 && i4 * i5 <= 16777216) {
                    int i6 = 1;
                    while (true) {
                        int i7 = i6 << 1;
                        if (Math.max(i4, i5) / i7 < i) {
                            break;
                        }
                        i6 = i7;
                    }
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = i6;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
                    if (decodeByteArray != null) {
                        int max = Math.max(decodeByteArray.getWidth(), decodeByteArray.getHeight());
                        if (max > i) {
                            float f3 = i / max;
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, Math.max(1, Math.round(decodeByteArray.getWidth() * f3)), Math.max(1, Math.round(decodeByteArray.getHeight() * f3)), true);
                            if (createScaledBitmap != decodeByteArray) {
                                decodeByteArray.recycle();
                            }
                            return createScaledBitmap;
                        }
                        return decodeByteArray;
                    }
                }
            } catch (Throwable th) {
                cc4.g(th, true);
                return null;
            }
        }
        return null;
    }

    public final boolean d(String str) {
        if (str == null) {
            return true;
        }
        String replace = str.toLowerCase(Locale.ROOT).replace('_', '-');
        String str2 = this.a;
        if (!replace.equals(str2)) {
            if (!replace.startsWith(str2 + "-") && !replace.equals("en") && !replace.startsWith("en-") && !replace.equals("base")) {
                return false;
            }
        }
        return true;
    }

    public final void h(java.io.BufferedInputStream r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe8.h(java.io.BufferedInputStream):void");
    }

    public final String j(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof String) {
            String str2 = (String) opt;
            String str3 = (String) this.d.get(str2);
            if (str3 != null) {
                str2 = str3;
            }
            return a(str2);
        } else if (opt instanceof Number) {
            return a(String.valueOf(opt));
        } else {
            return null;
        }
    }
}
