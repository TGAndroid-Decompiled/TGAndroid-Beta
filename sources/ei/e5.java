package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e5 {
    public int f9033a;
    public long f9034b;
    public long f9035c;
    public long d;
    public String f9036e;
    public String f9037f;
    public int f9038g;
    public int h;
    public long f9039i;
    public TLRPC.BotApp f9040j;
    public boolean f9041k;
    public String f9042l;
    public TLRPC.User f9043m;
    public int f9044n;
    public boolean f9045o;
    public boolean f9046p;
    public TLObject f9047q;
    public long f9048r;

    public static e5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f9033a = i10;
        obj.f9034b = j3;
        obj.f9035c = j10;
        obj.f9036e = str;
        obj.f9037f = str2;
        obj.f9038g = i11;
        obj.h = i12;
        obj.f9039i = j11;
        obj.f9040j = botApp;
        obj.f9041k = z10;
        obj.f9042l = str3;
        obj.f9043m = user;
        obj.f9044n = i13;
        obj.f9045o = z11;
        obj.f9046p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f9045o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f9046p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f9047q = tLObject;
        this.f9048r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof e5) {
            e5 e5Var = (e5) obj;
            if (this.f9033a == e5Var.f9033a && this.f9034b == e5Var.f9034b && this.f9035c == e5Var.f9035c && TextUtils.equals(this.f9037f, e5Var.f9037f) && this.f9038g == e5Var.f9038g && this.h == e5Var.h) {
                TLRPC.BotApp botApp = this.f9040j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f19799id;
                }
                TLRPC.BotApp botApp2 = e5Var.f9040j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f19799id;
                }
                if (j3 == j10 && this.f9041k == e5Var.f9041k && TextUtils.equals(this.f9042l, e5Var.f9042l)) {
                    TLRPC.User user = this.f9043m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f19949id;
                    }
                    TLRPC.User user2 = e5Var.f9043m;
                    if (user2 != null) {
                        j12 = user2.f19949id;
                    }
                    if (j11 == j12 && this.f9044n == e5Var.f9044n) {
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
