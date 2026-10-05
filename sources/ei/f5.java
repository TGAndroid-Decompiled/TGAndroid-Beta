package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f9037a;
    public long f9038b;
    public long f9039c;
    public long d;
    public String f9040e;
    public String f9041f;
    public int f9042g;
    public int h;
    public long f9043i;
    public TLRPC.BotApp f9044j;
    public boolean f9045k;
    public String f9046l;
    public TLRPC.User f9047m;
    public int f9048n;
    public boolean f9049o;
    public boolean f9050p;
    public TLObject f9051q;
    public long f9052r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f9037a = i10;
        obj.f9038b = j3;
        obj.f9039c = j10;
        obj.f9040e = str;
        obj.f9041f = str2;
        obj.f9042g = i11;
        obj.h = i12;
        obj.f9043i = j11;
        obj.f9044j = botApp;
        obj.f9045k = z10;
        obj.f9046l = str3;
        obj.f9047m = user;
        obj.f9048n = i13;
        obj.f9049o = z11;
        obj.f9050p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f9049o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f9050p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f9051q = tLObject;
        this.f9052r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f9037a == f5Var.f9037a && this.f9038b == f5Var.f9038b && this.f9039c == f5Var.f9039c && TextUtils.equals(this.f9041f, f5Var.f9041f) && this.f9042g == f5Var.f9042g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f9044j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f20044id;
                }
                TLRPC.BotApp botApp2 = f5Var.f9044j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f20044id;
                }
                if (j3 == j10 && this.f9045k == f5Var.f9045k && TextUtils.equals(this.f9046l, f5Var.f9046l)) {
                    TLRPC.User user = this.f9047m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f20194id;
                    }
                    TLRPC.User user2 = f5Var.f9047m;
                    if (user2 != null) {
                        j12 = user2.f20194id;
                    }
                    if (j11 == j12 && this.f9048n == f5Var.f9048n) {
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
