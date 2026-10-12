package fi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e5 {
    public int f9251a;
    public long f9252b;
    public long f9253c;
    public long d;
    public String e;
    public String f9254f;
    public int f9255g;
    public int h;
    public long f9256i;
    public TLRPC.BotApp f9257j;
    public boolean f9258k;
    public String f9259l;
    public TLRPC.User f9260m;
    public int f9261n;
    public boolean f9262o;
    public boolean f9263p;
    public TLObject f9264q;
    public long f9265r;

    public static e5 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f9251a = i10;
        obj.f9252b = j10;
        obj.f9253c = j11;
        obj.e = str;
        obj.f9254f = str2;
        obj.f9255g = i11;
        obj.h = i12;
        obj.f9256i = j12;
        obj.f9257j = botApp;
        obj.f9258k = z10;
        obj.f9259l = str3;
        obj.f9260m = user;
        obj.f9261n = i13;
        obj.f9262o = z11;
        obj.f9263p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f9262o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f9263p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f9264q = tLObject;
        this.f9265r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof e5) {
            e5 e5Var = (e5) obj;
            if (this.f9251a == e5Var.f9251a && this.f9252b == e5Var.f9252b && this.f9253c == e5Var.f9253c && TextUtils.equals(this.f9254f, e5Var.f9254f) && this.f9255g == e5Var.f9255g && this.h == e5Var.h) {
                TLRPC.BotApp botApp = this.f9257j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f19213id;
                }
                TLRPC.BotApp botApp2 = e5Var.f9257j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f19213id;
                }
                if (j10 == j11 && this.f9258k == e5Var.f9258k && TextUtils.equals(this.f9259l, e5Var.f9259l)) {
                    TLRPC.User user = this.f9260m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f19363id;
                    }
                    TLRPC.User user2 = e5Var.f9260m;
                    if (user2 != null) {
                        j13 = user2.f19363id;
                    }
                    if (j12 == j13 && this.f9261n == e5Var.f9261n) {
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
