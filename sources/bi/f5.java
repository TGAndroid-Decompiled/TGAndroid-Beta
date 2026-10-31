package bi;

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
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.jc;
import org.telegram.messenger.tz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.gr;
public final class f5 extends c0 implements org.telegram.ui.ActionBar.k6, j9, o0 {
    public static Paint m0;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final boolean H;
    public final hi.f I;
    public final t7.u J;
    public final ArrayList K;
    public final HashMap L;
    public nh.h M;
    public w3 N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final org.telegram.ui.Components.t5 U;
    public int V;
    public int W;
    public float f3001a0;
    public boolean f3002b0;
    public float f3003c0;
    public float f3004d0;
    public int f3005e0;
    public int f3006f0;
    public int f3007g0;
    public VelocityTracker f3008h0;
    public ValueAnimator f3009i0;
    public final ArrayList f3010j0;
    public int f3011k0;
    public final Path f3012l0;
    public final org.telegram.ui.ActionBar.p6 f3013n;
    public final Paint f3014r;
    public final Paint f3015s;
    public final n0 f3016w;
    public final ImageView f3017x;
    public final ImageView f3018y;

    public f5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        boolean z10;
        this.f3014r = new Paint(1);
        this.f3015s = new Paint(1);
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && tz.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        this.K = new ArrayList();
        this.L = new HashMap();
        this.T = -1;
        this.U = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.h);
        this.f3010j0 = new ArrayList();
        this.f3011k0 = a7.f20158b;
        this.f3012l0 = new Path();
        this.f3013n = p6Var;
        setWillNotDraw(false);
        f(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(4.0f));
        n0 n0Var = new n0(context, p6Var, new a6.i(this, 11));
        this.f3016w = n0Var;
        addView(n0Var.f3214a, w7.b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i10 >= 31) {
            hi.f fVar = new hi.f(new hi.c());
            this.I = fVar;
            fVar.f(org.telegram.messenger.i0.L(24.0f));
            this.J = new t7.u(3);
        }
        ImageView g10 = g();
        this.f3017x = g10;
        g10.setImageResource(2131231572);
        addView(g10, w7.b6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g10.setOnClickListener(new b5(this, 1));
        ImageView g11 = g();
        this.f3018y = g11;
        g11.setVisibility(8);
        addView(g11, w7.b6.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        g11.setOnClickListener(new b5(this, 2));
        updateColors();
    }

    private nh.h getSpoilerEffect() {
        if (!this.O) {
            return null;
        }
        nh.h hVar = this.M;
        if (hVar != null && hVar.f13834i) {
            this.M = null;
        }
        if (this.M == null) {
            this.M = nh.h.e(this);
        }
        return this.M;
    }

    private void settle(float f7) {
        int i10;
        int i11;
        int size = this.D.size();
        if (f7 >= 0.0f || this.W >= size - 1) {
            i10 = -1;
            if (f7 <= 0.0f || this.W <= 0) {
                float f10 = this.f3001a0;
                if (f10 <= 0.5f || this.W >= size - 1) {
                    if (f10 >= -0.5f || this.W <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i12 = i10 + this.W;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f3001a0, i12 - i11);
            this.f3009i0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f3009i0.setInterpolator(gr.h);
            this.f3009i0.addUpdateListener(new bg.k(this, 1));
            this.f3009i0.addListener(new d5(this, i12, 0));
            this.f3009i0.start();
        }
        i10 = 1;
        int i122 = i10 + this.W;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f3001a0, i122 - i11);
        this.f3009i0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f3009i0.setInterpolator(gr.h);
        this.f3009i0.addUpdateListener(new bg.k(this, 1));
        this.f3009i0.addListener(new d5(this, i122, 0));
        this.f3009i0.start();
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.f3016w.f(i10, i11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21249ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21028ig));
    }

    @Override
    public final void b() {
        this.f3016w.i();
    }

    @Override
    public final int d() {
        return org.telegram.messenger.i0.L(16.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f3010j0;
        org.telegram.ui.ActionBar.p6 p6Var = this.f3013n;
        int i10 = this.f3011k0;
        int i11 = a7.f20158b;
        if (i10 != i11) {
            this.f3011k0 = i11;
            try {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var);
                if (getBackground() instanceof h2) {
                    ((h2) getBackground()).a(w02);
                }
                int w9 = org.telegram.ui.ActionBar.t6.w(w02, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i6, p6Var));
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Drawable drawable = (Drawable) arrayList.get(i12);
                    if (drawable instanceof RippleDrawable) {
                        RippleDrawable rippleDrawable = (RippleDrawable) drawable;
                        if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                            ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                            if (shapeDrawable.getPaint().getColor() != w02) {
                                shapeDrawable.getPaint().setColor(w02);
                                rippleDrawable.setColor(ColorStateList.valueOf(w9));
                                rippleDrawable.invalidateSelf();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        super.dispatchDraw(canvas);
        this.f3016w.c(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int size;
        if (this.E.contains(view)) {
            a aVar = this.f2881a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f2824k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.f3012l0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.P, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final ImageView g() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.H && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            vg.f fVar = new vg.f(this.I);
            fVar.o(this.J);
            fVar.q(org.telegram.messenger.i0.L(16.0f));
            this.L.put(imageView, fVar);
        } else {
            int i10 = org.telegram.ui.ActionBar.t6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.p6 p6Var = this.f3013n;
            a7.t(imageView, i10, p6Var, mode);
            int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
            org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i6, p6Var)), 20, 20);
            this.f3010j0.add(b02);
            imageView.setBackground(new j2(b02));
        }
        w7.e6.a(imageView);
        this.K.add(imageView);
        return imageView;
    }

    @Override
    public n1 getCaptionEditText() {
        return this.f3016w.f3214a;
    }

    @Override
    public a getRow() {
        return this.f2881a;
    }

    @Override
    public final void h(ArrayList arrayList) {
        this.f3016w.e(arrayList);
    }

    public final void j(Canvas canvas, ImageView imageView) {
        vg.f fVar;
        if (imageView.getVisibility() != 0 || (fVar = (vg.f) this.L.get(imageView)) == null) {
            return;
        }
        fVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        fVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
        vg.d dVar = fVar.f50842b0;
        if (dVar != null) {
            dVar.h = true;
        }
        fVar.draw(canvas);
    }

    public final void k(Canvas canvas) {
        int size;
        boolean z10;
        int size2;
        int i10;
        char c10;
        int i11;
        ArrayList arrayList;
        jc jcVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        f5 f5Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = f5Var.getPaddingTop();
        int paddingLeft = f5Var.getPaddingLeft();
        int i17 = 0;
        int max = Math.max(0, (f5Var.getWidth() - paddingLeft) - f5Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = f5Var.f2881a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f2824k.size();
        }
        if (size > 0) {
            Path path = f5Var.f3012l0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, f5Var.P + paddingTop, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, f5Var.P + paddingTop);
        }
        boolean m10 = f5Var.m();
        char c11 = 2;
        int i18 = 1;
        ArrayList arrayList2 = f5Var.D;
        if (m10 && arrayList2.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        a aVar2 = f5Var.f2881a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f2824k.size();
        }
        if (size2 > 0) {
            i10 = org.telegram.messenger.i0.L(8.0f);
        } else {
            i10 = 0;
        }
        Paint paint = f5Var.f3014r;
        if (z10 && (((i16 = f5Var.W) == 0 && f5Var.f3001a0 < 0.0f) || (i16 == arrayList2.size() - 1 && f5Var.f3001a0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, f5Var.P + paddingTop, paint);
        }
        int size3 = arrayList2.size();
        jc jcVar2 = null;
        ArrayList arrayList3 = f5Var.G;
        if (size3 == 1 && arrayList3.size() == 1) {
            RectF rectF = (RectF) arrayList3.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(0.0f, paddingTop, max, paddingTop + f5Var.P);
                i5 i5Var = (i5) arrayList2.get(0);
                ImageReceiver imageReceiver = i5Var.f3100b;
                if (i5Var.b()) {
                    imageReceiver.A0(rectF2);
                    imageReceiver.setAlpha(i5Var.f3099a.f14384h1);
                    imageReceiver.h(canvas2, null);
                }
            }
        }
        int i19 = 0;
        while (i19 < arrayList2.size() && i19 < arrayList3.size()) {
            i5 i5Var2 = (i5) arrayList2.get(i19);
            RectF rectF3 = (RectF) arrayList3.get(i19);
            if (z10) {
                if (i19 == 0) {
                    i12 = i10;
                } else {
                    i12 = i17;
                }
                if (i19 == arrayList2.size() - i18) {
                    i13 = i10;
                } else {
                    i13 = i17;
                }
                if (i19 == arrayList2.size() - i18) {
                    i14 = i10;
                } else {
                    i14 = i17;
                }
                c10 = c11;
                if (i19 == 0) {
                    i15 = i10;
                } else {
                    i15 = i17;
                }
                i5Var2.f3099a.K0(i12, i13, i14, i15);
                i5Var2.f3100b.K0(i12, i13, i14, i15);
            } else {
                c10 = c11;
                i5Var2.f3099a.K0(i17, i17, i17, i17);
                i5Var2.f3100b.K0(i17, i17, i17, i17);
            }
            boolean c12 = i5Var2.c();
            ImageReceiver imageReceiver2 = i5Var2.f3099a;
            if (!c12) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.y0(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (i5Var2.c()) {
                imageReceiver2.h(canvas2, jcVar2);
            }
            RadialProgress2 radialProgress2 = i5Var2.d;
            w wVar = i5Var2.e;
            if (wVar != null && wVar.a()) {
                int L = org.telegram.messenger.i0.L(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i20 = L / 2;
                radialProgress2.r(round - i20, round2 - i20, round + i20, round2 + i20);
                i11 = 1;
                radialProgress2.p(true, i5Var2.e.f3419f);
                radialProgress2.draw(canvas2);
            } else {
                i11 = 1;
            }
            w wVar2 = i5Var2.e;
            if (wVar2 != null && wVar2.f3426n && i5Var2.c()) {
                nh.h spoilerEffect = f5Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = i5Var2.f3100b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (i5Var2.b()) {
                    imageReceiver3.A0(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.f14384h1);
                    jcVar = null;
                    imageReceiver3.h(canvas2, null);
                } else {
                    jcVar = null;
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    arrayList = arrayList3;
                    spoilerEffect.c(canvas2, f5Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.f14384h1, false);
                } else {
                    arrayList = arrayList3;
                }
                canvas.restore();
            } else {
                arrayList = arrayList3;
                jcVar = null;
            }
            i19++;
            f5Var = this;
            canvas2 = canvas;
            arrayList3 = arrayList;
            i18 = i11;
            jcVar2 = jcVar;
            c11 = c10;
            i17 = 0;
        }
        canvas.restore();
    }

    public final void l(int i10) {
        if (this.N != null && this.f2881a != null) {
            List o10 = o();
            if (!o10.isEmpty() && (o10.size() != 1 || ((w) o10.get(0)).f3416a != 0)) {
                if (i10 >= 0 && i10 < o10.size() && ((w) o10.get(i10)).a()) {
                    d4.Q1(this.f2881a, (w) o10.get(i10), this.N.f3436a);
                    return;
                }
                return;
            }
            w3 w3Var = this.N;
            a aVar = this.f2881a;
            d4 d4Var = w3Var.f3436a;
            d4Var.f2931i4 = aVar;
            d4Var.f2938o3.p(0);
        }
    }

    public final boolean m() {
        a aVar = this.f2881a;
        if (aVar != null && (aVar.f2818b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List o() {
        a aVar = this.f2881a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        w wVar = aVar.f2821g;
        if (wVar != null) {
            return Collections.singletonList(wVar);
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 < arrayList.size()) {
                i5 i5Var = (i5) arrayList.get(i10);
                i5Var.f3099a.P();
                i5Var.f3100b.P();
                i5Var.a();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.O = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.f3008h0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3008h0 = null;
        }
        this.f3002b0 = false;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 >= arrayList.size()) {
                break;
            }
            i5 i5Var = (i5) arrayList.get(i10);
            i5Var.f3099a.R();
            i5Var.f3100b.R();
            i5Var.f3101c = null;
            i10++;
        }
        nh.h hVar = this.M;
        if (hVar != null) {
            hVar.b(this);
            this.M = null;
        }
        ValueAnimator valueAnimator = this.f3009i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3009i0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        hi.f fVar;
        ImageView imageView;
        ImageView imageView2;
        k9 textSelectionHelper;
        float f7;
        float f10;
        int L;
        float f11;
        float L2;
        int paddingTop = getPaddingTop();
        k(canvas);
        org.telegram.ui.Components.t5 t5Var = this.U;
        float f12 = t5Var.f30445c;
        ArrayList arrayList = this.D;
        if (arrayList.size() >= 2 && f12 > 0.001f) {
            if (m0 == null) {
                Paint paint = new Paint(1);
                m0 = paint;
                paint.setColor(-1);
                m0.setShadowLayer(org.telegram.messenger.i0.N(3.0f), 0.0f, org.telegram.messenger.i0.N(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float L3 = org.telegram.messenger.i0.L(5.0f) + ((getPaddingTop() + this.P) - org.telegram.messenger.i0.L(23.0f));
            int L4 = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.m5.D(6.0f, size - 1, org.telegram.messenger.i0.L(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f13 = this.W + this.f3001a0;
            if (L4 < max) {
                f7 = 13.0f;
                L2 = ((max - L4) / 2.0f) + paddingLeft;
                f10 = 23.0f;
                f11 = 4.0f;
            } else {
                f7 = 13.0f;
                int L5 = org.telegram.messenger.i0.L(13.0f);
                f10 = 23.0f;
                f11 = 4.0f;
                L2 = (org.telegram.messenger.i0.L(4.0f) + paddingLeft) - (Utilities.i(f13 - (((max - org.telegram.messenger.i0.L(8.0f)) / 2) / L5), Math.max(0, (size - (L * 2)) - 1), 0.0f) * L5);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.P) - org.telegram.messenger.i0.L(f10), max + paddingLeft, getPaddingTop() + this.P);
            for (int i10 = 0; i10 < size; i10++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i10 - f13));
                m0.setAlpha((int) c3.i0.C(max2, 95.0f, 160.0f, f12));
                canvas.drawCircle(org.telegram.messenger.i0.L(f11) + L2 + (org.telegram.messenger.i0.L(f7) * i10), L3, (org.telegram.messenger.i0.L(1.0f) * max2) + org.telegram.messenger.i0.L(2.0f), m0);
            }
            canvas.restore();
        }
        w3 w3Var = this.N;
        if (w3Var != null && (textSelectionHelper = w3Var.f3436a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f22186p0 && R <= textSelectionHelper.f22189s0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.P, this.f3015s);
            }
        }
        if (this.H && (fVar = this.I) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !fVar.f7721r) {
                    try {
                        k(fVar.b(width, height));
                    } finally {
                        fVar.c();
                    }
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.K;
                    int size2 = arrayList2.size();
                    imageView = this.f3018y;
                    imageView2 = this.f3017x;
                    if (i11 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i11);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        j(canvas, imageView3);
                    }
                    i11++;
                }
                j(canvas, imageView);
                j(canvas, imageView2);
            }
        }
        if (t5Var.f30448i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int left;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i15 = i12 - i10;
        int max = Math.max(0, (i15 - paddingLeft) - paddingRight);
        int i16 = i15 - paddingRight;
        if (v7.a5.b(this.f2881a) > 0) {
            i14 = org.telegram.messenger.i0.L(16.0f);
        } else {
            i14 = 0;
        }
        this.f3016w.g(paddingLeft - i14, paddingRight - i14, i15, getPaddingTop() + this.P);
        int L = org.telegram.messenger.i0.L(6.0f);
        int i17 = i16 - L;
        ImageView imageView = this.f3017x;
        imageView.layout(i17 - imageView.getMeasuredWidth(), getPaddingTop() + L, i17, imageView.getMeasuredHeight() + getPaddingTop() + L);
        int i18 = i17 - L;
        ImageView imageView2 = this.f3018y;
        imageView2.layout((i18 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + L, i18 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + L);
        List o10 = o();
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i19 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i19);
                int i20 = 8;
                if (i19 < o10.size() && ((w) o10.get(i19)).f3416a != 0) {
                    ArrayList arrayList2 = this.G;
                    if (i19 < arrayList2.size()) {
                        RectF rectF = (RectF) arrayList2.get(i19);
                        if (rectF.right > 0.0f && rectF.left < max && rectF.bottom > getPaddingTop() && rectF.top < getPaddingTop() + this.P) {
                            int i21 = ((int) rectF.left) + L + paddingLeft;
                            int i22 = ((int) rectF.top) + L;
                            imageView3.layout(i21, i22, imageView3.getMeasuredWidth() + i21, imageView3.getMeasuredHeight() + i22);
                            float f7 = 1.0f;
                            if (this.H) {
                                if (imageView2.getVisibility() == 0) {
                                    left = imageView2.getLeft();
                                } else {
                                    left = imageView.getLeft();
                                }
                                int L2 = left - org.telegram.messenger.i0.L(4.0f);
                                if (imageView3.getMeasuredWidth() + i21 > L2) {
                                    f7 = org.telegram.ui.Cells.f1.v(measuredWidth - L2, imageView3.getMeasuredWidth(), 1.0f, 0.0f);
                                }
                            }
                            imageView3.setAlpha(f7);
                            if (f7 > 0.01f) {
                                i20 = 0;
                            }
                            imageView3.setVisibility(i20);
                        } else {
                            imageView3.setVisibility(8);
                        }
                        i19++;
                    }
                }
                imageView3.setVisibility(8);
                i19++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: bi.f5.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (y3 >= getPaddingTop() && y3 < getPaddingTop() + this.P) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = -1;
        if (m() && !this.U.f30448i) {
            ArrayList arrayList = this.D;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f3005e0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f3005e0 = viewConfiguration.getScaledTouchSlop();
                        this.f3006f0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f3007g0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.f3003c0 = x10;
                    this.f3004d0 = y3;
                    this.f3002b0 = false;
                    VelocityTracker velocityTracker2 = this.f3008h0;
                    if (velocityTracker2 == null) {
                        this.f3008h0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f3008h0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f3009i0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f3009i0 = null;
                    }
                    this.T = this.W;
                    return true;
                }
                float f7 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f3008h0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f10 = x10 - this.f3003c0;
                    float f11 = y3 - this.f3004d0;
                    if (!this.f3002b0 && Math.abs(f10) > this.f3005e0 && Math.abs(f10) > Math.abs(f11)) {
                        this.f3002b0 = true;
                        this.T = -1;
                    }
                    if (this.f3002b0) {
                        float f12 = (-f10) / this.R;
                        int i12 = this.W;
                        if (i12 == 0 && f12 < 0.0f) {
                            f12 *= 0.3f;
                        }
                        if (i12 == arrayList.size() - 1 && f12 > 0.0f) {
                            f12 *= 0.3f;
                        }
                        this.f3001a0 = f12;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f3008h0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f3008h0.computeCurrentVelocity(1000, this.f3007g0);
                        float xVelocity = this.f3008h0.getXVelocity();
                        float yVelocity = this.f3008h0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f3006f0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f7 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f3008h0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f3008h0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.f3002b0) {
                        this.f3002b0 = false;
                        settle(f7);
                    } else if (actionMasked == 1) {
                        int i13 = this.T;
                        int i14 = this.W;
                        if (i13 == i14) {
                            l(i14);
                        }
                    }
                    this.T = -1;
                    return true;
                }
                return true;
            }
        }
        ArrayList arrayList2 = this.G;
        if (actionMasked == 0) {
            if (!z10) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i10 >= arrayList2.size()) {
                    break;
                } else if (((RectF) arrayList2.get(i10)).contains(x10, y3)) {
                    i11 = i10;
                    break;
                } else {
                    i10++;
                }
            }
            this.T = i11;
            return true;
        } else if (actionMasked == 1) {
            if (z10) {
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList2.size()) {
                        if (((RectF) arrayList2.get(i15)).contains(x10, y3)) {
                            break;
                        }
                        i15++;
                    } else {
                        i15 = -1;
                        break;
                    }
                }
                int i16 = this.T;
                if (i15 == i16) {
                    l(i16);
                }
            }
            if (this.T == -1 && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.T = -1;
            if (!z11 && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else {
            if (actionMasked == 3) {
                this.T = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public final void p() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List o10 = o();
        while (true) {
            arrayList = this.D;
            if (arrayList.size() >= o10.size()) {
                break;
            }
            i5 i5Var = new i5(this, this.f3013n);
            if (this.O) {
                i5Var.f3099a.P();
                i5Var.f3100b.P();
                i5Var.a();
            }
            arrayList.add(i5Var);
        }
        while (arrayList.size() > o10.size()) {
            i5 i5Var2 = (i5) i0.a.v(1, arrayList);
            i5Var2.f3099a.R();
            i5Var2.f3100b.R();
            i5Var2.f3101c = null;
        }
        for (int i10 = 0; i10 < o10.size(); i10++) {
            i5 i5Var3 = (i5) arrayList.get(i10);
            i5Var3.e = (w) o10.get(i10);
            i5Var3.a();
        }
        while (true) {
            arrayList2 = this.E;
            if (arrayList2.size() >= o10.size()) {
                break;
            }
            ImageView g10 = g();
            g10.setImageResource(2131231575);
            g10.setOnClickListener(new b5(this, 0));
            addView(g10, w7.b6.e(32, 32, 51));
            arrayList2.add(g10);
        }
        this.f3017x.bringToFront();
        this.f3018y.bringToFront();
        while (arrayList2.size() > o10.size()) {
            View view = (ImageView) i0.a.v(1, arrayList2);
            removeView(view);
            this.K.remove(view);
            this.L.remove(view);
        }
        if (this.M != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                w wVar = ((i5) arrayList.get(i11)).e;
                if (wVar != null && wVar.f3426n) {
                    return;
                }
            }
            this.M.b(this);
            this.M = null;
        }
    }

    public final void q(boolean z10) {
        boolean z11;
        int i10;
        int i11 = 0;
        if (this.D.size() >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i11 = 8;
        }
        ImageView imageView = this.f3018y;
        imageView.setVisibility(i11);
        if (z11) {
            if (m()) {
                i10 = 2131231576;
            } else {
                i10 = 2131231573;
            }
            if (i10 == this.V) {
                return;
            }
            this.V = i10;
            if (z10) {
                org.telegram.messenger.i0.Q3(imageView, i10);
            } else {
                imageView.setImageResource(i10);
            }
        }
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.f21249ue;
        org.telegram.ui.ActionBar.p6 p6Var = this.f3013n;
        this.f3014r.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f3015s.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21028ig, p6Var));
        n0 n0Var = this.f3016w;
        if (n0Var != null) {
            n0Var.a();
        }
    }
}
