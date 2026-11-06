package li;

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
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ic;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.xq;
public final class s4 extends y implements org.telegram.ui.ActionBar.a6, h9, k0 {
    public static Paint m0;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final boolean H;
    public final ri.f I;
    public final sa.d J;
    public final ArrayList K;
    public final HashMap L;
    public xh.e M;
    public m3 N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final org.telegram.ui.Components.w5 U;
    public int V;
    public int W;
    public float f18838a0;
    public boolean f18839b0;
    public float f18840c0;
    public float f18841d0;
    public int f18842e0;
    public int f18843f0;
    public int f18844g0;
    public VelocityTracker f18845h0;
    public ValueAnimator f18846i0;
    public final ArrayList f18847j0;
    public int f18848k0;
    public final Path f18849l0;
    public final f6 f18850n;
    public final Paint f18851r;
    public final Paint f18852s;
    public final j0 f18853w;
    public final ImageView f18854x;
    public final ImageView f18855y;

    public s4(Context context, f6 f6Var) {
        super(context);
        boolean z9;
        this.f18851r = new Paint(1);
        this.f18852s = new Paint(1);
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && iz.f()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.H = z9;
        this.K = new ArrayList();
        this.L = new HashMap();
        this.T = -1;
        this.U = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.h);
        this.f18847j0 = new ArrayList();
        this.f18848k0 = r6.f28476b;
        this.f18849l0 = new Path();
        this.f18850n = f6Var;
        setWillNotDraw(false);
        f(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(4.0f));
        j0 j0Var = new j0(context, f6Var, new gf.g(this, 14));
        this.f18853w = j0Var;
        addView(j0Var.f18648a, ha.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z9 && i7 >= 31) {
            ri.f fVar = new ri.f(new ri.c());
            this.I = fVar;
            fVar.l(org.telegram.messenger.g0.L(24.0f));
            this.J = new sa.d(13);
        }
        ImageView g10 = g();
        this.f18854x = g10;
        g10.setImageResource(2131231571);
        addView(g10, ha.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g10.setOnClickListener(new p4(this, 1));
        ImageView g11 = g();
        this.f18855y = g11;
        g11.setVisibility(8);
        addView(g11, ha.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        g11.setOnClickListener(new p4(this, 2));
        updateColors();
    }

    private xh.e getSpoilerEffect() {
        if (!this.O) {
            return null;
        }
        xh.e eVar = this.M;
        if (eVar != null && eVar.f58689i) {
            this.M = null;
        }
        if (this.M == null) {
            this.M = xh.e.e(this);
        }
        return this.M;
    }

    private void settle(float f10) {
        int i7;
        int i10;
        int size = this.D.size();
        if (f10 >= 0.0f || this.W >= size - 1) {
            i7 = -1;
            if (f10 <= 0.0f || this.W <= 0) {
                float f11 = this.f18838a0;
                if (f11 <= 0.5f || this.W >= size - 1) {
                    if (f11 >= -0.5f || this.W <= 0) {
                        i7 = 0;
                    }
                }
            }
            int i11 = i7 + this.W;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f18838a0, i11 - i10);
            this.f18846i0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f18846i0.setInterpolator(xq.h);
            this.f18846i0.addUpdateListener(new fi.v3(this, 8));
            this.f18846i0.addListener(new hi.m2(this, i11, 2));
            this.f18846i0.start();
        }
        i7 = 1;
        int i112 = i7 + this.W;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f18838a0, i112 - i10);
        this.f18846i0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f18846i0.setInterpolator(xq.h);
        this.f18846i0.addUpdateListener(new fi.v3(this, 8));
        this.f18846i0.addListener(new hi.m2(this, i112, 2));
        this.f18846i0.start();
    }

    @Override
    public final boolean a(int i7, int i10) {
        return this.f18853w.f(i7, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f28173ue));
        hashSet.add(Integer.valueOf(k6.f27949ig));
    }

    @Override
    public final void b() {
        this.f18853w.i();
    }

    @Override
    public final int d() {
        return org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f18847j0;
        f6 f6Var = this.f18850n;
        int i7 = this.f18848k0;
        int i10 = r6.f28476b;
        if (i7 != i10) {
            this.f18848k0 = i10;
            try {
                int w02 = k6.w0(k6.f27849d6, f6Var);
                if (getBackground() instanceof y1) {
                    ((y1) getBackground()).a(w02);
                }
                int w10 = k6.w(w02, k6.w0(k6.f27941i6, f6Var));
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Drawable drawable = (Drawable) arrayList.get(i11);
                    if (drawable instanceof RippleDrawable) {
                        RippleDrawable rippleDrawable = (RippleDrawable) drawable;
                        if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                            ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                            if (shapeDrawable.getPaint().getColor() != w02) {
                                shapeDrawable.getPaint().setColor(w02);
                                rippleDrawable.setColor(ColorStateList.valueOf(w10));
                                rippleDrawable.invalidateSelf();
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        super.dispatchDraw(canvas);
        this.f18853w.c(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int size;
        if (this.E.contains(view)) {
            a aVar = this.f18986a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f18396k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.f18849l0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.P, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final ImageView g() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.H && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ri.f fVar = this.I;
            fh.g gVar = new fh.g(fVar, fVar, fVar);
            gVar.p(this.J);
            gVar.r(org.telegram.messenger.g0.L(16.0f));
            this.L.put(imageView, gVar);
        } else {
            int i7 = k6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            f6 f6Var = this.f18850n;
            r6.t(imageView, i7, f6Var, mode);
            int i10 = k6.f27849d6;
            org.telegram.ui.Cells.y b02 = k6.b0(k6.w0(i10, f6Var), k6.w(k6.w0(i10, f6Var), k6.w0(k6.f27941i6, f6Var)), 20, 20);
            this.f18847j0.add(b02);
            imageView.setBackground(new a2(b02));
        }
        ka.a(imageView);
        this.K.add(imageView);
        return imageView;
    }

    @Override
    public g1 getCaptionEditText() {
        return this.f18853w.f18648a;
    }

    @Override
    public a getRow() {
        return this.f18986a;
    }

    public final void h(Canvas canvas, ImageView imageView) {
        fh.g gVar;
        if (imageView.getVisibility() != 0 || (gVar = (fh.g) this.L.get(imageView)) == null) {
            return;
        }
        gVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        gVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
        fh.e eVar = gVar.f11535f0;
        if (eVar != null) {
            eVar.h = true;
        }
        gVar.draw(canvas);
    }

    public final void j(Canvas canvas) {
        int size;
        boolean z9;
        int size2;
        int i7;
        char c10;
        int i10;
        ArrayList arrayList;
        ic icVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        s4 s4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = s4Var.getPaddingTop();
        int paddingLeft = s4Var.getPaddingLeft();
        int i16 = 0;
        int max = Math.max(0, (s4Var.getWidth() - paddingLeft) - s4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = s4Var.f18986a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f18396k.size();
        }
        if (size > 0) {
            Path path = s4Var.f18849l0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, s4Var.P + paddingTop, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, s4Var.P + paddingTop);
        }
        boolean m10 = s4Var.m();
        char c11 = 2;
        int i17 = 1;
        ArrayList arrayList2 = s4Var.D;
        if (m10 && arrayList2.size() >= 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        a aVar2 = s4Var.f18986a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f18396k.size();
        }
        if (size2 > 0) {
            i7 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i7 = 0;
        }
        Paint paint = s4Var.f18851r;
        if (z9 && (((i15 = s4Var.W) == 0 && s4Var.f18838a0 < 0.0f) || (i15 == arrayList2.size() - 1 && s4Var.f18838a0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, s4Var.P + paddingTop, paint);
        }
        int size3 = arrayList2.size();
        ic icVar2 = null;
        ArrayList arrayList3 = s4Var.G;
        if (size3 == 1 && arrayList3.size() == 1) {
            RectF rectF = (RectF) arrayList3.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, paddingTop, max, paddingTop + s4Var.P);
                v4 v4Var = (v4) arrayList2.get(0);
                ImageReceiver imageReceiver = v4Var.f18942b;
                if (v4Var.b()) {
                    imageReceiver.A0(rectF2);
                    imageReceiver.setAlpha(v4Var.f18941a.f21194h1);
                    imageReceiver.h(canvas2, null);
                }
            }
        }
        int i18 = 0;
        while (i18 < arrayList2.size() && i18 < arrayList3.size()) {
            v4 v4Var2 = (v4) arrayList2.get(i18);
            RectF rectF3 = (RectF) arrayList3.get(i18);
            if (z9) {
                if (i18 == 0) {
                    i11 = i7;
                } else {
                    i11 = i16;
                }
                if (i18 == arrayList2.size() - i17) {
                    i12 = i7;
                } else {
                    i12 = i16;
                }
                if (i18 == arrayList2.size() - i17) {
                    i13 = i7;
                } else {
                    i13 = i16;
                }
                c10 = c11;
                if (i18 == 0) {
                    i14 = i7;
                } else {
                    i14 = i16;
                }
                v4Var2.f18941a.K0(i11, i12, i13, i14);
                v4Var2.f18942b.K0(i11, i12, i13, i14);
            } else {
                c10 = c11;
                v4Var2.f18941a.K0(i16, i16, i16, i16);
                v4Var2.f18942b.K0(i16, i16, i16, i16);
            }
            boolean c12 = v4Var2.c();
            ImageReceiver imageReceiver2 = v4Var2.f18941a;
            if (!c12) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.y0(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (v4Var2.c()) {
                imageReceiver2.h(canvas2, icVar2);
            }
            RadialProgress2 radialProgress2 = v4Var2.d;
            s sVar = v4Var2.f18944e;
            if (sVar != null && sVar.a()) {
                int L = org.telegram.messenger.g0.L(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i19 = L / 2;
                radialProgress2.r(round - i19, round2 - i19, round + i19, round2 + i19);
                i10 = 1;
                radialProgress2.p(true, v4Var2.f18944e.f18815f);
                radialProgress2.draw(canvas2);
            } else {
                i10 = 1;
            }
            s sVar2 = v4Var2.f18944e;
            if (sVar2 != null && sVar2.f18822n && v4Var2.c()) {
                xh.e spoilerEffect = s4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = v4Var2.f18942b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (v4Var2.b()) {
                    imageReceiver3.A0(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.f21194h1);
                    icVar = null;
                    imageReceiver3.h(canvas2, null);
                } else {
                    icVar = null;
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    arrayList = arrayList3;
                    spoilerEffect.c(canvas2, s4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.f21194h1, false);
                } else {
                    arrayList = arrayList3;
                }
                canvas.restore();
            } else {
                arrayList = arrayList3;
                icVar = null;
            }
            i18++;
            s4Var = this;
            canvas2 = canvas;
            arrayList3 = arrayList;
            i17 = i10;
            icVar2 = icVar;
            c11 = c10;
            i16 = 0;
        }
        canvas.restore();
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.f18853w.e(arrayList);
    }

    public final void l(int i7) {
        if (this.N != null && this.f18986a != null) {
            List n10 = n();
            if (!n10.isEmpty() && (n10.size() != 1 || ((s) n10.get(0)).f18811a != 0)) {
                if (i7 >= 0 && i7 < n10.size() && ((s) n10.get(i7)).a()) {
                    t3.R1(this.f18986a, (s) n10.get(i7), this.N.f18698a);
                    return;
                }
                return;
            }
            m3 m3Var = this.N;
            a aVar = this.f18986a;
            t3 t3Var = m3Var.f18698a;
            t3Var.f18879i4 = aVar;
            t3Var.f18887o3.g(0);
        }
    }

    public final boolean m() {
        a aVar = this.f18986a;
        if (aVar != null && (aVar.f18389b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List n() {
        a aVar = this.f18986a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18389b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        s sVar = aVar.f18393g;
        if (sVar != null) {
            return Collections.singletonList(sVar);
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i7 < arrayList.size()) {
                v4 v4Var = (v4) arrayList.get(i7);
                v4Var.f18941a.P();
                v4Var.f18942b.P();
                v4Var.a();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.O = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.f18845h0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f18845h0 = null;
        }
        this.f18839b0 = false;
        while (true) {
            ArrayList arrayList = this.D;
            if (i7 >= arrayList.size()) {
                break;
            }
            v4 v4Var = (v4) arrayList.get(i7);
            v4Var.f18941a.R();
            v4Var.f18942b.R();
            v4Var.f18943c = null;
            i7++;
        }
        xh.e eVar = this.M;
        if (eVar != null) {
            eVar.b(this);
            this.M = null;
        }
        ValueAnimator valueAnimator = this.f18846i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f18846i0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ri.f fVar;
        ImageView imageView;
        ImageView imageView2;
        i9 textSelectionHelper;
        float f10;
        float f11;
        int L;
        float f12;
        float L2;
        int paddingTop = getPaddingTop();
        j(canvas);
        org.telegram.ui.Components.w5 w5Var = this.U;
        float f13 = w5Var.f39855c;
        ArrayList arrayList = this.D;
        if (arrayList.size() >= 2 && f13 > 0.001f) {
            if (m0 == null) {
                Paint paint = new Paint(1);
                m0 = paint;
                paint.setColor(-1);
                m0.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.N(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float L3 = org.telegram.messenger.g0.L(5.0f) + ((getPaddingTop() + this.P) - org.telegram.messenger.g0.L(23.0f));
            int L4 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(6.0f, size - 1, org.telegram.messenger.g0.L(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f14 = this.W + this.f18838a0;
            if (L4 < max) {
                f10 = 13.0f;
                L2 = ((max - L4) / 2.0f) + paddingLeft;
                f11 = 23.0f;
                f12 = 4.0f;
            } else {
                f10 = 13.0f;
                int L5 = org.telegram.messenger.g0.L(13.0f);
                f11 = 23.0f;
                f12 = 4.0f;
                L2 = (org.telegram.messenger.g0.L(4.0f) + paddingLeft) - (Utilities.i(f14 - (((max - org.telegram.messenger.g0.L(8.0f)) / 2) / L5), Math.max(0, (size - (L * 2)) - 1), 0.0f) * L5);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.P) - org.telegram.messenger.g0.L(f11), max + paddingLeft, getPaddingTop() + this.P);
            for (int i7 = 0; i7 < size; i7++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i7 - f14));
                m0.setAlpha((int) com.google.android.recaptcha.internal.a.B(max2, 95.0f, 160.0f, f13));
                canvas.drawCircle(org.telegram.messenger.g0.L(f12) + L2 + (org.telegram.messenger.g0.L(f10) * i7), L3, (org.telegram.messenger.g0.L(1.0f) * max2) + org.telegram.messenger.g0.L(2.0f), m0);
            }
            canvas.restore();
        }
        m3 m3Var = this.N;
        if (m3Var != null && (textSelectionHelper = m3Var.f18698a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f29314p0 && R <= textSelectionHelper.f29317s0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.P, this.f18852s);
            }
        }
        if (this.H && (fVar = this.I) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !fVar.f54482r) {
                    try {
                        j(fVar.i(width, height));
                    } finally {
                        fVar.j();
                    }
                }
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.K;
                    int size2 = arrayList2.size();
                    imageView = this.f18855y;
                    imageView2 = this.f18854x;
                    if (i10 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i10);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        h(canvas, imageView3);
                    }
                    i10++;
                }
                h(canvas, imageView);
                h(canvas, imageView2);
            }
        }
        if (w5Var.f39859i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int left;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i11 - i7;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        int i15 = i14 - paddingRight;
        if (c8.l1.b(this.f18986a) > 0) {
            i13 = org.telegram.messenger.g0.L(16.0f);
        } else {
            i13 = 0;
        }
        this.f18853w.g(paddingLeft - i13, paddingRight - i13, i14, getPaddingTop() + this.P);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i16 = i15 - L;
        ImageView imageView = this.f18854x;
        imageView.layout(i16 - imageView.getMeasuredWidth(), getPaddingTop() + L, i16, imageView.getMeasuredHeight() + getPaddingTop() + L);
        int i17 = i16 - L;
        ImageView imageView2 = this.f18855y;
        imageView2.layout((i17 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + L, i17 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + L);
        List n10 = n();
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i18 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i18);
                int i19 = 8;
                if (i18 < n10.size() && ((s) n10.get(i18)).f18811a != 0) {
                    ArrayList arrayList2 = this.G;
                    if (i18 < arrayList2.size()) {
                        RectF rectF = (RectF) arrayList2.get(i18);
                        if (rectF.right > 0.0f && rectF.left < max && rectF.bottom > getPaddingTop() && rectF.top < getPaddingTop() + this.P) {
                            int i20 = ((int) rectF.left) + L + paddingLeft;
                            int i21 = ((int) rectF.top) + L;
                            imageView3.layout(i20, i21, imageView3.getMeasuredWidth() + i20, imageView3.getMeasuredHeight() + i21);
                            float f10 = 1.0f;
                            if (this.H) {
                                if (imageView2.getVisibility() == 0) {
                                    left = imageView2.getLeft();
                                } else {
                                    left = imageView.getLeft();
                                }
                                int L2 = left - org.telegram.messenger.g0.L(4.0f);
                                if (imageView3.getMeasuredWidth() + i20 > L2) {
                                    f10 = org.telegram.ui.Cells.f1.v(measuredWidth - L2, imageView3.getMeasuredWidth(), 1.0f, 0.0f);
                                }
                            }
                            imageView3.setAlpha(f10);
                            if (f10 > 0.01f) {
                                i19 = 0;
                            }
                            imageView3.setVisibility(i19);
                        } else {
                            imageView3.setVisibility(8);
                        }
                        i18++;
                    }
                }
                imageView3.setVisibility(8);
                i18++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: li.s4.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i7 = 0;
        if (y10 >= getPaddingTop() && y10 < getPaddingTop() + this.P) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = -1;
        if (m() && !this.U.f39859i) {
            ArrayList arrayList = this.D;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z9) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f18842e0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f18842e0 = viewConfiguration.getScaledTouchSlop();
                        this.f18843f0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f18844g0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.f18840c0 = x10;
                    this.f18841d0 = y10;
                    this.f18839b0 = false;
                    VelocityTracker velocityTracker2 = this.f18845h0;
                    if (velocityTracker2 == null) {
                        this.f18845h0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f18845h0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f18846i0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f18846i0 = null;
                    }
                    this.T = this.W;
                    return true;
                }
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f18845h0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f11 = x10 - this.f18840c0;
                    float f12 = y10 - this.f18841d0;
                    if (!this.f18839b0 && Math.abs(f11) > this.f18842e0 && Math.abs(f11) > Math.abs(f12)) {
                        this.f18839b0 = true;
                        this.T = -1;
                    }
                    if (this.f18839b0) {
                        float f13 = (-f11) / this.R;
                        int i11 = this.W;
                        if (i11 == 0 && f13 < 0.0f) {
                            f13 *= 0.3f;
                        }
                        if (i11 == arrayList.size() - 1 && f13 > 0.0f) {
                            f13 *= 0.3f;
                        }
                        this.f18838a0 = f13;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f18845h0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f18845h0.computeCurrentVelocity(1000, this.f18844g0);
                        float xVelocity = this.f18845h0.getXVelocity();
                        float yVelocity = this.f18845h0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f18843f0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f10 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f18845h0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f18845h0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.f18839b0) {
                        this.f18839b0 = false;
                        settle(f10);
                    } else if (actionMasked == 1) {
                        int i12 = this.T;
                        int i13 = this.W;
                        if (i12 == i13) {
                            l(i13);
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
            if (!z9) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i7 >= arrayList2.size()) {
                    break;
                } else if (((RectF) arrayList2.get(i7)).contains(x10, y10)) {
                    i10 = i7;
                    break;
                } else {
                    i7++;
                }
            }
            this.T = i10;
            return true;
        } else if (actionMasked == 1) {
            if (z9) {
                int i14 = 0;
                while (true) {
                    if (i14 < arrayList2.size()) {
                        if (((RectF) arrayList2.get(i14)).contains(x10, y10)) {
                            break;
                        }
                        i14++;
                    } else {
                        i14 = -1;
                        break;
                    }
                }
                int i15 = this.T;
                if (i14 == i15) {
                    l(i15);
                }
            }
            if (this.T == -1 && !z9) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.T = -1;
            if (!z10 && !super.onTouchEvent(motionEvent)) {
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
        List n10 = n();
        while (true) {
            arrayList = this.D;
            if (arrayList.size() >= n10.size()) {
                break;
            }
            v4 v4Var = new v4(this, this.f18850n);
            if (this.O) {
                v4Var.f18941a.P();
                v4Var.f18942b.P();
                v4Var.a();
            }
            arrayList.add(v4Var);
        }
        while (arrayList.size() > n10.size()) {
            v4 v4Var2 = (v4) org.telegram.ui.Cells.f1.k(1, arrayList);
            v4Var2.f18941a.R();
            v4Var2.f18942b.R();
            v4Var2.f18943c = null;
        }
        for (int i7 = 0; i7 < n10.size(); i7++) {
            v4 v4Var3 = (v4) arrayList.get(i7);
            v4Var3.f18944e = (s) n10.get(i7);
            v4Var3.a();
        }
        while (true) {
            arrayList2 = this.E;
            if (arrayList2.size() >= n10.size()) {
                break;
            }
            ImageView g10 = g();
            g10.setImageResource(2131231574);
            g10.setOnClickListener(new p4(this, 0));
            addView(g10, ha.e(32, 32, 51));
            arrayList2.add(g10);
        }
        this.f18854x.bringToFront();
        this.f18855y.bringToFront();
        while (arrayList2.size() > n10.size()) {
            View view = (ImageView) org.telegram.ui.Cells.f1.k(1, arrayList2);
            removeView(view);
            this.K.remove(view);
            this.L.remove(view);
        }
        if (this.M != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                s sVar = ((v4) arrayList.get(i10)).f18944e;
                if (sVar != null && sVar.f18822n) {
                    return;
                }
            }
            this.M.b(this);
            this.M = null;
        }
    }

    public final void q(boolean z9) {
        boolean z10;
        int i7;
        int i10 = 0;
        if (this.D.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        ImageView imageView = this.f18855y;
        imageView.setVisibility(i10);
        if (z10) {
            if (m()) {
                i7 = 2131231575;
            } else {
                i7 = 2131231572;
            }
            if (i7 == this.V) {
                return;
            }
            this.V = i7;
            if (z9) {
                org.telegram.messenger.g0.R3(imageView, i7);
            } else {
                imageView.setImageResource(i7);
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = k6.f28173ue;
        f6 f6Var = this.f18850n;
        this.f18851r.setColor(k6.w0(i7, f6Var));
        this.f18852s.setColor(k6.w0(k6.f27949ig, f6Var));
        j0 j0Var = this.f18853w;
        if (j0Var != null) {
            j0Var.a();
        }
    }
}
