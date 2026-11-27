package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.Wallet.c;
public final class lw4 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public lw4(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        ex0 ex0Var;
        uj3 uj3Var;
        nx0 nx0Var;
        View view2;
        String M0;
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                vnb vnbVar = (vnb) this.d;
                if (((ow4) this.b).A1.a == pj.a) {
                    new eza(context, vnbVar).show();
                    return;
                }
                return;
            case 1:
                yx4 yx4Var = (yx4) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                qc9 qc9Var = (qc9) this.d;
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    fu5 G = fu5.G(frameLayout, yx4Var.J0, qc9Var);
                    qc9Var.b(G, new gx4(Q, (byte) 0), new re4(yx4Var, qc9Var, G, (byte) 11));
                    return;
                }
                return;
            case 2:
                by4 by4Var = (by4) this.b;
                by4Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.S = ob6.M0(2131749332, null);
                alertDialog$Builder.a.U = hl.S2(ob6.M0(2131749333, null));
                alertDialog$Builder.j(ob6.M0(2131749334, null), new lu3(by4Var, (byte) 29));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                ((e) this.d).showDialog(alertDialog$Builder.a);
                return;
            case 3:
                tk7 tk7Var = (tk7) this.c;
                vnb vnbVar2 = (vnb) this.d;
                if (hl.g(((JSONObject) this.b).optString("text"))) {
                    new d31(tk7Var.F, vnbVar2).i(ob6.M0(2131742640, null)).j();
                    return;
                }
                return;
            case 4:
                ((b58) this.b).a(Long.valueOf(((long[]) this.c)[0]));
                ((nx0) this.d).dismiss();
                return;
            case 5:
                hc8 hc8Var = (hc8) this.b;
                Context context2 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (hc8Var.v1) {
                    sm2 sm2Var = new sm2(context2, hc8Var.A1);
                    sm2Var.E0(hc8Var.u1.a, 2);
                    sm2Var.r1 = new rx(hc8Var, bitmap, (byte) 6);
                    sm2Var.q1 = new ay5(hc8Var, (byte) 1);
                    sm2Var.show();
                    return;
                }
                Runnable runnable = hc8Var.E1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                i56 i56Var = (i56) this.b;
                nx0 nx0Var2 = (nx0) this.c;
                e eVar = (e) this.d;
                try {
                    if (i56Var.b != null) {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i56Var.b));
                        if (nx0Var2 != null && (ex0Var = nx0Var2.c) != null) {
                            new d31(ex0Var, null).k(false).j();
                        } else {
                            d31.j(eVar).j();
                        }
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 7:
                fj6 fj6Var = (fj6) this.b;
                fj6Var.getClass();
                ((fu5) this.c).u();
                int i = ((ac7) this.d).a;
                if (fj6Var.c.getCurrentPosition() == 0 && (uj3Var = fj6Var.M) != null) {
                    uj3Var.Q4(i);
                    return;
                }
                if (fj6Var.M == null) {
                    fj6Var.s0(null);
                }
                fj6Var.L = Integer.valueOf(i);
                fj6Var.t0(0, true);
                fj6Var.c.F(0);
                return;
            case 8:
                m57 m57Var = (m57) this.b;
                r57 r57Var = (r57) this.c;
                r57 r57Var2 = (r57) this.d;
                s57 s57Var = m57Var.d0;
                v47 v47Var = s57Var.d;
                boolean z = v47Var.l;
                boolean z2 = !z;
                v47Var.l = z2;
                if (!z) {
                    if (!v47Var.k) {
                        v47Var.k = true;
                        s57Var.y = true;
                    }
                } else {
                    if (s57Var.y) {
                        v47Var.k = false;
                    }
                    s57Var.y = false;
                }
                r57Var.a(z2, true);
                r57Var2.a(v47Var.k, true);
                m57Var.i();
                m57Var.l(true);
                return;
            case 9:
                a77 a77Var = (a77) this.b;
                jj.Q((Context) this.c, a77Var.w1, new bm6(a77Var, (byte) 12), (vnb) this.d, 0).o1();
                return;
            case 10:
                nx0[] nx0VarArr = (nx0[]) this.b;
                pcc pccVar = (pcc) this.c;
                String str = (String) this.d;
                nx0 nx0Var3 = nx0VarArr[0];
                if (nx0Var3 != null) {
                    nx0Var3.dismiss();
                    nx0VarArr[0] = null;
                    pccVar.a(str);
                    return;
                }
                return;
            case 11:
                nx0[] nx0VarArr2 = (nx0[]) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (!((c51) this.b).R && (nx0Var = nx0VarArr2[0]) != null) {
                    nx0Var.dismiss();
                    nx0VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 12:
                wab wabVar = (wab) this.b;
                Context context3 = (Context) this.c;
                a78 a78Var = (a78) this.d;
                if (wabVar.l1) {
                    sm2 sm2Var2 = new sm2(context3, wabVar.q1);
                    wabVar.D1 = sm2Var2;
                    sm2Var2.E0(wabVar.k1.a, 2);
                    sm2Var2.r1 = new rx(wabVar, a78Var, (byte) 7);
                    sm2Var2.q1 = new cc0(wabVar, a78Var, (byte) 3);
                    sm2Var2.show();
                    return;
                }
                Runnable runnable3 = wabVar.u1;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                o68 o68Var = ((j68) this.b).x;
                o68Var.x0((u9b) this.c, (TL_stories.StoryItem) this.d);
                j68 j68Var = o68Var.d1;
                if (j68Var != null) {
                    j68Var.a();
                    return;
                }
                return;
            case 14:
                j68 j68Var2 = (j68) this.b;
                lcb lcbVar = (lcb) this.d;
                ((b8) this.c).performHapticFeedback(3);
                d31 Y = d31.Y();
                if (Y != null) {
                    Y.Q(2131624056, 36, hl.N2(ob6.M0(2131745661, null), -1, 0, new a58(j68Var2, lcbVar, (byte) 1), null)).j();
                    return;
                }
                return;
            case 15:
                ((w68) this.b).F0((TLRPC.ChatFull) this.c, (rc5) this.d);
                return;
            case 16:
                ld8 ld8Var = (ld8) this.b;
                Context context4 = (Context) this.c;
                vnb vnbVar3 = (vnb) this.d;
                au4 au4Var = ld8Var.h;
                if (au4Var == null) {
                    au4 au4Var2 = new au4(context4, vnbVar3, ob6.M0(2131743262, null), ld8Var.f);
                    ld8Var.h = au4Var2;
                    au4Var2.n(new x38(ld8Var, (byte) 20));
                    au4Var = ld8Var.h;
                    au4Var.p1 = ld8Var.n;
                }
                au4Var.show();
                return;
            case 17:
                au8 au8Var = (au8) this.b;
                ((fu5) this.c).u();
                cga cgaVar = au8Var.a;
                tt8 tt8Var = new tt8(au8Var, (TL_stars.SavedStarGift) this.d, (byte) 0);
                HashMap hashMap = eu8.V;
                cgaVar.h(tt8Var, null);
                return;
            case 18:
                ((xq2) this.b).n();
                ((km9) this.c).C((kf9) this.d);
                return;
            case 19:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                ((n8) this.c).d(true);
                LongSparseArray l = saveToGallerySettingsActivity.getUserConfig().l(saveToGallerySettingsActivity.a);
                l.remove(((it9) this.d).d);
                saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, l);
                saveToGallerySettingsActivity.d0();
                return;
            case 20:
                ((b3a) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                return;
            case 21:
                l3a l3aVar = (l3a) this.b;
                qu0 qu0Var = new qu0(l3aVar, (byte) 11);
                z3a z3aVar = l3aVar.b;
                new ly3(qu0Var, z3aVar.getContext(), z3aVar.s, (ArrayList) this.c).show();
                ((fu5) this.d).u();
                return;
            case 22:
                final nx0 nx0Var4 = (nx0) this.c;
                final c51 c51Var = (c51) this.d;
                nx0Var4.c0 = false;
                c51Var.setLoading(true);
                ((wwa) this.b).a(new pcc() {
                    @Override
                    public final void a(Object obj) {
                        byte b = r3;
                        final c51 c51Var2 = c51Var;
                        final nx0 nx0Var5 = nx0Var4;
                        Boolean bool = (Boolean) obj;
                        switch (b) {
                            case 0:
                                if (bool.booleanValue()) {
                                    nx0Var5.dismiss();
                                    return;
                                } else {
                                    hl.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            c51 c51Var3 = c51Var2;
                                            nx0 nx0Var6 = nx0Var5;
                                            switch (b2) {
                                                case 0:
                                                    nx0Var6.c0 = false;
                                                    c51Var3.setLoading(false);
                                                    return;
                                                default:
                                                    nx0Var6.c0 = false;
                                                    c51Var3.setLoading(false);
                                                    return;
                                            }
                                        }
                                    }, 400L);
                                    return;
                                }
                            default:
                                if (bool.booleanValue()) {
                                    nx0Var5.dismiss();
                                    return;
                                } else {
                                    hl.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            c51 c51Var3 = c51Var2;
                                            nx0 nx0Var6 = nx0Var5;
                                            switch (b2) {
                                                case 0:
                                                    nx0Var6.c0 = false;
                                                    c51Var3.setLoading(false);
                                                    return;
                                                default:
                                                    nx0Var6.c0 = false;
                                                    c51Var3.setLoading(false);
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
                final nx0 nx0Var5 = (nx0) this.c;
                final c51 c51Var2 = (c51) this.d;
                nx0Var5.c0 = false;
                c51Var2.setLoading(true);
                ((twa) this.b).a(new pcc() {
                    @Override
                    public final void a(Object obj) {
                        byte b = r3;
                        final c51 c51Var22 = c51Var2;
                        final nx0 nx0Var52 = nx0Var5;
                        Boolean bool = (Boolean) obj;
                        switch (b) {
                            case 0:
                                if (bool.booleanValue()) {
                                    nx0Var52.dismiss();
                                    return;
                                } else {
                                    hl.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            c51 c51Var3 = c51Var22;
                                            nx0 nx0Var6 = nx0Var52;
                                            switch (b2) {
                                                case 0:
                                                    nx0Var6.c0 = false;
                                                    c51Var3.setLoading(false);
                                                    return;
                                                default:
                                                    nx0Var6.c0 = false;
                                                    c51Var3.setLoading(false);
                                                    return;
                                            }
                                        }
                                    }, 400L);
                                    return;
                                }
                            default:
                                if (bool.booleanValue()) {
                                    nx0Var52.dismiss();
                                    return;
                                } else {
                                    hl.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b2 = r3;
                                            c51 c51Var3 = c51Var22;
                                            nx0 nx0Var6 = nx0Var52;
                                            switch (b2) {
                                                case 0:
                                                    nx0Var6.c0 = false;
                                                    c51Var3.setLoading(false);
                                                    return;
                                                default:
                                                    nx0Var6.c0 = false;
                                                    c51Var3.setLoading(false);
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
            case 24:
                o3c o3cVar = (o3c) this.b;
                mb6 mb6Var = (mb6) this.d;
                r3c r3cVar = o3cVar.n;
                Runnable runnable4 = ((Runnable[]) this.c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = r3cVar.u1;
                q3c q3cVar = r3cVar.H1;
                if (!TextUtils.equals(str2, mb6Var.f)) {
                    View view3 = q3cVar.d;
                    if (view3 == r3cVar.y1 || view3 == r3cVar.s1) {
                        r3cVar.v1 = r3cVar.u1;
                    }
                    m3c m3cVar = o3cVar.e;
                    String str3 = mb6Var.f;
                    r3cVar.u1 = str3;
                    m3cVar.setText(r3c.F0(r3c.K0(str3, null, null)));
                    if (r3cVar.q1 != null) {
                        view2 = r3cVar.r1;
                    } else {
                        view2 = r3cVar.x1;
                    }
                    q3cVar.D(view2);
                    r3c.P0(r3cVar.u1);
                    r3cVar.T0();
                    return;
                }
                return;
            case 25:
                as1 as1Var = (as1) this.b;
                a5c a5cVar = (a5c) this.c;
                n8 n8Var = (n8) this.d;
                long j = as1Var.b;
                a5cVar.J(j, true, false);
                TLRPC.Chat M02 = uc7.s1(as1Var.a).M0(Long.valueOf(-j));
                if (M02 != null) {
                    if (xc2.V(M02)) {
                        M0 = ob6.M0(2131743605, null);
                    } else {
                        M0 = ob6.M0(2131743603, null);
                    }
                } else {
                    M0 = ob6.M0(2131743604, null);
                }
                d31.b0(as1Var.c).K(2131624104, hl.S2(M0), ob6.M0(2131743540, null), new hab(as1Var, a5cVar, (byte) 24)).j();
                n8Var.d(true);
                return;
            case 26:
                ((uqc) this.b).y0((Context) this.c, (sla) this.d, view);
                return;
            case 27:
                fu5 fu5Var = (fu5) this.d;
                s43 s43Var = ((c) this.b).h;
                String str4 = ((TL_wallet.currencyRate) this.c).currency;
                if (!TextUtils.equals(s43Var.f, str4)) {
                    s43Var.f = str4;
                    try {
                        a.b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", s43Var.g()).apply();
                    } catch (Exception e2) {
                        cc4.e("[gram-wallet] failed to save currency prefs", e2);
                    }
                    s43Var.b.T();
                }
                fu5Var.u();
                return;
            default:
                ((id[]) this.c)[0].dismiss();
                hl.g(((ktc) this.b).s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
