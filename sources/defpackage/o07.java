package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class o07 {
    public static final qo5 f;
    public static final yj1 g;
    public static final HashMap h;
    public static final o07 i;
    public static final aj3 j;
    public final String a;
    public final String b;
    public final qo5 c;
    public String d;
    public int e;

    static {
        qo5 qo5Var;
        String c = jrd.c(StandardCharsets.UTF_8.name());
        awd.a("charset", c);
        lp2 b = lp2.b();
        io5 io5Var = (io5) b.get("charset");
        if (io5Var == null) {
            no5 no5Var = po5.b;
            awd.b(4, "expectedSize");
            io5Var = new ho5(4);
            b.put("charset", io5Var);
        }
        io5Var.a(c);
        Set entrySet = b.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            qo5Var = v24.h;
        } else {
            ip2 ip2Var = (ip2) entrySet;
            lp lpVar = new lp(ip2Var.b.size());
            Iterator it = ip2Var.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                j99 f2 = ((mo5) entry.getValue()).f();
                lpVar.x(key, f2);
                i2 += f2.d;
            }
            qo5Var = new qo5(lpVar.d(true), i2);
        }
        f = qo5Var;
        zj1 zj1Var = zj1.d;
        zj1 zj1Var2 = zj1.e;
        zj1Var2.getClass();
        ak1 ak1Var = new ak1(zj1Var2);
        zj1Var.getClass();
        g = new yj1(new yj1(new yj1(zj1Var, ak1Var), new ck1(' ', (byte) 1)), fk1.a("()<>@,;:\\\"/[]?=").c());
        fk1.a("\"\\\r").c().getClass();
        fk1.a(" \t\r\n");
        h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        i = b("application", "json");
        a("application", "jwt");
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        j = new aj3(new ow5("; ", (byte) 0), (byte) 14);
    }

    public o07(String str, String str2, qo5 qo5Var) {
        this.a = str;
        this.b = str2;
        this.c = qo5Var;
    }

    public static void a(String str, String str2) {
        o07 o07Var = new o07(str, str2, v24.h);
        h.put(o07Var, o07Var);
    }

    public static o07 b(String str, String str2) {
        o07 o07Var = new o07(str, str2, f);
        h.put(o07Var, o07Var);
        StandardCharsets.UTF_8.getClass();
        return o07Var;
    }

    public final sk6 c() {
        return new sk6(this.c.a(), new kj4(new p31((byte) 13), (byte) 14));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof o07) {
                o07 o07Var = (o07) obj;
                if (this.a.equals(o07Var.a) && this.b.equals(o07Var.b) && c().equals(o07Var.c())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = this.e;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(new Object[]{this.a, this.b, c()});
            this.e = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        String str = this.d;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append('/');
            sb.append(this.b);
            qo5 qo5Var = this.c;
            if (qo5Var.f != 0) {
                sb.append("; ");
                Collection g2 = new gj7(qo5Var, new kj4(new p31((byte) 12), (byte) 14)).g();
                aj3 aj3Var = j;
                aj3Var.getClass();
                try {
                    aj3Var.g(sb, g2.iterator());
                } catch (IOException e) {
                    hz6.e(e);
                    return null;
                }
            }
            String sb2 = sb.toString();
            this.d = sb2;
            return sb2;
        }
        return str;
    }
}
