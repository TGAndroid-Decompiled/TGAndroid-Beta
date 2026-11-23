package ki;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.j8;
import bi.n8;
import c8.na;
import di.xb;
import hi.e7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s00;
import org.telegram.ui.uv;
public final class j extends s00 implements gs {
    public final long S;
    public FrameLayout T;
    public vg.n U;
    public LinearLayout V;
    public bi.s W;
    public m80 X;
    public boolean Z;
    public TL_payments.starRefProgram f18715a0;
    public TL_payments.starRefProgram f18716b0;
    public boolean f18719e0;
    public j8 f18720f0;
    public final d Y = new d(this, 0);
    public String[] f18717c0 = null;
    public final List f18718d0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public j(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(j jVar, Context context) {
        String G;
        int i7;
        int i10;
        if (!jVar.W.f14303e0) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        ey0 ey0Var = new ey0(context, jVar.resourceProvider);
        d dVar = new d(jVar, 1);
        ey0Var.e(hd.N0(2131754341, null), J0(jVar.f18716b0.commission_permille), null, null);
        String N0 = hd.N0(2131754339, null);
        int i11 = jVar.f18716b0.duration_months;
        if (i11 <= 0) {
            G = hd.N0(2131749005, null);
        } else if (i11 >= 12 && i11 % 12 == 0) {
            G = hd.G(i11 / 12, "Years", new Object[0]);
        } else {
            G = hd.G(i11, "Months", new Object[0]);
        }
        ey0Var.e(N0, G, null, null);
        frameLayout.addView(ey0Var, na.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, jVar.resourceProvider);
        String N02 = hd.N0(2131754344, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N02;
        if (jVar.Z) {
            i7 = 2131754327;
        } else {
            i7 = 2131754313;
        }
        t1Var.U = hd.N0(i7, null);
        alertDialog$Builder.o(frameLayout);
        if (jVar.Z) {
            i10 = 2131754328;
        } else {
            i10 = 2131754314;
        }
        alertDialog$Builder.k(hd.N0(i10, null), new kg.y1(dVar, 1));
        alertDialog$Builder.h(hd.N0(2131752577, null), null);
        alertDialog$Builder.p();
    }

    public static void B0(j jVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = jVar.S;
        t1Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull d2 = jVar.getMessagesController().d2(j3);
            if (d2 != null) {
                d2.starref_program = starrefprogram;
                jVar.getMessagesStorage().j2(d2, false);
                ls.f(jVar.currentAccount).k(ls.E0, Long.valueOf(j3), d2);
            }
            jVar.G0(false);
        } else if (tL_error != null) {
            lc.e0(tL_error);
        }
    }

    public static void C0(j jVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        long j3 = jVar.S;
        t1Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull d2 = jVar.getMessagesController().d2(j3);
            if (d2 != null) {
                TL_payments.starRefProgram starrefprogram2 = jVar.f18716b0;
                starrefprogram2.flags |= 2;
                int currentTime = jVar.getConnectionsManager().getCurrentTime();
                if (jVar.getConnectionsManager().isTestBackend()) {
                    i7 = 300;
                } else {
                    i7 = 86400;
                }
                starrefprogram2.end_date = currentTime + i7;
                d2.starref_program = starrefprogram;
                jVar.getMessagesStorage().j2(d2, false);
                ls.f(jVar.currentAccount).k(ls.E0, Long.valueOf(j3), d2);
            }
            jVar.G0(true);
        } else if (tL_error != null) {
            lc.e0(tL_error);
        }
    }

