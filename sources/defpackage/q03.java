package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class q03 implements Runnable {
    public final boolean[] E;
    public final pcc F;
    public final nx0 G;
    public final zd H;
    public final vnb I;
    public final ilb J;
    public final Context K;
    public final boolean[] a;
    public final int[] b;
    public final zt3 c;
    public final TreeSet d;
    public final String[] e;
    public final p03 f;
    public final zt3 h;
    public final int[] n;
    public final gp6 r;
    public final c51 s;
    public final boolean w;
    public final int x;
    public final TLRPC.User y;

    public q03(boolean[] zArr, int[] iArr, zt3 zt3Var, TreeSet treeSet, String[] strArr, p03 p03Var, zt3 zt3Var2, int[] iArr2, gp6 gp6Var, c51 c51Var, boolean z, int i, TLRPC.User user, boolean[] zArr2, pcc pccVar, nx0 nx0Var, zd zdVar, vnb vnbVar, ilb ilbVar, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = zt3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = p03Var;
        this.h = zt3Var2;
        this.n = iArr2;
        this.r = gp6Var;
        this.s = c51Var;
        this.w = z;
        this.x = i;
        this.y = user;
        this.E = zArr2;
        this.F = pccVar;
        this.G = nx0Var;
        this.H = zdVar;
        this.I = vnbVar;
        this.J = ilbVar;
        this.K = context;
    }

    @Override
    public final void run() {
        final zt3 zt3Var = this.h;
        yt3 yt3Var = zt3Var.d;
        final boolean[] zArr = this.a;
        if (!zArr[0]) {
            final int[] iArr = this.b;
            if (iArr[0] < 0) {
                final zt3 zt3Var2 = this.c;
                String charSequence = zt3Var2.getText().toString();
                StringBuilder r = qd4.r(charSequence);
                String str = "bot";
                boolean a = t03.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                r.append((a || t03.c(charSequence, treeSet) != null) ? "" : "");
                String sb = r.toString();
                final String[] strArr = this.e;
                if (!TextUtils.equals(strArr[0], sb)) {
                    this.f.run();
                    return;
                }
                String trim = yt3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.n;
                if (isEmpty) {
                    int i = -iArr2[0];
                    iArr2[0] = i;
                    hl.A3(i, zt3Var, null);
                    return;
                }
                this.r.run();
                final c51 c51Var = this.s;
                c51Var.setLoading(true);
                c51Var.setEnabled(false);
                yt3Var.setEnabled(false);
                zt3Var2.d.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.w;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i2 = this.x;
                uc7 s1 = uc7.s1(i2);
                final TLRPC.User user = this.y;
                createbot.manager_id = s1.q1(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                ic icVar = new ic((byte) 0);
                final boolean[] zArr2 = this.E;
                final pcc pccVar = this.F;
                final nx0 nx0Var = this.G;
                final zd zdVar = this.H;
                final vnb vnbVar = this.I;
                final ilb ilbVar = this.J;
                final Context context = this.K;
                iArr[0] = connectionsManager.sendRequestTyped(createbot, icVar, new icc() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        String r2;
                        String a0;
                        TLRPC.User user2 = (TLRPC.User) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (!zArr[0]) {
                            iArr[0] = -1;
                            c51 c51Var2 = c51Var;
                            c51Var2.setLoading(false);
                            c51Var2.setEnabled(true);
                            zt3Var.d.setEnabled(true);
                            zt3Var2.d.setEnabled(true);
                            int i3 = i2;
                            nx0 nx0Var2 = nx0Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                uc7.s1(i3).i4(user2, false, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                kf7.a0(i3).n1(arrayList, null, false, false);
                                pccVar.a(user2);
                                nx0Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                zd zdVar2 = zdVar;
                                vnb vnbVar2 = vnbVar;
                                CharSequence d = t03.d(i3, str2, treeSet2, str3, zdVar2, vnbVar2);
                                if (d != null) {
                                    strArr[0] = null;
                                    c51Var2.setEnabled(false);
                                    ilb ilbVar2 = ilbVar;
                                    ilbVar2.setText(d);
                                    yob.X(ilbVar2.getTextView(), aob.q7, vnbVar2);
                                    int[] iArr3 = iArr2;
                                    int i4 = -iArr3[0];
                                    iArr3[0] = i4;
                                    hl.A3(i4, ilbVar2, null);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    hr hrVar = uc7.s1(i3).l4;
                                    boolean p = yac.h(i3).p();
                                    d31 d31Var = new d31(nx0Var2.F, vnbVar2);
                                    String M0 = ob6.M0(2131751700, null);
                                    if (p) {
                                        a0 = ob6.a0(null, null, 2131751703, Integer.valueOf(hrVar.X.f()));
                                    } else {
                                        a0 = ob6.a0(null, null, 2131751702, Integer.valueOf(hrVar.X.f()), Integer.valueOf(hrVar.W.f()));
                                    }
                                    SpannableStringBuilder K2 = hl.K2(a0, aob.v0(aob.xj, vnbVar2), new ax0(nx0Var2, (byte) 3));
                                    bv2 bv2Var = new bv2(nx0Var2, context, (byte) 8);
                                    int t = hl.t(K2, "@BotFather");
                                    if (t >= 0) {
                                        K2.setSpan(new r1((Object) vnbVar2, (Runnable) bv2Var, (byte) 6), t, t + 10, 33);
                                    }
                                    v21 I = d31Var.I(2131624012, M0, K2);
                                    I.j = 8000;
                                    I.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new d31(nx0Var2.F, vnbVar2).I(2131624012, ob6.M0(2131751700, null), ob6.a0(null, null, 2131751701, ob6.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(lbc.p(user3))) {
                                            r2 = "@" + lbc.p(user3);
                                        } else {
                                            r2 = lbc.r(user3);
                                        }
                                        new d31(nx0Var2.F, vnbVar2).Q(2131624012, 36, hl.L2(aob.v0(aob.xj, vnbVar2), ob6.a0(null, null, 2131751695, r2))).j();
                                    } else {
                                        ik8.u(nx0Var2.F, vnbVar2, tL_error, false);
                                    }
                                }
                                hl.t1(nx0Var2.getCurrentFocus());
                            }
                        }
                    }
                }, 1024);
            }
        }
    }
}
