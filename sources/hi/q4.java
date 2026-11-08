package hi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q4 {
    public int f14889a;
    public long f14890b;
    public long f14891c;
    public long d;
    public String f14892e;
    public String f14893f;
    public int f14894g;
    public int h;
    public long f14895i;
    public TLRPC.BotApp f14896j;
    public boolean f14897k;
    public String f14898l;
    public TLRPC.User f14899m;
    public int f14900n;
    public boolean f14901o;
    public boolean f14902p;
    public TLObject f14903q;
    public long f14904r;

    public static q4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z9, String str3, TLRPC.User user, int i12, boolean z10, boolean z11) {
        ?? obj = new Object();
        obj.f14889a = i7;
        obj.f14890b = j3;
        obj.f14891c = j10;
        obj.f14892e = str;
        obj.f14893f = str2;
        obj.f14894g = i10;
        obj.h = i11;
        obj.f14895i = j11;
        obj.f14896j = botApp;
        obj.f14897k = z9;
        obj.f14898l = str3;
        obj.f14899m = user;
        obj.f14900n = i12;
        obj.f14901o = z10;
        obj.f14902p = z11;
        if (!z10 && !z11 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f14901o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f14902p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f14903q = tLObject;
        this.f14904r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof q4) {
            q4 q4Var = (q4) obj;
            if (this.f14889a == q4Var.f14889a && this.f14890b == q4Var.f14890b && this.f14891c == q4Var.f14891c && TextUtils.equals(this.f14893f, q4Var.f14893f) && this.f14894g == q4Var.f14894g && this.h == q4Var.h) {
                TLRPC.BotApp botApp = this.f14896j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f26953id;
                }
                TLRPC.BotApp botApp2 = q4Var.f14896j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f26953id;
                }
                if (j3 == j10 && this.f14897k == q4Var.f14897k && TextUtils.equals(this.f14898l, q4Var.f14898l)) {
                    TLRPC.User user = this.f14899m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f27105id;
                    }
                    TLRPC.User user2 = q4Var.f14899m;
                    if (user2 != null) {
                        j12 = user2.f27105id;
                    }
                    if (j11 == j12 && this.f14900n == q4Var.f14900n) {
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
