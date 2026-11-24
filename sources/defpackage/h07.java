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
public final class h07 {
    public static final no5 f;
    public static final xk1 g;
    public static final HashMap h;
    public static final h07 i;
    public static final fk3 j;
    public final String a;
    public final String b;
    public final no5 c;
    public String d;
    public int e;

    static {
        no5 no5Var;
        String c = vod.c(StandardCharsets.UTF_8.name());
        ntd.a("charset", c);
        dq2 b = dq2.b();
        fo5 fo5Var = (fo5) b.get("charset");
        if (fo5Var == null) {
            ko5 ko5Var = mo5.b;
            ntd.b(4, "expectedSize");
            fo5Var = new eo5(4);
            b.put("charset", fo5Var);
        }
        fo5Var.a(c);
        Set entrySet = b.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            no5Var = l34.h;
        } else {
            aq2 aq2Var = (aq2) entrySet;
            kq kqVar = new kq(aq2Var.b.size());
            Iterator it = aq2Var.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                y79 f2 = ((jo5) entry.getValue()).f();
                kqVar.w(key, f2);
                i2 += f2.d;
            }
            no5Var = new no5(kqVar.e(true), i2);
        }
        f = no5Var;
        yk1 yk1Var = yk1.d;
        yk1 yk1Var2 = yk1.e;
        yk1Var2.getClass();
        zk1 zk1Var = new zk1(yk1Var2);
        yk1Var.getClass();
        g = new xk1(new xk1(new xk1(yk1Var, zk1Var), new bl1(' ', (byte) 1)), el1.a("()<>@,;:\\\"/[]?=").c());
        el1.a("\"\\\r").c().getClass();
        el1.a(" \t\r\n");
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
        j = new fk3(new jw5("; ", (byte) 0));
    }

    public h07(String str, String str2, no5 no5Var) {
        this.a = str;
        this.b = str2;
        this.c = no5Var;
    }

    public static void a(String str, String str2) {
        h07 h07Var = new h07(str, str2, l34.h);
        h.put(h07Var, h07Var);
    }

    public static h07 b(String str, String str2) {
        h07 h07Var = new h07(str, str2, f);
        h.put(h07Var, h07Var);
        StandardCharsets.UTF_8.getClass();
        return h07Var;
    }

    public final qk6 c() {
        return new qk6(this.c.a(), new lj4(new o41((byte) 13)));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h07) {
                h07 h07Var = (h07) obj;
                if (this.a.equals(h07Var.a) && this.b.equals(h07Var.b) && c().equals(h07Var.c())) {
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
            no5 no5Var = this.c;
            if (no5Var.f != 0) {
                sb.append("; ");
                Collection g2 = new aj7(no5Var, new lj4(new o41((byte) 12))).g();
                fk3 fk3Var = j;
                fk3Var.getClass();
                try {
                    fk3Var.k(sb, g2.iterator());
                } catch (IOException e) {
                    bh7.j(e);
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
