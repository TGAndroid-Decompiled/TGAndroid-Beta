package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gzc {
    public int a;
    public long b;
    public long c;
    public long d;
    public String e;
    public String f;
    public int g;
    public int h;
    public long i;
    public TLRPC.BotApp j;
    public boolean k;
    public String l;
    public TLRPC.User m;
    public byte n;
    public boolean o;
    public boolean p;
    public TLObject q;
    public long r;

    public static gzc b(int i, long j, long j2, String str, String str2, int i2, int i3, long j3, TLRPC.BotApp botApp, boolean z, String str3, TLRPC.User user, int i4, boolean z2, boolean z3) {
        ?? obj = new Object();
        obj.a = i;
        obj.b = j;
        obj.c = j2;
        obj.e = str;
        obj.f = str2;
        obj.g = i2;
        obj.h = i3;
        obj.i = j3;
        obj.j = botApp;
        obj.k = z;
        obj.l = str3;
        obj.m = user;
        obj.n = i4;
        obj.o = z2;
        obj.p = z3;
        if (!z2 && !z3 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j;
        long j2;
        long j3;
        if (obj instanceof gzc) {
            gzc gzcVar = (gzc) obj;
            if (this.a == gzcVar.a && this.b == gzcVar.b && this.c == gzcVar.c && TextUtils.equals(this.f, gzcVar.f) && this.g == gzcVar.g && this.h == gzcVar.h) {
                TLRPC.BotApp botApp = this.j;
                long j4 = 0;
                if (botApp == null) {
                    j = 0;
                } else {
                    j = botApp.id;
                }
                TLRPC.BotApp botApp2 = gzcVar.j;
                if (botApp2 == null) {
                    j2 = 0;
                } else {
                    j2 = botApp2.id;
                }
                if (j == j2 && this.k == gzcVar.k && TextUtils.equals(this.l, gzcVar.l)) {
                    TLRPC.User user = this.m;
                    if (user == null) {
                        j3 = 0;
                    } else {
                        j3 = user.id;
                    }
                    TLRPC.User user2 = gzcVar.m;
                    if (user2 != null) {
                        j4 = user2.id;
                    }
                    if (j3 == j4 && this.n == gzcVar.n) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
