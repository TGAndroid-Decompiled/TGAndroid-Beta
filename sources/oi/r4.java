package oi;

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
import c8.fa;
import c8.na;
import c8.sa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.cz;
import org.telegram.messenger.hc;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.nr;
public final class r4 extends x implements org.telegram.ui.ActionBar.b6, i9, i0 {
    public static Paint f22318n0;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public final boolean I;
    public final ui.f J;
    public final w7.s K;
    public final ArrayList L;
    public final HashMap M;
    public xh.e N;
    public l3 O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final org.telegram.ui.Components.d6 V;
    public int W;
    public int f22319a0;
    public float f22320b0;
    public boolean f22321c0;
    public float f22322d0;
    public float f22323e0;
    public int f22324f0;
    public int f22325g0;
    public int f22326h0;
    public VelocityTracker f22327i0;
    public ValueAnimator f22328j0;
    public final ArrayList f22329k0;
    public int f22330l0;
    public final Path m0;
    public final h6 f22331n;
    public final Paint f22332r;
    public final Paint f22333s;
    public final h0 f22334w;
    public final ImageView f22335x;
    public final ImageView f22336y;

    public r4(Context context, h6 h6Var) {
        super(context);
        boolean z10;
        this.f22332r = new Paint(1);
        this.f22333s = new Paint(1);
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && cz.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I = z10;
        this.L = new ArrayList();
        this.M = new HashMap();
        this.U = -1;
        this.V = new org.telegram.ui.Components.d6(this, 0L, 320L, nr.h);
        this.f22329k0 = new ArrayList();
        this.f22330l0 = t6.f30035b;
        this.m0 = new Path();
        this.f22331n = h6Var;
        setWillNotDraw(false);
        f(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(4.0f));
        h0 h0Var = new h0(context, h6Var, new h9.g1(this, 20));
        this.f22334w = h0Var;
        addView(h0Var.f22106a, na.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i7 >= 31) {
            ui.f fVar = new ui.f(new ui.c());
            this.J = fVar;
            fVar.k(org.telegram.messenger.g0.L(24.0f));
            this.K = new w7.s(16);
        }
        ImageView g10 = g();
        this.f22335x = g10;
        g10.setImageResource(2131231572);
        addView(g10, na.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g10.setOnClickListener(new o4(this, 1));
        ImageView g11 = g();
        this.f22336y = g11;
        g11.setVisibility(8);
        addView(g11, na.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        g11.setOnClickListener(new o4(this, 2));
        updateColors();
    }

    private xh.e getSpoilerEffect() {
        if (!this.P) {
            return null;
        }
        xh.e eVar = this.N;
        if (eVar != null && eVar.f60552i) {
            this.N = null;
        }
        if (this.N == null) {
            this.N = xh.e.e(this);
        }
        return this.N;
    }

    private void settle(float f10) {
        int i7;
        int i10;
        int size = this.E.size();
        if (f10 >= 0.0f || this.f22319a0 >= size - 1) {
            i7 = -1;
            if (f10 <= 0.0f || this.f22319a0 <= 0) {
                float f11 = this.f22320b0;
                if (f11 <= 0.5f || this.f22319a0 >= size - 1) {
                    if (f11 >= -0.5f || this.f22319a0 <= 0) {
                        i7 = 0;
                    }
                }
            }
            int i11 = i7 + this.f22319a0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22320b0, i11 - i10);
            this.f22328j0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f22328j0.setInterpolator(nr.h);
            this.f22328j0.addUpdateListener(new hi.j3(this, 9));
            this.f22328j0.addListener(new ki.e2(this, i11, 2));
            this.f22328j0.start();
        }
        i7 = 1;
        int i112 = i7 + this.f22319a0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f22320b0, i112 - i10);
        this.f22328j0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f22328j0.setInterpolator(nr.h);
        this.f22328j0.addUpdateListener(new hi.j3(this, 9));
        this.f22328j0.addListener(new ki.e2(this, i112, 2));
        this.f22328j0.start();
    }

