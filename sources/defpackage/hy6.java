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
public final class hy6 {
    public static final nm5 f;
    public static final pj1 g;
    public static final HashMap h;
    public static final hy6 i;
    public static final s34 j;
    public final String a;
    public final String b;
    public final nm5 c;
    public String d;
    public int e;

    static {
        nm5 nm5Var;
        String c = smd.c(StandardCharsets.UTF_8.name());
        krd.a("charset", c);
        so2 b = so2.b();
        fm5 fm5Var = (fm5) b.get("charset");
        if (fm5Var == null) {
            km5 km5Var = mm5.b;
            krd.b(4, "expectedSize");
            fm5Var = new em5(4);
            b.put("charset", fm5Var);
        }
        fm5Var.a(c);
        Set entrySet = b.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            nm5Var = a24.h;
        } else {
            po2 po2Var = (po2) entrySet;
            kp kpVar = new kp(po2Var.b.size());
            Iterator it = po2Var.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                w59 f2 = ((jm5) entry.getValue()).f();
                kpVar.w(key, f2);
                i2 += f2.d;
            }
            nm5Var = new nm5(kpVar.c(true), i2);
        }
        f = nm5Var;
        qj1 qj1Var = qj1.d;
        qj1 qj1Var2 = qj1.e;
        qj1Var2.getClass();
        rj1 rj1Var = new rj1(qj1Var2);
        qj1Var.getClass();
        g = new pj1(new pj1(new pj1(qj1Var, rj1Var), new tj1(' ', (byte) 1)), wj1.a("()<>@,;:\\\"/[]?=").c());
        wj1.a("\"\\\r").c().getClass();
        wj1.a(" \t\r\n");
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
        j = new s34(new zb3("; "), (byte) 9);
    }

    public hy6(String str, String str2, nm5 nm5Var) {
        this.a = str;
        this.b = str2;
        this.c = nm5Var;
    }

    public static void a(String str, String str2) {
        hy6 hy6Var = new hy6(str, str2, a24.h);
        h.put(hy6Var, hy6Var);
    }

    public static hy6 b(String str, String str2) {
        hy6 hy6Var = new hy6(str, str2, f);
        h.put(hy6Var, hy6Var);
        StandardCharsets.UTF_8.getClass();
        return hy6Var;
    }

    public final oi6 c() {
        return new oi6(this.c.a(), new gi3(new g31((byte) 13)));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof hy6) {
                hy6 hy6Var = (hy6) obj;
                if (this.a.equals(hy6Var.a) && this.b.equals(hy6Var.b) && c().equals(hy6Var.c())) {
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
            nm5 nm5Var = this.c;
            if (nm5Var.f != 0) {
                sb.append("; ");
                Collection g2 = new xg7(nm5Var, new gi3(new g31((byte) 12))).g();
                s34 s34Var = j;
                s34Var.getClass();
                try {
                    s34Var.k(sb, g2.iterator());
                } catch (IOException e) {
                    fi7.g(e);
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
