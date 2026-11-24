package defpackage;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class wz2 implements Runnable {
    public final int E;
    public final eg F;
    public final fx0 G;
    public final boolean[] a;
    public final int[] b;
    public final tn6 c;
    public final String[] d;
    public final u41 e;
    public final it3 f;
    public final TreeSet h;
    public final jn1 n;
    public final mhb r;
    public final wjb s;
    public final int[] w;
    public final Runnable[] x;
    public final int[] y;

    public wz2(boolean[] zArr, int[] iArr, tn6 tn6Var, String[] strArr, u41 u41Var, it3 it3Var, TreeSet treeSet, jn1 jn1Var, mhb mhbVar, wjb wjbVar, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i, eg egVar, fx0 fx0Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = tn6Var;
        this.d = strArr;
        this.e = u41Var;
        this.f = it3Var;
        this.h = treeSet;
        this.n = jn1Var;
        this.r = mhbVar;
        this.s = wjbVar;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.E = i;
        this.F = egVar;
        this.G = fx0Var;
    }

    @Override
    public final void run() {
        int i;
        final boolean[] zArr = this.a;
        if (!zArr[0] && this.b[0] < 0) {
            this.c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final u41 u41Var = this.e;
            u41Var.setLoading(false);
            u41Var.setEnabled(false);
            String charSequence = this.f.getText().toString();
            StringBuilder r = tb4.r(charSequence);
            String str = "bot";
            boolean a = a03.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            r.append((a || a03.c(charSequence, treeSet) != null) ? "" : "");
            final String sb = r.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final jn1 jn1Var = this.n;
            if (isEmpty) {
                jn1Var.run();
                return;
            }
            int length = sb.length();
            final mhb mhbVar = this.r;
            final wjb wjbVar = this.s;
            if (length >= 4 && sb.length() <= 32) {
                mhbVar.setText(k96.M0(2131743427, null));
                zkb.X(mhbVar.getTextView(), bkb.A6, wjbVar);
                final int[] iArr = this.w;
                final int i2 = iArr[0];
                final Runnable[] runnableArr = this.x;
                final int[] iArr2 = this.y;
                final int i3 = this.E;
                final eg egVar = this.F;
                final fx0 fx0Var = this.G;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        runnableArr[0] = null;
                        final boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            final int[] iArr3 = iArr;
                            int i4 = iArr3[0];
                            final int i5 = i2;
                            if (i5 == i4) {
                                TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                                final String str2 = sb;
                                checkusername.username = str2;
                                final int i6 = i3;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i6);
                                hc hcVar = new hc((byte) 0);
                                final int[] iArr4 = iArr2;
                                final String[] strArr2 = strArr;
                                final u41 u41Var2 = u41Var;
                                final jn1 jn1Var2 = jn1Var;
                                final TreeSet treeSet2 = treeSet;
                                final eg egVar2 = egVar;
                                final wjb wjbVar2 = wjbVar;
                                final mhb mhbVar2 = mhbVar;
                                final fx0 fx0Var2 = fx0Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, hcVar, new i8c() {
                                    @Override
                                    public final void a(Object obj, Object obj2) {
                                        String str3;
                                        CharSequence M0;
                                        TLRPC.Bool bool = (TLRPC.Bool) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (!zArr2[0]) {
                                            if (i5 == iArr3[0]) {
                                                iArr4[0] = -1;
                                                boolean z = bool instanceof TLRPC.TL_boolTrue;
                                                String str4 = str2;
                                                u41 u41Var3 = u41Var2;
                                                if (z) {
                                                    strArr2[0] = str4;
                                                    u41Var3.setEnabled(true);
                                                    jn1Var2.run();
                                                    return;
                                                }
                                                if (tL_error == null) {
                                                    str3 = "USERNAME_OCCUPIED";
                                                } else {
                                                    str3 = tL_error.text;
                                                }
                                                String str5 = str3;
                                                int i7 = i6;
                                                TreeSet treeSet3 = treeSet2;
                                                eg egVar3 = egVar2;
                                                wjb wjbVar3 = wjbVar2;
                                                CharSequence d = a03.d(i7, str4, treeSet3, str5, egVar3, wjbVar3);
                                                if (d != null) {
                                                    M0 = d;
                                                } else {
                                                    M0 = k96.M0(2131751715, null);
                                                }
                                                mhb mhbVar3 = mhbVar2;
                                                mhbVar3.setText(M0);
                                                zkb.X(mhbVar3.getTextView(), bkb.p7, wjbVar3);
                                                if (d == null && tL_error != null) {
                                                    u41Var3.setEnabled(true);
                                                    ug8.u(fx0Var2.F, wjbVar3, tL_error, false);
                                                }
                                            }
                                        }
                                    }
                                });
                            }
                        }
                    }
                };
                runnableArr[0] = runnable;
                gl.e3(runnable, 300L);
                return;
            }
            if (sb.length() < 4) {
                i = 2131743415;
            } else {
                i = 2131743416;
            }
            mhbVar.setText(k96.M0(i, null));
            zkb.X(mhbVar.getTextView(), bkb.p7, wjbVar);
        }
    }
}
