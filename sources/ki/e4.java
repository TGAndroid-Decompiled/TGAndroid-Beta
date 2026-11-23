package ki;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e4 {
    public int f18642a;
    public long f18643b;
    public long f18644c;
    public long d;
    public String f18645e;
    public String f18646f;
    public int f18647g;
    public int h;
    public long f18648i;
    public TLRPC.BotApp f18649j;
    public boolean f18650k;
    public String f18651l;
    public TLRPC.User f18652m;
    public int f18653n;
    public boolean f18654o;
    public boolean f18655p;
    public TLObject f18656q;
    public long f18657r;

    public static e4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f18642a = i7;
        obj.f18643b = j3;
        obj.f18644c = j10;
        obj.f18645e = str;
        obj.f18646f = str2;
        obj.f18647g = i10;
        obj.h = i11;
        obj.f18648i = j11;
        obj.f18649j = botApp;
        obj.f18650k = z10;
        obj.f18651l = str3;
        obj.f18652m = user;
        obj.f18653n = i12;
        obj.f18654o = z11;
        obj.f18655p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f18654o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f18655p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f18656q = tLObject;
        this.f18657r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j3;
        long j10;
        long j11;
        if (obj instanceof e4) {
            e4 e4Var = (e4) obj;
            if (this.f18642a == e4Var.f18642a && this.f18643b == e4Var.f18643b && this.f18644c == e4Var.f18644c && TextUtils.equals(this.f18646f, e4Var.f18646f) && this.f18647g == e4Var.f18647g && this.h == e4Var.h) {
                TLRPC.BotApp botApp = this.f18649j;
                long j12 = 0;
                if (botApp == null) {
                    j3 = 0;
                } else {
                    j3 = botApp.f28395id;
                }
                TLRPC.BotApp botApp2 = e4Var.f18649j;
                if (botApp2 == null) {
                    j10 = 0;
                } else {
                    j10 = botApp2.f28395id;
                }
                if (j3 == j10 && this.f18650k == e4Var.f18650k && TextUtils.equals(this.f18651l, e4Var.f18651l)) {
                    TLRPC.User user = this.f18652m;
                    if (user == null) {
                        j11 = 0;
                    } else {
                        j11 = user.f28547id;
                    }
                    TLRPC.User user2 = e4Var.f18652m;
                    if (user2 != null) {
                        j12 = user2.f28547id;
                    }
                    if (j11 == j12 && this.f18653n == e4Var.f18653n) {
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
