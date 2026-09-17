package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f8340a;
    public long f8341b;
    public long f8342c;
    public long d;
    public String e;
    public String f8343f;
    public int f8344g;
    public int h;
    public long f8345i;
    public TLRPC.BotApp f8346j;
    public boolean f8347k;
    public String f8348l;
    public TLRPC.User f8349m;
    public int f8350n;
    public boolean f8351o;
    public boolean f8352p;
    public TLObject f8353q;
    public long f8354r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f8340a = i10;
        obj.f8341b = j3;
        obj.f8342c = j10;
        obj.e = str;
        obj.f8343f = str2;
        obj.f8344g = i11;
        obj.h = i12;
        obj.f8345i = j11;
        obj.f8346j = botApp;
        obj.f8347k = z10;
        obj.f8348l = str3;
        obj.f8349m = user;
        obj.f8350n = i13;
        obj.f8351o = z11;
        obj.f8352p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f8351o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f8352p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f8353q = tLObject;
        this.f8354r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f8340a == f5Var.f8340a && this.f8341b == f5Var.f8341b && this.f8342c == f5Var.f8342c && TextUtils.equals(this.f8343f, f5Var.f8343f) && this.f8344g == f5Var.f8344g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f8346j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f18118id;
                }
                TLRPC.BotApp botApp2 = f5Var.f8346j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f18118id;
                }
                if (j3 == j10 && this.f8347k == f5Var.f8347k && TextUtils.equals(this.f8348l, f5Var.f8348l)) {
                    TLRPC.User user = this.f8349m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f18268id;
                    }
                    TLRPC.User user2 = f5Var.f8349m;
                    if (user2 != null) {
                        j12 = user2.f18268id;
                    }
                    if (j11 == j12 && this.f8350n == f5Var.f8350n) {
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
