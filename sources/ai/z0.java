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
import bi.ec;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.gl0;
import org.telegram.ui.y9;
public class z0 extends r2 {
    public boolean E;
    public o0 F;
    public boolean G;
    public final t0 H;
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
    public long f1986a;
    public int f1987a0;
    public long f1988b;
    public int f1989b0;
    public org.telegram.ui.f f1990c;
    public int f1991c0;
    public t1 d;
    public float f1992d0;
    public f1 e;
    public boolean f1993e0;
    public FrameLayout f1994f;
    public LinearGradient f1995f0;
    public final Paint f1996g0;
    public x0 h;
    public final RectF f1997h0;
    public final int[] f1998i0;
    public final int[] f1999j0;
    public final int[] f2000k0;
    public final Path f2001l0;
    public final RectF m0;
    public float f2002n;
    public Paint f2003n0;
    public final v1 f2004o0;
    public final RectF f2005p0;
    public boolean f2006q0;
    public float f2007r;
    public Boolean f2008r0;
    public float f2009s;
    public float v;
    public float f2010w;
    public d f2011x;
    public boolean f2012y;

    public z0(Bundle bundle) {
        super(bundle);
        this.H = new t0(this, 0);
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
        this.f1996g0 = new Paint();
        this.f1997h0 = new RectF();
        this.f1998i0 = new int[2];
        this.f1999j0 = new int[2];
        this.f2000k0 = new int[2];
        this.f2001l0 = new Path();
        this.m0 = new RectF();
        this.f2004o0 = new v1(0);
        this.f2005p0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void V(z0 z0Var, AnimatorSet animatorSet) {
        z0Var.h0();
        boolean z10 = !z0Var.f2012y;
        int i10 = z0Var.currentAccount;
        z0Var.Y = i10;
        z0Var.W = NotificationCenter.getInstance(i10).setAnimationInProgress(-1, null, z10);
        z0Var.X = NotificationCenter.getGlobalInstance().setAnimationInProgress(-1, null, z10);
        animatorSet.start();
    }

    public static void W(z0 z0Var) {
        if (z0Var.getParentActivity() == null) {
            return;
        }
        zh.p1 p1Var = new zh.p1(z0Var.getParentActivity(), z0Var.currentAccount, z0Var.getUserConfig().getClientUserId(), null, null);
        if (!p1Var.f53266u0) {
            p1Var.f53266u0 = true;
            ec ecVar = p1Var.f53268w0;
            if (ecVar != null && (ecVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) p1Var.f53268w0.getParent();
                int indexOfChild = viewGroup.indexOfChild(p1Var.f53268w0);
                viewGroup.removeView(p1Var.f53268w0);
                ec ecVar2 = new ec(p1Var.getContext(), 250, 2);
                p1Var.f53268w0 = ecVar2;
                viewGroup.addView(ecVar2, indexOfChild, kb1.g(-1.0f, -1));
            }
            aa0 aa0Var = p1Var.f53269x0;
            if (aa0Var != null) {
                String string = LocaleController.getString(R.string.Gift2BrowseCollectiblesInfo);
                zh.u0 u0Var = p1Var.f53258l0;
                u0Var.setText(string);
                u0Var.setBreakStrategy(2);
                aa0Var.setVisibility(8);
            }
            p1Var.Y.O(false);
        }
        p1Var.show();
    }

    public static void Y(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                Y(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void a0(r2 r2Var) {
        y9.f0(r2Var.getParentActivity(), 1, new v0(r2Var.getCurrentAccount(), r2Var));
    }

    public static LinearGradient f0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f7 = i10 / 8.0f;
            float D = c3.h0.D(f7, 2.0f, 3.0f, f7 * f7);
            if (!z10) {
                D = 1.0f - D;
            }
            iArr[i10] = ((int) ((D * 255.0f) + 0.5f)) << 24;
            fArr[i10] = f7;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void X() {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            AndroidUtilities.setLightNavigationBar(parentActivity, false);
            AndroidUtilities.setLightStatusBar(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.f2008r0 == null) {
                    this.f2008r0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void Z() {
        t1 t1Var;
        if (this.h != null && (t1Var = this.d) != null && t1Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
            this.d.getClass();
            int width = (int) (this.f1994f.getWidth() - (this.d.getWidth() - AndroidUtilities.dp(10.0f)));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
            if (layoutParams.height != max || layoutParams.leftMargin != r2 || layoutParams.rightMargin != width) {
                layoutParams.height = max;
                layoutParams.leftMargin = r2;
                layoutParams.rightMargin = width;
                this.h.setLayoutParams(layoutParams);
            }
        }
    }

    public final void b0() {
        if (this.F == null && this.d != null && this.f1994f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.f1788k7);
            rectF2.set(this.d.f1758h7);
            if (rectF.isEmpty()) {
                rectF.set((this.f1994f.getWidth() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f1994f.getHeight() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f1994f.getWidth() / 2.0f) + AndroidUtilities.dp(20.0f), (this.f1994f.getHeight() / 2.0f) + AndroidUtilities.dp(20.0f));
            }
            this.d.setScanHidden(true);
            o0 o0Var = new o0(getParentActivity(), rectF, rectF2, new za.c(this, 1));
            this.F = o0Var;
            o0Var.setButtonLabel(LocaleController.getString(R.string.QrScanQr));
            o0 o0Var2 = this.F;
            o0Var2.setOnGallery(new a1.f(14, this, o0Var2));
            this.f1994f.addView(this.F, kb1.g(-1.0f, -1));
        }
    }

    public final void c0(float f7, float f10, boolean z10) {
        int i10;
        int i11;
        if (!z10) {
            x0 x0Var = this.h;
            if (x0Var != null && x0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            d dVar = this.f2011x;
            if (dVar != null && dVar.getVisibility() == 0) {
                this.f2011x.setVisibility(4);
                return;
            }
            return;
        }
        if (this.h == null) {
            if (getParentActivity() != null) {
                x0 x0Var2 = new x0(this, getParentActivity(), this.currentAccount, new w0(this));
                this.h = x0Var2;
                x0Var2.setOutlineProvider(new y0(this, 0));
                this.h.setClipToOutline(true);
                d dVar2 = new d(getParentActivity(), new b6.i(this, 2));
                this.f2011x = dVar2;
                dVar2.f1454b = this.h;
                this.d.setOnPicksChanged(new t0(this, 1));
                this.f2011x.setOutlineProvider(this.h.getOutlineProvider());
                this.f2011x.setClipToOutline(true);
                this.f1994f.addView(this.h, kb1.i(-1, -1, 48));
                Z();
                this.f1994f.post(new t0(this, 2));
            } else {
                return;
            }
        }
        Z();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = layoutParams.leftMargin;
        int i14 = layoutParams.rightMargin;
        if (this.f2011x.getParent() == null) {
            this.f1994f.addView(this.f2011x, kb1.i(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f2011x.getLayoutParams();
        if (layoutParams2.height != i12 || layoutParams2.leftMargin != i13 || layoutParams2.rightMargin != i14) {
            layoutParams2.height = i12;
            layoutParams2.leftMargin = i13;
            layoutParams2.rightMargin = i14;
            this.f2011x.setLayoutParams(layoutParams2);
        }
        this.f2011x.setTranslationY(f7);
        this.f2011x.setAlpha(f10);
        this.f2011x.invalidateOutline();
        this.f2011x.invalidate();
        if (this.f2011x.getVisibility() != 0) {
            this.f2011x.setVisibility(0);
        }
        int t02 = this.d.t0();
        r1 r1Var = this.d.f1808n;
        if (r1Var != null) {
            i10 = r1Var.h;
        } else {
            i10 = 872415231;
        }
        int i15 = t02 ^ i10;
        if (this.h.getTranslationY() != f7 || i15 != this.I) {
            this.h.setTranslationY(f7);
            this.I = i15;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f10);
        x0 x0Var3 = this.h;
        t1 t1Var = this.d;
        r1 r1Var2 = t1Var.f1808n;
        if (r1Var2 != null) {
            i11 = r1Var2.f1664b;
        } else {
            i11 = -16777216;
        }
        if (i11 != t1Var.a2) {
            t1Var.a2 = i11;
            t1Var.f1693b2 = (i0.a.f(0.13f, -1, t1.D0(0.75f, 1.3f, 0.16f, i11)) & 16777215) | (-1728053248);
        }
        x0Var3.setHeaderColor(t1Var.f1693b2);
        if (this.h.getVisibility() != 0) {
            x0 x0Var4 = this.h;
            if (x0Var4.J) {
                x0Var4.J = false;
                x0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.f2006q0) {
            g0();
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return false;
    }

    @Override
    public final void clearViews() {
        FrameLayout frameLayout = this.f1994f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        o0 o0Var = this.F;
        if (o0Var != null) {
            o0Var.g();
            this.F = null;
        }
        f1 f1Var = this.e;
        if (f1Var != null) {
            f1Var.k();
            this.e = null;
        }
        super.clearViews();
        t1 t1Var = this.d;
        if (t1Var != null) {
            t1Var.O0();
            this.d = null;
        }
        this.f1994f = null;
        this.h = null;
        this.f2011x = null;
        this.Z = null;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override
    public final android.view.View createView(android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: ai.z0.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        t1 t1Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (t1Var = this.d) != null && t1Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.E = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.globalQueue.postRunnable(new a1.f(13, this, T0));
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(String str) {
        t1 t1Var;
        Uri uri;
        if (getParentActivity() != null && (t1Var = this.d) != null && t1Var.getCurrentLink() != null) {
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                uri = AndroidUtilities.getBitmapShareUri(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
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
                getParentActivity().startActivity(Intent.createChooser(intent, LocaleController.getString(R.string.InviteByQRCode)));
            } catch (ActivityNotFoundException e) {
                FileLog.e(e);
            }
        }
    }

    public final void g0() {
        x0 x0Var;
        if (this.f2006q0 || (x0Var = this.h) == null) {
            return;
        }
        x tabs = x0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(20.0f));
        float[] fArr = w1.f1964a[0];
        int ceil = (int) Math.ceil(AndroidUtilities.dpf2(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i10 = ceil - 3;
        this.f1987a0 = Math.max(0, i10);
        this.f1989b0 = Math.max(0, i10);
        this.f1991c0 = Math.max(0, ceil - 4);
        tabs.f1966a = new f0(1, this, tabs);
        tabs.f1967b = new p0(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i11 = this.f1987a0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i11, this.f1989b0, i11, this.f1991c0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new y0(this, 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            if (marginLayoutParams.leftMargin != dp || marginLayoutParams.rightMargin != dp || marginLayoutParams.topMargin != dp2) {
                marginLayoutParams.leftMargin = dp;
                marginLayoutParams.rightMargin = dp;
                marginLayoutParams.topMargin = dp2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        r grid = this.h.getGrid();
        this.f2006q0 = true;
        grid.f1660g3 = new q0(this, grid, tabs);
        grid.f1659f3 = new r0(this, grid);
        d dVar = this.f2011x;
        if (dVar.T != grid) {
            dVar.T = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new b(dVar, 0));
        }
        int dp3 = AndroidUtilities.dp(44.0f);
        this.Z = grid;
        grid.setPadding(grid.getPaddingLeft(), dp3, AndroidUtilities.dp(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        i0();
        grid.setClipToPadding(false);
        grid.j(new u0(0, this, tabs));
        tabs.bringToFront();
    }

    @Override
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        if (this.W >= 0) {
            NotificationCenter.getInstance(this.Y).onAnimationFinish(this.W);
        }
        if (this.X >= 0) {
            NotificationCenter.getGlobalInstance().onAnimationFinish(this.X);
        }
        this.X = -1;
        this.W = -1;
    }

    public final void i0() {
        t1 t1Var;
        float f7;
        r rVar = this.Z;
        if (rVar != null && (t1Var = this.d) != null) {
            if (t1Var.I.isEmpty()) {
                f7 = 12.0f;
            } else {
                f7 = 73.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (rVar.getPaddingBottom() != dp) {
                rVar.setPadding(rVar.getPaddingLeft(), rVar.getPaddingTop(), rVar.getPaddingRight(), dp);
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

    @Override
    public final boolean onBackPressed(boolean z10) {
        o0 o0Var = this.F;
        if (o0Var != null) {
            if (z10) {
                o0Var.e();
            }
            return false;
        }
        t1 t1Var = this.d;
        if (t1Var != null) {
            float f7 = t1Var.f1782k1;
            if (f7 > 0.5f || t1Var.f1734f1 > 0.5f) {
                if (z10) {
                    if (f7 > 0.5f) {
                        t1Var.l1 = 0.0f;
                    } else if (t1Var.f1734f1 > 0.5f) {
                        t1Var.f1743g1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        float f7;
        float f10;
        long j10;
        if (this.d != null && !AndroidUtilities.isTablet()) {
            this.d.setRevealOpening(z10);
            t1 t1Var = this.d;
            float f11 = 1.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            t1Var.setReveal(f7);
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            ofFloat.addUpdateListener(new g0(this, 1));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat);
            if (z10) {
                j10 = 860;
            } else {
                j10 = 200;
            }
            animatorSet.setDuration(j10);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new l0(this, z10, runnable, 1));
            AndroidUtilities.runOnUIThread(new a1.f(12, this, animatorSet));
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
        this.f1986a = j10;
        Bundle bundle2 = this.arguments;
        if (bundle2 != null) {
            j11 = bundle2.getLong("chat_id");
        } else {
            j11 = 0;
        }
        this.f1988b = j11;
        Bundle bundle3 = this.arguments;
        if (bundle3 != null && bundle3.getBoolean("immediate") && SharedConfig.getDevicePerformanceClass() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2012y = z10;
        if (this.f1986a == 0 && this.f1988b == 0) {
            this.f1986a = getUserConfig().getClientUserId();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        h0();
        org.telegram.ui.f fVar = this.f1990c;
        if (fVar != null) {
            gl0 gl0Var = (gl0) fVar.f39115b;
            if (gl0Var.f39644b.remove(fVar)) {
                gl0Var.a();
            }
            this.f1990c = null;
        }
        FrameLayout frameLayout = this.f1994f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        o0 o0Var = this.F;
        if (o0Var != null) {
            o0Var.g();
            this.F = null;
        }
        f1 f1Var = this.e;
        if (f1Var != null) {
            f1Var.k();
            this.e = null;
        }
        t1 t1Var = this.d;
        if (t1Var != null) {
            t1Var.O0();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        o0 o0Var = this.F;
        if (o0Var != null) {
            o0Var.g();
            o0 o0Var2 = this.F;
            FrameLayout frameLayout = this.f1994f;
            if (frameLayout != null) {
                frameLayout.removeView(o0Var2);
            }
            if (this.F == o0Var2) {
                this.F = null;
            }
            t1 t1Var = this.d;
            if (t1Var != null) {
                t1Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && Build.VERSION.SDK_INT >= 29 && this.f2008r0 != null) {
            parentActivity.getWindow().setNavigationBarContrastEnforced(this.f2008r0.booleanValue());
            this.f2008r0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        if (i10 == 4) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.E && z10) {
                this.E = false;
                d0();
            }
            this.E = false;
        } else if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                b0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new p0(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            int i11 = R.raw.permission_request_camera;
            int i12 = y6.L5;
            alertDialog$Builder.m(i11, 72, y6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        X();
        if (getParentActivity() != null) {
            AndroidUtilities.setLightNavigationBar(getParentActivity(), false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        t1 t1Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.G = true;
        }
        if (z10 && (t1Var = this.d) != null) {
            t1Var.setReveal(1.0f);
        }
        if (z10 && !z11 && this.f1994f != null) {
            float f7 = h.S;
            long j10 = 0;
            if (Build.VERSION.SDK_INT >= 29 && SharedConfig.getDevicePerformanceClass() == 2) {
                j10 = Math.max(0L, Math.round(w1.f1965b[51]) - 860);
            }
            FrameLayout frameLayout = this.f1994f;
            t0 t0Var = this.H;
            frameLayout.removeCallbacks(t0Var);
            this.f1994f.postDelayed(t0Var, j10 + 680);
        }
    }
}