    public static void D0(j jVar, int i7) {
        j8 j8Var = jVar.f18720f0;
        if (j8Var != null) {
            int i10 = j8Var.G(i7).d;
            if (i10 == 4) {
                LinearLayout linearLayout = new LinearLayout(jVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                TextView textView = new TextView(jVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i11 = m6.G6;
                t6.U(textView, i11, jVar.resourceProvider);
                textView.setText(org.telegram.messenger.g0.W2(hd.N0(2131754319, null)));
                linearLayout.addView(textView, na.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                xb xbVar = new xb(jVar.getParentActivity(), 3);
                xbVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                xbVar.setTextSize(1, 16.0f);
                t6.U(xbVar, i11, jVar.resourceProvider);
                xbVar.setText(org.telegram.messenger.g0.W2(hd.N0(2131754318, null)));
                linearLayout.addView(xbVar, na.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                xb xbVar2 = new xb(jVar.getParentActivity(), 3);
                xbVar2.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                xbVar2.setTextSize(1, 16.0f);
                t6.U(xbVar2, i11, jVar.resourceProvider);
                xbVar2.setText(org.telegram.messenger.g0.W2(hd.N0(2131754317, null)));
                linearLayout.addView(xbVar2, na.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                xb xbVar3 = new xb(jVar.getParentActivity(), 3);
                xbVar3.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                xbVar3.setTextSize(1, 16.0f);
                t6.U(xbVar3, i11, jVar.resourceProvider);
                xbVar3.setText(org.telegram.messenger.g0.W2(hd.N0(2131754316, null)));
                linearLayout.addView(xbVar3, na.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jVar.getParentActivity(), jVar.resourceProvider);
                alertDialog$Builder.f28743a.S = hd.N0(2131754344, null);
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(hd.N0(2131754320, null), new kg.y1(jVar, 2));
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i10 == 2) {
                jVar.presentFragment(new d4(jVar.S));
            }
        }
    }

    public static String J0(int i7) {
        float f10 = i7 / 10.0f;
        if (((int) f10) == f10) {
            Locale locale = Locale.US;
            return com.google.android.gms.internal.vision.e2.i(i7 / 10, "%");
        }
        return String.format(Locale.US, "%.1f%%", Float.valueOf(f10));
    }

    public final void G0(boolean z10) {
        org.telegram.ui.ActionBar.g2 g2Var;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            r4 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(size);
                    if ((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).a() == this.S) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    g2Var = null;
                    break;
                }
            }
            if (g2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.g2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                g2Var = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
            g2Var = null;
        }
        if (g2Var != null) {
            if (z10) {
                lc.b0(g2Var).I(2131624080, hd.N0(2131754336, null), org.telegram.messenger.g0.W2(hd.N0(2131754337, null))).j();
            } else {
                lc.b0(g2Var).I(2131623990, hd.N0(2131754322, null), hd.N0(2131754323, null)).j();
            }
        }
    }

    public final void H0(ArrayList arrayList, c51 c51Var) {
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        o41 o41Var = new o41(-2);
        o41Var.f38050c = (uv) super.o0(getParentActivity());
        arrayList.add(o41Var);
        arrayList.add(h.i(2131231811, hd.N0(2131753148, null), hd.N0(2131753149, null)));
        arrayList.add(h.i(2131232090, hd.N0(2131753146, null), hd.N0(2131753147, null)));
        arrayList.add(h.i(2131231807, hd.N0(2131753144, null), hd.N0(2131753145, null)));
        arrayList.add(o41.B(1, null));
        arrayList.add(o41.u(hd.N0(2131754341, null)));
        int i10 = getMessagesController().f25853k6;
        int i11 = this.f18716b0.commission_permille;
        int i12 = getMessagesController().f25861l6;
        ci.y yVar = new ci.y(2);
        a aVar = new a(this, 1);
        o41 o41Var2 = new o41(15);
        o41Var2.A = i11;
        o41Var2.D = aVar;
        t7 t7Var = new t7();
        t7Var.f31842a = i10;
        t7Var.f31843b = i12;
        t7Var.f31845e = new ea(yVar, 7);
        o41Var2.H = t7Var;
        o41Var2.C = -1L;
        TL_payments.starRefProgram starrefprogram = this.f18715a0;
        if (starrefprogram == null) {
            i7 = -1;
        } else {
            i7 = starrefprogram.commission_permille;
        }
        o41Var2.C = i7;
        arrayList.add(o41Var2);
        arrayList.add(o41.C(hd.N0(2131754340, null)));
        i5.c.s(2131754339, null, arrayList);
        String[] strArr = this.f18717c0;
        List list = this.f18718d0;
        if (strArr == null) {
            this.f18717c0 = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.f18717c0[i13] = hd.N0(2131749005, null);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.f18717c0[i13] = hd.G(intValue / 12, "YearsShort", new Object[0]);
                } else {
                    this.f18717c0[i13] = hd.G(intValue, "MonthsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.f18717c0;
        int indexOf = list.indexOf(Integer.valueOf(this.f18716b0.duration_months));
        a aVar2 = new a(this, 2);
        o41 o41Var3 = new o41(14);
        o41Var3.f38062q = strArr2;
        o41Var3.A = indexOf;
        o41Var3.D = aVar2;
        o41Var3.C = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.f18715a0;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                o41Var3.C = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.f18715a0.duration_months) {
                        o41Var3.C = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(o41Var3);
        arrayList.add(o41.C(hd.N0(2131754338, null)));
        arrayList.add(f.i(2, getThemedColor(m6.lk), hd.N0(2131754334, null), hd.N0(2131754335, null)));
        arrayList.add(o41.B(3, null));
        if (!this.Z && this.f18716b0.end_date == 0) {
            o41 e10 = o41.e(4, hd.N0(2131754321, null));
            e10.f38064s = true;
            arrayList.add(e10);
            arrayList.add(o41.B(5, null));
        }
        arrayList.add(o41.B(6, null));
        arrayList.add(o41.B(7, null));
    }

    public final TL_payments.starRefProgram I0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().f25861l6, getMessagesController().f25853k6);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void K0(boolean z10) {
        int i7;
        int i10;
        bi.s sVar = this.W;
        if (!this.Z && this.f18716b0.end_date == 0) {
            i7 = 2131754315;
        } else {
            i7 = 2131754329;
        }
        sVar.i(hd.N0(i7, null), z10, true);
        d dVar = this.Y;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
        m80 m80Var = this.X;
        if (!this.Z && this.f18716b0.end_date == 0) {
            i10 = 2131754312;
        } else {
            i10 = 2131754325;
        }
        m80Var.setText(org.telegram.messenger.g0.T2(hd.N0(i10, null), new d(this, 2)));
        L0();
        j8 j8Var = this.f18720f0;
        if (j8Var != null) {
            j8Var.O(z10);
        }
    }

    public final void L0() {
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        bi.s sVar = this.W;
        TL_payments.starRefProgram starrefprogram2 = this.f18716b0;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.f18715a0) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        t6.h(m6.f29438i5, new bi.o3(7, context, this), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClickable(true);
        vg.n nVar = new vg.n(context, 1, 3);
        this.U = nVar;
        vg.g gVar = nVar.f59470b;
        gVar.f59454z = m6.Wk;
        gVar.A = m6.Xk;
        gVar.b();
        this.U.setStarParticlesView(this.f51837e);
        this.T.addView(this.U, na.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        j0(hd.N0(2131753140, null), hd.N0(2131753141, null), this.T, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        t6.h(m6.f29347d6, this.V, getResourceProvider());
        View view = new View(context);
        t6.h(m6.f29348d7, view, getResourceProvider());
        this.V.addView(view, new LinearLayout.LayoutParams(na.z(-1.0f), na.z(1.0f / org.telegram.messenger.g0.f24009p)));
        bi.s sVar = new bi.s(3, context, this.resourceProvider, true);
        sVar.setRoundRadius(24);
        this.W = sVar;
        sVar.i(hd.N0(2131754329, null), false, true);
        this.W.setOnClickListener(new ai.o2(26, this, context));
        this.V.addView(this.W, na.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        m80 m80Var = new m80(context, this.resourceProvider);
        this.X = m80Var;
        t6.U(m80Var, m6.f29758z6, getResourceProvider());
        t6.G(this.X, m6.Xc, getResourceProvider());
        this.X.setTextSize(1, 12.0f);
        this.X.setGravity(17);
        this.V.addView(this.X, na.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.V, na.e(-1, -2, 87));
        this.f51836c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f));
        this.f51836c.setOnItemClickListener(new n8(this, 17));
        v4.k kVar = new v4.k();
        kVar.f59139m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.f51836c.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(m6.f29347d6);
    }

    @Override
    public final v4.h0 k0() {
        j8 j8Var = new j8(this, this.f51836c, getParentActivity(), this.currentAccount, this.classGuid, new e7(this, 16), getResourceProvider(), 4);
        this.f18720f0 = j8Var;
        return j8Var;
    }

    @Override
    public final ug.t1 m0() {
        e eVar = new e(getParentActivity(), 0);
        eVar.c();
        return eVar;
    }

    @Override
    public final View o0(Context context) {
        throw null;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f18719e0 = true;
        this.Z = true;
        this.f18716b0 = I0();
        this.f18715a0 = null;
        np messagesController = getMessagesController();
        long j3 = this.S;
        TLRPC.UserFull d2 = messagesController.d2(j3);
        if (d2 != null) {
            this.Z = false;
            TL_payments.starRefProgram starrefprogram = d2.starref_program;
            this.f18716b0 = starrefprogram;
            if (starrefprogram == null) {
                this.Z = true;
                this.f18716b0 = I0();
                this.f18715a0 = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.f18715a0 = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.f18716b0;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
            if (c22 != null) {
                getMessagesController().c3(c22, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.f18719e0 = false;
        org.telegram.messenger.g0.r(this.Y);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f51836c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f) + i12);
        this.f51836c.setClipToPadding(false);
        this.V.setPadding(0, 0, 0, i12);
    }

    @Override
    public final void onPause() {
        super.onPause();
        vg.n nVar = this.U;
        if (nVar != null) {
            nVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vg.n nVar = this.U;
        if (nVar != null) {
            nVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }
}
