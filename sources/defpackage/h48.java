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
import org.telegram.ui.ActionBar.e;
public final class h48 extends e implements fn7 {
    public final oz4 E;
    public final ll0 F;
    public final oz4 G;
    public final ll0 H;
    public e I;
    public ir1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public ud4 N;
    public ema O;
    public FrameLayout P;
    public FrameLayout Q;
    public c51 R;
    public a48 S;
    public boolean T;
    public b29 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public gh1 Y;
    public float Z;
    public final boolean a;
    public ValueAnimator a0;
    public final axa b;
    public boolean b0;
    public final axa c;
    public mq5 c0;
    public d26 d;
    public final r89 d0;
    public i38 e;
    public final r89 e0;
    public final int f;
    public a48 h;
    public a48 n;
    public boolean r;
    public vnb s;
    public final SparseIntArray w;
    public final t37 x;
    public final t37 y;

    public h48() {
        super(null);
        this.f = hl.L(6.0f);
        this.w = new SparseIntArray();
        boolean o = aob.I.o();
        this.T = o;
        this.b0 = o;
        this.c0 = mq5.e;
        r89 r89Var = new r89(0, false);
        this.d0 = r89Var;
        r89 r89Var2 = new r89(0, false);
        this.e0 = r89Var2;
        oz4 oz4Var = new oz4();
        this.E = oz4Var;
        ll0 ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
        this.F = ll0Var;
        oz4 oz4Var2 = new oz4();
        this.G = oz4Var2;
        ll0 ll0Var2 = new ll0(oz4Var2, oz4Var2, oz4Var2);
        this.H = ll0Var2;
        ll0Var.g = r89Var;
        ll0Var.f = r89Var2;
        ll0Var2.g = r89Var;
        ll0Var2.f = r89Var2;
        this.a = false;
        jxa.v(this.currentAccount, false).U();
        axa axaVar = new axa(this.currentAccount, 0L, false);
        this.b = axaVar;
        axaVar.g(8, false);
        axaVar.a();
        axa axaVar2 = new axa(this.currentAccount, 0L, false);
        this.c = axaVar2;
        axaVar2.g(8, false);
        axaVar2.f = true;
        axaVar2.a();
        this.resourceProvider = new gd(this, (byte) 3);
        this.x = new t37(0, false, false, this.resourceProvider);
        this.y = new t37(0, false, true, this.resourceProvider);
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
        if (hl.B(i) < 0.2f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 0.28f;
        } else {
            f = -0.28f;
        }
        return aob.a(0.5f, f, i);
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h48.A0():void");
    }

