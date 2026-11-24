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
public final class d38 extends d implements jm7 {
    public final kz4 E;
    public final km0 F;
    public final kz4 G;
    public final km0 H;
    public d I;
    public hs1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public xd4 N;
    public lka O;
    public FrameLayout P;
    public FrameLayout Q;
    public b61 R;
    public w28 S;
    public boolean T;
    public p09 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public fi1 Y;
    public float Z;
    public final boolean a;
    public ValueAnimator a0;
    public final ava b;
    public boolean b0;
    public final ava c;
    public iq5 c0;
    public ne6 d;
    public final g79 d0;
    public f28 e;
    public final g79 e0;
    public final int f;
    public w28 h;
    public w28 n;
    public boolean r;
    public ylb s;
    public final SparseIntArray w;
    public final m37 x;
    public final m37 y;

    public d38() {
        super(null);
        this.f = gm.L(6.0f);
        this.w = new SparseIntArray();
        boolean o = cmb.I.o();
        this.T = o;
        this.b0 = o;
        this.c0 = iq5.e;
        g79 g79Var = new g79(0, false);
        this.d0 = g79Var;
        g79 g79Var2 = new g79(0, false);
        this.e0 = g79Var2;
        kz4 kz4Var = new kz4();
        this.E = kz4Var;
        km0 km0Var = new km0(kz4Var, kz4Var, kz4Var);
        this.F = km0Var;
        kz4 kz4Var2 = new kz4();
        this.G = kz4Var2;
        km0 km0Var2 = new km0(kz4Var2, kz4Var2, kz4Var2);
        this.H = km0Var2;
        km0Var.g = g79Var;
        km0Var.f = g79Var2;
        km0Var2.g = g79Var;
        km0Var2.f = g79Var2;
        this.a = false;
        jva.v(this.currentAccount, false).T();
        ava avaVar = new ava(this.currentAccount, 0L, false);
        this.b = avaVar;
        avaVar.g(8, false);
        avaVar.a();
        ava avaVar2 = new ava(this.currentAccount, 0L, false);
        this.c = avaVar2;
        avaVar2.g(8, false);
        avaVar2.f = true;
        avaVar2.a();
        this.resourceProvider = new fe(this, (byte) 3);
        this.x = new m37(0, false, false, this.resourceProvider);
        this.y = new m37(0, false, true, this.resourceProvider);
    }

    public static boolean E0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
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

    public static int z0(int i) {
        boolean z;
        float f;
        if (gm.B(i) < 0.2f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 0.28f;
        } else {
            f = -0.28f;
        }
        return cmb.a(0.5f, f, i);
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d38.A0():void");
    }

