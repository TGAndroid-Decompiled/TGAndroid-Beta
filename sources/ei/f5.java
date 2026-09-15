package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f8335a;
    public long f8336b;
    public long f8337c;
    public long d;
    public String e;
    public String f8338f;
    public int f8339g;
    public int h;
    public long f8340i;
    public TLRPC.BotApp f8341j;
    public boolean f8342k;
    public String f8343l;
    public TLRPC.User f8344m;
    public int f8345n;
    public boolean f8346o;
    public boolean f8347p;
    public TLObject f8348q;
    public long f8349r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f8335a = i10;
        obj.f8336b = j3;
        obj.f8337c = j10;
        obj.e = str;
        obj.f8338f = str2;
        obj.f8339g = i11;
        obj.h = i12;
        obj.f8340i = j11;
        obj.f8341j = botApp;
        obj.f8342k = z10;
        obj.f8343l = str3;
        obj.f8344m = user;
        obj.f8345n = i13;
        obj.f8346o = z11;
        obj.f8347p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f8346o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f8347p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f8348q = tLObject;
        this.f8349r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f8335a == f5Var.f8335a && this.f8336b == f5Var.f8336b && this.f8337c == f5Var.f8337c && TextUtils.equals(this.f8338f, f5Var.f8338f) && this.f8339g == f5Var.f8339g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f8341j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f18109id;
                }
                TLRPC.BotApp botApp2 = f5Var.f8341j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f18109id;
                }
                if (j3 == j10 && this.f8342k == f5Var.f8342k && TextUtils.equals(this.f8343l, f5Var.f8343l)) {
                    TLRPC.User user = this.f8344m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f18259id;
                    }
                    TLRPC.User user2 = f5Var.f8344m;
                    if (user2 != null) {
                        j12 = user2.f18259id;
                    }
                    if (j11 == j12 && this.f8345n == f5Var.f8345n) {
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
