package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import org.telegram.tgnet.tl.TL_iv;
public final class nu extends cu {
    public final TL_iv.pageBlockMath X;
    public final Bitmap Y;
    public final int Z;
    public final int f25639a0;
    public final int f25640b0;
    public final int f25641c0;
    public final int f25642d0;
    public int f25643e0;
    public float f25644f0;
    public int f25645g0;
    public boolean f25646h0;
    public int f25647i0;
    public final Paint f25648j0;
    public int f25649k0;
    public int f25650l0;
    public VelocityTracker m0;
    public OverScroller f25651n0;
    public final j6.o f25652o0;

    public nu(iv ivVar, Rect rect, int i7, TL_iv.pageBlockMath pageblockmath) {
        super(ivVar, rect, i7);
        oi.p pVar;
        this.f25648j0 = new Paint(3);
        this.f25652o0 = new j6.o(this, 13);
        this.X = pageblockmath;
        int i10 = this.f22943c;
        this.f25640b0 = i10;
        if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
            pVar = oi.p.a(pageblockmath.source, g0.L(ivVar.M + 4), false);
        } else {
            pVar = null;
        }
        if (pVar != null) {
            this.Y = pVar.f21862a;
            this.Z = pVar.f21863b;
            this.f25639a0 = pVar.f21864c;
        }
        int D = k5.D(0.0f, 2, this.Z);
        this.f25641c0 = D;
        this.f25642d0 = Math.max(0, D - i10);
    }

    @Override
    public final int I() {
        Rect rect = this.f22942b;
        return k5.D(8.0f, 2, rect.top + this.f25639a0) + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22942b;
        return Math.min(this.f25640b0, this.f25641c0) + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (!this.f25646h0) {
            OverScroller overScroller = this.f25651n0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        float f10;
        Canvas canvas2;
        int i10;
        int i11;
        Bitmap bitmap = this.Y;
        if (bitmap == null) {
            return;
        }
        iv ivVar = this.f22941a;
        if (ivVar.E()) {
            i7 = org.telegram.ui.ActionBar.j6.Wc;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.Vc;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, ivVar.D);
        Paint paint = this.f25648j0;
        paint.setColor(w02);
        int D = k5.D(8.0f, 2, this.f25639a0);
        int i12 = this.f25642d0;
        Rect rect = this.f22942b;
        if (i12 > 0) {
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-ivVar.S, 0.0f, ((ivVar.C + ivVar.T) - rect.left) - rect.right, D, 255, 31);
            canvas2.save();
            canvas2.translate(g0.L(0.0f) - this.f25643e0, g0.L(8.0f));
        } else {
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.save();
            canvas2.translate(((ivVar.C / 2.0f) - rect.left) - (this.Z / 2.0f), g0.L(8.0f));
        }
        float f11 = f10;
        canvas2.drawBitmap(bitmap, f11, f11, paint);
        if (i12 > 0) {
            canvas2.restore();
            RectF rectF = g0.P;
            float f12 = D;
            rectF.set(-i10, f11, g0.L(12.0f) + (-ivVar.S), f12);
            ivVar.f24467z.m(canvas2, rectF, 0, 1.0f);
            rectF.set(i11 - g0.L(12.0f), f11, ((ivVar.C + ivVar.T) - rect.left) - rect.right, f12);
            ivVar.f24467z.m(canvas2, rectF, 2, 1.0f);
        }
        canvas2.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int i7 = 0;
        int i10 = this.f25642d0;
        if (i10 > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.f25647i0 == 0 && (view = this.W) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.f25647i0 = viewConfiguration.getScaledTouchSlop();
                    this.f25649k0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f25650l0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                if (this.f25651n0 == null && this.W != null) {
                    this.f25651n0 = new OverScroller(this.W.getContext());
                }
                OverScroller overScroller = this.f25651n0;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f25651n0.forceFinished(true);
                }
                this.f25644f0 = motionEvent.getX();
                this.f25645g0 = this.f25643e0;
                this.f25646h0 = false;
                VelocityTracker velocityTracker2 = this.m0;
                if (velocityTracker2 == null) {
                    this.m0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.m0.addMovement(motionEvent);
                return true;
            } else if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.m0;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.f25644f0;
                if (!this.f25646h0 && Math.abs(x10) > this.f25647i0) {
                    this.f25646h0 = true;
                    a0(true);
                }
                if (this.f25646h0) {
                    int i11 = (int) (this.f25645g0 - x10);
                    if (i11 >= 0) {
                        i7 = i11;
                    }
                    if (i7 <= i10) {
                        i10 = i7;
                    }
                    if (i10 != this.f25643e0) {
                        this.f25643e0 = i10;
                        View view2 = this.W;
                        if (view2 != null) {
                            view2.invalidate();
                            return true;
                        }
                    }
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f25646h0;
                this.f25646h0 = false;
                if (z10) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.m0) != null && this.f25651n0 != null && this.W != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.m0.computeCurrentVelocity(1000, this.f25650l0);
                        float f10 = -this.m0.getXVelocity();
                        if (Math.abs(f10) > this.f25649k0) {
                            this.f25651n0.fling(this.f25643e0, 0, (int) f10, 0, 0, this.f25642d0, 0, 0);
                            this.W.postOnAnimation(this.f25652o0);
                        }
                    }
                }
                VelocityTracker velocityTracker4 = this.m0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.m0 = null;
                }
                if (z10 || actionMasked == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        TL_iv.pageBlockMath pageblockmath = this.X;
        if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
            spannableStringBuilder.append((CharSequence) pageblockmath.source);
        }
    }
}
