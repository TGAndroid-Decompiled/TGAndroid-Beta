package ki;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e4 {
    public int f18673a;
    public long f18674b;
    public long f18675c;
    public long d;
    public String f18676e;
    public String f18677f;
    public int f18678g;
    public int h;
    public long f18679i;
    public TLRPC.BotApp f18680j;
    public boolean f18681k;
    public String f18682l;
    public TLRPC.User f18683m;
    public int f18684n;
    public boolean f18685o;
    public boolean f18686p;
    public TLObject f18687q;
    public long f18688r;

    public static e4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f18673a = i7;
        obj.f18674b = j3;
        obj.f18675c = j10;
        obj.f18676e = str;
        obj.f18677f = str2;
        obj.f18678g = i10;
        obj.h = i11;
        obj.f18679i = j11;
        obj.f18680j = botApp;
        obj.f18681k = z10;
        obj.f18682l = str3;
        obj.f18683m = user;
        obj.f18684n = i12;
        obj.f18685o = z11;
        obj.f18686p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f18685o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f18686p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f18687q = tLObject;
        this.f18688r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof e4) {
            e4 e4Var = (e4) obj;
            if (this.f18673a == e4Var.f18673a && this.f18674b == e4Var.f18674b && this.f18675c == e4Var.f18675c && TextUtils.equals(this.f18677f, e4Var.f18677f) && this.f18678g == e4Var.f18678g && this.h == e4Var.h) {
                TLRPC.BotApp botApp = this.f18680j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f28428id;
                }
                TLRPC.BotApp botApp2 = e4Var.f18680j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f28428id;
                }
                if (j3 == j10 && this.f18681k == e4Var.f18681k && TextUtils.equals(this.f18682l, e4Var.f18682l)) {
                    TLRPC.User user = this.f18683m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f28580id;
                    }
                    TLRPC.User user2 = e4Var.f18683m;
                    if (user2 != null) {
                        j12 = user2.f28580id;
                    }
                    if (j11 == j12 && this.f18684n == e4Var.f18684n) {
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
