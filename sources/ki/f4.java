package ki;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f4 {
    public int f18666a;
    public long f18667b;
    public long f18668c;
    public long d;
    public String f18669e;
    public String f18670f;
    public int f18671g;
    public int h;
    public long f18672i;
    public TLRPC.BotApp f18673j;
    public boolean f18674k;
    public String f18675l;
    public TLRPC.User f18676m;
    public int f18677n;
    public boolean f18678o;
    public boolean f18679p;
    public TLObject f18680q;
    public long f18681r;

    public static f4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f18666a = i7;
        obj.f18667b = j3;
        obj.f18668c = j10;
        obj.f18669e = str;
        obj.f18670f = str2;
        obj.f18671g = i10;
        obj.h = i11;
        obj.f18672i = j11;
        obj.f18673j = botApp;
        obj.f18674k = z10;
        obj.f18675l = str3;
        obj.f18676m = user;
        obj.f18677n = i12;
        obj.f18678o = z11;
        obj.f18679p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f18678o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f18679p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f18680q = tLObject;
        this.f18681r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f4) {
            f4 f4Var = (f4) obj;
            if (this.f18666a == f4Var.f18666a && this.f18667b == f4Var.f18667b && this.f18668c == f4Var.f18668c && TextUtils.equals(this.f18670f, f4Var.f18670f) && this.f18671g == f4Var.f18671g && this.h == f4Var.h) {
                TLRPC.BotApp botApp = this.f18673j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f28402id;
                }
                TLRPC.BotApp botApp2 = f4Var.f18673j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f28402id;
                }
                if (j3 == j10 && this.f18674k == f4Var.f18674k && TextUtils.equals(this.f18675l, f4Var.f18675l)) {
                    TLRPC.User user = this.f18676m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f28554id;
                    }
                    TLRPC.User user2 = f4Var.f18676m;
                    if (user2 != null) {
                        j12 = user2.f28554id;
                    }
                    if (j11 == j12 && this.f18677n == f4Var.f18677n) {
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
