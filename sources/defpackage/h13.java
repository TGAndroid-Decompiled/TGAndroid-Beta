package defpackage;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class h13 implements Runnable {
    public final int E;
    public final eh F;
    public final my0 G;
    public final boolean[] a;
    public final int[] b;
    public final up6 c;
    public final String[] d;
    public final b61 e;
    public final su3 f;
    public final TreeSet h;
    public final pz2 n;
    public final njb r;
    public final ylb s;
    public final int[] w;
    public final Runnable[] x;
    public final int[] y;

    public h13(boolean[] zArr, int[] iArr, up6 up6Var, String[] strArr, b61 b61Var, su3 su3Var, TreeSet treeSet, pz2 pz2Var, njb njbVar, ylb ylbVar, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i, eh ehVar, my0 my0Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = up6Var;
        this.d = strArr;
        this.e = b61Var;
        this.f = su3Var;
        this.h = treeSet;
        this.n = pz2Var;
        this.r = njbVar;
        this.s = ylbVar;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.E = i;
        this.F = ehVar;
        this.G = my0Var;
    }

    @Override
    public final void run() {
        int i;
        final boolean[] zArr = this.a;
        if (!zArr[0] && this.b[0] < 0) {
            this.c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final b61 b61Var = this.e;
            b61Var.setLoading(false);
            b61Var.setEnabled(false);
            String charSequence = this.f.getText().toString();
            StringBuilder s = td4.s(charSequence);
            String str = "bot";
            boolean a = l13.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            s.append((a || l13.c(charSequence, treeSet) != null) ? "" : "");
            final String sb = s.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final pz2 pz2Var = this.n;
            if (isEmpty) {
                pz2Var.run();
                return;
            }
            int length = sb.length();
            final njb njbVar = this.r;
            final ylb ylbVar = this.s;
            if (length >= 4 && sb.length() <= 32) {
                njbVar.setText(jb6.M0(2131743353, null));
                anb.X(njbVar.getTextView(), cmb.A6, ylbVar);
                final int[] iArr = this.w;
                final int i2 = iArr[0];
                final Runnable[] runnableArr = this.x;
                final int[] iArr2 = this.y;
                final int i3 = this.E;
                final eh ehVar = this.F;
                final my0 my0Var = this.G;
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
                                kc kcVar = new kc((byte) 0);
                                final int[] iArr4 = iArr2;
                                final String[] strArr2 = strArr;
                                final b61 b61Var2 = b61Var;
                                final pz2 pz2Var2 = pz2Var;
                                final TreeSet treeSet2 = treeSet;
                                final eh ehVar2 = ehVar;
                                final ylb ylbVar2 = ylbVar;
                                final njb njbVar2 = njbVar;
                                final my0 my0Var2 = my0Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, kcVar, new jac() {
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
                                                b61 b61Var3 = b61Var2;
                                                if (z) {
                                                    strArr2[0] = str4;
                                                    b61Var3.setEnabled(true);
                                                    pz2Var2.run();
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
                                                eh ehVar3 = ehVar2;
                                                ylb ylbVar3 = ylbVar2;
                                                CharSequence d = l13.d(i7, str4, treeSet3, str5, ehVar3, ylbVar3);
                                                if (d != null) {
                                                    M0 = d;
                                                } else {
                                                    M0 = jb6.M0(2131751664, null);
                                                }
                                                njb njbVar3 = njbVar2;
                                                njbVar3.setText(M0);
                                                anb.X(njbVar3.getTextView(), cmb.p7, ylbVar3);
                                                if (d == null && tL_error != null) {
                                                    b61Var3.setEnabled(true);
                                                    wi8.u(my0Var2.F, ylbVar3, tL_error, false);
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
                gm.d3(runnable, 300L);
                return;
            }
            if (sb.length() < 4) {
                i = 2131743341;
            } else {
                i = 2131743342;
            }
            njbVar.setText(jb6.M0(i, null));
            anb.X(njbVar.getTextView(), cmb.p7, ylbVar);
        }
    }
}
