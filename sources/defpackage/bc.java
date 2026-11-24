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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class bc extends iz4 implements gk7 {
    public final long S;
    public FrameLayout T;
    public er4 U;
    public LinearLayout V;
    public tb W;
    public l46 X;
    public boolean Z;
    public TL_payments.starRefProgram a0;
    public TL_payments.starRefProgram b0;
    public boolean e0;
    public vb f0;
    public final rb Y = new rb(this, (byte) 0);
    public String[] c0 = null;
    public final List d0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public bc(long j) {
        this.S = j;
        this.N = true;
        this.M = gl.L(60.0f);
    }

    public static String I0(int i) {
        float f = i / 10.0f;
        if (((int) f) == f) {
            Locale locale = Locale.US;
            return oo1.n(i / 10, "%");
        }
        return String.format(Locale.US, "%.1f%%", Float.valueOf(f));
    }

    public final void B0(boolean z) {
        d dVar;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            ui5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    dVar = (d) fragmentStack.get(size);
                    if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).a() == this.S) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    dVar = null;
                    break;
                }
            }
            if (dVar != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).c0((d) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                dVar = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
            dVar = null;
        }
        if (dVar != null) {
            if (z) {
                u21.b0(dVar).I(2131624080, k96.M0(2131754336, null), gl.T2(k96.M0(2131754337, null))).j();
            } else {
                u21.b0(dVar).I(2131623990, k96.M0(2131754322, null), k96.M0(2131754323, null)).j();
            }
        }
    }

    public final void C0(ArrayList arrayList, l5c l5cVar) {
        int i;
        if (getParentActivity() == null) {
            return;
        }
        c4c c4cVar = new c4c(-2);
        c4cVar.c = (sb) super.n0(getParentActivity());
        arrayList.add(c4cVar);
        arrayList.add(zb.i(2131231814, k96.M0(2131753148, null), k96.M0(2131753149, null)));
        arrayList.add(zb.i(2131232093, k96.M0(2131753146, null), k96.M0(2131753147, null)));
        arrayList.add(zb.i(2131231810, k96.M0(2131753144, null), k96.M0(2131753145, null)));
        arrayList.add(c4c.B(1, null));
        arrayList.add(c4c.u(k96.M0(2131754341, null)));
        int f = getMessagesController().k4.D2.f();
        int i2 = this.b0.commission_permille;
        int f2 = getMessagesController().k4.E2.f();
        pb pbVar = new pb((byte) 0);
        nb nbVar = new nb(this, (byte) 1);
        c4c c4cVar2 = new c4c(15);
        c4cVar2.A = i2;
        c4cVar2.D = nbVar;
        hja hjaVar = new hja();
        hjaVar.a = f;
        hjaVar.b = f2;
        hjaVar.e = new wh9(pbVar, (byte) 19);
        c4cVar2.H = hjaVar;
        c4cVar2.C = -1L;
        TL_payments.starRefProgram starrefprogram = this.a0;
        if (starrefprogram == null) {
            i = -1;
        } else {
            i = starrefprogram.commission_permille;
        }
        c4cVar2.C = i;
        arrayList.add(c4cVar2);
        arrayList.add(c4c.C(k96.M0(2131754340, null)));
        oo1.o(2131754339, null, arrayList);
        String[] strArr = this.c0;
        List list = this.d0;
        if (strArr == null) {
            this.c0 = new String[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (intValue == 0) {
                    this.c0[i3] = k96.M0(2131749006, null);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.c0[i3] = k96.G(intValue / 12, "YearsShort", new Object[0]);
                } else {
                    this.c0[i3] = k96.G(intValue, "MonthsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.c0;
        int indexOf = list.indexOf(Integer.valueOf(this.b0.duration_months));
        nb nbVar2 = new nb(this, (byte) 2);
        c4c c4cVar3 = new c4c(14);
        c4cVar3.q = strArr2;
        c4cVar3.A = indexOf;
        c4cVar3.D = nbVar2;
        c4cVar3.C = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.a0;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                c4cVar3.C = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.a0.duration_months) {
                        c4cVar3.C = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(c4cVar3);
        arrayList.add(c4c.C(k96.M0(2131754338, null)));
        arrayList.add(xb.i(2, getThemedColor(bkb.kk), k96.M0(2131754334, null), k96.M0(2131754335, null)));
        arrayList.add(c4c.B(3, null));
        if (!this.Z && this.b0.end_date == 0) {
            c4c e = c4c.e(4, k96.M0(2131754321, null));
            e.s = true;
            arrayList.add(e);
            arrayList.add(c4c.B(5, null));
        }
        arrayList.add(c4c.B(6, null));
        arrayList.add(c4c.B(7, null));
    }

    public final TL_payments.starRefProgram D0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().k4.E2.f(), getMessagesController().k4.D2.f());
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void E0(hd hdVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        hdVar.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            na7 messagesController = getMessagesController();
            long j = this.S;
            TLRPC.UserFull W1 = messagesController.W1(j);
            if (W1 != null) {
                W1.starref_program = starrefprogram;
                getMessagesStorage().g2(W1, false);
                kk7.f(this.currentAccount).k(kk7.D0, Long.valueOf(j), W1);
            }
            B0(false);
        } else if (tL_error != null) {
            u21.e0(tL_error);
        }
    }

    public final void F0(Context context) {
        String G;
        int i;
        int i2;
        if (!this.W.e0) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        mfb mfbVar = new mfb(context, this.resourceProvider);
        rb rbVar = new rb(this, (byte) 1);
        mfbVar.f(k96.M0(2131754341, null), I0(this.b0.commission_permille), null, null);
        String M0 = k96.M0(2131754339, null);
        int i3 = this.b0.duration_months;
        if (i3 <= 0) {
            G = k96.M0(2131749006, null);
        } else if (i3 >= 12 && i3 % 12 == 0) {
            G = k96.G(i3 / 12, "Years", new Object[0]);
        } else {
            G = k96.G(i3, "Months", new Object[0]);
        }
        mfbVar.f(M0, G, null, null);
        frameLayout.addView(mfbVar, nme.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, context);
        String M02 = k96.M0(2131754344, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M02;
        if (this.Z) {
            i = 2131754327;
        } else {
            i = 2131754313;
        }
        hdVar.U = k96.M0(i, null);
        alertDialog$Builder.n(frameLayout);
        if (this.Z) {
            i2 = 2131754328;
        } else {
            i2 = 2131754314;
        }
        alertDialog$Builder.j(k96.M0(i2, null), new l0(rbVar, (byte) 6));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.o();
    }

    public final void G0(int i) {
        vb vbVar = this.f0;
        if (vbVar != null) {
            int i2 = vbVar.G(i).d;
            if (i2 == 4) {
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(gl.L(24.0f), 0, gl.L(24.0f), 0);
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i3 = bkb.F6;
                zkb.X(textView, i3, this.resourceProvider);
                textView.setText(gl.T2(k96.M0(2131754319, null)));
                linearLayout.addView(textView, nme.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                wb wbVar = new wb(getParentActivity(), (byte) 0);
                wbVar.setPadding(gl.L(15.0f), 0, 0, 0);
                wbVar.setTextSize(1, 16.0f);
                zkb.X(wbVar, i3, this.resourceProvider);
                wbVar.setText(gl.T2(k96.M0(2131754318, null)));
                linearLayout.addView(wbVar, nme.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                wb wbVar2 = new wb(getParentActivity(), (byte) 0);
                wbVar2.setPadding(gl.L(15.0f), 0, 0, 0);
                wbVar2.setTextSize(1, 16.0f);
                zkb.X(wbVar2, i3, this.resourceProvider);
                wbVar2.setText(gl.T2(k96.M0(2131754317, null)));
                linearLayout.addView(wbVar2, nme.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                wb wbVar3 = new wb(getParentActivity(), (byte) 0);
                wbVar3.setPadding(gl.L(15.0f), 0, 0, 0);
                wbVar3.setTextSize(1, 16.0f);
                zkb.X(wbVar3, i3, this.resourceProvider);
                wbVar3.setText(gl.T2(k96.M0(2131754316, null)));
                linearLayout.addView(wbVar3, nme.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                alertDialog$Builder.a.S = k96.M0(2131754344, null);
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.j(k96.M0(2131754320, null), new l0(this, (byte) 7));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
            } else if (i2 == 2) {
                presentFragment(new fbb(this.S));
            }
        }
    }

    public final void H0(hd hdVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        hdVar.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            na7 messagesController = getMessagesController();
            long j = this.S;
            TLRPC.UserFull W1 = messagesController.W1(j);
            if (W1 != null) {
                TL_payments.starRefProgram starrefprogram2 = this.b0;
                starrefprogram2.flags |= 2;
                int currentTime = getConnectionsManager().getCurrentTime();
                if (getConnectionsManager().isTestBackend()) {
                    i = 300;
                } else {
                    i = 86400;
                }
                starrefprogram2.end_date = currentTime + i;
                W1.starref_program = starrefprogram;
                getMessagesStorage().g2(W1, false);
                kk7.f(this.currentAccount).k(kk7.D0, Long.valueOf(j), W1);
            }
            B0(true);
        } else if (tL_error != null) {
            u21.e0(tL_error);
        }
    }

    public final void J0(boolean z) {
        int i;
        int i2;
        tb tbVar = this.W;
        if (!this.Z && this.b0.end_date == 0) {
            i = 2131754315;
        } else {
            i = 2131754329;
        }
        tbVar.i(k96.M0(i, null), z, true);
        rb rbVar = this.Y;
        gl.r(rbVar);
        rbVar.run();
        l46 l46Var = this.X;
        if (!this.Z && this.b0.end_date == 0) {
            i2 = 2131754312;
        } else {
            i2 = 2131754325;
        }
        l46Var.setText(gl.O2(k96.M0(i2, null), -1, 0, new rb(this, (byte) 2), null));
        K0();
        vb vbVar = this.f0;
        if (vbVar != null) {
            vbVar.O(z);
        }
    }

    public final void K0() {
        boolean z;
        TL_payments.starRefProgram starrefprogram;
        tb tbVar = this.W;
        TL_payments.starRefProgram starrefprogram2 = this.b0;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.a0) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
            z = true;
        } else {
            z = false;
        }
        tbVar.setEnabled(z);
    }

    @Override
    public final View createView(Context context) {
        this.H = false;
        this.F = gl.L(238.0f);
        zkb.h(bkb.h5, null, new sb((byte) 0, context, this));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClickable(true);
        er4 er4Var = new er4(context, 1, 3);
        this.U = er4Var;
        uq4 uq4Var = er4Var.b;
        uq4Var.z = bkb.Vk;
        uq4Var.A = bkb.Wk;
        uq4Var.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, nme.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        i0(k96.M0(2131753140, null), k96.M0(2131753141, null), this.T, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        zkb.h(bkb.c6, getResourceProvider(), this.V);
        View view = new View(context);
        zkb.h(bkb.c7, getResourceProvider(), view);
        this.V.addView(view, new LinearLayout.LayoutParams(nme.z(-1.0f), nme.z(1.0f / gl.p)));
        tb tbVar = new tb(context, true, this.resourceProvider, (byte) 0);
        tbVar.setRoundRadius(24);
        this.W = tbVar;
        tbVar.i(k96.M0(2131754329, null), false, true);
        this.W.setOnClickListener(new t(this, context, (byte) 7));
        this.V.addView(this.W, nme.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        l46 l46Var = new l46(context, this.resourceProvider);
        this.X = l46Var;
        zkb.X(l46Var, bkb.y6, getResourceProvider());
        zkb.G(this.X, bkb.Wc, getResourceProvider());
        this.X.setTextSize(1, 12.0f);
        this.X.setGravity(17);
        this.V.addView(this.X, nme.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        J0(false);
        ((FrameLayout) this.fragmentView).addView(this.V, nme.e(-1, -2, 87));
        this.c.setPadding(0, 0, 0, gl.L(84.0f));
        this.c.setOnItemClickListener(new u(this, (byte) 2));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.c.setItemAnimator(gb3Var);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(bkb.c6);
    }

    @Override
    public final w39 j0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new f(this, (byte) 7), getResourceProvider(), (byte) 0);
        this.f0 = vbVar;
        return vbVar;
    }

    @Override
    public final cra l0() {
        ub ubVar = new ub(getParentActivity(), (byte) 0);
        ubVar.c();
        return ubVar;
    }

    @Override
    public final View n0(Context context) {
        throw null;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.e0 = true;
        this.Z = true;
        this.b0 = D0();
        this.a0 = null;
        na7 messagesController = getMessagesController();
        long j = this.S;
        TLRPC.UserFull W1 = messagesController.W1(j);
        if (W1 != null) {
            this.Z = false;
            TL_payments.starRefProgram starrefprogram = W1.starref_program;
            this.b0 = starrefprogram;
            if (starrefprogram == null) {
                this.Z = true;
                this.b0 = D0();
                this.a0 = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.a0 = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.b0;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
            if (V1 != null) {
                getMessagesController().Y2(V1, getClassGuid(), true, new nb(this, (byte) 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.e0 = false;
        gl.r(this.Y);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.c.setPadding(0, 0, 0, gl.L(84.0f) + i4);
        this.c.setClipToPadding(false);
        this.V.setPadding(0, 0, 0, i4);
    }

    @Override
    public final void onPause() {
        super.onPause();
        er4 er4Var = this.U;
        if (er4Var != null) {
            er4Var.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        er4 er4Var = this.U;
        if (er4Var != null) {
            er4Var.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }
}
