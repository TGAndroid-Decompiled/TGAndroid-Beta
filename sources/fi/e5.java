package fi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e5 {
    public int f9254a;
    public long f9255b;
    public long f9256c;
    public long d;
    public String e;
    public String f9257f;
    public int f9258g;
    public int h;
    public long f9259i;
    public TLRPC.BotApp f9260j;
    public boolean f9261k;
    public String f9262l;
    public TLRPC.User f9263m;
    public int f9264n;
    public boolean f9265o;
    public boolean f9266p;
    public TLObject f9267q;
    public long f9268r;

    public static e5 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f9254a = i10;
        obj.f9255b = j10;
        obj.f9256c = j11;
        obj.e = str;
        obj.f9257f = str2;
        obj.f9258g = i11;
        obj.h = i12;
        obj.f9259i = j12;
        obj.f9260j = botApp;
        obj.f9261k = z10;
        obj.f9262l = str3;
        obj.f9263m = user;
        obj.f9264n = i13;
        obj.f9265o = z11;
        obj.f9266p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f9265o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f9266p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f9267q = tLObject;
        this.f9268r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof e5) {
            e5 e5Var = (e5) obj;
            if (this.f9254a == e5Var.f9254a && this.f9255b == e5Var.f9255b && this.f9256c == e5Var.f9256c && TextUtils.equals(this.f9257f, e5Var.f9257f) && this.f9258g == e5Var.f9258g && this.h == e5Var.h) {
                TLRPC.BotApp botApp = this.f9260j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f18913id;
                }
                TLRPC.BotApp botApp2 = e5Var.f9260j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f18913id;
                }
                if (j10 == j11 && this.f9261k == e5Var.f9261k && TextUtils.equals(this.f9262l, e5Var.f9262l)) {
                    TLRPC.User user = this.f9263m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f19063id;
                    }
                    TLRPC.User user2 = e5Var.f9263m;
                    if (user2 != null) {
                        j13 = user2.f19063id;
                    }
                    if (j12 == j13 && this.f9264n == e5Var.f9264n) {
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