    public final void B0() {
        pj pjVar;
        if (this.r) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().p()) {
            showDialog(new xk8((e) this, 23, true));
            return;
        }
        a48 F0 = F0();
        TL_stars.TL_starGiftUnique tL_starGiftUnique = F0.J;
        a48 a48Var = this.h;
        if (tL_starGiftUnique != null) {
            if (F0 == a48Var) {
                a48Var = this.n;
            }
            a48Var.c();
            this.r = true;
            this.R.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = F0.J;
            d38 d38Var = new d38(this, (byte) 1);
            long e = yac.h(this.currentAccount).e();
            if (tL_starGiftUnique2.resale_ton_only) {
                pjVar = pj.b;
            } else {
                pjVar = pj.a;
            }
            jxa.u(this.currentAccount, pjVar).E(tL_starGiftUnique2, e, null, true, new f38(this, pjVar, tL_starGiftUnique2, e, d38Var));
            return;
        }
        if (F0 == a48Var) {
            a48Var = this.n;
        }
        if (a48Var.J != null) {
            a48Var.c();
        }
        A0();
        finishFragment();
        I0();
    }

    public final void C0() {
        this.E.a(getThemedColor(aob.d6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.x.invalidate();
        this.h.y.invalidate();
        this.n.x.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((jl0) this.P.getBackground()).updateColors();
        D0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((jl0) it.next()).updateColors();
        }
    }

    public final void D0() {
        int themedColor;
        if (hl.B(getThemedColor(aob.d6)) > 0.72d) {
            themedColor = vm2.f(0.085f, getThemedColor(aob.a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(aob.a7);
        }
        this.d.setBackgroundColor(themedColor);
        oz4 oz4Var = this.G;
        if (oz4Var.b != themedColor) {
            oz4Var.a(themedColor);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((jl0) it.next()).updateColors();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final a48 F0() {
        ir1 ir1Var = this.J;
        if (ir1Var != null && ir1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.n;
    }

    public final void G0(pj pjVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, d38 d38Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        zta ztaVar = new zta(pjVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        bua buaVar = new bua(getParentActivity(), this.resourceProvider, tL_starGiftUnique, ztaVar, this.currentAccount, j, qu6.m(tL_starGiftUnique.num, ',', sb), false, new g38(this, zArr, tL_starGiftUnique, j, d38Var, (byte) 0));
        buaVar.h.setOnDismissListener(new gf(zArr, d38Var, (byte) 13));
        buaVar.b();
    }

    public final void H0(boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, d38 d38Var, zta ztaVar, l01 l01Var) {
        zArr[0] = true;
        l01Var.d();
        jxa.u(this.currentAccount, ztaVar.a).f(ztaVar.b, tL_starGiftUnique, j, null, true, new ia7(l01Var, d38Var, (byte) 6));
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h48.I0():void");
    }

    public final void J0() {
        ema emaVar = this.O;
        if (emaVar != null) {
            emaVar.setTextColor(getThemedColor(aob.A8));
        }
        this.h.g();
        this.n.g();
        i38 i38Var = this.e;
        if (i38Var != null) {
            i38Var.a = aob.v0(aob.a7, i38Var.b);
            i38Var.a();
            i38Var.invalidate();
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
                ir1 ir1Var = this.J;
                if (ir1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = ir1Var.getPositionAnimated();
                }
                float a = ete.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                ud4 ud4Var = this.N;
                int f = vm2.f(a, tabsViewBackgroundColor, getThemedColor(aob.d6));
                int f2 = vm2.f(a, -1, getThemedColor(aob.a7));
                int f3 = vm2.f(a, -1, getThemedColor(aob.z6));
                int f4 = vm2.f(a, tabsViewBackgroundColor, getThemedColor(aob.G6));
                ud4Var.a.setColor(f);
                ud4Var.b.setColor(f2);
                ud4Var.d = f3;
                ud4Var.e = f4;
                ud4Var.invalidate();
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
        d26 d26Var = new d26((byte) 6, context, this);
        this.d = d26Var;
        this.fragmentView = d26Var;
        this.h = new a48(this, context, 1);
        this.n = new a48(this, context, 0);
        i38 i38Var = new i38(this, context, this.resourceProvider);
        this.e = i38Var;
        i38Var.F = true;
        this.n.j(false);
        this.n.addView(this.e, 2, tre.e(-1, -2, 55));
        ir1 ir1Var = new ir1((byte) 5, context, this);
        this.J = ir1Var;
        ir1Var.setAdapter(new mm2(this, (byte) 4));
        d26Var.addView(this.J, tre.e(-1, -1, 119));
        c51 c51Var = new c51(getResourceProvider(), context, true);
        this.R = c51Var;
        c51Var.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final h48 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h48 h48Var = this.b;
                switch (b) {
                    case 0:
                        h48Var.B0();
                        return;
                    case 1:
                        if (h48Var.onBackPressed(true)) {
                            h48Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        h48 h48Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) h48Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        h48Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        h48Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        h48Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + hl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gh1 gh1Var = new gh1(h48Var2, h48Var2.getParentActivity(), canvas, (h48Var2.L.getMeasuredWidth() / 2.0f) + f, (h48Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        h48Var2.Y = gh1Var;
                        gh1Var.setOnTouchListener(new b02((byte) 17));
                        h48Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        h48Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new hh1(h48Var2, (byte) 1));
                        h48Var2.a0.addListener(new ad5(h48Var2, (byte) 26));
                        h48Var2.a0.setDuration(400L);
                        h48Var2.a0.setInterpolator(dt3.e);
                        h48Var2.a0.start();
                        frameLayout2.addView(h48Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        hl.c3(new ge7(h48Var2, (byte) 29));
                        return;
                }
            }
        });
        this.P.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.P.addView(this.R, tre.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.P;
        jl0 c = this.F.c(frameLayout2, null, false);
        c.p(dtd.j(this.resourceProvider));
        c.r(hl.L(28.0f));
        c.q(hl.L(5.0f));
        frameLayout2.setBackground(c);
        iye.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        frameLayout3.addView(this.P, tre.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        rl0 rl0Var = new rl0(this.H.c(this.Q, null, false));
        rl0Var.b(hl.L(40.0f), true);
        rl0Var.H = 220;
        this.Q.setBackground(rl0Var);
        a48 F0 = F0();
        c51 c51Var2 = this.R;
        if (c51Var2 != null && F0 != null && F0 != this.S) {
            this.S = F0;
            ym4 ym4Var = F0.e;
            c51Var2.i((CharSequence) ym4Var.b, false, true);
            this.R.g((SpannableStringBuilder) ym4Var.c, false);
        }
        d26Var.addView(this.Q, tre.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.M = frameLayout4;
        d26Var.addView(frameLayout4, tre.e(-1, -2, 55));
        boolean z = this.a;
        if (!z) {
            ud4 ud4Var = new ud4(context);
            this.N = ud4Var;
            if (z) {
                i = 2131752402;
            } else {
                i = 2131743401;
            }
            String M0 = ob6.M0(i, null);
            if (z) {
                i2 = 2131752403;
            } else {
                i2 = 2131743402;
            }
            ud4Var.setTabs(M0, ob6.M0(i2, null));
            this.N.r = new d38(this, (byte) 0);
            K0();
            this.M.addView(this.N, tre.e(-1, 40, 17));
        } else {
            ema emaVar = new ema(context);
            this.O = emaVar;
            emaVar.l(ob6.M0(2131752401, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            yob.W(this.O, aob.A8, getResourceProvider());
            this.O.setTypeface(hl.o());
            this.M.addView(this.O, tre.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        i38 i38Var2 = this.e;
        if (i38Var2 != null) {
            i38Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                hl.k3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i3 = aob.u8;
        yob.R(imageView2, aob.f0(getThemedColor(i3), 1, -1), null, yob.M(i3), getResourceProvider());
        this.K.setImageResource(2131231243);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final h48 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h48 h48Var = this.b;
                switch (b) {
                    case 0:
                        h48Var.B0();
                        return;
                    case 1:
                        if (h48Var.onBackPressed(true)) {
                            h48Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        h48 h48Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) h48Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        h48Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        h48Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        h48Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + hl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gh1 gh1Var = new gh1(h48Var2, h48Var2.getParentActivity(), canvas, (h48Var2.L.getMeasuredWidth() / 2.0f) + f, (h48Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        h48Var2.Y = gh1Var;
                        gh1Var.setOnTouchListener(new b02((byte) 17));
                        h48Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        h48Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new hh1(h48Var2, (byte) 1));
                        h48Var2.a0.addListener(new ad5(h48Var2, (byte) 26));
                        h48Var2.a0.setDuration(400L);
                        h48Var2.a0.setInterpolator(dt3.e);
                        h48Var2.a0.start();
                        frameLayout22.addView(h48Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        hl.c3(new ge7(h48Var2, (byte) 29));
                        return;
                }
            }
        });
        iye.a(this.K);
        this.M.addView(this.K, tre.e(54, 54, 19));
        b29 b29Var = new b29(2131624235, hl.L(28.0f), hl.L(28.0f), true, null);
        this.U = b29Var;
        b29Var.h = true;
        if (!this.T) {
            b29Var.K(0);
            this.U.H(0);
        } else {
            b29Var.H(35);
            this.U.K(36);
        }
        this.U.a0 = true;
        int w0 = aob.w0(null, aob.J9, false);
        this.U.L(w0, "Sunny");
        this.U.L(w0, "Path 6");
        this.U.L(w0, "Path");
        this.U.L(w0, "Path 5");
        this.U.j();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        yob.R(this.L, aob.f0(getThemedColor(i3), 1, -1), null, yob.M(i3), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final h48 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h48 h48Var = this.b;
                switch (b) {
                    case 0:
                        h48Var.B0();
                        return;
                    case 1:
                        if (h48Var.onBackPressed(true)) {
                            h48Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        h48 h48Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) h48Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        h48Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        h48Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        h48Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + hl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gh1 gh1Var = new gh1(h48Var2, h48Var2.getParentActivity(), canvas, (h48Var2.L.getMeasuredWidth() / 2.0f) + f, (h48Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        h48Var2.Y = gh1Var;
                        gh1Var.setOnTouchListener(new b02((byte) 17));
                        h48Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        h48Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new hh1(h48Var2, (byte) 1));
                        h48Var2.a0.addListener(new ad5(h48Var2, (byte) 26));
                        h48Var2.a0.setDuration(400L);
                        h48Var2.a0.setInterpolator(dt3.e);
                        h48Var2.a0.start();
                        frameLayout22.addView(h48Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        hl.c3(new ge7(h48Var2, (byte) 29));
                        return;
                }
            }
        });
        this.M.addView(this.L, tre.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        i38 i38Var3 = this.e;
        i38Var3.getClass();
        i38Var3.a = aob.v0(aob.a7, i38Var3.b);
        i38Var3.a();
        i38Var3.invalidate();
        C0();
        D0();
        View view = this.fragmentView;
        h38 h38Var = new h38(this, (byte) 0);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(view, h38Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == jn7.i5) {
                this.h.f(true);
                this.n.f(true);
            } else if (i == jn7.I3) {
                this.h.d();
                this.n.d();
            } else if (i == jn7.H3) {
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
    public final jt3 getEdgeToEdgeSupportMode() {
        return jt3.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 12), aob.d6, aob.G6, aob.z6, aob.i6, aob.a7, aob.B6, aob.p7, aob.f6, aob.g6, aob.O6, aob.P6, aob.Q6, aob.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        i38 i38Var = this.e;
        if (i38Var == null) {
            return super.isLightStatusBar();
        }
        if (vm2.h(i38Var.getColor()) > 0.699999988079071d) {
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
                    i = 2131752400;
                } else {
                    i = 2131743400;
                }
                String M0 = ob6.M0(i, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                if (z2) {
                    i2 = 2131752399;
                } else {
                    i2 = 2131743399;
                }
                idVar.U = ob6.M0(i2, null);
                alertDialog$Builder.g(ob6.M0(2131751334, null), new h38(this, (byte) 1));
                alertDialog$Builder.j(ob6.M0(2131754209, null), new h38(this, (byte) 2));
                showDialog(idVar);
                yob.X((TextView) idVar.c(-2), aob.q7, getResourceProvider());
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h48.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.i5);
        getNotificationCenter().n(this, jn7.I3);
        getNotificationCenter().n(this, jn7.H3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.n != null) {
                J0();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void setResourceProvider(vnb vnbVar) {
        this.s = vnbVar;
    }
}
