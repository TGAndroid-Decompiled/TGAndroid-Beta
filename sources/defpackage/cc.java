package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class cc extends m15 implements fn7 {
    public final long S;
    public FrameLayout T;
    public it4 U;
    public LinearLayout V;
    public ub W;
    public p66 X;
    public boolean Z;
    public TL_payments.starRefProgram a0;
    public TL_payments.starRefProgram b0;
    public boolean e0;
    public wb f0;
    public final pb Y = new pb(this, (byte) 1);
    public String[] c0 = null;
    public final List d0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public cc(long j) {
        this.S = j;
        this.N = true;
        this.M = hl.L(60.0f);
    }

    public static String J0(int i) {
        float f = i / 10.0f;
        if (((int) f) == f) {
            Locale locale = Locale.US;
            return bp1.n(i / 10, "%");
        }
        return String.format(Locale.US, "%.1f%%", Float.valueOf(f));
    }

    public final void C0(boolean z) {
        e eVar;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            wk5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    eVar = (e) fragmentStack.get(size);
                    if ((eVar instanceof ProfileActivity) && ((ProfileActivity) eVar).a() == this.S) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    eVar = null;
                    break;
                }
            }
            if (eVar != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).c0((e) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                eVar = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
            eVar = null;
        }
        if (eVar != null) {
            if (z) {
                d31.b0(eVar).I(2131624080, ob6.M0(2131754332, null), hl.S2(ob6.M0(2131754333, null))).j();
            } else {
                d31.b0(eVar).I(2131623990, ob6.M0(2131754318, null), ob6.M0(2131754319, null)).j();
            }
        }
    }

    public final void D0(ArrayList arrayList, l9c l9cVar) {
        int i;
        if (getParentActivity() == null) {
            return;
        }
        b8c b8cVar = new b8c(-2);
        b8cVar.c = (tb) super.n0(getParentActivity());
        arrayList.add(b8cVar);
        arrayList.add(ac.i(2131231814, ob6.M0(2131753144, null), ob6.M0(2131753145, null)));
        arrayList.add(ac.i(2131232093, ob6.M0(2131753142, null), ob6.M0(2131753143, null)));
        arrayList.add(ac.i(2131231810, ob6.M0(2131753140, null), ob6.M0(2131753141, null)));
        arrayList.add(b8c.B(1, null));
        arrayList.add(b8c.u(ob6.M0(2131754337, null)));
        int f = getMessagesController().l4.L2.f();
        int i2 = this.b0.commission_permille;
        int f2 = getMessagesController().l4.M2.f();
        sb sbVar = new sb((byte) 0);
        ob obVar = new ob(this, (byte) 1);
        b8c b8cVar2 = new b8c(15);
        b8cVar2.A = i2;
        b8cVar2.D = obVar;
        ana anaVar = new ana();
        anaVar.a = f;
        anaVar.b = f2;
        anaVar.e = new hja(sbVar, (byte) 2);
        b8cVar2.H = anaVar;
        b8cVar2.C = -1L;
        TL_payments.starRefProgram starrefprogram = this.a0;
        if (starrefprogram == null) {
            i = -1;
        } else {
            i = starrefprogram.commission_permille;
        }
        b8cVar2.C = i;
        arrayList.add(b8cVar2);
        arrayList.add(b8c.C(ob6.M0(2131754336, null)));
        bp1.o(2131754335, null, arrayList);
        String[] strArr = this.c0;
        List list = this.d0;
        if (strArr == null) {
            this.c0 = new String[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (intValue == 0) {
                    this.c0[i3] = ob6.M0(2131748952, null);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.c0[i3] = ob6.G(intValue / 12, "YearsShort", new Object[0]);
                } else {
                    this.c0[i3] = ob6.G(intValue, "MonthsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.c0;
        int indexOf = list.indexOf(Integer.valueOf(this.b0.duration_months));
        ob obVar2 = new ob(this, (byte) 2);
        b8c b8cVar3 = new b8c(14);
        b8cVar3.q = strArr2;
        b8cVar3.A = indexOf;
        b8cVar3.D = obVar2;
        b8cVar3.C = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.a0;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                b8cVar3.C = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.a0.duration_months) {
                        b8cVar3.C = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(b8cVar3);
        arrayList.add(b8c.C(ob6.M0(2131754334, null)));
        arrayList.add(yb.i(2, getThemedColor(aob.lk), ob6.M0(2131754330, null), ob6.M0(2131754331, null)));
        arrayList.add(b8c.B(3, null));
        if (!this.Z && this.b0.end_date == 0) {
            b8c e = b8c.e(4, ob6.M0(2131754317, null));
            e.s = true;
            arrayList.add(e);
            arrayList.add(b8c.B(5, null));
        }
        arrayList.add(b8c.B(6, null));
        arrayList.add(b8c.B(7, null));
    }

    public final TL_payments.starRefProgram E0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().l4.M2.f(), getMessagesController().l4.L2.f());
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void F0(id idVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        idVar.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            uc7 messagesController = getMessagesController();
            long j = this.S;
            TLRPC.UserFull Y1 = messagesController.Y1(j);
            if (Y1 != null) {
                Y1.starref_program = starrefprogram;
                getMessagesStorage().l2(Y1, false);
                jn7.f(this.currentAccount).k(jn7.E0, Long.valueOf(j), Y1);
            }
            C0(false);
        } else if (tL_error != null) {
            d31.e0(tL_error);
        }
    }

    public final void G0(Context context) {
        String G;
        int i;
        int i2;
        if (!this.W.e0) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        hjb hjbVar = new hjb(context, this.resourceProvider);
        pb pbVar = new pb(this, (byte) 2);
        hjbVar.f(ob6.M0(2131754337, null), J0(this.b0.commission_permille), null, null);
        String M0 = ob6.M0(2131754335, null);
        int i3 = this.b0.duration_months;
        if (i3 <= 0) {
            G = ob6.M0(2131748952, null);
        } else if (i3 >= 12 && i3 % 12 == 0) {
            G = ob6.G(i3 / 12, "Years", new Object[0]);
        } else {
            G = ob6.G(i3, "Months", new Object[0]);
        }
        hjbVar.f(M0, G, null, null);
        frameLayout.addView(hjbVar, tre.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, context);
        String M02 = ob6.M0(2131754340, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M02;
        if (this.Z) {
            i = 2131754323;
        } else {
            i = 2131754309;
        }
        idVar.U = ob6.M0(i, null);
        alertDialog$Builder.n(frameLayout);
        if (this.Z) {
            i2 = 2131754324;
        } else {
            i2 = 2131754310;
        }
        alertDialog$Builder.j(ob6.M0(i2, null), new m0(pbVar, (byte) 7));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.o();
    }

    public final void H0(int i) {
        wb wbVar = this.f0;
        if (wbVar != null) {
            int i2 = wbVar.G(i).d;
            if (i2 == 4) {
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i3 = aob.G6;
                yob.X(textView, i3, this.resourceProvider);
                textView.setText(hl.S2(ob6.M0(2131754315, null)));
                linearLayout.addView(textView, tre.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                xb xbVar = new xb(getParentActivity(), (byte) 0);
                xbVar.setPadding(hl.L(15.0f), 0, 0, 0);
                xbVar.setTextSize(1, 16.0f);
                yob.X(xbVar, i3, this.resourceProvider);
                xbVar.setText(hl.S2(ob6.M0(2131754314, null)));
                linearLayout.addView(xbVar, tre.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                xb xbVar2 = new xb(getParentActivity(), (byte) 0);
                xbVar2.setPadding(hl.L(15.0f), 0, 0, 0);
                xbVar2.setTextSize(1, 16.0f);
                yob.X(xbVar2, i3, this.resourceProvider);
                xbVar2.setText(hl.S2(ob6.M0(2131754313, null)));
                linearLayout.addView(xbVar2, tre.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                xb xbVar3 = new xb(getParentActivity(), (byte) 0);
                xbVar3.setPadding(hl.L(15.0f), 0, 0, 0);
                xbVar3.setTextSize(1, 16.0f);
                yob.X(xbVar3, i3, this.resourceProvider);
                xbVar3.setText(hl.S2(ob6.M0(2131754312, null)));
                linearLayout.addView(xbVar3, tre.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131754340, null);
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.j(ob6.M0(2131754316, null), new m0(this, (byte) 6));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
            } else if (i2 == 2) {
                presentFragment(new bfb(this.S));
            }
        }
    }

    public final void I0(id idVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        idVar.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            uc7 messagesController = getMessagesController();
            long j = this.S;
            TLRPC.UserFull Y1 = messagesController.Y1(j);
            if (Y1 != null) {
                TL_payments.starRefProgram starrefprogram2 = this.b0;
                starrefprogram2.flags |= 2;
                int currentTime = getConnectionsManager().getCurrentTime();
                if (getConnectionsManager().isTestBackend()) {
                    i = 300;
                } else {
                    i = 86400;
                }
                starrefprogram2.end_date = currentTime + i;
                Y1.starref_program = starrefprogram;
                getMessagesStorage().l2(Y1, false);
                jn7.f(this.currentAccount).k(jn7.E0, Long.valueOf(j), Y1);
            }
            C0(true);
        } else if (tL_error != null) {
            d31.e0(tL_error);
        }
    }

    public final void K0(boolean z) {
        int i;
        int i2;
        ub ubVar = this.W;
        if (!this.Z && this.b0.end_date == 0) {
            i = 2131754311;
        } else {
            i = 2131754325;
        }
        ubVar.i(ob6.M0(i, null), z, true);
        pb pbVar = this.Y;
        hl.r(pbVar);
        pbVar.run();
        p66 p66Var = this.X;
        if (!this.Z && this.b0.end_date == 0) {
            i2 = 2131754308;
        } else {
            i2 = 2131754321;
        }
        p66Var.setText(hl.N2(ob6.M0(i2, null), -1, 0, new pb(this, (byte) 0), null));
        L0();
        wb wbVar = this.f0;
        if (wbVar != null) {
            wbVar.O(z);
        }
    }

    public final void L0() {
        boolean z;
        TL_payments.starRefProgram starrefprogram;
        ub ubVar = this.W;
        TL_payments.starRefProgram starrefprogram2 = this.b0;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.a0) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
            z = true;
        } else {
            z = false;
        }
        ubVar.setEnabled(z);
    }

    @Override
    public final View createView(Context context) {
        this.H = false;
        this.F = hl.L(238.0f);
        yob.h(aob.i5, null, new tb((byte) 0, context, this));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClickable(true);
        it4 it4Var = new it4(context, 1, 3);
        this.U = it4Var;
        ys4 ys4Var = it4Var.b;
        ys4Var.z = aob.Wk;
        ys4Var.A = aob.Xk;
        ys4Var.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, tre.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        i0(ob6.M0(2131753136, null), ob6.M0(2131753137, null), this.T, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        yob.h(aob.d6, getResourceProvider(), this.V);
        View view = new View(context);
        yob.h(aob.d7, getResourceProvider(), view);
        this.V.addView(view, new LinearLayout.LayoutParams(tre.z(-1.0f), tre.z(1.0f / hl.p)));
        ub ubVar = new ub(context, true, this.resourceProvider, (byte) 0);
        ubVar.setRoundRadius(24);
        this.W = ubVar;
        ubVar.i(ob6.M0(2131754325, null), false, true);
        this.W.setOnClickListener(new t(this, context, (byte) 7));
        this.V.addView(this.W, tre.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        p66 p66Var = new p66(context, this.resourceProvider);
        this.X = p66Var;
        yob.X(p66Var, aob.z6, getResourceProvider());
        yob.G(this.X, aob.Xc, getResourceProvider());
        this.X.setTextSize(1, 12.0f);
        this.X.setGravity(17);
        this.V.addView(this.X, tre.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.V, tre.e(-1, -2, 87));
        this.c.setPadding(0, 0, 0, hl.L(84.0f));
        this.c.setOnItemClickListener(new u(this, (byte) 2));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.c.setItemAnimator(zb3Var);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(aob.d6);
    }

    @Override
    public final j79 j0() {
        wb wbVar = new wb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new c(this, (byte) 7), getResourceProvider(), (byte) 0);
        this.f0 = wbVar;
        return wbVar;
    }

    @Override
    public final eva l0() {
        vb vbVar = new vb(getParentActivity(), (byte) 0);
        vbVar.c();
        return vbVar;
    }

    @Override
    public final View n0(Context context) {
        throw null;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.e0 = true;
        this.Z = true;
        this.b0 = E0();
        this.a0 = null;
        uc7 messagesController = getMessagesController();
        long j = this.S;
        TLRPC.UserFull Y1 = messagesController.Y1(j);
        if (Y1 != null) {
            this.Z = false;
            TL_payments.starRefProgram starrefprogram = Y1.starref_program;
            this.b0 = starrefprogram;
            if (starrefprogram == null) {
                this.Z = true;
                this.b0 = E0();
                this.a0 = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.a0 = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.b0;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j));
            if (X1 != null) {
                getMessagesController().f3(X1, getClassGuid(), true, new ob(this, (byte) 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.e0 = false;
        hl.r(this.Y);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.c.setPadding(0, 0, 0, hl.L(84.0f) + i4);
        this.c.setClipToPadding(false);
        this.V.setPadding(0, 0, 0, i4);
    }

    @Override
    public final void onPause() {
        super.onPause();
        it4 it4Var = this.U;
        if (it4Var != null) {
            it4Var.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        it4 it4Var = this.U;
        if (it4Var != null) {
            it4Var.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }
}
