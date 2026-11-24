package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class zh9 extends jd9 implements vlb, fkb, td9 {
    public static Paint n0;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public final boolean I;
    public final nz4 J;
    public final jk2 K;
    public final ArrayList L;
    public final HashMap M;
    public qna N;
    public vg9 O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final ln V;
    public int W;
    public int a0;
    public float b0;
    public boolean c0;
    public float d0;
    public float e0;
    public int f0;
    public int g0;
    public int h0;
    public VelocityTracker i0;
    public ValueAnimator j0;
    public final ArrayList k0;
    public int l0;
    public final Path m0;
    public final ylb n;
    public final Paint r;
    public final Paint s;
    public final sd9 w;
    public final ImageView x;
    public final ImageView y;

    public zh9(Context context, ylb ylbVar) {
        super(context);
        boolean z;
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && gda.f()) {
            z = true;
        } else {
            z = false;
        }
        this.I = z;
        this.L = new ArrayList();
        this.M = new HashMap();
        this.U = -1;
        this.V = new ln(this, 0L, 320L, d53.h);
        this.k0 = new ArrayList();
        this.l0 = anb.b;
        this.m0 = new Path();
        this.n = ylbVar;
        setWillNotDraw(false);
        f(0, gm.L(6.0f), 0, gm.L(4.0f));
        sd9 sd9Var = new sd9(context, ylbVar, new cf9(this, (byte) 1));
        this.w = sd9Var;
        addView(sd9Var.a, qoe.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z && i >= 31) {
            nz4 nz4Var = new nz4(new kz4());
            this.J = nz4Var;
            nz4Var.l(gm.L(24.0f));
            this.K = new jk2((byte) 25);
        }
        ImageView g = g();
        this.x = g;
        g.setImageResource(2131231576);
        addView(g, qoe.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g.setOnClickListener(new wh9(this, (byte) 1));
        ImageView g2 = g();
        this.y = g2;
        g2.setVisibility(8);
        addView(g2, qoe.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        g2.setOnClickListener(new wh9(this, (byte) 2));
        updateColors();
    }

    private qna getSpoilerEffect() {
        qna qnaVar = null;
        if (this.P) {
            qna qnaVar2 = this.N;
            if (qnaVar2 != null && qnaVar2.i) {
                this.N = null;
            } else {
                qnaVar = qnaVar2;
            }
            if (qnaVar == null) {
                qna e = qna.e(this);
                this.N = e;
                return e;
            }
        }
        return qnaVar;
    }

    private void settle(float f) {
        int i;
        int i2;
        int size = this.E.size();
        if (f >= 0.0f || this.a0 >= size - 1) {
            i = -1;
            if (f <= 0.0f || this.a0 <= 0) {
                float f2 = this.b0;
                if (f2 <= 0.5f || this.a0 >= size - 1) {
                    if (f2 >= -0.5f || this.a0 <= 0) {
                        i = 0;
                    }
                }
            }
            int i3 = i + this.a0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, i3 - i2);
            this.j0 = ofFloat;
            ofFloat.setDuration(220L);
            this.j0.setInterpolator(d53.h);
            this.j0.addUpdateListener(new p29(this, (byte) 3));
            this.j0.addListener(new co(this, i3, (byte) 10));
            this.j0.start();
        }
        i = 1;
        int i32 = i + this.a0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b0, i32 - i2);
        this.j0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.j0.setInterpolator(d53.h);
        this.j0.addUpdateListener(new p29(this, (byte) 3));
        this.j0.addListener(new co(this, i32, (byte) 10));
        this.j0.start();
    }

    @Override
    public final boolean a(int i, int i2) {
        return this.w.f(i, i2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.we));
        hashSet.add(Integer.valueOf(cmb.kg));
    }

    @Override
    public final void b() {
        this.w.i();
    }

    @Override
    public final int d() {
        return gm.L(16.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.k0;
        ylb ylbVar = this.n;
        int i = this.l0;
        int i2 = anb.b;
        if (i != i2) {
            this.l0 = i2;
            try {
                int v0 = cmb.v0(cmb.c6, ylbVar);
                if (getBackground() instanceof gf9) {
                    ((gf9) getBackground()).a(v0);
                }
                int v = cmb.v(v0, cmb.v0(cmb.h6, ylbVar));
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Drawable drawable = (Drawable) arrayList.get(i3);
                    if (drawable instanceof RippleDrawable) {
                        RippleDrawable rippleDrawable = (RippleDrawable) drawable;
                        if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                            ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                            if (shapeDrawable.getPaint().getColor() != v0) {
                                shapeDrawable.getPaint().setColor(v0);
                                rippleDrawable.setColor(ColorStateList.valueOf(v));
                                rippleDrawable.invalidateSelf();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        super.dispatchDraw(canvas);
        this.w.c(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int size;
        if (this.F.contains(view)) {
            ll0 ll0Var = this.a;
            if (ll0Var == null) {
                size = 0;
            } else {
                size = ll0Var.k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.m0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.Q, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final ImageView g() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.I && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            nz4 nz4Var = this.J;
            im0 im0Var = new im0(nz4Var, nz4Var, nz4Var);
            im0Var.p(this.K);
            im0Var.r(gm.L(16.0f));
            this.M.put(imageView, im0Var);
        } else {
            int i = cmb.F6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ylb ylbVar = this.n;
            anb.s(imageView, i, ylbVar, mode);
            int i2 = cmb.c6;
            fg0 Z = cmb.Z(cmb.v0(i2, ylbVar), cmb.v(cmb.v0(i2, ylbVar), cmb.v0(cmb.h6, ylbVar)), 20, 20);
            this.k0.add(Z);
            imageView.setBackground(new if9(Z));
        }
        rve.a(imageView);
        this.L.add(imageView);
        return imageView;
    }

    @Override
    public ne9 getCaptionEditText() {
        return this.w.a;
    }

    @Override
    public ll0 getRow() {
        return this.a;
    }

    public final void h(Canvas canvas, ImageView imageView) {
        im0 im0Var;
        if (imageView.getVisibility() != 0 || (im0Var = (im0) this.M.get(imageView)) == null) {
            return;
        }
        im0Var.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        im0Var.setAlpha((int) (imageView.getAlpha() * 255.0f));
        gm0 gm0Var = im0Var.h0;
        if (gm0Var != null) {
            gm0Var.h = true;
        }
        im0Var.draw(canvas);
    }

    public final void j(Canvas canvas) {
        int size;
        boolean z;
        int size2;
        int i;
        char c;
        int i2;
        ArrayList arrayList;
        in5 in5Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        zh9 zh9Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = zh9Var.getPaddingTop();
        int paddingLeft = zh9Var.getPaddingLeft();
        int i8 = 0;
        int max = Math.max(0, (zh9Var.getWidth() - paddingLeft) - zh9Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        ll0 ll0Var = zh9Var.a;
        if (ll0Var == null) {
            size = 0;
        } else {
            size = ll0Var.k.size();
        }
        if (size > 0) {
            Path path = zh9Var.m0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, zh9Var.Q + paddingTop, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, zh9Var.Q + paddingTop);
        }
        boolean n = zh9Var.n();
        char c2 = 2;
        int i9 = 1;
        ArrayList arrayList2 = zh9Var.E;
        if (n && arrayList2.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        ll0 ll0Var2 = zh9Var.a;
        if (ll0Var2 == null) {
            size2 = 0;
        } else {
            size2 = ll0Var2.k.size();
        }
        if (size2 > 0) {
            i = gm.L(8.0f);
        } else {
            i = 0;
        }
        Paint paint = zh9Var.r;
        if (z && (((i7 = zh9Var.a0) == 0 && zh9Var.b0 < 0.0f) || (i7 == arrayList2.size() - 1 && zh9Var.b0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, zh9Var.Q + paddingTop, paint);
        }
        int size3 = arrayList2.size();
        in5 in5Var2 = null;
        ArrayList arrayList3 = zh9Var.H;
        if (size3 == 1 && arrayList3.size() == 1) {
            RectF rectF = (RectF) arrayList3.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = gm.P;
                rectF2.set(0.0f, paddingTop, max, paddingTop + zh9Var.Q);
                ci9 ci9Var = (ci9) arrayList2.get(0);
                ImageReceiver imageReceiver = ci9Var.b;
                if (ci9Var.b()) {
                    imageReceiver.k0(rectF2);
                    imageReceiver.setAlpha(ci9Var.a.i1);
                    imageReceiver.h(canvas2, null);
                }
            }
        }
        int i10 = 0;
        while (i10 < arrayList2.size() && i10 < arrayList3.size()) {
            ci9 ci9Var2 = (ci9) arrayList2.get(i10);
            RectF rectF3 = (RectF) arrayList3.get(i10);
            if (z) {
                if (i10 == 0) {
                    i3 = i;
                } else {
                    i3 = i8;
                }
                if (i10 == arrayList2.size() - i9) {
                    i4 = i;
                } else {
                    i4 = i8;
                }
                if (i10 == arrayList2.size() - i9) {
                    i5 = i;
                } else {
                    i5 = i8;
                }
                c = c2;
                if (i10 == 0) {
                    i6 = i;
                } else {
                    i6 = i8;
                }
                ci9Var2.a.r0(i3, i4, i5, i6);
                ci9Var2.b.r0(i3, i4, i5, i6);
            } else {
                c = c2;
                ci9Var2.a.r0(i8, i8, i8, i8);
                ci9Var2.b.r0(i8, i8, i8, i8);
            }
            boolean c3 = ci9Var2.c();
            ImageReceiver imageReceiver2 = ci9Var2.a;
            if (!c3) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.i0(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (ci9Var2.c()) {
                imageReceiver2.h(canvas2, in5Var2);
            }
            RadialProgress2 radialProgress2 = ci9Var2.d;
            i07 i07Var = ci9Var2.e;
            if (i07Var != null && i07Var.a()) {
                int L = gm.L(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i11 = L / 2;
                radialProgress2.p(round - i11, round2 - i11, round + i11, round2 + i11);
                i2 = 1;
                radialProgress2.o(true, ci9Var2.e.f);
                radialProgress2.draw(canvas2);
            } else {
                i2 = 1;
            }
            i07 i07Var2 = ci9Var2.e;
            if (i07Var2 != null && i07Var2.n && ci9Var2.c()) {
                qna spoilerEffect = zh9Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = ci9Var2.b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (ci9Var2.b()) {
                    imageReceiver3.k0(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.i1);
                    in5Var = null;
                    imageReceiver3.h(canvas2, null);
                } else {
                    in5Var = null;
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    arrayList = arrayList3;
                    spoilerEffect.c(canvas2, zh9Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.i1, false);
                } else {
                    arrayList = arrayList3;
                }
                canvas.restore();
            } else {
                arrayList = arrayList3;
                in5Var = null;
            }
            i10++;
            zh9Var = this;
            canvas2 = canvas;
            arrayList3 = arrayList;
            i9 = i2;
            in5Var2 = in5Var;
            c2 = c;
            i8 = 0;
        }
        canvas.restore();
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.w.e(arrayList);
    }

    public final void m(int i) {
        if (this.O != null && this.a != null) {
            List o = o();
            if (!o.isEmpty() && (o.size() != 1 || ((i07) o.get(0)).a != 0)) {
                if (i >= 0 && i < o.size() && ((i07) o.get(i)).a()) {
                    this.O.a.n2(this.a, (i07) o.get(i));
                    return;
                }
                return;
            }
            vg9 vg9Var = this.O;
            ll0 ll0Var = this.a;
            ch9 ch9Var = vg9Var.a;
            ch9Var.j4 = ll0Var;
            ch9Var.p3.c(0);
        }
    }

    public final boolean n() {
        ll0 ll0Var = this.a;
        if (ll0Var != null && (ll0Var.b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final java.util.List o() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh9.o():java.util.List");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i < arrayList.size()) {
                ci9 ci9Var = (ci9) arrayList.get(i);
                ci9Var.a.I();
                ci9Var.b.I();
                ci9Var.a();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.P = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.i0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.i0 = null;
        }
        this.c0 = false;
        while (true) {
            ArrayList arrayList = this.E;
            if (i >= arrayList.size()) {
                break;
            }
            ci9 ci9Var = (ci9) arrayList.get(i);
            ci9Var.a.K();
            ci9Var.b.K();
            ci9Var.c = null;
            i++;
        }
        qna qnaVar = this.N;
        if (qnaVar != null) {
            qnaVar.b(this);
            this.N = null;
        }
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        nz4 nz4Var;
        ImageView imageView;
        ImageView imageView2;
        gkb textSelectionHelper;
        float f;
        int L;
        float f2;
        float L2;
        int paddingTop = getPaddingTop();
        j(canvas);
        ln lnVar = this.V;
        float f3 = lnVar.c;
        ArrayList arrayList = this.E;
        if (arrayList.size() >= 2 && f3 > 0.001f) {
            if (n0 == null) {
                Paint paint = new Paint(1);
                n0 = paint;
                paint.setColor(-1);
                n0.setShadowLayer(gm.N(3.0f), 0.0f, gm.N(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float L3 = gm.L(5.0f) + ((getPaddingTop() + this.Q) - gm.L(23.0f));
            int L4 = gm.L(4.0f) + hg9.y(6.0f, size - 1, gm.L(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f4 = this.a0 + this.b0;
            if (L4 < max) {
                L2 = ((max - L4) / 2.0f) + paddingLeft;
                f = 23.0f;
                f2 = 4.0f;
            } else {
                int L5 = gm.L(13.0f);
                f = 23.0f;
                f2 = 4.0f;
                L2 = (gm.L(4.0f) + paddingLeft) - (Utilities.i(f4 - (((max - gm.L(8.0f)) / 2) / L5), Math.max(0, (size - (L << 1)) - 1), 0.0f) * L5);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.Q) - gm.L(f), max + paddingLeft, getPaddingTop() + this.Q);
            for (int i = 0; i < size; i++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i - f4));
                n0.setAlpha((int) mlb.A(max2, 95.0f, 160.0f, f3));
                canvas.drawCircle(gm.L(f2) + L2 + (gm.L(13.0f) * i), L3, (gm.L(1.0f) * max2) + gm.L(2.0f), n0);
            }
            canvas.restore();
        }
        vg9 vg9Var = this.O;
        if (vg9Var != null && (textSelectionHelper = vg9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.Q, this.s);
            }
        }
        if (this.I && (nz4Var = this.J) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !nz4Var.r) {
                    try {
                        j(nz4Var.i(width, height));
                    } finally {
                        nz4Var.j();
                    }
                }
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.L;
                    int size2 = arrayList2.size();
                    imageView = this.y;
                    imageView2 = this.x;
                    if (i2 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i2);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        h(canvas, imageView3);
                    }
                    i2++;
                }
                h(canvas, imageView);
                h(canvas, imageView2);
            }
        }
        if (lnVar.i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int left;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i6 = i3 - i;
        int max = Math.max(0, (i6 - paddingLeft) - paddingRight);
        int i7 = i6 - paddingRight;
        if (uue.b(this.a) > 0) {
            i5 = gm.L(16.0f);
        } else {
            i5 = 0;
        }
        this.w.g(paddingLeft - i5, paddingRight - i5, i6, getPaddingTop() + this.Q);
        int L = gm.L(6.0f);
        int i8 = i7 - L;
        ImageView imageView = this.x;
        imageView.layout(i8 - imageView.getMeasuredWidth(), getPaddingTop() + L, i8, imageView.getMeasuredHeight() + getPaddingTop() + L);
        int i9 = i8 - L;
        ImageView imageView2 = this.y;
        imageView2.layout((i9 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + L, i9 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + L);
        List o = o();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i10);
                int i11 = 8;
                if (i10 < o.size() && ((i07) o.get(i10)).a != 0) {
                    ArrayList arrayList2 = this.H;
                    if (i10 < arrayList2.size()) {
                        RectF rectF = (RectF) arrayList2.get(i10);
                        if (rectF.right > 0.0f && rectF.left < max && rectF.bottom > getPaddingTop() && rectF.top < getPaddingTop() + this.Q) {
                            int i12 = ((int) rectF.left) + L + paddingLeft;
                            int i13 = ((int) rectF.top) + L;
                            imageView3.layout(i12, i13, imageView3.getMeasuredWidth() + i12, imageView3.getMeasuredHeight() + i13);
                            float f = 1.0f;
                            if (this.I) {
                                if (imageView2.getVisibility() == 0) {
                                    left = imageView2.getLeft();
                                } else {
                                    left = imageView.getLeft();
                                }
                                int L2 = left - gm.L(4.0f);
                                if (imageView3.getMeasuredWidth() + i12 > L2) {
                                    f = aq1.x(measuredWidth - L2, imageView3.getMeasuredWidth(), 1.0f, 0.0f);
                                }
                            }
                            imageView3.setAlpha(f);
                            if (f > 0.01f) {
                                i11 = 0;
                            }
                            imageView3.setVisibility(i11);
                        } else {
                            imageView3.setVisibility(8);
                        }
                        i10++;
                    }
                }
                imageView3.setVisibility(8);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh9.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh9.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List o = o();
        while (true) {
            arrayList = this.E;
            if (arrayList.size() >= o.size()) {
                break;
            }
            ci9 ci9Var = new ci9(this, this.n);
            if (this.P) {
                ci9Var.a.I();
                ci9Var.b.I();
                ci9Var.a();
            }
            arrayList.add(ci9Var);
        }
        while (arrayList.size() > o.size()) {
            ci9 ci9Var2 = (ci9) td4.m(1, arrayList);
            ci9Var2.a.K();
            ci9Var2.b.K();
            ci9Var2.c = null;
        }
        for (int i = 0; i < o.size(); i++) {
            ci9 ci9Var3 = (ci9) arrayList.get(i);
            ci9Var3.e = (i07) o.get(i);
            ci9Var3.a();
        }
        while (true) {
            arrayList2 = this.F;
            if (arrayList2.size() >= o.size()) {
                break;
            }
            ImageView g = g();
            g.setImageResource(2131231579);
            g.setOnClickListener(new wh9(this, (byte) 0));
            addView(g, qoe.e(32, 32, 51));
            arrayList2.add(g);
        }
        this.x.bringToFront();
        this.y.bringToFront();
        while (arrayList2.size() > o.size()) {
            View view = (ImageView) td4.m(1, arrayList2);
            removeView(view);
            this.L.remove(view);
            this.M.remove(view);
        }
        if (this.N != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                i07 i07Var = ((ci9) arrayList.get(i2)).e;
                if (i07Var != null && i07Var.n) {
                    return;
                }
            }
            this.N.b(this);
            this.N = null;
        }
    }

    public final void q(boolean z) {
        boolean z2;
        int i;
        int i2 = 0;
        if (this.E.size() >= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i2 = 8;
        }
        ImageView imageView = this.y;
        imageView.setVisibility(i2);
        if (z2) {
            if (n()) {
                i = 2131231580;
            } else {
                i = 2131231577;
            }
            if (i == this.W) {
                return;
            }
            this.W = i;
            if (z) {
                gm.L3(imageView, i);
            } else {
                imageView.setImageResource(i);
            }
        }
    }

    @Override
    public final void updateColors() {
        int i = cmb.we;
        ylb ylbVar = this.n;
        this.r.setColor(cmb.v0(i, ylbVar));
        this.s.setColor(cmb.v0(cmb.kg, ylbVar));
        sd9 sd9Var = this.w;
        if (sd9Var != null) {
            sd9Var.a();
        }
    }
}