    public final void B0() {
        ok okVar;
        if (this.r) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().p()) {
            showDialog(new kj8((d) this, 23, true));
            return;
        }
        w28 F0 = F0();
        TL_stars.TL_starGiftUnique tL_starGiftUnique = F0.J;
        w28 w28Var = this.h;
        if (tL_starGiftUnique != null) {
            if (F0 == w28Var) {
                w28Var = this.n;
            }
            w28Var.c();
            this.r = true;
            this.R.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = F0.J;
            a28 a28Var = new a28(this, (byte) 1);
            long e = z8c.h(this.currentAccount).e();
            if (tL_starGiftUnique2.resale_ton_only) {
                okVar = ok.b;
            } else {
                okVar = ok.a;
            }
            jva.u(this.currentAccount, okVar).E(tL_starGiftUnique2, e, null, true, new c28(this, okVar, tL_starGiftUnique2, e, a28Var));
            return;
        }
        if (F0 == w28Var) {
            w28Var = this.n;
        }
        if (w28Var.J != null) {
            w28Var.c();
        }
        A0();
        finishFragment();
        I0();
    }

    public final void C0() {
        this.E.a(getThemedColor(cmb.c6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.x.invalidate();
        this.h.y.invalidate();
        this.n.x.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((im0) this.P.getBackground()).updateColors();
        D0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((im0) it.next()).updateColors();
        }
    }

    public final void D0() {
        int themedColor;
        if (gm.B(getThemedColor(cmb.c6)) > 0.72d) {
            themedColor = on2.f(0.085f, getThemedColor(cmb.Z6), this.e.getColor());
        } else {
            themedColor = getThemedColor(cmb.Z6);
        }
        this.d.setBackgroundColor(themedColor);
        kz4 kz4Var = this.G;
        if (kz4Var.b != themedColor) {
            kz4Var.a(themedColor);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((im0) it.next()).updateColors();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final w28 F0() {
        hs1 hs1Var = this.J;
        if (hs1Var != null && hs1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.n;
    }

    public final void G0(ok okVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, a28 a28Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yra yraVar = new yra(okVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        asa asaVar = new asa(getParentActivity(), this.resourceProvider, tL_starGiftUnique, yraVar, this.currentAccount, j, kt6.m(tL_starGiftUnique.num, ',', sb), false, new d28(this, zArr, tL_starGiftUnique, j, a28Var, (byte) 0));
        asaVar.h.setOnDismissListener(new dg(zArr, a28Var, (byte) 13));
        asaVar.b();
    }

    public final void H0(boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, a28 a28Var, yra yraVar, k11 k11Var) {
        zArr[0] = true;
        k11Var.d();
        jva.u(this.currentAccount, yraVar.a).f(yraVar.b, tL_starGiftUnique, j, null, true, new s87(k11Var, a28Var, (byte) 8));
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d38.I0():void");
    }

    public final void J0() {
        lka lkaVar = this.O;
        if (lkaVar != null) {
            lkaVar.setTextColor(getThemedColor(cmb.z8));
        }
        this.h.g();
        this.n.g();
        f28 f28Var = this.e;
        if (f28Var != null) {
            f28Var.a = cmb.v0(cmb.Z6, f28Var.b);
            f28Var.a();
            f28Var.invalidate();
        }
        K0();
        C0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void K0() {
        float positionAnimated;
        if (this.e != null) {
            D0();
            int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
            if (this.N != null) {
                hs1 hs1Var = this.J;
                if (hs1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = hs1Var.getPositionAnimated();
                }
                float a = pqe.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                xd4 xd4Var = this.N;
                int f = on2.f(a, tabsViewBackgroundColor, getThemedColor(cmb.c6));
                int f2 = on2.f(a, -1, getThemedColor(cmb.Z6));
                int f3 = on2.f(a, -1, getThemedColor(cmb.y6));
                int f4 = on2.f(a, tabsViewBackgroundColor, getThemedColor(cmb.F6));
                xd4Var.a.setColor(f);
                xd4Var.b.setColor(f2);
                xd4Var.d = f3;
                xd4Var.e = f4;
                xd4Var.invalidate();
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
        ne6 ne6Var = new ne6((byte) 4, context, this);
        this.d = ne6Var;
        this.fragmentView = ne6Var;
        this.h = new w28(this, context, 1);
        this.n = new w28(this, context, 0);
        f28 f28Var = new f28(this, context, this.resourceProvider);
        this.e = f28Var;
        f28Var.F = true;
        this.n.j(false);
        this.n.addView(this.e, 2, qoe.e(-1, -2, 55));
        hs1 hs1Var = new hs1((byte) 4, context, this);
        this.J = hs1Var;
        hs1Var.setAdapter(new fn2(this, (byte) 4));
        ne6Var.addView(this.J, qoe.e(-1, -1, 119));
        b61 b61Var = new b61(getResourceProvider(), context, true);
        this.R = b61Var;
        b61Var.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final d38 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                d38 d38Var = this.b;
                switch (b) {
                    case 0:
                        d38Var.B0();
                        return;
                    case 1:
                        if (d38Var.onBackPressed(true)) {
                            d38Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        d38 d38Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) d38Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        d38Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        d38Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        d38Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gm.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fi1 fi1Var = new fi1(d38Var2, d38Var2.getParentActivity(), canvas, (d38Var2.L.getMeasuredWidth() / 2.0f) + f, (d38Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        d38Var2.Y = fi1Var;
                        fi1Var.setOnTouchListener(new w02((byte) 17));
                        d38Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        d38Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi1(d38Var2, (byte) 1));
                        d38Var2.a0.addListener(new v85(d38Var2, (byte) 29));
                        d38Var2.a0.setDuration(400L);
                        d38Var2.a0.setInterpolator(vt3.e);
                        d38Var2.a0.start();
                        frameLayout2.addView(d38Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gm.c3(new kl7(d38Var2, (byte) 21));
                        return;
                }
            }
        });
        this.P.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        this.P.addView(this.R, qoe.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.P;
        im0 c = this.F.c(frameLayout2, null, false);
        c.p(qqd.j(this.resourceProvider));
        c.r(gm.L(28.0f));
        c.q(gm.L(5.0f));
        frameLayout2.setBackground(c);
        rve.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        frameLayout3.addView(this.P, qoe.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        qm0 qm0Var = new qm0(this.H.c(this.Q, null, false));
        qm0Var.b(gm.L(40.0f), true);
        qm0Var.H = 220;
        this.Q.setBackground(qm0Var);
        w28 F0 = F0();
        b61 b61Var2 = this.R;
        if (b61Var2 != null && F0 != null && F0 != this.S) {
            this.S = F0;
            mj4 mj4Var = F0.e;
            b61Var2.i((CharSequence) mj4Var.b, false, true);
            this.R.g((SpannableStringBuilder) mj4Var.c, false);
        }
        ne6Var.addView(this.Q, qoe.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.M = frameLayout4;
        ne6Var.addView(frameLayout4, qoe.e(-1, -2, 55));
        boolean z = this.a;
        if (!z) {
            xd4 xd4Var = new xd4(context);
            this.N = xd4Var;
            if (z) {
                i = 2131752374;
            } else {
                i = 2131743433;
            }
            String M0 = jb6.M0(i, null);
            if (z) {
                i2 = 2131752375;
            } else {
                i2 = 2131743434;
            }
            xd4Var.setTabs(M0, jb6.M0(i2, null));
            this.N.r = new a28(this, (byte) 0);
            K0();
            this.M.addView(this.N, qoe.e(-1, 40, 17));
        } else {
            lka lkaVar = new lka(context);
            this.O = lkaVar;
            lkaVar.l(jb6.M0(2131752373, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            anb.W(this.O, cmb.z8, getResourceProvider());
            this.O.setTypeface(gm.o());
            this.M.addView(this.O, qoe.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        f28 f28Var2 = this.e;
        if (f28Var2 != null) {
            f28Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                gm.k3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i3 = cmb.t8;
        anb.R(imageView2, cmb.f0(getThemedColor(i3), 1, -1), null, anb.M(i3), getResourceProvider());
        this.K.setImageResource(2131231244);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final d38 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                d38 d38Var = this.b;
                switch (b) {
                    case 0:
                        d38Var.B0();
                        return;
                    case 1:
                        if (d38Var.onBackPressed(true)) {
                            d38Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        d38 d38Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) d38Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        d38Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        d38Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        d38Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gm.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fi1 fi1Var = new fi1(d38Var2, d38Var2.getParentActivity(), canvas, (d38Var2.L.getMeasuredWidth() / 2.0f) + f, (d38Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        d38Var2.Y = fi1Var;
                        fi1Var.setOnTouchListener(new w02((byte) 17));
                        d38Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        d38Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi1(d38Var2, (byte) 1));
                        d38Var2.a0.addListener(new v85(d38Var2, (byte) 29));
                        d38Var2.a0.setDuration(400L);
                        d38Var2.a0.setInterpolator(vt3.e);
                        d38Var2.a0.start();
                        frameLayout22.addView(d38Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gm.c3(new kl7(d38Var2, (byte) 21));
                        return;
                }
            }
        });
        rve.a(this.K);
        this.M.addView(this.K, qoe.e(54, 54, 19));
        p09 p09Var = new p09(2131624235, gm.L(28.0f), gm.L(28.0f), true, null);
        this.U = p09Var;
        p09Var.h = true;
        if (!this.T) {
            p09Var.K(0);
            this.U.H(0);
        } else {
            p09Var.H(35);
            this.U.K(36);
        }
        this.U.a0 = true;
        int w0 = cmb.w0(null, cmb.I9, false);
        this.U.L(w0, "Sunny");
        this.U.L(w0, "Path 6");
        this.U.L(w0, "Path");
        this.U.L(w0, "Path 5");
        this.U.j();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        anb.R(this.L, cmb.f0(getThemedColor(i3), 1, -1), null, anb.M(i3), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final d38 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                d38 d38Var = this.b;
                switch (b) {
                    case 0:
                        d38Var.B0();
                        return;
                    case 1:
                        if (d38Var.onBackPressed(true)) {
                            d38Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        d38 d38Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) d38Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        d38Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        d38Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        d38Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gm.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fi1 fi1Var = new fi1(d38Var2, d38Var2.getParentActivity(), canvas, (d38Var2.L.getMeasuredWidth() / 2.0f) + f, (d38Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        d38Var2.Y = fi1Var;
                        fi1Var.setOnTouchListener(new w02((byte) 17));
                        d38Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        d38Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi1(d38Var2, (byte) 1));
                        d38Var2.a0.addListener(new v85(d38Var2, (byte) 29));
                        d38Var2.a0.setDuration(400L);
                        d38Var2.a0.setInterpolator(vt3.e);
                        d38Var2.a0.start();
                        frameLayout22.addView(d38Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gm.c3(new kl7(d38Var2, (byte) 21));
                        return;
                }
            }
        });
        this.M.addView(this.L, qoe.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        f28 f28Var3 = this.e;
        f28Var3.getClass();
        f28Var3.a = cmb.v0(cmb.Z6, f28Var3.b);
        f28Var3.a();
        f28Var3.invalidate();
        C0();
        D0();
        View view = this.fragmentView;
        e28 e28Var = new e28(this, (byte) 0);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(view, e28Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == nm7.j5) {
                this.h.f(true);
                this.n.f(true);
            } else if (i == nm7.I3) {
                this.h.d();
                this.n.d();
            } else if (i == nm7.H3) {
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
    public final bu3 getEdgeToEdgeSupportMode() {
        return bu3.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return kwe.a(new t10(this, (byte) 12), cmb.c6, cmb.F6, cmb.y6, cmb.h6, cmb.Z6, cmb.A6, cmb.o7, cmb.e6, cmb.f6, cmb.N6, cmb.O6, cmb.P6, cmb.Q6);
    }

    @Override
    public final boolean isLightStatusBar() {
        f28 f28Var = this.e;
        if (f28Var == null) {
            return super.isLightStatusBar();
        }
        if (on2.h(f28Var.getColor()) > 0.699999988079071d) {
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
                    i = 2131752372;
                } else {
                    i = 2131743432;
                }
                String M0 = jb6.M0(i, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                if (z2) {
                    i2 = 2131752371;
                } else {
                    i2 = 2131743431;
                }
                heVar.U = jb6.M0(i2, null);
                alertDialog$Builder.g(jb6.M0(2131751306, null), new e28(this, (byte) 1));
                alertDialog$Builder.j(jb6.M0(2131754181, null), new e28(this, (byte) 2));
                showDialog(heVar);
                anb.X((TextView) heVar.c(-2), cmb.p7, getResourceProvider());
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d38.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.j5);
        getNotificationCenter().n(this, nm7.I3);
        getNotificationCenter().n(this, nm7.H3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.n != null) {
                J0();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void setResourceProvider(ylb ylbVar) {
        this.s = ylbVar;
    }
}
