package bi;

import ai.b3;
import ai.e2;
import ai.i4;
import ai.j5;
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
import b8.mf;
import ci.bb;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.s70;
import org.telegram.ui.s9;
import org.telegram.ui.zh0;
public class j0 extends d2 {
    public boolean E;
    public boolean F;
    public a0 G;
    public boolean H;
    public final f0 I;
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
    public long f3748a;
    public m f3749a0;
    public long f3750b;
    public int f3751b0;
    public org.telegram.ui.f f3752c;
    public int f3753c0;
    public a1 d;
    public int f3754d0;
    public o0 f3755e;
    public float f3756e0;
    public FrameLayout f3757f;
    public boolean f3758f0;
    public LinearGradient f3759g0;
    public h0 h;
    public final Paint f3760h0;
    public final RectF f3761i0;
    public final int[] f3762j0;
    public final int[] f3763k0;
    public final int[] f3764l0;
    public final Path m0;
    public float f3765n;
    public final RectF f3766n0;
    public Paint f3767o0;
    public final c1 f3768p0;
    public final RectF f3769q0;
    public float f3770r;
    public boolean f3771r0;
    public float f3772s;
    public Boolean f3773s0;
    public float f3774w;
    public float f3775x;
    public c f3776y;

    public j0(Bundle bundle) {
        super(bundle);
        this.I = new f0(this, 0);
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
        this.f3760h0 = new Paint();
        this.f3761i0 = new RectF();
        this.f3762j0 = new int[2];
        this.f3763k0 = new int[2];
        this.f3764l0 = new int[2];
        this.m0 = new Path();
        this.f3766n0 = new RectF();
        this.f3768p0 = new c1(0);
        this.f3769q0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Z(j0 j0Var, AnimatorSet animatorSet) {
        j0Var.l0();
        boolean z10 = !j0Var.E;
        int i3 = j0Var.currentAccount;
        j0Var.Z = i3;
        j0Var.X = hs.f(i3).q(null, -1, z10);
        j0Var.Y = hs.e().q(null, -1, z10);
        animatorSet.start();
    }

    public static void a0(j0 j0Var) {
        if (j0Var.getParentActivity() == null) {
            return;
        }
        b3 b3Var = new b3(j0Var.getParentActivity(), j0Var.currentAccount, j0Var.getUserConfig().e(), null, null);
        if (!b3Var.f520m2) {
            b3Var.f520m2 = true;
            bb bbVar = b3Var.f522o2;
            if (bbVar != null && (bbVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) b3Var.f522o2.getParent();
                int indexOfChild = viewGroup.indexOfChild(b3Var.f522o2);
                viewGroup.removeView(b3Var.f522o2);
                bb bbVar2 = new bb(b3Var.getContext(), 250, 2, 0);
                b3Var.f522o2 = bbVar2;
                viewGroup.addView(bbVar2, indexOfChild, mf.c(-1.0f, -1));
            }
            s70 s70Var = b3Var.f523p2;
            if (s70Var != null) {
                String M0 = bd.M0(2131750296, null);
                e2 e2Var = b3Var.f511d2;
                e2Var.setText(M0);
                e2Var.setBreakStrategy(2);
                s70Var.setVisibility(8);
            }
            b3Var.R1.O(false);
        }
        b3Var.show();
    }

    public static void c0(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                c0(viewGroup.getChildAt(i3));
            }
        }
    }

    public static void e0(d2 d2Var) {
        s9.j0(d2Var.getParentActivity(), 1, new e5.u(d2Var.getCurrentAccount(), d2Var, 3));
    }

    public static LinearGradient j0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i3 = 0; i3 < 9; i3++) {
            float f10 = i3 / 8.0f;
            float B = com.google.android.recaptcha.internal.a.B(f10, 2.0f, 3.0f, f10 * f10);
            if (!z10) {
                B = 1.0f - B;
            }
            iArr[i3] = ((int) ((B * 255.0f) + 0.5f)) << 24;
            fArr[i3] = f10;
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
                if (this.f3773s0 == null) {
                    this.f3773s0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
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
        FrameLayout frameLayout = this.f3757f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        a0 a0Var = this.G;
        if (a0Var != null) {
            a0Var.g();
            this.G = null;
        }
        o0 o0Var = this.f3755e;
        if (o0Var != null) {
            o0Var.l();
            this.f3755e = null;
        }
        super.clearViews();
        a1 a1Var = this.d;
        if (a1Var != null) {
            a1Var.O0();
            this.d = null;
        }
        this.f3757f = null;
        this.h = null;
        this.f3776y = null;
        this.f3749a0 = null;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override
    public final android.view.View createView(android.content.Context r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j0.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        a1 a1Var;
        if (this.h != null && (a1Var = this.d) != null && a1Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
            this.d.getClass();
            int width = (int) (this.f3757f.getWidth() - (this.d.getWidth() - org.telegram.messenger.g0.L(10.0f)));
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
        if (this.G == null && this.d != null && this.f3757f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.f3500k7);
            rectF2.set(this.d.h7);
            if (rectF.isEmpty()) {
                rectF.set((this.f3757f.getWidth() / 2.0f) - org.telegram.messenger.g0.L(20.0f), (this.f3757f.getHeight() / 2.0f) - org.telegram.messenger.g0.L(20.0f), (this.f3757f.getWidth() / 2.0f) + org.telegram.messenger.g0.L(20.0f), (this.f3757f.getHeight() / 2.0f) + org.telegram.messenger.g0.L(20.0f));
            }
            this.d.setScanHidden(true);
            a0 a0Var = new a0(getParentActivity(), rectF, rectF2, new android.support.v4.media.c(this, 5));
            this.G = a0Var;
            a0Var.setButtonLabel(bd.M0(2131746478, null));
            a0 a0Var2 = this.G;
            a0Var2.setOnGallery(new a1.f(17, this, a0Var2));
            this.f3757f.addView(this.G, mf.c(-1.0f, -1));
        }
    }

    public final void g0(float f10, float f11, boolean z10) {
        int i3;
        int i10;
        if (!z10) {
            h0 h0Var = this.h;
            if (h0Var != null && h0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            c cVar = this.f3776y;
            if (cVar != null && cVar.getVisibility() == 0) {
                this.f3776y.setVisibility(4);
                return;
            }
            return;
        }
        if (this.h == null) {
            if (getParentActivity() != null) {
                h0 h0Var2 = new h0(this, getParentActivity(), this.currentAccount, new g0(this));
                this.h = h0Var2;
                h0Var2.setOutlineProvider(new i0(this, 0));
                this.h.setClipToOutline(true);
                c cVar2 = new c(getParentActivity(), new bb.c(this, 7));
                this.f3776y = cVar2;
                cVar2.f3663b = this.h;
                this.d.setOnPicksChanged(new f0(this, 1));
                this.f3776y.setOutlineProvider(this.h.getOutlineProvider());
                this.f3776y.setClipToOutline(true);
                this.f3757f.addView(this.h, mf.e(-1, -1, 48));
                d0();
                this.f3757f.post(new f0(this, 2));
            } else {
                return;
            }
        }
        d0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.leftMargin;
        int i13 = layoutParams.rightMargin;
        if (this.f3776y.getParent() == null) {
            this.f3757f.addView(this.f3776y, mf.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f3776y.getLayoutParams();
        if (layoutParams2.height != i11 || layoutParams2.leftMargin != i12 || layoutParams2.rightMargin != i13) {
            layoutParams2.height = i11;
            layoutParams2.leftMargin = i12;
            layoutParams2.rightMargin = i13;
            this.f3776y.setLayoutParams(layoutParams2);
        }
        this.f3776y.setTranslationY(f10);
        this.f3776y.setAlpha(f11);
        this.f3776y.invalidateOutline();
        this.f3776y.invalidate();
        if (this.f3776y.getVisibility() != 0) {
            this.f3776y.setVisibility(0);
        }
        int t02 = this.d.t0();
        y0 y0Var = this.d.f3521n;
        if (y0Var != null) {
            i3 = y0Var.h;
        } else {
            i3 = 872415231;
        }
        int i14 = t02 ^ i3;
        if (this.h.getTranslationY() != f10 || i14 != this.J) {
            this.h.setTranslationY(f10);
            this.J = i14;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f11);
        h0 h0Var3 = this.h;
        a1 a1Var = this.d;
        y0 y0Var2 = a1Var.f3521n;
        if (y0Var2 != null) {
            i10 = y0Var2.f3919b;
        } else {
            i10 = -16777216;
        }
        if (i10 != a1Var.f3407b2) {
            a1Var.f3407b2 = i10;
            a1Var.c2 = (i0.a.f(0.13f, -1, a1.D0(0.75f, 1.3f, 0.16f, i10)) & 16777215) | (-1728053248);
        }
        h0Var3.setHeaderColor(a1Var.c2);
        if (this.h.getVisibility() != 0) {
            h0 h0Var4 = this.h;
            if (h0Var4.K) {
                h0Var4.K = false;
                h0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.f3771r0) {
            k0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        a1 a1Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (a1Var = this.d) != null && a1Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || r2.f25041b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.F = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.f21387e.c(new a1.f(16, this, T0));
            }
        }
    }

    public final void i0(String str) {
        a1 a1Var;
        Uri uri;
        if (getParentActivity() != null && (a1Var = this.d) != null && a1Var.getCurrentLink() != null) {
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
                getParentActivity().startActivity(Intent.createChooser(intent, bd.M0(2131749178, null)));
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
        h0 h0Var;
        if (this.f3771r0 || (h0Var = this.h) == null) {
            return;
        }
        r tabs = h0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(20.0f));
        float[] fArr = d1.f3697a[0];
        int ceil = (int) Math.ceil(org.telegram.messenger.g0.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i3 = ceil - 3;
        this.f3751b0 = Math.max(0, i3);
        this.f3753c0 = Math.max(0, i3);
        this.f3754d0 = Math.max(0, ceil - 4);
        tabs.f3830a = new ai.n(7, this, tabs);
        tabs.f3831b = new b0(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i10 = this.f3751b0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i10, this.f3753c0, i10, this.f3754d0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new i0(this, 1));
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
        m grid = this.h.getGrid();
        this.f3771r0 = true;
        grid.f3791g3 = new c0(this, grid, tabs);
        grid.f3790f3 = new d0(0, this, grid);
        c cVar = this.f3776y;
        if (cVar.U != grid) {
            cVar.U = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new j5(cVar, 3));
        }
        int L3 = org.telegram.messenger.g0.L(44.0f);
        this.f3749a0 = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, org.telegram.messenger.g0.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        m0();
        grid.setClipToPadding(false);
        grid.j(new i4(1, this, tabs));
        tabs.bringToFront();
    }

    public final void l0() {
        if (this.X >= 0) {
            hs.f(this.Z).j(this.X);
        }
        if (this.Y >= 0) {
            hs.e().j(this.Y);
        }
        this.Y = -1;
        this.X = -1;
    }

    public final void m0() {
        a1 a1Var;
        float f10;
        m mVar = this.f3749a0;
        if (mVar != null && (a1Var = this.d) != null) {
            if (a1Var.J.isEmpty()) {
                f10 = 12.0f;
            } else {
                f10 = 73.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (mVar.getPaddingBottom() != L) {
                mVar.setPadding(mVar.getPaddingLeft(), mVar.getPaddingTop(), mVar.getPaddingRight(), L);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        a0 a0Var = this.G;
        if (a0Var != null) {
            if (z10) {
                a0Var.e();
            }
            return false;
        }
        a1 a1Var = this.d;
        if (a1Var != null) {
            float f10 = a1Var.f3504l1;
            if (f10 > 0.5f || a1Var.f3458g1 > 0.5f) {
                if (z10) {
                    if (f10 > 0.5f) {
                        a1Var.m1 = 0.0f;
                    } else if (a1Var.f3458g1 > 0.5f) {
                        a1Var.f3467h1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        float f10;
        float f11;
        long j10;
        if (this.d != null && !org.telegram.messenger.g0.Q1()) {
            this.d.setRevealOpening(z10);
            a1 a1Var = this.d;
            float f12 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            a1Var.setReveal(f10);
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (!z10) {
                f12 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
            ofFloat.addUpdateListener(new bh.f(this, 2));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat);
            if (z10) {
                j10 = 860;
            } else {
                j10 = 200;
            }
            animatorSet.setDuration(j10);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new androidx.fragment.app.g(this, z10, runnable, 2));
            org.telegram.messenger.g0.h3(new a1.f(15, this, animatorSet));
            return animatorSet;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        long j10;
        long j11;
        boolean z10;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            j10 = bundle.getLong("user_id");
        } else {
            j10 = 0;
        }
        this.f3748a = j10;
        Bundle bundle2 = this.arguments;
        if (bundle2 != null) {
            j11 = bundle2.getLong("chat_id");
        } else {
            j11 = 0;
        }
        this.f3750b = j11;
        Bundle bundle3 = this.arguments;
        if (bundle3 != null && bundle3.getBoolean("immediate") && az.o() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
        if (this.f3748a == 0 && this.f3750b == 0) {
            this.f3748a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l0();
        org.telegram.ui.f fVar = this.f3752c;
        if (fVar != null) {
            zh0 zh0Var = (zh0) fVar.f45115b;
            if (zh0Var.f52684b.remove(fVar)) {
                zh0Var.a();
            }
            this.f3752c = null;
        }
        FrameLayout frameLayout = this.f3757f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        a0 a0Var = this.G;
        if (a0Var != null) {
            a0Var.g();
            this.G = null;
        }
        o0 o0Var = this.f3755e;
        if (o0Var != null) {
            o0Var.l();
            this.f3755e = null;
        }
        a1 a1Var = this.d;
        if (a1Var != null) {
            a1Var.O0();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        a0 a0Var = this.G;
        if (a0Var != null) {
            a0Var.g();
            a0 a0Var2 = this.G;
            FrameLayout frameLayout = this.f3757f;
            if (frameLayout != null) {
                frameLayout.removeView(a0Var2);
            }
            if (this.G == a0Var2) {
                this.G = null;
            }
            a1 a1Var = this.d;
            if (a1Var != null) {
                a1Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && Build.VERSION.SDK_INT >= 29 && this.f3773s0 != null) {
            parentActivity.getWindow().setNavigationBarContrastEnforced(this.f3773s0.booleanValue());
            this.f3773s0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        boolean z10;
        if (i3 == 4) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.F && z10) {
                this.F = false;
                h0();
            }
            this.F = false;
        } else if (getParentActivity() != null && i3 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(bd.M0(2131746511, null));
            alertDialog$Builder.k(bd.M0(2131747308, null), new b0(this));
            alertDialog$Builder.h(bd.M0(2131751772, null), null);
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
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        a1 a1Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.H = true;
        }
        if (z10 && (a1Var = this.d) != null) {
            a1Var.setReveal(1.0f);
        }
        if (z10 && !z11 && this.f3757f != null) {
            float f10 = f.S;
            long j10 = 0;
            if (Build.VERSION.SDK_INT >= 29 && az.o() == 2) {
                j10 = Math.max(0L, Math.round(d1.f3698b[51]) - 860);
            }
            FrameLayout frameLayout = this.f3757f;
            f0 f0Var = this.I;
            frameLayout.removeCallbacks(f0Var);
            this.f3757f.postDelayed(f0Var, j10 + 680);
        }
    }
}
