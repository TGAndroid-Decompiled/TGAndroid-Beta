package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class bj6 extends jgc implements jm7, g94 {
    public FrameLayout E;
    public ej6 F;
    public im0 G;
    public yi6 H;
    public Integer I;
    public nk3 J;
    public qz4[] K;
    public int L;
    public int M;
    public int N;
    public e7a O;
    public hg5 P;
    public boolean Q;
    public final kz4 R;
    public final nz4 S;
    public final nz4 T;
    public l8c x;
    public m8c y;
    public final fn0 w = new fn0(0, this, d53.h, 380, true);
    public final RectF U = new RectF();
    public final RectF V = new RectF();
    public final wi6 W = new wi6(this, (byte) 0);

    public bj6() {
        if (Build.VERSION.SDK_INT >= 31) {
            nz4 nz4Var = new nz4(null);
            m41 m41Var = new m41(this, false);
            if (nz4Var.c == null) {
                nz4Var.c = new v89(nz4Var.b, m41Var);
            }
            this.S = nz4Var;
            nz4 nz4Var2 = new nz4(null);
            m41 m41Var2 = new m41(this, true);
            if (nz4Var2.c == null) {
                nz4Var2.c = new v89(nz4Var2.b, m41Var2);
            }
            this.T = nz4Var2;
        } else {
            this.S = null;
            this.T = null;
        }
        this.R = new kz4();
        s20 s20Var = new s20(this, (byte) 11);
        setBulletinDelegate(s20Var);
        u31.a(this.b, s20Var);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            h0();
            g0();
        }
    }

    @Override
    public final d a0(int i) {
        if (i == 1) {
            boolean z = e21.a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        } else if (i == 2) {
            return new daa(ts2.l("hasMainTabs", true));
        } else {
            if (i == 0) {
                nk3 nk3Var = new nk3(ts2.l("hasMainTabs", true));
                this.J = nk3Var;
                nk3Var.K3 = new fk3(this);
                return nk3Var;
            } else if (i != 3) {
                return null;
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", z8c.h(this.currentAccount).e());
                bundle2.putBoolean("my_profile", true);
                bundle2.putBoolean("hasMainTabs", true);
                return new ProfileActivity(bundle2, null);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.g5));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final void c0() {
        nz4 nz4Var;
        View view;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && (nz4Var = this.S) != null && (view = this.fragmentView) != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            e0();
            hz4 f = sy4.f();
            if (!f.a) {
                nz4Var = null;
            } else if (!f.b || i < 33) {
                nz4Var = this.T;
            }
            if (nz4Var != null) {
                nz4Var.n(measuredWidth, measuredHeight);
                nz4Var.c.a();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        d b0 = b0();
        if (b0 != null && b0.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        ej6 ej6Var = new ej6(context, this.resourceProvider);
        this.F = ej6Var;
        ej6Var.setClipChildren(false);
        this.F.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
        this.F.setMaxWidth(gm.L(344.0f));
        qz4[] qz4VarArr = new qz4[4];
        this.K = qz4VarArr;
        qz4VarArr[0] = qz4.c(context, this.resourceProvider, pz4.h, 2131748464);
        boolean z = e21.a;
        this.K[1] = qz4.c(context, this.resourceProvider, pz4.f, 2131748463);
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final bj6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                byte b = r2;
                bj6 bj6Var = this.b;
                switch (b) {
                    case 0:
                        if (bj6Var.getParentActivity() == null || bj6Var.getParentActivity() == null) {
                            return false;
                        }
                        bu5 I = bu5.I(bj6Var, view);
                        I.b(2131232105, jb6.M0(2131748040, null), new wi6(bj6Var, (byte) 1), false);
                        I.b(2131232089, jb6.M0(2131743123, null), new wi6(bj6Var, (byte) 2), false);
                        I.u = true;
                        I.v = true;
                        I.b0(0.0f, -gm.L(4.0f));
                        I.i = (byte) 3;
                        ShapeDrawable b0 = cmb.b0(gm.L(28.0f), bj6Var.getThemedColor(cmb.c6));
                        b0.getPaint().setShadowLayer(gm.L(6.0f), 0.0f, gm.L(1.0f), cmb.p1(0.15f, -16777216));
                        I.X(b0);
                        I.a0();
                        return true;
                    case 1:
                        return bj6Var.m0(view);
                    default:
                        bj6Var.l0(view);
                        return true;
                }
            }
        });
        this.K[2] = qz4.c(context, this.resourceProvider, pz4.n, 2131745229);
        qz4[] qz4VarArr2 = this.K;
        ylb ylbVar = this.resourceProvider;
        int i = this.currentAccount;
        qz4 qz4Var = new qz4(context);
        qz4Var.a.setText(jb6.M0(2131748462, null));
        qz4Var.b.setVisibility(8);
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(z8c.h(i).e()));
        pc0 pc0Var = new pc0(0, W1);
        bf0 bf0Var = new bf0(context);
        bf0Var.f(W1, pc0Var);
        bf0Var.setRoundRadius(gm.L(11.0f));
        qz4Var.c = bf0Var;
        qz4Var.addView(bf0Var, qoe.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        qz4Var.x = cmb.v0(cmb.Sl, ylbVar);
        qz4Var.s = cmb.v0(cmb.Ql, ylbVar);
        qz4Var.w = cmb.v0(cmb.Rl, ylbVar);
        qz4Var.a();
        qz4VarArr2[3] = qz4Var;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final bj6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                byte b = r2;
                bj6 bj6Var = this.b;
                switch (b) {
                    case 0:
                        if (bj6Var.getParentActivity() == null || bj6Var.getParentActivity() == null) {
                            return false;
                        }
                        bu5 I = bu5.I(bj6Var, view);
                        I.b(2131232105, jb6.M0(2131748040, null), new wi6(bj6Var, (byte) 1), false);
                        I.b(2131232089, jb6.M0(2131743123, null), new wi6(bj6Var, (byte) 2), false);
                        I.u = true;
                        I.v = true;
                        I.b0(0.0f, -gm.L(4.0f));
                        I.i = (byte) 3;
                        ShapeDrawable b0 = cmb.b0(gm.L(28.0f), bj6Var.getThemedColor(cmb.c6));
                        b0.getPaint().setShadowLayer(gm.L(6.0f), 0.0f, gm.L(1.0f), cmb.p1(0.15f, -16777216));
                        I.X(b0);
                        I.a0();
                        return true;
                    case 1:
                        return bj6Var.m0(view);
                    default:
                        bj6Var.l0(view);
                        return true;
                }
            }
        });
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final bj6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                byte b = r2;
                bj6 bj6Var = this.b;
                switch (b) {
                    case 0:
                        if (bj6Var.getParentActivity() == null || bj6Var.getParentActivity() == null) {
                            return false;
                        }
                        bu5 I = bu5.I(bj6Var, view);
                        I.b(2131232105, jb6.M0(2131748040, null), new wi6(bj6Var, (byte) 1), false);
                        I.b(2131232089, jb6.M0(2131743123, null), new wi6(bj6Var, (byte) 2), false);
                        I.u = true;
                        I.v = true;
                        I.b0(0.0f, -gm.L(4.0f));
                        I.i = (byte) 3;
                        ShapeDrawable b0 = cmb.b0(gm.L(28.0f), bj6Var.getThemedColor(cmb.c6));
                        b0.getPaint().setShadowLayer(gm.L(6.0f), 0.0f, gm.L(1.0f), cmb.p1(0.15f, -16777216));
                        I.X(b0);
                        I.a0();
                        return true;
                    case 1:
                        return bj6Var.m0(view);
                    default:
                        bj6Var.l0(view);
                        return true;
                }
            }
        });
        this.F.Q.add(this.K[0]);
        this.F.Q.add(this.K[1]);
        this.F.Q.add(this.K[3]);
        int i2 = 0;
        while (true) {
            qz4[] qz4VarArr3 = this.K;
            if (i2 >= qz4VarArr3.length) {
                break;
            }
            qz4 qz4Var2 = qz4VarArr3[i2];
            qz4Var2.setOnClickListener(new v0(this, i2, (byte) 9));
            this.F.addView(this.K[i2]);
            this.F.j(qz4Var2, true, false);
            i2++;
        }
        o0(this.c.getCurrentPosition(), false);
        int themedColor = getThemedColor(cmb.c6);
        kz4 kz4Var = this.R;
        kz4Var.a(themedColor);
        zgc zgcVar = new zgc(this.b);
        iz4 iz4Var = this.S;
        if (iz4Var == null) {
            iz4Var = kz4Var;
        }
        iz4 iz4Var2 = this.T;
        if (iz4Var2 == null) {
            iz4Var2 = kz4Var;
        }
        km0 km0Var = new km0(iz4Var, iz4Var2, kz4Var);
        ne6 ne6Var = this.b;
        km0Var.h = zgcVar;
        km0Var.i = ne6Var;
        km0Var.k = true;
        im0 c = km0Var.c(this.F, qqd.g(this.resourceProvider), false);
        this.G = c;
        c.r(gm.L(28.0f));
        this.G.q(gm.L(7.666f));
        this.F.setBackground(this.G);
        km0 km0Var2 = new km0(kz4Var, kz4Var, kz4Var);
        ne6 ne6Var2 = this.b;
        km0Var2.h = zgcVar;
        km0Var2.i = ne6Var2;
        this.H = new View(context);
        qm0 qm0Var = new qm0(km0Var2.c(this.H, null, false));
        qm0Var.b(gm.L(60.0f), true);
        this.H.setBackground(qm0Var);
        this.b.addView(this.H, qoe.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new x10((byte) 1));
        this.E.addView(this.F, qoe.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.b.addView(this.E, qoe.e(-1, -2, 80));
        m8c m8cVar = new m8c(context);
        this.y = m8cVar;
        this.b.addView(m8cVar, qoe.e(-1, -2, 80));
        a aVar = a.a;
        Activity parentActivity = getParentActivity();
        m8c m8cVar2 = this.y;
        ((ApplicationLoaderImpl) aVar).getClass();
        l8c l8cVar = new l8c(parentActivity, m8cVar2);
        this.x = l8cVar;
        l8cVar.updateAppUpdateViews(this.currentAccount, false);
        i0(false);
        return this.b;
    }

    public final void d0() {
        float f;
        int themedColor = getThemedColor(cmb.Z6);
        int themedColor2 = getThemedColor(cmb.c6);
        igc igcVar = this.c;
        if (igcVar != null) {
            f = igcVar.p(0);
        } else {
            f = 1.0f;
        }
        this.R.a(on2.f(f, themedColor, themedColor2));
        yi6 yi6Var = this.H;
        if (yi6Var != null) {
            yi6Var.invalidate();
        }
        im0 im0Var = this.G;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        c0();
        yi6 yi6Var2 = this.H;
        if (yi6Var2 != null) {
            yi6Var2.invalidate();
        }
        ej6 ej6Var = this.F;
        if (ej6Var != null) {
            ej6Var.invalidate();
        }
        qz4[] qz4VarArr = this.K;
        if (qz4VarArr != null) {
            for (qz4 qz4Var : qz4VarArr) {
                qz4Var.g();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        qz4 qz4Var;
        LaunchActivity launchActivity;
        boolean z = true;
        if (i != nm7.K4 && i != 2) {
            if (i == nm7.V4) {
                l8c l8cVar = this.x;
                if (l8cVar != null) {
                    l8cVar.updateFileProgress(null);
                    this.x.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i == nm7.Y1) {
                String str = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate = gda.f1;
                if (tL_help_appUpdate != null && tL_help_appUpdate.document != null) {
                    a.t();
                    return;
                }
                return;
            } else if (i == nm7.Z1) {
                String str2 = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = gda.f1;
                if (tL_help_appUpdate2 != null && tL_help_appUpdate2.document != null) {
                    a.t();
                    return;
                }
                return;
            } else if (i == nm7.X1) {
                l8c l8cVar2 = this.x;
                if (l8cVar2 != null) {
                    l8cVar2.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i == nm7.U4) {
                l8c l8cVar3 = this.x;
                if (l8cVar3 != null && (launchActivity = LaunchActivity.H1) != null) {
                    int i3 = this.currentAccount;
                    if (launchActivity.e0.size() != 1) {
                        z = false;
                    }
                    l8cVar3.updateAppUpdateViews(i3, z);
                    return;
                }
                return;
            } else if (i == nm7.x4) {
                int currentPosition = this.c.getCurrentPosition();
                SparseArray sparseArray = this.a;
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    hgc hgcVar = (hgc) sparseArray.valueAt(i4);
                    if (sparseArray.keyAt(i4) != currentPosition && hgcVar != null) {
                        hgcVar.a.clearViews();
                    }
                }
                return;
            } else if (i == nm7.j0) {
                qz4[] qz4VarArr = this.K;
                if (qz4VarArr != null && (qz4Var = qz4VarArr[3]) != null) {
                    int i5 = this.currentAccount;
                    TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(z8c.h(i5).e()));
                    qz4Var.c.f(W1, new pc0(0, W1));
                    return;
                }
                return;
            } else if (i == nm7.T5) {
                f0();
                return;
            } else {
                return;
            }
        }
        View view = this.fragmentView;
        i0((view == null || !view.isAttachedToWindow()) ? false : false);
    }

    public final void e0() {
        int i;
        int height;
        if (Build.VERSION.SDK_INT >= 31 && this.S != null && this.b != null) {
            m8c m8cVar = this.y;
            if (m8cVar != null && m8cVar.a()) {
                i = gm.L(44.0f);
            } else {
                i = 0;
            }
            int height2 = (((this.b.getHeight() - this.L) - i) - gm.L(8.0f)) - gm.L(56.0f);
            SparseArray sparseArray = this.a;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = ((hgc) sparseArray.valueAt(i2)).a;
                View view = dVar.fragmentView;
                if (view != null && view.getWidth() > 0) {
                    if (height2 >= view.getHeight()) {
                        dVar.setParentGlass(null, null);
                    } else {
                        RectF rectF = this.V;
                        rectF.set(0.0f, height2 - gm.L(1.0f), view.getWidth(), gm.L(1.0f) + height);
                        dVar.setParentGlass(rectF, this.W);
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z = e21.a;
        if (this.F != null && this.K[1] != null) {
            boolean w = bw2.w();
            if (w) {
                oc7.e1().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (z8c.h(this.currentAccount).V && !w && oc7.e1().getBoolean("askAboutContacts2", true)) {
                this.K[1].e("!", true, true);
            } else {
                this.K[1].e(null, true, true);
            }
        }
    }

    public final void g0() {
        int i;
        igc igcVar = this.c;
        if (igcVar != null && this.H != null) {
            float a = 1.0f - pqe.a(Math.abs(3.0f - igcVar.getPositionAnimated()), 0.0f, 1.0f);
            float R1 = (1.0f - ((1.0f - gm.R1(0.0f, 1.0f, gm.Q0(this.L))) * a)) * this.w.e;
            this.H.setAlpha(R1);
            this.H.setTranslationY(a * gm.L(48.0f));
            yi6 yi6Var = this.H;
            if (R1 > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            yi6Var.setVisibility(i);
        }
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        d b0 = b0();
        if (b0 != null) {
            return b0.getCustomSlideTransition(z, z2, f);
        }
        return null;
    }

    @Override
    public final bu3 getEdgeToEdgeSupportMode() {
        return bu3.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return super.getThemeDescriptions();
    }

    public final void h0() {
        int i;
        boolean z;
        int i2 = 0;
        if (this.y.a()) {
            i = gm.L(44.0f);
        } else {
            i = 0;
        }
        int i3 = -i;
        float f = this.w.e;
        this.E.setTranslationY(gm.U1(f, gm.L(40.0f) + i3, i3));
        ej6 ej6Var = this.F;
        int i4 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        boolean z2 = true;
        if (i4 > 0) {
            z = true;
        } else {
            z = false;
        }
        ej6Var.setClickable(z);
        ej6 ej6Var2 = this.F;
        if (i4 <= 0) {
            z2 = false;
        }
        ej6Var2.setEnabled(z2);
        this.F.setAlpha(f);
        ej6 ej6Var3 = this.F;
        if (f <= 0.0f) {
            i2 = 8;
        }
        ej6Var3.setVisibility(i2);
    }

    public final void i0(boolean z) {
        if (this.F == null) {
            return;
        }
        int i = cf7.Y(this.currentAccount).L;
        if (i > 0) {
            this.K[0].e(jb6.E(i, ','), false, z);
            return;
        }
        this.K[0].e(null, false, z);
    }

    public final void j0(int i, bu5 bu5Var) {
        if (this.currentAccount != i) {
            bu5Var.u();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i);
            }
        }
    }

    public final void k0() {
        int i = 0;
        Integer num = null;
        for (int i2 = 3; i2 >= 0; i2--) {
            if (!z8c.h(i2).o()) {
                i++;
                if (num == null) {
                    num = Integer.valueOf(i2);
                }
            }
        }
        if (!z8c.n()) {
            i--;
        }
        if (i > 0 && num != null) {
            presentFragment(new mh6(num.intValue()));
        } else if (!z8c.n()) {
            showDialog(new i46(7, this.currentAccount, null, getParentActivity(), this));
        }
    }

    public final void l0(View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (z8c.h(i).o()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new x03((byte) 29));
        bu5 I = bu5.I(this, view);
        if (z8c.c() < 4) {
            I.b(2131232050, jb6.M0(2131754481, null), new wi6(this, (byte) 5), false);
        }
        if (arrayList.size() > 0) {
            if (I.y() > 0) {
                I.j();
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z = true;
                } else {
                    z = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i3 = cmb.h6;
                Drawable Y = cmb.Y(getThemedColor(i3), 0, 0);
                wmb M = anb.M(i3);
                ylb resourceProvider = getResourceProvider();
                linearLayout.setBackground(Y);
                anb.j(linearLayout, Y, null, M, resourceProvider);
                TLRPC.User f = z8c.h(intValue).f();
                pc0 pc0Var = new pc0((ylb) null);
                pc0Var.q(f);
                yj3 yj3Var = new yj3(this, getParentActivity(), z);
                linearLayout.addView(yj3Var, qoe.t(34, 34, 16, 12, 0, 0, 0));
                bf0 bf0Var = new bf0(getParentActivity());
                if (z) {
                    bf0Var.setScaleX(0.833f);
                    bf0Var.setScaleY(0.833f);
                }
                bf0Var.setRoundRadius(gm.L(16.0f));
                bf0Var.getImageReceiver().d = intValue;
                bf0Var.f(f, pc0Var);
                yj3Var.addView(bf0Var, qoe.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                anb.X(textView, cmb.i5, getResourceProvider());
                textView.setText(m9c.r(f));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, qoe.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new wh(this, intValue, I, (byte) 9));
                I.q(linearLayout, qoe.o(230, 48));
            }
        }
        I.u = true;
        I.v = true;
        I.b0(0.0f, -gm.L(4.0f));
        ShapeDrawable b0 = cmb.b0(gm.L(28.0f), getThemedColor(cmb.c6));
        b0.getPaint().setShadowLayer(gm.L(6.0f), 0.0f, gm.L(1.0f), cmb.p1(0.15f, -16777216));
        I.X(b0);
        I.a0();
        jg5.r.a();
    }

    public final boolean m0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj6.m0(android.view.View):boolean");
    }

    public final nk3 n0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        nk3 nk3Var = new nk3(bundle);
        this.J = nk3Var;
        nk3Var.K3 = new fk3(this);
        this.a.put(0, new hgc(nk3Var));
        return this.J;
    }

    public final void o0(int i, boolean z) {
        boolean z2;
        int i2 = 0;
        while (true) {
            qz4[] qz4VarArr = this.K;
            if (i2 < qz4VarArr.length) {
                qz4 qz4Var = qz4VarArr[i2];
                if (i2 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                qz4Var.f(z2, z);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        boolean onBackPressed = super.onBackPressed(z);
        if (onBackPressed && this.c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z) {
                this.c.E(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        d b0 = b0();
        if (b0 != null) {
            b0.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        e7a e7aVar = new e7a(nm7.f(this.currentAccount), this);
        e7aVar.b(nm7.Y1);
        e7aVar.b(nm7.X1);
        e7aVar.b(nm7.Z1);
        e7aVar.b(nm7.K4);
        e7aVar.b(2);
        e7aVar.b(nm7.j0);
        e7aVar.b(nm7.T5);
        e7aVar.e(nm7.U4);
        e7aVar.e(nm7.V4);
        e7aVar.e(nm7.x4);
        this.O = e7aVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        u31.h(this.b);
        e7a e7aVar = this.O;
        if (e7aVar != null) {
            e7aVar.a();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        hg5 hg5Var = this.P;
        if (hg5Var != null) {
            hg5Var.f(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        d0();
        f0();
        i0(true);
        if (this.Q) {
            return;
        }
        if (this.P == null && jg5.r.c()) {
            gm.d3(new wi6(this, (byte) 3), 1500L);
        }
        this.Q = true;
    }

    @Override
    public final void onSlideProgress(boolean z, float f) {
        d b0 = b0();
        if (b0 != null) {
            b0.onSlideProgress(z, f);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p0(boolean z, float f) {
        for (int i = 0; i < this.K.length; i++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i - f));
            qz4 qz4Var = this.K[i];
            qz4Var.K = max;
            qz4Var.J = z;
            qz4Var.invalidate();
        }
        this.F.invalidate();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        d b0 = b0();
        if (b0 != null) {
            b0.prepareFragmentToSlide(z, z2);
        }
    }

    @Override
    public final void V(float f, int i) {
    }
}
