package i9;

import a4.l;
import a8.ng;
import a8.wb;
import d5.j;
import e9.b;
import e9.c;
import e9.e;
import e9.i;
import f9.b0;
import f9.c0;
import f9.f0;
import f9.g0;
import f9.h1;
import f9.i0;
import f9.j0;
import f9.l1;
import f9.o;
import f9.q;
import f9.s;
import f9.s1;
import f9.y;
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
    public static final j0 f13898f;
    public static final e9.a f13899g;
    public static final HashMap h;
    public static final a f13900i;
    public static final l f13901j;
    public final String f13902a;
    public final String f13903b;
    public final j0 f13904c;
    public String d;
    public int e;

    static {
        j0 j0Var;
        String c10 = wb.c(StandardCharsets.UTF_8.name());
        o.e("charset", c10);
        s a2 = s.a();
        c0 c0Var = (c0) a2.get("charset");
        if (c0Var == null) {
            g0 g0Var = i0.f10287b;
            o.f(4, "expectedSize");
            c0Var = new b0(4);
            a2.put("charset", c0Var);
        }
        c0Var.a(c10);
        Set entrySet = a2.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            j0Var = y.h;
        } else {
            q qVar = (q) entrySet;
            ng ngVar = new ng(qVar.f10326b.size(), 7);
            Iterator it = qVar.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                s1 f7 = ((f0) entry.getValue()).f();
                ngVar.w(key, f7);
                i10 += f7.d;
            }
            j0Var = new j0(ngVar.c(true), i10);
        }
        f13898f = j0Var;
        b bVar = b.d;
        b bVar2 = b.e;
        bVar2.getClass();
        c cVar = new c(bVar2);
        bVar.getClass();
        f13899g = new e9.a(new e9.a(new e9.a(bVar, cVar), new e(' ', 1)), i.b("()<>@,;:\\\"/[]?=").d());
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
        f13900i = b("application", "json");
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
        f13901j = new l(new j("; "), 15);
    }

    public a(String str, String str2, j0 j0Var) {
        this.f13902a = str;
        this.f13903b = str2;
        this.f13904c = j0Var;
    }

    public static void a(String str, String str2) {
        a aVar = new a(str, str2, y.h);
        h.put(aVar, aVar);
    }

    public static a b(String str, String str2) {
        a aVar = new a(str, str2, f13898f);
        h.put(aVar, aVar);
        StandardCharsets.UTF_8.getClass();
        return aVar;
    }

    public final h1 c() {
        return new h1(this.f13904c.b(), new b6.i(new gh.a(27), 18));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13902a.equals(aVar.f13902a) && this.f13903b.equals(aVar.f13903b) && c().equals(aVar.c())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.e;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(new Object[]{this.f13902a, this.f13903b, c()});
            this.e = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final String toString() {
        String str = this.d;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f13902a);
            sb2.append('/');
            sb2.append(this.f13903b);
            j0 j0Var = this.f13904c;
            if (j0Var.f10288f != 0) {
                sb2.append("; ");
                Collection a2 = new l1(j0Var, new b6.i(new gh.a(26), 18)).a();
                l lVar = f13901j;
                lVar.getClass();
                try {
                    lVar.l(sb2, a2.iterator());
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            }
            String sb3 = sb2.toString();
            this.d = sb3;
            return sb3;
        }
        return str;
    }
}
