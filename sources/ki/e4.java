package ki;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e4 {
    public int f18676a;
    public long f18677b;
    public long f18678c;
    public long d;
    public String f18679e;
    public String f18680f;
    public int f18681g;
    public int h;
    public long f18682i;
    public TLRPC.BotApp f18683j;
    public boolean f18684k;
    public String f18685l;
    public TLRPC.User f18686m;
    public int f18687n;
    public boolean f18688o;
    public boolean f18689p;
    public TLObject f18690q;
    public long f18691r;

    public static e4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f18676a = i7;
        obj.f18677b = j3;
        obj.f18678c = j10;
        obj.f18679e = str;
        obj.f18680f = str2;
        obj.f18681g = i10;
        obj.h = i11;
        obj.f18682i = j11;
        obj.f18683j = botApp;
        obj.f18684k = z10;
        obj.f18685l = str3;
        obj.f18686m = user;
        obj.f18687n = i12;
        obj.f18688o = z11;
        obj.f18689p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f18688o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f18689p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f18690q = tLObject;
        this.f18691r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof e4) {
            e4 e4Var = (e4) obj;
            if (this.f18676a == e4Var.f18676a && this.f18677b == e4Var.f18677b && this.f18678c == e4Var.f18678c && TextUtils.equals(this.f18680f, e4Var.f18680f) && this.f18681g == e4Var.f18681g && this.h == e4Var.h) {
                TLRPC.BotApp botApp = this.f18683j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f28431id;
                }
                TLRPC.BotApp botApp2 = e4Var.f18683j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f28431id;
                }
                if (j3 == j10 && this.f18684k == e4Var.f18684k && TextUtils.equals(this.f18685l, e4Var.f18685l)) {
                    TLRPC.User user = this.f18686m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f28583id;
                    }
                    TLRPC.User user2 = e4Var.f18686m;
                    if (user2 != null) {
                        j12 = user2.f28583id;
                    }
                    if (j11 == j12 && this.f18687n == e4Var.f18687n) {
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
