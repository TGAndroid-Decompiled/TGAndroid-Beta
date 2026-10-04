package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f9036a;
    public long f9037b;
    public long f9038c;
    public long d;
    public String f9039e;
    public String f9040f;
    public int f9041g;
    public int h;
    public long f9042i;
    public TLRPC.BotApp f9043j;
    public boolean f9044k;
    public String f9045l;
    public TLRPC.User f9046m;
    public int f9047n;
    public boolean f9048o;
    public boolean f9049p;
    public TLObject f9050q;
    public long f9051r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f9036a = i10;
        obj.f9037b = j3;
        obj.f9038c = j10;
        obj.f9039e = str;
        obj.f9040f = str2;
        obj.f9041g = i11;
        obj.h = i12;
        obj.f9042i = j11;
        obj.f9043j = botApp;
        obj.f9044k = z10;
        obj.f9045l = str3;
        obj.f9046m = user;
        obj.f9047n = i13;
        obj.f9048o = z11;
        obj.f9049p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f9048o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f9049p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f9050q = tLObject;
        this.f9051r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f9036a == f5Var.f9036a && this.f9037b == f5Var.f9037b && this.f9038c == f5Var.f9038c && TextUtils.equals(this.f9040f, f5Var.f9040f) && this.f9041g == f5Var.f9041g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f9043j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f20035id;
                }
                TLRPC.BotApp botApp2 = f5Var.f9043j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f20035id;
                }
                if (j3 == j10 && this.f9044k == f5Var.f9044k && TextUtils.equals(this.f9045l, f5Var.f9045l)) {
                    TLRPC.User user = this.f9046m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f20185id;
                    }
                    TLRPC.User user2 = f5Var.f9046m;
                    if (user2 != null) {
                        j12 = user2.f20185id;
                    }
                    if (j11 == j12 && this.f9047n == f5Var.f9047n) {
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
