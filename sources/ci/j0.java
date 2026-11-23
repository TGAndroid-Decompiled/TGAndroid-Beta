package ci;

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
import bi.g6;
import bi.n3;
import bi.u1;
import bi.u2;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.ua;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.s2;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m80;
import org.telegram.ui.hi0;
import org.telegram.ui.t9;
public class j0 extends g2 {
    public boolean E;
    public boolean F;
    public b0 G;
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
    public long f5702a;
    public m f5703a0;
    public long f5704b;
    public int f5705b0;
    public org.telegram.ui.f f5706c;
    public int f5707c0;
    public z0 d;
    public int f5708d0;
    public o0 f5709e;
    public float f5710e0;
    public FrameLayout f5711f;
    public boolean f5712f0;
    public LinearGradient f5713g0;
    public h0 h;
    public final Paint f5714h0;
    public final RectF f5715i0;
    public final int[] f5716j0;
    public final int[] f5717k0;
    public final int[] f5718l0;
    public final Path m0;
    public float f5719n;
    public final RectF f5720n0;
    public Paint f5721o0;
    public final b1 f5722p0;
    public final RectF f5723q0;
    public float f5724r;
    public boolean f5725r0;
    public float f5726s;
    public Boolean f5727s0;
    public float f5728w;
    public float f5729x;
    public c f5730y;

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
        this.f5714h0 = new Paint();
        this.f5715i0 = new RectF();
        this.f5716j0 = new int[2];
        this.f5717k0 = new int[2];
        this.f5718l0 = new int[2];
        this.m0 = new Path();
        this.f5720n0 = new RectF();
        this.f5722p0 = new b1(0);
        this.f5723q0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Z(j0 j0Var, AnimatorSet animatorSet) {
        j0Var.l0();
        boolean z10 = !j0Var.E;
        int i7 = j0Var.currentAccount;
        j0Var.Z = i7;
        j0Var.X = ls.f(i7).q(null, -1, z10);
        j0Var.Y = ls.e().q(null, -1, z10);
        animatorSet.start();
    }

