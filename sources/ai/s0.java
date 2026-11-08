package ai;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import bi.gc;
import c8.ha;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ci0;
import org.telegram.ui.s9;
public class s0 extends f2 {
    public boolean D;
    public boolean E;
    public i0 F;
    public boolean G;
    public final n0 H;
    public int I;
    public final Paint J;
    public float K;
    public final int[] L;
    public final int[] M;
    public LinearGradient N;
    public final Paint O;
    public final Matrix P;
    public final Paint Q;
    public final RectF R;
    public final float[] S;
    public final int[] T;
    public final int[] U;
    public LinearGradient V;
    public int W;
    public int X;
    public int Y;
    public r Z;
    public long f1613a;
    public int f1614a0;
    public long f1615b;
    public int f1616b0;
    public org.telegram.ui.f f1617c;
    public int f1618c0;
    public l1 d;
    public float f1619d0;
    public y0 f1620e;
    public boolean f1621e0;
    public FrameLayout f1622f;
    public LinearGradient f1623f0;
    public final Paint f1624g0;
    public q0 h;
    public final RectF f1625h0;
    public final int[] f1626i0;
    public final int[] f1627j0;
    public final int[] f1628k0;
    public final Path f1629l0;
    public final RectF m0;
    public float f1630n;
    public Paint f1631n0;
    public final n1 f1632o0;
    public final RectF f1633p0;
    public boolean f1634q0;
    public float f1635r;
    public Boolean f1636r0;
    public float f1637s;
    public float f1638w;
    public float f1639x;
    public d f1640y;

