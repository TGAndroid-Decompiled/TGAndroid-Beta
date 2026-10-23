package gi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t4 {
    public int f11465a;
    public long f11466b;
    public long f11467c;
    public long d;
    public String e;
    public String f11468f;
    public int f11469g;
    public int h;
    public long f11470i;
    public TLRPC.BotApp f11471j;
    public boolean f11472k;
    public String f11473l;
    public TLRPC.User f11474m;
    public int f11475n;
    public boolean f11476o;
    public boolean f11477p;
    public TLObject f11478q;
    public long f11479r;

    public static t4 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f11465a = i10;
        obj.f11466b = j10;
        obj.f11467c = j11;
        obj.e = str;
        obj.f11468f = str2;
        obj.f11469g = i11;
        obj.h = i12;
        obj.f11470i = j12;
        obj.f11471j = botApp;
        obj.f11472k = z10;
        obj.f11473l = str3;
        obj.f11474m = user;
        obj.f11475n = i13;
        obj.f11476o = z11;
        obj.f11477p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f11476o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f11477p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f11478q = tLObject;
        this.f11479r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof t4) {
            t4 t4Var = (t4) obj;
            if (this.f11465a == t4Var.f11465a && this.f11466b == t4Var.f11466b && this.f11467c == t4Var.f11467c && TextUtils.equals(this.f11468f, t4Var.f11468f) && this.f11469g == t4Var.f11469g && this.h == t4Var.h) {
                TLRPC.BotApp botApp = this.f11471j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f20277id;
                }
                TLRPC.BotApp botApp2 = t4Var.f11471j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f20277id;
                }
                if (j10 == j11 && this.f11472k == t4Var.f11472k && TextUtils.equals(this.f11473l, t4Var.f11473l)) {
                    TLRPC.User user = this.f11474m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f20427id;
                    }
                    TLRPC.User user2 = t4Var.f11474m;
                    if (user2 != null) {
                        j13 = user2.f20427id;
                    }
                    if (j12 == j13 && this.f11475n == t4Var.f11475n) {
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
