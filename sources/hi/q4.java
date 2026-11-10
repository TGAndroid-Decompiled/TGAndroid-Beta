package hi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q4 {
    public int f14891a;
    public long f14892b;
    public long f14893c;
    public long d;
    public String f14894e;
    public String f14895f;
    public int f14896g;
    public int h;
    public long f14897i;
    public TLRPC.BotApp f14898j;
    public boolean f14899k;
    public String f14900l;
    public TLRPC.User f14901m;
    public int f14902n;
    public boolean f14903o;
    public boolean f14904p;
    public TLObject f14905q;
    public long f14906r;

    public static q4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z9, String str3, TLRPC.User user, int i12, boolean z10, boolean z11) {
        ?? obj = new Object();
        obj.f14891a = i7;
        obj.f14892b = j3;
        obj.f14893c = j10;
        obj.f14894e = str;
        obj.f14895f = str2;
        obj.f14896g = i10;
        obj.h = i11;
        obj.f14897i = j11;
        obj.f14898j = botApp;
        obj.f14899k = z9;
        obj.f14900l = str3;
        obj.f14901m = user;
        obj.f14902n = i12;
        obj.f14903o = z10;
        obj.f14904p = z11;
        if (!z10 && !z11 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f14903o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f14904p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f14905q = tLObject;
        this.f14906r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof q4) {
            q4 q4Var = (q4) obj;
            if (this.f14891a == q4Var.f14891a && this.f14892b == q4Var.f14892b && this.f14893c == q4Var.f14893c && TextUtils.equals(this.f14895f, q4Var.f14895f) && this.f14896g == q4Var.f14896g && this.h == q4Var.h) {
                TLRPC.BotApp botApp = this.f14898j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f26957id;
                }
                TLRPC.BotApp botApp2 = q4Var.f14898j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f26957id;
                }
                if (j3 == j10 && this.f14899k == q4Var.f14899k && TextUtils.equals(this.f14900l, q4Var.f14900l)) {
                    TLRPC.User user = this.f14901m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f27109id;
                    }
                    TLRPC.User user2 = q4Var.f14901m;
                    if (user2 != null) {
                        j12 = user2.f27109id;
                    }
                    if (j11 == j12 && this.f14902n == q4Var.f14902n) {
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
