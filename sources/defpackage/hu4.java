package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.Wallet.c;
public final class hu4 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public hu4(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        ww0 ww0Var;
        cj3 cj3Var;
        fx0 fx0Var;
        View view2;
        String M0;
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                wjb wjbVar = (wjb) this.d;
                if (((lu4) this.b).A1.a == oj.a) {
                    new ava(context, wjbVar).show();
                    return;
                }
                return;
            case 1:
                wv4 wv4Var = (wv4) this.b;
                wv4Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.S = k96.M0(2131749386, null);
                alertDialog$Builder.a.U = gl.S2(k96.M0(2131749387, null));
                alertDialog$Builder.j(k96.M0(2131749388, null), new kx3(wv4Var, (byte) 27));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                ((d) this.d).showDialog(alertDialog$Builder.a);
                return;
            case 2:
                ki7 ki7Var = (ki7) this.c;
                wjb wjbVar2 = (wjb) this.d;
                if (gl.g(((JSONObject) this.b).optString("text"))) {
                    new u21(ki7Var.F, wjbVar2).i(k96.M0(2131742746, null)).j();
                    return;
                }
                return;
            case 3:
                ((i18) this.b).a(Long.valueOf(((long[]) this.c)[0]));
                ((fx0) this.d).dismiss();
                return;
            case 4:
                q88 q88Var = (q88) this.b;
                Context context2 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (q88Var.B1) {
                    yl2 yl2Var = new yl2(context2, q88Var.G1);
                    yl2Var.D0(q88Var.A1.a, 2);
                    yl2Var.r1 = new qx(q88Var, bitmap, (byte) 5);
                    yl2Var.q1 = new vv5(q88Var, (byte) 1);
                    yl2Var.show();
                    return;
                }
                Runnable runnable = q88Var.K1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                f36 f36Var = (f36) this.b;
                fx0 fx0Var2 = (fx0) this.c;
                d dVar = (d) this.d;
                try {
                    if (f36Var.b != null) {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f36Var.b));
                        if (fx0Var2 != null && (ww0Var = fx0Var2.c) != null) {
                            new u21(ww0Var, null).k(false).j();
                        } else {
                            u21.j(dVar).j();
                        }
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 6:
                ah6 ah6Var = (ah6) this.b;
                ah6Var.getClass();
                ((cs5) this.c).u();
                int i = ((t97) this.d).a;
                if (ah6Var.c.getCurrentPosition() == 0 && (cj3Var = ah6Var.K) != null) {
                    cj3Var.M4(i);
                    return;
                }
                if (ah6Var.K == null) {
                    ah6Var.q0(null);
                }
                ah6Var.J = Integer.valueOf(i);
                ah6Var.r0(0, true);
                ah6Var.c.E(0);
                return;
            case 7:
                f37 f37Var = (f37) this.b;
                k37 k37Var = (k37) this.c;
                k37 k37Var2 = (k37) this.d;
                l37 l37Var = f37Var.d0;
                o27 o27Var = l37Var.d;
                boolean z = o27Var.l;
                boolean z2 = !z;
                o27Var.l = z2;
                if (!z) {
                    if (!o27Var.k) {
                        o27Var.k = true;
                        l37Var.y = true;
                    }
                } else {
                    if (l37Var.y) {
                        o27Var.k = false;
                    }
                    l37Var.y = false;
                }
                k37Var.a(z2, true);
                k37Var2.a(o27Var.k, true);
                f37Var.i();
                f37Var.l(true);
                return;
            case 8:
                t47 t47Var = (t47) this.b;
                ij.Q((Context) this.c, t47Var.w1, new im6(t47Var, (byte) 8), (wjb) this.d, 0).M2();
                return;
            case 9:
                fx0[] fx0VarArr = (fx0[]) this.b;
                p8c p8cVar = (p8c) this.c;
                String str = (String) this.d;
                fx0 fx0Var3 = fx0VarArr[0];
                if (fx0Var3 != null) {
                    fx0Var3.dismiss();
                    fx0VarArr[0] = null;
                    p8cVar.a(str);
                    return;
                }
                return;
            case 10:
                fx0[] fx0VarArr2 = (fx0[]) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (!((u41) this.b).R && (fx0Var = fx0VarArr2[0]) != null) {
                    fx0Var.dismiss();
                    fx0VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 11:
                x6b x6bVar = (x6b) this.b;
                Context context3 = (Context) this.c;
                k38 k38Var = (k38) this.d;
                if (x6bVar.r1) {
                    yl2 yl2Var2 = new yl2(context3, x6bVar.w1);
                    x6bVar.J1 = yl2Var2;
                    yl2Var2.D0(x6bVar.q1.a, 2);
                    yl2Var2.r1 = new qx(x6bVar, k38Var, (byte) 6);
                    yl2Var2.q1 = new ac0(x6bVar, k38Var, (byte) 3);
                    yl2Var2.show();
                    return;
                }
                Runnable runnable3 = x6bVar.A1;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 12:
                y28 y28Var = ((s28) this.b).x;
                y28Var.x0((w5b) this.c, (TL_stories.StoryItem) this.d);
                s28 s28Var = y28Var.j1;
                if (s28Var != null) {
                    s28Var.a();
                    return;
                }
                return;
            case 13:
                s28 s28Var2 = (s28) this.b;
                m8b m8bVar = (m8b) this.d;
                ((a8) this.c).performHapticFeedback(3);
                u21 Y = u21.Y();
                if (Y != null) {
                    Y.Q(2131624056, 36, gl.N2(k96.M0(2131745741, null), -1, 0, new h18(s28Var2, m8bVar, (byte) 2), null)).j();
                    return;
                }
                return;
            case 14:
                ((g38) this.b).E0((TLRPC.ChatFull) this.c, (qa5) this.d);
                return;
            case 15:
                v98 v98Var = (v98) this.b;
                Context context4 = (Context) this.c;
                wjb wjbVar3 = (wjb) this.d;
                wr4 wr4Var = v98Var.h;
                if (wr4Var == null) {
                    wr4 wr4Var2 = new wr4(context4, wjbVar3, k96.M0(2131743368, null), v98Var.f);
                    v98Var.h = wr4Var2;
                    wr4Var2.n(new w88(v98Var, (byte) 5));
                    wr4Var = v98Var.h;
                    wr4Var.p1 = v98Var.n;
                }
                wr4Var.show();
                return;
            case 16:
                pq8 pq8Var = (pq8) this.b;
                ((cs5) this.c).u();
                lca lcaVar = pq8Var.a;
                hq8 hq8Var = new hq8(pq8Var, (TL_stars.SavedStarGift) this.d, (byte) 0);
                HashMap hashMap = tq8.V;
                lcaVar.h(hq8Var, null);
                return;
            case 17:
                ((eq2) this.b).n();
                ((wi9) this.c).C((ub9) this.d);
                return;
            case 18:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                ((m8) this.c).d(true);
                LongSparseArray l = saveToGallerySettingsActivity.getUserConfig().l(saveToGallerySettingsActivity.a);
                l.remove(((qp9) this.d).d);
                saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, l);
                saveToGallerySettingsActivity.d0();
                return;
            case 19:
                ((hz9) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                return;
            case 20:
                rz9 rz9Var = (rz9) this.b;
                hu0 hu0Var = new hu0(rz9Var, (byte) 11);
                g0a g0aVar = rz9Var.b;
                new qx3(hu0Var, g0aVar.getContext(), g0aVar.s, (ArrayList) this.c).show();
                ((cs5) this.d).u();
                return;
            case 21:
                final fx0 fx0Var4 = (fx0) this.c;
                final u41 u41Var = (u41) this.d;
                fx0Var4.c0 = false;
                u41Var.setLoading(true);
                ((ssa) this.b).a(new p8c() {
                    @Override
                    public final void a(Object obj) {
                        byte b = r3;
                        final u41 u41Var2 = u41Var;
                        final fx0 fx0Var5 = fx0Var4;
                        Boolean bool = (Boolean) obj;
                        switch (b) {
                            case 0:
                                if (bool.booleanValue()) {
                                    fx0Var5.dismiss();
                                    return;
                                } else {
                                    gl.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            u41 u41Var3 = u41Var2;
                                            fx0 fx0Var6 = fx0Var5;
                                            switch (b2) {
                                                case 0:
                                                    fx0Var6.c0 = false;
                                                    u41Var3.setLoading(false);
                                                    return;
                                                default:
                                                    fx0Var6.c0 = false;
                                                    u41Var3.setLoading(false);
                                                    return;
                                            }
                                        }
                                    }, 400L);
                                    return;
                                }
                            default:
                                if (bool.booleanValue()) {
                                    fx0Var5.dismiss();
                                    return;
                                } else {
                                    gl.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            u41 u41Var3 = u41Var2;
                                            fx0 fx0Var6 = fx0Var5;
                                            switch (b2) {
                                                case 0:
                                                    fx0Var6.c0 = false;
                                                    u41Var3.setLoading(false);
                                                    return;
                                                default:
                                                    fx0Var6.c0 = false;
                                                    u41Var3.setLoading(false);
                                                    return;
                                            }
                                        }
                                    }, 400L);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 22:
                final fx0 fx0Var5 = (fx0) this.c;
                final u41 u41Var2 = (u41) this.d;
                fx0Var5.c0 = false;
                u41Var2.setLoading(true);
                ((qsa) this.b).a(new p8c() {
                    @Override
                    public final void a(Object obj) {
                        byte b = r3;
                        final u41 u41Var22 = u41Var2;
                        final fx0 fx0Var52 = fx0Var5;
                        Boolean bool = (Boolean) obj;
                        switch (b) {
                            case 0:
                                if (bool.booleanValue()) {
                                    fx0Var52.dismiss();
                                    return;
                                } else {
                                    gl.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            u41 u41Var3 = u41Var22;
                                            fx0 fx0Var6 = fx0Var52;
                                            switch (b2) {
                                                case 0:
                                                    fx0Var6.c0 = false;
                                                    u41Var3.setLoading(false);
                                                    return;
                                                default:
                                                    fx0Var6.c0 = false;
                                                    u41Var3.setLoading(false);
                                                    return;
                                            }
                                        }
                                    }, 400L);
                                    return;
                                }
                            default:
                                if (bool.booleanValue()) {
                                    fx0Var52.dismiss();
                                    return;
                                } else {
                                    gl.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            u41 u41Var3 = u41Var22;
                                            fx0 fx0Var6 = fx0Var52;
                                            switch (b2) {
                                                case 0:
                                                    fx0Var6.c0 = false;
                                                    u41Var3.setLoading(false);
                                                    return;
                                                default:
                                                    fx0Var6.c0 = false;
                                                    u41Var3.setLoading(false);
                                                    return;
                                            }
                                        }
                                    }, 400L);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 23:
                ozb ozbVar = (ozb) this.b;
                i96 i96Var = (i96) this.d;
                rzb rzbVar = ozbVar.n;
                Runnable runnable4 = ((Runnable[]) this.c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = rzbVar.u1;
                qzb qzbVar = rzbVar.H1;
                if (!TextUtils.equals(str2, i96Var.f)) {
                    View view3 = qzbVar.d;
                    if (view3 == rzbVar.y1 || view3 == rzbVar.s1) {
                        rzbVar.v1 = rzbVar.u1;
                    }
                    mzb mzbVar = ozbVar.e;
                    String str3 = i96Var.f;
                    rzbVar.u1 = str3;
                    mzbVar.setText(rzb.E0(rzb.J0(str3, null, null)));
                    if (rzbVar.q1 != null) {
                        view2 = rzbVar.r1;
                    } else {
                        view2 = rzbVar.x1;
                    }
                    qzbVar.D(view2);
                    rzb.O0(rzbVar.u1);
                    rzbVar.S0();
                    return;
                }
                return;
            case 24:
                mr1 mr1Var = (mr1) this.b;
                b1c b1cVar = (b1c) this.c;
                m8 m8Var = (m8) this.d;
                long j = mr1Var.b;
                b1cVar.J(j, true, false);
                TLRPC.Chat K0 = na7.q1(mr1Var.a).K0(Long.valueOf(-j));
                if (K0 != null) {
                    if (hc2.V(K0)) {
                        M0 = k96.M0(2131743711, null);
                    } else {
                        M0 = k96.M0(2131743709, null);
                    }
                } else {
                    M0 = k96.M0(2131743710, null);
                }
                u21.b0(mr1Var.c).K(2131624104, gl.S2(M0), k96.M0(2131743646, null), new a5b(mr1Var, b1cVar, (byte) 26)).j();
                m8Var.d(true);
                return;
            case 25:
                ((hmc) this.b).x0((Context) this.c, (xha) this.d, view);
                return;
            case 26:
                cs5 cs5Var = (cs5) this.d;
                a43 a43Var = ((c) this.b).h;
                String str4 = ((TL_wallet.currencyRate) this.c).currency;
                if (!TextUtils.equals(a43Var.f, str4)) {
                    a43Var.f = str4;
                    try {
                        a.b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", a43Var.g()).apply();
                    } catch (Exception e2) {
                        fa4.e("[gram-wallet] failed to save currency prefs", e2);
                    }
                    a43Var.b.S();
                }
                cs5Var.u();
                return;
            default:
                ((hd[]) this.c)[0].dismiss();
                gl.g(((xoc) this.b).s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
