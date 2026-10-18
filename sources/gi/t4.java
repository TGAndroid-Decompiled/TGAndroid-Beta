package gi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t4 {
    public int f11468a;
    public long f11469b;
    public long f11470c;
    public long d;
    public String e;
    public String f11471f;
    public int f11472g;
    public int h;
    public long f11473i;
    public TLRPC.BotApp f11474j;
    public boolean f11475k;
    public String f11476l;
    public TLRPC.User f11477m;
    public int f11478n;
    public boolean f11479o;
    public boolean f11480p;
    public TLObject f11481q;
    public long f11482r;

    public static t4 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f11468a = i10;
        obj.f11469b = j10;
        obj.f11470c = j11;
        obj.e = str;
        obj.f11471f = str2;
        obj.f11472g = i11;
        obj.h = i12;
        obj.f11473i = j12;
        obj.f11474j = botApp;
        obj.f11475k = z10;
        obj.f11476l = str3;
        obj.f11477m = user;
        obj.f11478n = i13;
        obj.f11479o = z11;
        obj.f11480p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f11479o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f11480p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f11481q = tLObject;
        this.f11482r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof t4) {
            t4 t4Var = (t4) obj;
            if (this.f11468a == t4Var.f11468a && this.f11469b == t4Var.f11469b && this.f11470c == t4Var.f11470c && TextUtils.equals(this.f11471f, t4Var.f11471f) && this.f11472g == t4Var.f11472g && this.h == t4Var.h) {
                TLRPC.BotApp botApp = this.f11474j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f20276id;
                }
                TLRPC.BotApp botApp2 = t4Var.f11474j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f20276id;
                }
                if (j10 == j11 && this.f11475k == t4Var.f11475k && TextUtils.equals(this.f11476l, t4Var.f11476l)) {
                    TLRPC.User user = this.f11477m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f20426id;
                    }
                    TLRPC.User user2 = t4Var.f11477m;
                    if (user2 != null) {
                        j13 = user2.f20426id;
                    }
                    if (j12 == j13 && this.f11478n == t4Var.f11478n) {
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
