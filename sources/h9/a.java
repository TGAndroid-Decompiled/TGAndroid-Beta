package h9;

import d9.b;
import d9.e;
import d9.i;
import d9.l;
import e9.d0;
import e9.g0;
import e9.h0;
import e9.k0;
import e9.l0;
import e9.m1;
import e9.n0;
import e9.o0;
import e9.q1;
import e9.s;
import e9.u;
import e9.x;
import e9.x1;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import qb.c;
import v7.s6;
public final class a {
    public static final o0 f11724f;
    public static final d9.a f11725g;
    public static final HashMap h;
    public static final a f11726i;
    public static final c f11727j;
    public final String f11728a;
    public final String f11729b;
    public final o0 f11730c;
    public String d;
    public int e;

    static {
        o0 o0Var;
        String c10 = s6.c(StandardCharsets.UTF_8.name());
        s.e("charset", c10);
        x a2 = x.a();
        h0 h0Var = (h0) a2.get("charset");
        if (h0Var == null) {
            l0 l0Var = n0.f8481b;
            s.f(4, "expectedSize");
            h0Var = new g0(4);
            a2.put("charset", h0Var);
        }
        h0Var.a(c10);
        Set entrySet = a2.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            o0Var = d0.h;
        } else {
            u uVar = (u) entrySet;
            a5.a aVar = new a5.a(uVar.f8515b.size(), 5);
            Iterator it = uVar.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                x1 f7 = ((k0) entry.getValue()).f();
                aVar.x(key, f7);
                i10 += f7.d;
            }
            o0Var = new o0(aVar.e(true), i10);
        }
        f11724f = o0Var;
        b bVar = b.d;
        b bVar2 = b.e;
        bVar2.getClass();
        d9.c cVar = new d9.c(bVar2);
        bVar.getClass();
        f11725g = new d9.a(new d9.a(new d9.a(bVar, cVar), new e(' ', 1)), i.b("()<>@,;:\\\"/[]?=").d());
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
        f11726i = b("application", "json");
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
        f11727j = new c(new l("; ", 0), 17);
    }

    public a(String str, String str2, o0 o0Var) {
        this.f11728a = str;
        this.f11729b = str2;
        this.f11730c = o0Var;
    }

    public static void a(String str, String str2) {
        a aVar = new a(str, str2, d0.h);
        h.put(aVar, aVar);
    }

    public static a b(String str, String str2) {
        a aVar = new a(str, str2, f11724f);
        h.put(aVar, aVar);
        StandardCharsets.UTF_8.getClass();
        return aVar;
    }

    public final m1 c() {
        return new m1(this.f11730c.b(), new a4.l(new fh.b(17), 14));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f11728a.equals(aVar.f11728a) && this.f11729b.equals(aVar.f11729b) && c().equals(aVar.c())) {
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
            int hashCode = Arrays.hashCode(new Object[]{this.f11728a, this.f11729b, c()});
            this.e = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final String toString() {
        String str = this.d;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f11728a);
            sb2.append('/');
            sb2.append(this.f11729b);
            o0 o0Var = this.f11730c;
            if (o0Var.f8484f != 0) {
                sb2.append("; ");
                Collection a2 = new q1(o0Var, new a4.l(new fh.b(16), 14)).a();
                c cVar = f11727j;
                cVar.getClass();
                try {
                    cVar.b(sb2, a2.iterator());
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
