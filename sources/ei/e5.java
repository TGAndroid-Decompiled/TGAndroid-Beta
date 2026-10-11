package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e5 {
    public int f9035a;
    public long f9036b;
    public long f9037c;
    public long d;
    public String f9038e;
    public String f9039f;
    public int f9040g;
    public int h;
    public long f9041i;
    public TLRPC.BotApp f9042j;
    public boolean f9043k;
    public String f9044l;
    public TLRPC.User f9045m;
    public int f9046n;
    public boolean f9047o;
    public boolean f9048p;
    public TLObject f9049q;
    public long f9050r;

    public static e5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f9035a = i10;
        obj.f9036b = j3;
        obj.f9037c = j10;
        obj.f9038e = str;
        obj.f9039f = str2;
        obj.f9040g = i11;
        obj.h = i12;
        obj.f9041i = j11;
        obj.f9042j = botApp;
        obj.f9043k = z10;
        obj.f9044l = str3;
        obj.f9045m = user;
        obj.f9046n = i13;
        obj.f9047o = z11;
        obj.f9048p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f9047o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f9048p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f9049q = tLObject;
        this.f9050r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof e5) {
            e5 e5Var = (e5) obj;
            if (this.f9035a == e5Var.f9035a && this.f9036b == e5Var.f9036b && this.f9037c == e5Var.f9037c && TextUtils.equals(this.f9039f, e5Var.f9039f) && this.f9040g == e5Var.f9040g && this.h == e5Var.h) {
                TLRPC.BotApp botApp = this.f9042j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f20065id;
                }
                TLRPC.BotApp botApp2 = e5Var.f9042j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f20065id;
                }
                if (j3 == j10 && this.f9043k == e5Var.f9043k && TextUtils.equals(this.f9044l, e5Var.f9044l)) {
                    TLRPC.User user = this.f9045m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f20215id;
                    }
                    TLRPC.User user2 = e5Var.f9045m;
                    if (user2 != null) {
                        j12 = user2.f20215id;
                    }
                    if (j11 == j12 && this.f9046n == e5Var.f9046n) {
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
