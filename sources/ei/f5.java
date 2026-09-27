package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f8324a;
    public long f8325b;
    public long f8326c;
    public long d;
    public String e;
    public String f8327f;
    public int f8328g;
    public int h;
    public long f8329i;
    public TLRPC.BotApp f8330j;
    public boolean f8331k;
    public String f8332l;
    public TLRPC.User f8333m;
    public int f8334n;
    public boolean f8335o;
    public boolean f8336p;
    public TLObject f8337q;
    public long f8338r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f8324a = i10;
        obj.f8325b = j3;
        obj.f8326c = j10;
        obj.e = str;
        obj.f8327f = str2;
        obj.f8328g = i11;
        obj.h = i12;
        obj.f8329i = j11;
        obj.f8330j = botApp;
        obj.f8331k = z10;
        obj.f8332l = str3;
        obj.f8333m = user;
        obj.f8334n = i13;
        obj.f8335o = z11;
        obj.f8336p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f8335o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f8336p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f8337q = tLObject;
        this.f8338r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f8324a == f5Var.f8324a && this.f8325b == f5Var.f8325b && this.f8326c == f5Var.f8326c && TextUtils.equals(this.f8327f, f5Var.f8327f) && this.f8328g == f5Var.f8328g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f8330j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f18326id;
                }
                TLRPC.BotApp botApp2 = f5Var.f8330j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f18326id;
                }
                if (j3 == j10 && this.f8331k == f5Var.f8331k && TextUtils.equals(this.f8332l, f5Var.f8332l)) {
                    TLRPC.User user = this.f8333m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f18476id;
                    }
                    TLRPC.User user2 = f5Var.f8333m;
                    if (user2 != null) {
                        j12 = user2.f18476id;
                    }
                    if (j11 == j12 && this.f8334n == f5Var.f8334n) {
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
