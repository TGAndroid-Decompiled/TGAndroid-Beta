package ki;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.b6;
import bi.x5;
import c8.ja;
import di.ub;
import di.z6;
import hi.q4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p00;
import org.telegram.ui.rv;
public final class k extends p00 implements is {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public LinearLayout V;
    public bi.s W;
    public z70 X;
    public boolean Z;
    public TL_payments.starRefProgram f18377a0;
    public TL_payments.starRefProgram f18378b0;
    public boolean f18381e0;
    public x5 f18382f0;
    public final d Y = new d(this, 0);
    public String[] f18379c0 = null;
    public final List f18380d0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public k(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(k kVar, Context context) {
        String G;
        int i7;
        int i10;
        if (!kVar.W.f14056d0) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        vx0 vx0Var = new vx0(context, kVar.resourceProvider);
        d dVar = new d(kVar, 1);
        vx0Var.c(hd.M0(2131754344, null), J0(kVar.f18378b0.commission_permille), null, null);
        String M0 = hd.M0(2131754342, null);
        int i11 = kVar.f18378b0.duration_months;
        if (i11 <= 0) {
            G = hd.M0(2131749198, null);
        } else if (i11 >= 12 && i11 % 12 == 0) {
            G = hd.G(i11 / 12, "Years", new Object[0]);
        } else {
            G = hd.G(i11, "Months", new Object[0]);
        }
        vx0Var.c(M0, G, null, null);
        frameLayout.addView(vx0Var, ja.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, kVar.resourceProvider);
        String M02 = hd.M0(2131754347, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M02;
        if (kVar.Z) {
            i7 = 2131754330;
        } else {
            i7 = 2131754316;
        }
        t1Var.U = hd.M0(i7, null);
        alertDialog$Builder.o(frameLayout);
        if (kVar.Z) {
            i10 = 2131754331;
        } else {
            i10 = 2131754317;
        }
        alertDialog$Builder.k(hd.M0(i10, null), new z6(dVar, 29));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    public static void B0(k kVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = kVar.S;
        t1Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull b22 = kVar.getMessagesController().b2(j3);
            if (b22 != null) {
                b22.starref_program = starrefprogram;
                kVar.getMessagesStorage().j2(b22, false);
                ns.f(kVar.currentAccount).k(ns.E0, Long.valueOf(j3), b22);
            }
            kVar.G0(false);
        } else if (tL_error != null) {
            cc.d0(tL_error);
        }
    }

    public static void C0(k kVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        long j3 = kVar.S;
        t1Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull b22 = kVar.getMessagesController().b2(j3);
            if (b22 != null) {
                TL_payments.starRefProgram starrefprogram2 = kVar.f18378b0;
                starrefprogram2.flags |= 2;
                int currentTime = kVar.getConnectionsManager().getCurrentTime();
                if (kVar.getConnectionsManager().isTestBackend()) {
                    i7 = 300;
                } else {
                    i7 = 86400;
                }
                starrefprogram2.end_date = currentTime + i7;
                b22.starref_program = starrefprogram;
                kVar.getMessagesStorage().j2(b22, false);
                ns.f(kVar.currentAccount).k(ns.E0, Long.valueOf(j3), b22);
            }
            kVar.G0(true);
        } else if (tL_error != null) {
            cc.d0(tL_error);
        }
    }

    public static void D0(k kVar, int i7) {
        x5 x5Var = kVar.f18382f0;
        if (x5Var != null) {
            int i10 = x5Var.G(i7).d;
            if (i10 == 4) {
                LinearLayout linearLayout = new LinearLayout(kVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                TextView textView = new TextView(kVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i11 = j6.G6;
                q6.U(textView, i11, kVar.resourceProvider);
                textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131754322, null)));
                linearLayout.addView(textView, ja.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                ub ubVar = new ub(kVar.getParentActivity(), 3);
                ubVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                ubVar.setTextSize(1, 16.0f);
                q6.U(ubVar, i11, kVar.resourceProvider);
                ubVar.setText(org.telegram.messenger.g0.X2(hd.M0(2131754321, null)));
                linearLayout.addView(ubVar, ja.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                ub ubVar2 = new ub(kVar.getParentActivity(), 3);
                ubVar2.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                ubVar2.setTextSize(1, 16.0f);
                q6.U(ubVar2, i11, kVar.resourceProvider);
                ubVar2.setText(org.telegram.messenger.g0.X2(hd.M0(2131754320, null)));
                linearLayout.addView(ubVar2, ja.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                ub ubVar3 = new ub(kVar.getParentActivity(), 3);
                ubVar3.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                ubVar3.setTextSize(1, 16.0f);
                q6.U(ubVar3, i11, kVar.resourceProvider);
                ubVar3.setText(org.telegram.messenger.g0.X2(hd.M0(2131754319, null)));
                linearLayout.addView(ubVar3, ja.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kVar.getParentActivity(), kVar.resourceProvider);
                alertDialog$Builder.f28392a.S = hd.M0(2131754347, null);
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(hd.M0(2131754323, null), new e(kVar, 0));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i10 == 2) {
                kVar.presentFragment(new j4(kVar.S));
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
        org.telegram.ui.ActionBar.e2 e2Var;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            o4 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(size);
                    if ((e2Var instanceof ProfileActivity) && ((ProfileActivity) e2Var).a() == this.S) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    e2Var = null;
                    break;
                }
            }
            if (e2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.e2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                e2Var = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
            e2Var = null;
        }
        if (e2Var != null) {
            if (z10) {
                cc.a0(e2Var).I(2131624080, hd.M0(2131754339, null), org.telegram.messenger.g0.X2(hd.M0(2131754340, null))).j();
            } else {
                cc.a0(e2Var).I(2131623990, hd.M0(2131754325, null), hd.M0(2131754326, null)).j();
            }
        }
    }

    public final void H0(ArrayList arrayList, p41 p41Var) {
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        b41 b41Var = new b41(-2);
        b41Var.f33174c = (rv) super.o0(getParentActivity());
        arrayList.add(b41Var);
        arrayList.add(i.i(2131231810, hd.M0(2131753151, null), hd.M0(2131753152, null)));
        arrayList.add(i.i(2131232089, hd.M0(2131753149, null), hd.M0(2131753150, null)));
        arrayList.add(i.i(2131231806, hd.M0(2131753147, null), hd.M0(2131753148, null)));
        arrayList.add(b41.B(1, null));
        arrayList.add(b41.u(hd.M0(2131754344, null)));
        int i10 = getMessagesController().f25305i6;
        int i11 = this.f18378b0.commission_permille;
        int i12 = getMessagesController().f25312j6;
        ci.x xVar = new ci.x(2);
        a aVar = new a(this, 1);
        b41 b41Var2 = new b41(15);
        b41Var2.f33194z = i11;
        b41Var2.C = aVar;
        r7 r7Var = new r7();
        r7Var.f31356a = i10;
        r7Var.f31357b = i12;
        r7Var.f31359e = new ca(xVar, 7);
        b41Var2.G = r7Var;
        b41Var2.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.f18377a0;
        if (starrefprogram == null) {
            i7 = -1;
        } else {
            i7 = starrefprogram.commission_permille;
        }
        b41Var2.B = i7;
        arrayList.add(b41Var2);
        arrayList.add(b41.C(hd.M0(2131754343, null)));
        arrayList.add(b41.u(hd.M0(2131754342, null)));
        String[] strArr = this.f18379c0;
        List list = this.f18380d0;
        if (strArr == null) {
            this.f18379c0 = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.f18379c0[i13] = hd.M0(2131749198, null);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.f18379c0[i13] = hd.G(intValue / 12, "YearsShort", new Object[0]);
                } else {
                    this.f18379c0[i13] = hd.G(intValue, "MonthsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.f18379c0;
        int indexOf = list.indexOf(Integer.valueOf(this.f18378b0.duration_months));
        a aVar2 = new a(this, 2);
        b41 b41Var3 = new b41(14);
        b41Var3.f33185p = strArr2;
        b41Var3.f33194z = indexOf;
        b41Var3.C = aVar2;
        b41Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.f18377a0;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                b41Var3.B = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.f18377a0.duration_months) {
                        b41Var3.B = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(b41Var3);
        arrayList.add(b41.C(hd.M0(2131754341, null)));
        arrayList.add(g.i(2, getThemedColor(j6.lk), hd.M0(2131754337, null), hd.M0(2131754338, null)));
        arrayList.add(b41.B(3, null));
        if (!this.Z && this.f18378b0.end_date == 0) {
            b41 e10 = b41.e(4, hd.M0(2131754324, null));
            e10.f33187r = true;
            arrayList.add(e10);
            arrayList.add(b41.B(5, null));
        }
        arrayList.add(b41.B(6, null));
        arrayList.add(b41.B(7, null));
    }

    public final TL_payments.starRefProgram I0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().f25312j6, getMessagesController().f25305i6);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void K0(boolean z10) {
        int i7;
        int i10;
        bi.s sVar = this.W;
        if (!this.Z && this.f18378b0.end_date == 0) {
            i7 = 2131754318;
        } else {
            i7 = 2131754332;
        }
        sVar.i(hd.M0(i7, null), z10, true);
        d dVar = this.Y;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
        z70 z70Var = this.X;
        if (!this.Z && this.f18378b0.end_date == 0) {
            i10 = 2131754315;
        } else {
            i10 = 2131754328;
        }
        z70Var.setText(org.telegram.messenger.g0.U2(hd.M0(i10, null), new d(this, 2)));
        L0();
        x5 x5Var = this.f18382f0;
        if (x5Var != null) {
            x5Var.O(z10);
        }
    }

    public final void L0() {
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        bi.s sVar = this.W;
        TL_payments.starRefProgram starrefprogram2 = this.f18378b0;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.f18377a0) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
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
        q6.h(j6.f28940i5, new bi.o2(7, context, this), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        vg.f fVar = mVar.f58893b;
        fVar.f58877z = j6.Wk;
        fVar.A = j6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.f50099e);
        this.T.addView(this.U, ja.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        j0(hd.M0(2131753143, null), hd.M0(2131753144, null), this.T, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        q6.h(j6.f28849d6, this.V, getResourceProvider());
        View view = new View(context);
        q6.h(j6.f28850d7, view, getResourceProvider());
        this.V.addView(view, new LinearLayout.LayoutParams(ja.z(-1.0f), ja.z(1.0f / org.telegram.messenger.g0.f23608p)));
        bi.s sVar = new bi.s(3, context, this.resourceProvider, true);
        sVar.setRoundRadius(24);
        this.W = sVar;
        sVar.i(hd.M0(2131754332, null), false, true);
        this.W.setOnClickListener(new ai.t2(25, this, context));
        this.V.addView(this.W, ja.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        z70 z70Var = new z70(context, this.resourceProvider);
        this.X = z70Var;
        q6.U(z70Var, j6.f29260z6, getResourceProvider());
        q6.G(this.X, j6.Xc, getResourceProvider());
        this.X.setTextSize(1, 12.0f);
        this.X.setGravity(17);
        this.V.addView(this.X, ja.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.V, ja.e(-1, -2, 87));
        this.f50098c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f));
        this.f50098c.setOnItemClickListener(new b6(this, 17));
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.f50098c.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(j6.f28849d6);
    }

    @Override
    public final v4.h0 k0() {
        x5 x5Var = new x5(this, this.f50098c, getParentActivity(), this.currentAccount, this.classGuid, new q4(this, 16), getResourceProvider(), 4);
        this.f18382f0 = x5Var;
        return x5Var;
    }

    @Override
    public final ug.s1 m0() {
        f fVar = new f(getParentActivity(), 0);
        fVar.c();
        return fVar;
    }

    @Override
    public final View o0(Context context) {
        throw null;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f18381e0 = true;
        this.Z = true;
        this.f18378b0 = I0();
        this.f18377a0 = null;
        np messagesController = getMessagesController();
        long j3 = this.S;
        TLRPC.UserFull b22 = messagesController.b2(j3);
        if (b22 != null) {
            this.Z = false;
            TL_payments.starRefProgram starrefprogram = b22.starref_program;
            this.f18378b0 = starrefprogram;
            if (starrefprogram == null) {
                this.Z = true;
                this.f18378b0 = I0();
                this.f18377a0 = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.f18377a0 = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.f18378b0;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null) {
                getMessagesController().W2(a22, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.f18381e0 = false;
        org.telegram.messenger.g0.r(this.Y);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f50098c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f) + i12);
        this.f50098c.setClipToPadding(false);
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