    public static void a0(j0 j0Var) {
        if (j0Var.getParentActivity() == null) {
            return;
        }
        n3 n3Var = new n3(j0Var.getParentActivity(), j0Var.currentAccount, j0Var.getUserConfig().e(), null, null);
        if (!n3Var.f3935o2) {
            n3Var.f3935o2 = true;
            ua uaVar = n3Var.f3937q2;
            if (uaVar != null && (uaVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) n3Var.f3937q2.getParent();
                int indexOfChild = viewGroup.indexOfChild(n3Var.f3937q2);
                viewGroup.removeView(n3Var.f3937q2);
                ua uaVar2 = new ua(n3Var.getContext(), 250, 2, 0);
                n3Var.f3937q2 = uaVar2;
                viewGroup.addView(uaVar2, indexOfChild, ma.c(-1.0f, -1));
            }
            m80 m80Var = n3Var.f3938r2;
            if (m80Var != null) {
                String N0 = hd.N0(2131750271, null);
                u2 u2Var = n3Var.f3926f2;
                u2Var.setText(N0);
                u2Var.setBreakStrategy(2);
                m80Var.setVisibility(8);
            }
            n3Var.U1.O(false);
        }
        n3Var.show();
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

    public static void e0(g2 g2Var) {
        t9.j0(g2Var.getParentActivity(), 1, new b3.j(g2Var.getCurrentAccount(), g2Var, 1));
    }

    public static LinearGradient j0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            float f10 = i7 / 8.0f;
            float C = e2.C(f10, 2.0f, 3.0f, f10 * f10);
            if (!z10) {
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
            org.telegram.messenger.g0.l3(parentActivity, false);
            org.telegram.messenger.g0.r3(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.f5727s0 == null) {
                    this.f5727s0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
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
        FrameLayout frameLayout = this.f5711f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        b0 b0Var = this.G;
        if (b0Var != null) {
            b0Var.g();
            this.G = null;
        }
        o0 o0Var = this.f5709e;
        if (o0Var != null) {
            o0Var.l();
            this.f5709e = null;
        }
        super.clearViews();
        z0 z0Var = this.d;
        if (z0Var != null) {
            z0Var.O0();
            this.d = null;
        }
        this.f5711f = null;
        this.h = null;
        this.f5730y = null;
        this.f5703a0 = null;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override
    public final android.view.View createView(android.content.Context r34) {
        throw new UnsupportedOperationException("Method not decompiled: ci.j0.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        z0 z0Var;
        if (this.h != null && (z0Var = this.d) != null && z0Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
            this.d.getClass();
            int width = (int) (this.f5711f.getWidth() - (this.d.getWidth() - org.telegram.messenger.g0.L(10.0f)));
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
        if (this.G == null && this.d != null && this.f5711f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.f5987k7);
            rectF2.set(this.d.h7);
            if (rectF.isEmpty()) {
                rectF.set((this.f5711f.getWidth() / 2.0f) - org.telegram.messenger.g0.L(20.0f), (this.f5711f.getHeight() / 2.0f) - org.telegram.messenger.g0.L(20.0f), (this.f5711f.getWidth() / 2.0f) + org.telegram.messenger.g0.L(20.0f), (this.f5711f.getHeight() / 2.0f) + org.telegram.messenger.g0.L(20.0f));
            }
            this.d.setScanHidden(true);
            b0 b0Var = new b0(getParentActivity(), rectF, rectF2, new ob.c(this, 11));
            this.G = b0Var;
            b0Var.setButtonLabel(hd.N0(2131746274, null));
            b0 b0Var2 = this.G;
            b0Var2.setOnGallery(new c1.a(16, this, b0Var2));
            this.f5711f.addView(this.G, ma.c(-1.0f, -1));
        }
    }

    public final void g0(float f10, float f11, boolean z10) {
        int i7;
        int i10;
        if (!z10) {
            h0 h0Var = this.h;
            if (h0Var != null && h0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            c cVar = this.f5730y;
            if (cVar != null && cVar.getVisibility() == 0) {
                this.f5730y.setVisibility(4);
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
                c cVar2 = new c(getParentActivity(), new cb.c(this, 12));
                this.f5730y = cVar2;
                cVar2.f5627b = this.h;
                this.d.setOnPicksChanged(new f0(this, 1));
                this.f5730y.setOutlineProvider(this.h.getOutlineProvider());
                this.f5730y.setClipToOutline(true);
                this.f5711f.addView(this.h, ma.e(-1, -1, 48));
                d0();
                this.f5711f.post(new f0(this, 2));
            } else {
                return;
            }
        }
        d0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.leftMargin;
        int i13 = layoutParams.rightMargin;
        if (this.f5730y.getParent() == null) {
            this.f5711f.addView(this.f5730y, ma.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f5730y.getLayoutParams();
        if (layoutParams2.height != i11 || layoutParams2.leftMargin != i12 || layoutParams2.rightMargin != i13) {
            layoutParams2.height = i11;
            layoutParams2.leftMargin = i12;
            layoutParams2.rightMargin = i13;
            this.f5730y.setLayoutParams(layoutParams2);
        }
        this.f5730y.setTranslationY(f10);
        this.f5730y.setAlpha(f11);
        this.f5730y.invalidateOutline();
        this.f5730y.invalidate();
        if (this.f5730y.getVisibility() != 0) {
            this.f5730y.setVisibility(0);
        }
        int t02 = this.d.t0();
        x0 x0Var = this.d.f6008n;
        if (x0Var != null) {
            i7 = x0Var.h;
        } else {
            i7 = 872415231;
        }
        int i14 = t02 ^ i7;
        if (this.h.getTranslationY() != f10 || i14 != this.J) {
            this.h.setTranslationY(f10);
            this.J = i14;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f11);
        h0 h0Var3 = this.h;
        z0 z0Var = this.d;
        x0 x0Var2 = z0Var.f6008n;
        if (x0Var2 != null) {
            i10 = x0Var2.f5866b;
        } else {
            i10 = -16777216;
        }
        if (i10 != z0Var.f5893b2) {
            z0Var.f5893b2 = i10;
            z0Var.f5904c2 = (i0.a.f(0.13f, -1, z0.D0(0.75f, 1.3f, 0.16f, i10)) & 16777215) | (-1728053248);
        }
        h0Var3.setHeaderColor(z0Var.f5904c2);
        if (this.h.getVisibility() != 0) {
            h0 h0Var4 = this.h;
            if (h0Var4.K) {
                h0Var4.K = false;
                h0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.f5725r0) {
            k0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        z0 z0Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (z0Var = this.d) != null && z0Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || s2.f26731b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.F = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.f22810e.c(new c1.a(15, this, T0));
            }
        }
    }

    public final void i0(String str) {
        z0 z0Var;
        Uri uri;
        if (getParentActivity() != null && (z0Var = this.d) != null && z0Var.getCurrentLink() != null) {
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
                getParentActivity().startActivity(Intent.createChooser(intent, hd.N0(2131748977, null)));
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
        if (this.f5725r0 || (h0Var = this.h) == null) {
            return;
        }
        r tabs = h0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(20.0f));
        float[] fArr = c1.f5643a[0];
        int ceil = (int) Math.ceil(org.telegram.messenger.g0.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i7 = ceil - 3;
        this.f5705b0 = Math.max(0, i7);
        this.f5707c0 = Math.max(0, i7);
        this.f5708d0 = Math.max(0, ceil - 4);
        tabs.f5783a = new ab.g(11, this, tabs);
        tabs.f5784b = new c0(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i10 = this.f5705b0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i10, this.f5707c0, i10, this.f5708d0));
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
        this.f5725r0 = true;
        grid.f5745g3 = new d0(this, grid, tabs);
        grid.f5744f3 = new aa.k(2, this, grid);
        c cVar = this.f5730y;
        if (cVar.U != grid) {
            cVar.U = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new u1(cVar, 5));
        }
        int L3 = org.telegram.messenger.g0.L(44.0f);
        this.f5703a0 = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, org.telegram.messenger.g0.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        m0();
        grid.setClipToPadding(false);
        grid.j(new g6(1, this, tabs));
        tabs.bringToFront();
    }

    public final void l0() {
        if (this.X >= 0) {
            ls.f(this.Z).j(this.X);
        }
        if (this.Y >= 0) {
            ls.e().j(this.Y);
        }
        this.Y = -1;
        this.X = -1;
    }

    public final void m0() {
        z0 z0Var;
        float f10;
        m mVar = this.f5703a0;
        if (mVar != null && (z0Var = this.d) != null) {
            if (z0Var.J.isEmpty()) {
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
        b0 b0Var = this.G;
        if (b0Var != null) {
            if (z10) {
                b0Var.e();
            }
            return false;
        }
        z0 z0Var = this.d;
        if (z0Var != null) {
            float f10 = z0Var.l1;
            if (f10 > 0.5f || z0Var.f5944g1 > 0.5f) {
                if (z10) {
                    if (f10 > 0.5f) {
                        z0Var.f5999m1 = 0.0f;
                    } else if (z0Var.f5944g1 > 0.5f) {
                        z0Var.f5954h1 = 0.0f;
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
        long j3;
        if (this.d != null && !org.telegram.messenger.g0.Q1()) {
            this.d.setRevealOpening(z10);
            z0 z0Var = this.d;
            float f12 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            z0Var.setReveal(f10);
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (!z10) {
                f12 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
            ofFloat.addUpdateListener(new ah.g(this, 4));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat);
            if (z10) {
                j3 = 860;
            } else {
                j3 = 200;
            }
            animatorSet.setDuration(j3);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new androidx.fragment.app.g(this, z10, runnable, 3));
            org.telegram.messenger.g0.g3(new c1.a(14, this, animatorSet));
            return animatorSet;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        long j3;
        long j10;
        boolean z10;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            j3 = bundle.getLong("user_id");
        } else {
            j3 = 0;
        }
        this.f5702a = j3;
        Bundle bundle2 = this.arguments;
        if (bundle2 != null) {
            j10 = bundle2.getLong("chat_id");
        } else {
            j10 = 0;
        }
        this.f5704b = j10;
        Bundle bundle3 = this.arguments;
        if (bundle3 != null && bundle3.getBoolean("immediate") && cz.o() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
        if (this.f5702a == 0 && this.f5704b == 0) {
            this.f5702a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l0();
        org.telegram.ui.f fVar = this.f5706c;
        if (fVar != null) {
            hi0 hi0Var = (hi0) fVar.f47433b;
            if (hi0Var.f48409b.remove(fVar)) {
                hi0Var.a();
            }
            this.f5706c = null;
        }
        FrameLayout frameLayout = this.f5711f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        b0 b0Var = this.G;
        if (b0Var != null) {
            b0Var.g();
            this.G = null;
        }
        o0 o0Var = this.f5709e;
        if (o0Var != null) {
            o0Var.l();
            this.f5709e = null;
        }
        z0 z0Var = this.d;
        if (z0Var != null) {
            z0Var.O0();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        b0 b0Var = this.G;
        if (b0Var != null) {
            b0Var.g();
            b0 b0Var2 = this.G;
            FrameLayout frameLayout = this.f5711f;
            if (frameLayout != null) {
                frameLayout.removeView(b0Var2);
            }
            if (this.G == b0Var2) {
                this.G = null;
            }
            z0 z0Var = this.d;
            if (z0Var != null) {
                z0Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && Build.VERSION.SDK_INT >= 29 && this.f5727s0 != null) {
            parentActivity.getWindow().setNavigationBarContrastEnforced(this.f5727s0.booleanValue());
            this.f5727s0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z10;
        if (i7 == 4) {
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
        } else if (getParentActivity() != null && i7 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f28777a.U = org.telegram.messenger.g0.W2(hd.N0(2131746307, null));
            alertDialog$Builder.k(hd.N0(2131747106, null), new c0(this));
            alertDialog$Builder.h(hd.N0(2131751760, null), null);
            int i10 = m6.L5;
            alertDialog$Builder.m(2131624117, 72, m6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        b0();
        if (getParentActivity() != null) {
            org.telegram.messenger.g0.l3(getParentActivity(), false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        z0 z0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.H = true;
        }
        if (z10 && (z0Var = this.d) != null) {
            z0Var.setReveal(1.0f);
        }
        if (z10 && !z11 && this.f5711f != null) {
            float f10 = f.S;
            long j3 = 0;
            if (Build.VERSION.SDK_INT >= 29 && cz.o() == 2) {
                j3 = Math.max(0L, Math.round(c1.f5644b[51]) - 860);
            }
            FrameLayout frameLayout = this.f5711f;
            f0 f0Var = this.I;
            frameLayout.removeCallbacks(f0Var);
            this.f5711f.postDelayed(f0Var, j3 + 680);
        }
    }
}
