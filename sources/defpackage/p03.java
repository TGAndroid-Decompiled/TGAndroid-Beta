package defpackage;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class p03 implements Runnable {
    public final int E;
    public final zd F;
    public final nx0 G;
    public final boolean[] a;
    public final int[] b;
    public final gp6 c;
    public final String[] d;
    public final c51 e;
    public final zt3 f;
    public final TreeSet h;
    public final cv2 n;
    public final ilb r;
    public final vnb s;
    public final int[] w;
    public final Runnable[] x;
    public final int[] y;

    public p03(boolean[] zArr, int[] iArr, gp6 gp6Var, String[] strArr, c51 c51Var, zt3 zt3Var, TreeSet treeSet, cv2 cv2Var, ilb ilbVar, vnb vnbVar, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i, zd zdVar, nx0 nx0Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = gp6Var;
        this.d = strArr;
        this.e = c51Var;
        this.f = zt3Var;
        this.h = treeSet;
        this.n = cv2Var;
        this.r = ilbVar;
        this.s = vnbVar;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.E = i;
        this.F = zdVar;
        this.G = nx0Var;
    }

    @Override
    public final void run() {
        int i;
        final boolean[] zArr = this.a;
        if (!zArr[0] && this.b[0] < 0) {
            this.c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final c51 c51Var = this.e;
            c51Var.setLoading(false);
            c51Var.setEnabled(false);
            String charSequence = this.f.getText().toString();
            StringBuilder r = qd4.r(charSequence);
            String str = "bot";
            boolean a = t03.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            r.append((a || t03.c(charSequence, treeSet) != null) ? "" : "");
            final String sb = r.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final cv2 cv2Var = this.n;
            if (isEmpty) {
                cv2Var.run();
                return;
            }
            int length = sb.length();
            final ilb ilbVar = this.r;
            final vnb vnbVar = this.s;
            if (length >= 4 && sb.length() <= 32) {
                ilbVar.setText(ob6.M0(2131743321, null));
                yob.X(ilbVar.getTextView(), aob.B6, vnbVar);
                final int[] iArr = this.w;
                final int i2 = iArr[0];
                final Runnable[] runnableArr = this.x;
                final int[] iArr2 = this.y;
                final int i3 = this.E;
                final zd zdVar = this.F;
                final nx0 nx0Var = this.G;
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
                                ic icVar = new ic((byte) 0);
                                final int[] iArr4 = iArr2;
                                final String[] strArr2 = strArr;
                                final c51 c51Var2 = c51Var;
                                final cv2 cv2Var2 = cv2Var;
                                final TreeSet treeSet2 = treeSet;
                                final zd zdVar2 = zdVar;
                                final vnb vnbVar2 = vnbVar;
                                final ilb ilbVar2 = ilbVar;
                                final nx0 nx0Var2 = nx0Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, icVar, new icc() {
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
                                                c51 c51Var3 = c51Var2;
                                                if (z) {
                                                    strArr2[0] = str4;
                                                    c51Var3.setEnabled(true);
                                                    cv2Var2.run();
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
                                                zd zdVar3 = zdVar2;
                                                vnb vnbVar3 = vnbVar2;
                                                CharSequence d = t03.d(i7, str4, treeSet3, str5, zdVar3, vnbVar3);
                                                if (d != null) {
                                                    M0 = d;
                                                } else {
                                                    M0 = ob6.M0(2131751692, null);
                                                }
                                                ilb ilbVar3 = ilbVar2;
                                                ilbVar3.setText(M0);
                                                yob.X(ilbVar3.getTextView(), aob.q7, vnbVar3);
                                                if (d == null && tL_error != null) {
                                                    c51Var3.setEnabled(true);
                                                    ik8.u(nx0Var2.F, vnbVar3, tL_error, false);
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
                hl.d3(runnable, 300L);
                return;
            }
            if (sb.length() < 4) {
                i = 2131743309;
            } else {
                i = 2131743310;
            }
            ilbVar.setText(ob6.M0(i, null));
            yob.X(ilbVar.getTextView(), aob.q7, vnbVar);
        }
    }
}
