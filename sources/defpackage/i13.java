package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class i13 implements Runnable {
    public final boolean[] E;
    public final qac F;
    public final my0 G;
    public final eh H;
    public final ylb I;
    public final njb J;
    public final Context K;
    public final boolean[] a;
    public final int[] b;
    public final su3 c;
    public final TreeSet d;
    public final String[] e;
    public final h13 f;
    public final su3 h;
    public final int[] n;
    public final up6 r;
    public final b61 s;
    public final boolean w;
    public final int x;
    public final TLRPC.User y;

    public i13(boolean[] zArr, int[] iArr, su3 su3Var, TreeSet treeSet, String[] strArr, h13 h13Var, su3 su3Var2, int[] iArr2, up6 up6Var, b61 b61Var, boolean z, int i, TLRPC.User user, boolean[] zArr2, qac qacVar, my0 my0Var, eh ehVar, ylb ylbVar, njb njbVar, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = su3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = h13Var;
        this.h = su3Var2;
        this.n = iArr2;
        this.r = up6Var;
        this.s = b61Var;
        this.w = z;
        this.x = i;
        this.y = user;
        this.E = zArr2;
        this.F = qacVar;
        this.G = my0Var;
        this.H = ehVar;
        this.I = ylbVar;
        this.J = njbVar;
        this.K = context;
    }

    @Override
    public final void run() {
        final su3 su3Var = this.h;
        ru3 ru3Var = su3Var.d;
        final boolean[] zArr = this.a;
        if (!zArr[0]) {
            final int[] iArr = this.b;
            if (iArr[0] < 0) {
                final su3 su3Var2 = this.c;
                String charSequence = su3Var2.getText().toString();
                StringBuilder s = td4.s(charSequence);
                String str = "bot";
                boolean a = l13.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                s.append((a || l13.c(charSequence, treeSet) != null) ? "" : "");
                String sb = s.toString();
                final String[] strArr = this.e;
                if (!TextUtils.equals(strArr[0], sb)) {
                    this.f.run();
                    return;
                }
                String trim = ru3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.n;
                if (isEmpty) {
                    int i = -iArr2[0];
                    iArr2[0] = i;
                    gm.A3(i, su3Var, null);
                    return;
                }
                this.r.run();
                final b61 b61Var = this.s;
                b61Var.setLoading(true);
                b61Var.setEnabled(false);
                ru3Var.setEnabled(false);
                su3Var2.d.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.w;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i2 = this.x;
                oc7 r1 = oc7.r1(i2);
                final TLRPC.User user = this.y;
                createbot.manager_id = r1.p1(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                kc kcVar = new kc((byte) 0);
                final boolean[] zArr2 = this.E;
                final qac qacVar = this.F;
                final my0 my0Var = this.G;
                final eh ehVar = this.H;
                final ylb ylbVar = this.I;
                final njb njbVar = this.J;
                final Context context = this.K;
                iArr[0] = connectionsManager.sendRequestTyped(createbot, kcVar, new jac() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        String r;
                        String a0;
                        TLRPC.User user2 = (TLRPC.User) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (!zArr[0]) {
                            iArr[0] = -1;
                            b61 b61Var2 = b61Var;
                            b61Var2.setLoading(false);
                            b61Var2.setEnabled(true);
                            su3Var.d.setEnabled(true);
                            su3Var2.d.setEnabled(true);
                            int i3 = i2;
                            my0 my0Var2 = my0Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                oc7.r1(i3).c4(user2, false, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                cf7.Y(i3).j1(arrayList, null, false, false);
                                qacVar.a(user2);
                                my0Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                eh ehVar2 = ehVar;
                                ylb ylbVar2 = ylbVar;
                                CharSequence d = l13.d(i3, str2, treeSet2, str3, ehVar2, ylbVar2);
                                if (d != null) {
                                    strArr[0] = null;
                                    b61Var2.setEnabled(false);
                                    njb njbVar2 = njbVar;
                                    njbVar2.setText(d);
                                    anb.X(njbVar2.getTextView(), cmb.p7, ylbVar2);
                                    int[] iArr3 = iArr2;
                                    int i4 = -iArr3[0];
                                    iArr3[0] = i4;
                                    gm.A3(i4, njbVar2, null);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    gs gsVar = oc7.r1(i3).l4;
                                    boolean p = z8c.h(i3).p();
                                    c41 c41Var = new c41(my0Var2.F, ylbVar2);
                                    String M0 = jb6.M0(2131751672, null);
                                    if (p) {
                                        a0 = jb6.a0(null, null, 2131751675, Integer.valueOf(gsVar.Q.f()));
                                    } else {
                                        a0 = jb6.a0(null, null, 2131751674, Integer.valueOf(gsVar.Q.f()), Integer.valueOf(gsVar.P.f()));
                                    }
                                    SpannableStringBuilder K2 = gm.K2(a0, cmb.v0(cmb.wj, ylbVar2), new zx0(my0Var2, (byte) 3));
                                    mv2 mv2Var = new mv2(my0Var2, context, (byte) 10);
                                    int t = gm.t(K2, "@BotFather");
                                    if (t >= 0) {
                                        K2.setSpan(new q1((Object) ylbVar2, (Runnable) mv2Var, (byte) 6), t, t + 10, 33);
                                    }
                                    u31 I = c41Var.I(2131624012, M0, K2);
                                    I.j = 8000;
                                    I.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new c41(my0Var2.F, ylbVar2).I(2131624012, jb6.M0(2131751672, null), jb6.a0(null, null, 2131751673, jb6.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(m9c.p(user3))) {
                                            r = "@" + m9c.p(user3);
                                        } else {
                                            r = m9c.r(user3);
                                        }
                                        new c41(my0Var2.F, ylbVar2).Q(2131624012, 36, gm.L2(cmb.v0(cmb.wj, ylbVar2), jb6.a0(null, null, 2131751667, r))).j();
                                    } else {
                                        wi8.u(my0Var2.F, ylbVar2, tL_error, false);
                                    }
                                }
                                gm.t1(my0Var2.getCurrentFocus());
                            }
                        }
                    }
                }, 1024);
            }
        }
    }
}
