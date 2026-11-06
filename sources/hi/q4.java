package hi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q4 {
    public int f14886a;
    public long f14887b;
    public long f14888c;
    public long d;
    public String f14889e;
    public String f14890f;
    public int f14891g;
    public int h;
    public long f14892i;
    public TLRPC.BotApp f14893j;
    public boolean f14894k;
    public String f14895l;
    public TLRPC.User f14896m;
    public int f14897n;
    public boolean f14898o;
    public boolean f14899p;
    public TLObject f14900q;
    public long f14901r;

    public static q4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z9, String str3, TLRPC.User user, int i12, boolean z10, boolean z11) {
        ?? obj = new Object();
        obj.f14886a = i7;
        obj.f14887b = j3;
        obj.f14888c = j10;
        obj.f14889e = str;
        obj.f14890f = str2;
        obj.f14891g = i10;
        obj.h = i11;
        obj.f14892i = j11;
        obj.f14893j = botApp;
        obj.f14894k = z9;
        obj.f14895l = str3;
        obj.f14896m = user;
        obj.f14897n = i12;
        obj.f14898o = z10;
        obj.f14899p = z11;
        if (!z10 && !z11 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f14898o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f14899p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f14900q = tLObject;
        this.f14901r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof q4) {
            q4 q4Var = (q4) obj;
            if (this.f14886a == q4Var.f14886a && this.f14887b == q4Var.f14887b && this.f14888c == q4Var.f14888c && TextUtils.equals(this.f14890f, q4Var.f14890f) && this.f14891g == q4Var.f14891g && this.h == q4Var.h) {
                TLRPC.BotApp botApp = this.f14893j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f26949id;
                }
                TLRPC.BotApp botApp2 = q4Var.f14893j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f26949id;
                }
                if (j3 == j10 && this.f14894k == q4Var.f14894k && TextUtils.equals(this.f14895l, q4Var.f14895l)) {
                    TLRPC.User user = this.f14896m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f27101id;
                    }
                    TLRPC.User user2 = q4Var.f14896m;
                    if (user2 != null) {
                        j12 = user2.f27101id;
                    }
                    if (j11 == j12 && this.f14897n == q4Var.f14897n) {
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
