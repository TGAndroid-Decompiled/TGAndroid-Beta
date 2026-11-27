package defpackage;

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
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public class rz8 extends e {
    public boolean E;
    public boolean F;
    public jz8 G;
    public boolean H;
    public final nz8 I;
    public int J;
    public final Paint K;
    public float L;
    public final int[] M;
    public final int[] N;
    public LinearGradient O;
    public final Paint P;
    public final Matrix Q;
    public final Paint R;
    public final RectF S;
    public final float[] T;
    public final int[] U;
    public final int[] V;
    public LinearGradient W;
    public int X;
    public int Y;
    public int Z;
    public long a;
    public yy8 a0;
    public long b;
    public int b0;
    public xh4 c;
    public int c0;
    public g09 d;
    public int d0;
    public vz8 e;
    public float e0;
    public FrameLayout f;
    public boolean f0;
    public LinearGradient g0;
    public pz8 h;
    public final Paint h0;
    public final RectF i0;
    public final int[] j0;
    public final int[] k0;
    public final int[] l0;
    public final Path m0;
    public float n;
    public final RectF n0;
    public Paint o0;
    public final so4 p0;
    public final RectF q0;
    public float r;
    public boolean r0;
    public float s;
    public Boolean s0;
    public float w;
    public float x;
    public ny3 y;

    public rz8(Bundle bundle) {
        super(bundle);
        this.I = new nz8(this, (byte) 0);
        this.K = new Paint();
        this.L = Float.NaN;
        this.M = new int[2];
        this.N = new int[2];
        this.P = new Paint();
        this.Q = new Matrix();
        this.R = new Paint(1);
        this.S = new RectF();
        this.T = new float[2];
        this.U = new int[2];
        this.V = new int[2];
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.h0 = new Paint();
        this.i0 = new RectF();
        this.j0 = new int[2];
        this.k0 = new int[2];
        this.l0 = new int[2];
        this.m0 = new Path();
        this.n0 = new RectF();
        this.p0 = new so4();
        this.q0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Z(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                Z(viewGroup.getChildAt(i));
            }
        }
    }

    public static void c0(e eVar) {
        la1.i0(eVar.getParentActivity(), 1, new ed(eVar.getCurrentAccount(), eVar, (byte) 14));
    }

    public static LinearGradient i0(boolean z) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            float f = i / 8.0f;
            float B = xnb.B(f, 2.0f, 3.0f, f * f);
            if (!z) {
                B = 1.0f - B;
            }
            iArr[i] = ((int) ((B * 255.0f) + 0.5f)) << 24;
            fArr[i] = f;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void Y() {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            hl.h3(parentActivity, false);
            hl.n3(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.s0 == null) {
                    this.s0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void a0(AnimatorSet animatorSet) {
        k0();
        boolean z = !this.E;
        int i = this.currentAccount;
        this.Z = i;
        this.X = jn7.f(i).p(null, -1, z);
        this.Y = jn7.e().p(null, -1, z);
        animatorSet.start();
    }

    public final void b0() {
        g09 g09Var;
        if (this.h != null && (g09Var = this.d) != null && g09Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
            this.d.getClass();
            int width = (int) (this.f.getWidth() - (this.d.getWidth() - hl.L(10.0f)));
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
    public final boolean canBeginSlide() {
        return false;
    }

    @Override
    public final void clearViews() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        jz8 jz8Var = this.G;
        if (jz8Var != null) {
            jz8Var.g();
            this.G = null;
        }
        vz8 vz8Var = this.e;
        if (vz8Var != null) {
            vz8Var.l();
            this.e = null;
        }
        super.clearViews();
        g09 g09Var = this.d;
        if (g09Var != null) {
            g09Var.O0();
            this.d = null;
        }
        this.f = null;
        this.h = null;
        this.y = null;
        this.a0 = null;
    }

    @Override
    public final a createActionBar(Context context) {
        return null;
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz8.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        yx4 yx4Var = new yx4(getParentActivity(), this.currentAccount, getUserConfig().e(), null, null);
        if (!yx4Var.n2) {
            yx4Var.n2 = true;
            uya uyaVar = yx4Var.p2;
            if (uyaVar != null && (uyaVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) yx4Var.p2.getParent();
                int indexOfChild = viewGroup.indexOfChild(yx4Var.p2);
                viewGroup.removeView(yx4Var.p2);
                uya uyaVar2 = new uya(yx4Var.getContext(), 250, 2);
                yx4Var.p2 = uyaVar2;
                viewGroup.addView(uyaVar2, indexOfChild, tre.c(-1.0f, -1));
            }
            p66 p66Var = yx4Var.q2;
            if (p66Var != null) {
                String M0 = ob6.M0(2131750247, null);
                b21 b21Var = yx4Var.e2;
                b21Var.setText(M0);
                b21Var.setBreakStrategy(2);
                p66Var.setVisibility(8);
            }
            yx4Var.T1.O(false);
        }
        yx4Var.show();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        if (this.G == null && this.d != null && this.f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.j7);
            rectF2.set(this.d.g7);
            if (rectF.isEmpty()) {
                rectF.set((this.f.getWidth() / 2.0f) - hl.L(20.0f), (this.f.getHeight() / 2.0f) - hl.L(20.0f), (this.f.getWidth() / 2.0f) + hl.L(20.0f), (this.f.getHeight() / 2.0f) + hl.L(20.0f));
            }
            this.d.setScanHidden(true);
            jz8 jz8Var = new jz8(getParentActivity(), rectF, rectF2, new pq8(this, (byte) 2));
            this.G = jz8Var;
            jz8Var.setButtonLabel(ob6.M0(2131746197, null));
            jz8 jz8Var2 = this.G;
            jz8Var2.setOnGallery(new ep8(this, jz8Var2, (byte) 27));
            this.f.addView(this.G, tre.c(-1.0f, -1));
        }
    }

    public final void f0(float f, float f2, boolean z) {
        int i;
        int i2;
        pz8 pz8Var = this.h;
        if (!z) {
            if (pz8Var != null && pz8Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            ny3 ny3Var = this.y;
            if (ny3Var != null && ny3Var.getVisibility() == 0) {
                this.y.setVisibility(4);
                return;
            }
            return;
        }
        if (pz8Var == null) {
            if (getParentActivity() != null) {
                pz8 pz8Var2 = new pz8(this, getParentActivity(), this.currentAccount, new oz8(this));
                this.h = pz8Var2;
                pz8Var2.setOutlineProvider(new qz8(this, (byte) 0));
                this.h.setClipToOutline(true);
                ny3 ny3Var2 = new ny3(getParentActivity(), new xh4(this, (byte) 26));
                this.y = ny3Var2;
                ny3Var2.b = this.h;
                this.d.setOnPicksChanged(new nz8(this, (byte) 1));
                this.y.setOutlineProvider(this.h.getOutlineProvider());
                this.y.setClipToOutline(true);
                this.f.addView(this.h, tre.e(-1, -1, 48));
                b0();
                this.f.post(new nz8(this, (byte) 2));
            } else {
                return;
            }
        }
        b0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i3 = layoutParams.height;
        int i4 = layoutParams.leftMargin;
        int i5 = layoutParams.rightMargin;
        if (this.y.getParent() == null) {
            this.f.addView(this.y, tre.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.y.getLayoutParams();
        if (layoutParams2.height != i3 || layoutParams2.leftMargin != i4 || layoutParams2.rightMargin != i5) {
            layoutParams2.height = i3;
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i5;
            this.y.setLayoutParams(layoutParams2);
        }
        this.y.setTranslationY(f);
        this.y.setAlpha(f2);
        this.y.invalidateOutline();
        this.y.invalidate();
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
        int t0 = this.d.t0();
        e09 e09Var = this.d.n;
        if (e09Var != null) {
            i = e09Var.h;
        } else {
            i = 872415231;
        }
        int i6 = t0 ^ i;
        if (this.h.getTranslationY() != f || i6 != this.J) {
            this.h.setTranslationY(f);
            this.J = i6;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f2);
        pz8 pz8Var3 = this.h;
        g09 g09Var = this.d;
        e09 e09Var2 = g09Var.n;
        if (e09Var2 != null) {
            i2 = e09Var2.b;
        } else {
            i2 = -16777216;
        }
        if (i2 != g09Var.b2) {
            g09Var.b2 = i2;
            g09Var.c2 = (vm2.f(0.13f, -1, g09.D0(0.75f, 1.3f, 0.16f, i2)) & 16777215) | (-1728053248);
        }
        pz8Var3.setHeaderColor(g09Var.c2);
        if (this.h.getVisibility() != 0) {
            pz8 pz8Var4 = this.h;
            if (pz8Var4.K) {
                pz8Var4.K = false;
                pz8Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.r0) {
            j0();
        }
    }

    public final void g0() {
        g09 g09Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (g09Var = this.d) != null && g09Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || f11.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.F = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.e.c(new ep8(this, T0, (byte) 26));
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0(String str) {
        g09 g09Var;
        Uri uri;
        if (getParentActivity() != null && (g09Var = this.d) != null && g09Var.getCurrentLink() != null) {
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                uri = hl.B0(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
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
                getParentActivity().startActivity(Intent.createChooser(intent, ob6.M0(2131748924, null)));
            } catch (ActivityNotFoundException e) {
                cc4.g(e, true);
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

    public final void j0() {
        pz8 pz8Var;
        if (this.r0 || (pz8Var = this.h) == null) {
            return;
        }
        cz8 tabs = pz8Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(hl.L(20.0f));
        float[] fArr = ehd.a[0];
        int ceil = (int) Math.ceil(hl.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i = ceil - 3;
        this.b0 = Math.max(0, i);
        this.c0 = Math.max(0, i);
        this.d0 = Math.max(0, ceil - 4);
        tabs.a = new m88(this, tabs, (byte) 18);
        tabs.b = new kz8(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i2 = this.b0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i2, this.c0, i2, this.d0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new qz8(this, (byte) 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int L = hl.L(10.0f);
            int L2 = hl.L(2.0f);
            if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L || marginLayoutParams.topMargin != L2) {
                marginLayoutParams.leftMargin = L;
                marginLayoutParams.rightMargin = L;
                marginLayoutParams.topMargin = L2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        yy8 grid = this.h.getGrid();
        this.r0 = true;
        grid.g3 = new lz8(this, grid, tabs);
        grid.f3 = new vy2(this, grid, (byte) 2);
        ny3 ny3Var = this.y;
        if (ny3Var.U != grid) {
            ny3Var.U = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new to2(ny3Var, (byte) 9));
        }
        int L3 = hl.L(44.0f);
        this.a0 = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, hl.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        l0();
        grid.setClipToPadding(false);
        grid.j(new bj1(this, tabs, (byte) 9));
        tabs.bringToFront();
    }

    public final void k0() {
        if (this.X >= 0) {
            jn7.f(this.Z).j(this.X);
        }
        if (this.Y >= 0) {
            jn7.e().j(this.Y);
        }
        this.Y = -1;
        this.X = -1;
    }

    public final void l0() {
        g09 g09Var;
        float f;
        yy8 yy8Var = this.a0;
        if (yy8Var != null && (g09Var = this.d) != null) {
            if (g09Var.J.isEmpty()) {
                f = 12.0f;
            } else {
                f = 73.0f;
            }
            int L = hl.L(f);
            if (yy8Var.getPaddingBottom() != L) {
                yy8Var.setPadding(yy8Var.getPaddingLeft(), yy8Var.getPaddingTop(), yy8Var.getPaddingRight(), L);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        jz8 jz8Var = this.G;
        if (jz8Var != null) {
            if (z) {
                jz8Var.e();
            }
            return false;
        }
        g09 g09Var = this.d;
        if (g09Var != null) {
            float f = g09Var.l1;
            if (f > 0.5f || g09Var.g1 > 0.5f) {
                if (z) {
                    if (f > 0.5f) {
                        g09Var.m1 = 0.0f;
                    } else if (g09Var.g1 > 0.5f) {
                        g09Var.h1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z);
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        float f;
        long j;
        if (this.d != null && !hl.O1()) {
            this.d.setRevealOpening(z);
            g09 g09Var = this.d;
            float f2 = 1.0f;
            float f3 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            g09Var.setReveal(f);
            if (!z) {
                f3 = 1.0f;
                f2 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
            ofFloat.addUpdateListener(new pv7(this, (byte) 25));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat);
            if (z) {
                j = 860;
            } else {
                j = 200;
            }
            animatorSet.setDuration(j);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new rw(this, z, runnable, (byte) 9));
            hl.c3(new ep8(this, animatorSet, (byte) 25));
            return animatorSet;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        long j;
        long j2;
        boolean z;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            j = bundle.getLong("user_id");
        } else {
            j = 0;
        }
        this.a = j;
        Bundle bundle2 = this.arguments;
        if (bundle2 != null) {
            j2 = bundle2.getLong("chat_id");
        } else {
            j2 = 0;
        }
        this.b = j2;
        Bundle bundle3 = this.arguments;
        if (bundle3 != null && bundle3.getBoolean("immediate") && xea.o() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.E = z;
        if (this.a == 0 && this.b == 0) {
            this.a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k0();
        xh4 xh4Var = this.c;
        if (xh4Var != null) {
            fu7 fu7Var = (fu7) xh4Var.b;
            if (fu7Var.b.remove(xh4Var)) {
                fu7Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        jz8 jz8Var = this.G;
        if (jz8Var != null) {
            jz8Var.g();
            this.G = null;
        }
        vz8 vz8Var = this.e;
        if (vz8Var != null) {
            vz8Var.l();
            this.e = null;
        }
        g09 g09Var = this.d;
        if (g09Var != null) {
            g09Var.O0();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        jz8 jz8Var = this.G;
        if (jz8Var != null) {
            jz8Var.g();
            jz8 jz8Var2 = this.G;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(jz8Var2);
            }
            if (this.G == jz8Var2) {
                this.G = null;
            }
            g09 g09Var = this.d;
            if (g09Var != null) {
                g09Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && Build.VERSION.SDK_INT >= 29 && this.s0 != null) {
            parentActivity.getWindow().setNavigationBarContrastEnforced(this.s0.booleanValue());
            this.s0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (i == 4) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.F && z) {
                this.F = false;
                g0();
            }
            this.F = false;
        } else if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                e0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = hl.S2(ob6.M0(2131746230, null));
            alertDialog$Builder.j(ob6.M0(2131747027, null), new kz8(this));
            alertDialog$Builder.g(ob6.M0(2131751737, null), null);
            int i2 = aob.L5;
            alertDialog$Builder.l(2131624117, 72, aob.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        Y();
        if (getParentActivity() != null) {
            hl.h3(getParentActivity(), false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            this.H = true;
            g09 g09Var = this.d;
            if (g09Var != null) {
                g09Var.setReveal(1.0f);
            }
        }
        if (z && !z2 && this.f != null) {
            float f = sy8.S;
            long j = 0;
            if (Build.VERSION.SDK_INT >= 29 && xea.o() == 2) {
                j = Math.max(0L, Math.round(ehd.b[51]) - 860);
            }
            FrameLayout frameLayout = this.f;
            nz8 nz8Var = this.I;
            frameLayout.removeCallbacks(nz8Var);
            this.f.postDelayed(nz8Var, j + 680);
        }
    }
}
