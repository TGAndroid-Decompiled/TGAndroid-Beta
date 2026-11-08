package hi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ec;
import bi.hc;
import bi.md;
import c8.ha;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l00;
import org.telegram.ui.o00;
public final class j extends o00 implements ls {
    public final long R;
    public FrameLayout S;
    public vg.m T;
    public LinearLayout U;
    public bi.w V;
    public w70 W;
    public boolean Y;
    public TL_payments.starRefProgram Z;
    public TL_payments.starRefProgram f14732a0;
    public boolean f14735d0;
    public hc f14736e0;
    public final d X = new d(this, 0);
    public String[] f14733b0 = null;
    public final List f14734c0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public j(long j3) {
        this.R = j3;
        this.M = true;
        this.L = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(j jVar, Context context) {
        String G;
        int i7;
        int i10;
        if (!jVar.V.f11752c0) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        tx0 tx0Var = new tx0(context, jVar.resourceProvider);
        d dVar = new d(jVar, 1);
        tx0Var.c(id.M0(2131754344, null), J0(jVar.f14732a0.commission_permille), null, null);
        String M0 = id.M0(2131754342, null);
        int i11 = jVar.f14732a0.duration_months;
        if (i11 <= 0) {
            G = id.M0(2131749199, null);
        } else if (i11 >= 12 && i11 % 12 == 0) {
            G = id.G(i11 / 12, "Years", new Object[0]);
        } else {
            G = id.G(i11, "Months", new Object[0]);
        }
        tx0Var.c(M0, G, null, null);
        frameLayout.addView(tx0Var, ha.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, jVar.resourceProvider);
        String M02 = id.M0(2131754347, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M02;
        if (jVar.Y) {
            i7 = 2131754330;
        } else {
            i7 = 2131754316;
        }
        u1Var.T = id.M0(i7, null);
        alertDialog$Builder.o(frameLayout);
        if (jVar.Y) {
            i10 = 2131754331;
        } else {
            i10 = 2131754317;
        }
        alertDialog$Builder.k(id.M0(i10, null), new di.q4(dVar, 19));
        alertDialog$Builder.h(id.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    public static void B0(j jVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = jVar.R;
        u1Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull b22 = jVar.getMessagesController().b2(j3);
            if (b22 != null) {
                b22.starref_program = starrefprogram;
                jVar.getMessagesStorage().j2(b22, false);
                qs.f(jVar.currentAccount).k(qs.E0, Long.valueOf(j3), b22);
            }
            jVar.G0(false);
        } else if (tL_error != null) {
            org.telegram.ui.Components.hc.d0(tL_error);
        }
    }

    public static void C0(j jVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        long j3 = jVar.R;
        u1Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull b22 = jVar.getMessagesController().b2(j3);
            if (b22 != null) {
                TL_payments.starRefProgram starrefprogram2 = jVar.f14732a0;
                starrefprogram2.flags |= 2;
                int currentTime = jVar.getConnectionsManager().getCurrentTime();
                if (jVar.getConnectionsManager().isTestBackend()) {
                    i7 = 300;
                } else {
                    i7 = 86400;
                }
                starrefprogram2.end_date = currentTime + i7;
                b22.starref_program = starrefprogram;
                jVar.getMessagesStorage().j2(b22, false);
                qs.f(jVar.currentAccount).k(qs.E0, Long.valueOf(j3), b22);
            }
            jVar.G0(true);
        } else if (tL_error != null) {
            org.telegram.ui.Components.hc.d0(tL_error);
        }
    }

    public static void D0(j jVar, int i7) {
        hc hcVar = jVar.f14736e0;
        if (hcVar != null) {
            int i10 = hcVar.G(i7).d;
            if (i10 == 4) {
                LinearLayout linearLayout = new LinearLayout(jVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                TextView textView = new TextView(jVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i11 = k6.G6;
                r6.V(textView, i11, jVar.resourceProvider);
                textView.setText(org.telegram.messenger.g0.X2(id.M0(2131754322, null)));
                linearLayout.addView(textView, ha.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                md mdVar = new md(jVar.getParentActivity(), 2);
                mdVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                mdVar.setTextSize(1, 16.0f);
                r6.V(mdVar, i11, jVar.resourceProvider);
                mdVar.setText(org.telegram.messenger.g0.X2(id.M0(2131754321, null)));
                linearLayout.addView(mdVar, ha.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                md mdVar2 = new md(jVar.getParentActivity(), 2);
                mdVar2.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                mdVar2.setTextSize(1, 16.0f);
                r6.V(mdVar2, i11, jVar.resourceProvider);
                mdVar2.setText(org.telegram.messenger.g0.X2(id.M0(2131754320, null)));
                linearLayout.addView(mdVar2, ha.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                md mdVar3 = new md(jVar.getParentActivity(), 2);
                mdVar3.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
                mdVar3.setTextSize(1, 16.0f);
                r6.V(mdVar3, i11, jVar.resourceProvider);
                mdVar3.setText(org.telegram.messenger.g0.X2(id.M0(2131754319, null)));
                linearLayout.addView(mdVar3, ha.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jVar.getParentActivity(), jVar.resourceProvider);
                alertDialog$Builder.f27296a.R = id.M0(2131754347, null);
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(id.M0(2131754323, null), new di.q4(jVar, 20));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i10 == 2) {
                jVar.presentFragment(new p4(jVar.R));
            }
        }
    }

    public static String J0(int i7) {
        float f10 = i7 / 10.0f;
        if (((int) f10) == f10) {
            Locale locale = Locale.US;
            return com.google.android.recaptcha.internal.a.i(i7 / 10, "%");
        }
        return String.format(Locale.US, "%.1f%%", Float.valueOf(f10));
    }

    public final void G0(boolean z9) {
        org.telegram.ui.ActionBar.f2 f2Var;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(size);
                    if ((f2Var instanceof ProfileActivity) && ((ProfileActivity) f2Var).a() == this.R) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    f2Var = null;
                    break;
                }
            }
            if (f2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.f2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                f2Var = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
            f2Var = null;
        }
        if (f2Var != null) {
            if (z9) {
                org.telegram.ui.Components.hc.a0(f2Var).I(2131624079, id.M0(2131754339, null), org.telegram.messenger.g0.X2(id.M0(2131754340, null))).j();
            } else {
                org.telegram.ui.Components.hc.a0(f2Var).I(2131623989, id.M0(2131754325, null), id.M0(2131754326, null)).j();
            }
        }
    }

    public final void H0(ArrayList arrayList, l41 l41Var) {
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        x31 x31Var = new x31(-2);
        x31Var.f40173c = (l00) super.o0(getParentActivity());
        arrayList.add(x31Var);
        arrayList.add(h.i(2131231810, id.M0(2131753151, null), id.M0(2131753152, null)));
        arrayList.add(h.i(2131232088, id.M0(2131753149, null), id.M0(2131753150, null)));
        arrayList.add(h.i(2131231806, id.M0(2131753147, null), id.M0(2131753148, null)));
        arrayList.add(x31.B(1, null));
        arrayList.add(x31.u(id.M0(2131754344, null)));
        int i10 = getMessagesController().f24801h6;
        int i11 = this.f14732a0.commission_permille;
        int i12 = getMessagesController().f24809i6;
        ai.c0 c0Var = new ai.c0(2);
        a aVar = new a(this, 1);
        x31 x31Var2 = new x31(15);
        x31Var2.f40193z = i11;
        x31Var2.C = aVar;
        s7 s7Var = new s7();
        s7Var.f30278a = i10;
        s7Var.f30279b = i12;
        s7Var.f30281e = new ca(c0Var, 7);
        x31Var2.G = s7Var;
        x31Var2.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.Z;
        if (starrefprogram == null) {
            i7 = -1;
        } else {
            i7 = starrefprogram.commission_permille;
        }
        x31Var2.B = i7;
        arrayList.add(x31Var2);
        arrayList.add(x31.C(id.M0(2131754343, null)));
        arrayList.add(x31.u(id.M0(2131754342, null)));
        String[] strArr = this.f14733b0;
        List list = this.f14734c0;
        if (strArr == null) {
            this.f14733b0 = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.f14733b0[i13] = id.M0(2131749199, null);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.f14733b0[i13] = id.G(intValue / 12, "YearsShort", new Object[0]);
                } else {
                    this.f14733b0[i13] = id.G(intValue, "MonthsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.f14733b0;
        int indexOf = list.indexOf(Integer.valueOf(this.f14732a0.duration_months));
        a aVar2 = new a(this, 2);
        x31 x31Var3 = new x31(14);
        x31Var3.f40184p = strArr2;
        x31Var3.f40193z = indexOf;
        x31Var3.C = aVar2;
        x31Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.Z;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                x31Var3.B = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.Z.duration_months) {
                        x31Var3.B = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(x31Var3);
        arrayList.add(x31.C(id.M0(2131754341, null)));
        arrayList.add(f.i(2, getThemedColor(k6.ik), id.M0(2131754337, null), id.M0(2131754338, null)));
        arrayList.add(x31.B(3, null));
        if (!this.Y && this.f14732a0.end_date == 0) {
            x31 e10 = x31.e(4, id.M0(2131754324, null));
            e10.f40186r = true;
            arrayList.add(e10);
            arrayList.add(x31.B(5, null));
        }
        arrayList.add(x31.B(6, null));
        arrayList.add(x31.B(7, null));
    }

    public final TL_payments.starRefProgram I0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().f24809i6, getMessagesController().f24801h6);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void K0(boolean z9) {
        int i7;
        int i10;
        bi.w wVar = this.V;
        if (!this.Y && this.f14732a0.end_date == 0) {
            i7 = 2131754318;
        } else {
            i7 = 2131754332;
        }
        wVar.i(id.M0(i7, null), z9, true);
        d dVar = this.X;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
        w70 w70Var = this.W;
        if (!this.Y && this.f14732a0.end_date == 0) {
            i10 = 2131754315;
        } else {
            i10 = 2131754328;
        }
        w70Var.setText(org.telegram.messenger.g0.U2(id.M0(i10, null), new d(this, 2)));
        L0();
        hc hcVar = this.f14736e0;
        if (hcVar != null) {
            hcVar.O(z9);
        }
    }

    public final void L0() {
        boolean z9;
        TL_payments.starRefProgram starrefprogram;
        bi.w wVar = this.V;
        TL_payments.starRefProgram starrefprogram2 = this.f14732a0;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.Z) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
            z9 = true;
        } else {
            z9 = false;
        }
        wVar.setEnabled(z9);
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = org.telegram.messenger.g0.L(238.0f);
        r6.i(k6.f27943i5, new ec(4, context, this), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 3);
        this.T = mVar;
        vg.f fVar = mVar.f57411b;
        fVar.f57395z = k6.Tk;
        fVar.A = k6.Uk;
        fVar.b();
        this.T.setStarParticlesView(this.f48194e);
        this.S.addView(this.T, ha.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        j0(id.M0(2131753143, null), id.M0(2131753144, null), this.S, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        r6.i(k6.f27852d6, this.U, getResourceProvider());
        View view = new View(context);
        r6.i(k6.f27853d7, view, getResourceProvider());
        this.U.addView(view, new LinearLayout.LayoutParams(ha.z(-1.0f), ha.z(1.0f / org.telegram.messenger.g0.f22562p)));
        bi.w wVar = new bi.w(2, context, this.resourceProvider, true);
        wVar.setRoundRadius(24);
        this.V = wVar;
        wVar.i(id.M0(2131754332, null), false, true);
        this.V.setOnClickListener(new bi.r(16, this, context));
        this.U.addView(this.V, ha.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        w70 w70Var = new w70(context, this.resourceProvider);
        this.W = w70Var;
        r6.V(w70Var, k6.f28262z6, getResourceProvider());
        r6.H(this.W, k6.Uc, getResourceProvider());
        this.W.setTextSize(1, 12.0f);
        this.W.setGravity(17);
        this.U.addView(this.W, ha.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.U, ha.e(-1, -2, 87));
        this.f48193c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f));
        this.f48193c.setOnItemClickListener(new ai.k(this, 13));
        v4.k kVar = new v4.k();
        kVar.f57070m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f48193c.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(k6.f27852d6);
    }

    @Override
    public final v4.g0 k0() {
        hc hcVar = new hc(this, this.f48193c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 26), getResourceProvider(), 3);
        this.f14736e0 = hcVar;
        return hcVar;
    }

    @Override
    public final ug.q1 m0() {
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
        this.f14735d0 = true;
        this.Y = true;
        this.f14732a0 = I0();
        this.Z = null;
        qp messagesController = getMessagesController();
        long j3 = this.R;
        TLRPC.UserFull b22 = messagesController.b2(j3);
        if (b22 != null) {
            this.Y = false;
            TL_payments.starRefProgram starrefprogram = b22.starref_program;
            this.f14732a0 = starrefprogram;
            if (starrefprogram == null) {
                this.Y = true;
                this.f14732a0 = I0();
                this.Z = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.Z = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.f14732a0;
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
        this.f14735d0 = false;
        org.telegram.messenger.g0.r(this.X);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f48193c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f) + i12);
        this.f48193c.setClipToPadding(false);
        this.U.setPadding(0, 0, 0, i12);
    }

    @Override
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }
}