    public s0(Bundle bundle) {
        super(bundle);
        this.H = new n0(this, 0);
        this.J = new Paint();
        this.K = Float.NaN;
        this.L = new int[2];
        this.M = new int[2];
        this.O = new Paint();
        this.P = new Matrix();
        this.Q = new Paint(1);
        this.R = new RectF();
        this.S = new float[2];
        this.T = new int[2];
        this.U = new int[2];
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.f1624g0 = new Paint();
        this.f1625h0 = new RectF();
        this.f1626i0 = new int[2];
        this.f1627j0 = new int[2];
        this.f1628k0 = new int[2];
        this.f1629l0 = new Path();
        this.m0 = new RectF();
        this.f1632o0 = new n1(0);
        this.f1633p0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Z(s0 s0Var, AnimatorSet animatorSet) {
        s0Var.l0();
        boolean z9 = !s0Var.D;
        int i7 = s0Var.currentAccount;
        s0Var.Y = i7;
        s0Var.W = qs.f(i7).q(null, -1, z9);
        s0Var.X = qs.e().q(null, -1, z9);
        animatorSet.start();
    }

    public static void a0(s0 s0Var) {
        if (s0Var.getParentActivity() == null) {
            return;
        }
        zh.g1 g1Var = new zh.g1(s0Var.getParentActivity(), s0Var.currentAccount, s0Var.getUserConfig().e(), null, null);
        if (!g1Var.f60335l2) {
            g1Var.f60335l2 = true;
            gc gcVar = g1Var.f60337n2;
            if (gcVar != null && (gcVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) g1Var.f60337n2.getParent();
                int indexOfChild = viewGroup.indexOfChild(g1Var.f60337n2);
                viewGroup.removeView(g1Var.f60337n2);
                gc gcVar2 = new gc(g1Var.getContext(), 250, 2, 0);
                g1Var.f60337n2 = gcVar2;
                viewGroup.addView(gcVar2, indexOfChild, ha.c(-1.0f, -1));
            }
            w70 w70Var = g1Var.f60338o2;
            if (w70Var != null) {
                String M0 = id.M0(2131750289, null);
                jb jbVar = g1Var.f60327c2;
                jbVar.setText(M0);
                jbVar.setBreakStrategy(2);
                w70Var.setVisibility(8);
            }
            g1Var.Q1.O(false);
        }
        g1Var.show();
    }

    public static void c0(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                c0(viewGroup.getChildAt(i7));
            }
        }
    }

    public static void e0(f2 f2Var) {
        s9.j0(f2Var.getParentActivity(), 1, new f5.u(f2Var.getCurrentAccount(), f2Var, 1));
    }

    public static LinearGradient j0(boolean z9) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            float f10 = i7 / 8.0f;
            float C = com.google.android.recaptcha.internal.a.C(f10, 2.0f, 3.0f, f10 * f10);
            if (!z9) {
                C = 1.0f - C;
            }
            iArr[i7] = ((int) ((C * 255.0f) + 0.5f)) << 24;
            fArr[i7] = f10;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void b0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            org.telegram.messenger.g0.m3(parentActivity, false);
            org.telegram.messenger.g0.s3(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.f1636r0 == null) {
                    this.f1636r0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return false;
    }

    @Override
    public final void clearViews() {
        FrameLayout frameLayout = this.f1622f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        i0 i0Var = this.F;
        if (i0Var != null) {
            i0Var.g();
            this.F = null;
        }
        y0 y0Var = this.f1620e;
        if (y0Var != null) {
            y0Var.l();
            this.f1620e = null;
        }
        super.clearViews();
        l1 l1Var = this.d;
        if (l1Var != null) {
            l1Var.O0();
            this.d = null;
        }
        this.f1622f = null;
        this.h = null;
        this.f1640y = null;
        this.Z = null;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override
    public final android.view.View createView(android.content.Context r34) {
        throw new UnsupportedOperationException("Method not decompiled: ai.s0.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        l1 l1Var;
        if (this.h != null && (l1Var = this.d) != null && l1Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
            this.d.getClass();
            int width = (int) (this.f1622f.getWidth() - (this.d.getWidth() - org.telegram.messenger.g0.L(10.0f)));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
            if (layoutParams.height != max || layoutParams.leftMargin != r2 || layoutParams.rightMargin != width) {
                layoutParams.height = max;
                layoutParams.leftMargin = r2;
                layoutParams.rightMargin = width;
                this.h.setLayoutParams(layoutParams);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
        if (this.F == null && this.d != null && this.f1622f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.f1415j7);
            rectF2.set(this.d.f1388g7);
            if (rectF.isEmpty()) {
                rectF.set((this.f1622f.getWidth() / 2.0f) - org.telegram.messenger.g0.L(20.0f), (this.f1622f.getHeight() / 2.0f) - org.telegram.messenger.g0.L(20.0f), (this.f1622f.getWidth() / 2.0f) + org.telegram.messenger.g0.L(20.0f), (this.f1622f.getHeight() / 2.0f) + org.telegram.messenger.g0.L(20.0f));
            }
            this.d.setScanHidden(true);
            i0 i0Var = new i0(getParentActivity(), rectF, rectF2, new d6.i(this, 4));
            this.F = i0Var;
            i0Var.setButtonLabel(id.M0(2131746471, null));
            i0 i0Var2 = this.F;
            i0Var2.setOnGallery(new a1.e(15, this, i0Var2));
            this.f1622f.addView(this.F, ha.c(-1.0f, -1));
        }
    }

    public final void g0(float f10, float f11, boolean z9) {
        int i7;
        int i10;
        if (!z9) {
            q0 q0Var = this.h;
            if (q0Var != null && q0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            d dVar = this.f1640y;
            if (dVar != null && dVar.getVisibility() == 0) {
                this.f1640y.setVisibility(4);
                return;
            }
            return;
        }
        if (this.h == null) {
            if (getParentActivity() != null) {
                q0 q0Var2 = new q0(this, getParentActivity(), this.currentAccount, new p0(this));
                this.h = q0Var2;
                q0Var2.setOutlineProvider(new r0(this, 0));
                this.h.setClipToOutline(true);
                d dVar2 = new d(getParentActivity(), new aa.n(this, 1));
                this.f1640y = dVar2;
                dVar2.f1141b = this.h;
                this.d.setOnPicksChanged(new n0(this, 1));
                this.f1640y.setOutlineProvider(this.h.getOutlineProvider());
                this.f1640y.setClipToOutline(true);
                this.f1622f.addView(this.h, ha.e(-1, -1, 48));
                d0();
                this.f1622f.post(new n0(this, 2));
            } else {
                return;
            }
        }
        d0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.leftMargin;
        int i13 = layoutParams.rightMargin;
        if (this.f1640y.getParent() == null) {
            this.f1622f.addView(this.f1640y, ha.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f1640y.getLayoutParams();
        if (layoutParams2.height != i11 || layoutParams2.leftMargin != i12 || layoutParams2.rightMargin != i13) {
            layoutParams2.height = i11;
            layoutParams2.leftMargin = i12;
            layoutParams2.rightMargin = i13;
            this.f1640y.setLayoutParams(layoutParams2);
        }
        this.f1640y.setTranslationY(f10);
        this.f1640y.setAlpha(f11);
        this.f1640y.invalidateOutline();
        this.f1640y.invalidate();
        if (this.f1640y.getVisibility() != 0) {
            this.f1640y.setVisibility(0);
        }
        int t02 = this.d.t0();
        j1 j1Var = this.d.f1446n;
        if (j1Var != null) {
            i7 = j1Var.h;
        } else {
            i7 = 872415231;
        }
        int i14 = t02 ^ i7;
        if (this.h.getTranslationY() != f10 || i14 != this.I) {
            this.h.setTranslationY(f10);
            this.I = i14;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f11);
        q0 q0Var3 = this.h;
        l1 l1Var = this.d;
        j1 j1Var2 = l1Var.f1446n;
        if (j1Var2 != null) {
            i10 = j1Var2.f1300b;
        } else {
            i10 = -16777216;
        }
        if (i10 != l1Var.f1320a2) {
            l1Var.f1320a2 = i10;
            l1Var.f1331b2 = (i0.a.f(0.13f, -1, l1.D0(0.75f, 1.3f, 0.16f, i10)) & 16777215) | (-1728053248);
        }
        q0Var3.setHeaderColor(l1Var.f1331b2);
        if (this.h.getVisibility() != 0) {
            q0 q0Var4 = this.h;
            if (q0Var4.J) {
                q0Var4.J = false;
                q0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.f1634q0) {
            k0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        l1 l1Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (l1Var = this.d) != null && l1Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || r2.f25213b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.E = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.f21336e.c(new a1.e(14, this, T0));
            }
        }
    }

    public final void i0(String str) {
        l1 l1Var;
        Uri uri;
        if (getParentActivity() != null && (l1Var = this.d) != null && l1Var.getCurrentLink() != null) {
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                uri = org.telegram.messenger.g0.C0(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
            } else {
                uri = null;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            if (uri != null) {
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.STREAM", uri);
                intent.addFlags(1);
            } else if (!TextUtils.isEmpty(str)) {
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str);
            } else {
                return;
            }
            try {
                getParentActivity().startActivity(Intent.createChooser(intent, id.M0(2131749171, null)));
            } catch (ActivityNotFoundException e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void k0() {
        q0 q0Var;
        if (this.f1634q0 || (q0Var = this.h) == null) {
            return;
        }
        w tabs = q0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(20.0f));
        float[] fArr = o1.f1595a[0];
        int ceil = (int) Math.ceil(org.telegram.messenger.g0.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i7 = ceil - 3;
        this.f1614a0 = Math.max(0, i7);
        this.f1616b0 = Math.max(0, i7);
        this.f1618c0 = Math.max(0, ceil - 4);
        tabs.f1660a = new ab.g(3, this, tabs);
        tabs.f1661b = new j0(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i10 = this.f1614a0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i10, this.f1616b0, i10, this.f1618c0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new r0(this, 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            int L2 = org.telegram.messenger.g0.L(2.0f);
            if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L || marginLayoutParams.topMargin != L2) {
                marginLayoutParams.leftMargin = L;
                marginLayoutParams.rightMargin = L;
                marginLayoutParams.topMargin = L2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        r grid = this.h.getGrid();
        this.f1634q0 = true;
        grid.f1607f3 = new k0(this, grid, tabs);
        grid.f1606e3 = new aa.k(2, this, grid);
        d dVar = this.f1640y;
        if (dVar.T != grid) {
            dVar.T = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new b(dVar, 0));
        }
        int L3 = org.telegram.messenger.g0.L(44.0f);
        this.Z = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, org.telegram.messenger.g0.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        m0();
        grid.setClipToPadding(false);
        grid.j(new o0(0, this, tabs));
        tabs.bringToFront();
    }

    public final void l0() {
        if (this.W >= 0) {
            qs.f(this.Y).j(this.W);
        }
        if (this.X >= 0) {
            qs.e().j(this.X);
        }
        this.X = -1;
        this.W = -1;
    }

    public final void m0() {
        l1 l1Var;
        float f10;
        r rVar = this.Z;
        if (rVar != null && (l1Var = this.d) != null) {
            if (l1Var.I.isEmpty()) {
                f10 = 12.0f;
            } else {
                f10 = 73.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (rVar.getPaddingBottom() != L) {
                rVar.setPadding(rVar.getPaddingLeft(), rVar.getPaddingTop(), rVar.getPaddingRight(), L);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        i0 i0Var = this.F;
        if (i0Var != null) {
            if (z9) {
                i0Var.e();
            }
            return false;
        }
        l1 l1Var = this.d;
        if (l1Var != null) {
            float f10 = l1Var.f1419k1;
            if (f10 > 0.5f || l1Var.f1372f1 > 0.5f) {
                if (z9) {
                    if (f10 > 0.5f) {
                        l1Var.l1 = 0.0f;
                    } else if (l1Var.f1372f1 > 0.5f) {
                        l1Var.f1382g1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        float f10;
        float f11;
        long j3;
        if (this.d != null && !org.telegram.messenger.g0.Q1()) {
            this.d.setRevealOpening(z9);
            l1 l1Var = this.d;
            float f12 = 1.0f;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            l1Var.setReveal(f10);
            if (z9) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (!z9) {
                f12 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
            ofFloat.addUpdateListener(new ah.h(this, 2));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat);
            if (z9) {
                j3 = 860;
            } else {
                j3 = 200;
            }
            animatorSet.setDuration(j3);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new g0(this, z9, runnable, 1));
            org.telegram.messenger.g0.h3(new a1.e(13, this, animatorSet));
            return animatorSet;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        long j3;
        long j10;
        boolean z9;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            j3 = bundle.getLong("user_id");
        } else {
            j3 = 0;
        }
        this.f1613a = j3;
        Bundle bundle2 = this.arguments;
        if (bundle2 != null) {
            j10 = bundle2.getLong("chat_id");
        } else {
            j10 = 0;
        }
        this.f1615b = j10;
        Bundle bundle3 = this.arguments;
        if (bundle3 != null && bundle3.getBoolean("immediate") && iz.o() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.D = z9;
        if (this.f1613a == 0 && this.f1615b == 0) {
            this.f1613a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l0();
        org.telegram.ui.f fVar = this.f1617c;
        if (fVar != null) {
            ci0 ci0Var = (ci0) fVar.f45409b;
            if (ci0Var.f44846b.remove(fVar)) {
                ci0Var.a();
            }
            this.f1617c = null;
        }
        FrameLayout frameLayout = this.f1622f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        i0 i0Var = this.F;
        if (i0Var != null) {
            i0Var.g();
            this.F = null;
        }
        y0 y0Var = this.f1620e;
        if (y0Var != null) {
            y0Var.l();
            this.f1620e = null;
        }
        l1 l1Var = this.d;
        if (l1Var != null) {
            l1Var.O0();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        i0 i0Var = this.F;
        if (i0Var != null) {
            i0Var.g();
            i0 i0Var2 = this.F;
            FrameLayout frameLayout = this.f1622f;
            if (frameLayout != null) {
                frameLayout.removeView(i0Var2);
            }
            if (this.F == i0Var2) {
                this.F = null;
            }
            l1 l1Var = this.d;
            if (l1Var != null) {
                l1Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && Build.VERSION.SDK_INT >= 29 && this.f1636r0 != null) {
            parentActivity.getWindow().setNavigationBarContrastEnforced(this.f1636r0.booleanValue());
            this.f1636r0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z9;
        if (i7 == 4) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.E && z9) {
                this.E = false;
                h0();
            }
            this.E = false;
        } else if (getParentActivity() != null && i7 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f27296a.T = org.telegram.messenger.g0.X2(id.M0(2131746504, null));
            alertDialog$Builder.k(id.M0(2131747301, null), new j0(this));
            alertDialog$Builder.h(id.M0(2131751772, null), null);
            int i10 = k6.L5;
            alertDialog$Builder.m(2131624116, 72, k6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        b0();
        if (getParentActivity() != null) {
            org.telegram.messenger.g0.m3(getParentActivity(), false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        l1 l1Var;
        super.onTransitionAnimationEnd(z9, z10);
        if (z9) {
            this.G = true;
        }
        if (z9 && (l1Var = this.d) != null) {
            l1Var.setReveal(1.0f);
        }
        if (z9 && !z10 && this.f1622f != null) {
            float f10 = h.S;
            long j3 = 0;
            if (Build.VERSION.SDK_INT >= 29 && iz.o() == 2) {
                j3 = Math.max(0L, Math.round(o1.f1596b[51]) - 860);
            }
            FrameLayout frameLayout = this.f1622f;
            n0 n0Var = this.H;
            frameLayout.removeCallbacks(n0Var);
            this.f1622f.postDelayed(n0Var, j3 + 680);
        }
    }
}
