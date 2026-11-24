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
import org.telegram.ui.ActionBar.d;
public class iy8 extends d {
    public boolean E;
    public boolean F;
    public zx8 G;
    public boolean H;
    public final dy8 I;
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
    public ox8 a0;
    public long b;
    public int b0;
    public lj4 c;
    public int c0;
    public wy8 d;
    public int d0;
    public my8 e;
    public float e0;
    public FrameLayout f;
    public boolean f0;
    public LinearGradient g0;
    public gy8 h;
    public final Paint h0;
    public final RectF i0;
    public final int[] j0;
    public final int[] k0;
    public final int[] l0;
    public final Path m0;
    public float n;
    public final RectF n0;
    public Paint o0;
    public final oo4 p0;
    public final RectF q0;
    public float r;
    public boolean r0;
    public float s;
    public Boolean s0;
    public float w;
    public float x;
    public cz3 y;

    public iy8(Bundle bundle) {
        super(bundle);
        this.I = new dy8(this, (byte) 0);
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
        this.p0 = new oo4();
        this.q0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void a0(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a0(viewGroup.getChildAt(i));
            }
        }
    }

    public static void d0(d dVar) {
        lb1.j0(dVar.getParentActivity(), 1, new de(dVar.getCurrentAccount(), dVar, (byte) 14));
    }

    public static LinearGradient j0(boolean z) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            float f = i / 8.0f;
            float B = mlb.B(f, 2.0f, 3.0f, f * f);
            if (!z) {
                B = 1.0f - B;
            }
            iArr[i] = ((int) ((B * 255.0f) + 0.5f)) << 24;
            fArr[i] = f;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void Z() {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            gm.h3(parentActivity, false);
            gm.n3(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.s0 == null) {
                    this.s0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void b0(AnimatorSet animatorSet) {
        l0();
        boolean z = !this.E;
        int i = this.currentAccount;
        this.Z = i;
        this.X = nm7.f(i).p(null, -1, z);
        this.Y = nm7.e().p(null, -1, z);
        animatorSet.start();
    }

    public final void c0() {
        wy8 wy8Var;
        if (this.h != null && (wy8Var = this.d) != null && wy8Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
            this.d.getClass();
            int width = (int) (this.f.getWidth() - (this.d.getWidth() - gm.L(10.0f)));
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
        zx8 zx8Var = this.G;
        if (zx8Var != null) {
            zx8Var.g();
            this.G = null;
        }
        my8 my8Var = this.e;
        if (my8Var != null) {
            my8Var.l();
            this.e = null;
        }
        super.clearViews();
        wy8 wy8Var = this.d;
        if (wy8Var != null) {
            wy8Var.O0();
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
    public final android.view.View createView(android.content.Context r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy8.createView(android.content.Context):android.view.View");
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        if (getParentActivity() == null) {
            return;
        }
        ux4 ux4Var = new ux4(getParentActivity(), this.currentAccount, getUserConfig().e(), null, null);
        if (!ux4Var.n2) {
            ux4Var.n2 = true;
            uwa uwaVar = ux4Var.p2;
            if (uwaVar != null && (uwaVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) ux4Var.p2.getParent();
                int indexOfChild = viewGroup.indexOfChild(ux4Var.p2);
                viewGroup.removeView(ux4Var.p2);
                uwa uwaVar2 = new uwa(ux4Var.getContext(), 250, 2);
                ux4Var.p2 = uwaVar2;
                viewGroup.addView(uwaVar2, indexOfChild, qoe.c(-1.0f, -1));
            }
            l66 l66Var = ux4Var.q2;
            if (l66Var != null) {
                String M0 = jb6.M0(2131750221, null);
                a31 a31Var = ux4Var.e2;
                a31Var.setText(M0);
                a31Var.setBreakStrategy(2);
                l66Var.setVisibility(8);
            }
            ux4Var.T1.O(false);
        }
        ux4Var.show();
    }

    public final void f0() {
        if (this.G == null && this.d != null && this.f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.j7);
            rectF2.set(this.d.g7);
            if (rectF.isEmpty()) {
                rectF.set((this.f.getWidth() / 2.0f) - gm.L(20.0f), (this.f.getHeight() / 2.0f) - gm.L(20.0f), (this.f.getWidth() / 2.0f) + gm.L(20.0f), (this.f.getHeight() / 2.0f) + gm.L(20.0f));
            }
            this.d.setScanHidden(true);
            zx8 zx8Var = new zx8(getParentActivity(), rectF, rectF2, new et8(this, (byte) 1));
            this.G = zx8Var;
            zx8Var.setButtonLabel(jb6.M0(2131746203, null));
            zx8 zx8Var2 = this.G;
            zx8Var2.setOnGallery(new ey8(this, zx8Var2, (byte) 0));
            this.f.addView(this.G, qoe.c(-1.0f, -1));
        }
    }

    public final void g0(float f, float f2, boolean z) {
        int i;
        int i2;
        gy8 gy8Var = this.h;
        if (!z) {
            if (gy8Var != null && gy8Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            cz3 cz3Var = this.y;
            if (cz3Var != null && cz3Var.getVisibility() == 0) {
                this.y.setVisibility(4);
                return;
            }
            return;
        }
        if (gy8Var == null) {
            if (getParentActivity() != null) {
                gy8 gy8Var2 = new gy8(this, getParentActivity(), this.currentAccount, new fy8(this));
                this.h = gy8Var2;
                gy8Var2.setOutlineProvider(new hy8(this, (byte) 0));
                this.h.setClipToOutline(true);
                cz3 cz3Var2 = new cz3(getParentActivity(), new lj4(this));
                this.y = cz3Var2;
                cz3Var2.b = this.h;
                this.d.setOnPicksChanged(new dy8(this, (byte) 1));
                this.y.setOutlineProvider(this.h.getOutlineProvider());
                this.y.setClipToOutline(true);
                this.f.addView(this.h, qoe.e(-1, -1, 48));
                c0();
                this.f.post(new dy8(this, (byte) 2));
            } else {
                return;
            }
        }
        c0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i3 = layoutParams.height;
        int i4 = layoutParams.leftMargin;
        int i5 = layoutParams.rightMargin;
        if (this.y.getParent() == null) {
            this.f.addView(this.y, qoe.e(-1, -1, 48));
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
        uy8 uy8Var = this.d.n;
        if (uy8Var != null) {
            i = uy8Var.h;
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
        gy8 gy8Var3 = this.h;
        wy8 wy8Var = this.d;
        uy8 uy8Var2 = wy8Var.n;
        if (uy8Var2 != null) {
            i2 = uy8Var2.b;
        } else {
            i2 = -16777216;
        }
        if (i2 != wy8Var.b2) {
            wy8Var.b2 = i2;
            wy8Var.c2 = (on2.f(0.13f, -1, wy8.D0(0.75f, 1.3f, 0.16f, i2)) & 16777215) | (-1728053248);
        }
        gy8Var3.setHeaderColor(wy8Var.c2);
        if (this.h.getVisibility() != 0) {
            gy8 gy8Var4 = this.h;
            if (gy8Var4.K) {
                gy8Var4.K = false;
                gy8Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.r0) {
            k0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        wy8 wy8Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (wy8Var = this.d) != null && wy8Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || e21.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.F = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.e.c(new mn8(this, T0, (byte) 29));
            }
        }
    }

    public final void i0(String str) {
        wy8 wy8Var;
        Uri uri;
        if (getParentActivity() != null && (wy8Var = this.d) != null && wy8Var.getCurrentLink() != null) {
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                uri = gm.B0(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
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
                getParentActivity().startActivity(Intent.createChooser(intent, jb6.M0(2131748927, null)));
            } catch (ActivityNotFoundException e) {
                fc4.g(e, true);
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
        gy8 gy8Var;
        if (this.r0 || (gy8Var = this.h) == null) {
            return;
        }
        sx8 tabs = gy8Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(gm.L(20.0f));
        float[] fArr = ned.a[0];
        int ceil = (int) Math.ceil(gm.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i = ceil - 3;
        this.b0 = Math.max(0, i);
        this.c0 = Math.max(0, i);
        this.d0 = Math.max(0, ceil - 4);
        tabs.a = new xr8(this, tabs, (byte) 4);
        tabs.b = new ay8(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i2 = this.b0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i2, this.c0, i2, this.d0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new hy8(this, (byte) 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int L = gm.L(10.0f);
            int L2 = gm.L(2.0f);
            if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L || marginLayoutParams.topMargin != L2) {
                marginLayoutParams.leftMargin = L;
                marginLayoutParams.rightMargin = L;
                marginLayoutParams.topMargin = L2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        ox8 grid = this.h.getGrid();
        this.r0 = true;
        grid.g3 = new by8(this, grid, tabs);
        grid.f3 = new kz2(this, grid, (byte) 2);
        cz3 cz3Var = this.y;
        if (cz3Var.U != grid) {
            cz3Var.U = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new ip2(cz3Var, (byte) 10));
        }
        int L3 = gm.L(44.0f);
        this.a0 = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, gm.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        m0();
        grid.setClipToPadding(false);
        grid.j(new bk1(this, tabs, (byte) 9));
        tabs.bringToFront();
    }

    public final void l0() {
        if (this.X >= 0) {
            nm7.f(this.Z).j(this.X);
        }
        if (this.Y >= 0) {
            nm7.e().j(this.Y);
        }
        this.Y = -1;
        this.X = -1;
    }

    public final void m0() {
        wy8 wy8Var;
        float f;
        ox8 ox8Var = this.a0;
        if (ox8Var != null && (wy8Var = this.d) != null) {
            if (wy8Var.J.isEmpty()) {
                f = 12.0f;
            } else {
                f = 73.0f;
            }
            int L = gm.L(f);
            if (ox8Var.getPaddingBottom() != L) {
                ox8Var.setPadding(ox8Var.getPaddingLeft(), ox8Var.getPaddingTop(), ox8Var.getPaddingRight(), L);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        zx8 zx8Var = this.G;
        if (zx8Var != null) {
            if (z) {
                zx8Var.e();
            }
            return false;
        }
        wy8 wy8Var = this.d;
        if (wy8Var != null) {
            float f = wy8Var.l1;
            if (f > 0.5f || wy8Var.g1 > 0.5f) {
                if (z) {
                    if (f > 0.5f) {
                        wy8Var.m1 = 0.0f;
                    } else if (wy8Var.g1 > 0.5f) {
                        wy8Var.h1 = 0.0f;
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
        if (this.d != null && !gm.O1()) {
            this.d.setRevealOpening(z);
            wy8 wy8Var = this.d;
            float f2 = 1.0f;
            float f3 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            wy8Var.setReveal(f);
            if (!z) {
                f3 = 1.0f;
                f2 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
            ofFloat.addUpdateListener(new fx7(this, (byte) 24));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat);
            if (z) {
                j = 860;
            } else {
                j = 200;
            }
            animatorSet.setDuration(j);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new qx(this, z, runnable, (byte) 9));
            gm.c3(new mn8(this, animatorSet, (byte) 28));
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
        if (bundle3 != null && bundle3.getBoolean("immediate") && gda.o() == 2) {
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
        l0();
        lj4 lj4Var = this.c;
        if (lj4Var != null) {
            bt7 bt7Var = (bt7) lj4Var.a;
            if (bt7Var.b.remove(lj4Var)) {
                bt7Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        zx8 zx8Var = this.G;
        if (zx8Var != null) {
            zx8Var.g();
            this.G = null;
        }
        my8 my8Var = this.e;
        if (my8Var != null) {
            my8Var.l();
            this.e = null;
        }
        wy8 wy8Var = this.d;
        if (wy8Var != null) {
            wy8Var.O0();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        zx8 zx8Var = this.G;
        if (zx8Var != null) {
            zx8Var.g();
            zx8 zx8Var2 = this.G;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(zx8Var2);
            }
            if (this.G == zx8Var2) {
                this.G = null;
            }
            wy8 wy8Var = this.d;
            if (wy8Var != null) {
                wy8Var.setScanHidden(false);
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
                h0();
            }
            this.F = false;
        } else if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = gm.S2(jb6.M0(2131746236, null));
            alertDialog$Builder.j(jb6.M0(2131747033, null), new ay8(this));
            alertDialog$Builder.g(jb6.M0(2131751709, null), null);
            int i2 = cmb.K5;
            alertDialog$Builder.l(2131624117, 72, cmb.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        Z();
        if (getParentActivity() != null) {
            gm.h3(getParentActivity(), false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            this.H = true;
            wy8 wy8Var = this.d;
            if (wy8Var != null) {
                wy8Var.setReveal(1.0f);
            }
        }
        if (z && !z2 && this.f != null) {
            float f = ix8.S;
            long j = 0;
            if (Build.VERSION.SDK_INT >= 29 && gda.o() == 2) {
                j = Math.max(0L, Math.round(ned.b[51]) - 860);
            }
            FrameLayout frameLayout = this.f;
            dy8 dy8Var = this.I;
            frameLayout.removeCallbacks(dy8Var);
            this.f.postDelayed(dy8Var, j + 680);
        }
    }
}
