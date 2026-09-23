package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f8323a;
    public long f8324b;
    public long f8325c;
    public long d;
    public String e;
    public String f8326f;
    public int f8327g;
    public int h;
    public long f8328i;
    public TLRPC.BotApp f8329j;
    public boolean f8330k;
    public String f8331l;
    public TLRPC.User f8332m;
    public int f8333n;
    public boolean f8334o;
    public boolean f8335p;
    public TLObject f8336q;
    public long f8337r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f8323a = i10;
        obj.f8324b = j3;
        obj.f8325c = j10;
        obj.e = str;
        obj.f8326f = str2;
        obj.f8327g = i11;
        obj.h = i12;
        obj.f8328i = j11;
        obj.f8329j = botApp;
        obj.f8330k = z10;
        obj.f8331l = str3;
        obj.f8332m = user;
        obj.f8333n = i13;
        obj.f8334o = z11;
        obj.f8335p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f8334o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f8335p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f8336q = tLObject;
        this.f8337r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f8323a == f5Var.f8323a && this.f8324b == f5Var.f8324b && this.f8325c == f5Var.f8325c && TextUtils.equals(this.f8326f, f5Var.f8326f) && this.f8327g == f5Var.f8327g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f8329j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f18080id;
                }
                TLRPC.BotApp botApp2 = f5Var.f8329j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f18080id;
                }
                if (j3 == j10 && this.f8330k == f5Var.f8330k && TextUtils.equals(this.f8331l, f5Var.f8331l)) {
                    TLRPC.User user = this.f8332m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f18230id;
                    }
                    TLRPC.User user2 = f5Var.f8332m;
                    if (user2 != null) {
                        j12 = user2.f18230id;
                    }
                    if (j11 == j12 && this.f8333n == f5Var.f8333n) {
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
