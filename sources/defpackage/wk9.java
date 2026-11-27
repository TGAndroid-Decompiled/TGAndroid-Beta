package defpackage;

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
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_iv;
public final class wk9 extends dk9 implements yib {
    public final ki7 A0;
    public final TL_iv.pageBlockTable X;
    public final zib Y;
    public final ArrayList Z;
    public final kmb[] a0;
    public final gl9 b0;
    public final int c0;
    public final ArrayList d0;
    public final int e0;
    public final int f0;
    public int g0;
    public int h0;
    public final int i0;
    public int j0;
    public Paint k0;
    public Paint l0;
    public Paint m0;
    public Paint n0;
    public float o0;
    public int p0;
    public boolean q0;
    public gl9 r0;
    public float s0;
    public float t0;
    public boolean u0;
    public int v0;
    public int w0;
    public int x0;
    public VelocityTracker y0;
    public OverScroller z0;

    public wk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockTable pageblocktable) {
        super(hl9Var, rect, i);
        float f;
        int i2;
        int i3;
        int max;
        this.Z = new ArrayList();
        this.d0 = new ArrayList();
        this.A0 = new ki7(this, (byte) 20);
        Rect rect2 = this.b;
        rect2.top = hl.L(10.0f) + rect2.top;
        this.X = pageblocktable;
        this.e0 = this.c;
        gl9 gl9Var = null;
        zib zibVar = new zib(a.b, this, null);
        this.Y = zibVar;
        zibVar.setOrientation(0);
        zibVar.setRowOrderPreserved(true);
        zibVar.setDrawLines(pageblocktable.bordered);
        zibVar.setStriped(pageblocktable.striped);
        zibVar.setRtl(hl9Var.H());
        zibVar.setFillWidth(false);
        zibVar.setBalancedColumns(true);
        if (pageblocktable.compact) {
            int L = hl.L(5.0f);
            int L2 = hl.L(5.0f);
            int L3 = hl.L(5.0f);
            if (zibVar.w != L || zibVar.r != L2 || zibVar.s != L3) {
                zibVar.w = L;
                zibVar.r = L2;
                zibVar.s = L3;
                zibVar.requestLayout();
            }
        }
        if (pageblocktable.compact) {
            f = 18.0f;
        } else {
            f = 36.0f;
        }
        zibVar.setMinimumCellHeight(hl.L(f));
        if (!pageblocktable.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
            i2 = 0;
            for (int i4 = 0; i4 < pagetablerow.cells.size(); i4++) {
                int i5 = pagetablerow.cells.get(i4).colspan;
                if (i5 == 0) {
                    i5 = 1;
                }
                i2 += i5;
            }
        } else {
            i2 = 0;
        }
        for (int i6 = 0; i6 < pageblocktable.rows.size(); i6++) {
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i6);
            int i7 = 0;
            for (int i8 = 0; i8 < pagetablerow2.cells.size(); i8++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i8);
                int i9 = pagetablecell.colspan;
                i9 = i9 == 0 ? 1 : i9;
                int i10 = pagetablecell.rowspan;
                i10 = i10 == 0 ? 1 : i10;
                TL_iv.RichText richText = pagetablecell.text;
                zib zibVar2 = this.Y;
                if (richText != null) {
                    zibVar2.b(pagetablecell, i7, i6, i9);
                } else {
                    zibVar2.a(i7, i6, i9, i10);
                }
                i7 += i9;
            }
        }
        this.Y.setColumnCount(i2);
        this.Y.measure(View.MeasureSpec.makeMeasureSpec(this.c, 0), 0);
        int measuredWidth = this.Y.getMeasuredWidth();
        this.h0 = this.Y.getMeasuredHeight();
        this.i0 = Math.max(0, measuredWidth - this.e0);
        TL_iv.RichText richText2 = pageblocktable.title;
        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(hl9.w(richText2))) {
            gl9 gl9Var2 = new gl9(hl9Var, hl9Var.l(pageblocktable.title, hl9.Q(0, 15)), this.e0, Layout.Alignment.ALIGN_CENTER);
            this.b0 = gl9Var2;
            gl9Var2.r = true;
            this.c0 = hl.L(9.0f) + gl9Var2.b.getHeight();
            gl9Var = gl9Var2;
        } else {
            this.b0 = null;
            this.c0 = 0;
        }
        if (gl9Var != null) {
            i3 = gl9Var.r();
        } else {
            i3 = 0;
        }
        boolean C = hl9Var.C();
        int i11 = this.e0;
        if (C) {
            max = Math.max(0, i11);
        } else {
            max = Math.max(0, Math.min(i11, Math.max(measuredWidth, i3)));
        }
        this.f0 = max;
        this.g0 = max;
        for (int i12 = 0; i12 < this.Y.getChildCount(); i12++) {
            sib d = this.Y.d(i12);
            rib ribVar = d.b;
            if (ribVar instanceof gl9) {
                this.Z.add((gl9) ribVar);
                this.d0.add(new vk9(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        gl9 gl9Var3 = this.b0;
        if (gl9Var3 != null) {
            arrayList.add(gl9Var3);
        }
        arrayList.addAll(this.Z);
        this.a0 = (kmb[]) arrayList.toArray(new kmb[0]);
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return hl.L(10.0f) + rect.top + this.c0 + this.h0 + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.f0 + rect.right;
    }

    @Override
    public final kmb[] K() {
        return this.a0;
    }

    @Override
    public final boolean P() {
        if (!this.q0) {
            OverScroller overScroller = this.z0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void S() {
        gl9 gl9Var = this.b0;
        if (gl9Var != null) {
            gl9Var.i(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gl9) obj).i(this.W);
        }
    }

    @Override
    public final void U() {
        gl9 gl9Var = this.b0;
        if (gl9Var != null) {
            gl9Var.f(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gl9) obj).f(this.W);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        int i;
        int i2;
        gl9 gl9Var = this.b0;
        if (gl9Var != null) {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            gl9Var.d(canvas, gl9Var.T);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.c0);
        hl9 hl9Var = this.a;
        int i3 = hl9Var.S;
        pm3 pm3Var = hl9Var.z;
        Rect rect = this.b;
        canvas.saveLayerAlpha(-i3, 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0, 255, 31);
        canvas.save();
        canvas.translate(-this.j0, 0.0f);
        zib zibVar = this.Y;
        int childCount = zibVar.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            zibVar.d(i4).a(canvas, this.W, true);
        }
        canvas.restore();
        RectF rectF = hl.P;
        rectF.set(-hl9Var.S, 0.0f, hl.L(12.0f) + i, this.h0);
        pm3Var.r(canvas, rectF, 0, 1.0f);
        rectF.set(i2 - hl.L(12.0f), 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0);
        pm3Var.r(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int i;
        int i2;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.i0;
        sib sibVar = null;
        int i4 = 0;
        if (actionMasked == 0) {
            if (this.v0 == 0 && (view = this.W) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.v0 = viewConfiguration.getScaledTouchSlop();
                this.w0 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.x0 = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            OverScroller overScroller = this.z0;
            if (overScroller == null && this.W != null) {
                overScroller = new OverScroller(this.W.getContext());
                this.z0 = overScroller;
            }
            if (overScroller != null && !overScroller.isFinished()) {
                this.z0.forceFinished(true);
            }
            this.o0 = motionEvent.getX();
            motionEvent.getY();
            this.p0 = this.j0;
            this.q0 = false;
            VelocityTracker velocityTracker2 = this.y0;
            if (velocityTracker2 == null) {
                this.y0 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.y0.addMovement(motionEvent);
            this.r0 = null;
            this.u0 = false;
            int i5 = this.c0;
            gl9 gl9Var = this.b0;
            if (gl9Var != null && motionEvent.getY() < i5) {
                float i0 = i0();
                motionEvent.offsetLocation(-i0, 0.0f);
                boolean t = gl9Var.t(motionEvent);
                motionEvent.offsetLocation(i0, 0.0f);
                if (t) {
                    this.r0 = gl9Var;
                    this.s0 = i0;
                    this.t0 = 0.0f;
                    this.u0 = true;
                }
            }
            if (!this.u0) {
                float x = motionEvent.getX();
                float f = x + this.j0;
                float y = motionEvent.getY() - i5;
                zib zibVar = this.Y;
                int childCount = zibVar.getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount) {
                        break;
                    }
                    sib d = zibVar.d(i6);
                    if (d.b instanceof gl9) {
                        if (f >= d.p && f < i + d.k) {
                            if (y >= d.q && y < i2 + d.l) {
                                sibVar = d;
                                break;
                            }
                        }
                    }
                    i6++;
                }
                if (sibVar != null) {
                    this.r0 = (gl9) sibVar.b;
                    this.s0 = sibVar.b() - this.j0;
                    this.t0 = sibVar.c() + i5;
                    this.r0.S.set(sibVar.p - sibVar.b(), sibVar.q - sibVar.c(), (sibVar.p + sibVar.k) - sibVar.b(), (sibVar.q + sibVar.l) - sibVar.c());
                    motionEvent.offsetLocation(-this.s0, -this.t0);
                    this.u0 = this.r0.t(motionEvent);
                    motionEvent.offsetLocation(this.s0, this.t0);
                }
            }
            if (this.u0 || i3 > 0) {
                return true;
            }
            return false;
        }
        if (actionMasked == 2) {
            VelocityTracker velocityTracker3 = this.y0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x2 = motionEvent.getX() - this.o0;
            if (!this.q0 && i3 > 0 && Math.abs(x2) > this.v0) {
                this.q0 = true;
                Z(true);
                if (this.u0 && this.r0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.s0, -this.t0);
                    this.r0.t(obtain);
                    obtain.recycle();
                    this.u0 = false;
                }
            }
            if (this.q0) {
                int i7 = (int) (this.p0 - x2);
                if (i7 >= 0) {
                    i4 = i7;
                }
                if (i4 <= i3) {
                    i3 = i4;
                }
                if (i3 != this.j0) {
                    this.j0 = i3;
                    Y(this.T, this.U, this.V);
                    View view2 = this.W;
                    if (view2 != null) {
                        view2.invalidate();
                        return true;
                    }
                }
            } else {
                return this.u0;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z = this.q0;
                this.q0 = false;
                if (z) {
                    Z(false);
                    if (actionMasked == 1 && (velocityTracker = this.y0) != null && this.z0 != null && this.W != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.y0.computeCurrentVelocity(1000, this.x0);
                        float f2 = -this.y0.getXVelocity();
                        if (Math.abs(f2) > this.w0) {
                            this.z0.fling(this.j0, 0, (int) f2, 0, 0, this.i0, 0, 0);
                            this.W.postOnAnimation(this.A0);
                        }
                    }
                }
                if (!z && this.u0 && this.r0 != null) {
                    motionEvent.offsetLocation(-this.s0, -this.t0);
                    this.r0.t(motionEvent);
                    motionEvent.offsetLocation(this.s0, this.t0);
                }
                boolean z2 = this.u0;
                this.u0 = false;
                this.r0 = null;
                VelocityTracker velocityTracker4 = this.y0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.y0 = null;
                }
                if (z || z2) {
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final void Y(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        gl9 gl9Var = this.b0;
        if (gl9Var != null) {
            gl9Var.c = (i0() + i) - gl9Var.n();
            gl9Var.d = i2;
            gl9Var.e = i3;
        }
        zib zibVar = this.Y;
        int childCount = zibVar.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            sib d = zibVar.d(i4);
            rib ribVar = d.b;
            if (ribVar instanceof gl9) {
                gl9 gl9Var2 = (gl9) ribVar;
                gl9Var2.c = ((d.b() + i) - this.j0) - gl9Var2.n();
                gl9Var2.d = d.c() + this.c0 + i2;
                gl9Var2.e = i3;
            }
        }
    }

    @Override
    public final rib c(TL_iv.pageTableCell pagetablecell, int i) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        int Q = hl9.Q(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        hl9 hl9Var = this.a;
        SpannableStringBuilder l = hl9Var.l(richText, Q);
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        gl9 gl9Var = new gl9(hl9Var, l, i, alignment);
        gl9Var.r = true;
        return gl9Var;
    }

    @Override
    public final Paint getHeaderPaint() {
        h0();
        return this.m0;
    }

    @Override
    public final Paint getLinePaint() {
        h0();
        return this.k0;
    }

    @Override
    public final Paint getStripPaint() {
        h0();
        return this.n0;
    }

    public final void h0() {
        int i;
        int i2;
        if (this.k0 == null) {
            Paint paint = new Paint(1);
            this.k0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.k0.setStrokeWidth(hl.N(0.66f));
            Paint paint2 = new Paint();
            this.l0 = paint2;
            paint2.setStyle(style);
            this.l0.setStrokeWidth(hl.N(0.66f));
            this.m0 = new Paint();
            this.n0 = new Paint();
        }
        hl9 hl9Var = this.a;
        if (hl9Var.D()) {
            i = aob.ll;
        } else {
            i = aob.kl;
        }
        int v0 = aob.v0(i, hl9Var.D);
        this.k0.setColor(v0);
        this.l0.setColor(v0);
        Paint paint3 = this.m0;
        if (hl9Var.D()) {
            i2 = aob.jl;
        } else {
            i2 = aob.il;
        }
        paint3.setColor(aob.v0(i2, hl9Var.D));
        this.n0.setColor(167772160);
    }

    public final int i0() {
        gl9 gl9Var = this.b0;
        if (gl9Var == null) {
            return 0;
        }
        int i = this.g0;
        int i2 = gl9Var.h;
        int i3 = gl9Var.f;
        return Math.round(((i - (i2 - i3)) / 2.0f) - i3);
    }

    @Override
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        dk9.k(spannableStringBuilder, this.b0, null);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i < arrayList.size()) {
                gl9 gl9Var = (gl9) arrayList.get(i);
                if (gl9Var != null && (staticLayout = gl9Var.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append(", ");
                    }
                    spannableStringBuilder.append(staticLayout.getText());
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void o(ArrayList arrayList) {
        ArrayList arrayList2 = this.d0;
        if (arrayList2.isEmpty()) {
            arrayList.add(this);
        } else {
            arrayList.addAll(arrayList2);
        }
    }

    @Override
    public final boolean r(Canvas canvas, ColorFilter colorFilter) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        sib d;
        int i3;
        zib zibVar;
        int i4;
        int i5;
        pm3 pm3Var;
        gl9 gl9Var;
        dm dmVar;
        dm dmVar2;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        gl9 gl9Var2 = this.b0;
        if (gl9Var2 != null && (dmVar2 = gl9Var2.F) != null && !dmVar2.a.isEmpty()) {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            hm.drawAnimatedEmojis(canvas, gl9Var2.b, gl9Var2.F, 0.0f, gl9Var2.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z = true;
        } else {
            z = false;
        }
        canvas.translate(0.0f, this.c0);
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                dm dmVar3 = ((gl9) arrayList.get(i6)).F;
                if (dmVar3 != null && !dmVar3.a.isEmpty()) {
                    hl9 hl9Var = this.a;
                    int i7 = hl9Var.S;
                    pm3 pm3Var2 = hl9Var.z;
                    int saveLayerAlpha = canvas.saveLayerAlpha(-i7, 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0, 255, 31);
                    canvas.save();
                    canvas.translate(-this.j0, 0.0f);
                    zib zibVar2 = this.Y;
                    int childCount = zibVar2.getChildCount();
                    int i8 = 0;
                    while (i8 < childCount) {
                        rib ribVar = zibVar2.d(i8).b;
                        if ((ribVar instanceof gl9) && (dmVar = (gl9Var = (gl9) ribVar).F) != null && !dmVar.a.isEmpty()) {
                            canvas.save();
                            canvas.translate(d.b(), d.c());
                            zibVar = zibVar2;
                            i4 = childCount;
                            i5 = i8;
                            pm3Var = pm3Var2;
                            i3 = saveLayerAlpha;
                            hm.drawAnimatedEmojis(canvas, gl9Var.b, gl9Var.F, 0.0f, gl9Var.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                            canvas.restore();
                        } else {
                            i3 = saveLayerAlpha;
                            zibVar = zibVar2;
                            i4 = childCount;
                            i5 = i8;
                            pm3Var = pm3Var2;
                        }
                        i8 = i5 + 1;
                        pm3Var2 = pm3Var;
                        zibVar2 = zibVar;
                        childCount = i4;
                        saveLayerAlpha = i3;
                    }
                    int i9 = saveLayerAlpha;
                    pm3 pm3Var3 = pm3Var2;
                    canvas.restore();
                    RectF rectF = hl.P;
                    rectF.set(-hl9Var.S, 0.0f, hl.L(12.0f) + i, this.h0);
                    pm3Var3.r(canvas, rectF, 0, 1.0f);
                    rectF.set(i2 - hl.L(12.0f), 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0);
                    pm3Var3.r(canvas, rectF, 2, 1.0f);
                    canvas.restoreToCount(i9);
                    z2 = true;
                } else {
                    i6++;
                }
            } else {
                z2 = z;
                break;
            }
        }
        canvas.restore();
        return z2;
    }

    @Override
    public final void s(Canvas canvas) {
        int i;
        int i2;
        vk9 vk9Var;
        float f;
        int i3;
        zib zibVar;
        int i4;
        int i5;
        int i6;
        float f2;
        ui7 ui7Var = this.L;
        if (ui7Var != null && ui7Var.h) {
            ArrayList arrayList = this.d0;
            if (!arrayList.isEmpty() && ui7Var.d((si7) arrayList.get(0)) >= 0) {
                float c = ui7Var.c((si7) arrayList.get(0));
                float f3 = 0.0f;
                if (c <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.b;
                canvas.translate(rect.left, rect.top);
                gl9 gl9Var = this.b0;
                if (gl9Var != null) {
                    canvas.save();
                    canvas.translate(i0(), 0.0f);
                    gl9Var.d(canvas, gl9Var.T);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.c0);
                hl9 hl9Var = this.a;
                int i7 = hl9Var.S;
                pm3 pm3Var = hl9Var.z;
                float f4 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i7, 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0, (int) (c * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.j0, 0.0f);
                zib zibVar2 = this.Y;
                int childCount = zibVar2.getChildCount();
                int i8 = 0;
                int i9 = 0;
                while (i8 < childCount) {
                    float f5 = f4;
                    sib d = zibVar2.d(i8);
                    if (i9 < arrayList.size() && ((vk9) arrayList.get(i9)).a == d) {
                        vk9Var = (vk9) arrayList.get(i9);
                        i9++;
                    } else {
                        vk9Var = null;
                    }
                    int i10 = i9;
                    if (vk9Var == null) {
                        d.a(canvas, this.W, true);
                    } else if (!ui7Var.i(vk9Var)) {
                        d.a(canvas, this.W, false);
                    } else {
                        if (ui7Var.g(vk9Var)) {
                            d.a(canvas, this.W, false);
                            if (d.b instanceof gl9) {
                                canvas.save();
                                f = f3;
                                canvas.translate(d.b(), d.c());
                                gl9 gl9Var2 = (gl9) d.b;
                                if (ui7Var.g(vk9Var)) {
                                    i6 = ui7Var.e;
                                } else {
                                    i6 = -1;
                                }
                                if (ui7Var.g(vk9Var)) {
                                    f2 = ui7Var.f;
                                } else {
                                    f2 = f;
                                }
                                gl9Var2.m(canvas, i6, f2);
                                canvas.restore();
                            } else {
                                f = f3;
                            }
                        } else {
                            f = f3;
                            float c2 = ui7Var.c(vk9Var);
                            if (c2 >= 1.0f) {
                                d.a(canvas, this.W, true);
                            } else {
                                if (c2 > f && d.b != null) {
                                    d.a(canvas, this.W, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    zibVar = zibVar2;
                                    i5 = i8;
                                    i3 = saveLayerAlpha;
                                    i4 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.k, d.l, (int) (c2 * f5), 31);
                                    d.b.d(canvas, this.W);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                } else {
                                    i3 = saveLayerAlpha;
                                    zibVar = zibVar2;
                                    i4 = childCount;
                                    i5 = i8;
                                    d.a(canvas, this.W, false);
                                }
                                i8 = i5 + 1;
                                saveLayerAlpha = i3;
                                f4 = f5;
                                i9 = i10;
                                f3 = f;
                                childCount = i4;
                                zibVar2 = zibVar;
                            }
                        }
                        i3 = saveLayerAlpha;
                        zibVar = zibVar2;
                        i4 = childCount;
                        i5 = i8;
                        i8 = i5 + 1;
                        saveLayerAlpha = i3;
                        f4 = f5;
                        i9 = i10;
                        f3 = f;
                        childCount = i4;
                        zibVar2 = zibVar;
                    }
                    zibVar = zibVar2;
                    i4 = childCount;
                    i5 = i8;
                    f = f3;
                    i3 = saveLayerAlpha;
                    i8 = i5 + 1;
                    saveLayerAlpha = i3;
                    f4 = f5;
                    i9 = i10;
                    f3 = f;
                    childCount = i4;
                    zibVar2 = zibVar;
                }
                float f6 = f3;
                int i11 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = hl.P;
                rectF.set(-hl9Var.S, f6, hl.L(12.0f) + i, this.h0);
                pm3Var.r(canvas, rectF, 0, 1.0f);
                rectF.set(i2 - hl.L(12.0f), 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0);
                pm3Var.r(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i11);
                canvas.restore();
                return;
            }
        }
        p(canvas);
    }

    @Override
    public final boolean t(CharacterStyle characterStyle, int i, vj9 vj9Var) {
        sib d;
        gl9 gl9Var;
        Rect rect = this.b;
        gl9 gl9Var2 = this.b0;
        if (gl9Var2 != null && gl9Var2.o(characterStyle, vj9Var)) {
            vj9Var.e = (i0() + rect.left) - gl9Var2.n();
            vj9Var.f = i + rect.top;
            return true;
        }
        zib zibVar = this.Y;
        int childCount = zibVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            rib ribVar = zibVar.d(i2).b;
            if (ribVar instanceof gl9) {
                if (((gl9) ribVar).o(characterStyle, vj9Var)) {
                    vj9Var.e = ((d.b() + rect.left) - this.j0) - gl9Var.n();
                    vj9Var.f = d.c() + i + rect.top + this.c0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(rib ribVar, int i) {
    }
}
