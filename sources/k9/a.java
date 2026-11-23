package k9;

import a8.ka;
import a8.xa;
import cb.c;
import f5.g;
import g9.b;
import g9.e;
import g9.i;
import h9.b0;
import h9.c0;
import h9.f0;
import h9.g0;
import h9.g1;
import h9.i0;
import h9.i1;
import h9.j0;
import h9.m1;
import h9.o;
import h9.q;
import h9.s;
import h9.t1;
import h9.y;
import hi.f9;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class a {
    public static final j0 f18183f;
    public static final g9.a f18184g;
    public static final HashMap h;
    public static final a f18185i;
    public static final c f18186j;
    public final String f18187a;
    public final String f18188b;
    public final j0 f18189c;
    public String d;
    public int f18190e;

    static {
        j0 j0Var;
        String c10 = ka.c(StandardCharsets.UTF_8.name());
        o.f("charset", c10);
        s b10 = s.b();
        c0 c0Var = (c0) b10.get("charset");
        if (c0Var == null) {
            g0 g0Var = i0.f13998b;
            o.g(4, "expectedSize");
            c0Var = new b0(4);
            b10.put("charset", c0Var);
        }
        c0Var.a(c10);
        Set entrySet = b10.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            j0Var = y.h;
        } else {
            q qVar = (q) entrySet;
            xa xaVar = new xa(qVar.f14038b.size(), 10);
            Iterator it = qVar.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                t1 f10 = ((f0) entry.getValue()).f();
                xaVar.w(key, f10);
                i7 += f10.d;
            }
            j0Var = new j0(xaVar.c(true), i7);
        }
        f18183f = j0Var;
        b bVar = b.d;
        b bVar2 = b.f13237e;
        bVar2.getClass();
        g9.c cVar = new g9.c(bVar2);
        bVar.getClass();
        f18184g = new g9.a(new g9.a(new g9.a(bVar, cVar), new e(' ', 1)), i.b("()<>@,;:\\\"/[]?=").d());
        i.b("\"\\\r").d().getClass();
        i.b(" \t\r\n");
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
        f18185i = b("application", "json");
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
        f18186j = new c(new g("; "), 26);
    }

    public a(String str, String str2, j0 j0Var) {
        this.f18187a = str;
        this.f18188b = str2;
        this.f18189c = j0Var;
    }

    public static void a(String str, String str2) {
        a aVar = new a(str, str2, y.h);
        h.put(aVar, aVar);
    }

    public static a b(String str, String str2) {
        a aVar = new a(str, str2, f18183f);
        h.put(aVar, aVar);
        StandardCharsets.UTF_8.getClass();
        return aVar;
    }

    public final i1 c() {
        return new i1(this.f18189c.b(), new g1(new f9(11), 0));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f18187a.equals(aVar.f18187a) && this.f18188b.equals(aVar.f18188b) && c().equals(aVar.c())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f18190e;
        if (i7 == 0) {
            int hashCode = Arrays.hashCode(new Object[]{this.f18187a, this.f18188b, c()});
            this.f18190e = hashCode;
            return hashCode;
        }
        return i7;
    }

    public final String toString() {
        String str = this.d;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18187a);
            sb2.append('/');
            sb2.append(this.f18188b);
            j0 j0Var = this.f18189c;
            if (j0Var.f14003f != 0) {
                sb2.append("; ");
                Collection a10 = new m1(j0Var, new g1(new f9(10), 0)).a();
                c cVar = f18186j;
                cVar.getClass();
                try {
                    cVar.e(sb2, a10.iterator());
                } catch (IOException e10) {
                    throw new AssertionError(e10);
                }
            }
            String sb3 = sb2.toString();
            this.d = sb3;
            return sb3;
        }
        return str;
    }
}
