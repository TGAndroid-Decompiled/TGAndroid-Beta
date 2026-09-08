package fi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f9691a;
    public long f9692b;
    public long f9693c;
    public long d;
    public String f9694e;
    public String f9695f;
    public int f9696g;
    public int h;
    public long f9697i;
    public TLRPC.BotApp f9698j;
    public boolean f9699k;
    public String f9700l;
    public TLRPC.User f9701m;
    public int f9702n;
    public boolean f9703o;
    public boolean f9704p;
    public TLObject f9705q;
    public long f9706r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f9691a = i10;
        obj.f9692b = j3;
        obj.f9693c = j10;
        obj.f9694e = str;
        obj.f9695f = str2;
        obj.f9696g = i11;
        obj.h = i12;
        obj.f9697i = j11;
        obj.f9698j = botApp;
        obj.f9699k = z10;
        obj.f9700l = str3;
        obj.f9701m = user;
        obj.f9702n = i13;
        obj.f9703o = z11;
        obj.f9704p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f9703o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f9704p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f9705q = tLObject;
        this.f9706r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f9691a == f5Var.f9691a && this.f9692b == f5Var.f9692b && this.f9693c == f5Var.f9693c && TextUtils.equals(this.f9695f, f5Var.f9695f) && this.f9696g == f5Var.f9696g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f9698j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f19893id;
                }
                TLRPC.BotApp botApp2 = f5Var.f9698j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f19893id;
                }
                if (j3 == j10 && this.f9699k == f5Var.f9699k && TextUtils.equals(this.f9700l, f5Var.f9700l)) {
                    TLRPC.User user = this.f9701m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f20043id;
                    }
                    TLRPC.User user2 = f5Var.f9701m;
                    if (user2 != null) {
                        j12 = user2.f20043id;
                    }
                    if (j11 == j12 && this.f9702n == f5Var.f9702n) {
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
