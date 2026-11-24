package defpackage;

import android.text.TextUtils;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class up7 implements qac {
    public final int[] a;
    public final b61 b;
    public final b61 c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final my0 e;
    public final boolean f;
    public final String g;
    public final TLRPC.UrlAuthResult h;
    public final String[] i;
    public final boolean j;
    public final qw0 k;
    public final String l;
    public final ylb m;

    public up7(int[] iArr, b61 b61Var, b61 b61Var2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, my0 my0Var, boolean z, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z2, qw0 qw0Var, String str2, ylb ylbVar) {
        this.a = iArr;
        this.b = b61Var;
        this.c = b61Var2;
        this.d = tL_messages_requestUrlAuth;
        this.e = my0Var;
        this.f = z;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z2;
        this.k = qw0Var;
        this.l = str2;
        this.m = ylbVar;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.a;
        b61 b61Var = this.b;
        b61 b61Var2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final my0 my0Var = this.e;
        final boolean z = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z2 = this.j;
        final qw0 qw0Var = this.k;
        final String str2 = this.l;
        final ylb ylbVar = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !b61Var.R && !b61Var2.R) {
            final he heVar = new he(3, null, a.b);
            heVar.q(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new kc((byte) 0), new jac() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence L2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    he.this.dismiss();
                    my0 my0Var2 = my0Var;
                    if (urlAuthResult2 != null) {
                        my0Var2.dismiss();
                        xp7.b(z, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z2, qw0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            my0Var2.dismiss();
                            c41 a = xp7.a();
                            String M0 = jb6.M0(2131753093, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                L2 = jb6.M0(2131753094, null);
                            } else {
                                L2 = gm.L2(cmb.v0(cmb.wj, ylbVar), jb6.a0(null, null, 2131753095, str3));
                            }
                            a.I(2131624012, M0, L2).j();
                            return;
                        }
                        wi8.u(my0Var2.F, my0Var2.J0, tL_error, false);
                    }
                }
            });
        }
    }
}
