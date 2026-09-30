package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f8334a;
    public long f8335b;
    public long f8336c;
    public long d;
    public String e;
    public String f8337f;
    public int f8338g;
    public int h;
    public long f8339i;
    public TLRPC.BotApp f8340j;
    public boolean f8341k;
    public String f8342l;
    public TLRPC.User f8343m;
    public int f8344n;
    public boolean f8345o;
    public boolean f8346p;
    public TLObject f8347q;
    public long f8348r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f8334a = i10;
        obj.f8335b = j3;
        obj.f8336c = j10;
        obj.e = str;
        obj.f8337f = str2;
        obj.f8338g = i11;
        obj.h = i12;
        obj.f8339i = j11;
        obj.f8340j = botApp;
        obj.f8341k = z10;
        obj.f8342l = str3;
        obj.f8343m = user;
        obj.f8344n = i13;
        obj.f8345o = z11;
        obj.f8346p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f8345o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f8346p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f8347q = tLObject;
        this.f8348r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f8334a == f5Var.f8334a && this.f8335b == f5Var.f8335b && this.f8336c == f5Var.f8336c && TextUtils.equals(this.f8337f, f5Var.f8337f) && this.f8338g == f5Var.f8338g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f8340j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f18349id;
                }
                TLRPC.BotApp botApp2 = f5Var.f8340j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f18349id;
                }
                if (j3 == j10 && this.f8341k == f5Var.f8341k && TextUtils.equals(this.f8342l, f5Var.f8342l)) {
                    TLRPC.User user = this.f8343m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f18499id;
                    }
                    TLRPC.User user2 = f5Var.f8343m;
                    if (user2 != null) {
                        j12 = user2.f18499id;
                    }
                    if (j11 == j12 && this.f8344n == f5Var.f8344n) {
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
