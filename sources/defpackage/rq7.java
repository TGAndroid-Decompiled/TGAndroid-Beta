package defpackage;

import android.text.TextUtils;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class rq7 implements pcc {
    public final int[] a;
    public final c51 b;
    public final c51 c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final nx0 e;
    public final boolean f;
    public final String g;
    public final TLRPC.UrlAuthResult h;
    public final String[] i;
    public final boolean j;
    public final rv0 k;
    public final String l;
    public final vnb m;

    public rq7(int[] iArr, c51 c51Var, c51 c51Var2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, nx0 nx0Var, boolean z, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z2, rv0 rv0Var, String str2, vnb vnbVar) {
        this.a = iArr;
        this.b = c51Var;
        this.c = c51Var2;
        this.d = tL_messages_requestUrlAuth;
        this.e = nx0Var;
        this.f = z;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z2;
        this.k = rv0Var;
        this.l = str2;
        this.m = vnbVar;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.a;
        c51 c51Var = this.b;
        c51 c51Var2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final nx0 nx0Var = this.e;
        final boolean z = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z2 = this.j;
        final rv0 rv0Var = this.k;
        final String str2 = this.l;
        final vnb vnbVar = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !c51Var.R && !c51Var2.R) {
            final id idVar = new id(3, null, a.b);
            idVar.q(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new ic((byte) 0), new icc() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence L2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    id.this.dismiss();
                    nx0 nx0Var2 = nx0Var;
                    if (urlAuthResult2 != null) {
                        nx0Var2.dismiss();
                        uq7.b(z, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z2, rv0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            nx0Var2.dismiss();
                            d31 a = uq7.a();
                            String M0 = ob6.M0(2131753121, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                L2 = ob6.M0(2131753122, null);
                            } else {
                                L2 = hl.L2(aob.v0(aob.xj, vnbVar), ob6.a0(null, null, 2131753123, str3));
                            }
                            a.I(2131624012, M0, L2).j();
                            return;
                        }
                        ik8.u(nx0Var2.F, nx0Var2.J0, tL_error, false);
                    }
                }
            });
        }
    }
}
