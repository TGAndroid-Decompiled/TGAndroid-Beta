package ki;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k4 {
    public int f18404a;
    public long f18405b;
    public long f18406c;
    public long d;
    public String f18407e;
    public String f18408f;
    public int f18409g;
    public int h;
    public long f18410i;
    public TLRPC.BotApp f18411j;
    public boolean f18412k;
    public String f18413l;
    public TLRPC.User f18414m;
    public int f18415n;
    public boolean f18416o;
    public boolean f18417p;
    public TLObject f18418q;
    public long f18419r;

    public static k4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f18404a = i7;
        obj.f18405b = j3;
        obj.f18406c = j10;
        obj.f18407e = str;
        obj.f18408f = str2;
        obj.f18409g = i10;
        obj.h = i11;
        obj.f18410i = j11;
        obj.f18411j = botApp;
        obj.f18412k = z10;
        obj.f18413l = str3;
        obj.f18414m = user;
        obj.f18415n = i12;
        obj.f18416o = z11;
        obj.f18417p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f18416o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f18417p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f18418q = tLObject;
        this.f18419r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof k4) {
            k4 k4Var = (k4) obj;
            if (this.f18404a == k4Var.f18404a && this.f18405b == k4Var.f18405b && this.f18406c == k4Var.f18406c && TextUtils.equals(this.f18408f, k4Var.f18408f) && this.f18409g == k4Var.f18409g && this.h == k4Var.h) {
                TLRPC.BotApp botApp = this.f18411j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f28048id;
                }
                TLRPC.BotApp botApp2 = k4Var.f18411j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f28048id;
                }
                if (j3 == j10 && this.f18412k == k4Var.f18412k && TextUtils.equals(this.f18413l, k4Var.f18413l)) {
                    TLRPC.User user = this.f18414m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f28200id;
                    }
                    TLRPC.User user2 = k4Var.f18414m;
                    if (user2 != null) {
                        j12 = user2.f28200id;
                    }
                    if (j11 == j12 && this.f18415n == k4Var.f18415n) {
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
