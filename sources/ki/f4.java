package ki;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f4 {
    public int f18663a;
    public long f18664b;
    public long f18665c;
    public long d;
    public String f18666e;
    public String f18667f;
    public int f18668g;
    public int h;
    public long f18669i;
    public TLRPC.BotApp f18670j;
    public boolean f18671k;
    public String f18672l;
    public TLRPC.User f18673m;
    public int f18674n;
    public boolean f18675o;
    public boolean f18676p;
    public TLObject f18677q;
    public long f18678r;

    public static f4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f18663a = i7;
        obj.f18664b = j3;
        obj.f18665c = j10;
        obj.f18666e = str;
        obj.f18667f = str2;
        obj.f18668g = i10;
        obj.h = i11;
        obj.f18669i = j11;
        obj.f18670j = botApp;
        obj.f18671k = z10;
        obj.f18672l = str3;
        obj.f18673m = user;
        obj.f18674n = i12;
        obj.f18675o = z11;
        obj.f18676p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f18675o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f18676p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f18677q = tLObject;
        this.f18678r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f4) {
            f4 f4Var = (f4) obj;
            if (this.f18663a == f4Var.f18663a && this.f18664b == f4Var.f18664b && this.f18665c == f4Var.f18665c && TextUtils.equals(this.f18667f, f4Var.f18667f) && this.f18668g == f4Var.f18668g && this.h == f4Var.h) {
                TLRPC.BotApp botApp = this.f18670j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f28400id;
                }
                TLRPC.BotApp botApp2 = f4Var.f18670j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f28400id;
                }
                if (j3 == j10 && this.f18671k == f4Var.f18671k && TextUtils.equals(this.f18672l, f4Var.f18672l)) {
                    TLRPC.User user = this.f18673m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f28552id;
                    }
                    TLRPC.User user2 = f4Var.f18673m;
                    if (user2 != null) {
                        j12 = user2.f28552id;
                    }
                    if (j11 == j12 && this.f18674n == f4Var.f18674n) {
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
