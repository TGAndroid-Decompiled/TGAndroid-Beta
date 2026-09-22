package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f8337a;
    public long f8338b;
    public long f8339c;
    public long d;
    public String e;
    public String f8340f;
    public int f8341g;
    public int h;
    public long f8342i;
    public TLRPC.BotApp f8343j;
    public boolean f8344k;
    public String f8345l;
    public TLRPC.User f8346m;
    public int f8347n;
    public boolean f8348o;
    public boolean f8349p;
    public TLObject f8350q;
    public long f8351r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f8337a = i10;
        obj.f8338b = j3;
        obj.f8339c = j10;
        obj.e = str;
        obj.f8340f = str2;
        obj.f8341g = i11;
        obj.h = i12;
        obj.f8342i = j11;
        obj.f8343j = botApp;
        obj.f8344k = z10;
        obj.f8345l = str3;
        obj.f8346m = user;
        obj.f8347n = i13;
        obj.f8348o = z11;
        obj.f8349p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f8348o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f8349p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f8350q = tLObject;
        this.f8351r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f8337a == f5Var.f8337a && this.f8338b == f5Var.f8338b && this.f8339c == f5Var.f8339c && TextUtils.equals(this.f8340f, f5Var.f8340f) && this.f8341g == f5Var.f8341g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f8343j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f18106id;
                }
                TLRPC.BotApp botApp2 = f5Var.f8343j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f18106id;
                }
                if (j3 == j10 && this.f8344k == f5Var.f8344k && TextUtils.equals(this.f8345l, f5Var.f8345l)) {
                    TLRPC.User user = this.f8346m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f18256id;
                    }
                    TLRPC.User user2 = f5Var.f8346m;
                    if (user2 != null) {
                        j12 = user2.f18256id;
                    }
                    if (j11 == j12 && this.f8347n == f5Var.f8347n) {
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
