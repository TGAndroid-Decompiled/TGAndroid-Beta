package gi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t4 {
    public int f11467a;
    public long f11468b;
    public long f11469c;
    public long d;
    public String e;
    public String f11470f;
    public int f11471g;
    public int h;
    public long f11472i;
    public TLRPC.BotApp f11473j;
    public boolean f11474k;
    public String f11475l;
    public TLRPC.User f11476m;
    public int f11477n;
    public boolean f11478o;
    public boolean f11479p;
    public TLObject f11480q;
    public long f11481r;

    public static t4 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f11467a = i10;
        obj.f11468b = j10;
        obj.f11469c = j11;
        obj.e = str;
        obj.f11470f = str2;
        obj.f11471g = i11;
        obj.h = i12;
        obj.f11472i = j12;
        obj.f11473j = botApp;
        obj.f11474k = z10;
        obj.f11475l = str3;
        obj.f11476m = user;
        obj.f11477n = i13;
        obj.f11478o = z11;
        obj.f11479p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f11478o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f11479p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f11480q = tLObject;
        this.f11481r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof t4) {
            t4 t4Var = (t4) obj;
            if (this.f11467a == t4Var.f11467a && this.f11468b == t4Var.f11468b && this.f11469c == t4Var.f11469c && TextUtils.equals(this.f11470f, t4Var.f11470f) && this.f11471g == t4Var.f11471g && this.h == t4Var.h) {
                TLRPC.BotApp botApp = this.f11473j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f20272id;
                }
                TLRPC.BotApp botApp2 = t4Var.f11473j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f20272id;
                }
                if (j10 == j11 && this.f11474k == t4Var.f11474k && TextUtils.equals(this.f11475l, t4Var.f11475l)) {
                    TLRPC.User user = this.f11476m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f20422id;
                    }
                    TLRPC.User user2 = t4Var.f11476m;
                    if (user2 != null) {
                        j13 = user2.f20422id;
                    }
                    if (j12 == j13 && this.f11477n == t4Var.f11477n) {
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
