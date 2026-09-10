package di;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j5 {
    public int f6705a;
    public long f6706b;
    public long f6707c;
    public long d;
    public String e;
    public String f6708f;
    public int f6709g;
    public int h;
    public long f6710i;
    public TLRPC.BotApp f6711j;
    public boolean f6712k;
    public String f6713l;
    public TLRPC.User f6714m;
    public int f6715n;
    public boolean f6716o;
    public boolean f6717p;
    public TLObject f6718q;
    public long f6719r;

    public static j5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f6705a = i10;
        obj.f6706b = j3;
        obj.f6707c = j10;
        obj.e = str;
        obj.f6708f = str2;
        obj.f6709g = i11;
        obj.h = i12;
        obj.f6710i = j11;
        obj.f6711j = botApp;
        obj.f6712k = z10;
        obj.f6713l = str3;
        obj.f6714m = user;
        obj.f6715n = i13;
        obj.f6716o = z11;
        obj.f6717p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f6716o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f6717p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f6718q = tLObject;
        this.f6719r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof j5) {
            j5 j5Var = (j5) obj;
            if (this.f6705a == j5Var.f6705a && this.f6706b == j5Var.f6706b && this.f6707c == j5Var.f6707c && TextUtils.equals(this.f6708f, j5Var.f6708f) && this.f6709g == j5Var.f6709g && this.h == j5Var.h) {
                TLRPC.BotApp botApp = this.f6711j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f17192id;
                }
                TLRPC.BotApp botApp2 = j5Var.f6711j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f17192id;
                }
                if (j3 == j10 && this.f6712k == j5Var.f6712k && TextUtils.equals(this.f6713l, j5Var.f6713l)) {
                    TLRPC.User user = this.f6714m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f17342id;
                    }
                    TLRPC.User user2 = j5Var.f6714m;
                    if (user2 != null) {
                        j12 = user2.f17342id;
                    }
                    if (j11 == j12 && this.f6715n == j5Var.f6715n) {
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
