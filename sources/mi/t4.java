package mi;

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
import b8.mf;
import b8.ne;
import b8.pf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bc;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.xq;
public final class t4 extends y implements org.telegram.ui.ActionBar.z5, g9, l0 {
    public static Paint f19938n0;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public final boolean I;
    public final si.f J;
    public final nb.a K;
    public final ArrayList L;
    public final HashMap M;
    public yh.e N;
    public m3 O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final org.telegram.ui.Components.u5 V;
    public int W;
    public int f19939a0;
    public float f19940b0;
    public boolean f19941c0;
    public float f19942d0;
    public float f19943e0;
    public int f19944f0;
    public int f19945g0;
    public int f19946h0;
    public VelocityTracker f19947i0;
    public ValueAnimator f19948j0;
    public final ArrayList f19949k0;
    public int f19950l0;
    public final Path m0;
    public final org.telegram.ui.ActionBar.e6 f19951n;
    public final Paint f19952r;
    public final Paint f19953s;
    public final k0 f19954w;
    public final ImageView f19955x;
    public final ImageView f19956y;

    public t4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        this.f19952r = new Paint(1);
        this.f19953s = new Paint(1);
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 && az.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I = z10;
        this.L = new ArrayList();
        this.M = new HashMap();
        this.U = -1;
        this.V = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.h);
        this.f19949k0 = new ArrayList();
        this.f19950l0 = r6.f28515b;
        this.m0 = new Path();
        this.f19951n = e6Var;
        setWillNotDraw(false);
        f(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(4.0f));
        k0 k0Var = new k0(context, e6Var, new gi.w5(this, 17));
        this.f19954w = k0Var;
        addView(k0Var.f19716a, mf.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i3 >= 31) {
            si.f fVar = new si.f(new si.c());
            this.J = fVar;
            fVar.k(org.telegram.messenger.g0.L(24.0f));
            this.K = new nb.a(15);
        }
        ImageView g7 = g();
        this.f19955x = g7;
        g7.setImageResource(2131231571);
        addView(g7, mf.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g7.setOnClickListener(new q4(this, 1));
        ImageView g10 = g();
        this.f19956y = g10;
        g10.setVisibility(8);
        addView(g10, mf.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        g10.setOnClickListener(new q4(this, 2));
        updateColors();
    }

    private yh.e getSpoilerEffect() {
        if (!this.P) {
            return null;
        }
        yh.e eVar = this.N;
        if (eVar != null && eVar.f59502i) {
            this.N = null;
        }
        if (this.N == null) {
            this.N = yh.e.e(this);
        }
        return this.N;
    }

    private void settle(float f10) {
        int i3;
        int i10;
        int size = this.E.size();
        if (f10 >= 0.0f || this.f19939a0 >= size - 1) {
            i3 = -1;
            if (f10 <= 0.0f || this.f19939a0 <= 0) {
                float f11 = this.f19940b0;
                if (f11 <= 0.5f || this.f19939a0 >= size - 1) {
                    if (f11 >= -0.5f || this.f19939a0 <= 0) {
                        i3 = 0;
                    }
                }
            }
            int i11 = i3 + this.f19939a0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19940b0, i11 - i10);
            this.f19948j0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f19948j0.setInterpolator(xq.h);
            this.f19948j0.addUpdateListener(new gi.j3(this, 9));
            this.f19948j0.addListener(new ii.m2(this, i11, 2));
            this.f19948j0.start();
        }
        i3 = 1;
        int i112 = i3 + this.f19939a0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f19940b0, i112 - i10);
        this.f19948j0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f19948j0.setInterpolator(xq.h);
        this.f19948j0.addUpdateListener(new gi.j3(this, 9));
        this.f19948j0.addListener(new ii.m2(this, i112, 2));
        this.f19948j0.start();
    }

    @Override
    public final boolean a(int i3, int i10) {
        return this.f19954w.f(i3, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f28203ue));
        hashSet.add(Integer.valueOf(k6.ig));
    }

    @Override
    public final void b() {
        this.f19954w.i();
    }

    @Override
    public final int d() {
        return org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f19949k0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19951n;
        int i3 = this.f19950l0;
        int i10 = r6.f28515b;
        if (i3 != i10) {
            this.f19950l0 = i10;
            try {
                int w02 = k6.w0(k6.f27878d6, e6Var);
                if (getBackground() instanceof z1) {
                    ((z1) getBackground()).a(w02);
                }
                int w10 = k6.w(w02, k6.w0(k6.f27972i6, e6Var));
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
        this.f19954w.c(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int size;
        if (this.F.contains(view)) {
            a aVar = this.f20029a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f19438k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.m0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.Q, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
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
        if (this.I && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            si.f fVar = this.J;
            gh.g gVar = new gh.g(fVar, fVar, fVar);
            gVar.p(this.K);
            gVar.r(org.telegram.messenger.g0.L(16.0f));
            this.M.put(imageView, gVar);
        } else {
            int i3 = k6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.e6 e6Var = this.f19951n;
            r6.t(imageView, i3, e6Var, mode);
            int i10 = k6.f27878d6;
            org.telegram.ui.Cells.y b02 = k6.b0(k6.w0(i10, e6Var), k6.w(k6.w0(i10, e6Var), k6.w0(k6.f27972i6, e6Var)), 20, 20);
            this.f19949k0.add(b02);
            imageView.setBackground(new b2(b02));
        }
        pf.a(imageView);
        this.L.add(imageView);
        return imageView;
    }

    @Override
    public h1 getCaptionEditText() {
        return this.f19954w.f19716a;
    }

    @Override
    public a getRow() {
        return this.f20029a;
    }

    public final void h(Canvas canvas, ImageView imageView) {
        gh.g gVar;
        if (imageView.getVisibility() != 0 || (gVar = (gh.g) this.M.get(imageView)) == null) {
            return;
        }
        gVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        gVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
        gh.e eVar = gVar.f12330g0;
        if (eVar != null) {
            eVar.h = true;
        }
        gVar.draw(canvas);
    }

    public final void j(Canvas canvas) {
        int size;
        boolean z10;
        int size2;
        int i3;
        char c2;
        int i10;
        ArrayList arrayList;
        bc bcVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        t4 t4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = t4Var.getPaddingTop();
        int paddingLeft = t4Var.getPaddingLeft();
        int i16 = 0;
        int max = Math.max(0, (t4Var.getWidth() - paddingLeft) - t4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = t4Var.f20029a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f19438k.size();
        }
        if (size > 0) {
            Path path = t4Var.m0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, t4Var.Q + paddingTop, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, t4Var.Q + paddingTop);
        }
        boolean m10 = t4Var.m();
        char c10 = 2;
        int i17 = 1;
        ArrayList arrayList2 = t4Var.E;
        if (m10 && arrayList2.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        a aVar2 = t4Var.f20029a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f19438k.size();
        }
        if (size2 > 0) {
            i3 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i3 = 0;
        }
        Paint paint = t4Var.f19952r;
        if (z10 && (((i15 = t4Var.f19939a0) == 0 && t4Var.f19940b0 < 0.0f) || (i15 == arrayList2.size() - 1 && t4Var.f19940b0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, t4Var.Q + paddingTop, paint);
        }
        int size3 = arrayList2.size();
        bc bcVar2 = null;
        ArrayList arrayList3 = t4Var.H;
        if (size3 == 1 && arrayList3.size() == 1) {
            RectF rectF = (RectF) arrayList3.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, paddingTop, max, paddingTop + t4Var.Q);
                w4 w4Var = (w4) arrayList2.get(0);
                ImageReceiver imageReceiver = w4Var.f20007b;
                if (w4Var.b()) {
                    imageReceiver.A0(rectF2);
                    imageReceiver.setAlpha(w4Var.f20006a.f21249i1);
                    imageReceiver.h(canvas2, null);
                }
            }
        }
        int i18 = 0;
        while (i18 < arrayList2.size() && i18 < arrayList3.size()) {
            w4 w4Var2 = (w4) arrayList2.get(i18);
            RectF rectF3 = (RectF) arrayList3.get(i18);
            if (z10) {
                if (i18 == 0) {
                    i11 = i3;
                } else {
                    i11 = i16;
                }
                if (i18 == arrayList2.size() - i17) {
                    i12 = i3;
                } else {
                    i12 = i16;
                }
                if (i18 == arrayList2.size() - i17) {
                    i13 = i3;
                } else {
                    i13 = i16;
                }
                c2 = c10;
                if (i18 == 0) {
                    i14 = i3;
                } else {
                    i14 = i16;
                }
                w4Var2.f20006a.K0(i11, i12, i13, i14);
                w4Var2.f20007b.K0(i11, i12, i13, i14);
            } else {
                c2 = c10;
                w4Var2.f20006a.K0(i16, i16, i16, i16);
                w4Var2.f20007b.K0(i16, i16, i16, i16);
            }
            boolean c11 = w4Var2.c();
            ImageReceiver imageReceiver2 = w4Var2.f20006a;
            if (!c11) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.y0(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (w4Var2.c()) {
                imageReceiver2.h(canvas2, bcVar2);
            }
            RadialProgress2 radialProgress2 = w4Var2.d;
            s sVar = w4Var2.f20009e;
            if (sVar != null && sVar.a()) {
                int L = org.telegram.messenger.g0.L(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i19 = L / 2;
                radialProgress2.r(round - i19, round2 - i19, round + i19, round2 + i19);
                i10 = 1;
                radialProgress2.p(true, w4Var2.f20009e.f19863f);
                radialProgress2.draw(canvas2);
            } else {
                i10 = 1;
            }
            s sVar2 = w4Var2.f20009e;
            if (sVar2 != null && sVar2.f19870n && w4Var2.c()) {
                yh.e spoilerEffect = t4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = w4Var2.f20007b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (w4Var2.b()) {
                    imageReceiver3.A0(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.f21249i1);
                    bcVar = null;
                    imageReceiver3.h(canvas2, null);
                } else {
                    bcVar = null;
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    arrayList = arrayList3;
                    spoilerEffect.c(canvas2, t4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.f21249i1, false);
                } else {
                    arrayList = arrayList3;
                }
                canvas.restore();
            } else {
                arrayList = arrayList3;
                bcVar = null;
            }
            i18++;
            t4Var = this;
            canvas2 = canvas;
            arrayList3 = arrayList;
            i17 = i10;
            bcVar2 = bcVar;
            c10 = c2;
            i16 = 0;
        }
        canvas.restore();
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.f19954w.e(arrayList);
    }

    public final void l(int i3) {
        if (this.O != null && this.f20029a != null) {
            List n4 = n();
            if (!n4.isEmpty() && (n4.size() != 1 || ((s) n4.get(0)).f19859a != 0)) {
                if (i3 >= 0 && i3 < n4.size() && ((s) n4.get(i3)).a()) {
                    t3.R1(this.f20029a, (s) n4.get(i3), this.O.f19749a);
                    return;
                }
                return;
            }
            m3 m3Var = this.O;
            a aVar = this.f20029a;
            t3 t3Var = m3Var.f19749a;
            t3Var.f19909j4 = aVar;
            t3Var.f19916p3.O(0);
        }
    }

    public final boolean m() {
        a aVar = this.f20029a;
        if (aVar != null && (aVar.f19431b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List n() {
        a aVar = this.f20029a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        s sVar = aVar.f19435g;
        if (sVar != null) {
            return Collections.singletonList(sVar);
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i3 < arrayList.size()) {
                w4 w4Var = (w4) arrayList.get(i3);
                w4Var.f20006a.P();
                w4Var.f20007b.P();
                w4Var.a();
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        this.P = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.f19947i0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f19947i0 = null;
        }
        this.f19941c0 = false;
        while (true) {
            ArrayList arrayList = this.E;
            if (i3 >= arrayList.size()) {
                break;
            }
            w4 w4Var = (w4) arrayList.get(i3);
            w4Var.f20006a.R();
            w4Var.f20007b.R();
            w4Var.f20008c = null;
            i3++;
        }
        yh.e eVar = this.N;
        if (eVar != null) {
            eVar.b(this);
            this.N = null;
        }
        ValueAnimator valueAnimator = this.f19948j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f19948j0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        si.f fVar;
        ImageView imageView;
        ImageView imageView2;
        h9 textSelectionHelper;
        float f10;
        float f11;
        int L;
        float f12;
        float L2;
        int paddingTop = getPaddingTop();
        j(canvas);
        org.telegram.ui.Components.u5 u5Var = this.V;
        float f13 = u5Var.f38645c;
        ArrayList arrayList = this.E;
        if (arrayList.size() >= 2 && f13 > 0.001f) {
            if (f19938n0 == null) {
                Paint paint = new Paint(1);
                f19938n0 = paint;
                paint.setColor(-1);
                f19938n0.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.N(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float L3 = org.telegram.messenger.g0.L(5.0f) + ((getPaddingTop() + this.Q) - org.telegram.messenger.g0.L(23.0f));
            int L4 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(6.0f, size - 1, org.telegram.messenger.g0.L(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f14 = this.f19939a0 + this.f19940b0;
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
            for (int i3 = 0; i3 < size; i3++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i3 - f14));
                f19938n0.setAlpha((int) com.google.android.recaptcha.internal.a.A(max2, 95.0f, 160.0f, f13));
                canvas.drawCircle(org.telegram.messenger.g0.L(f12) + L2 + (org.telegram.messenger.g0.L(f10) * i3), L3, (org.telegram.messenger.g0.L(1.0f) * max2) + org.telegram.messenger.g0.L(2.0f), f19938n0);
            }
            canvas.restore();
        }
        m3 m3Var = this.O;
        if (m3Var != null && (textSelectionHelper = m3Var.f19749a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f29352p0 && R <= textSelectionHelper.f29355s0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.Q, this.f19953s);
            }
        }
        if (this.I && (fVar = this.J) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !fVar.f54758r) {
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
                    imageView = this.f19956y;
                    imageView2 = this.f19955x;
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
        if (u5Var.f38649i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int left;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i11 - i3;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        int i15 = i14 - paddingRight;
        if (ne.b(this.f20029a) > 0) {
            i13 = org.telegram.messenger.g0.L(16.0f);
        } else {
            i13 = 0;
        }
        this.f19954w.g(paddingLeft - i13, paddingRight - i13, i14, getPaddingTop() + this.Q);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i16 = i15 - L;
        ImageView imageView = this.f19955x;
        imageView.layout(i16 - imageView.getMeasuredWidth(), getPaddingTop() + L, i16, imageView.getMeasuredHeight() + getPaddingTop() + L);
        int i17 = i16 - L;
        ImageView imageView2 = this.f19956y;
        imageView2.layout((i17 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + L, i17 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + L);
        List n4 = n();
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i18 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i18);
                int i19 = 8;
                if (i18 < n4.size() && ((s) n4.get(i18)).f19859a != 0) {
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
                                    f10 = org.telegram.ui.Cells.f1.y(measuredWidth - L2, imageView3.getMeasuredWidth(), 1.0f, 0.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: mi.t4.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 0;
        if (y9 >= getPaddingTop() && y9 < getPaddingTop() + this.Q) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = -1;
        if (m() && !this.V.f38649i) {
            ArrayList arrayList = this.E;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f19944f0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f19944f0 = viewConfiguration.getScaledTouchSlop();
                        this.f19945g0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f19946h0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.f19942d0 = x10;
                    this.f19943e0 = y9;
                    this.f19941c0 = false;
                    VelocityTracker velocityTracker2 = this.f19947i0;
                    if (velocityTracker2 == null) {
                        this.f19947i0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f19947i0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f19948j0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f19948j0 = null;
                    }
                    this.U = this.f19939a0;
                    return true;
                }
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f19947i0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f11 = x10 - this.f19942d0;
                    float f12 = y9 - this.f19943e0;
                    if (!this.f19941c0 && Math.abs(f11) > this.f19944f0 && Math.abs(f11) > Math.abs(f12)) {
                        this.f19941c0 = true;
                        this.U = -1;
                    }
                    if (this.f19941c0) {
                        float f13 = (-f11) / this.S;
                        int i11 = this.f19939a0;
                        if (i11 == 0 && f13 < 0.0f) {
                            f13 *= 0.3f;
                        }
                        if (i11 == arrayList.size() - 1 && f13 > 0.0f) {
                            f13 *= 0.3f;
                        }
                        this.f19940b0 = f13;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f19947i0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f19947i0.computeCurrentVelocity(1000, this.f19946h0);
                        float xVelocity = this.f19947i0.getXVelocity();
                        float yVelocity = this.f19947i0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f19945g0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f10 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f19947i0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f19947i0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.f19941c0) {
                        this.f19941c0 = false;
                        settle(f10);
                    } else if (actionMasked == 1) {
                        int i12 = this.U;
                        int i13 = this.f19939a0;
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
                if (i3 >= arrayList2.size()) {
                    break;
                } else if (((RectF) arrayList2.get(i3)).contains(x10, y9)) {
                    i10 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            this.U = i10;
            return true;
        } else if (actionMasked == 1) {
            if (z10) {
                int i14 = 0;
                while (true) {
                    if (i14 < arrayList2.size()) {
                        if (((RectF) arrayList2.get(i14)).contains(x10, y9)) {
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
        List n4 = n();
        while (true) {
            arrayList = this.E;
            if (arrayList.size() >= n4.size()) {
                break;
            }
            w4 w4Var = new w4(this, this.f19951n);
            if (this.P) {
                w4Var.f20006a.P();
                w4Var.f20007b.P();
                w4Var.a();
            }
            arrayList.add(w4Var);
        }
        while (arrayList.size() > n4.size()) {
            w4 w4Var2 = (w4) org.telegram.ui.Cells.f1.o(1, arrayList);
            w4Var2.f20006a.R();
            w4Var2.f20007b.R();
            w4Var2.f20008c = null;
        }
        for (int i3 = 0; i3 < n4.size(); i3++) {
            w4 w4Var3 = (w4) arrayList.get(i3);
            w4Var3.f20009e = (s) n4.get(i3);
            w4Var3.a();
        }
        while (true) {
            arrayList2 = this.F;
            if (arrayList2.size() >= n4.size()) {
                break;
            }
            ImageView g7 = g();
            g7.setImageResource(2131231574);
            g7.setOnClickListener(new q4(this, 0));
            addView(g7, mf.e(32, 32, 51));
            arrayList2.add(g7);
        }
        this.f19955x.bringToFront();
        this.f19956y.bringToFront();
        while (arrayList2.size() > n4.size()) {
            View view = (ImageView) org.telegram.ui.Cells.f1.o(1, arrayList2);
            removeView(view);
            this.L.remove(view);
            this.M.remove(view);
        }
        if (this.N != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                s sVar = ((w4) arrayList.get(i10)).f20009e;
                if (sVar != null && sVar.f19870n) {
                    return;
                }
            }
            this.N.b(this);
            this.N = null;
        }
    }

    public final void q(boolean z10) {
        boolean z11;
        int i3;
        int i10 = 0;
        if (this.E.size() >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i10 = 8;
        }
        ImageView imageView = this.f19956y;
        imageView.setVisibility(i10);
        if (z11) {
            if (m()) {
                i3 = 2131231575;
            } else {
                i3 = 2131231572;
            }
            if (i3 == this.W) {
                return;
            }
            this.W = i3;
            if (z10) {
                org.telegram.messenger.g0.R3(imageView, i3);
            } else {
                imageView.setImageResource(i3);
            }
        }
    }

    @Override
    public final void updateColors() {
        int i3 = k6.f28203ue;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19951n;
        this.f19952r.setColor(k6.w0(i3, e6Var));
        this.f19953s.setColor(k6.w0(k6.ig, e6Var));
        k0 k0Var = this.f19954w;
        if (k0Var != null) {
            k0Var.a();
        }
    }
}
