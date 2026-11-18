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
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.wg0;
import org.telegram.ui.yg0;
public final class su extends zt implements vx0 {
    public final j6.o A0;
    public final TL_iv.pageBlockTable X;
    public final wx0 Y;
    public final ArrayList Z;
    public final org.telegram.ui.Cells.u9[] f26859a0;
    public final dv f26860b0;
    public final int f26861c0;
    public final ArrayList f26862d0;
    public final int f26863e0;
    public final int f26864f0;
    public int f26865g0;
    public int f26866h0;
    public final int f26867i0;
    public int f26868j0;
    public Paint f26869k0;
    public Paint f26870l0;
    public Paint m0;
    public Paint f26871n0;
    public float f26872o0;
    public int f26873p0;
    public boolean f26874q0;
    public dv f26875r0;
    public float f26876s0;
    public float f26877t0;
    public boolean f26878u0;
    public int f26879v0;
    public int f26880w0;
    public int f26881x0;
    public VelocityTracker f26882y0;
    public OverScroller f26883z0;

    public su(ev evVar, Rect rect, int i7, TL_iv.pageBlockTable pageblocktable) {
        super(evVar, rect, i7);
        float f10;
        int i10;
        int i11;
        int max;
        this.Z = new ArrayList();
        this.f26862d0 = new ArrayList();
        this.A0 = new j6.o(this, 15);
        Rect rect2 = this.f28350b;
        rect2.top = g0.L(10.0f) + rect2.top;
        this.X = pageblocktable;
        this.f26863e0 = this.f28351c;
        wx0 wx0Var = new wx0(t0.f26913b, this, null);
        this.Y = wx0Var;
        wx0Var.setOrientation(0);
        wx0Var.setRowOrderPreserved(true);
        wx0Var.setDrawLines(pageblocktable.bordered);
        wx0Var.setStriped(pageblocktable.striped);
        wx0Var.setRtl(evVar.I());
        wx0Var.setFillWidth(false);
        wx0Var.setBalancedColumns(true);
        if (pageblocktable.compact) {
            int L = g0.L(5.0f);
            int L2 = g0.L(5.0f);
            int L3 = g0.L(5.0f);
            if (wx0Var.f41812w != L || wx0Var.f41810r != L2 || wx0Var.f41811s != L3) {
                wx0Var.f41812w = L;
                wx0Var.f41810r = L2;
                wx0Var.f41811s = L3;
                wx0Var.requestLayout();
            }
        }
        if (pageblocktable.compact) {
            f10 = 18.0f;
        } else {
            f10 = 36.0f;
        }
        wx0Var.setMinimumCellHeight(g0.L(f10));
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
        this.Y.measure(View.MeasureSpec.makeMeasureSpec(this.f28351c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.Y.getMeasuredWidth();
        this.f26866h0 = this.Y.getMeasuredHeight();
        this.f26867i0 = Math.max(0, measuredWidth - this.f26863e0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(ev.x(richText))) {
            dv dvVar = new dv(evVar, evVar.l(pageblocktable.title, ev.R(0, 15)), this.f26863e0, Layout.Alignment.ALIGN_CENTER);
            this.f26860b0 = dvVar;
            dvVar.f23582r = true;
            this.f26861c0 = g0.L(9.0f) + dvVar.f23577b.getHeight();
        } else {
            this.f26860b0 = null;
            this.f26861c0 = 0;
        }
        dv dvVar2 = this.f26860b0;
        if (dvVar2 != null) {
            i11 = dvVar2.r();
        } else {
            i11 = 0;
        }
        if (evVar.D()) {
            max = Math.max(0, this.f26863e0);
        } else {
            max = Math.max(0, Math.min(this.f26863e0, Math.max(measuredWidth, i11)));
        }
        this.f26864f0 = max;
        this.f26865g0 = max;
        for (int i19 = 0; i19 < this.Y.getChildCount(); i19++) {
            px0 d = this.Y.d(i19);
            ox0 ox0Var = d.f38593b;
            if (ox0Var instanceof dv) {
                this.Z.add((dv) ox0Var);
                this.f26862d0.add(new ru(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        dv dvVar3 = this.f26860b0;
        if (dvVar3 != null) {
            arrayList.add(dvVar3);
        }
        arrayList.addAll(this.Z);
        this.f26859a0 = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override
    public final int I() {
        Rect rect = this.f28350b;
        return g0.L(10.0f) + rect.top + this.f26861c0 + this.f26866h0 + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f28350b;
        return rect.left + this.f26864f0 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
        return this.f26859a0;
    }

    @Override
    public final boolean Q() {
        if (!this.f26874q0) {
            OverScroller overScroller = this.f26883z0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void T() {
        dv dvVar = this.f26860b0;
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
        dv dvVar = this.f26860b0;
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
        dv dvVar = this.f26860b0;
        if (dvVar != null) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            dvVar.d(canvas, dvVar.T);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.f26861c0);
        ev evVar = this.f28349a;
        int i11 = evVar.S;
        h6.m mVar = evVar.f23789z;
        Rect rect = this.f28350b;
        canvas.saveLayerAlpha(-i11, 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26866h0, 255, 31);
        canvas.save();
        canvas.translate(-this.f26868j0, 0.0f);
        wx0 wx0Var = this.Y;
        int childCount = wx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            wx0Var.d(i12).a(canvas, this.W, true);
        }
        canvas.restore();
        RectF rectF = g0.P;
        rectF.set(-evVar.S, 0.0f, g0.L(12.0f) + i7, this.f26866h0);
        mVar.n(canvas, rectF, 0, 1.0f);
        rectF.set(i10 - g0.L(12.0f), 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26866h0);
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
        int i11 = this.f26867i0;
        px0 px0Var = null;
        int i12 = 0;
        if (actionMasked == 0) {
            if (this.f26879v0 == 0 && (view = this.W) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.f26879v0 = viewConfiguration.getScaledTouchSlop();
                this.f26880w0 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f26881x0 = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.f26883z0 == null && this.W != null) {
                this.f26883z0 = new OverScroller(this.W.getContext());
            }
            OverScroller overScroller = this.f26883z0;
            if (overScroller != null && !overScroller.isFinished()) {
                this.f26883z0.forceFinished(true);
            }
            this.f26872o0 = motionEvent.getX();
            motionEvent.getY();
            this.f26873p0 = this.f26868j0;
            this.f26874q0 = false;
            VelocityTracker velocityTracker2 = this.f26882y0;
            if (velocityTracker2 == null) {
                this.f26882y0 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f26882y0.addMovement(motionEvent);
            this.f26875r0 = null;
            this.f26878u0 = false;
            int i13 = this.f26861c0;
            dv dvVar = this.f26860b0;
            if (dvVar != null && motionEvent.getY() < i13) {
                float j02 = j0();
                motionEvent.offsetLocation(-j02, 0.0f);
                boolean t6 = dvVar.t(motionEvent);
                motionEvent.offsetLocation(j02, 0.0f);
                if (t6) {
                    this.f26875r0 = dvVar;
                    this.f26876s0 = j02;
                    this.f26877t0 = 0.0f;
                    this.f26878u0 = true;
                }
            }
            if (!this.f26878u0) {
                float x10 = motionEvent.getX();
                float f10 = x10 + this.f26868j0;
                float y10 = motionEvent.getY() - i13;
                wx0 wx0Var = this.Y;
                int childCount = wx0Var.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= childCount) {
                        break;
                    }
                    px0 d = wx0Var.d(i14);
                    if (d.f38593b instanceof dv) {
                        if (f10 >= d.f38605p && f10 < i7 + d.f38600k) {
                            if (y10 >= d.f38606q && y10 < i10 + d.f38601l) {
                                px0Var = d;
                                break;
                            }
                        }
                    }
                    i14++;
                }
                if (px0Var != null) {
                    this.f26875r0 = (dv) px0Var.f38593b;
                    this.f26876s0 = px0Var.b() - this.f26868j0;
                    this.f26877t0 = px0Var.c() + i13;
                    this.f26875r0.S.set(px0Var.f38605p - px0Var.b(), px0Var.f38606q - px0Var.c(), (px0Var.f38605p + px0Var.f38600k) - px0Var.b(), (px0Var.f38606q + px0Var.f38601l) - px0Var.c());
                    motionEvent.offsetLocation(-this.f26876s0, -this.f26877t0);
                    this.f26878u0 = this.f26875r0.t(motionEvent);
                    motionEvent.offsetLocation(this.f26876s0, this.f26877t0);
                }
            }
            if (this.f26878u0 || i11 > 0) {
                return true;
            }
            return false;
        }
        if (actionMasked == 2) {
            VelocityTracker velocityTracker3 = this.f26882y0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x11 = motionEvent.getX() - this.f26872o0;
            if (!this.f26874q0 && i11 > 0 && Math.abs(x11) > this.f26879v0) {
                this.f26874q0 = true;
                a0(true);
                if (this.f26878u0 && this.f26875r0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.f26876s0, -this.f26877t0);
                    this.f26875r0.t(obtain);
                    obtain.recycle();
                    this.f26878u0 = false;
                }
            }
            if (this.f26874q0) {
                int i15 = (int) (this.f26873p0 - x11);
                if (i15 >= 0) {
                    i12 = i15;
                }
                if (i12 <= i11) {
                    i11 = i12;
                }
                if (i11 != this.f26868j0) {
                    this.f26868j0 = i11;
                    Z(this.T, this.U, this.V);
                    View view2 = this.W;
                    if (view2 != null) {
                        view2.invalidate();
                        return true;
                    }
                }
            } else {
                return this.f26878u0;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f26874q0;
                this.f26874q0 = false;
                if (z10) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.f26882y0) != null && this.f26883z0 != null && this.W != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f26882y0.computeCurrentVelocity(1000, this.f26881x0);
                        float f11 = -this.f26882y0.getXVelocity();
                        if (Math.abs(f11) > this.f26880w0) {
                            this.f26883z0.fling(this.f26868j0, 0, (int) f11, 0, 0, this.f26867i0, 0, 0);
                            this.W.postOnAnimation(this.A0);
                        }
                    }
                }
                if (!z10 && this.f26878u0 && this.f26875r0 != null) {
                    motionEvent.offsetLocation(-this.f26876s0, -this.f26877t0);
                    this.f26875r0.t(motionEvent);
                    motionEvent.offsetLocation(this.f26876s0, this.f26877t0);
                }
                boolean z11 = this.f26878u0;
                this.f26878u0 = false;
                this.f26875r0 = null;
                VelocityTracker velocityTracker4 = this.f26882y0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f26882y0 = null;
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
        dv dvVar = this.f26860b0;
        if (dvVar != null) {
            dvVar.f23578c = (j0() + i7) - dvVar.n();
            dvVar.d = i10;
            dvVar.f23579e = i11;
        }
        wx0 wx0Var = this.Y;
        int childCount = wx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            px0 d = wx0Var.d(i12);
            ox0 ox0Var = d.f38593b;
            if (ox0Var instanceof dv) {
                dv dvVar2 = (dv) ox0Var;
                dvVar2.f23578c = ((d.b() + i7) - this.f26868j0) - dvVar2.n();
                dvVar2.d = d.c() + this.f26861c0 + i10;
                dvVar2.f23579e = i11;
            }
        }
    }

    @Override
    public final ox0 c(TL_iv.pageTableCell pagetablecell, int i7) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        int R = ev.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        ev evVar = this.f28349a;
        SpannableStringBuilder l10 = evVar.l(richText, R);
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        dv dvVar = new dv(evVar, l10, i7, alignment);
        dvVar.f23582r = true;
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
        return this.f26869k0;
    }

    @Override
    public final Paint getStripPaint() {
        i0();
        return this.f26871n0;
    }

    public final void i0() {
        int i7;
        int i10;
        if (this.f26869k0 == null) {
            Paint paint = new Paint(1);
            this.f26869k0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.f26869k0.setStrokeWidth(g0.N(0.66f));
            Paint paint2 = new Paint();
            this.f26870l0 = paint2;
            paint2.setStyle(style);
            this.f26870l0.setStrokeWidth(g0.N(0.66f));
            this.m0 = new Paint();
            this.f26871n0 = new Paint();
        }
        ev evVar = this.f28349a;
        if (evVar.E()) {
            i7 = org.telegram.ui.ActionBar.n6.ll;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.kl;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, evVar.D);
        this.f26869k0.setColor(w02);
        this.f26870l0.setColor(w02);
        Paint paint3 = this.m0;
        if (evVar.E()) {
            i10 = org.telegram.ui.ActionBar.n6.jl;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.il;
        }
        paint3.setColor(org.telegram.ui.ActionBar.n6.w0(i10, evVar.D));
        this.f26871n0.setColor(167772160);
    }

    public final int j0() {
        dv dvVar = this.f26860b0;
        if (dvVar == null) {
            return 0;
        }
        int i7 = this.f26865g0;
        int i10 = dvVar.h;
        int i11 = dvVar.f23580f;
        return Math.round(((i7 - (i10 - i11)) / 2.0f) - i11);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        zt.l(spannableStringBuilder, this.f26860b0, null);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i7 < arrayList.size()) {
                dv dvVar = (dv) arrayList.get(i7);
                if (dvVar != null && (staticLayout = dvVar.f23577b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
        ArrayList arrayList2 = this.f26862d0;
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
        px0 d;
        dv dvVar;
        org.telegram.ui.Components.t5 t5Var;
        wx0 wx0Var;
        int i11;
        int i12;
        h6.m mVar;
        int i13;
        org.telegram.ui.Components.t5 t5Var2;
        canvas.save();
        Rect rect = this.f28350b;
        canvas.translate(rect.left, rect.top);
        dv dvVar2 = this.f26860b0;
        if (dvVar2 != null && (t5Var2 = dvVar2.F) != null && !t5Var2.f39906a.isEmpty()) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar2.f23577b, dvVar2.F, 0.0f, dvVar2.f23585x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.translate(0.0f, this.f26861c0);
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                org.telegram.ui.Components.t5 t5Var3 = ((dv) arrayList.get(i14)).F;
                if (t5Var3 != null && !t5Var3.f39906a.isEmpty()) {
                    ev evVar = this.f28349a;
                    int i15 = evVar.S;
                    h6.m mVar2 = evVar.f23789z;
                    int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26866h0, 255, 31);
                    canvas.save();
                    canvas.translate(-this.f26868j0, 0.0f);
                    wx0 wx0Var2 = this.Y;
                    int childCount = wx0Var2.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount) {
                        ox0 ox0Var = wx0Var2.d(i16).f38593b;
                        if (!(ox0Var instanceof dv) || (t5Var = (dvVar = (dv) ox0Var).F) == null || t5Var.f39906a.isEmpty()) {
                            i13 = saveLayerAlpha;
                            wx0Var = wx0Var2;
                            i11 = childCount;
                            i12 = i16;
                            mVar = mVar2;
                        } else {
                            canvas.save();
                            canvas.translate(d.b(), d.c());
                            wx0Var = wx0Var2;
                            i11 = childCount;
                            i12 = i16;
                            mVar = mVar2;
                            i13 = saveLayerAlpha;
                            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar.f23577b, dvVar.F, 0.0f, dvVar.f23585x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                            canvas.restore();
                        }
                        i16 = i12 + 1;
                        mVar2 = mVar;
                        wx0Var2 = wx0Var;
                        childCount = i11;
                        saveLayerAlpha = i13;
                    }
                    int i17 = saveLayerAlpha;
                    h6.m mVar3 = mVar2;
                    canvas.restore();
                    RectF rectF = g0.P;
                    rectF.set(-evVar.S, 0.0f, g0.L(12.0f) + i7, this.f26866h0);
                    mVar3.n(canvas, rectF, 0, 1.0f);
                    rectF.set(i10 - g0.L(12.0f), 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26866h0);
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
        wx0 wx0Var;
        int i12;
        int i13;
        int i14;
        float f11;
        yg0 yg0Var = this.L;
        if (yg0Var != null && yg0Var.h) {
            ArrayList arrayList = this.f26862d0;
            if (!arrayList.isEmpty() && yg0Var.d((wg0) arrayList.get(0)) >= 0) {
                float c10 = yg0Var.c((wg0) arrayList.get(0));
                float f12 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.f28350b;
                canvas.translate(rect.left, rect.top);
                dv dvVar = this.f26860b0;
                if (dvVar != null) {
                    canvas.save();
                    canvas.translate(j0(), 0.0f);
                    dvVar.d(canvas, dvVar.T);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.f26861c0);
                ev evVar = this.f28349a;
                int i15 = evVar.S;
                h6.m mVar = evVar.f23789z;
                float f13 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26866h0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.f26868j0, 0.0f);
                wx0 wx0Var2 = this.Y;
                int childCount = wx0Var2.getChildCount();
                int i16 = 0;
                int i17 = 0;
                while (i16 < childCount) {
                    float f14 = f13;
                    px0 d = wx0Var2.d(i16);
                    if (i17 < arrayList.size() && ((ru) arrayList.get(i17)).f26696a == d) {
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
                            if (d.f38593b instanceof dv) {
                                canvas.save();
                                f10 = f12;
                                canvas.translate(d.b(), d.c());
                                dv dvVar2 = (dv) d.f38593b;
                                if (yg0Var.g(ruVar)) {
                                    i14 = yg0Var.f54154e;
                                } else {
                                    i14 = -1;
                                }
                                if (yg0Var.g(ruVar)) {
                                    f11 = yg0Var.f54155f;
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
                                if (c11 > f10 && d.f38593b != null) {
                                    d.a(canvas, this.W, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    wx0Var = wx0Var2;
                                    i13 = i16;
                                    i11 = saveLayerAlpha;
                                    i12 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.f38600k, d.f38601l, (int) (c11 * f14), 31);
                                    d.f38593b.d(canvas, this.W);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                } else {
                                    i11 = saveLayerAlpha;
                                    wx0Var = wx0Var2;
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
                                wx0Var2 = wx0Var;
                            }
                        }
                        i11 = saveLayerAlpha;
                        wx0Var = wx0Var2;
                        i12 = childCount;
                        i13 = i16;
                        i16 = i13 + 1;
                        saveLayerAlpha = i11;
                        f13 = f14;
                        i17 = i18;
                        f12 = f10;
                        childCount = i12;
                        wx0Var2 = wx0Var;
                    }
                    wx0Var = wx0Var2;
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
                    wx0Var2 = wx0Var;
                }
                float f15 = f12;
                int i19 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-evVar.S, f15, g0.L(12.0f) + i7, this.f26866h0);
                mVar.n(canvas, rectF, 0, 1.0f);
                rectF.set(i10 - g0.L(12.0f), 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.f26866h0);
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
        px0 d;
        dv dvVar;
        Rect rect = this.f28350b;
        dv dvVar2 = this.f26860b0;
        if (dvVar2 != null && dvVar2.o(characterStyle, qtVar)) {
            qtVar.f26450e = (j0() + rect.left) - dvVar2.n();
            qtVar.f26451f = i7 + rect.top;
            return true;
        }
        wx0 wx0Var = this.Y;
        int childCount = wx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ox0 ox0Var = wx0Var.d(i10).f38593b;
            if (ox0Var instanceof dv) {
                if (((dv) ox0Var).o(characterStyle, qtVar)) {
                    qtVar.f26450e = ((d.b() + rect.left) - this.f26868j0) - dvVar.n();
                    qtVar.f26451f = d.c() + i7 + rect.top + this.f26861c0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(ox0 ox0Var, int i7) {
    }
}
