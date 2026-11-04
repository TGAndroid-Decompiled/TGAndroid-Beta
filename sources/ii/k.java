package ii;

import ai.f6;
import ai.j6;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.ec;
import ei.y8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l00;
public final class k extends l00 implements cs {
    public final long S;
    public FrameLayout T;
    public wg.m U;
    public LinearLayout V;
    public ai.x W;
    public s70 X;
    public boolean Z;
    public TL_payments.starRefProgram f15033a0;
    public TL_payments.starRefProgram f15034b0;
    public boolean f15037e0;
    public f6 f15038f0;
    public final d Y = new d(this, 0);
    public String[] f15035c0 = null;
    public final List f15036d0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public k(long j10) {
        this.S = j10;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(k kVar, Context context) {
        String G;
        int i3;
        int i10;
        if (!kVar.W.f12517d0) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        rx0 rx0Var = new rx0(context, kVar.resourceProvider);
        d dVar = new d(kVar, 1);
        rx0Var.c(bd.M0(2131754344, null), J0(kVar.f15034b0.commission_permille), null, null);
        String M0 = bd.M0(2131754342, null);
        int i11 = kVar.f15034b0.duration_months;
        if (i11 <= 0) {
            G = bd.M0(2131749206, null);
        } else if (i11 >= 12 && i11 % 12 == 0) {
            G = bd.G(i11 / 12, "Years", new Object[0]);
        } else {
            G = bd.G(i11, "Months", new Object[0]);
        }
        rx0Var.c(M0, G, null, null);
        frameLayout.addView(rx0Var, mf.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, kVar.resourceProvider);
        String M02 = bd.M0(2131754347, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M02;
        if (kVar.Z) {
            i3 = 2131754330;
        } else {
            i3 = 2131754316;
        }
        s1Var.U = bd.M0(i3, null);
        alertDialog$Builder.o(frameLayout);
        if (kVar.Z) {
            i10 = 2131754331;
        } else {
            i10 = 2131754317;
        }
        alertDialog$Builder.k(bd.M0(i10, null), new y8(dVar, 13));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    public static void B0(k kVar, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = kVar.S;
        s1Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull b22 = kVar.getMessagesController().b2(j10);
            if (b22 != null) {
                b22.starref_program = starrefprogram;
                kVar.getMessagesStorage().j2(b22, false);
                hs.f(kVar.currentAccount).k(hs.E0, Long.valueOf(j10), b22);
            }
            kVar.G0(false);
        } else if (tL_error != null) {
            fc.d0(tL_error);
        }
    }

    public static void C0(k kVar, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        long j10 = kVar.S;
        s1Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull b22 = kVar.getMessagesController().b2(j10);
            if (b22 != null) {
                TL_payments.starRefProgram starrefprogram2 = kVar.f15034b0;
                starrefprogram2.flags |= 2;
                int currentTime = kVar.getConnectionsManager().getCurrentTime();
                if (kVar.getConnectionsManager().isTestBackend()) {
                    i3 = 300;
                } else {
                    i3 = 86400;
                }
                starrefprogram2.end_date = currentTime + i3;
                b22.starref_program = starrefprogram;
                kVar.getMessagesStorage().j2(b22, false);
                hs.f(kVar.currentAccount).k(hs.E0, Long.valueOf(j10), b22);
            }
            kVar.G0(true);
        } else if (tL_error != null) {
            fc.d0(tL_error);
        }
    }

    public static void D0(k kVar, int i3) {
        f6 f6Var = kVar.f15038f0;
        if (f6Var != null) {
            int i10 = f6Var.G(i3).d;
            if (i10 == 4) {
                LinearLayout linearLayout = new LinearLayout(kVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                TextView textView = new TextView(kVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i11 = k6.G6;
                r6.V(textView, i11, kVar.resourceProvider);
                textView.setText(org.telegram.messenger.g0.X2(bd.M0(2131754322, null)));
                linearLayout.addView(textView, mf.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                ec ecVar = new ec(kVar.getParentActivity(), 2);
                ecVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                ecVar.setTextSize(1, 16.0f);
                r6.V(ecVar, i11, kVar.resourceProvider);
                ecVar.setText(org.telegram.messenger.g0.X2(bd.M0(2131754321, null)));
                linearLayout.addView(ecVar, mf.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                ec ecVar2 = new ec(kVar.getParentActivity(), 2);
                ecVar2.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                ecVar2.setTextSize(1, 16.0f);
                r6.V(ecVar2, i11, kVar.resourceProvider);
                ecVar2.setText(org.telegram.messenger.g0.X2(bd.M0(2131754320, null)));
                linearLayout.addView(ecVar2, mf.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                ec ecVar3 = new ec(kVar.getParentActivity(), 2);
                ecVar3.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                ecVar3.setTextSize(1, 16.0f);
                r6.V(ecVar3, i11, kVar.resourceProvider);
                ecVar3.setText(org.telegram.messenger.g0.X2(bd.M0(2131754319, null)));
                linearLayout.addView(ecVar3, mf.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kVar.getParentActivity(), kVar.resourceProvider);
                alertDialog$Builder.f27343a.S = bd.M0(2131754347, null);
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(bd.M0(2131754323, null), new y8(kVar, 14));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i10 == 2) {
                kVar.presentFragment(new p4(kVar.S));
            }
        }
    }

    public static String J0(int i3) {
        float f10 = i3 / 10.0f;
        if (((int) f10) == f10) {
            Locale locale = Locale.US;
            return com.google.android.recaptcha.internal.a.h(i3 / 10, "%");
        }
        return String.format(Locale.US, "%.1f%%", Float.valueOf(f10));
    }

    public final void G0(boolean z10) {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(size);
                    if ((d2Var instanceof ProfileActivity) && ((ProfileActivity) d2Var).a() == this.S) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    d2Var = null;
                    break;
                }
            }
            if (d2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.d2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                d2Var = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
            d2Var = null;
        }
        if (d2Var != null) {
            if (z10) {
                fc.a0(d2Var).I(2131624079, bd.M0(2131754339, null), org.telegram.messenger.g0.X2(bd.M0(2131754340, null))).j();
            } else {
                fc.a0(d2Var).I(2131623989, bd.M0(2131754325, null), bd.M0(2131754326, null)).j();
            }
        }
    }

    public final void H0(ArrayList arrayList, f41 f41Var) {
        int i3;
        if (getParentActivity() == null) {
            return;
        }
        r31 r31Var = new r31(-2);
        r31Var.f37620c = (org.telegram.ui.Components.voip.r0) super.o0(getParentActivity());
        arrayList.add(r31Var);
        arrayList.add(i.i(2131231810, bd.M0(2131753151, null), bd.M0(2131753152, null)));
        arrayList.add(i.i(2131232088, bd.M0(2131753149, null), bd.M0(2131753150, null)));
        arrayList.add(i.i(2131231806, bd.M0(2131753147, null), bd.M0(2131753148, null)));
        arrayList.add(r31.B(1, null));
        arrayList.add(r31.u(bd.M0(2131754344, null)));
        int i10 = getMessagesController().f23025h6;
        int i11 = this.f15034b0.commission_permille;
        int i12 = getMessagesController().f23032i6;
        bi.x xVar = new bi.x(2);
        a aVar = new a(this, 1);
        r31 r31Var2 = new r31(15);
        r31Var2.f37640z = i11;
        r31Var2.C = aVar;
        r7 r7Var = new r7();
        r7Var.f30280a = i10;
        r7Var.f30281b = i12;
        r7Var.f30283e = new ca(xVar, 7);
        r31Var2.G = r7Var;
        r31Var2.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.f15033a0;
        if (starrefprogram == null) {
            i3 = -1;
        } else {
            i3 = starrefprogram.commission_permille;
        }
        r31Var2.B = i3;
        arrayList.add(r31Var2);
        arrayList.add(r31.C(bd.M0(2131754343, null)));
        arrayList.add(r31.u(bd.M0(2131754342, null)));
        String[] strArr = this.f15035c0;
        List list = this.f15036d0;
        if (strArr == null) {
            this.f15035c0 = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.f15035c0[i13] = bd.M0(2131749206, null);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.f15035c0[i13] = bd.G(intValue / 12, "YearsShort", new Object[0]);
                } else {
                    this.f15035c0[i13] = bd.G(intValue, "MonthsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.f15035c0;
        int indexOf = list.indexOf(Integer.valueOf(this.f15034b0.duration_months));
        a aVar2 = new a(this, 2);
        r31 r31Var3 = new r31(14);
        r31Var3.f37631p = strArr2;
        r31Var3.f37640z = indexOf;
        r31Var3.C = aVar2;
        r31Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.f15033a0;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                r31Var3.B = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.f15033a0.duration_months) {
                        r31Var3.B = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(r31Var3);
        arrayList.add(r31.C(bd.M0(2131754341, null)));
        arrayList.add(g.i(2, getThemedColor(k6.ik), bd.M0(2131754337, null), bd.M0(2131754338, null)));
        arrayList.add(r31.B(3, null));
        if (!this.Z && this.f15034b0.end_date == 0) {
            r31 e10 = r31.e(4, bd.M0(2131754324, null));
            e10.f37633r = true;
            arrayList.add(e10);
            arrayList.add(r31.B(5, null));
        }
        arrayList.add(r31.B(6, null));
        arrayList.add(r31.B(7, null));
    }

    public final TL_payments.starRefProgram I0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().f23032i6, getMessagesController().f23025h6);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void K0(boolean z10) {
        int i3;
        int i10;
        ai.x xVar = this.W;
        if (!this.Z && this.f15034b0.end_date == 0) {
            i3 = 2131754318;
        } else {
            i3 = 2131754332;
        }
        xVar.i(bd.M0(i3, null), z10, true);
        d dVar = this.Y;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
        s70 s70Var = this.X;
        if (!this.Z && this.f15034b0.end_date == 0) {
            i10 = 2131754315;
        } else {
            i10 = 2131754328;
        }
        s70Var.setText(org.telegram.messenger.g0.U2(bd.M0(i10, null), new d(this, 2)));
        L0();
        f6 f6Var = this.f15038f0;
        if (f6Var != null) {
            f6Var.O(z10);
        }
    }

    public final void L0() {
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        ai.x xVar = this.W;
        TL_payments.starRefProgram starrefprogram2 = this.f15034b0;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.f15033a0) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        r6.i(k6.f27971i5, new ai.x2(5, context, this), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClickable(true);
        wg.m mVar = new wg.m(context, 1, 3);
        this.U = mVar;
        wg.f fVar = mVar.f57666b;
        fVar.f57650z = k6.Tk;
        fVar.A = k6.Uk;
        fVar.b();
        this.U.setStarParticlesView(this.f47064e);
        this.T.addView(this.U, mf.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        j0(bd.M0(2131753143, null), bd.M0(2131753144, null), this.T, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        r6.i(k6.f27878d6, this.V, getResourceProvider());
        View view = new View(context);
        r6.i(k6.f27879d7, view, getResourceProvider());
        this.V.addView(view, new LinearLayout.LayoutParams(mf.z(-1.0f), mf.z(1.0f / org.telegram.messenger.g0.f22607p)));
        ai.x xVar = new ai.x(3, context, this.resourceProvider, true);
        xVar.setRoundRadius(24);
        this.W = xVar;
        xVar.i(bd.M0(2131754332, null), false, true);
        this.W.setOnClickListener(new ai.d(22, this, context));
        this.V.addView(this.W, mf.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        s70 s70Var = new s70(context, this.resourceProvider);
        this.X = s70Var;
        r6.V(s70Var, k6.f28290z6, getResourceProvider());
        r6.H(this.X, k6.Uc, getResourceProvider());
        this.X.setTextSize(1, 12.0f);
        this.X.setGravity(17);
        this.V.addView(this.X, mf.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.V, mf.e(-1, -2, 87));
        this.f47063c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f));
        this.f47063c.setOnItemClickListener(new j6(this, 14));
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f47063c.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(k6.f27878d6);
    }

    @Override
    public final u4.h0 k0() {
        f6 f6Var = new f6(this, this.f47063c, getParentActivity(), this.currentAccount, this.classGuid, new gi.q4(this, 6), getResourceProvider(), 4);
        this.f15038f0 = f6Var;
        return f6Var;
    }

    @Override
    public final vg.t1 m0() {
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
        this.f15037e0 = true;
        this.Z = true;
        this.f15034b0 = I0();
        this.f15033a0 = null;
        hp messagesController = getMessagesController();
        long j10 = this.S;
        TLRPC.UserFull b22 = messagesController.b2(j10);
        if (b22 != null) {
            this.Z = false;
            TL_payments.starRefProgram starrefprogram = b22.starref_program;
            this.f15034b0 = starrefprogram;
            if (starrefprogram == null) {
                this.Z = true;
                this.f15034b0 = I0();
                this.f15033a0 = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.f15033a0 = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.f15034b0;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
            if (a22 != null) {
                getMessagesController().W2(a22, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.f15037e0 = false;
        org.telegram.messenger.g0.r(this.Y);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f47063c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f) + i12);
        this.f47063c.setClipToPadding(false);
        this.V.setPadding(0, 0, 0, i12);
    }

    @Override
    public final void onPause() {
        super.onPause();
        wg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        wg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
    }
}
