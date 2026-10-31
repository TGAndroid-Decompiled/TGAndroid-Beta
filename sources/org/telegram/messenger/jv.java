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
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.py0;
import org.telegram.ui.xh0;
import org.telegram.ui.zh0;
public final class jv extends qu implements oy0 {
    public final TL_iv.pageBlockTable W;
    public final py0 X;
    public final ArrayList Y;
    public final org.telegram.ui.Cells.u9[] Z;
    public final uv f16445a0;
    public final int f16446b0;
    public final ArrayList f16447c0;
    public final int f16448d0;
    public final int f16449e0;
    public int f16450f0;
    public int f16451g0;
    public final int f16452h0;
    public int f16453i0;
    public Paint f16454j0;
    public Paint f16455k0;
    public Paint f16456l0;
    public Paint m0;
    public float f16457n0;
    public int f16458o0;
    public boolean f16459p0;
    public uv f16460q0;
    public float f16461r0;
    public float f16462s0;
    public boolean f16463t0;
    public int f16464u0;
    public int f16465v0;
    public int f16466w0;
    public VelocityTracker f16467x0;
    public OverScroller f16468y0;
    public final mg.c2 f16469z0;

    public jv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockTable pageblocktable) {
        super(vvVar, rect, i10);
        float f7;
        int i11;
        int i12;
        this.Y = new ArrayList();
        this.f16447c0 = new ArrayList();
        this.f16469z0 = new mg.c2(this, 10);
        Rect rect2 = this.f17622b;
        rect2.top = i0.L(10.0f) + rect2.top;
        this.W = pageblocktable;
        this.f16448d0 = this.f17623c;
        py0 py0Var = new py0(w0.f19025b, this, null);
        this.X = py0Var;
        py0Var.setOrientation(0);
        py0Var.setRowOrderPreserved(true);
        py0Var.setDrawLines(pageblocktable.bordered);
        py0Var.setStriped(pageblocktable.striped);
        py0Var.setRtl(vvVar.I());
        py0Var.setFillWidth(false);
        if (pageblocktable.compact) {
            int L = i0.L(5.0f);
            int L2 = i0.L(5.0f);
            int L3 = i0.L(5.0f);
            if (py0Var.f29468w != L || py0Var.f29466r != L2 || py0Var.f29467s != L3) {
                py0Var.f29468w = L;
                py0Var.f29466r = L2;
                py0Var.f29467s = L3;
                py0Var.requestLayout();
            }
        }
        if (pageblocktable.compact) {
            f7 = 18.0f;
        } else {
            f7 = 36.0f;
        }
        py0Var.setMinimumCellHeight(i0.L(f7));
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
        this.X.measure(View.MeasureSpec.makeMeasureSpec(this.f17623c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.X.getMeasuredWidth();
        this.f16451g0 = this.X.getMeasuredHeight();
        this.f16452h0 = Math.max(0, measuredWidth - this.f16448d0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(vv.x(richText))) {
            uv uvVar = new uv(vvVar, vvVar.l(pageblocktable.title, vv.R(0, 15)), this.f16448d0);
            this.f16445a0 = uvVar;
            uvVar.f18400r = true;
            this.f16446b0 = i0.L(9.0f) + uvVar.f18396b.getHeight();
        } else {
            this.f16445a0 = null;
            this.f16446b0 = 0;
        }
        uv uvVar2 = this.f16445a0;
        if (uvVar2 != null) {
            i12 = uvVar2.r();
        } else {
            i12 = 0;
        }
        int max = Math.max(0, Math.min(this.f16448d0, Math.max(measuredWidth, i12)));
        this.f16449e0 = max;
        this.f16450f0 = max;
        for (int i20 = 0; i20 < this.X.getChildCount(); i20++) {
            iy0 d = this.X.d(i20);
            hy0 hy0Var = d.f27133b;
            if (hy0Var instanceof uv) {
                this.Y.add((uv) hy0Var);
                this.f16447c0.add(new iv(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        uv uvVar3 = this.f16445a0;
        if (uvVar3 != null) {
            arrayList.add(uvVar3);
        }
        arrayList.addAll(this.Y);
        this.Z = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return i0.L(10.0f) + rect.top + this.f16446b0 + this.f16451g0 + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17622b;
        return rect.left + this.f16449e0 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Z;
    }

    @Override
    public final boolean P() {
        if (!this.f16459p0) {
            OverScroller overScroller = this.f16468y0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void S() {
        uv uvVar = this.f16445a0;
        if (uvVar != null) {
            uvVar.i(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uv) obj).i(this.V);
        }
    }

    @Override
    public final void U() {
        uv uvVar = this.f16445a0;
        if (uvVar != null) {
            uvVar.f(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uv) obj).f(this.V);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        int i11;
        uv uvVar = this.f16445a0;
        if (uvVar != null) {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            uvVar.d(canvas, uvVar.S);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.f16446b0);
        vv vvVar = this.f17621a;
        int i12 = vvVar.S;
        li.k kVar = vvVar.f19007z;
        Rect rect = this.f17622b;
        canvas.saveLayerAlpha(-i12, 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.f16451g0, 255, 31);
        canvas.save();
        canvas.translate(-this.f16453i0, 0.0f);
        py0 py0Var = this.X;
        int childCount = py0Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            py0Var.d(i13).a(canvas, this.V, true);
        }
        canvas.restore();
        RectF rectF = i0.P;
        rectF.set(-vvVar.S, 0.0f, i0.L(12.0f) + i10, this.f16451g0);
        kVar.o(canvas, rectF, 0, 1.0f);
        rectF.set(i11 - i0.L(12.0f), 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.f16451g0);
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
        int i12 = this.f16452h0;
        iy0 iy0Var = null;
        int i13 = 0;
        if (actionMasked == 0) {
            if (this.f16464u0 == 0 && (view = this.V) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.f16464u0 = viewConfiguration.getScaledTouchSlop();
                this.f16465v0 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f16466w0 = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.f16468y0 == null && this.V != null) {
                this.f16468y0 = new OverScroller(this.V.getContext());
            }
            OverScroller overScroller = this.f16468y0;
            if (overScroller != null && !overScroller.isFinished()) {
                this.f16468y0.forceFinished(true);
            }
            this.f16457n0 = motionEvent.getX();
            motionEvent.getY();
            this.f16458o0 = this.f16453i0;
            this.f16459p0 = false;
            VelocityTracker velocityTracker2 = this.f16467x0;
            if (velocityTracker2 == null) {
                this.f16467x0 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f16467x0.addMovement(motionEvent);
            this.f16460q0 = null;
            this.f16463t0 = false;
            int i14 = this.f16446b0;
            uv uvVar = this.f16445a0;
            if (uvVar != null && motionEvent.getY() < i14) {
                float i02 = i0();
                motionEvent.offsetLocation(-i02, 0.0f);
                boolean t10 = uvVar.t(motionEvent);
                motionEvent.offsetLocation(i02, 0.0f);
                if (t10) {
                    this.f16460q0 = uvVar;
                    this.f16461r0 = i02;
                    this.f16462s0 = 0.0f;
                    this.f16463t0 = true;
                }
            }
            if (!this.f16463t0) {
                float x10 = motionEvent.getX();
                float f7 = x10 + this.f16453i0;
                float y3 = motionEvent.getY() - i14;
                py0 py0Var = this.X;
                int childCount = py0Var.getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= childCount) {
                        break;
                    }
                    iy0 d = py0Var.d(i15);
                    if (d.f27133b instanceof uv) {
                        if (f7 >= d.f27144p && f7 < i10 + d.f27139k) {
                            if (y3 >= d.f27145q && y3 < i11 + d.f27140l) {
                                iy0Var = d;
                                break;
                            }
                        }
                    }
                    i15++;
                }
                if (iy0Var != null) {
                    this.f16460q0 = (uv) iy0Var.f27133b;
                    this.f16461r0 = iy0Var.b() - this.f16453i0;
                    this.f16462s0 = iy0Var.c() + i14;
                    this.f16460q0.R.set(iy0Var.f27144p - iy0Var.b(), iy0Var.f27145q - iy0Var.c(), (iy0Var.f27144p + iy0Var.f27139k) - iy0Var.b(), (iy0Var.f27145q + iy0Var.f27140l) - iy0Var.c());
                    motionEvent.offsetLocation(-this.f16461r0, -this.f16462s0);
                    this.f16463t0 = this.f16460q0.t(motionEvent);
                    motionEvent.offsetLocation(this.f16461r0, this.f16462s0);
                }
            }
            if (this.f16463t0 || i12 > 0) {
                return true;
            }
            return false;
        }
        if (actionMasked == 2) {
            VelocityTracker velocityTracker3 = this.f16467x0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x11 = motionEvent.getX() - this.f16457n0;
            if (!this.f16459p0 && i12 > 0 && Math.abs(x11) > this.f16464u0) {
                this.f16459p0 = true;
                Z(true);
                if (this.f16463t0 && this.f16460q0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.f16461r0, -this.f16462s0);
                    this.f16460q0.t(obtain);
                    obtain.recycle();
                    this.f16463t0 = false;
                }
            }
            if (this.f16459p0) {
                int i16 = (int) (this.f16458o0 - x11);
                if (i16 >= 0) {
                    i13 = i16;
                }
                if (i13 <= i12) {
                    i12 = i13;
                }
                if (i12 != this.f16453i0) {
                    this.f16453i0 = i12;
                    Y(this.S, this.T, this.U);
                    View view2 = this.V;
                    if (view2 != null) {
                        view2.invalidate();
                        return true;
                    }
                }
            } else {
                return this.f16463t0;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f16459p0;
                this.f16459p0 = false;
                if (z10) {
                    Z(false);
                    if (actionMasked == 1 && (velocityTracker = this.f16467x0) != null && this.f16468y0 != null && this.V != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f16467x0.computeCurrentVelocity(1000, this.f16466w0);
                        float f10 = -this.f16467x0.getXVelocity();
                        if (Math.abs(f10) > this.f16465v0) {
                            this.f16468y0.fling(this.f16453i0, 0, (int) f10, 0, 0, this.f16452h0, 0, 0);
                            this.V.postOnAnimation(this.f16469z0);
                        }
                    }
                }
                if (!z10 && this.f16463t0 && this.f16460q0 != null) {
                    motionEvent.offsetLocation(-this.f16461r0, -this.f16462s0);
                    this.f16460q0.t(motionEvent);
                    motionEvent.offsetLocation(this.f16461r0, this.f16462s0);
                }
                boolean z11 = this.f16463t0;
                this.f16463t0 = false;
                this.f16460q0 = null;
                VelocityTracker velocityTracker4 = this.f16467x0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f16467x0 = null;
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
        uv uvVar = this.f16445a0;
        if (uvVar != null) {
            uvVar.f18397c = (i0() + i10) - uvVar.n();
            uvVar.d = i11;
            uvVar.e = i12;
        }
        py0 py0Var = this.X;
        int childCount = py0Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            iy0 d = py0Var.d(i13);
            hy0 hy0Var = d.f27133b;
            if (hy0Var instanceof uv) {
                uv uvVar2 = (uv) hy0Var;
                uvVar2.f18397c = ((d.b() + i10) - this.f16453i0) - uvVar2.n();
                uvVar2.d = d.c() + this.f16446b0 + i11;
                uvVar2.e = i12;
            }
        }
    }

    @Override
    public final hy0 c(TL_iv.pageTableCell pagetablecell, int i10) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        int R = vv.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        vv vvVar = this.f17621a;
        SpannableStringBuilder l4 = vvVar.l(richText, R);
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        uv uvVar = new uv(vvVar, l4, i10, alignment);
        uvVar.f18400r = true;
        return uvVar;
    }

    @Override
    public final Paint getHeaderPaint() {
        h0();
        return this.f16456l0;
    }

    @Override
    public final Paint getLinePaint() {
        h0();
        return this.f16454j0;
    }

    @Override
    public final Paint getStripPaint() {
        h0();
        return this.m0;
    }

    public final void h0() {
        int i10;
        int i11;
        if (this.f16454j0 == null) {
            Paint paint = new Paint(1);
            this.f16454j0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.f16454j0.setStrokeWidth(i0.N(0.66f));
            Paint paint2 = new Paint();
            this.f16455k0 = paint2;
            paint2.setStyle(style);
            this.f16455k0.setStrokeWidth(i0.N(0.66f));
            this.f16456l0 = new Paint();
            this.m0 = new Paint();
        }
        vv vvVar = this.f17621a;
        if (vvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.il;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.hl;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, vvVar.D);
        this.f16454j0.setColor(w02);
        this.f16455k0.setColor(w02);
        Paint paint3 = this.f16456l0;
        if (vvVar.E()) {
            i11 = org.telegram.ui.ActionBar.t6.gl;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.fl;
        }
        paint3.setColor(org.telegram.ui.ActionBar.t6.w0(i11, vvVar.D));
        this.m0.setColor(167772160);
    }

    public final int i0() {
        uv uvVar = this.f16445a0;
        if (uvVar == null) {
            return 0;
        }
        int i10 = this.f16450f0;
        int i11 = uvVar.h;
        int i12 = uvVar.f18398f;
        return Math.round(((i10 - (i11 - i12)) / 2.0f) - i12);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        qu.l(spannableStringBuilder, this.f16445a0, null);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Y;
            if (i10 < arrayList.size()) {
                uv uvVar = (uv) arrayList.get(i10);
                if (uvVar != null && (staticLayout = uvVar.f18396b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
        ArrayList arrayList2 = this.f16447c0;
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
        iy0 d;
        uv uvVar;
        org.telegram.ui.Components.k5 k5Var;
        py0 py0Var;
        int i12;
        int i13;
        li.k kVar;
        int i14;
        org.telegram.ui.Components.k5 k5Var2;
        canvas.save();
        Rect rect = this.f17622b;
        canvas.translate(rect.left, rect.top);
        uv uvVar2 = this.f16445a0;
        if (uvVar2 != null && (k5Var2 = uvVar2.E) != null && !k5Var2.f27636a.isEmpty()) {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, uvVar2.f18396b, uvVar2.E, 0.0f, uvVar2.f18403x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.translate(0.0f, this.f16446b0);
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i15 = 0;
        while (true) {
            if (i15 < size) {
                org.telegram.ui.Components.k5 k5Var3 = ((uv) arrayList.get(i15)).E;
                if (k5Var3 != null && !k5Var3.f27636a.isEmpty()) {
                    vv vvVar = this.f17621a;
                    int i16 = vvVar.S;
                    li.k kVar2 = vvVar.f19007z;
                    int saveLayerAlpha = canvas.saveLayerAlpha(-i16, 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.f16451g0, 255, 31);
                    canvas.save();
                    canvas.translate(-this.f16453i0, 0.0f);
                    py0 py0Var2 = this.X;
                    int childCount = py0Var2.getChildCount();
                    int i17 = 0;
                    while (i17 < childCount) {
                        hy0 hy0Var = py0Var2.d(i17).f27133b;
                        if (!(hy0Var instanceof uv) || (k5Var = (uvVar = (uv) hy0Var).E) == null || k5Var.f27636a.isEmpty()) {
                            i14 = saveLayerAlpha;
                            py0Var = py0Var2;
                            i12 = childCount;
                            i13 = i17;
                            kVar = kVar2;
                        } else {
                            canvas.save();
                            canvas.translate(d.b(), d.c());
                            py0Var = py0Var2;
                            i12 = childCount;
                            i13 = i17;
                            kVar = kVar2;
                            i14 = saveLayerAlpha;
                            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, uvVar.f18396b, uvVar.E, 0.0f, uvVar.f18403x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                            canvas.restore();
                        }
                        i17 = i13 + 1;
                        kVar2 = kVar;
                        py0Var2 = py0Var;
                        childCount = i12;
                        saveLayerAlpha = i14;
                    }
                    int i18 = saveLayerAlpha;
                    li.k kVar3 = kVar2;
                    canvas.restore();
                    RectF rectF = i0.P;
                    rectF.set(-vvVar.S, 0.0f, i0.L(12.0f) + i10, this.f16451g0);
                    kVar3.o(canvas, rectF, 0, 1.0f);
                    rectF.set(i11 - i0.L(12.0f), 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.f16451g0);
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
        iv ivVar;
        float f7;
        int i12;
        py0 py0Var;
        int i13;
        int i14;
        int i15;
        float f10;
        zh0 zh0Var = this.K;
        if (zh0Var != null && zh0Var.h) {
            ArrayList arrayList = this.f16447c0;
            if (!arrayList.isEmpty() && zh0Var.d((xh0) arrayList.get(0)) >= 0) {
                float c10 = zh0Var.c((xh0) arrayList.get(0));
                float f11 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.f17622b;
                canvas.translate(rect.left, rect.top);
                uv uvVar = this.f16445a0;
                if (uvVar != null) {
                    canvas.save();
                    canvas.translate(i0(), 0.0f);
                    uvVar.d(canvas, uvVar.S);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.f16446b0);
                vv vvVar = this.f17621a;
                int i16 = vvVar.S;
                li.k kVar = vvVar.f19007z;
                float f12 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i16, 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.f16451g0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.f16453i0, 0.0f);
                py0 py0Var2 = this.X;
                int childCount = py0Var2.getChildCount();
                int i17 = 0;
                int i18 = 0;
                while (i17 < childCount) {
                    float f13 = f12;
                    iy0 d = py0Var2.d(i17);
                    if (i18 < arrayList.size() && ((iv) arrayList.get(i18)).f16180a == d) {
                        ivVar = (iv) arrayList.get(i18);
                        i18++;
                    } else {
                        ivVar = null;
                    }
                    int i19 = i18;
                    if (ivVar == null) {
                        d.a(canvas, this.V, true);
                    } else if (!zh0Var.i(ivVar)) {
                        d.a(canvas, this.V, false);
                    } else {
                        if (zh0Var.g(ivVar)) {
                            d.a(canvas, this.V, false);
                            if (d.f27133b instanceof uv) {
                                canvas.save();
                                f7 = f11;
                                canvas.translate(d.b(), d.c());
                                uv uvVar2 = (uv) d.f27133b;
                                if (zh0Var.g(ivVar)) {
                                    i15 = zh0Var.e;
                                } else {
                                    i15 = -1;
                                }
                                if (zh0Var.g(ivVar)) {
                                    f10 = zh0Var.f44155f;
                                } else {
                                    f10 = f7;
                                }
                                uvVar2.m(canvas, i15, f10);
                                canvas.restore();
                            } else {
                                f7 = f11;
                            }
                        } else {
                            f7 = f11;
                            float c11 = zh0Var.c(ivVar);
                            if (c11 >= 1.0f) {
                                d.a(canvas, this.V, true);
                            } else {
                                if (c11 > f7 && d.f27133b != null) {
                                    d.a(canvas, this.V, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    py0Var = py0Var2;
                                    i14 = i17;
                                    i12 = saveLayerAlpha;
                                    i13 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.f27139k, d.f27140l, (int) (c11 * f13), 31);
                                    d.f27133b.d(canvas, this.V);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                } else {
                                    i12 = saveLayerAlpha;
                                    py0Var = py0Var2;
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
                                py0Var2 = py0Var;
                            }
                        }
                        i12 = saveLayerAlpha;
                        py0Var = py0Var2;
                        i13 = childCount;
                        i14 = i17;
                        i17 = i14 + 1;
                        saveLayerAlpha = i12;
                        f12 = f13;
                        i18 = i19;
                        f11 = f7;
                        childCount = i13;
                        py0Var2 = py0Var;
                    }
                    py0Var = py0Var2;
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
                    py0Var2 = py0Var;
                }
                float f14 = f11;
                int i20 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = i0.P;
                rectF.set(-vvVar.S, f14, i0.L(12.0f) + i10, this.f16451g0);
                kVar.o(canvas, rectF, 0, 1.0f);
                rectF.set(i11 - i0.L(12.0f), 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.f16451g0);
                kVar.o(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i20);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        iy0 d;
        uv uvVar;
        Rect rect = this.f17622b;
        uv uvVar2 = this.f16445a0;
        if (uvVar2 != null && uvVar2.o(characterStyle, huVar)) {
            huVar.e = (i0() + rect.left) - uvVar2.n();
            huVar.f15956f = i10 + rect.top;
            return true;
        }
        py0 py0Var = this.X;
        int childCount = py0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            hy0 hy0Var = py0Var.d(i11).f27133b;
            if (hy0Var instanceof uv) {
                if (((uv) hy0Var).o(characterStyle, huVar)) {
                    huVar.e = ((d.b() + rect.left) - this.f16453i0) - uvVar.n();
                    huVar.f15956f = d.c() + i10 + rect.top + this.f16446b0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(hy0 hy0Var, int i10) {
    }
}
