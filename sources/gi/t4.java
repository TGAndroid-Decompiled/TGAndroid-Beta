package gi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t4 {
    public int f11466a;
    public long f11467b;
    public long f11468c;
    public long d;
    public String e;
    public String f11469f;
    public int f11470g;
    public int h;
    public long f11471i;
    public TLRPC.BotApp f11472j;
    public boolean f11473k;
    public String f11474l;
    public TLRPC.User f11475m;
    public int f11476n;
    public boolean f11477o;
    public boolean f11478p;
    public TLObject f11479q;
    public long f11480r;

    public static t4 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f11466a = i10;
        obj.f11467b = j10;
        obj.f11468c = j11;
        obj.e = str;
        obj.f11469f = str2;
        obj.f11470g = i11;
        obj.h = i12;
        obj.f11471i = j12;
        obj.f11472j = botApp;
        obj.f11473k = z10;
        obj.f11474l = str3;
        obj.f11475m = user;
        obj.f11476n = i13;
        obj.f11477o = z11;
        obj.f11478p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f11477o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f11478p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f11479q = tLObject;
        this.f11480r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof t4) {
            t4 t4Var = (t4) obj;
            if (this.f11466a == t4Var.f11466a && this.f11467b == t4Var.f11467b && this.f11468c == t4Var.f11468c && TextUtils.equals(this.f11469f, t4Var.f11469f) && this.f11470g == t4Var.f11470g && this.h == t4Var.h) {
                TLRPC.BotApp botApp = this.f11472j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f20269id;
                }
                TLRPC.BotApp botApp2 = t4Var.f11472j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f20269id;
                }
                if (j10 == j11 && this.f11473k == t4Var.f11473k && TextUtils.equals(this.f11474l, t4Var.f11474l)) {
                    TLRPC.User user = this.f11475m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f20419id;
                    }
                    TLRPC.User user2 = t4Var.f11475m;
                    if (user2 != null) {
                        j13 = user2.f20419id;
                    }
                    if (j12 == j13 && this.f11476n == t4Var.f11476n) {
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