    @Override
    public final boolean a(int i7, int i10) {
        return this.f22334w.f(i7, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f29727xe));
        hashSet.add(Integer.valueOf(m6.f29503lg));
    }

    @Override
    public final void b() {
        this.f22334w.i();
    }

    @Override
    public final int d() {
        return org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f22329k0;
        h6 h6Var = this.f22331n;
        int i7 = this.f22330l0;
        int i10 = t6.f30035b;
        if (i7 != i10) {
            this.f22330l0 = i10;
            try {
                int w02 = m6.w0(m6.f29347d6, h6Var);
                if (getBackground() instanceof x1) {
                    ((x1) getBackground()).a(w02);
                }
                int w10 = m6.w(w02, m6.w0(m6.f29439i6, h6Var));
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
        this.f22334w.c(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int size;
        if (this.F.contains(view)) {
            a aVar = this.f22468a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f21908k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.m0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.Q, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
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
        if (this.I && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ui.f fVar = this.J;
            fh.g gVar = new fh.g(fVar, fVar, fVar);
            gVar.p(this.K);
            gVar.r(org.telegram.messenger.g0.L(16.0f));
            this.M.put(imageView, gVar);
        } else {
            int i7 = m6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            h6 h6Var = this.f22331n;
            t6.s(imageView, i7, h6Var, mode);
            int i10 = m6.f29347d6;
            org.telegram.ui.Cells.y b02 = m6.b0(m6.w0(i10, h6Var), m6.w(m6.w0(i10, h6Var), m6.w0(m6.f29439i6, h6Var)), 20, 20);
            this.f22329k0.add(b02);
            imageView.setBackground(new z1(b02));
        }
        sa.a(imageView);
        this.L.add(imageView);
        return imageView;
    }

    @Override
    public e1 getCaptionEditText() {
        return this.f22334w.f22106a;
    }

    @Override
    public a getRow() {
        return this.f22468a;
    }

    public final void h(Canvas canvas, ImageView imageView) {
        fh.g gVar;
        if (imageView.getVisibility() != 0 || (gVar = (fh.g) this.M.get(imageView)) == null) {
            return;
        }
        gVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        gVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
        fh.e eVar = gVar.f11662g0;
        if (eVar != null) {
            eVar.h = true;
        }
        gVar.draw(canvas);
    }

    public final void j(Canvas canvas) {
        int size;
        boolean z10;
        int size2;
        int i7;
        char c10;
        int i10;
        ArrayList arrayList;
        hc hcVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        r4 r4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = r4Var.getPaddingTop();
        int paddingLeft = r4Var.getPaddingLeft();
        int i16 = 0;
        int max = Math.max(0, (r4Var.getWidth() - paddingLeft) - r4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = r4Var.f22468a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f21908k.size();
        }
        if (size > 0) {
            Path path = r4Var.m0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, r4Var.Q + paddingTop, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, r4Var.Q + paddingTop);
        }
        boolean m10 = r4Var.m();
        char c11 = 2;
        int i17 = 1;
        ArrayList arrayList2 = r4Var.E;
        if (m10 && arrayList2.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        a aVar2 = r4Var.f22468a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f21908k.size();
        }
        if (size2 > 0) {
            i7 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i7 = 0;
        }
        Paint paint = r4Var.f22332r;
        if (z10 && (((i15 = r4Var.f22319a0) == 0 && r4Var.f22320b0 < 0.0f) || (i15 == arrayList2.size() - 1 && r4Var.f22320b0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, r4Var.Q + paddingTop, paint);
        }
        int size3 = arrayList2.size();
        hc hcVar2 = null;
        ArrayList arrayList3 = r4Var.H;
        if (size3 == 1 && arrayList3.size() == 1) {
            RectF rectF = (RectF) arrayList3.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, paddingTop, max, paddingTop + r4Var.Q);
                u4 u4Var = (u4) arrayList2.get(0);
                ImageReceiver imageReceiver = u4Var.f22420b;
                if (u4Var.b()) {
                    imageReceiver.A0(rectF2);
                    imageReceiver.setAlpha(u4Var.f22419a.f22636i1);
                    imageReceiver.h(canvas2, null);
                }
            }
        }
        int i18 = 0;
        while (i18 < arrayList2.size() && i18 < arrayList3.size()) {
            u4 u4Var2 = (u4) arrayList2.get(i18);
            RectF rectF3 = (RectF) arrayList3.get(i18);
            if (z10) {
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
                u4Var2.f22419a.K0(i11, i12, i13, i14);
                u4Var2.f22420b.K0(i11, i12, i13, i14);
            } else {
                c10 = c11;
                u4Var2.f22419a.K0(i16, i16, i16, i16);
                u4Var2.f22420b.K0(i16, i16, i16, i16);
            }
            boolean c12 = u4Var2.c();
            ImageReceiver imageReceiver2 = u4Var2.f22419a;
            if (!c12) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.y0(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (u4Var2.c()) {
                imageReceiver2.h(canvas2, hcVar2);
            }
            RadialProgress2 radialProgress2 = u4Var2.d;
            r rVar = u4Var2.f22422e;
            if (rVar != null && rVar.a()) {
                int L = org.telegram.messenger.g0.L(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i19 = L / 2;
                radialProgress2.r(round - i19, round2 - i19, round + i19, round2 + i19);
                i10 = 1;
                radialProgress2.p(true, u4Var2.f22422e.f22293f);
                radialProgress2.draw(canvas2);
            } else {
                i10 = 1;
            }
            r rVar2 = u4Var2.f22422e;
            if (rVar2 != null && rVar2.f22300n && u4Var2.c()) {
                xh.e spoilerEffect = r4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = u4Var2.f22420b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (u4Var2.b()) {
                    imageReceiver3.A0(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.f22636i1);
                    hcVar = null;
                    imageReceiver3.h(canvas2, null);
                } else {
                    hcVar = null;
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    arrayList = arrayList3;
                    spoilerEffect.c(canvas2, r4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.f22636i1, false);
                } else {
                    arrayList = arrayList3;
                }
                canvas.restore();
            } else {
                arrayList = arrayList3;
                hcVar = null;
            }
            i18++;
            r4Var = this;
            canvas2 = canvas;
            arrayList3 = arrayList;
            i17 = i10;
            hcVar2 = hcVar;
            c11 = c10;
            i16 = 0;
        }
        canvas.restore();
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.f22334w.e(arrayList);
    }

    public final void l(int i7) {
        if (this.O != null && this.f22468a != null) {
            List n10 = n();
            if (!n10.isEmpty() && (n10.size() != 1 || ((r) n10.get(0)).f22289a != 0)) {
                if (i7 >= 0 && i7 < n10.size() && ((r) n10.get(i7)).a()) {
                    s3.R1(this.f22468a, (r) n10.get(i7), this.O.f22176a);
                    return;
                }
                return;
            }
            l3 l3Var = this.O;
            a aVar = this.f22468a;
            s3 s3Var = l3Var.f22176a;
            s3Var.f22358j4 = aVar;
            s3Var.f22365p3.D(0);
        }
    }

    public final boolean m() {
        a aVar = this.f22468a;
        if (aVar != null && (aVar.f21901b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List n() {
        a aVar = this.f22468a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21901b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        r rVar = aVar.f21905g;
        if (rVar != null) {
            return Collections.singletonList(rVar);
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i7 < arrayList.size()) {
                u4 u4Var = (u4) arrayList.get(i7);
                u4Var.f22419a.P();
                u4Var.f22420b.P();
                u4Var.a();
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
        this.P = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.f22327i0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f22327i0 = null;
        }
        this.f22321c0 = false;
        while (true) {
            ArrayList arrayList = this.E;
            if (i7 >= arrayList.size()) {
                break;
            }
            u4 u4Var = (u4) arrayList.get(i7);
            u4Var.f22419a.R();
            u4Var.f22420b.R();
            u4Var.f22421c = null;
            i7++;
        }
        xh.e eVar = this.N;
        if (eVar != null) {
            eVar.b(this);
            this.N = null;
        }
        ValueAnimator valueAnimator = this.f22328j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f22328j0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ui.f fVar;
        ImageView imageView;
        ImageView imageView2;
        j9 textSelectionHelper;
        float f10;
        float f11;
        int L;
        float f12;
        float L2;
        int paddingTop = getPaddingTop();
        j(canvas);
        org.telegram.ui.Components.d6 d6Var = this.V;
        float f13 = d6Var.f34349c;
        ArrayList arrayList = this.E;
        if (arrayList.size() >= 2 && f13 > 0.001f) {
            if (f22318n0 == null) {
                Paint paint = new Paint(1);
                f22318n0 = paint;
                paint.setColor(-1);
                f22318n0.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.N(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float L3 = org.telegram.messenger.g0.L(5.0f) + ((getPaddingTop() + this.Q) - org.telegram.messenger.g0.L(23.0f));
            int L4 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.f3.D(6.0f, size - 1, org.telegram.messenger.g0.L(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f14 = this.f22319a0 + this.f22320b0;
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
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.Q) - org.telegram.messenger.g0.L(f11), max + paddingLeft, getPaddingTop() + this.Q);
            for (int i7 = 0; i7 < size; i7++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i7 - f14));
                f22318n0.setAlpha((int) com.google.android.gms.internal.vision.e2.B(max2, 95.0f, 160.0f, f13));
                canvas.drawCircle(org.telegram.messenger.g0.L(f12) + L2 + (org.telegram.messenger.g0.L(f10) * i7), L3, (org.telegram.messenger.g0.L(1.0f) * max2) + org.telegram.messenger.g0.L(2.0f), f22318n0);
            }
            canvas.restore();
        }
        l3 l3Var = this.O;
        if (l3Var != null && (textSelectionHelper = l3Var.f22176a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f30889p0 && R <= textSelectionHelper.f30892s0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.Q, this.f22333s);
            }
        }
        if (this.I && (fVar = this.J) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !fVar.f59017r) {
                    try {
                        j(fVar.h(width, height));
                    } finally {
                        fVar.i();
                    }
                }
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.L;
                    int size2 = arrayList2.size();
                    imageView = this.f22336y;
                    imageView2 = this.f22335x;
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
        if (d6Var.f34353i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int left;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i11 - i7;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        int i15 = i14 - paddingRight;
        if (fa.b(this.f22468a) > 0) {
            i13 = org.telegram.messenger.g0.L(16.0f);
        } else {
            i13 = 0;
        }
        this.f22334w.g(paddingLeft - i13, paddingRight - i13, i14, getPaddingTop() + this.Q);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i16 = i15 - L;
        ImageView imageView = this.f22335x;
        imageView.layout(i16 - imageView.getMeasuredWidth(), getPaddingTop() + L, i16, imageView.getMeasuredHeight() + getPaddingTop() + L);
        int i17 = i16 - L;
        ImageView imageView2 = this.f22336y;
        imageView2.layout((i17 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + L, i17 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + L);
        List n10 = n();
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i18 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i18);
                int i19 = 8;
                if (i18 < n10.size() && ((r) n10.get(i18)).f22289a != 0) {
                    ArrayList arrayList2 = this.H;
                    if (i18 < arrayList2.size()) {
                        RectF rectF = (RectF) arrayList2.get(i18);
                        if (rectF.right > 0.0f && rectF.left < max && rectF.bottom > getPaddingTop() && rectF.top < getPaddingTop() + this.Q) {
                            int i20 = ((int) rectF.left) + L + paddingLeft;
                            int i21 = ((int) rectF.top) + L;
                            imageView3.layout(i20, i21, imageView3.getMeasuredWidth() + i20, imageView3.getMeasuredHeight() + i21);
                            float f10 = 1.0f;
                            if (this.I) {
                                if (imageView2.getVisibility() == 0) {
                                    left = imageView2.getLeft();
                                } else {
                                    left = imageView.getLeft();
                                }
                                int L2 = left - org.telegram.messenger.g0.L(4.0f);
                                if (imageView3.getMeasuredWidth() + i20 > L2) {
                                    f10 = org.telegram.ui.Cells.c0.B(measuredWidth - L2, imageView3.getMeasuredWidth(), 1.0f, 0.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: oi.r4.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i7 = 0;
        if (y10 >= getPaddingTop() && y10 < getPaddingTop() + this.Q) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = -1;
        if (m() && !this.V.f34353i) {
            ArrayList arrayList = this.E;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f22324f0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f22324f0 = viewConfiguration.getScaledTouchSlop();
                        this.f22325g0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f22326h0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.f22322d0 = x10;
                    this.f22323e0 = y10;
                    this.f22321c0 = false;
                    VelocityTracker velocityTracker2 = this.f22327i0;
                    if (velocityTracker2 == null) {
                        this.f22327i0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f22327i0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f22328j0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f22328j0 = null;
                    }
                    this.U = this.f22319a0;
                    return true;
                }
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f22327i0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f11 = x10 - this.f22322d0;
                    float f12 = y10 - this.f22323e0;
                    if (!this.f22321c0 && Math.abs(f11) > this.f22324f0 && Math.abs(f11) > Math.abs(f12)) {
                        this.f22321c0 = true;
                        this.U = -1;
                    }
                    if (this.f22321c0) {
                        float f13 = (-f11) / this.S;
                        int i11 = this.f22319a0;
                        if (i11 == 0 && f13 < 0.0f) {
                            f13 *= 0.3f;
                        }
                        if (i11 == arrayList.size() - 1 && f13 > 0.0f) {
                            f13 *= 0.3f;
                        }
                        this.f22320b0 = f13;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f22327i0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f22327i0.computeCurrentVelocity(1000, this.f22326h0);
                        float xVelocity = this.f22327i0.getXVelocity();
                        float yVelocity = this.f22327i0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f22325g0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f10 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f22327i0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f22327i0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.f22321c0) {
                        this.f22321c0 = false;
                        settle(f10);
                    } else if (actionMasked == 1) {
                        int i12 = this.U;
                        int i13 = this.f22319a0;
                        if (i12 == i13) {
                            l(i13);
                        }
                    }
                    this.U = -1;
                    return true;
                }
                return true;
            }
        }
        ArrayList arrayList2 = this.H;
        if (actionMasked == 0) {
            if (!z10) {
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
            this.U = i10;
            return true;
        } else if (actionMasked == 1) {
            if (z10) {
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
                int i15 = this.U;
                if (i14 == i15) {
                    l(i15);
                }
            }
            if (this.U == -1 && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.U = -1;
            if (!z11 && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else {
            if (actionMasked == 3) {
                this.U = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public final void p() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List n10 = n();
        while (true) {
            arrayList = this.E;
            if (arrayList.size() >= n10.size()) {
                break;
            }
            u4 u4Var = new u4(this, this.f22331n);
            if (this.P) {
                u4Var.f22419a.P();
                u4Var.f22420b.P();
                u4Var.a();
            }
            arrayList.add(u4Var);
        }
        while (arrayList.size() > n10.size()) {
            u4 u4Var2 = (u4) p5.c.g(1, arrayList);
            u4Var2.f22419a.R();
            u4Var2.f22420b.R();
            u4Var2.f22421c = null;
        }
        for (int i7 = 0; i7 < n10.size(); i7++) {
            u4 u4Var3 = (u4) arrayList.get(i7);
            u4Var3.f22422e = (r) n10.get(i7);
            u4Var3.a();
        }
        while (true) {
            arrayList2 = this.F;
            if (arrayList2.size() >= n10.size()) {
                break;
            }
            ImageView g10 = g();
            g10.setImageResource(2131231575);
            g10.setOnClickListener(new o4(this, 0));
            addView(g10, na.e(32, 32, 51));
            arrayList2.add(g10);
        }
        this.f22335x.bringToFront();
        this.f22336y.bringToFront();
        while (arrayList2.size() > n10.size()) {
            View view = (ImageView) p5.c.g(1, arrayList2);
            removeView(view);
            this.L.remove(view);
            this.M.remove(view);
        }
        if (this.N != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                r rVar = ((u4) arrayList.get(i10)).f22422e;
                if (rVar != null && rVar.f22300n) {
                    return;
                }
            }
            this.N.b(this);
            this.N = null;
        }
    }

    public final void q(boolean z10) {
        boolean z11;
        int i7;
        int i10 = 0;
        if (this.E.size() >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i10 = 8;
        }
        ImageView imageView = this.f22336y;
        imageView.setVisibility(i10);
        if (z11) {
            if (m()) {
                i7 = 2131231576;
            } else {
                i7 = 2131231573;
            }
            if (i7 == this.W) {
                return;
            }
            this.W = i7;
            if (z10) {
                org.telegram.messenger.g0.P3(imageView, i7);
            } else {
                imageView.setImageResource(i7);
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = m6.f29727xe;
        h6 h6Var = this.f22331n;
        this.f22332r.setColor(m6.w0(i7, h6Var));
        this.f22333s.setColor(m6.w0(m6.f29503lg, h6Var));
        h0 h0Var = this.f22334w;
        if (h0Var != null) {
            h0Var.a();
        }
    }
}
