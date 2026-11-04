package ii;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q4 {
    public int f15164a;
    public long f15165b;
    public long f15166c;
    public long d;
    public String f15167e;
    public String f15168f;
    public int f15169g;
    public int h;
    public long f15170i;
    public TLRPC.BotApp f15171j;
    public boolean f15172k;
    public String f15173l;
    public TLRPC.User f15174m;
    public int f15175n;
    public boolean f15176o;
    public boolean f15177p;
    public TLObject f15178q;
    public long f15179r;

    public static q4 b(int i3, long j10, long j11, String str, String str2, int i10, int i11, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f15164a = i3;
        obj.f15165b = j10;
        obj.f15166c = j11;
        obj.f15167e = str;
        obj.f15168f = str2;
        obj.f15169g = i10;
        obj.h = i11;
        obj.f15170i = j12;
        obj.f15171j = botApp;
        obj.f15172k = z10;
        obj.f15173l = str3;
        obj.f15174m = user;
        obj.f15175n = i12;
        obj.f15176o = z11;
        obj.f15177p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f15176o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f15177p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f15178q = tLObject;
        this.f15179r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof q4) {
            q4 q4Var = (q4) obj;
            if (this.f15164a == q4Var.f15164a && this.f15165b == q4Var.f15165b && this.f15166c == q4Var.f15166c && TextUtils.equals(this.f15168f, q4Var.f15168f) && this.f15169g == q4Var.f15169g && this.h == q4Var.h) {
                TLRPC.BotApp botApp = this.f15171j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f26998id;
                }
                TLRPC.BotApp botApp2 = q4Var.f15171j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f26998id;
                }
                if (j10 == j11 && this.f15172k == q4Var.f15172k && TextUtils.equals(this.f15173l, q4Var.f15173l)) {
                    TLRPC.User user = this.f15174m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f27150id;
                    }
                    TLRPC.User user2 = q4Var.f15174m;
                    if (user2 != null) {
                        j13 = user2.f27150id;
                    }
                    if (j12 == j13 && this.f15175n == q4Var.f15175n) {
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
