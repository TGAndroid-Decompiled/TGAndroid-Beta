package defpackage;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class jfc {
    public int a;
    public boolean b;
    public long c;
    public Uri d;
    public long e;
    public Uri f;
    public TLRPC.Document g;
    public TLRPC.Document h;
    public int i;
    public int j;
    public long k;
    public double l;
    public String m;

    public static Uri a(int i, int i2, TLRPC.Document document) {
        StringBuilder m = uh9.m(i, "?account=", "&id=");
        m.append(document.id);
        m.append("&hash=");
        m.append(document.access_hash);
        m.append("&dc=");
        m.append(document.dc_id);
        m.append("&size=");
        m.append(document.size);
        m.append("&mime=");
        m.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        m.append("&rid=");
        m.append(i2);
        m.append("&name=");
        m.append(URLEncoder.encode(xb4.B(document), "UTF-8"));
        m.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        m.append(Utilities.f(bArr));
        String sb = m.toString();
        return Uri.parse("tg://" + xb4.r(null, document) + sb);
    }

    public static jfc d(int i, TLRPC.Document document, TLRPC.Document document2, int i2, boolean z) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        String str2;
        ?? obj = new Object();
        int i3 = 0;
        while (true) {
            if (i3 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                    break;
                }
                i3++;
            } else {
                tL_documentAttributeVideo = null;
                break;
            }
        }
        if (tL_documentAttributeVideo != null && (str2 = tL_documentAttributeVideo.video_codec) != null) {
            str = str2.toLowerCase();
        } else {
            str = null;
        }
        obj.a = i;
        obj.g = document;
        obj.c = document.id;
        obj.d = a(i, i2, document);
        if (document2 != null) {
            obj.h = document2;
            obj.e = document2.id;
            obj.f = a(i, i2, document2);
            xb4.G(i);
            File J = xb4.J(document2, null, false, z);
            if (J != null && J.exists()) {
                obj.f = Uri.fromFile(J);
            } else {
                xb4.G(i);
                File J2 = xb4.J(document2, null, true, z);
                if (J2 != null && J2.exists()) {
                    obj.f = Uri.fromFile(J2);
                }
            }
        }
        obj.m = str;
        long j = document.size;
        obj.k = j;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.i = tL_documentAttributeVideo.w;
            obj.j = tL_documentAttributeVideo.h;
            obj.l = j / d;
        }
        xb4.G(i);
        File J3 = xb4.J(document, null, false, z);
        if (J3 != null && J3.exists()) {
            obj.d = Uri.fromFile(J3);
            return obj;
        }
        xb4.G(i);
        File J4 = xb4.J(document, null, true, z);
        if (J4 != null && J4.exists()) {
            obj.d = Uri.fromFile(J4);
        }
        return obj;
    }

    public final boolean b() {
        Uri uri = this.d;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        Uri uri = this.f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z) {
        if (!b() && this.g != null) {
            xb4.G(this.a);
            File J = xb4.J(this.g, null, false, z);
            if (J != null && J.exists()) {
                this.d = Uri.fromFile(J);
            } else {
                xb4.G(this.a);
                File J2 = xb4.J(this.g, null, true, z);
                if (J2 != null && J2.exists()) {
                    this.d = Uri.fromFile(J2);
                }
            }
        }
        if (!c() && this.h != null) {
            xb4.G(this.a);
            File J3 = xb4.J(this.h, null, false, z);
            if (J3 != null && J3.exists()) {
                this.f = Uri.fromFile(J3);
                return;
            }
            xb4.G(this.a);
            File J4 = xb4.J(this.h, null, true, z);
            if (J4 != null && J4.exists()) {
                this.f = Uri.fromFile(J4);
            }
        }
    }
}
