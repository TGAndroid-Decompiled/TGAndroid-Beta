package hi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c5 {
    public int f12915a;
    public long f12916b;
    public long f12917c;
    public long d;
    public String e;
    public String f12918f;
    public int f12919g;
    public int h;
    public long f12920i;
    public TLRPC.BotApp f12921j;
    public boolean f12922k;
    public String f12923l;
    public TLRPC.User f12924m;
    public int f12925n;
    public boolean f12926o;
    public boolean f12927p;
    public TLObject f12928q;
    public long f12929r;

    public static c5 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f12915a = i10;
        obj.f12916b = j10;
        obj.f12917c = j11;
        obj.e = str;
        obj.f12918f = str2;
        obj.f12919g = i11;
        obj.h = i12;
        obj.f12920i = j12;
        obj.f12921j = botApp;
        obj.f12922k = z10;
        obj.f12923l = str3;
        obj.f12924m = user;
        obj.f12925n = i13;
        obj.f12926o = z11;
        obj.f12927p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f12926o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f12927p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f12928q = tLObject;
        this.f12929r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof c5) {
            c5 c5Var = (c5) obj;
            if (this.f12915a == c5Var.f12915a && this.f12916b == c5Var.f12916b && this.f12917c == c5Var.f12917c && TextUtils.equals(this.f12918f, c5Var.f12918f) && this.f12919g == c5Var.f12919g && this.h == c5Var.h) {
                TLRPC.BotApp botApp = this.f12921j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f22024id;
                }
                TLRPC.BotApp botApp2 = c5Var.f12921j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f22024id;
                }
                if (j10 == j11 && this.f12922k == c5Var.f12922k && TextUtils.equals(this.f12923l, c5Var.f12923l)) {
                    TLRPC.User user = this.f12924m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f22174id;
                    }
                    TLRPC.User user2 = c5Var.f12924m;
                    if (user2 != null) {
                        j13 = user2.f22174id;
                    }
                    if (j12 == j13 && this.f12925n == c5Var.f12925n) {
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
