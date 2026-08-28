package mh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s4 {
    public int f18105a;
    public long f18106b;
    public long f18107c;
    public long d;
    public String f18108e;
    public String f18109f;
    public int f18110g;
    public int h;
    public long f18111i;
    public TLRPC.BotApp f18112j;
    public boolean f18113k;
    public String f18114l;
    public TLRPC.User f18115m;
    public int f18116n;
    public boolean f18117o;
    public boolean f18118p;
    public TLObject f18119q;
    public long f18120r;

    public static s4 b(int i9, long j10, long j11, String str, String str2, int i10, int i11, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f18105a = i9;
        obj.f18106b = j10;
        obj.f18107c = j11;
        obj.f18108e = str;
        obj.f18109f = str2;
        obj.f18110g = i10;
        obj.h = i11;
        obj.f18111i = j12;
        obj.f18112j = botApp;
        obj.f18113k = z10;
        obj.f18114l = str3;
        obj.f18115m = user;
        obj.f18116n = i12;
        obj.f18117o = z11;
        obj.f18118p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f18117o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f18118p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f18119q = tLObject;
        this.f18120r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof s4) {
            s4 s4Var = (s4) obj;
            if (this.f18105a == s4Var.f18105a && this.f18106b == s4Var.f18106b && this.f18107c == s4Var.f18107c && TextUtils.equals(this.f18109f, s4Var.f18109f) && this.f18110g == s4Var.f18110g && this.h == s4Var.h) {
                TLRPC.BotApp botApp = this.f18112j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f22377id;
                }
                TLRPC.BotApp botApp2 = s4Var.f18112j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f22377id;
                }
                if (j10 == j11 && this.f18113k == s4Var.f18113k && TextUtils.equals(this.f18114l, s4Var.f18114l)) {
                    TLRPC.User user = this.f18115m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f22527id;
                    }
                    TLRPC.User user2 = s4Var.f18115m;
                    if (user2 != null) {
                        j13 = user2.f22527id;
                    }
                    if (j12 == j13 && this.f18116n == s4Var.f18116n) {
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
