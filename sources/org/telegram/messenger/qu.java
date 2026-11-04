package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.lg0;
import org.telegram.ui.ng0;
public final class qu extends xt implements kx0 {
    public final mi.b0 A0;
    public final TL_iv.pageBlockTable X;
    public final lx0 Y;
    public final ArrayList Z;
    public final org.telegram.ui.Cells.s9[] f24961a0;
    public final bv f24962b0;
    public final int f24963c0;
    public final ArrayList f24964d0;
    public final int f24965e0;
    public final int f24966f0;
    public int f24967g0;
    public int f24968h0;
    public final int f24969i0;
    public int f24970j0;
    public Paint f24971k0;
    public Paint f24972l0;
    public Paint m0;
    public Paint f24973n0;
    public float f24974o0;
    public int f24975p0;
    public boolean f24976q0;
    public bv f24977r0;
    public float f24978s0;
    public float f24979t0;
    public boolean f24980u0;
    public int f24981v0;
    public int f24982w0;
    public int f24983x0;
    public VelocityTracker f24984y0;
    public OverScroller f24985z0;

    public qu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockTable pageblocktable) {
        super(cvVar, rect, i3);
        float f10;
        int i10;
        int i11;
        this.Z = new ArrayList();
        this.f24964d0 = new ArrayList();
        this.A0 = new mi.b0(this, 11);
        Rect rect2 = this.f26435b;
        rect2.top = g0.L(10.0f) + rect2.top;
        this.X = pageblocktable;
        this.f24965e0 = this.f26436c;
        lx0 lx0Var = new lx0(t0.f25457b, this, null);
        this.Y = lx0Var;
        lx0Var.setOrientation(0);
        lx0Var.setRowOrderPreserved(true);
        lx0Var.setDrawLines(pageblocktable.bordered);
        lx0Var.setStriped(pageblocktable.striped);
        lx0Var.setRtl(cvVar.I());
        lx0Var.setFillWidth(false);
        if (pageblocktable.compact) {
            int L = g0.L(5.0f);
            int L2 = g0.L(5.0f);
            int L3 = g0.L(5.0f);
            if (lx0Var.f35910w != L || lx0Var.f35908r != L2 || lx0Var.f35909s != L3) {
                lx0Var.f35910w = L;
                lx0Var.f35908r = L2;
                lx0Var.f35909s = L3;
                lx0Var.requestLayout();
            }
        }
        if (pageblocktable.compact) {
            f10 = 18.0f;
        } else {
            f10 = 36.0f;
        }
        lx0Var.setMinimumCellHeight(g0.L(f10));
        if (!pageblocktable.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
            i10 = 0;
            for (int i12 = 0; i12 < pagetablerow.cells.size(); i12++) {
                int i13 = pagetablerow.cells.get(i12).colspan;
                if (i13 == 0) {
                    i13 = 1;
                }
                i10 += i13;
            }
        } else {
            i10 = 0;
        }
        for (int i14 = 0; i14 < pageblocktable.rows.size(); i14++) {
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i14);
            int i15 = 0;
            for (int i16 = 0; i16 < pagetablerow2.cells.size(); i16++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i16);
                int i17 = pagetablecell.colspan;
                i17 = i17 == 0 ? 1 : i17;
                int i18 = pagetablecell.rowspan;
                i18 = i18 == 0 ? 1 : i18;
                if (pagetablecell.text != null) {
                    this.Y.b(pagetablecell, i15, i14, i17);
                } else {
                    this.Y.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        this.Y.setColumnCount(i10);
        this.Y.measure(View.MeasureSpec.makeMeasureSpec(this.f26436c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.Y.getMeasuredWidth();
        this.f24968h0 = this.Y.getMeasuredHeight();
        this.f24969i0 = Math.max(0, measuredWidth - this.f24965e0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(cv.x(richText))) {
            bv bvVar = new bv(cvVar, cvVar.l(pageblocktable.title, cv.R(0, 15)), this.f24965e0);
            this.f24962b0 = bvVar;
            bvVar.f21893r = true;
            this.f24963c0 = g0.L(9.0f) + bvVar.f21888b.getHeight();
        } else {
            this.f24962b0 = null;
            this.f24963c0 = 0;
        }
        bv bvVar2 = this.f24962b0;
        if (bvVar2 != null) {
            i11 = bvVar2.r();
        } else {
            i11 = 0;
        }
        int max = Math.max(0, Math.min(this.f24965e0, Math.max(measuredWidth, i11)));
        this.f24966f0 = max;
        this.f24967g0 = max;
        for (int i19 = 0; i19 < this.Y.getChildCount(); i19++) {
            ex0 d = this.Y.d(i19);
            dx0 dx0Var = d.f33501b;
            if (dx0Var instanceof bv) {
                this.Z.add((bv) dx0Var);
                this.f24964d0.add(new pu(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        bv bvVar3 = this.f24962b0;
        if (bvVar3 != null) {
            arrayList.add(bvVar3);
        }
        arrayList.addAll(this.Z);
        this.f24961a0 = (org.telegram.ui.Cells.s9[]) arrayList.toArray(new org.telegram.ui.Cells.s9[0]);
    }

    @Override
    public final int I() {
        Rect rect = this.f26435b;
        return g0.L(10.0f) + rect.top + this.f24963c0 + this.f24968h0 + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
        return rect.left + this.f24966f0 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.f24961a0;
    }

    @Override
    public final boolean Q() {
        if (!this.f24976q0) {
            OverScroller overScroller = this.f24985z0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void T() {
        bv bvVar = this.f24962b0;
        if (bvVar != null) {
            bvVar.i(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((bv) obj).i(this.W);
        }
    }

    @Override
    public final void V() {
        bv bvVar = this.f24962b0;
        if (bvVar != null) {
            bvVar.f(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((bv) obj).f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i3;
        int i10;
        bv bvVar = this.f24962b0;
        if (bvVar != null) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            bvVar.d(canvas, bvVar.T);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.f24963c0);
        cv cvVar = this.f26434a;
        int i11 = cvVar.S;
        k4.j jVar = cvVar.f22087z;
        Rect rect = this.f26435b;
        canvas.saveLayerAlpha(-i11, 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.f24968h0, 255, 31);
        canvas.save();
        canvas.translate(-this.f24970j0, 0.0f);
        lx0 lx0Var = this.Y;
        int childCount = lx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            lx0Var.d(i12).a(canvas, this.W, true);
        }
        canvas.restore();
        RectF rectF = g0.P;
        rectF.set(-cvVar.S, 0.0f, g0.L(12.0f) + i3, this.f24968h0);
        jVar.w(canvas, rectF, 0, 1.0f);
        rectF.set(i10 - g0.L(12.0f), 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.f24968h0);
        jVar.w(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int i3;
        int i10;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i11 = this.f24969i0;
        ex0 ex0Var = null;
        int i12 = 0;
        if (actionMasked == 0) {
            if (this.f24981v0 == 0 && (view = this.W) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.f24981v0 = viewConfiguration.getScaledTouchSlop();
                this.f24982w0 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f24983x0 = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.f24985z0 == null && this.W != null) {
                this.f24985z0 = new OverScroller(this.W.getContext());
            }
            OverScroller overScroller = this.f24985z0;
            if (overScroller != null && !overScroller.isFinished()) {
                this.f24985z0.forceFinished(true);
            }
            this.f24974o0 = motionEvent.getX();
            motionEvent.getY();
            this.f24975p0 = this.f24970j0;
            this.f24976q0 = false;
            VelocityTracker velocityTracker2 = this.f24984y0;
            if (velocityTracker2 == null) {
                this.f24984y0 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f24984y0.addMovement(motionEvent);
            this.f24977r0 = null;
            this.f24980u0 = false;
            int i13 = this.f24963c0;
            bv bvVar = this.f24962b0;
            if (bvVar != null && motionEvent.getY() < i13) {
                float j02 = j0();
                motionEvent.offsetLocation(-j02, 0.0f);
                boolean t10 = bvVar.t(motionEvent);
                motionEvent.offsetLocation(j02, 0.0f);
                if (t10) {
                    this.f24977r0 = bvVar;
                    this.f24978s0 = j02;
                    this.f24979t0 = 0.0f;
                    this.f24980u0 = true;
                }
            }
            if (!this.f24980u0) {
                float x10 = motionEvent.getX();
                float f10 = x10 + this.f24970j0;
                float y9 = motionEvent.getY() - i13;
                lx0 lx0Var = this.Y;
                int childCount = lx0Var.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= childCount) {
                        break;
                    }
                    ex0 d = lx0Var.d(i14);
                    if (d.f33501b instanceof bv) {
                        if (f10 >= d.f33513p && f10 < i3 + d.f33508k) {
                            if (y9 >= d.f33514q && y9 < i10 + d.f33509l) {
                                ex0Var = d;
                                break;
                            }
                        }
                    }
                    i14++;
                }
                if (ex0Var != null) {
                    this.f24977r0 = (bv) ex0Var.f33501b;
                    this.f24978s0 = ex0Var.b() - this.f24970j0;
                    this.f24979t0 = ex0Var.c() + i13;
                    this.f24977r0.S.set(ex0Var.f33513p - ex0Var.b(), ex0Var.f33514q - ex0Var.c(), (ex0Var.f33513p + ex0Var.f33508k) - ex0Var.b(), (ex0Var.f33514q + ex0Var.f33509l) - ex0Var.c());
                    motionEvent.offsetLocation(-this.f24978s0, -this.f24979t0);
                    this.f24980u0 = this.f24977r0.t(motionEvent);
                    motionEvent.offsetLocation(this.f24978s0, this.f24979t0);
                }
            }
            if (this.f24980u0 || i11 > 0) {
                return true;
            }
            return false;
        }
        if (actionMasked == 2) {
            VelocityTracker velocityTracker3 = this.f24984y0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x11 = motionEvent.getX() - this.f24974o0;
            if (!this.f24976q0 && i11 > 0 && Math.abs(x11) > this.f24981v0) {
                this.f24976q0 = true;
                a0(true);
                if (this.f24980u0 && this.f24977r0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.f24978s0, -this.f24979t0);
                    this.f24977r0.t(obtain);
                    obtain.recycle();
                    this.f24980u0 = false;
                }
            }
            if (this.f24976q0) {
                int i15 = (int) (this.f24975p0 - x11);
                if (i15 >= 0) {
                    i12 = i15;
                }
                if (i12 <= i11) {
                    i11 = i12;
                }
                if (i11 != this.f24970j0) {
                    this.f24970j0 = i11;
                    Z(this.T, this.U, this.V);
                    View view2 = this.W;
                    if (view2 != null) {
                        view2.invalidate();
                        return true;
                    }
                }
            } else {
                return this.f24980u0;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f24976q0;
                this.f24976q0 = false;
                if (z10) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.f24984y0) != null && this.f24985z0 != null && this.W != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f24984y0.computeCurrentVelocity(1000, this.f24983x0);
                        float f11 = -this.f24984y0.getXVelocity();
                        if (Math.abs(f11) > this.f24982w0) {
                            this.f24985z0.fling(this.f24970j0, 0, (int) f11, 0, 0, this.f24969i0, 0, 0);
                            this.W.postOnAnimation(this.A0);
                        }
                    }
                }
                if (!z10 && this.f24980u0 && this.f24977r0 != null) {
                    motionEvent.offsetLocation(-this.f24978s0, -this.f24979t0);
                    this.f24977r0.t(motionEvent);
                    motionEvent.offsetLocation(this.f24978s0, this.f24979t0);
                }
                boolean z11 = this.f24980u0;
                this.f24980u0 = false;
                this.f24977r0 = null;
                VelocityTracker velocityTracker4 = this.f24984y0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f24984y0 = null;
                }
                if (z10 || z11) {
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final void Z(int i3, int i10, int i11) {
        this.T = i3;
        this.U = i10;
        this.V = i11;
        bv bvVar = this.f24962b0;
        if (bvVar != null) {
            bvVar.f21889c = (j0() + i3) - bvVar.n();
            bvVar.d = i10;
            bvVar.f21890e = i11;
        }
        lx0 lx0Var = this.Y;
        int childCount = lx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ex0 d = lx0Var.d(i12);
            dx0 dx0Var = d.f33501b;
            if (dx0Var instanceof bv) {
                bv bvVar2 = (bv) dx0Var;
                bvVar2.f21889c = ((d.b() + i3) - this.f24970j0) - bvVar2.n();
                bvVar2.d = d.c() + this.f24963c0 + i10;
                bvVar2.f21890e = i11;
            }
        }
    }

    @Override
    public final dx0 c(TL_iv.pageTableCell pagetablecell, int i3) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        int R = cv.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        cv cvVar = this.f26434a;
        SpannableStringBuilder l10 = cvVar.l(richText, R);
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        bv bvVar = new bv(cvVar, l10, i3, alignment);
        bvVar.f21893r = true;
        return bvVar;
    }

    @Override
    public final Paint getHeaderPaint() {
        i0();
        return this.m0;
    }

    @Override
    public final Paint getLinePaint() {
        i0();
        return this.f24971k0;
    }

    @Override
    public final Paint getStripPaint() {
        i0();
        return this.f24973n0;
    }

    public final void i0() {
        int i3;
        int i10;
        if (this.f24971k0 == null) {
            Paint paint = new Paint(1);
            this.f24971k0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.f24971k0.setStrokeWidth(g0.N(0.66f));
            Paint paint2 = new Paint();
            this.f24972l0 = paint2;
            paint2.setStyle(style);
            this.f24972l0.setStrokeWidth(g0.N(0.66f));
            this.m0 = new Paint();
            this.f24973n0 = new Paint();
        }
        cv cvVar = this.f26434a;
        if (cvVar.E()) {
            i3 = org.telegram.ui.ActionBar.k6.il;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.hl;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D);
        this.f24971k0.setColor(w02);
        this.f24972l0.setColor(w02);
        Paint paint3 = this.m0;
        if (cvVar.E()) {
            i10 = org.telegram.ui.ActionBar.k6.gl;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.fl;
        }
        paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i10, cvVar.D));
        this.f24973n0.setColor(167772160);
    }

    public final int j0() {
        bv bvVar = this.f24962b0;
        if (bvVar == null) {
            return 0;
        }
        int i3 = this.f24967g0;
        int i10 = bvVar.h;
        int i11 = bvVar.f21891f;
        return Math.round(((i3 - (i10 - i11)) / 2.0f) - i11);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        xt.l(spannableStringBuilder, this.f24962b0, null);
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i3 < arrayList.size()) {
                bv bvVar = (bv) arrayList.get(i3);
                if (bvVar != null && (staticLayout = bvVar.f21888b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append(", ");
                    }
                    spannableStringBuilder.append(staticLayout.getText());
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void p(ArrayList arrayList) {
        ArrayList arrayList2 = this.f24964d0;
        if (arrayList2.isEmpty()) {
            arrayList.add(this);
        } else {
            arrayList.addAll(arrayList2);
        }
    }

    @Override
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        boolean z10;
        boolean z11;
        int i3;
        int i10;
        ex0 d;
        bv bvVar;
        org.telegram.ui.Components.l5 l5Var;
        lx0 lx0Var;
        int i11;
        int i12;
        k4.j jVar;
        int i13;
        org.telegram.ui.Components.l5 l5Var2;
        canvas.save();
        Rect rect = this.f26435b;
        canvas.translate(rect.left, rect.top);
        bv bvVar2 = this.f24962b0;
        if (bvVar2 != null && (l5Var2 = bvVar2.F) != null && !l5Var2.f35600a.isEmpty()) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, bvVar2.f21888b, bvVar2.F, 0.0f, bvVar2.f21896x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.translate(0.0f, this.f24963c0);
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                org.telegram.ui.Components.l5 l5Var3 = ((bv) arrayList.get(i14)).F;
                if (l5Var3 != null && !l5Var3.f35600a.isEmpty()) {
                    cv cvVar = this.f26434a;
                    int i15 = cvVar.S;
                    k4.j jVar2 = cvVar.f22087z;
                    int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.f24968h0, 255, 31);
                    canvas.save();
                    canvas.translate(-this.f24970j0, 0.0f);
                    lx0 lx0Var2 = this.Y;
                    int childCount = lx0Var2.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount) {
                        dx0 dx0Var = lx0Var2.d(i16).f33501b;
                        if (!(dx0Var instanceof bv) || (l5Var = (bvVar = (bv) dx0Var).F) == null || l5Var.f35600a.isEmpty()) {
                            i13 = saveLayerAlpha;
                            lx0Var = lx0Var2;
                            i11 = childCount;
                            i12 = i16;
                            jVar = jVar2;
                        } else {
                            canvas.save();
                            canvas.translate(d.b(), d.c());
                            lx0Var = lx0Var2;
                            i11 = childCount;
                            i12 = i16;
                            jVar = jVar2;
                            i13 = saveLayerAlpha;
                            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, bvVar.f21888b, bvVar.F, 0.0f, bvVar.f21896x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                            canvas.restore();
                        }
                        i16 = i12 + 1;
                        jVar2 = jVar;
                        lx0Var2 = lx0Var;
                        childCount = i11;
                        saveLayerAlpha = i13;
                    }
                    int i17 = saveLayerAlpha;
                    k4.j jVar3 = jVar2;
                    canvas.restore();
                    RectF rectF = g0.P;
                    rectF.set(-cvVar.S, 0.0f, g0.L(12.0f) + i3, this.f24968h0);
                    jVar3.w(canvas, rectF, 0, 1.0f);
                    rectF.set(i10 - g0.L(12.0f), 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.f24968h0);
                    jVar3.w(canvas, rectF, 2, 1.0f);
                    canvas.restoreToCount(i17);
                    z11 = true;
                } else {
                    i14++;
                }
            } else {
                z11 = z10;
                break;
            }
        }
        canvas.restore();
        return z11;
    }

    @Override
    public final void t(Canvas canvas) {
        int i3;
        int i10;
        pu puVar;
        float f10;
        int i11;
        lx0 lx0Var;
        int i12;
        int i13;
        int i14;
        float f11;
        ng0 ng0Var = this.L;
        if (ng0Var != null && ng0Var.h) {
            ArrayList arrayList = this.f24964d0;
            if (!arrayList.isEmpty() && ng0Var.d((lg0) arrayList.get(0)) >= 0) {
                float c2 = ng0Var.c((lg0) arrayList.get(0));
                float f12 = 0.0f;
                if (c2 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.f26435b;
                canvas.translate(rect.left, rect.top);
                bv bvVar = this.f24962b0;
                if (bvVar != null) {
                    canvas.save();
                    canvas.translate(j0(), 0.0f);
                    bvVar.d(canvas, bvVar.T);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.f24963c0);
                cv cvVar = this.f26434a;
                int i15 = cvVar.S;
                k4.j jVar = cvVar.f22087z;
                float f13 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.f24968h0, (int) (c2 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.f24970j0, 0.0f);
                lx0 lx0Var2 = this.Y;
                int childCount = lx0Var2.getChildCount();
                int i16 = 0;
                int i17 = 0;
                while (i16 < childCount) {
                    float f14 = f13;
                    ex0 d = lx0Var2.d(i16);
                    if (i17 < arrayList.size() && ((pu) arrayList.get(i17)).f24801a == d) {
                        puVar = (pu) arrayList.get(i17);
                        i17++;
                    } else {
                        puVar = null;
                    }
                    int i18 = i17;
                    if (puVar == null) {
                        d.a(canvas, this.W, true);
                    } else if (!ng0Var.i(puVar)) {
                        d.a(canvas, this.W, false);
                    } else {
                        if (ng0Var.g(puVar)) {
                            d.a(canvas, this.W, false);
                            if (d.f33501b instanceof bv) {
                                canvas.save();
                                f10 = f12;
                                canvas.translate(d.b(), d.c());
                                bv bvVar2 = (bv) d.f33501b;
                                if (ng0Var.g(puVar)) {
                                    i14 = ng0Var.f47995e;
                                } else {
                                    i14 = -1;
                                }
                                if (ng0Var.g(puVar)) {
                                    f11 = ng0Var.f47996f;
                                } else {
                                    f11 = f10;
                                }
                                bvVar2.m(canvas, i14, f11);
                                canvas.restore();
                            } else {
                                f10 = f12;
                            }
                        } else {
                            f10 = f12;
                            float c10 = ng0Var.c(puVar);
                            if (c10 >= 1.0f) {
                                d.a(canvas, this.W, true);
                            } else {
                                if (c10 > f10 && d.f33501b != null) {
                                    d.a(canvas, this.W, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    lx0Var = lx0Var2;
                                    i13 = i16;
                                    i11 = saveLayerAlpha;
                                    i12 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.f33508k, d.f33509l, (int) (c10 * f14), 31);
                                    d.f33501b.d(canvas, this.W);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                } else {
                                    i11 = saveLayerAlpha;
                                    lx0Var = lx0Var2;
                                    i12 = childCount;
                                    i13 = i16;
                                    d.a(canvas, this.W, false);
                                }
                                i16 = i13 + 1;
                                saveLayerAlpha = i11;
                                f13 = f14;
                                i17 = i18;
                                f12 = f10;
                                childCount = i12;
                                lx0Var2 = lx0Var;
                            }
                        }
                        i11 = saveLayerAlpha;
                        lx0Var = lx0Var2;
                        i12 = childCount;
                        i13 = i16;
                        i16 = i13 + 1;
                        saveLayerAlpha = i11;
                        f13 = f14;
                        i17 = i18;
                        f12 = f10;
                        childCount = i12;
                        lx0Var2 = lx0Var;
                    }
                    lx0Var = lx0Var2;
                    i12 = childCount;
                    i13 = i16;
                    f10 = f12;
                    i11 = saveLayerAlpha;
                    i16 = i13 + 1;
                    saveLayerAlpha = i11;
                    f13 = f14;
                    i17 = i18;
                    f12 = f10;
                    childCount = i12;
                    lx0Var2 = lx0Var;
                }
                float f15 = f12;
                int i19 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-cvVar.S, f15, g0.L(12.0f) + i3, this.f24968h0);
                jVar.w(canvas, rectF, 0, 1.0f);
                rectF.set(i10 - g0.L(12.0f), 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.f24968h0);
                jVar.w(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i19);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        ex0 d;
        bv bvVar;
        Rect rect = this.f26435b;
        bv bvVar2 = this.f24962b0;
        if (bvVar2 != null && bvVar2.o(characterStyle, otVar)) {
            otVar.f24597e = (j0() + rect.left) - bvVar2.n();
            otVar.f24598f = i3 + rect.top;
            return true;
        }
        lx0 lx0Var = this.Y;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            dx0 dx0Var = lx0Var.d(i10).f33501b;
            if (dx0Var instanceof bv) {
                if (((bv) dx0Var).o(characterStyle, otVar)) {
                    otVar.f24597e = ((d.b() + rect.left) - this.f24970j0) - bvVar.n();
                    otVar.f24598f = d.c() + i3 + rect.top + this.f24963c0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(dx0 dx0Var, int i3) {
    }
}
