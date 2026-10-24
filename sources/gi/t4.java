package gi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t4 {
    public int f11491a;
    public long f11492b;
    public long f11493c;
    public long d;
    public String e;
    public String f11494f;
    public int f11495g;
    public int h;
    public long f11496i;
    public TLRPC.BotApp f11497j;
    public boolean f11498k;
    public String f11499l;
    public TLRPC.User f11500m;
    public int f11501n;
    public boolean f11502o;
    public boolean f11503p;
    public TLObject f11504q;
    public long f11505r;

    public static t4 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f11491a = i10;
        obj.f11492b = j10;
        obj.f11493c = j11;
        obj.e = str;
        obj.f11494f = str2;
        obj.f11495g = i11;
        obj.h = i12;
        obj.f11496i = j12;
        obj.f11497j = botApp;
        obj.f11498k = z10;
        obj.f11499l = str3;
        obj.f11500m = user;
        obj.f11501n = i13;
        obj.f11502o = z11;
        obj.f11503p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f11502o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f11503p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f11504q = tLObject;
        this.f11505r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof t4) {
            t4 t4Var = (t4) obj;
            if (this.f11491a == t4Var.f11491a && this.f11492b == t4Var.f11492b && this.f11493c == t4Var.f11493c && TextUtils.equals(this.f11494f, t4Var.f11494f) && this.f11495g == t4Var.f11495g && this.h == t4Var.h) {
                TLRPC.BotApp botApp = this.f11497j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f20341id;
                }
                TLRPC.BotApp botApp2 = t4Var.f11497j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f20341id;
                }
                if (j10 == j11 && this.f11498k == t4Var.f11498k && TextUtils.equals(this.f11499l, t4Var.f11499l)) {
                    TLRPC.User user = this.f11500m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f20491id;
                    }
                    TLRPC.User user2 = t4Var.f11500m;
                    if (user2 != null) {
                        j13 = user2.f20491id;
                    }
                    if (j12 == j13 && this.f11501n == t4Var.f11501n) {
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
