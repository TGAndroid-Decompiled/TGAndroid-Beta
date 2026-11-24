package defpackage;

import android.text.TextUtils;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class rn7 implements p8c {
    public final int[] a;
    public final u41 b;
    public final u41 c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final fx0 e;
    public final boolean f;
    public final String g;
    public final TLRPC.UrlAuthResult h;
    public final String[] i;
    public final boolean j;
    public final hv0 k;
    public final String l;
    public final wjb m;

    public rn7(int[] iArr, u41 u41Var, u41 u41Var2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, fx0 fx0Var, boolean z, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z2, hv0 hv0Var, String str2, wjb wjbVar) {
        this.a = iArr;
        this.b = u41Var;
        this.c = u41Var2;
        this.d = tL_messages_requestUrlAuth;
        this.e = fx0Var;
        this.f = z;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z2;
        this.k = hv0Var;
        this.l = str2;
        this.m = wjbVar;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.a;
        u41 u41Var = this.b;
        u41 u41Var2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final fx0 fx0Var = this.e;
        final boolean z = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z2 = this.j;
        final hv0 hv0Var = this.k;
        final String str2 = this.l;
        final wjb wjbVar = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !u41Var.R && !u41Var2.R) {
            final hd hdVar = new hd(3, null, a.b);
            hdVar.q(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new hc((byte) 0), new i8c() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence M2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    hd.this.dismiss();
                    fx0 fx0Var2 = fx0Var;
                    if (urlAuthResult2 != null) {
                        fx0Var2.dismiss();
                        un7.b(z, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z2, hv0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            fx0Var2.dismiss();
                            u21 a = un7.a();
                            String M0 = k96.M0(2131753125, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                M2 = k96.M0(2131753126, null);
                            } else {
                                M2 = gl.M2(bkb.v0(bkb.wj, wjbVar), k96.a0(null, null, 2131753127, str3));
                            }
                            a.I(2131624012, M0, M2).j();
                            return;
                        }
                        ug8.u(fx0Var2.F, fx0Var2.J0, tL_error, false);
                    }
                }
            });
        }
    }
}
