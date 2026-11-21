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
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.wg0;
import org.telegram.ui.yg0;
public final class su extends zt implements xx0 {
    public final j6.o A0;
    public final TL_iv.pageBlockTable X;
    public final yx0 Y;
    public final ArrayList Z;
    public final org.telegram.ui.Cells.u9[] f26887a0;
    public final dv f26888b0;
    public final int f26889c0;
    public final ArrayList f26890d0;
    public final int f26891e0;
    public final int f26892f0;
    public int f26893g0;
    public int f26894h0;
    public final int f26895i0;
    public int f26896j0;
    public Paint f26897k0;
    public Paint f26898l0;
    public Paint m0;
    public Paint f26899n0;
    public float f26900o0;
    public int f26901p0;
    public boolean f26902q0;
    public dv f26903r0;
    public float f26904s0;
    public float f26905t0;
    public boolean f26906u0;
    public int f26907v0;
    public int f26908w0;
    public int f26909x0;
    public VelocityTracker f26910y0;
    public OverScroller f26911z0;

    public su(ev evVar, Rect rect, int i7, TL_iv.pageBlockTable pageblocktable) {
        super(evVar, rect, i7);
        float f10;
        int i10;
        int i11;
        int max;
        this.Z = new ArrayList();
        this.f26890d0 = new ArrayList();
        this.A0 = new j6.o(this, 15);
        Rect rect2 = this.f28378b;
        rect2.top = g0.L(10.0f) + rect2.top;
        this.X = pageblocktable;
        this.f26891e0 = this.f28379c;
        yx0 yx0Var = new yx0(t0.f26941b, this, null);
        this.Y = yx0Var;
        yx0Var.setOrientation(0);
        yx0Var.setRowOrderPreserved(true);
        yx0Var.setDrawLines(pageblocktable.bordered);
        yx0Var.setStriped(pageblocktable.striped);
        yx0Var.setRtl(evVar.I());
        yx0Var.setFillWidth(false);
        yx0Var.setBalancedColumns(true);
        if (pageblocktable.compact) {
            int L = g0.L(5.0f);
            int L2 = g0.L(5.0f);
            int L3 = g0.L(5.0f);
            if (yx0Var.f42596w != L || yx0Var.f42594r != L2 || yx0Var.f42595s != L3) {
                yx0Var.f42596w = L;
                yx0Var.f42594r = L2;
                yx0Var.f42595s = L3;
                yx0Var.requestLayout();
            }
        }
        if (pageblocktable.compact) {
            f10 = 18.0f;
        } else {
            f10 = 36.0f;
        }
        yx0Var.setMinimumCellHeight(g0.L(f10));
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
        this.Y.measure(View.MeasureSpec.makeMeasureSpec(this.f28379c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.Y.getMeasuredWidth();
        this.f26894h0 = this.Y.getMeasuredHeight();
        this.f26895i0 = Math.max(0, measuredWidth - this.f26891e0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(ev.x(richText))) {
            dv dvVar = new dv(evVar, evVar.l(pageblocktable.title, ev.R(0, 15)), this.f26891e0, Layout.Alignment.ALIGN_CENTER);
            this.f26888b0 = dvVar;
            dvVar.f23610r = true;
            this.f26889c0 = g0.L(9.0f) + dvVar.f23605b.getHeight();
        } else {
            this.f26888b0 = null;
            this.f26889c0 = 0;
        }
        dv dvVar2 = this.f26888b0;
        if (dvVar2 != null) {
            i11 = dvVar2.r();
        } else {
            i11 = 0;
        }
        if (evVar.D()) {
            max = Math.max(0, this.f26891e0);
        } else {
            max = Math.max(0, Math.min(this.f26891e0, Math.max(measuredWidth, i11)));
        }
        this.f26892f0 = max;
        this.f26893g0 = max;
        for (int i19 = 0; i19 < this.Y.getChildCount(); i19++) {
            rx0 d = this.Y.d(i19);
            qx0 qx0Var = d.f39360b;
            if (qx0Var instanceof dv) {
                this.Z.add((dv) qx0Var);
                this.f26890d0.add(new ru(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        dv dvVar3 = this.f26888b0;
        if (dvVar3 != null) {
            arrayList.add(dvVar3);
        }
        arrayList.addAll(this.Z);
        this.f26887a0 = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override
    public final int I() {
        Rect rect = this.f28378b;
        return g0.L(10.0f) + rect.top + this.f26889c0 + this.f26894h0 + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f28378b;
        return rect.left + this.f26892f0 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
        return this.f26887a0;
    }

    @Override
    public final boolean Q() {
        if (!this.f26902q0) {
            OverScroller overScroller = this.f26911z0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void T() {
        dv dvVar = this.f26888b0;
        if (dvVar != null) {
            dvVar.i(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((dv) obj).i(this.W);
        }
    }

    @Override
    public final void V() {
        dv dvVar = this.f26888b0;
        if (dvVar != null) {
            dvVar.f(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((dv) obj).f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        dv dvVar = this.f26888b0;
        if (dvVar != null) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            dvVar.d(canvas, dvVar.T);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.f26889c0);
        ev evVar = this.f28377a;
        int i11 = evVar.S;
        h6.m mVar = evVar.f23817z;
        Rect rect = this.f28378b;
        canvas.saveLayerAlpha(-i11, 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26894h0, 255, 31);
        canvas.save();
        canvas.translate(-this.f26896j0, 0.0f);
        yx0 yx0Var = this.Y;
        int childCount = yx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            yx0Var.d(i12).a(canvas, this.W, true);
        }
        canvas.restore();
        RectF rectF = g0.P;
        rectF.set(-evVar.S, 0.0f, g0.L(12.0f) + i7, this.f26894h0);
        mVar.n(canvas, rectF, 0, 1.0f);
        rectF.set(i10 - g0.L(12.0f), 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26894h0);
        mVar.n(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int i7;
        int i10;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i11 = this.f26895i0;
        rx0 rx0Var = null;
        int i12 = 0;
        if (actionMasked == 0) {
            if (this.f26907v0 == 0 && (view = this.W) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.f26907v0 = viewConfiguration.getScaledTouchSlop();
                this.f26908w0 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f26909x0 = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.f26911z0 == null && this.W != null) {
                this.f26911z0 = new OverScroller(this.W.getContext());
            }
            OverScroller overScroller = this.f26911z0;
            if (overScroller != null && !overScroller.isFinished()) {
                this.f26911z0.forceFinished(true);
            }
            this.f26900o0 = motionEvent.getX();
            motionEvent.getY();
            this.f26901p0 = this.f26896j0;
            this.f26902q0 = false;
            VelocityTracker velocityTracker2 = this.f26910y0;
            if (velocityTracker2 == null) {
                this.f26910y0 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f26910y0.addMovement(motionEvent);
            this.f26903r0 = null;
            this.f26906u0 = false;
            int i13 = this.f26889c0;
            dv dvVar = this.f26888b0;
            if (dvVar != null && motionEvent.getY() < i13) {
                float j02 = j0();
                motionEvent.offsetLocation(-j02, 0.0f);
                boolean t6 = dvVar.t(motionEvent);
                motionEvent.offsetLocation(j02, 0.0f);
                if (t6) {
                    this.f26903r0 = dvVar;
                    this.f26904s0 = j02;
                    this.f26905t0 = 0.0f;
                    this.f26906u0 = true;
                }
            }
            if (!this.f26906u0) {
                float x10 = motionEvent.getX();
                float f10 = x10 + this.f26896j0;
                float y10 = motionEvent.getY() - i13;
                yx0 yx0Var = this.Y;
                int childCount = yx0Var.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= childCount) {
                        break;
                    }
                    rx0 d = yx0Var.d(i14);
                    if (d.f39360b instanceof dv) {
                        if (f10 >= d.f39372p && f10 < i7 + d.f39367k) {
                            if (y10 >= d.f39373q && y10 < i10 + d.f39368l) {
                                rx0Var = d;
                                break;
                            }
                        }
                    }
                    i14++;
                }
                if (rx0Var != null) {
                    this.f26903r0 = (dv) rx0Var.f39360b;
                    this.f26904s0 = rx0Var.b() - this.f26896j0;
                    this.f26905t0 = rx0Var.c() + i13;
                    this.f26903r0.S.set(rx0Var.f39372p - rx0Var.b(), rx0Var.f39373q - rx0Var.c(), (rx0Var.f39372p + rx0Var.f39367k) - rx0Var.b(), (rx0Var.f39373q + rx0Var.f39368l) - rx0Var.c());
                    motionEvent.offsetLocation(-this.f26904s0, -this.f26905t0);
                    this.f26906u0 = this.f26903r0.t(motionEvent);
                    motionEvent.offsetLocation(this.f26904s0, this.f26905t0);
                }
            }
            if (this.f26906u0 || i11 > 0) {
                return true;
            }
            return false;
        }
        if (actionMasked == 2) {
            VelocityTracker velocityTracker3 = this.f26910y0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x11 = motionEvent.getX() - this.f26900o0;
            if (!this.f26902q0 && i11 > 0 && Math.abs(x11) > this.f26907v0) {
                this.f26902q0 = true;
                a0(true);
                if (this.f26906u0 && this.f26903r0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.f26904s0, -this.f26905t0);
                    this.f26903r0.t(obtain);
                    obtain.recycle();
                    this.f26906u0 = false;
                }
            }
            if (this.f26902q0) {
                int i15 = (int) (this.f26901p0 - x11);
                if (i15 >= 0) {
                    i12 = i15;
                }
                if (i12 <= i11) {
                    i11 = i12;
                }
                if (i11 != this.f26896j0) {
                    this.f26896j0 = i11;
                    Z(this.T, this.U, this.V);
                    View view2 = this.W;
                    if (view2 != null) {
                        view2.invalidate();
                        return true;
                    }
                }
            } else {
                return this.f26906u0;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f26902q0;
                this.f26902q0 = false;
                if (z10) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.f26910y0) != null && this.f26911z0 != null && this.W != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f26910y0.computeCurrentVelocity(1000, this.f26909x0);
                        float f11 = -this.f26910y0.getXVelocity();
                        if (Math.abs(f11) > this.f26908w0) {
                            this.f26911z0.fling(this.f26896j0, 0, (int) f11, 0, 0, this.f26895i0, 0, 0);
                            this.W.postOnAnimation(this.A0);
                        }
                    }
                }
                if (!z10 && this.f26906u0 && this.f26903r0 != null) {
                    motionEvent.offsetLocation(-this.f26904s0, -this.f26905t0);
                    this.f26903r0.t(motionEvent);
                    motionEvent.offsetLocation(this.f26904s0, this.f26905t0);
                }
                boolean z11 = this.f26906u0;
                this.f26906u0 = false;
                this.f26903r0 = null;
                VelocityTracker velocityTracker4 = this.f26910y0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f26910y0 = null;
                }
                if (z10 || z11) {
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        dv dvVar = this.f26888b0;
        if (dvVar != null) {
            dvVar.f23606c = (j0() + i7) - dvVar.n();
            dvVar.d = i10;
            dvVar.f23607e = i11;
        }
        yx0 yx0Var = this.Y;
        int childCount = yx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            rx0 d = yx0Var.d(i12);
            qx0 qx0Var = d.f39360b;
            if (qx0Var instanceof dv) {
                dv dvVar2 = (dv) qx0Var;
                dvVar2.f23606c = ((d.b() + i7) - this.f26896j0) - dvVar2.n();
                dvVar2.d = d.c() + this.f26889c0 + i10;
                dvVar2.f23607e = i11;
            }
        }
    }

    @Override
    public final qx0 c(TL_iv.pageTableCell pagetablecell, int i7) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        int R = ev.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        ev evVar = this.f28377a;
        SpannableStringBuilder l10 = evVar.l(richText, R);
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        dv dvVar = new dv(evVar, l10, i7, alignment);
        dvVar.f23610r = true;
        return dvVar;
    }

    @Override
    public final Paint getHeaderPaint() {
        i0();
        return this.m0;
    }

    @Override
    public final Paint getLinePaint() {
        i0();
        return this.f26897k0;
    }

    @Override
    public final Paint getStripPaint() {
        i0();
        return this.f26899n0;
    }

    public final void i0() {
        int i7;
        int i10;
        if (this.f26897k0 == null) {
            Paint paint = new Paint(1);
            this.f26897k0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.f26897k0.setStrokeWidth(g0.N(0.66f));
            Paint paint2 = new Paint();
            this.f26898l0 = paint2;
            paint2.setStyle(style);
            this.f26898l0.setStrokeWidth(g0.N(0.66f));
            this.m0 = new Paint();
            this.f26899n0 = new Paint();
        }
        ev evVar = this.f28377a;
        if (evVar.E()) {
            i7 = org.telegram.ui.ActionBar.m6.ll;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.kl;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, evVar.D);
        this.f26897k0.setColor(w02);
        this.f26898l0.setColor(w02);
        Paint paint3 = this.m0;
        if (evVar.E()) {
            i10 = org.telegram.ui.ActionBar.m6.jl;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.il;
        }
        paint3.setColor(org.telegram.ui.ActionBar.m6.w0(i10, evVar.D));
        this.f26899n0.setColor(167772160);
    }

    public final int j0() {
        dv dvVar = this.f26888b0;
        if (dvVar == null) {
            return 0;
        }
        int i7 = this.f26893g0;
        int i10 = dvVar.h;
        int i11 = dvVar.f23608f;
        return Math.round(((i7 - (i10 - i11)) / 2.0f) - i11);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        zt.l(spannableStringBuilder, this.f26888b0, null);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i7 < arrayList.size()) {
                dv dvVar = (dv) arrayList.get(i7);
                if (dvVar != null && (staticLayout = dvVar.f23605b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append(", ");
                    }
                    spannableStringBuilder.append(staticLayout.getText());
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void p(ArrayList arrayList) {
        ArrayList arrayList2 = this.f26890d0;
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
        int i7;
        int i10;
        rx0 d;
        dv dvVar;
        org.telegram.ui.Components.u5 u5Var;
        yx0 yx0Var;
        int i11;
        int i12;
        h6.m mVar;
        int i13;
        org.telegram.ui.Components.u5 u5Var2;
        canvas.save();
        Rect rect = this.f28378b;
        canvas.translate(rect.left, rect.top);
        dv dvVar2 = this.f26888b0;
        if (dvVar2 != null && (u5Var2 = dvVar2.F) != null && !u5Var2.f40269a.isEmpty()) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, dvVar2.f23605b, dvVar2.F, 0.0f, dvVar2.f23613x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.translate(0.0f, this.f26889c0);
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                org.telegram.ui.Components.u5 u5Var3 = ((dv) arrayList.get(i14)).F;
                if (u5Var3 != null && !u5Var3.f40269a.isEmpty()) {
                    ev evVar = this.f28377a;
                    int i15 = evVar.S;
                    h6.m mVar2 = evVar.f23817z;
                    int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26894h0, 255, 31);
                    canvas.save();
                    canvas.translate(-this.f26896j0, 0.0f);
                    yx0 yx0Var2 = this.Y;
                    int childCount = yx0Var2.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount) {
                        qx0 qx0Var = yx0Var2.d(i16).f39360b;
                        if (!(qx0Var instanceof dv) || (u5Var = (dvVar = (dv) qx0Var).F) == null || u5Var.f40269a.isEmpty()) {
                            i13 = saveLayerAlpha;
                            yx0Var = yx0Var2;
                            i11 = childCount;
                            i12 = i16;
                            mVar = mVar2;
                        } else {
                            canvas.save();
                            canvas.translate(d.b(), d.c());
                            yx0Var = yx0Var2;
                            i11 = childCount;
                            i12 = i16;
                            mVar = mVar2;
                            i13 = saveLayerAlpha;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, dvVar.f23605b, dvVar.F, 0.0f, dvVar.f23613x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                            canvas.restore();
                        }
                        i16 = i12 + 1;
                        mVar2 = mVar;
                        yx0Var2 = yx0Var;
                        childCount = i11;
                        saveLayerAlpha = i13;
                    }
                    int i17 = saveLayerAlpha;
                    h6.m mVar3 = mVar2;
                    canvas.restore();
                    RectF rectF = g0.P;
                    rectF.set(-evVar.S, 0.0f, g0.L(12.0f) + i7, this.f26894h0);
                    mVar3.n(canvas, rectF, 0, 1.0f);
                    rectF.set(i10 - g0.L(12.0f), 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26894h0);
                    mVar3.n(canvas, rectF, 2, 1.0f);
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
        int i7;
        int i10;
        ru ruVar;
        float f10;
        int i11;
        yx0 yx0Var;
        int i12;
        int i13;
        int i14;
        float f11;
        yg0 yg0Var = this.L;
        if (yg0Var != null && yg0Var.h) {
            ArrayList arrayList = this.f26890d0;
            if (!arrayList.isEmpty() && yg0Var.d((wg0) arrayList.get(0)) >= 0) {
                float c10 = yg0Var.c((wg0) arrayList.get(0));
                float f12 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.f28378b;
                canvas.translate(rect.left, rect.top);
                dv dvVar = this.f26888b0;
                if (dvVar != null) {
                    canvas.save();
                    canvas.translate(j0(), 0.0f);
                    dvVar.d(canvas, dvVar.T);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.f26889c0);
                ev evVar = this.f28377a;
                int i15 = evVar.S;
                h6.m mVar = evVar.f23817z;
                float f13 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26894h0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.f26896j0, 0.0f);
                yx0 yx0Var2 = this.Y;
                int childCount = yx0Var2.getChildCount();
                int i16 = 0;
                int i17 = 0;
                while (i16 < childCount) {
                    float f14 = f13;
                    rx0 d = yx0Var2.d(i16);
                    if (i17 < arrayList.size() && ((ru) arrayList.get(i17)).f26724a == d) {
                        ruVar = (ru) arrayList.get(i17);
                        i17++;
                    } else {
                        ruVar = null;
                    }
                    int i18 = i17;
                    if (ruVar == null) {
                        d.a(canvas, this.W, true);
                    } else if (!yg0Var.i(ruVar)) {
                        d.a(canvas, this.W, false);
                    } else {
                        if (yg0Var.g(ruVar)) {
                            d.a(canvas, this.W, false);
                            if (d.f39360b instanceof dv) {
                                canvas.save();
                                f10 = f12;
                                canvas.translate(d.b(), d.c());
                                dv dvVar2 = (dv) d.f39360b;
                                if (yg0Var.g(ruVar)) {
                                    i14 = yg0Var.f54194e;
                                } else {
                                    i14 = -1;
                                }
                                if (yg0Var.g(ruVar)) {
                                    f11 = yg0Var.f54195f;
                                } else {
                                    f11 = f10;
                                }
                                dvVar2.m(canvas, i14, f11);
                                canvas.restore();
                            } else {
                                f10 = f12;
                            }
                        } else {
                            f10 = f12;
                            float c11 = yg0Var.c(ruVar);
                            if (c11 >= 1.0f) {
                                d.a(canvas, this.W, true);
                            } else {
                                if (c11 > f10 && d.f39360b != null) {
                                    d.a(canvas, this.W, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    yx0Var = yx0Var2;
                                    i13 = i16;
                                    i11 = saveLayerAlpha;
                                    i12 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.f39367k, d.f39368l, (int) (c11 * f14), 31);
                                    d.f39360b.d(canvas, this.W);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                } else {
                                    i11 = saveLayerAlpha;
                                    yx0Var = yx0Var2;
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
                                yx0Var2 = yx0Var;
                            }
                        }
                        i11 = saveLayerAlpha;
                        yx0Var = yx0Var2;
                        i12 = childCount;
                        i13 = i16;
                        i16 = i13 + 1;
                        saveLayerAlpha = i11;
                        f13 = f14;
                        i17 = i18;
                        f12 = f10;
                        childCount = i12;
                        yx0Var2 = yx0Var;
                    }
                    yx0Var = yx0Var2;
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
                    yx0Var2 = yx0Var;
                }
                float f15 = f12;
                int i19 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-evVar.S, f15, g0.L(12.0f) + i7, this.f26894h0);
                mVar.n(canvas, rectF, 0, 1.0f);
                rectF.set(i10 - g0.L(12.0f), 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26894h0);
                mVar.n(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i19);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        rx0 d;
        dv dvVar;
        Rect rect = this.f28378b;
        dv dvVar2 = this.f26888b0;
        if (dvVar2 != null && dvVar2.o(characterStyle, qtVar)) {
            qtVar.f26478e = (j0() + rect.left) - dvVar2.n();
            qtVar.f26479f = i7 + rect.top;
            return true;
        }
        yx0 yx0Var = this.Y;
        int childCount = yx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            qx0 qx0Var = yx0Var.d(i10).f39360b;
            if (qx0Var instanceof dv) {
                if (((dv) qx0Var).o(characterStyle, qtVar)) {
                    qtVar.f26478e = ((d.b() + rect.left) - this.f26896j0) - dvVar.n();
                    qtVar.f26479f = d.c() + i7 + rect.top + this.f26889c0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(qx0 qx0Var, int i7) {
    }
}
