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
public final class jw4 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public jw4(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        dy0 dy0Var;
        nk3 nk3Var;
        my0 my0Var;
        View view2;
        String M0;
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                ylb ylbVar = (ylb) this.d;
                if (((mw4) this.b).A1.a == ok.a) {
                    new exa(context, ylbVar).show();
                    return;
                }
                return;
            case 1:
                yx4 yx4Var = (yx4) this.b;
                yx4Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.S = jb6.M0(2131749335, null);
                alertDialog$Builder.a.U = gm.S2(jb6.M0(2131749336, null));
                alertDialog$Builder.j(jb6.M0(2131749337, null), new wx4(yx4Var, (byte) 0));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                ((d) this.d).showDialog(alertDialog$Builder.a);
                return;
            case 2:
                mk7 mk7Var = (mk7) this.c;
                ylb ylbVar2 = (ylb) this.d;
                if (gm.g(((JSONObject) this.b).optString("text"))) {
                    new c41(mk7Var.F, ylbVar2).i(jb6.M0(2131742672, null)).j();
                    return;
                }
                return;
            case 3:
                ((k38) this.b).a(Long.valueOf(((long[]) this.c)[0]));
                ((my0) this.d).dismiss();
                return;
            case 4:
                sa8 sa8Var = (sa8) this.b;
                Context context2 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (sa8Var.B1) {
                    ln2 ln2Var = new ln2(context2, sa8Var.G1);
                    ln2Var.D0(sa8Var.A1.a, 2);
                    ln2Var.r1 = new ry(sa8Var, bitmap, (byte) 5);
                    ln2Var.q1 = new vx5(sa8Var, (byte) 1);
                    ln2Var.show();
                    return;
                }
                Runnable runnable = sa8Var.K1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                f56 f56Var = (f56) this.b;
                my0 my0Var2 = (my0) this.c;
                d dVar = (d) this.d;
                try {
                    if (f56Var.b != null) {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f56Var.b));
                        if (my0Var2 != null && (dy0Var = my0Var2.c) != null) {
                            new c41(dy0Var, null).k(false).j();
                        } else {
                            c41.j(dVar).j();
                        }
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 6:
                bj6 bj6Var = (bj6) this.b;
                bj6Var.getClass();
                ((bu5) this.c).u();
                int i = ((ub7) this.d).a;
                if (bj6Var.c.getCurrentPosition() == 0 && (nk3Var = bj6Var.J) != null) {
                    nk3Var.Q4(i);
                    return;
                }
                if (bj6Var.J == null) {
                    bj6Var.n0(null);
                }
                bj6Var.I = Integer.valueOf(i);
                bj6Var.o0(0, true);
                bj6Var.c.E(0);
                return;
            case 7:
                f57 f57Var = (f57) this.b;
                k57 k57Var = (k57) this.c;
                k57 k57Var2 = (k57) this.d;
                l57 l57Var = f57Var.d0;
                o47 o47Var = l57Var.d;
                boolean z = o47Var.l;
                boolean z2 = !z;
                o47Var.l = z2;
                if (!z) {
                    if (!o47Var.k) {
                        o47Var.k = true;
                        l57Var.y = true;
                    }
                } else {
                    if (l57Var.y) {
                        o47Var.k = false;
                    }
                    l57Var.y = false;
                }
                k57Var.a(z2, true);
                k57Var2.a(o47Var.k, true);
                f57Var.i();
                f57Var.l(true);
                return;
            case 8:
                u67 u67Var = (u67) this.b;
                ik.Q((Context) this.c, u67Var.w1, new cj6(u67Var, (byte) 11), (ylb) this.d, 0).h1();
                return;
            case 9:
                my0[] my0VarArr = (my0[]) this.b;
                qac qacVar = (qac) this.c;
                String str = (String) this.d;
                my0 my0Var3 = my0VarArr[0];
                if (my0Var3 != null) {
                    my0Var3.dismiss();
                    my0VarArr[0] = null;
                    qacVar.a(str);
                    return;
                }
                return;
            case 10:
                my0[] my0VarArr2 = (my0[]) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (!((b61) this.b).R && (my0Var = my0VarArr2[0]) != null) {
                    my0Var.dismiss();
                    my0VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 11:
                z8b z8bVar = (z8b) this.b;
                Context context3 = (Context) this.c;
                m58 m58Var = (m58) this.d;
                if (z8bVar.r1) {
                    ln2 ln2Var2 = new ln2(context3, z8bVar.w1);
                    z8bVar.J1 = ln2Var2;
                    ln2Var2.D0(z8bVar.q1.a, 2);
                    ln2Var2.r1 = new ry(z8bVar, m58Var, (byte) 6);
                    ln2Var2.q1 = new ad0(z8bVar, m58Var, (byte) 3);
                    ln2Var2.show();
                    return;
                }
                Runnable runnable3 = z8bVar.A1;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 12:
                a58 a58Var = ((v48) this.b).x;
                a58Var.x0((y7b) this.c, (TL_stories.StoryItem) this.d);
                v48 v48Var = a58Var.j1;
                if (v48Var != null) {
                    v48Var.a();
                    return;
                }
                return;
            case 13:
                v48 v48Var2 = (v48) this.b;
                oab oabVar = (oab) this.d;
                ((a8) this.c).performHapticFeedback(3);
                c41 Y = c41.Y();
                if (Y != null) {
                    Y.Q(2131624056, 36, gm.N2(jb6.M0(2131745667, null), -1, 0, new a18(v48Var2, oabVar, (byte) 3), null)).j();
                    return;
                }
                return;
            case 14:
                ((i58) this.b).E0((TLRPC.ChatFull) this.c, (oc5) this.d);
                return;
            case 15:
                wb8 wb8Var = (wb8) this.b;
                Context context4 = (Context) this.c;
                ylb ylbVar3 = (ylb) this.d;
                xt4 xt4Var = wb8Var.h;
                if (xt4Var == null) {
                    xt4 xt4Var2 = new xt4(context4, ylbVar3, jb6.M0(2131743294, null), wb8Var.f);
                    wb8Var.h = xt4Var2;
                    xt4Var2.n(new q78(wb8Var, (byte) 12));
                    xt4Var = wb8Var.h;
                    xt4Var.p1 = wb8Var.n;
                }
                xt4Var.show();
                return;
            case 16:
                rs8 rs8Var = (rs8) this.b;
                ((bu5) this.c).u();
                lea leaVar = rs8Var.a;
                ks8 ks8Var = new ks8(rs8Var, (TL_stars.SavedStarGift) this.d, (byte) 0);
                HashMap hashMap = vs8.V;
                leaVar.h(ks8Var, null);
                return;
            case 17:
                ((pr2) this.b).m();
                ((xk9) this.c).C((ud9) this.d);
                return;
            case 18:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                ((m8) this.c).d(true);
                LongSparseArray l = saveToGallerySettingsActivity.getUserConfig().l(saveToGallerySettingsActivity.a);
                l.remove(((rr9) this.d).d);
                saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, l);
                saveToGallerySettingsActivity.e0();
                return;
            case 19:
                ((j1a) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                return;
            case 20:
                t1a t1aVar = (t1a) this.b;
                qv0 qv0Var = new qv0(t1aVar, (byte) 11);
                i2a i2aVar = t1aVar.b;
                new az3(qv0Var, i2aVar.getContext(), i2aVar.s, (ArrayList) this.c).show();
                ((bu5) this.d).u();
                return;
            case 21:
                final my0 my0Var4 = (my0) this.c;
                final b61 b61Var = (b61) this.d;
                my0Var4.c0 = false;
                b61Var.setLoading(true);
                ((uua) this.b).a(new qac() {
                    @Override
                    public final void a(Object obj) {
                        byte b = r3;
                        final b61 b61Var2 = b61Var;
                        final my0 my0Var5 = my0Var4;
                        Boolean bool = (Boolean) obj;
                        switch (b) {
                            case 0:
                                if (bool.booleanValue()) {
                                    my0Var5.dismiss();
                                    return;
                                } else {
                                    gm.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            b61 b61Var3 = b61Var2;
                                            my0 my0Var6 = my0Var5;
                                            switch (b2) {
                                                case 0:
                                                    my0Var6.c0 = false;
                                                    b61Var3.setLoading(false);
                                                    return;
                                                default:
                                                    my0Var6.c0 = false;
                                                    b61Var3.setLoading(false);
                                                    return;
                                            }
                                        }
                                    }, 400L);
                                    return;
                                }
                            default:
                                if (bool.booleanValue()) {
                                    my0Var5.dismiss();
                                    return;
                                } else {
                                    gm.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            b61 b61Var3 = b61Var2;
                                            my0 my0Var6 = my0Var5;
                                            switch (b2) {
                                                case 0:
                                                    my0Var6.c0 = false;
                                                    b61Var3.setLoading(false);
                                                    return;
                                                default:
                                                    my0Var6.c0 = false;
                                                    b61Var3.setLoading(false);
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
                final my0 my0Var5 = (my0) this.c;
                final b61 b61Var2 = (b61) this.d;
                my0Var5.c0 = false;
                b61Var2.setLoading(true);
                ((sua) this.b).a(new qac() {
                    @Override
                    public final void a(Object obj) {
                        byte b = r3;
                        final b61 b61Var22 = b61Var2;
                        final my0 my0Var52 = my0Var5;
                        Boolean bool = (Boolean) obj;
                        switch (b) {
                            case 0:
                                if (bool.booleanValue()) {
                                    my0Var52.dismiss();
                                    return;
                                } else {
                                    gm.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            b61 b61Var3 = b61Var22;
                                            my0 my0Var6 = my0Var52;
                                            switch (b2) {
                                                case 0:
                                                    my0Var6.c0 = false;
                                                    b61Var3.setLoading(false);
                                                    return;
                                                default:
                                                    my0Var6.c0 = false;
                                                    b61Var3.setLoading(false);
                                                    return;
                                            }
                                        }
                                    }, 400L);
                                    return;
                                }
                            default:
                                if (bool.booleanValue()) {
                                    my0Var52.dismiss();
                                    return;
                                } else {
                                    gm.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            b61 b61Var3 = b61Var22;
                                            my0 my0Var6 = my0Var52;
                                            switch (b2) {
                                                case 0:
                                                    my0Var6.c0 = false;
                                                    b61Var3.setLoading(false);
                                                    return;
                                                default:
                                                    my0Var6.c0 = false;
                                                    b61Var3.setLoading(false);
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
                p1c p1cVar = (p1c) this.b;
                hb6 hb6Var = (hb6) this.d;
                s1c s1cVar = p1cVar.n;
                Runnable runnable4 = ((Runnable[]) this.c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = s1cVar.u1;
                r1c r1cVar = s1cVar.H1;
                if (!TextUtils.equals(str2, hb6Var.f)) {
                    View view3 = r1cVar.d;
                    if (view3 == s1cVar.y1 || view3 == s1cVar.s1) {
                        s1cVar.v1 = s1cVar.u1;
                    }
                    n1c n1cVar = p1cVar.e;
                    String str3 = hb6Var.f;
                    s1cVar.u1 = str3;
                    n1cVar.setText(s1c.E0(s1c.J0(str3, null, null)));
                    if (s1cVar.q1 != null) {
                        view2 = s1cVar.r1;
                    } else {
                        view2 = s1cVar.x1;
                    }
                    r1cVar.D(view2);
                    s1c.O0(s1cVar.u1);
                    s1cVar.S0();
                    return;
                }
                return;
            case 24:
                zs1 zs1Var = (zs1) this.b;
                b3c b3cVar = (b3c) this.c;
                m8 m8Var = (m8) this.d;
                long j = zs1Var.b;
                b3cVar.J(j, true, false);
                TLRPC.Chat L0 = oc7.r1(zs1Var.a).L0(Long.valueOf(-j));
                if (L0 != null) {
                    if (sd2.V(L0)) {
                        M0 = jb6.M0(2131743637, null);
                    } else {
                        M0 = jb6.M0(2131743635, null);
                    }
                } else {
                    M0 = jb6.M0(2131743636, null);
                }
                c41.b0(zs1Var.c).K(2131624104, gm.S2(M0), jb6.M0(2131743572, null), new b7b(zs1Var, b3cVar, (byte) 28)).j();
                m8Var.d(true);
                return;
            case 25:
                ((goc) this.b).y0((Context) this.c, (zja) this.d, view);
                return;
            case 26:
                bu5 bu5Var = (bu5) this.d;
                l53 l53Var = ((c) this.b).h;
                String str4 = ((TL_wallet.currencyRate) this.c).currency;
                if (!TextUtils.equals(l53Var.f, str4)) {
                    l53Var.f = str4;
                    try {
                        a.b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", l53Var.g()).apply();
                    } catch (Exception e2) {
                        fc4.e("[gram-wallet] failed to save currency prefs", e2);
                    }
                    l53Var.b.S();
                }
                bu5Var.u();
                return;
            default:
                ((he[]) this.c)[0].dismiss();
                gm.g(((zqc) this.b).s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
