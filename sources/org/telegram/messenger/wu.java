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
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.rg0;
import org.telegram.ui.tg0;
public final class wu extends cu implements ox0 {
    public final j6.o A0;
    public final TL_iv.pageBlockTable X;
    public final px0 Y;
    public final ArrayList Z;
    public final org.telegram.ui.Cells.s9[] f27394a0;
    public final hv f27395b0;
    public final int f27396c0;
    public final ArrayList f27397d0;
    public final int f27398e0;
    public final int f27399f0;
    public int f27400g0;
    public int f27401h0;
    public final int f27402i0;
    public int f27403j0;
    public Paint f27404k0;
    public Paint f27405l0;
    public Paint m0;
    public Paint f27406n0;
    public float f27407o0;
    public int f27408p0;
    public boolean f27409q0;
    public hv f27410r0;
    public float f27411s0;
    public float f27412t0;
    public boolean f27413u0;
    public int f27414v0;
    public int f27415w0;
    public int f27416x0;
    public VelocityTracker f27417y0;
    public OverScroller f27418z0;

    public wu(iv ivVar, Rect rect, int i7, TL_iv.pageBlockTable pageblocktable) {
        super(ivVar, rect, i7);
        float f10;
        int i10;
        int i11;
        int max;
        this.Z = new ArrayList();
        this.f27397d0 = new ArrayList();
        this.A0 = new j6.o(this, 15);
        Rect rect2 = this.f22934b;
        rect2.top = g0.L(10.0f) + rect2.top;
        this.X = pageblocktable;
        this.f27398e0 = this.f22935c;
        px0 px0Var = new px0(t0.f26600b, this, null);
        this.Y = px0Var;
        px0Var.setOrientation(0);
        px0Var.setRowOrderPreserved(true);
        px0Var.setDrawLines(pageblocktable.bordered);
        px0Var.setStriped(pageblocktable.striped);
        px0Var.setRtl(ivVar.I());
        px0Var.setFillWidth(false);
        px0Var.setBalancedColumns(true);
        if (pageblocktable.compact) {
            int L = g0.L(5.0f);
            int L2 = g0.L(5.0f);
            int L3 = g0.L(5.0f);
            if (px0Var.f38431w != L || px0Var.f38429r != L2 || px0Var.f38430s != L3) {
                px0Var.f38431w = L;
                px0Var.f38429r = L2;
                px0Var.f38430s = L3;
                px0Var.requestLayout();
            }
        }
        if (pageblocktable.compact) {
            f10 = 18.0f;
        } else {
            f10 = 36.0f;
        }
        px0Var.setMinimumCellHeight(g0.L(f10));
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
        this.Y.measure(View.MeasureSpec.makeMeasureSpec(this.f22935c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.Y.getMeasuredWidth();
        this.f27401h0 = this.Y.getMeasuredHeight();
        this.f27402i0 = Math.max(0, measuredWidth - this.f27398e0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(iv.x(richText))) {
            hv hvVar = new hv(ivVar, ivVar.l(pageblocktable.title, iv.R(0, 15)), this.f27398e0, Layout.Alignment.ALIGN_CENTER);
            this.f27395b0 = hvVar;
            hvVar.f24227r = true;
            this.f27396c0 = g0.L(9.0f) + hvVar.f24222b.getHeight();
        } else {
            this.f27395b0 = null;
            this.f27396c0 = 0;
        }
        hv hvVar2 = this.f27395b0;
        if (hvVar2 != null) {
            i11 = hvVar2.r();
        } else {
            i11 = 0;
        }
        if (ivVar.D()) {
            max = Math.max(0, this.f27398e0);
        } else {
            max = Math.max(0, Math.min(this.f27398e0, Math.max(measuredWidth, i11)));
        }
        this.f27399f0 = max;
        this.f27400g0 = max;
        for (int i19 = 0; i19 < this.Y.getChildCount(); i19++) {
            ix0 d = this.Y.d(i19);
            hx0 hx0Var = d.f35761b;
            if (hx0Var instanceof hv) {
                this.Z.add((hv) hx0Var);
                this.f27397d0.add(new vu(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        hv hvVar3 = this.f27395b0;
        if (hvVar3 != null) {
            arrayList.add(hvVar3);
        }
        arrayList.addAll(this.Z);
        this.f27394a0 = (org.telegram.ui.Cells.s9[]) arrayList.toArray(new org.telegram.ui.Cells.s9[0]);
    }

    @Override
    public final int I() {
        Rect rect = this.f22934b;
        return g0.L(10.0f) + rect.top + this.f27396c0 + this.f27401h0 + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22934b;
        return rect.left + this.f27399f0 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.f27394a0;
    }

    @Override
    public final boolean Q() {
        if (!this.f27409q0) {
            OverScroller overScroller = this.f27418z0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void T() {
        hv hvVar = this.f27395b0;
        if (hvVar != null) {
            hvVar.i(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((hv) obj).i(this.W);
        }
    }

    @Override
    public final void V() {
        hv hvVar = this.f27395b0;
        if (hvVar != null) {
            hvVar.f(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((hv) obj).f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        hv hvVar = this.f27395b0;
        if (hvVar != null) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            hvVar.d(canvas, hvVar.T);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.f27396c0);
        iv ivVar = this.f22933a;
        int i11 = ivVar.S;
        h6.m mVar = ivVar.f24462z;
        Rect rect = this.f22934b;
        canvas.saveLayerAlpha(-i11, 0.0f, ((ivVar.C + ivVar.T) - rect.left) - rect.right, this.f27401h0, 255, 31);
        canvas.save();
        canvas.translate(-this.f27403j0, 0.0f);
        px0 px0Var = this.Y;
        int childCount = px0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            px0Var.d(i12).a(canvas, this.W, true);
        }
        canvas.restore();
        RectF rectF = g0.P;
        rectF.set(-ivVar.S, 0.0f, g0.L(12.0f) + i7, this.f27401h0);
        mVar.m(canvas, rectF, 0, 1.0f);
        rectF.set(i10 - g0.L(12.0f), 0.0f, ((ivVar.C + ivVar.T) - rect.left) - rect.right, this.f27401h0);
        mVar.m(canvas, rectF, 2, 1.0f);
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
        int i11 = this.f27402i0;
        ix0 ix0Var = null;
        int i12 = 0;
        if (actionMasked == 0) {
            if (this.f27414v0 == 0 && (view = this.W) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.f27414v0 = viewConfiguration.getScaledTouchSlop();
                this.f27415w0 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f27416x0 = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.f27418z0 == null && this.W != null) {
                this.f27418z0 = new OverScroller(this.W.getContext());
            }
            OverScroller overScroller = this.f27418z0;
            if (overScroller != null && !overScroller.isFinished()) {
                this.f27418z0.forceFinished(true);
            }
            this.f27407o0 = motionEvent.getX();
            motionEvent.getY();
            this.f27408p0 = this.f27403j0;
            this.f27409q0 = false;
            VelocityTracker velocityTracker2 = this.f27417y0;
            if (velocityTracker2 == null) {
                this.f27417y0 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f27417y0.addMovement(motionEvent);
            this.f27410r0 = null;
            this.f27413u0 = false;
            int i13 = this.f27396c0;
            hv hvVar = this.f27395b0;
            if (hvVar != null && motionEvent.getY() < i13) {
                float j02 = j0();
                motionEvent.offsetLocation(-j02, 0.0f);
                boolean t6 = hvVar.t(motionEvent);
                motionEvent.offsetLocation(j02, 0.0f);
                if (t6) {
                    this.f27410r0 = hvVar;
                    this.f27411s0 = j02;
                    this.f27412t0 = 0.0f;
                    this.f27413u0 = true;
                }
            }
            if (!this.f27413u0) {
                float x10 = motionEvent.getX();
                float f10 = x10 + this.f27403j0;
                float y10 = motionEvent.getY() - i13;
                px0 px0Var = this.Y;
                int childCount = px0Var.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= childCount) {
                        break;
                    }
                    ix0 d = px0Var.d(i14);
                    if (d.f35761b instanceof hv) {
                        if (f10 >= d.f35773p && f10 < i7 + d.f35768k) {
                            if (y10 >= d.f35774q && y10 < i10 + d.f35769l) {
                                ix0Var = d;
                                break;
                            }
                        }
                    }
                    i14++;
                }
                if (ix0Var != null) {
                    this.f27410r0 = (hv) ix0Var.f35761b;
                    this.f27411s0 = ix0Var.b() - this.f27403j0;
                    this.f27412t0 = ix0Var.c() + i13;
                    this.f27410r0.S.set(ix0Var.f35773p - ix0Var.b(), ix0Var.f35774q - ix0Var.c(), (ix0Var.f35773p + ix0Var.f35768k) - ix0Var.b(), (ix0Var.f35774q + ix0Var.f35769l) - ix0Var.c());
                    motionEvent.offsetLocation(-this.f27411s0, -this.f27412t0);
                    this.f27413u0 = this.f27410r0.t(motionEvent);
                    motionEvent.offsetLocation(this.f27411s0, this.f27412t0);
                }
            }
            if (this.f27413u0 || i11 > 0) {
                return true;
            }
            return false;
        }
        if (actionMasked == 2) {
            VelocityTracker velocityTracker3 = this.f27417y0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x11 = motionEvent.getX() - this.f27407o0;
            if (!this.f27409q0 && i11 > 0 && Math.abs(x11) > this.f27414v0) {
                this.f27409q0 = true;
                a0(true);
                if (this.f27413u0 && this.f27410r0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.f27411s0, -this.f27412t0);
                    this.f27410r0.t(obtain);
                    obtain.recycle();
                    this.f27413u0 = false;
                }
            }
            if (this.f27409q0) {
                int i15 = (int) (this.f27408p0 - x11);
                if (i15 >= 0) {
                    i12 = i15;
                }
                if (i12 <= i11) {
                    i11 = i12;
                }
                if (i11 != this.f27403j0) {
                    this.f27403j0 = i11;
                    Z(this.T, this.U, this.V);
                    View view2 = this.W;
                    if (view2 != null) {
                        view2.invalidate();
                        return true;
                    }
                }
            } else {
                return this.f27413u0;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f27409q0;
                this.f27409q0 = false;
                if (z10) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.f27417y0) != null && this.f27418z0 != null && this.W != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f27417y0.computeCurrentVelocity(1000, this.f27416x0);
                        float f11 = -this.f27417y0.getXVelocity();
                        if (Math.abs(f11) > this.f27415w0) {
                            this.f27418z0.fling(this.f27403j0, 0, (int) f11, 0, 0, this.f27402i0, 0, 0);
                            this.W.postOnAnimation(this.A0);
                        }
                    }
                }
                if (!z10 && this.f27413u0 && this.f27410r0 != null) {
                    motionEvent.offsetLocation(-this.f27411s0, -this.f27412t0);
                    this.f27410r0.t(motionEvent);
                    motionEvent.offsetLocation(this.f27411s0, this.f27412t0);
                }
                boolean z11 = this.f27413u0;
                this.f27413u0 = false;
                this.f27410r0 = null;
                VelocityTracker velocityTracker4 = this.f27417y0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f27417y0 = null;
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
        hv hvVar = this.f27395b0;
        if (hvVar != null) {
            hvVar.f24223c = (j0() + i7) - hvVar.n();
            hvVar.d = i10;
            hvVar.f24224e = i11;
        }
        px0 px0Var = this.Y;
        int childCount = px0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ix0 d = px0Var.d(i12);
            hx0 hx0Var = d.f35761b;
            if (hx0Var instanceof hv) {
                hv hvVar2 = (hv) hx0Var;
                hvVar2.f24223c = ((d.b() + i7) - this.f27403j0) - hvVar2.n();
                hvVar2.d = d.c() + this.f27396c0 + i10;
                hvVar2.f24224e = i11;
            }
        }
    }

    @Override
    public final hx0 c(TL_iv.pageTableCell pagetablecell, int i7) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        int R = iv.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        iv ivVar = this.f22933a;
        SpannableStringBuilder l10 = ivVar.l(richText, R);
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        hv hvVar = new hv(ivVar, l10, i7, alignment);
        hvVar.f24227r = true;
        return hvVar;
    }

    @Override
    public final Paint getHeaderPaint() {
        i0();
        return this.m0;
    }

    @Override
    public final Paint getLinePaint() {
        i0();
        return this.f27404k0;
    }

    @Override
    public final Paint getStripPaint() {
        i0();
        return this.f27406n0;
    }

    public final void i0() {
        int i7;
        int i10;
        if (this.f27404k0 == null) {
            Paint paint = new Paint(1);
            this.f27404k0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.f27404k0.setStrokeWidth(g0.N(0.66f));
            Paint paint2 = new Paint();
            this.f27405l0 = paint2;
            paint2.setStyle(style);
            this.f27405l0.setStrokeWidth(g0.N(0.66f));
            this.m0 = new Paint();
            this.f27406n0 = new Paint();
        }
        iv ivVar = this.f22933a;
        if (ivVar.E()) {
            i7 = org.telegram.ui.ActionBar.j6.ll;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.kl;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, ivVar.D);
        this.f27404k0.setColor(w02);
        this.f27405l0.setColor(w02);
        Paint paint3 = this.m0;
        if (ivVar.E()) {
            i10 = org.telegram.ui.ActionBar.j6.jl;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.il;
        }
        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(i10, ivVar.D));
        this.f27406n0.setColor(167772160);
    }

    public final int j0() {
        hv hvVar = this.f27395b0;
        if (hvVar == null) {
            return 0;
        }
        int i7 = this.f27400g0;
        int i10 = hvVar.h;
        int i11 = hvVar.f24225f;
        return Math.round(((i7 - (i10 - i11)) / 2.0f) - i11);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        cu.l(spannableStringBuilder, this.f27395b0, null);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i7 < arrayList.size()) {
                hv hvVar = (hv) arrayList.get(i7);
                if (hvVar != null && (staticLayout = hvVar.f24222b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
        ArrayList arrayList2 = this.f27397d0;
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
        ix0 d;
        hv hvVar;
        org.telegram.ui.Components.l5 l5Var;
        px0 px0Var;
        int i11;
        int i12;
        h6.m mVar;
        int i13;
        org.telegram.ui.Components.l5 l5Var2;
        canvas.save();
        Rect rect = this.f22934b;
        canvas.translate(rect.left, rect.top);
        hv hvVar2 = this.f27395b0;
        if (hvVar2 != null && (l5Var2 = hvVar2.F) != null && !l5Var2.f36726a.isEmpty()) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, hvVar2.f24222b, hvVar2.F, 0.0f, hvVar2.f24230x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.translate(0.0f, this.f27396c0);
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                org.telegram.ui.Components.l5 l5Var3 = ((hv) arrayList.get(i14)).F;
                if (l5Var3 != null && !l5Var3.f36726a.isEmpty()) {
                    iv ivVar = this.f22933a;
                    int i15 = ivVar.S;
                    h6.m mVar2 = ivVar.f24462z;
                    int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((ivVar.C + ivVar.T) - rect.left) - rect.right, this.f27401h0, 255, 31);
                    canvas.save();
                    canvas.translate(-this.f27403j0, 0.0f);
                    px0 px0Var2 = this.Y;
                    int childCount = px0Var2.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount) {
                        hx0 hx0Var = px0Var2.d(i16).f35761b;
                        if (!(hx0Var instanceof hv) || (l5Var = (hvVar = (hv) hx0Var).F) == null || l5Var.f36726a.isEmpty()) {
                            i13 = saveLayerAlpha;
                            px0Var = px0Var2;
                            i11 = childCount;
                            i12 = i16;
                            mVar = mVar2;
                        } else {
                            canvas.save();
                            canvas.translate(d.b(), d.c());
                            px0Var = px0Var2;
                            i11 = childCount;
                            i12 = i16;
                            mVar = mVar2;
                            i13 = saveLayerAlpha;
                            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, hvVar.f24222b, hvVar.F, 0.0f, hvVar.f24230x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                            canvas.restore();
                        }
                        i16 = i12 + 1;
                        mVar2 = mVar;
                        px0Var2 = px0Var;
                        childCount = i11;
                        saveLayerAlpha = i13;
                    }
                    int i17 = saveLayerAlpha;
                    h6.m mVar3 = mVar2;
                    canvas.restore();
                    RectF rectF = g0.P;
                    rectF.set(-ivVar.S, 0.0f, g0.L(12.0f) + i7, this.f27401h0);
                    mVar3.m(canvas, rectF, 0, 1.0f);
                    rectF.set(i10 - g0.L(12.0f), 0.0f, ((ivVar.C + ivVar.T) - rect.left) - rect.right, this.f27401h0);
                    mVar3.m(canvas, rectF, 2, 1.0f);
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
        vu vuVar;
        float f10;
        int i11;
        px0 px0Var;
        int i12;
        int i13;
        int i14;
        float f11;
        tg0 tg0Var = this.L;
        if (tg0Var != null && tg0Var.h) {
            ArrayList arrayList = this.f27397d0;
            if (!arrayList.isEmpty() && tg0Var.d((rg0) arrayList.get(0)) >= 0) {
                float c10 = tg0Var.c((rg0) arrayList.get(0));
                float f12 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.f22934b;
                canvas.translate(rect.left, rect.top);
                hv hvVar = this.f27395b0;
                if (hvVar != null) {
                    canvas.save();
                    canvas.translate(j0(), 0.0f);
                    hvVar.d(canvas, hvVar.T);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.f27396c0);
                iv ivVar = this.f22933a;
                int i15 = ivVar.S;
                h6.m mVar = ivVar.f24462z;
                float f13 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((ivVar.C + ivVar.T) - rect.left) - rect.right, this.f27401h0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.f27403j0, 0.0f);
                px0 px0Var2 = this.Y;
                int childCount = px0Var2.getChildCount();
                int i16 = 0;
                int i17 = 0;
                while (i16 < childCount) {
                    float f14 = f13;
                    ix0 d = px0Var2.d(i16);
                    if (i17 < arrayList.size() && ((vu) arrayList.get(i17)).f27248a == d) {
                        vuVar = (vu) arrayList.get(i17);
                        i17++;
                    } else {
                        vuVar = null;
                    }
                    int i18 = i17;
                    if (vuVar == null) {
                        d.a(canvas, this.W, true);
                    } else if (!tg0Var.i(vuVar)) {
                        d.a(canvas, this.W, false);
                    } else {
                        if (tg0Var.g(vuVar)) {
                            d.a(canvas, this.W, false);
                            if (d.f35761b instanceof hv) {
                                canvas.save();
                                f10 = f12;
                                canvas.translate(d.b(), d.c());
                                hv hvVar2 = (hv) d.f35761b;
                                if (tg0Var.g(vuVar)) {
                                    i14 = tg0Var.f51579e;
                                } else {
                                    i14 = -1;
                                }
                                if (tg0Var.g(vuVar)) {
                                    f11 = tg0Var.f51580f;
                                } else {
                                    f11 = f10;
                                }
                                hvVar2.m(canvas, i14, f11);
                                canvas.restore();
                            } else {
                                f10 = f12;
                            }
                        } else {
                            f10 = f12;
                            float c11 = tg0Var.c(vuVar);
                            if (c11 >= 1.0f) {
                                d.a(canvas, this.W, true);
                            } else {
                                if (c11 > f10 && d.f35761b != null) {
                                    d.a(canvas, this.W, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    px0Var = px0Var2;
                                    i13 = i16;
                                    i11 = saveLayerAlpha;
                                    i12 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.f35768k, d.f35769l, (int) (c11 * f14), 31);
                                    d.f35761b.d(canvas, this.W);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                } else {
                                    i11 = saveLayerAlpha;
                                    px0Var = px0Var2;
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
                                px0Var2 = px0Var;
                            }
                        }
                        i11 = saveLayerAlpha;
                        px0Var = px0Var2;
                        i12 = childCount;
                        i13 = i16;
                        i16 = i13 + 1;
                        saveLayerAlpha = i11;
                        f13 = f14;
                        i17 = i18;
                        f12 = f10;
                        childCount = i12;
                        px0Var2 = px0Var;
                    }
                    px0Var = px0Var2;
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
                    px0Var2 = px0Var;
                }
                float f15 = f12;
                int i19 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-ivVar.S, f15, g0.L(12.0f) + i7, this.f27401h0);
                mVar.m(canvas, rectF, 0, 1.0f);
                rectF.set(i10 - g0.L(12.0f), 0.0f, ((ivVar.C + ivVar.T) - rect.left) - rect.right, this.f27401h0);
                mVar.m(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i19);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        ix0 d;
        hv hvVar;
        Rect rect = this.f22934b;
        hv hvVar2 = this.f27395b0;
        if (hvVar2 != null && hvVar2.o(characterStyle, ttVar)) {
            ttVar.f26731e = (j0() + rect.left) - hvVar2.n();
            ttVar.f26732f = i7 + rect.top;
            return true;
        }
        px0 px0Var = this.Y;
        int childCount = px0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hx0 hx0Var = px0Var.d(i10).f35761b;
            if (hx0Var instanceof hv) {
                if (((hv) hx0Var).o(characterStyle, ttVar)) {
                    ttVar.f26731e = ((d.b() + rect.left) - this.f27403j0) - hvVar.n();
                    ttVar.f26732f = d.c() + i7 + rect.top + this.f27396c0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(hx0 hx0Var, int i7) {
    }
}
