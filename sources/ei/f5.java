package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f8339a;
    public long f8340b;
    public long f8341c;
    public long d;
    public String e;
    public String f8342f;
    public int f8343g;
    public int h;
    public long f8344i;
    public TLRPC.BotApp f8345j;
    public boolean f8346k;
    public String f8347l;
    public TLRPC.User f8348m;
    public int f8349n;
    public boolean f8350o;
    public boolean f8351p;
    public TLObject f8352q;
    public long f8353r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f8339a = i10;
        obj.f8340b = j3;
        obj.f8341c = j10;
        obj.e = str;
        obj.f8342f = str2;
        obj.f8343g = i11;
        obj.h = i12;
        obj.f8344i = j11;
        obj.f8345j = botApp;
        obj.f8346k = z10;
        obj.f8347l = str3;
        obj.f8348m = user;
        obj.f8349n = i13;
        obj.f8350o = z11;
        obj.f8351p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f8350o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f8351p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f8352q = tLObject;
        this.f8353r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f8339a == f5Var.f8339a && this.f8340b == f5Var.f8340b && this.f8341c == f5Var.f8341c && TextUtils.equals(this.f8342f, f5Var.f8342f) && this.f8343g == f5Var.f8343g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f8345j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f18340id;
                }
                TLRPC.BotApp botApp2 = f5Var.f8345j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f18340id;
                }
                if (j3 == j10 && this.f8346k == f5Var.f8346k && TextUtils.equals(this.f8347l, f5Var.f8347l)) {
                    TLRPC.User user = this.f8348m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f18490id;
                    }
                    TLRPC.User user2 = f5Var.f8348m;
                    if (user2 != null) {
                        j12 = user2.f18490id;
                    }
                    if (j11 == j12 && this.f8349n == f5Var.f8349n) {
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
