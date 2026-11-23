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
public final class tu extends au implements xx0 {
    public final j6.o A0;
    public final TL_iv.pageBlockTable X;
    public final yx0 Y;
    public final ArrayList Z;
    public final org.telegram.ui.Cells.u9[] f27087a0;
    public final ev f27088b0;
    public final int f27089c0;
    public final ArrayList f27090d0;
    public final int f27091e0;
    public final int f27092f0;
    public int f27093g0;
    public int f27094h0;
    public final int f27095i0;
    public int f27096j0;
    public Paint f27097k0;
    public Paint f27098l0;
    public Paint m0;
    public Paint f27099n0;
    public float f27100o0;
    public int f27101p0;
    public boolean f27102q0;
    public ev f27103r0;
    public float f27104s0;
    public float f27105t0;
    public boolean f27106u0;
    public int f27107v0;
    public int f27108w0;
    public int f27109x0;
    public VelocityTracker f27110y0;
    public OverScroller f27111z0;

    public tu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockTable pageblocktable) {
        super(fvVar, rect, i7);
        float f10;
        int i10;
        int i11;
        int max;
        this.Z = new ArrayList();
        this.f27090d0 = new ArrayList();
        this.A0 = new j6.o(this, 15);
        Rect rect2 = this.f22969b;
        rect2.top = g0.L(10.0f) + rect2.top;
        this.X = pageblocktable;
        this.f27091e0 = this.f22970c;
        yx0 yx0Var = new yx0(t0.f26931b, this, null);
        this.Y = yx0Var;
        yx0Var.setOrientation(0);
        yx0Var.setRowOrderPreserved(true);
        yx0Var.setDrawLines(pageblocktable.bordered);
        yx0Var.setStriped(pageblocktable.striped);
        yx0Var.setRtl(fvVar.I());
        yx0Var.setFillWidth(false);
        yx0Var.setBalancedColumns(true);
        if (pageblocktable.compact) {
            int L = g0.L(5.0f);
            int L2 = g0.L(5.0f);
            int L3 = g0.L(5.0f);
            if (yx0Var.f42589w != L || yx0Var.f42587r != L2 || yx0Var.f42588s != L3) {
                yx0Var.f42589w = L;
                yx0Var.f42587r = L2;
                yx0Var.f42588s = L3;
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
        this.Y.measure(View.MeasureSpec.makeMeasureSpec(this.f22970c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.Y.getMeasuredWidth();
        this.f27094h0 = this.Y.getMeasuredHeight();
        this.f27095i0 = Math.max(0, measuredWidth - this.f27091e0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(fv.x(richText))) {
            ev evVar = new ev(fvVar, fvVar.l(pageblocktable.title, fv.R(0, 15)), this.f27091e0, Layout.Alignment.ALIGN_CENTER);
            this.f27088b0 = evVar;
            evVar.f23775r = true;
            this.f27089c0 = g0.L(9.0f) + evVar.f23770b.getHeight();
        } else {
            this.f27088b0 = null;
            this.f27089c0 = 0;
        }
        ev evVar2 = this.f27088b0;
        if (evVar2 != null) {
            i11 = evVar2.r();
        } else {
            i11 = 0;
        }
        if (fvVar.D()) {
            max = Math.max(0, this.f27091e0);
        } else {
            max = Math.max(0, Math.min(this.f27091e0, Math.max(measuredWidth, i11)));
        }
        this.f27092f0 = max;
        this.f27093g0 = max;
        for (int i19 = 0; i19 < this.Y.getChildCount(); i19++) {
            rx0 d = this.Y.d(i19);
            qx0 qx0Var = d.f39370b;
            if (qx0Var instanceof ev) {
                this.Z.add((ev) qx0Var);
                this.f27090d0.add(new su(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        ev evVar3 = this.f27088b0;
        if (evVar3 != null) {
            arrayList.add(evVar3);
        }
        arrayList.addAll(this.Z);
        this.f27087a0 = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override
    public final int I() {
        Rect rect = this.f22969b;
        return g0.L(10.0f) + rect.top + this.f27089c0 + this.f27094h0 + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22969b;
        return rect.left + this.f27092f0 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
        return this.f27087a0;
    }

    @Override
    public final boolean Q() {
        if (!this.f27102q0) {
            OverScroller overScroller = this.f27111z0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void T() {
        ev evVar = this.f27088b0;
        if (evVar != null) {
            evVar.i(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((ev) obj).i(this.W);
        }
    }

    @Override
    public final void V() {
        ev evVar = this.f27088b0;
        if (evVar != null) {
            evVar.f(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((ev) obj).f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        ev evVar = this.f27088b0;
        if (evVar != null) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            evVar.d(canvas, evVar.T);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.f27089c0);
        fv fvVar = this.f22968a;
        int i11 = fvVar.S;
        h6.m mVar = fvVar.f23998z;
        Rect rect = this.f22969b;
        canvas.saveLayerAlpha(-i11, 0.0f, ((fvVar.C + fvVar.T) - rect.left) - rect.right, this.f27094h0, 255, 31);
        canvas.save();
        canvas.translate(-this.f27096j0, 0.0f);
        yx0 yx0Var = this.Y;
        int childCount = yx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            yx0Var.d(i12).a(canvas, this.W, true);
        }
        canvas.restore();
        RectF rectF = g0.P;
        rectF.set(-fvVar.S, 0.0f, g0.L(12.0f) + i7, this.f27094h0);
        mVar.n(canvas, rectF, 0, 1.0f);
        rectF.set(i10 - g0.L(12.0f), 0.0f, ((fvVar.C + fvVar.T) - rect.left) - rect.right, this.f27094h0);
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
        int i11 = this.f27095i0;
        rx0 rx0Var = null;
        int i12 = 0;
        if (actionMasked == 0) {
            if (this.f27107v0 == 0 && (view = this.W) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.f27107v0 = viewConfiguration.getScaledTouchSlop();
                this.f27108w0 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f27109x0 = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.f27111z0 == null && this.W != null) {
                this.f27111z0 = new OverScroller(this.W.getContext());
            }
            OverScroller overScroller = this.f27111z0;
            if (overScroller != null && !overScroller.isFinished()) {
                this.f27111z0.forceFinished(true);
            }
            this.f27100o0 = motionEvent.getX();
            motionEvent.getY();
            this.f27101p0 = this.f27096j0;
            this.f27102q0 = false;
            VelocityTracker velocityTracker2 = this.f27110y0;
            if (velocityTracker2 == null) {
                this.f27110y0 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f27110y0.addMovement(motionEvent);
            this.f27103r0 = null;
            this.f27106u0 = false;
            int i13 = this.f27089c0;
            ev evVar = this.f27088b0;
            if (evVar != null && motionEvent.getY() < i13) {
                float j02 = j0();
                motionEvent.offsetLocation(-j02, 0.0f);
                boolean t6 = evVar.t(motionEvent);
                motionEvent.offsetLocation(j02, 0.0f);
                if (t6) {
                    this.f27103r0 = evVar;
                    this.f27104s0 = j02;
                    this.f27105t0 = 0.0f;
                    this.f27106u0 = true;
                }
            }
            if (!this.f27106u0) {
                float x10 = motionEvent.getX();
                float f10 = x10 + this.f27096j0;
                float y10 = motionEvent.getY() - i13;
                yx0 yx0Var = this.Y;
                int childCount = yx0Var.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= childCount) {
                        break;
                    }
                    rx0 d = yx0Var.d(i14);
                    if (d.f39370b instanceof ev) {
                        if (f10 >= d.f39382p && f10 < i7 + d.f39377k) {
                            if (y10 >= d.f39383q && y10 < i10 + d.f39378l) {
                                rx0Var = d;
                                break;
                            }
                        }
                    }
                    i14++;
                }
                if (rx0Var != null) {
                    this.f27103r0 = (ev) rx0Var.f39370b;
                    this.f27104s0 = rx0Var.b() - this.f27096j0;
                    this.f27105t0 = rx0Var.c() + i13;
                    this.f27103r0.S.set(rx0Var.f39382p - rx0Var.b(), rx0Var.f39383q - rx0Var.c(), (rx0Var.f39382p + rx0Var.f39377k) - rx0Var.b(), (rx0Var.f39383q + rx0Var.f39378l) - rx0Var.c());
                    motionEvent.offsetLocation(-this.f27104s0, -this.f27105t0);
                    this.f27106u0 = this.f27103r0.t(motionEvent);
                    motionEvent.offsetLocation(this.f27104s0, this.f27105t0);
                }
            }
            if (this.f27106u0 || i11 > 0) {
                return true;
            }
            return false;
        }
        if (actionMasked == 2) {
            VelocityTracker velocityTracker3 = this.f27110y0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x11 = motionEvent.getX() - this.f27100o0;
            if (!this.f27102q0 && i11 > 0 && Math.abs(x11) > this.f27107v0) {
                this.f27102q0 = true;
                a0(true);
                if (this.f27106u0 && this.f27103r0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.f27104s0, -this.f27105t0);
                    this.f27103r0.t(obtain);
                    obtain.recycle();
                    this.f27106u0 = false;
                }
            }
            if (this.f27102q0) {
                int i15 = (int) (this.f27101p0 - x11);
                if (i15 >= 0) {
                    i12 = i15;
                }
                if (i12 <= i11) {
                    i11 = i12;
                }
                if (i11 != this.f27096j0) {
                    this.f27096j0 = i11;
                    Z(this.T, this.U, this.V);
                    View view2 = this.W;
                    if (view2 != null) {
                        view2.invalidate();
                        return true;
                    }
                }
            } else {
                return this.f27106u0;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f27102q0;
                this.f27102q0 = false;
                if (z10) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.f27110y0) != null && this.f27111z0 != null && this.W != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f27110y0.computeCurrentVelocity(1000, this.f27109x0);
                        float f11 = -this.f27110y0.getXVelocity();
                        if (Math.abs(f11) > this.f27108w0) {
                            this.f27111z0.fling(this.f27096j0, 0, (int) f11, 0, 0, this.f27095i0, 0, 0);
                            this.W.postOnAnimation(this.A0);
                        }
                    }
                }
                if (!z10 && this.f27106u0 && this.f27103r0 != null) {
                    motionEvent.offsetLocation(-this.f27104s0, -this.f27105t0);
                    this.f27103r0.t(motionEvent);
                    motionEvent.offsetLocation(this.f27104s0, this.f27105t0);
                }
                boolean z11 = this.f27106u0;
                this.f27106u0 = false;
                this.f27103r0 = null;
                VelocityTracker velocityTracker4 = this.f27110y0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f27110y0 = null;
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
        ev evVar = this.f27088b0;
        if (evVar != null) {
            evVar.f23771c = (j0() + i7) - evVar.n();
            evVar.d = i10;
            evVar.f23772e = i11;
        }
        yx0 yx0Var = this.Y;
        int childCount = yx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            rx0 d = yx0Var.d(i12);
            qx0 qx0Var = d.f39370b;
            if (qx0Var instanceof ev) {
                ev evVar2 = (ev) qx0Var;
                evVar2.f23771c = ((d.b() + i7) - this.f27096j0) - evVar2.n();
                evVar2.d = d.c() + this.f27089c0 + i10;
                evVar2.f23772e = i11;
            }
        }
    }

    @Override
    public final qx0 c(TL_iv.pageTableCell pagetablecell, int i7) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        int R = fv.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        fv fvVar = this.f22968a;
        SpannableStringBuilder l10 = fvVar.l(richText, R);
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        ev evVar = new ev(fvVar, l10, i7, alignment);
        evVar.f23775r = true;
        return evVar;
    }

    @Override
    public final Paint getHeaderPaint() {
        i0();
        return this.m0;
    }

    @Override
    public final Paint getLinePaint() {
        i0();
        return this.f27097k0;
    }

    @Override
    public final Paint getStripPaint() {
        i0();
        return this.f27099n0;
    }

    public final void i0() {
        int i7;
        int i10;
        if (this.f27097k0 == null) {
            Paint paint = new Paint(1);
            this.f27097k0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.f27097k0.setStrokeWidth(g0.N(0.66f));
            Paint paint2 = new Paint();
            this.f27098l0 = paint2;
            paint2.setStyle(style);
            this.f27098l0.setStrokeWidth(g0.N(0.66f));
            this.m0 = new Paint();
            this.f27099n0 = new Paint();
        }
        fv fvVar = this.f22968a;
        if (fvVar.E()) {
            i7 = org.telegram.ui.ActionBar.m6.ll;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.kl;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, fvVar.D);
        this.f27097k0.setColor(w02);
        this.f27098l0.setColor(w02);
        Paint paint3 = this.m0;
        if (fvVar.E()) {
            i10 = org.telegram.ui.ActionBar.m6.jl;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.il;
        }
        paint3.setColor(org.telegram.ui.ActionBar.m6.w0(i10, fvVar.D));
        this.f27099n0.setColor(167772160);
    }

    public final int j0() {
        ev evVar = this.f27088b0;
        if (evVar == null) {
            return 0;
        }
        int i7 = this.f27093g0;
        int i10 = evVar.h;
        int i11 = evVar.f23773f;
        return Math.round(((i7 - (i10 - i11)) / 2.0f) - i11);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        au.l(spannableStringBuilder, this.f27088b0, null);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i7 < arrayList.size()) {
                ev evVar = (ev) arrayList.get(i7);
                if (evVar != null && (staticLayout = evVar.f23770b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
        ArrayList arrayList2 = this.f27090d0;
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
        ev evVar;
        org.telegram.ui.Components.u5 u5Var;
        yx0 yx0Var;
        int i11;
        int i12;
        h6.m mVar;
        int i13;
        org.telegram.ui.Components.u5 u5Var2;
        canvas.save();
        Rect rect = this.f22969b;
        canvas.translate(rect.left, rect.top);
        ev evVar2 = this.f27088b0;
        if (evVar2 != null && (u5Var2 = evVar2.F) != null && !u5Var2.f40262a.isEmpty()) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, evVar2.f23770b, evVar2.F, 0.0f, evVar2.f23778x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.translate(0.0f, this.f27089c0);
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                org.telegram.ui.Components.u5 u5Var3 = ((ev) arrayList.get(i14)).F;
                if (u5Var3 != null && !u5Var3.f40262a.isEmpty()) {
                    fv fvVar = this.f22968a;
                    int i15 = fvVar.S;
                    h6.m mVar2 = fvVar.f23998z;
                    int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((fvVar.C + fvVar.T) - rect.left) - rect.right, this.f27094h0, 255, 31);
                    canvas.save();
                    canvas.translate(-this.f27096j0, 0.0f);
                    yx0 yx0Var2 = this.Y;
                    int childCount = yx0Var2.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount) {
                        qx0 qx0Var = yx0Var2.d(i16).f39370b;
                        if (!(qx0Var instanceof ev) || (u5Var = (evVar = (ev) qx0Var).F) == null || u5Var.f40262a.isEmpty()) {
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
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, evVar.f23770b, evVar.F, 0.0f, evVar.f23778x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
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
                    rectF.set(-fvVar.S, 0.0f, g0.L(12.0f) + i7, this.f27094h0);
                    mVar3.n(canvas, rectF, 0, 1.0f);
                    rectF.set(i10 - g0.L(12.0f), 0.0f, ((fvVar.C + fvVar.T) - rect.left) - rect.right, this.f27094h0);
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
        su suVar;
        float f10;
        int i11;
        yx0 yx0Var;
        int i12;
        int i13;
        int i14;
        float f11;
        yg0 yg0Var = this.L;
        if (yg0Var != null && yg0Var.h) {
            ArrayList arrayList = this.f27090d0;
            if (!arrayList.isEmpty() && yg0Var.d((wg0) arrayList.get(0)) >= 0) {
                float c10 = yg0Var.c((wg0) arrayList.get(0));
                float f12 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.f22969b;
                canvas.translate(rect.left, rect.top);
                ev evVar = this.f27088b0;
                if (evVar != null) {
                    canvas.save();
                    canvas.translate(j0(), 0.0f);
                    evVar.d(canvas, evVar.T);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.f27089c0);
                fv fvVar = this.f22968a;
                int i15 = fvVar.S;
                h6.m mVar = fvVar.f23998z;
                float f13 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((fvVar.C + fvVar.T) - rect.left) - rect.right, this.f27094h0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.f27096j0, 0.0f);
                yx0 yx0Var2 = this.Y;
                int childCount = yx0Var2.getChildCount();
                int i16 = 0;
                int i17 = 0;
                while (i16 < childCount) {
                    float f14 = f13;
                    rx0 d = yx0Var2.d(i16);
                    if (i17 < arrayList.size() && ((su) arrayList.get(i17)).f26910a == d) {
                        suVar = (su) arrayList.get(i17);
                        i17++;
                    } else {
                        suVar = null;
                    }
                    int i18 = i17;
                    if (suVar == null) {
                        d.a(canvas, this.W, true);
                    } else if (!yg0Var.i(suVar)) {
                        d.a(canvas, this.W, false);
                    } else {
                        if (yg0Var.g(suVar)) {
                            d.a(canvas, this.W, false);
                            if (d.f39370b instanceof ev) {
                                canvas.save();
                                f10 = f12;
                                canvas.translate(d.b(), d.c());
                                ev evVar2 = (ev) d.f39370b;
                                if (yg0Var.g(suVar)) {
                                    i14 = yg0Var.f54198e;
                                } else {
                                    i14 = -1;
                                }
                                if (yg0Var.g(suVar)) {
                                    f11 = yg0Var.f54199f;
                                } else {
                                    f11 = f10;
                                }
                                evVar2.m(canvas, i14, f11);
                                canvas.restore();
                            } else {
                                f10 = f12;
                            }
                        } else {
                            f10 = f12;
                            float c11 = yg0Var.c(suVar);
                            if (c11 >= 1.0f) {
                                d.a(canvas, this.W, true);
                            } else {
                                if (c11 > f10 && d.f39370b != null) {
                                    d.a(canvas, this.W, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    yx0Var = yx0Var2;
                                    i13 = i16;
                                    i11 = saveLayerAlpha;
                                    i12 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.f39377k, d.f39378l, (int) (c11 * f14), 31);
                                    d.f39370b.d(canvas, this.W);
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
                rectF.set(-fvVar.S, f15, g0.L(12.0f) + i7, this.f27094h0);
                mVar.n(canvas, rectF, 0, 1.0f);
                rectF.set(i10 - g0.L(12.0f), 0.0f, ((fvVar.C + fvVar.T) - rect.left) - rect.right, this.f27094h0);
                mVar.n(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i19);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        rx0 d;
        ev evVar;
        Rect rect = this.f22969b;
        ev evVar2 = this.f27088b0;
        if (evVar2 != null && evVar2.o(characterStyle, rtVar)) {
            rtVar.f26661e = (j0() + rect.left) - evVar2.n();
            rtVar.f26662f = i7 + rect.top;
            return true;
        }
        yx0 yx0Var = this.Y;
        int childCount = yx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            qx0 qx0Var = yx0Var.d(i10).f39370b;
            if (qx0Var instanceof ev) {
                if (((ev) qx0Var).o(characterStyle, rtVar)) {
                    rtVar.f26661e = ((d.b() + rect.left) - this.f27096j0) - evVar.n();
                    rtVar.f26662f = d.c() + i7 + rect.top + this.f27089c0;
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
