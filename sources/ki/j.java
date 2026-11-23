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
import hi.y7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r00;
import org.telegram.ui.tv;
public final class j extends r00 implements fs {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public LinearLayout V;
    public bi.s W;
    public j80 X;
    public boolean Z;
    public TL_payments.starRefProgram f18814a0;
    public TL_payments.starRefProgram f18815b0;
    public boolean f18818e0;
    public j8 f18819f0;
    public final d Y = new d(this, 0);
    public String[] f18816c0 = null;
    public final List f18817d0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public j(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(j jVar, Context context) {
        String G;
        int i7;
        int i10;
        if (!jVar.W.f14340e0) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        dy0 dy0Var = new dy0(context, jVar.resourceProvider);
        d dVar = new d(jVar, 1);
        dy0Var.e(gd.N0(2131754341, null), J0(jVar.f18815b0.commission_permille), null, null);
        String N0 = gd.N0(2131754339, null);
        int i11 = jVar.f18815b0.duration_months;
        if (i11 <= 0) {
            G = gd.N0(2131749005, null);
        } else if (i11 >= 12 && i11 % 12 == 0) {
            G = gd.G(i11 / 12, "Years", new Object[0]);
        } else {
            G = gd.G(i11, "Months", new Object[0]);
        }
        dy0Var.e(N0, G, null, null);
        frameLayout.addView(dy0Var, na.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, jVar.resourceProvider);
        String N02 = gd.N0(2131754344, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N02;
        if (jVar.Z) {
            i7 = 2131754327;
        } else {
            i7 = 2131754313;
        }
        t1Var.U = gd.N0(i7, null);
        alertDialog$Builder.o(frameLayout);
        if (jVar.Z) {
            i10 = 2131754328;
        } else {
            i10 = 2131754314;
        }
        alertDialog$Builder.k(gd.N0(i10, null), new kg.f1(dVar, 3));
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
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
                ks.f(jVar.currentAccount).k(ks.E0, Long.valueOf(j3), d2);
            }
            jVar.G0(false);
        } else if (tL_error != null) {
            kc.e0(tL_error);
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
                TL_payments.starRefProgram starrefprogram2 = jVar.f18815b0;
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
                ks.f(jVar.currentAccount).k(ks.E0, Long.valueOf(j3), d2);
            }
            jVar.G0(true);
        } else if (tL_error != null) {
            kc.e0(tL_error);
        }
    }

    public static void D0(j jVar, int i7) {
        j8 j8Var = jVar.f18819f0;
        if (j8Var != null) {
            int i10 = j8Var.G(i7).d;
            if (i10 == 4) {
                LinearLayout linearLayout = new LinearLayout(jVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                TextView textView = new TextView(jVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i11 = n6.G6;
                u6.U(textView, i11, jVar.resourceProvider);
                textView.setText(org.telegram.messenger.g0.W2(gd.N0(2131754319, null)));
                linearLayout.addView(textView, na.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                xb xbVar = new xb(jVar.getParentActivity(), 3);
                xbVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                xbVar.setTextSize(1, 16.0f);
                u6.U(xbVar, i11, jVar.resourceProvider);
                xbVar.setText(org.telegram.messenger.g0.W2(gd.N0(2131754318, null)));
                linearLayout.addView(xbVar, na.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                xb xbVar2 = new xb(jVar.getParentActivity(), 3);
                xbVar2.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                xbVar2.setTextSize(1, 16.0f);
                u6.U(xbVar2, i11, jVar.resourceProvider);
                xbVar2.setText(org.telegram.messenger.g0.W2(gd.N0(2131754317, null)));
                linearLayout.addView(xbVar2, na.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                xb xbVar3 = new xb(jVar.getParentActivity(), 3);
                xbVar3.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                xbVar3.setTextSize(1, 16.0f);
                u6.U(xbVar3, i11, jVar.resourceProvider);
                xbVar3.setText(org.telegram.messenger.g0.W2(gd.N0(2131754316, null)));
                linearLayout.addView(xbVar3, na.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jVar.getParentActivity(), jVar.resourceProvider);
                alertDialog$Builder.f28835a.S = gd.N0(2131754344, null);
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(gd.N0(2131754320, null), new kg.f1(jVar, 4));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i10 == 2) {
                jVar.presentFragment(new e4(jVar.S));
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
                kc.b0(g2Var).I(2131624080, gd.N0(2131754336, null), org.telegram.messenger.g0.W2(gd.N0(2131754337, null))).j();
            } else {
                kc.b0(g2Var).I(2131623990, gd.N0(2131754322, null), gd.N0(2131754323, null)).j();
            }
        }
    }

    public final void H0(ArrayList arrayList, b51 b51Var) {
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        n41 n41Var = new n41(-2);
        n41Var.f37647c = (tv) super.o0(getParentActivity());
        arrayList.add(n41Var);
        arrayList.add(h.i(2131231814, gd.N0(2131753148, null), gd.N0(2131753149, null)));
        arrayList.add(h.i(2131232093, gd.N0(2131753146, null), gd.N0(2131753147, null)));
        arrayList.add(h.i(2131231810, gd.N0(2131753144, null), gd.N0(2131753145, null)));
        arrayList.add(n41.B(1, null));
        arrayList.add(n41.u(gd.N0(2131754341, null)));
        int i10 = getMessagesController().f25785k6;
        int i11 = this.f18815b0.commission_permille;
        int i12 = getMessagesController().f25793l6;
        ci.y yVar = new ci.y(2);
        a aVar = new a(this, 1);
        n41 n41Var2 = new n41(15);
        n41Var2.A = i11;
        n41Var2.D = aVar;
        s7 s7Var = new s7();
        s7Var.f31863a = i10;
        s7Var.f31864b = i12;
        s7Var.f31866e = new ea(yVar, 7);
        n41Var2.H = s7Var;
        n41Var2.C = -1L;
        TL_payments.starRefProgram starrefprogram = this.f18814a0;
        if (starrefprogram == null) {
            i7 = -1;
        } else {
            i7 = starrefprogram.commission_permille;
        }
        n41Var2.C = i7;
        arrayList.add(n41Var2);
        arrayList.add(n41.C(gd.N0(2131754340, null)));
        i5.c.s(2131754339, null, arrayList);
        String[] strArr = this.f18816c0;
        List list = this.f18817d0;
        if (strArr == null) {
            this.f18816c0 = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.f18816c0[i13] = gd.N0(2131749005, null);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.f18816c0[i13] = gd.G(intValue / 12, "YearsShort", new Object[0]);
                } else {
                    this.f18816c0[i13] = gd.G(intValue, "MonthsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.f18816c0;
        int indexOf = list.indexOf(Integer.valueOf(this.f18815b0.duration_months));
        a aVar2 = new a(this, 2);
        n41 n41Var3 = new n41(14);
        n41Var3.f37659q = strArr2;
        n41Var3.A = indexOf;
        n41Var3.D = aVar2;
        n41Var3.C = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.f18814a0;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                n41Var3.C = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.f18814a0.duration_months) {
                        n41Var3.C = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(n41Var3);
        arrayList.add(n41.C(gd.N0(2131754338, null)));
        arrayList.add(f.i(2, getThemedColor(n6.lk), gd.N0(2131754334, null), gd.N0(2131754335, null)));
        arrayList.add(n41.B(3, null));
        if (!this.Z && this.f18815b0.end_date == 0) {
            n41 e10 = n41.e(4, gd.N0(2131754321, null));
            e10.f37661s = true;
            arrayList.add(e10);
            arrayList.add(n41.B(5, null));
        }
        arrayList.add(n41.B(6, null));
        arrayList.add(n41.B(7, null));
    }

    public final TL_payments.starRefProgram I0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().f25793l6, getMessagesController().f25785k6);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void K0(boolean z10) {
        int i7;
        int i10;
        bi.s sVar = this.W;
        if (!this.Z && this.f18815b0.end_date == 0) {
            i7 = 2131754315;
        } else {
            i7 = 2131754329;
        }
        sVar.i(gd.N0(i7, null), z10, true);
        d dVar = this.Y;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
        j80 j80Var = this.X;
        if (!this.Z && this.f18815b0.end_date == 0) {
            i10 = 2131754312;
        } else {
            i10 = 2131754325;
        }
        j80Var.setText(org.telegram.messenger.g0.T2(gd.N0(i10, null), new d(this, 2)));
        L0();
        j8 j8Var = this.f18819f0;
        if (j8Var != null) {
            j8Var.O(z10);
        }
    }

    public final void L0() {
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        bi.s sVar = this.W;
        TL_payments.starRefProgram starrefprogram2 = this.f18815b0;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.f18814a0) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
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
        u6.h(n6.f29542i5, new bi.o3(7, context, this), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        vg.f fVar = mVar.f59590b;
        fVar.f59574z = n6.Wk;
        fVar.A = n6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.f51570e);
        this.T.addView(this.U, na.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        j0(gd.N0(2131753140, null), gd.N0(2131753141, null), this.T, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        u6.h(n6.f29451d6, this.V, getResourceProvider());
        View view = new View(context);
        u6.h(n6.f29452d7, view, getResourceProvider());
        this.V.addView(view, new LinearLayout.LayoutParams(na.z(-1.0f), na.z(1.0f / org.telegram.messenger.g0.f24225p)));
        bi.s sVar = new bi.s(3, context, this.resourceProvider, true);
        sVar.setRoundRadius(24);
        this.W = sVar;
        sVar.i(gd.N0(2131754329, null), false, true);
        this.W.setOnClickListener(new ai.p2(26, this, context));
        this.V.addView(this.W, na.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        j80 j80Var = new j80(context, this.resourceProvider);
        this.X = j80Var;
        u6.U(j80Var, n6.f29862z6, getResourceProvider());
        u6.G(this.X, n6.Xc, getResourceProvider());
        this.X.setTextSize(1, 12.0f);
        this.X.setGravity(17);
        this.V.addView(this.X, na.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.V, na.e(-1, -2, 87));
        this.f51569c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f));
        this.f51569c.setOnItemClickListener(new n8(this, 17));
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.f51569c.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(n6.f29451d6);
    }

    @Override
    public final v4.i0 k0() {
        j8 j8Var = new j8(this, this.f51569c, getParentActivity(), this.currentAccount, this.classGuid, new y7(this, 16), getResourceProvider(), 4);
        this.f18819f0 = j8Var;
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
        this.f18818e0 = true;
        this.Z = true;
        this.f18815b0 = I0();
        this.f18814a0 = null;
        mp messagesController = getMessagesController();
        long j3 = this.S;
        TLRPC.UserFull d2 = messagesController.d2(j3);
        if (d2 != null) {
            this.Z = false;
            TL_payments.starRefProgram starrefprogram = d2.starref_program;
            this.f18815b0 = starrefprogram;
            if (starrefprogram == null) {
                this.Z = true;
                this.f18815b0 = I0();
                this.f18814a0 = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.f18814a0 = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.f18815b0;
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
        this.f18818e0 = false;
        org.telegram.messenger.g0.r(this.Y);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f51569c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f) + i12);
        this.f51569c.setClipToPadding(false);
        this.V.setPadding(0, 0, 0, i12);
    }

    @Override
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }
}
