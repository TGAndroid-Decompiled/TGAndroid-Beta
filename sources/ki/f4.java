package ki;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f4 {
    public int f18767a;
    public long f18768b;
    public long f18769c;
    public long d;
    public String f18770e;
    public String f18771f;
    public int f18772g;
    public int h;
    public long f18773i;
    public TLRPC.BotApp f18774j;
    public boolean f18775k;
    public String f18776l;
    public TLRPC.User f18777m;
    public int f18778n;
    public boolean f18779o;
    public boolean f18780p;
    public TLObject f18781q;
    public long f18782r;

    public static f4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f18767a = i7;
        obj.f18768b = j3;
        obj.f18769c = j10;
        obj.f18770e = str;
        obj.f18771f = str2;
        obj.f18772g = i10;
        obj.h = i11;
        obj.f18773i = j11;
        obj.f18774j = botApp;
        obj.f18775k = z10;
        obj.f18776l = str3;
        obj.f18777m = user;
        obj.f18778n = i12;
        obj.f18779o = z11;
        obj.f18780p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f18779o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f18780p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f18781q = tLObject;
        this.f18782r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f4) {
            f4 f4Var = (f4) obj;
            if (this.f18767a == f4Var.f18767a && this.f18768b == f4Var.f18768b && this.f18769c == f4Var.f18769c && TextUtils.equals(this.f18771f, f4Var.f18771f) && this.f18772g == f4Var.f18772g && this.h == f4Var.h) {
                TLRPC.BotApp botApp = this.f18774j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f28489id;
                }
                TLRPC.BotApp botApp2 = f4Var.f18774j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f28489id;
                }
                if (j3 == j10 && this.f18775k == f4Var.f18775k && TextUtils.equals(this.f18776l, f4Var.f18776l)) {
                    TLRPC.User user = this.f18777m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f28641id;
                    }
                    TLRPC.User user2 = f4Var.f18777m;
                    if (user2 != null) {
                        j12 = user2.f28641id;
                    }
                    if (j11 == j12 && this.f18778n == f4Var.f18778n) {
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
