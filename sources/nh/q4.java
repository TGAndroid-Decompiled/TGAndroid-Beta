package nh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class q4 {

    public int f18905a;

    public long f18906b;

    public long f18907c;
    public long d;

    public String f18908e;

    public String f18909f;

    public int f18910g;
    public int h;

    public long f18911i;

    public TLRPC.BotApp f18912j;

    public boolean f18913k;

    public String f18914l;

    public TLRPC.User f18915m;

    public int f18916n;

    public boolean f18917o;

    public boolean f18918p;

    public TLObject f18919q;

    public long f18920r;

    public static q4 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        q4 q4Var = new q4();
        q4Var.f18905a = i10;
        q4Var.f18906b = j10;
        q4Var.f18907c = j11;
        q4Var.f18908e = str;
        q4Var.f18909f = str2;
        q4Var.f18910g = i11;
        q4Var.h = i12;
        q4Var.f18911i = j12;
        q4Var.f18912j = botApp;
        q4Var.f18913k = z10;
        q4Var.f18914l = str3;
        q4Var.f18915m = user;
        q4Var.f18916n = i13;
        q4Var.f18917o = z11;
        q4Var.f18918p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri uri = Uri.parse(str2);
                q4Var.f18917o = TextUtils.equals(uri.getQueryParameter("mode"), "compact");
                q4Var.f18918p = TextUtils.equals(uri.getQueryParameter("mode"), "fullscreen");
                return q4Var;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return q4Var;
    }

    public final void a(TLObject tLObject) {
        this.f18919q = tLObject;
        this.f18920r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        if (this.f18905a != q4Var.f18905a || this.f18906b != q4Var.f18906b || this.f18907c != q4Var.f18907c || !TextUtils.equals(this.f18909f, q4Var.f18909f) || this.f18910g != q4Var.f18910g || this.h != q4Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.f18912j;
        long j10 = botApp == null ? 0L : botApp.f22377id;
        TLRPC.BotApp botApp2 = q4Var.f18912j;
        if (j10 != (botApp2 == null ? 0L : botApp2.f22377id) || this.f18913k != q4Var.f18913k || !TextUtils.equals(this.f18914l, q4Var.f18914l)) {
            return false;
        }
        TLRPC.User user = this.f18915m;
        long j11 = user == null ? 0L : user.f22527id;
        TLRPC.User user2 = q4Var.f18915m;
        return j11 == (user2 != null ? user2.f22527id : 0L) && this.f18916n == q4Var.f18916n;
    }
}
