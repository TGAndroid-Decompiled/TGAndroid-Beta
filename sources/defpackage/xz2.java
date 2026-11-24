package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class xz2 implements Runnable {
    public final boolean[] E;
    public final p8c F;
    public final fx0 G;
    public final eg H;
    public final wjb I;
    public final mhb J;
    public final Context K;
    public final boolean[] a;
    public final int[] b;
    public final it3 c;
    public final TreeSet d;
    public final String[] e;
    public final wz2 f;
    public final it3 h;
    public final int[] n;
    public final tn6 r;
    public final u41 s;
    public final boolean w;
    public final int x;
    public final TLRPC.User y;

    public xz2(boolean[] zArr, int[] iArr, it3 it3Var, TreeSet treeSet, String[] strArr, wz2 wz2Var, it3 it3Var2, int[] iArr2, tn6 tn6Var, u41 u41Var, boolean z, int i, TLRPC.User user, boolean[] zArr2, p8c p8cVar, fx0 fx0Var, eg egVar, wjb wjbVar, mhb mhbVar, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = it3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = wz2Var;
        this.h = it3Var2;
        this.n = iArr2;
        this.r = tn6Var;
        this.s = u41Var;
        this.w = z;
        this.x = i;
        this.y = user;
        this.E = zArr2;
        this.F = p8cVar;
        this.G = fx0Var;
        this.H = egVar;
        this.I = wjbVar;
        this.J = mhbVar;
        this.K = context;
    }

    @Override
    public final void run() {
        final it3 it3Var = this.h;
        ht3 ht3Var = it3Var.d;
        final boolean[] zArr = this.a;
        if (!zArr[0]) {
            final int[] iArr = this.b;
            if (iArr[0] < 0) {
                final it3 it3Var2 = this.c;
                String charSequence = it3Var2.getText().toString();
                StringBuilder r = tb4.r(charSequence);
                String str = "bot";
                boolean a = a03.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                r.append((a || a03.c(charSequence, treeSet) != null) ? "" : "");
                String sb = r.toString();
                final String[] strArr = this.e;
                if (!TextUtils.equals(strArr[0], sb)) {
                    this.f.run();
                    return;
                }
                String trim = ht3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.n;
                if (isEmpty) {
                    int i = -iArr2[0];
                    iArr2[0] = i;
                    gl.B3(i, it3Var, null);
                    return;
                }
                this.r.run();
                final u41 u41Var = this.s;
                u41Var.setLoading(true);
                u41Var.setEnabled(false);
                ht3Var.setEnabled(false);
                it3Var2.d.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.w;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i2 = this.x;
                na7 q1 = na7.q1(i2);
                final TLRPC.User user = this.y;
                createbot.manager_id = q1.o1(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                hc hcVar = new hc((byte) 0);
                final boolean[] zArr2 = this.E;
                final p8c p8cVar = this.F;
                final fx0 fx0Var = this.G;
                final eg egVar = this.H;
                final wjb wjbVar = this.I;
                final mhb mhbVar = this.J;
                final Context context = this.K;
                iArr[0] = connectionsManager.sendRequestTyped(createbot, hcVar, new i8c() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        String q;
                        String a0;
                        TLRPC.User user2 = (TLRPC.User) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (!zArr[0]) {
                            iArr[0] = -1;
                            u41 u41Var2 = u41Var;
                            u41Var2.setLoading(false);
                            u41Var2.setEnabled(true);
                            it3Var.d.setEnabled(true);
                            it3Var2.d.setEnabled(true);
                            int i3 = i2;
                            fx0 fx0Var2 = fx0Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                na7.q1(i3).Z3(user2, false, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                ad7.Y(i3).j1(arrayList, null, false, false);
                                p8cVar.a(user2);
                                fx0Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                eg egVar2 = egVar;
                                wjb wjbVar2 = wjbVar;
                                CharSequence d = a03.d(i3, str2, treeSet2, str3, egVar2, wjbVar2);
                                if (d != null) {
                                    strArr[0] = null;
                                    u41Var2.setEnabled(false);
                                    mhb mhbVar2 = mhbVar;
                                    mhbVar2.setText(d);
                                    zkb.X(mhbVar2.getTextView(), bkb.p7, wjbVar2);
                                    int[] iArr3 = iArr2;
                                    int i4 = -iArr3[0];
                                    iArr3[0] = i4;
                                    gl.B3(i4, mhbVar2, null);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    gr grVar = na7.q1(i3).k4;
                                    boolean p = y6c.h(i3).p();
                                    u21 u21Var = new u21(fx0Var2.F, wjbVar2);
                                    String M0 = k96.M0(2131751723, null);
                                    if (p) {
                                        a0 = k96.a0(null, null, 2131751726, Integer.valueOf(grVar.Q.f()));
                                    } else {
                                        a0 = k96.a0(null, null, 2131751725, Integer.valueOf(grVar.Q.f()), Integer.valueOf(grVar.P.f()));
                                    }
                                    SpannableStringBuilder L2 = gl.L2(a0, bkb.v0(bkb.wj, wjbVar2), new rw0(fx0Var2, (byte) 3));
                                    gu2 gu2Var = new gu2(fx0Var2, context, (byte) 9);
                                    int t = gl.t(L2, "@BotFather");
                                    if (t >= 0) {
                                        L2.setSpan(new q1((Object) wjbVar2, (Runnable) gu2Var, (byte) 6), t, t + 10, 33);
                                    }
                                    m21 I = u21Var.I(2131624012, M0, L2);
                                    I.j = 8000;
                                    I.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new u21(fx0Var2.F, wjbVar2).I(2131624012, k96.M0(2131751723, null), k96.a0(null, null, 2131751724, k96.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(l7c.o(user3))) {
                                            q = "@" + l7c.o(user3);
                                        } else {
                                            q = l7c.q(user3);
                                        }
                                        new u21(fx0Var2.F, wjbVar2).Q(2131624012, 36, gl.M2(bkb.v0(bkb.wj, wjbVar2), k96.a0(null, null, 2131751718, q))).j();
                                    } else {
                                        ug8.u(fx0Var2.F, wjbVar2, tL_error, false);
                                    }
                                }
                                gl.t1(fx0Var2.getCurrentFocus());
                            }
                        }
                    }
                }, 1024);
            }
        }
    }
}
