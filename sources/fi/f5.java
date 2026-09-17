package fi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f9663a;
    public long f9664b;
    public long f9665c;
    public long d;
    public String f9666e;
    public String f9667f;
    public int f9668g;
    public int h;
    public long f9669i;
    public TLRPC.BotApp f9670j;
    public boolean f9671k;
    public String f9672l;
    public TLRPC.User f9673m;
    public int f9674n;
    public boolean f9675o;
    public boolean f9676p;
    public TLObject f9677q;
    public long f9678r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f9663a = i10;
        obj.f9664b = j3;
        obj.f9665c = j10;
        obj.f9666e = str;
        obj.f9667f = str2;
        obj.f9668g = i11;
        obj.h = i12;
        obj.f9669i = j11;
        obj.f9670j = botApp;
        obj.f9671k = z10;
        obj.f9672l = str3;
        obj.f9673m = user;
        obj.f9674n = i13;
        obj.f9675o = z11;
        obj.f9676p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f9675o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f9676p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f9677q = tLObject;
        this.f9678r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.f9663a == f5Var.f9663a && this.f9664b == f5Var.f9664b && this.f9665c == f5Var.f9665c && TextUtils.equals(this.f9667f, f5Var.f9667f) && this.f9668g == f5Var.f9668g && this.h == f5Var.h) {
                TLRPC.BotApp botApp = this.f9670j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f19866id;
                }
                TLRPC.BotApp botApp2 = f5Var.f9670j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f19866id;
                }
                if (j3 == j10 && this.f9671k == f5Var.f9671k && TextUtils.equals(this.f9672l, f5Var.f9672l)) {
                    TLRPC.User user = this.f9673m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f20016id;
                    }
                    TLRPC.User user2 = f5Var.f9673m;
                    if (user2 != null) {
                        j12 = user2.f20016id;
                    }
                    if (j11 == j12 && this.f9674n == f5Var.f9674n) {
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
