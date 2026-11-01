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
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.vh0;
import org.telegram.ui.xh0;
public final class kv extends ru implements py0 {
    public final TL_iv.pageBlockTable W;
    public final qy0 X;
    public final ArrayList Y;
    public final org.telegram.ui.Cells.u9[] Z;
    public final vv f16798a0;
    public final int f16799b0;
    public final ArrayList f16800c0;
    public final int f16801d0;
    public final int f16802e0;
    public int f16803f0;
    public int f16804g0;
    public final int f16805h0;
    public int f16806i0;
    public Paint f16807j0;
    public Paint f16808k0;
    public Paint f16809l0;
    public Paint m0;
    public float f16810n0;
    public int f16811o0;
    public boolean f16812p0;
    public vv f16813q0;
    public float f16814r0;
    public float f16815s0;
    public boolean f16816t0;
    public int f16817u0;
    public int f16818v0;
    public int f16819w0;
    public VelocityTracker f16820x0;
    public OverScroller f16821y0;
    public final mg.c2 f16822z0;

    public kv(wv wvVar, Rect rect, int i10, TL_iv.pageBlockTable pageblocktable) {
        super(wvVar, rect, i10);
        float f7;
        int i11;
        int i12;
        this.Y = new ArrayList();
        this.f16800c0 = new ArrayList();
        this.f16822z0 = new mg.c2(this, 10);
        Rect rect2 = this.f17968b;
        rect2.top = i0.L(10.0f) + rect2.top;
        this.W = pageblocktable;
        this.f16801d0 = this.f17969c;
        qy0 qy0Var = new qy0(w0.f18945b, this, null);
        this.X = qy0Var;
        qy0Var.setOrientation(0);
        qy0Var.setRowOrderPreserved(true);
        qy0Var.setDrawLines(pageblocktable.bordered);
        qy0Var.setStriped(pageblocktable.striped);
        qy0Var.setRtl(wvVar.I());
        qy0Var.setFillWidth(false);
        if (pageblocktable.compact) {
            int L = i0.L(5.0f);
            int L2 = i0.L(5.0f);
            int L3 = i0.L(5.0f);
            if (qy0Var.f29838w != L || qy0Var.f29836r != L2 || qy0Var.f29837s != L3) {
                qy0Var.f29838w = L;
                qy0Var.f29836r = L2;
                qy0Var.f29837s = L3;
                qy0Var.requestLayout();
            }
        }
        if (pageblocktable.compact) {
            f7 = 18.0f;
        } else {
            f7 = 36.0f;
        }
        qy0Var.setMinimumCellHeight(i0.L(f7));
        if (!pageblocktable.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
            i11 = 0;
            for (int i13 = 0; i13 < pagetablerow.cells.size(); i13++) {
                int i14 = pagetablerow.cells.get(i13).colspan;
                if (i14 == 0) {
                    i14 = 1;
                }
                i11 += i14;
            }
        } else {
            i11 = 0;
        }
        for (int i15 = 0; i15 < pageblocktable.rows.size(); i15++) {
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i15);
            int i16 = 0;
            for (int i17 = 0; i17 < pagetablerow2.cells.size(); i17++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i17);
                int i18 = pagetablecell.colspan;
                i18 = i18 == 0 ? 1 : i18;
                int i19 = pagetablecell.rowspan;
                i19 = i19 == 0 ? 1 : i19;
                if (pagetablecell.text != null) {
                    this.X.b(pagetablecell, i16, i15, i18);
                } else {
                    this.X.a(i16, i15, i18, i19);
                }
                i16 += i18;
            }
        }
        this.X.setColumnCount(i11);
        this.X.measure(View.MeasureSpec.makeMeasureSpec(this.f17969c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.X.getMeasuredWidth();
        this.f16804g0 = this.X.getMeasuredHeight();
        this.f16805h0 = Math.max(0, measuredWidth - this.f16801d0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(wv.x(richText))) {
            vv vvVar = new vv(wvVar, wvVar.l(pageblocktable.title, wv.R(0, 15)), this.f16801d0);
            this.f16798a0 = vvVar;
            vvVar.f18908r = true;
            this.f16799b0 = i0.L(9.0f) + vvVar.f18904b.getHeight();
        } else {
            this.f16798a0 = null;
            this.f16799b0 = 0;
        }
        vv vvVar2 = this.f16798a0;
        if (vvVar2 != null) {
            i12 = vvVar2.r();
        } else {
            i12 = 0;
        }
        int max = Math.max(0, Math.min(this.f16801d0, Math.max(measuredWidth, i12)));
        this.f16802e0 = max;
        this.f16803f0 = max;
        for (int i20 = 0; i20 < this.X.getChildCount(); i20++) {
            jy0 d = this.X.d(i20);
            iy0 iy0Var = d.f27592b;
            if (iy0Var instanceof vv) {
                this.Y.add((vv) iy0Var);
                this.f16800c0.add(new jv(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        vv vvVar3 = this.f16798a0;
        if (vvVar3 != null) {
            arrayList.add(vvVar3);
        }
        arrayList.addAll(this.Y);
        this.Z = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override
    public final int H() {
        Rect rect = this.f17968b;
        return i0.L(10.0f) + rect.top + this.f16799b0 + this.f16804g0 + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17968b;
        return rect.left + this.f16802e0 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Z;
    }

    @Override
    public final boolean P() {
        if (!this.f16812p0) {
            OverScroller overScroller = this.f16821y0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void S() {
        vv vvVar = this.f16798a0;
        if (vvVar != null) {
            vvVar.i(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vv) obj).i(this.V);
        }
    }

    @Override
    public final void U() {
        vv vvVar = this.f16798a0;
        if (vvVar != null) {
            vvVar.f(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vv) obj).f(this.V);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        int i11;
        vv vvVar = this.f16798a0;
        if (vvVar != null) {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            vvVar.d(canvas, vvVar.S);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.f16799b0);
        wv wvVar = this.f17967a;
        int i12 = wvVar.S;
        li.k kVar = wvVar.f19350z;
        Rect rect = this.f17968b;
        canvas.saveLayerAlpha(-i12, 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.f16804g0, 255, 31);
        canvas.save();
        canvas.translate(-this.f16806i0, 0.0f);
        qy0 qy0Var = this.X;
        int childCount = qy0Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            qy0Var.d(i13).a(canvas, this.V, true);
        }
        canvas.restore();
        RectF rectF = i0.P;
        rectF.set(-wvVar.S, 0.0f, i0.L(12.0f) + i10, this.f16804g0);
        kVar.o(canvas, rectF, 0, 1.0f);
        rectF.set(i11 - i0.L(12.0f), 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.f16804g0);
        kVar.o(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int i10;
        int i11;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i12 = this.f16805h0;
        jy0 jy0Var = null;
        int i13 = 0;
        if (actionMasked == 0) {
            if (this.f16817u0 == 0 && (view = this.V) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.f16817u0 = viewConfiguration.getScaledTouchSlop();
                this.f16818v0 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f16819w0 = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.f16821y0 == null && this.V != null) {
                this.f16821y0 = new OverScroller(this.V.getContext());
            }
            OverScroller overScroller = this.f16821y0;
            if (overScroller != null && !overScroller.isFinished()) {
                this.f16821y0.forceFinished(true);
            }
            this.f16810n0 = motionEvent.getX();
            motionEvent.getY();
            this.f16811o0 = this.f16806i0;
            this.f16812p0 = false;
            VelocityTracker velocityTracker2 = this.f16820x0;
            if (velocityTracker2 == null) {
                this.f16820x0 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f16820x0.addMovement(motionEvent);
            this.f16813q0 = null;
            this.f16816t0 = false;
            int i14 = this.f16799b0;
            vv vvVar = this.f16798a0;
            if (vvVar != null && motionEvent.getY() < i14) {
                float i02 = i0();
                motionEvent.offsetLocation(-i02, 0.0f);
                boolean t10 = vvVar.t(motionEvent);
                motionEvent.offsetLocation(i02, 0.0f);
                if (t10) {
                    this.f16813q0 = vvVar;
                    this.f16814r0 = i02;
                    this.f16815s0 = 0.0f;
                    this.f16816t0 = true;
                }
            }
            if (!this.f16816t0) {
                float x10 = motionEvent.getX();
                float f7 = x10 + this.f16806i0;
                float y3 = motionEvent.getY() - i14;
                qy0 qy0Var = this.X;
                int childCount = qy0Var.getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= childCount) {
                        break;
                    }
                    jy0 d = qy0Var.d(i15);
                    if (d.f27592b instanceof vv) {
                        if (f7 >= d.f27603p && f7 < i10 + d.f27598k) {
                            if (y3 >= d.f27604q && y3 < i11 + d.f27599l) {
                                jy0Var = d;
                                break;
                            }
                        }
                    }
                    i15++;
                }
                if (jy0Var != null) {
                    this.f16813q0 = (vv) jy0Var.f27592b;
                    this.f16814r0 = jy0Var.b() - this.f16806i0;
                    this.f16815s0 = jy0Var.c() + i14;
                    this.f16813q0.R.set(jy0Var.f27603p - jy0Var.b(), jy0Var.f27604q - jy0Var.c(), (jy0Var.f27603p + jy0Var.f27598k) - jy0Var.b(), (jy0Var.f27604q + jy0Var.f27599l) - jy0Var.c());
                    motionEvent.offsetLocation(-this.f16814r0, -this.f16815s0);
                    this.f16816t0 = this.f16813q0.t(motionEvent);
                    motionEvent.offsetLocation(this.f16814r0, this.f16815s0);
                }
            }
            if (this.f16816t0 || i12 > 0) {
                return true;
            }
            return false;
        }
        if (actionMasked == 2) {
            VelocityTracker velocityTracker3 = this.f16820x0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x11 = motionEvent.getX() - this.f16810n0;
            if (!this.f16812p0 && i12 > 0 && Math.abs(x11) > this.f16817u0) {
                this.f16812p0 = true;
                Z(true);
                if (this.f16816t0 && this.f16813q0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.f16814r0, -this.f16815s0);
                    this.f16813q0.t(obtain);
                    obtain.recycle();
                    this.f16816t0 = false;
                }
            }
            if (this.f16812p0) {
                int i16 = (int) (this.f16811o0 - x11);
                if (i16 >= 0) {
                    i13 = i16;
                }
                if (i13 <= i12) {
                    i12 = i13;
                }
                if (i12 != this.f16806i0) {
                    this.f16806i0 = i12;
                    Y(this.S, this.T, this.U);
                    View view2 = this.V;
                    if (view2 != null) {
                        view2.invalidate();
                        return true;
                    }
                }
            } else {
                return this.f16816t0;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f16812p0;
                this.f16812p0 = false;
                if (z10) {
                    Z(false);
                    if (actionMasked == 1 && (velocityTracker = this.f16820x0) != null && this.f16821y0 != null && this.V != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f16820x0.computeCurrentVelocity(1000, this.f16819w0);
                        float f10 = -this.f16820x0.getXVelocity();
                        if (Math.abs(f10) > this.f16818v0) {
                            this.f16821y0.fling(this.f16806i0, 0, (int) f10, 0, 0, this.f16805h0, 0, 0);
                            this.V.postOnAnimation(this.f16822z0);
                        }
                    }
                }
                if (!z10 && this.f16816t0 && this.f16813q0 != null) {
                    motionEvent.offsetLocation(-this.f16814r0, -this.f16815s0);
                    this.f16813q0.t(motionEvent);
                    motionEvent.offsetLocation(this.f16814r0, this.f16815s0);
                }
                boolean z11 = this.f16816t0;
                this.f16816t0 = false;
                this.f16813q0 = null;
                VelocityTracker velocityTracker4 = this.f16820x0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f16820x0 = null;
                }
                if (z10 || z11) {
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        vv vvVar = this.f16798a0;
        if (vvVar != null) {
            vvVar.f18905c = (i0() + i10) - vvVar.n();
            vvVar.d = i11;
            vvVar.e = i12;
        }
        qy0 qy0Var = this.X;
        int childCount = qy0Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            jy0 d = qy0Var.d(i13);
            iy0 iy0Var = d.f27592b;
            if (iy0Var instanceof vv) {
                vv vvVar2 = (vv) iy0Var;
                vvVar2.f18905c = ((d.b() + i10) - this.f16806i0) - vvVar2.n();
                vvVar2.d = d.c() + this.f16799b0 + i11;
                vvVar2.e = i12;
            }
        }
    }

    @Override
    public final iy0 c(TL_iv.pageTableCell pagetablecell, int i10) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        int R = wv.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        wv wvVar = this.f17967a;
        SpannableStringBuilder l4 = wvVar.l(richText, R);
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        vv vvVar = new vv(wvVar, l4, i10, alignment);
        vvVar.f18908r = true;
        return vvVar;
    }

    @Override
    public final Paint getHeaderPaint() {
        h0();
        return this.f16809l0;
    }

    @Override
    public final Paint getLinePaint() {
        h0();
        return this.f16807j0;
    }

    @Override
    public final Paint getStripPaint() {
        h0();
        return this.m0;
    }

    public final void h0() {
        int i10;
        int i11;
        if (this.f16807j0 == null) {
            Paint paint = new Paint(1);
            this.f16807j0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.f16807j0.setStrokeWidth(i0.N(0.66f));
            Paint paint2 = new Paint();
            this.f16808k0 = paint2;
            paint2.setStyle(style);
            this.f16808k0.setStrokeWidth(i0.N(0.66f));
            this.f16809l0 = new Paint();
            this.m0 = new Paint();
        }
        wv wvVar = this.f17967a;
        if (wvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.il;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.hl;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D);
        this.f16807j0.setColor(w02);
        this.f16808k0.setColor(w02);
        Paint paint3 = this.f16809l0;
        if (wvVar.E()) {
            i11 = org.telegram.ui.ActionBar.t6.gl;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.fl;
        }
        paint3.setColor(org.telegram.ui.ActionBar.t6.w0(i11, wvVar.D));
        this.m0.setColor(167772160);
    }

    public final int i0() {
        vv vvVar = this.f16798a0;
        if (vvVar == null) {
            return 0;
        }
        int i10 = this.f16803f0;
        int i11 = vvVar.h;
        int i12 = vvVar.f18906f;
        return Math.round(((i10 - (i11 - i12)) / 2.0f) - i12);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        ru.l(spannableStringBuilder, this.f16798a0, null);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Y;
            if (i10 < arrayList.size()) {
                vv vvVar = (vv) arrayList.get(i10);
                if (vvVar != null && (staticLayout = vvVar.f18904b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append(", ");
                    }
                    spannableStringBuilder.append(staticLayout.getText());
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void p(ArrayList arrayList) {
        ArrayList arrayList2 = this.f16800c0;
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
        int i10;
        int i11;
        jy0 d;
        vv vvVar;
        org.telegram.ui.Components.k5 k5Var;
        qy0 qy0Var;
        int i12;
        int i13;
        li.k kVar;
        int i14;
        org.telegram.ui.Components.k5 k5Var2;
        canvas.save();
        Rect rect = this.f17968b;
        canvas.translate(rect.left, rect.top);
        vv vvVar2 = this.f16798a0;
        if (vvVar2 != null && (k5Var2 = vvVar2.E) != null && !k5Var2.f27728a.isEmpty()) {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, vvVar2.f18904b, vvVar2.E, 0.0f, vvVar2.f18911x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.translate(0.0f, this.f16799b0);
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i15 = 0;
        while (true) {
            if (i15 < size) {
                org.telegram.ui.Components.k5 k5Var3 = ((vv) arrayList.get(i15)).E;
                if (k5Var3 != null && !k5Var3.f27728a.isEmpty()) {
                    wv wvVar = this.f17967a;
                    int i16 = wvVar.S;
                    li.k kVar2 = wvVar.f19350z;
                    int saveLayerAlpha = canvas.saveLayerAlpha(-i16, 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.f16804g0, 255, 31);
                    canvas.save();
                    canvas.translate(-this.f16806i0, 0.0f);
                    qy0 qy0Var2 = this.X;
                    int childCount = qy0Var2.getChildCount();
                    int i17 = 0;
                    while (i17 < childCount) {
                        iy0 iy0Var = qy0Var2.d(i17).f27592b;
                        if (!(iy0Var instanceof vv) || (k5Var = (vvVar = (vv) iy0Var).E) == null || k5Var.f27728a.isEmpty()) {
                            i14 = saveLayerAlpha;
                            qy0Var = qy0Var2;
                            i12 = childCount;
                            i13 = i17;
                            kVar = kVar2;
                        } else {
                            canvas.save();
                            canvas.translate(d.b(), d.c());
                            qy0Var = qy0Var2;
                            i12 = childCount;
                            i13 = i17;
                            kVar = kVar2;
                            i14 = saveLayerAlpha;
                            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, vvVar.f18904b, vvVar.E, 0.0f, vvVar.f18911x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                            canvas.restore();
                        }
                        i17 = i13 + 1;
                        kVar2 = kVar;
                        qy0Var2 = qy0Var;
                        childCount = i12;
                        saveLayerAlpha = i14;
                    }
                    int i18 = saveLayerAlpha;
                    li.k kVar3 = kVar2;
                    canvas.restore();
                    RectF rectF = i0.P;
                    rectF.set(-wvVar.S, 0.0f, i0.L(12.0f) + i10, this.f16804g0);
                    kVar3.o(canvas, rectF, 0, 1.0f);
                    rectF.set(i11 - i0.L(12.0f), 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.f16804g0);
                    kVar3.o(canvas, rectF, 2, 1.0f);
                    canvas.restoreToCount(i18);
                    z11 = true;
                } else {
                    i15++;
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
        int i10;
        int i11;
        jv jvVar;
        float f7;
        int i12;
        qy0 qy0Var;
        int i13;
        int i14;
        int i15;
        float f10;
        xh0 xh0Var = this.K;
        if (xh0Var != null && xh0Var.h) {
            ArrayList arrayList = this.f16800c0;
            if (!arrayList.isEmpty() && xh0Var.d((vh0) arrayList.get(0)) >= 0) {
                float c10 = xh0Var.c((vh0) arrayList.get(0));
                float f11 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.f17968b;
                canvas.translate(rect.left, rect.top);
                vv vvVar = this.f16798a0;
                if (vvVar != null) {
                    canvas.save();
                    canvas.translate(i0(), 0.0f);
                    vvVar.d(canvas, vvVar.S);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.f16799b0);
                wv wvVar = this.f17967a;
                int i16 = wvVar.S;
                li.k kVar = wvVar.f19350z;
                float f12 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i16, 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.f16804g0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.f16806i0, 0.0f);
                qy0 qy0Var2 = this.X;
                int childCount = qy0Var2.getChildCount();
                int i17 = 0;
                int i18 = 0;
                while (i17 < childCount) {
                    float f13 = f12;
                    jy0 d = qy0Var2.d(i17);
                    if (i18 < arrayList.size() && ((jv) arrayList.get(i18)).f16516a == d) {
                        jvVar = (jv) arrayList.get(i18);
                        i18++;
                    } else {
                        jvVar = null;
                    }
                    int i19 = i18;
                    if (jvVar == null) {
                        d.a(canvas, this.V, true);
                    } else if (!xh0Var.i(jvVar)) {
                        d.a(canvas, this.V, false);
                    } else {
                        if (xh0Var.g(jvVar)) {
                            d.a(canvas, this.V, false);
                            if (d.f27592b instanceof vv) {
                                canvas.save();
                                f7 = f11;
                                canvas.translate(d.b(), d.c());
                                vv vvVar2 = (vv) d.f27592b;
                                if (xh0Var.g(jvVar)) {
                                    i15 = xh0Var.e;
                                } else {
                                    i15 = -1;
                                }
                                if (xh0Var.g(jvVar)) {
                                    f10 = xh0Var.f43377f;
                                } else {
                                    f10 = f7;
                                }
                                vvVar2.m(canvas, i15, f10);
                                canvas.restore();
                            } else {
                                f7 = f11;
                            }
                        } else {
                            f7 = f11;
                            float c11 = xh0Var.c(jvVar);
                            if (c11 >= 1.0f) {
                                d.a(canvas, this.V, true);
                            } else {
                                if (c11 > f7 && d.f27592b != null) {
                                    d.a(canvas, this.V, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    qy0Var = qy0Var2;
                                    i14 = i17;
                                    i12 = saveLayerAlpha;
                                    i13 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.f27598k, d.f27599l, (int) (c11 * f13), 31);
                                    d.f27592b.d(canvas, this.V);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                } else {
                                    i12 = saveLayerAlpha;
                                    qy0Var = qy0Var2;
                                    i13 = childCount;
                                    i14 = i17;
                                    d.a(canvas, this.V, false);
                                }
                                i17 = i14 + 1;
                                saveLayerAlpha = i12;
                                f12 = f13;
                                i18 = i19;
                                f11 = f7;
                                childCount = i13;
                                qy0Var2 = qy0Var;
                            }
                        }
                        i12 = saveLayerAlpha;
                        qy0Var = qy0Var2;
                        i13 = childCount;
                        i14 = i17;
                        i17 = i14 + 1;
                        saveLayerAlpha = i12;
                        f12 = f13;
                        i18 = i19;
                        f11 = f7;
                        childCount = i13;
                        qy0Var2 = qy0Var;
                    }
                    qy0Var = qy0Var2;
                    i13 = childCount;
                    i14 = i17;
                    f7 = f11;
                    i12 = saveLayerAlpha;
                    i17 = i14 + 1;
                    saveLayerAlpha = i12;
                    f12 = f13;
                    i18 = i19;
                    f11 = f7;
                    childCount = i13;
                    qy0Var2 = qy0Var;
                }
                float f14 = f11;
                int i20 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = i0.P;
                rectF.set(-wvVar.S, f14, i0.L(12.0f) + i10, this.f16804g0);
                kVar.o(canvas, rectF, 0, 1.0f);
                rectF.set(i11 - i0.L(12.0f), 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.f16804g0);
                kVar.o(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i20);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        jy0 d;
        vv vvVar;
        Rect rect = this.f17968b;
        vv vvVar2 = this.f16798a0;
        if (vvVar2 != null && vvVar2.o(characterStyle, iuVar)) {
            iuVar.e = (i0() + rect.left) - vvVar2.n();
            iuVar.f16348f = i10 + rect.top;
            return true;
        }
        qy0 qy0Var = this.X;
        int childCount = qy0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            iy0 iy0Var = qy0Var.d(i11).f27592b;
            if (iy0Var instanceof vv) {
                if (((vv) iy0Var).o(characterStyle, iuVar)) {
                    iuVar.e = ((d.b() + rect.left) - this.f16806i0) - vvVar.n();
                    iuVar.f16348f = d.c() + i10 + rect.top + this.f16799b0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(iy0 iy0Var, int i10) {
    }
}
