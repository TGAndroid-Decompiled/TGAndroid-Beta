package hi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c5 {
    public int f12914a;
    public long f12915b;
    public long f12916c;
    public long d;
    public String e;
    public String f12917f;
    public int f12918g;
    public int h;
    public long f12919i;
    public TLRPC.BotApp f12920j;
    public boolean f12921k;
    public String f12922l;
    public TLRPC.User f12923m;
    public int f12924n;
    public boolean f12925o;
    public boolean f12926p;
    public TLObject f12927q;
    public long f12928r;

    public static c5 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f12914a = i10;
        obj.f12915b = j10;
        obj.f12916c = j11;
        obj.e = str;
        obj.f12917f = str2;
        obj.f12918g = i11;
        obj.h = i12;
        obj.f12919i = j12;
        obj.f12920j = botApp;
        obj.f12921k = z10;
        obj.f12922l = str3;
        obj.f12923m = user;
        obj.f12924n = i13;
        obj.f12925o = z11;
        obj.f12926p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f12925o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f12926p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f12927q = tLObject;
        this.f12928r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof c5) {
            c5 c5Var = (c5) obj;
            if (this.f12914a == c5Var.f12914a && this.f12915b == c5Var.f12915b && this.f12916c == c5Var.f12916c && TextUtils.equals(this.f12917f, c5Var.f12917f) && this.f12918g == c5Var.f12918g && this.h == c5Var.h) {
                TLRPC.BotApp botApp = this.f12920j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f22025id;
                }
                TLRPC.BotApp botApp2 = c5Var.f12920j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f22025id;
                }
                if (j10 == j11 && this.f12921k == c5Var.f12921k && TextUtils.equals(this.f12922l, c5Var.f12922l)) {
                    TLRPC.User user = this.f12923m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f22177id;
                    }
                    TLRPC.User user2 = c5Var.f12923m;
                    if (user2 != null) {
                        j13 = user2.f22177id;
                    }
                    if (j12 == j13 && this.f12924n == c5Var.f12924n) {
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
