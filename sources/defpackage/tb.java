package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b0;
public final class tb extends View {
    public final byte a;
    public Object b;

    public tb(LaunchActivity launchActivity, qc qcVar) {
        super(launchActivity);
        this.a = (byte) 15;
        this.b = qcVar;
        jn7.i(this);
        setOnClickListener(new je3(this, launchActivity, (byte) 24));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 8:
                rl0 rl0Var = ((z92) this.b).M;
                if (rl0Var != null) {
                    rl0Var.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            case 15:
                super.dispatchDraw(canvas);
                qc qcVar = (qc) this.b;
                if (qcVar != null && qcVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            case 19:
                super.dispatchDraw(canvas);
                qy5 qy5Var = ((hc8) this.b).G0;
                if (qy5Var != null) {
                    qy5Var.d(canvas);
                    return;
                }
                return;
            case 23:
                super.dispatchDraw(canvas);
                yw7 yw7Var = ((wab) this.b).y0;
                if (yw7Var != null) {
                    yw7Var.d(canvas);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 16:
                super.draw(canvas);
                ((pkb) this.b).e(canvas, (getMeasuredWidth() - ((pkb) this.b).j()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 13:
                super.onAttachedToWindow();
                xx4 xx4Var = (xx4) this.b;
                if (xx4Var != null && !xx4Var.i) {
                    xx4Var.i = true;
                    xx4Var.a();
                    zj3 zj3Var = new zj3(xx4Var, (byte) 12);
                    xx4Var.h = zj3Var;
                    i86.a(zj3Var);
                    return;
                }
                return;
            case 15:
                super.onAttachedToWindow();
                qc qcVar = (qc) this.b;
                if (qcVar != null) {
                    qcVar.i = this;
                    int i = 0;
                    while (true) {
                        y85[] y85VarArr = (y85[]) qcVar.e;
                        if (i < y85VarArr.length) {
                            y85 y85Var = y85VarArr[i];
                            y85Var.i.add(this);
                            y85Var.a();
                            i++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 22:
                super.onAttachedToWindow();
                ((uu7) this.b).f = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        int i = 0;
        switch (this.a) {
            case 13:
                super.onDetachedFromWindow();
                xx4 xx4Var = (xx4) this.b;
                if (xx4Var != null && xx4Var.i) {
                    xx4Var.i = false;
                    xx4Var.a();
                    zj3 zj3Var = xx4Var.h;
                    HashSet hashSet = i86.n;
                    if (hashSet != null) {
                        hashSet.remove(zj3Var);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                super.onDetachedFromWindow();
                qc qcVar = (qc) this.b;
                if (qcVar == null || ((tb) qcVar.i) == this) {
                    return;
                }
                while (true) {
                    y85[] y85VarArr = (y85[]) qcVar.e;
                    if (i < y85VarArr.length) {
                        y85 y85Var = y85VarArr[i];
                        y85Var.i.remove(this);
                        y85Var.a();
                        i++;
                    } else {
                        qcVar.i = null;
                        return;
                    }
                }
                break;
            case 22:
                super.onDetachedFromWindow();
                ((uu7) this.b).f = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h13 h13Var;
        int ceil;
        int i;
        int i2;
        int ceil2;
        int i3;
        int i4;
        switch (this.a) {
            case 2:
                sr0 sr0Var = (sr0) this.b;
                canvas.drawColor(sr0Var.s);
                if (sr0Var.e.c(canvas, getWidth())) {
                    invalidate();
                    return;
                }
                return;
            case 9:
                super.onDraw(canvas);
                xo2 xo2Var = (xo2) this.b;
                n15 n15Var = xo2Var.E1;
                float max = Math.max(xo2Var.l1.e, xo2Var.m1.e);
                n15 n15Var2 = xo2Var.D1;
                n15Var2.c(hl.L(42.0f) + xo2Var.O1.b, 0);
                n15Var2.setBounds(0, 0, getWidth(), hl.L(56.0f) + xo2Var.O1.b);
                int i5 = aob.a7;
                n15Var2.b(aob.p1(hl.R1(1.0f, 0.8f, max), aob.v0(i5, xo2Var.J0)));
                n15Var2.draw(canvas);
                if (xo2Var.H1) {
                    max = 1.0f;
                }
                int U1 = hl.U1(max, hl.L(48.0f) + xo2Var.O1.d, 0);
                int U12 = hl.U1(max, hl.L(72.0f), 0) + xo2Var.O1.d;
                float R1 = hl.R1(0.8f, hl.Q0(xo2Var.O1.d), max);
                n15Var.c(0, U1);
                n15Var.setBounds(0, getHeight() - U12, getWidth(), getHeight());
                n15Var.b(aob.p1(R1, aob.v0(i5, xo2Var.J0)));
                n15Var.draw(canvas);
                return;
            case 10:
                if (((h13) this.b).U1) {
                    canvas.drawRect(h13Var.u0, 0.0f, getMeasuredWidth() - h13Var.u0, 1.0f, aob.j0);
                    return;
                }
                return;
            case 11:
                ul ulVar = ((of3) this.b).o4;
                ulVar.setBounds(0, 0, getWidth(), getHeight());
                ulVar.draw(canvas);
                return;
            case 20:
                super.onDraw(canvas);
                l46 l46Var = (l46) this.b;
                if (l46Var.k2 - l46Var.j2 > 1) {
                    Paint U0 = aob.U0("paintDivider", l46Var.J0);
                    if (U0 == null) {
                        U0 = aob.j0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    return;
                }
                return;
            case 21:
                canvas.drawColor(aob.v0(aob.e7, ((qi7) this.b).J0));
                return;
            case 24:
                w78 w78Var = (w78) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, w78Var.c.size())));
                TextPaint textPaint = w78Var.T;
                int max2 = Math.max(hl.L(16.0f) + ((int) Math.ceil(textPaint.measureText(format))), hl.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                textPaint.setColor(aob.w0(null, aob.C5, false));
                Paint paint = w78Var.V;
                paint.setColor(aob.w0(null, aob.h5, false));
                RectF rectF = w78Var.U;
                int i6 = max2 / 2;
                rectF.set(measuredWidth - i6, 0.0f, i6 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), paint);
                paint.setColor(aob.w0(null, aob.B5, false));
                rectF.set(hl.L(2.0f) + i, hl.L(2.0f), i2 - hl.L(2.0f), getMeasuredHeight() - hl.L(2.0f));
                canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (ceil / 2), hl.L(16.2f), textPaint);
                return;
            case 25:
                l98 l98Var = (l98) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, l98Var.c.size())));
                TextPaint textPaint2 = l98Var.i0;
                int max3 = Math.max(hl.L(16.0f) + ((int) Math.ceil(textPaint2.measureText(format2))), hl.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                textPaint2.setColor(aob.w0(null, aob.C5, false));
                Paint paint2 = l98Var.k0;
                paint2.setColor(aob.w0(null, l98Var.v0, false));
                RectF rectF2 = l98Var.j0;
                int i7 = max3 / 2;
                rectF2.set(measuredWidth2 - i7, 0.0f, i7 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(rectF2, hl.L(12.0f), hl.L(12.0f), paint2);
                paint2.setColor(aob.w0(null, aob.B5, false));
                rectF2.set(hl.L(2.0f) + i3, hl.L(2.0f), i4 - hl.L(2.0f), getMeasuredHeight() - hl.L(2.0f));
                canvas.drawRoundRect(rectF2, hl.L(10.0f), hl.L(10.0f), paint2);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), hl.L(16.2f), textPaint2);
                return;
            case 26:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                return;
            case 27:
                super.onDraw(canvas);
                ((nc8) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                sr0 sr0Var = (sr0) this.b;
                if (sr0Var.G) {
                    sr0Var.e.m(motionEvent, true);
                }
                return sr0Var.G;
            default:
                return super.onHoverEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int round;
        int i5;
        int i6;
        int i7 = 0;
        switch (this.a) {
            case 0:
                cc ccVar = (cc) this.b;
                if (ccVar.I) {
                    i3 = (cc.A0(ccVar).getMeasuredHeight() + ccVar.J) - hl.L(16.0f);
                } else {
                    int L = hl.L(140.0f) + ccVar.J;
                    if (hl.L(24.0f) + ccVar.E.getMeasuredHeight() > L) {
                        L = hl.L(24.0f) + ccVar.E.getMeasuredHeight();
                    }
                    i3 = L;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i3 - 0.0f), 1073741824));
                return;
            case 1:
                x46 x46Var = ((eo0) this.b).d.G;
                if (x46Var instanceof td4) {
                    i4 = ((td4) x46Var).J;
                } else {
                    i4 = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, i4), 1073741824));
                return;
            case 2:
                int size = View.MeasureSpec.getSize(i);
                sr0 sr0Var = (sr0) this.b;
                int height = sr0Var.getHeight();
                v0d v0dVar = sr0Var.e;
                q0d q0dVar = v0dVar.p;
                if (q0dVar == null || (round = q0dVar.h) <= 0) {
                    round = Math.round(v0dVar.b * 160.0f);
                }
                setMeasuredDimension(size, Math.max(height, round));
                return;
            case 3:
                ny0 ny0Var = (ny0) this.b;
                int i8 = ny0Var.q1;
                if (i8 == 0) {
                    i5 = hl.L(300.0f);
                } else {
                    i5 = (int) (i8 * ny0Var.u1);
                }
                int i9 = i5 - (((ny0Var.A1 - ny0Var.B1) - ny0Var.C1) - ny0Var.D1);
                if (i9 < 1) {
                    i9 = 1;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(((u52) this.b).w.K, 1073741824));
                return;
            case 6:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((a72) ((t20) this.b).e).S0);
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(((w72) ((kr) this.b).d).x, 1073741824));
                return;
            case 14:
                m15 m15Var = (m15) this.b;
                if (m15Var.I) {
                    i6 = (m15Var.o0().getMeasuredHeight() + m15Var.J) - hl.L(16.0f);
                    m15Var.K = i6;
                } else {
                    int L2 = hl.L(140.0f) + m15Var.J;
                    if (hl.L(24.0f) + m15Var.E.getMeasuredHeight() > L2) {
                        L2 = Math.max(L2, (hl.L(24.0f) + m15Var.E.getMeasuredHeight()) - m15Var.M);
                    }
                    i6 = L2;
                    m15Var.K = i6;
                }
                int i10 = (int) (i6 - 0.0f);
                m15Var.K = i10;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return;
            case 15:
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(38.0f));
                return;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((pkb) this.b).j()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((pkb) this.b).h()), hl.L(26.0f)), 1073741824));
                return;
            case 17:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f) + ((ft5) this.b).c.i2, 1073741824));
                return;
            case 18:
                int L3 = hl.L(48.0f);
                lt5 lt5Var = ((ht5) this.b).n;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L3 + lt5Var.i2 + lt5Var.o2, 1073741824));
                return;
            case 22:
                ((View) getParent()).getMeasuredHeight();
                uu7 uu7Var = (uu7) this.b;
                Integer num = uu7Var.d;
                if (num != null) {
                    i7 = num.intValue();
                    uu7Var.h = i7;
                } else {
                    uu7Var.h = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                return;
            case 28:
                PremiumPreviewFragment premiumPreviewFragment = ((b0) this.b).c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L4 = hl.L(64.0f);
                    if (hl.L(8.0f) + premiumPreviewFragment.V.getMeasuredHeight() > L4) {
                        L4 = premiumPreviewFragment.V.getMeasuredHeight() + hl.L(8.0f);
                    }
                    premiumPreviewFragment.Z = L4;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(premiumPreviewFragment.Z, 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                sr0 sr0Var = (sr0) this.b;
                if (sr0Var.G && sr0Var.e.n(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 4:
                super.setAlpha(f);
                View view = ((e81) this.b).b.y.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 12:
                super.setAlpha(f);
                View view2 = ((uj3) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 29:
                super.setAlpha(f);
                View view3 = ((ProfileActivity) this.b).fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setBackground(Drawable drawable) {
        switch (this.a) {
            case 13:
                if (((xx4) this.b) != null) {
                    if (isAttachedToWindow()) {
                        xx4 xx4Var = (xx4) this.b;
                        if (xx4Var.i) {
                            xx4Var.i = false;
                            xx4Var.a();
                            zj3 zj3Var = xx4Var.h;
                            HashSet hashSet = i86.n;
                            if (hashSet != null) {
                                hashSet.remove(zj3Var);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xx4) {
                    this.b = (xx4) drawable;
                    if (isAttachedToWindow()) {
                        xx4 xx4Var2 = (xx4) this.b;
                        if (!xx4Var2.i) {
                            xx4Var2.i = true;
                            xx4Var2.a();
                            zj3 zj3Var2 = new zj3(xx4Var2, (byte) 12);
                            xx4Var2.h = zj3Var2;
                            i86.a(zj3Var2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setBackground(drawable);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 3:
                super.setTranslationY(f);
                int i = ny0.R1;
                ((ny0) this.b).b.invalidate();
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public tb(Context context, byte b) {
        super(context);
        this.a = b;
    }

    public tb(ny0 ny0Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.b = ny0Var;
        setTag(-33024);
    }

    public tb(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
