package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f8322a;
    public long f8323b;
    public long f8324c;
    public long d;
    public String e;
    public String f8325f;
    public int f8326g;
    public int h;
    public long f8327i;
    public TLRPC.BotApp f8328j;
    public boolean f8329k;
    public String f8330l;
    public TLRPC.User f8331m;
    public int f8332n;
    public boolean f8333o;
    public boolean f8334p;
    public TLObject f8335q;
    public long f8336r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f8322a = i10;
        obj.f8323b = j3;
        obj.f8324c = j10;
        obj.e = str;
        obj.f8325f = str2;
        obj.f8326g = i11;
        obj.h = i12;
        obj.f8327i = j11;
        obj.f8328j = botApp;
        obj.f8329k = z10;
        obj.f8330l = str3;
        obj.f8331m = user;
        obj.f8332n = i13;
        obj.f8333o = z11;
        obj.f8334p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f8333o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f8334p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f8335q = tLObject;
        this.f8336r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f8322a == f5Var.f8322a && this.f8323b == f5Var.f8323b && this.f8324c == f5Var.f8324c && TextUtils.equals(this.f8325f, f5Var.f8325f) && this.f8326g == f5Var.f8326g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f8328j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f18332id;
                }
                TLRPC.BotApp botApp2 = f5Var.f8328j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f18332id;
                }
                if (j3 == j10 && this.f8329k == f5Var.f8329k && TextUtils.equals(this.f8330l, f5Var.f8330l)) {
                    TLRPC.User user = this.f8331m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f18482id;
                    }
                    TLRPC.User user2 = f5Var.f8331m;
                    if (user2 != null) {
                        j12 = user2.f18482id;
                    }
                    if (j11 == j12 && this.f8332n == f5Var.f8332n) {
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
