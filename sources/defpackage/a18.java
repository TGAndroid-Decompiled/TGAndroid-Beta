package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class a18 extends d implements gk7 {
    public final ix4 E;
    public final kl0 F;
    public final ix4 G;
    public final kl0 H;
    public d I;
    public vq1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public xb4 N;
    public jia O;
    public FrameLayout P;
    public FrameLayout Q;
    public u41 R;
    public t08 S;
    public boolean T;
    public oy8 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public xg1 Y;
    public float Z;
    public final boolean a;
    public ValueAnimator a0;
    public final xsa b;
    public boolean b0;
    public final xsa c;
    public io5 c0;
    public oc6 d;
    public final e59 d0;
    public c08 e;
    public final e59 e0;
    public final int f;
    public t08 h;
    public t08 n;
    public boolean r;
    public wjb s;
    public final SparseIntArray w;
    public final m17 x;
    public final m17 y;

    public a18() {
        super(null);
        this.f = gl.L(6.0f);
        this.w = new SparseIntArray();
        boolean o = bkb.I.o();
        this.T = o;
        this.b0 = o;
        this.c0 = io5.e;
        e59 e59Var = new e59(0, false);
        this.d0 = e59Var;
        e59 e59Var2 = new e59(0, false);
        this.e0 = e59Var2;
        ix4 ix4Var = new ix4();
        this.E = ix4Var;
        kl0 kl0Var = new kl0(ix4Var, ix4Var, ix4Var);
        this.F = kl0Var;
        ix4 ix4Var2 = new ix4();
        this.G = ix4Var2;
        kl0 kl0Var2 = new kl0(ix4Var2, ix4Var2, ix4Var2);
        this.H = kl0Var2;
        kl0Var.g = e59Var;
        kl0Var.f = e59Var2;
        kl0Var2.g = e59Var;
        kl0Var2.f = e59Var2;
        this.a = false;
        gta.v(this.currentAccount, false).T();
        xsa xsaVar = new xsa(this.currentAccount, 0L, false);
        this.b = xsaVar;
        xsaVar.g(8, false);
        xsaVar.a();
        xsa xsaVar2 = new xsa(this.currentAccount, 0L, false);
        this.c = xsaVar2;
        xsaVar2.g(8, false);
        xsaVar2.f = true;
        xsaVar2.a();
        this.resourceProvider = new fd(this, (byte) 3);
        this.x = new m17(0, false, false, this.resourceProvider);
        this.y = new m17(0, false, true, this.resourceProvider);
    }

    public static boolean D0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z;
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        if (tL_emojiStatusCollectible != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        if (z == z2 && tL_emojiStatusCollectible != null && z2 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id) {
            return true;
        }
        return false;
    }

    public static int y0(int i) {
        boolean z;
        float f;
        if (gl.B(i) < 0.2f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 0.28f;
        } else {
            f = -0.28f;
        }
        return bkb.a(0.5f, f, i);
    }

    public final void A0() {
        oj ojVar;
        if (this.r) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().p()) {
            showDialog(new jh8((d) this, 23, true));
            return;
        }
        t08 E0 = E0();
        TL_stars.TL_starGiftUnique tL_starGiftUnique = E0.J;
        t08 t08Var = this.h;
        if (tL_starGiftUnique != null) {
            if (E0 == t08Var) {
                t08Var = this.n;
            }
            t08Var.c();
            this.r = true;
            this.R.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = E0.J;
            xz7 xz7Var = new xz7(this, (byte) 1);
            long e = y6c.h(this.currentAccount).e();
            if (tL_starGiftUnique2.resale_ton_only) {
                ojVar = oj.b;
            } else {
                ojVar = oj.a;
            }
            gta.u(this.currentAccount, ojVar).E(tL_starGiftUnique2, e, null, true, new zz7(this, ojVar, tL_starGiftUnique2, e, xz7Var));
            return;
        }
        if (E0 == t08Var) {
            t08Var = this.n;
        }
        if (t08Var.J != null) {
            t08Var.c();
        }
        z0();
        finishFragment();
        H0();
    }

    public final void B0() {
        this.E.a(getThemedColor(bkb.c6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.x.invalidate();
        this.h.y.invalidate();
        this.n.x.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((il0) this.P.getBackground()).updateColors();
        C0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((il0) it.next()).updateColors();
        }
    }

    public final void C0() {
        int themedColor;
        if (gl.B(getThemedColor(bkb.c6)) > 0.72d) {
            themedColor = bm2.f(0.085f, getThemedColor(bkb.Z6), this.e.getColor());
        } else {
            themedColor = getThemedColor(bkb.Z6);
        }
        this.d.setBackgroundColor(themedColor);
        ix4 ix4Var = this.G;
        if (ix4Var.b != themedColor) {
            ix4Var.a(themedColor);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((il0) it.next()).updateColors();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final t08 E0() {
        vq1 vq1Var = this.J;
        if (vq1Var != null && vq1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.n;
    }

    public final void F0(oj ojVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, xz7 xz7Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        ypa ypaVar = new ypa(ojVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        aqa aqaVar = new aqa(getParentActivity(), this.resourceProvider, tL_starGiftUnique, ypaVar, this.currentAccount, j, ls6.m(tL_starGiftUnique.num, ',', sb), false, new a08(this, zArr, tL_starGiftUnique, j, xz7Var, (byte) 0));
        aqaVar.h.setOnDismissListener(new cf(zArr, xz7Var, (byte) 13));
        aqaVar.b();
    }

    public final void G0(boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, xz7 xz7Var, ypa ypaVar, c01 c01Var) {
        zArr[0] = true;
        c01Var.d();
        gta.u(this.currentAccount, ypaVar.a).f(ypaVar.b, tL_starGiftUnique, j, null, true, new w77(c01Var, xz7Var, (byte) 6));
    }

    public final void H0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a18.H0():void");
    }

    public final void I0() {
        jia jiaVar = this.O;
        if (jiaVar != null) {
            jiaVar.setTextColor(getThemedColor(bkb.z8));
        }
        this.h.g();
        this.n.g();
        c08 c08Var = this.e;
        if (c08Var != null) {
            c08Var.a = bkb.v0(bkb.Z6, c08Var.b);
            c08Var.a();
            c08Var.invalidate();
        }
        J0();
        B0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void J0() {
        float positionAnimated;
        if (this.e != null) {
            C0();
            int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
            if (this.N != null) {
                vq1 vq1Var = this.J;
                if (vq1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = vq1Var.getPositionAnimated();
                }
                float a = moe.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                xb4 xb4Var = this.N;
                int f = bm2.f(a, tabsViewBackgroundColor, getThemedColor(bkb.c6));
                int f2 = bm2.f(a, -1, getThemedColor(bkb.Z6));
                int f3 = bm2.f(a, -1, getThemedColor(bkb.y6));
                int f4 = bm2.f(a, tabsViewBackgroundColor, getThemedColor(bkb.F6));
                xb4Var.a.setColor(f);
                xb4Var.b.setColor(f2);
                xb4Var.d = f3;
                xb4Var.e = f4;
                xb4Var.invalidate();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        setHasOwnBackground(true);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        oc6 oc6Var = new oc6((byte) 4, context, this);
        this.d = oc6Var;
        this.fragmentView = oc6Var;
        this.h = new t08(this, context, 1);
        this.n = new t08(this, context, 0);
        c08 c08Var = new c08(this, context, this.resourceProvider);
        this.e = c08Var;
        c08Var.F = true;
        this.n.j(false);
        this.n.addView(this.e, 2, nme.e(-1, -2, 55));
        vq1 vq1Var = new vq1((byte) 4, context, this);
        this.J = vq1Var;
        vq1Var.setAdapter(new sl2(this, (byte) 4));
        oc6Var.addView(this.J, nme.e(-1, -1, 119));
        u41 u41Var = new u41(getResourceProvider(), context, true);
        this.R = u41Var;
        u41Var.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final a18 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                a18 a18Var = this.b;
                switch (b) {
                    case 0:
                        a18Var.A0();
                        return;
                    case 1:
                        if (a18Var.onBackPressed(true)) {
                            a18Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        a18 a18Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) a18Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        a18Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        a18Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        a18Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        xg1 xg1Var = new xg1(a18Var2, a18Var2.getParentActivity(), canvas, (a18Var2.L.getMeasuredWidth() / 2.0f) + f, (a18Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        a18Var2.Y = xg1Var;
                        xg1Var.setOnTouchListener(new jz1((byte) 17));
                        a18Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        a18Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new yg1(a18Var2, (byte) 1));
                        a18Var2.a0.addListener(new v85(a18Var2, (byte) 27));
                        a18Var2.a0.setDuration(400L);
                        a18Var2.a0.setInterpolator(ls3.e);
                        a18Var2.a0.start();
                        frameLayout2.addView(a18Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gl.d3(new oq7(a18Var2, (byte) 14));
                        return;
                }
            }
        });
        this.P.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        this.P.addView(this.R, nme.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.P;
        il0 c = this.F.c(frameLayout2, null, false);
        c.p(nod.j(this.resourceProvider));
        c.r(gl.L(28.0f));
        c.q(gl.L(5.0f));
        frameLayout2.setBackground(c);
        ote.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        frameLayout3.addView(this.P, nme.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ql0 ql0Var = new ql0(this.H.c(this.Q, null, false));
        ql0Var.b(gl.L(40.0f), true);
        ql0Var.H = 220;
        this.Q.setBackground(ql0Var);
        t08 E0 = E0();
        u41 u41Var2 = this.R;
        if (u41Var2 != null && E0 != null && E0 != this.S) {
            this.S = E0;
            sk4 sk4Var = E0.e;
            u41Var2.i((CharSequence) sk4Var.b, false, true);
            this.R.g((SpannableStringBuilder) sk4Var.c, false);
        }
        oc6Var.addView(this.Q, nme.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.M = frameLayout4;
        oc6Var.addView(frameLayout4, nme.e(-1, -2, 55));
        boolean z = this.a;
        if (!z) {
            xb4 xb4Var = new xb4(context);
            this.N = xb4Var;
            if (z) {
                i = 2131752416;
            } else {
                i = 2131743507;
            }
            String M0 = k96.M0(i, null);
            if (z) {
                i2 = 2131752417;
            } else {
                i2 = 2131743508;
            }
            xb4Var.setTabs(M0, k96.M0(i2, null));
            this.N.r = new xz7(this, (byte) 0);
            J0();
            this.M.addView(this.N, nme.e(-1, 40, 17));
        } else {
            jia jiaVar = new jia(context);
            this.O = jiaVar;
            jiaVar.l(k96.M0(2131752415, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            zkb.W(this.O, bkb.z8, getResourceProvider());
            this.O.setTypeface(gl.o());
            this.M.addView(this.O, nme.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        c08 c08Var2 = this.e;
        if (c08Var2 != null) {
            c08Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                gl.l3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i3 = bkb.t8;
        zkb.R(imageView2, bkb.f0(getThemedColor(i3), 1, -1), null, zkb.M(i3), getResourceProvider());
        this.K.setImageResource(2131231243);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final a18 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                a18 a18Var = this.b;
                switch (b) {
                    case 0:
                        a18Var.A0();
                        return;
                    case 1:
                        if (a18Var.onBackPressed(true)) {
                            a18Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        a18 a18Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) a18Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        a18Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        a18Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        a18Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        xg1 xg1Var = new xg1(a18Var2, a18Var2.getParentActivity(), canvas, (a18Var2.L.getMeasuredWidth() / 2.0f) + f, (a18Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        a18Var2.Y = xg1Var;
                        xg1Var.setOnTouchListener(new jz1((byte) 17));
                        a18Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        a18Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new yg1(a18Var2, (byte) 1));
                        a18Var2.a0.addListener(new v85(a18Var2, (byte) 27));
                        a18Var2.a0.setDuration(400L);
                        a18Var2.a0.setInterpolator(ls3.e);
                        a18Var2.a0.start();
                        frameLayout22.addView(a18Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gl.d3(new oq7(a18Var2, (byte) 14));
                        return;
                }
            }
        });
        ote.a(this.K);
        this.M.addView(this.K, nme.e(54, 54, 19));
        oy8 oy8Var = new oy8(2131624236, gl.L(28.0f), gl.L(28.0f), true, null);
        this.U = oy8Var;
        oy8Var.h = true;
        if (!this.T) {
            oy8Var.K(0);
            this.U.H(0);
        } else {
            oy8Var.H(35);
            this.U.K(36);
        }
        this.U.a0 = true;
        int w0 = bkb.w0(null, bkb.I9, false);
        this.U.L(w0, "Sunny");
        this.U.L(w0, "Path 6");
        this.U.L(w0, "Path");
        this.U.L(w0, "Path 5");
        this.U.j();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        zkb.R(this.L, bkb.f0(getThemedColor(i3), 1, -1), null, zkb.M(i3), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final a18 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                a18 a18Var = this.b;
                switch (b) {
                    case 0:
                        a18Var.A0();
                        return;
                    case 1:
                        if (a18Var.onBackPressed(true)) {
                            a18Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        a18 a18Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) a18Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        a18Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        a18Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        a18Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        xg1 xg1Var = new xg1(a18Var2, a18Var2.getParentActivity(), canvas, (a18Var2.L.getMeasuredWidth() / 2.0f) + f, (a18Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        a18Var2.Y = xg1Var;
                        xg1Var.setOnTouchListener(new jz1((byte) 17));
                        a18Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        a18Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new yg1(a18Var2, (byte) 1));
                        a18Var2.a0.addListener(new v85(a18Var2, (byte) 27));
                        a18Var2.a0.setDuration(400L);
                        a18Var2.a0.setInterpolator(ls3.e);
                        a18Var2.a0.start();
                        frameLayout22.addView(a18Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gl.d3(new oq7(a18Var2, (byte) 14));
                        return;
                }
            }
        });
        this.M.addView(this.L, nme.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        c08 c08Var3 = this.e;
        c08Var3.getClass();
        c08Var3.a = bkb.v0(bkb.Z6, c08Var3.b);
        c08Var3.a();
        c08Var3.invalidate();
        B0();
        C0();
        View view = this.fragmentView;
        b08 b08Var = new b08(this, (byte) 0);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(view, b08Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == kk7.h5) {
                this.h.f(true);
                this.n.f(true);
            } else if (i == kk7.H3) {
                this.h.d();
                this.n.d();
            } else if (i == kk7.G3) {
                this.h.d();
                this.n.d();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final rs3 getEdgeToEdgeSupportMode() {
        return rs3.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return hue.a(new t00(this, (byte) 12), bkb.c6, bkb.F6, bkb.y6, bkb.h6, bkb.Z6, bkb.A6, bkb.o7, bkb.e6, bkb.f6, bkb.N6, bkb.O6, bkb.P6, bkb.Q6);
    }

    @Override
    public final boolean isLightStatusBar() {
        c08 c08Var = this.e;
        if (c08Var == null) {
            return super.isLightStatusBar();
        }
        if (bm2.h(c08Var.getColor()) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.a && ((this.h.a() || this.n.a()) && getUserConfig().p())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        int i;
        int i2;
        boolean z2 = this.a;
        if (!z2 && ((this.h.a() || this.n.a()) && getUserConfig().p())) {
            if (z && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                if (z2) {
                    i = 2131752414;
                } else {
                    i = 2131743506;
                }
                String M0 = k96.M0(i, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                if (z2) {
                    i2 = 2131752413;
                } else {
                    i2 = 2131743505;
                }
                hdVar.U = k96.M0(i2, null);
                alertDialog$Builder.g(k96.M0(2131751357, null), new b08(this, (byte) 1));
                alertDialog$Builder.j(k96.M0(2131754213, null), new b08(this, (byte) 2));
                showDialog(hdVar);
                zkb.X((TextView) hdVar.c(-2), bkb.p7, getResourceProvider());
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a18.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.h5);
        getNotificationCenter().n(this, kk7.H3);
        getNotificationCenter().n(this, kk7.G3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.n != null) {
                I0();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void setResourceProvider(wjb wjbVar) {
        this.s = wjbVar;
    }

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a18.z0():void");
    }
}
