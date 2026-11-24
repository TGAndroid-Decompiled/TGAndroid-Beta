package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b0;
public final class sb extends View {
    public final byte a;
    public Object b;

    public sb(LaunchActivity launchActivity, pc pcVar) {
        super(launchActivity);
        this.a = (byte) 14;
        this.b = pcVar;
        kk7.i(this);
        setOnClickListener(new xf3(this, launchActivity, (byte) 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
                ql0 ql0Var = ((j92) this.b).L;
                if (ql0Var != null) {
                    ql0Var.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            case 14:
                super.dispatchDraw(canvas);
                pc pcVar = (pc) this.b;
                if (pcVar != null && pcVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            case 18:
                super.dispatchDraw(canvas);
                lw5 lw5Var = ((q88) this.b).M0;
                if (lw5Var != null) {
                    lw5Var.d(canvas);
                    return;
                }
                return;
            case 22:
                super.dispatchDraw(canvas);
                rt7 rt7Var = ((x6b) this.b).E0;
                if (rt7Var != null) {
                    rt7Var.d(canvas);
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
            case 15:
                super.draw(canvas);
                ((tgb) this.b).e(canvas, (getMeasuredWidth() - ((tgb) this.b).j()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 12:
                super.onAttachedToWindow();
                sv4 sv4Var = (sv4) this.b;
                if (sv4Var != null && !sv4Var.i) {
                    sv4Var.i = true;
                    sv4Var.a();
                    hj3 hj3Var = new hj3(sv4Var, (byte) 12);
                    sv4Var.h = hj3Var;
                    e66.a(hj3Var);
                    return;
                }
                return;
            case 14:
                super.onAttachedToWindow();
                pc pcVar = (pc) this.b;
                if (pcVar != null) {
                    pcVar.i = this;
                    int i = 0;
                    while (true) {
                        w65[] w65VarArr = (w65[]) pcVar.e;
                        if (i < w65VarArr.length) {
                            w65 w65Var = w65VarArr[i];
                            w65Var.i.add(this);
                            w65Var.a();
                            i++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 21:
                super.onAttachedToWindow();
                ((or7) this.b).f = true;
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
            case 12:
                super.onDetachedFromWindow();
                sv4 sv4Var = (sv4) this.b;
                if (sv4Var != null && sv4Var.i) {
                    sv4Var.i = false;
                    sv4Var.a();
                    hj3 hj3Var = sv4Var.h;
                    HashSet hashSet = e66.n;
                    if (hashSet != null) {
                        hashSet.remove(hj3Var);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                super.onDetachedFromWindow();
                pc pcVar = (pc) this.b;
                if (pcVar == null || ((sb) pcVar.i) == this) {
                    return;
                }
                while (true) {
                    w65[] w65VarArr = (w65[]) pcVar.e;
                    if (i < w65VarArr.length) {
                        w65 w65Var = w65VarArr[i];
                        w65Var.i.remove(this);
                        w65Var.a();
                        i++;
                    } else {
                        pcVar.i = null;
                        return;
                    }
                }
                break;
            case 21:
                super.onDetachedFromWindow();
                ((or7) this.b).f = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        o03 o03Var;
        int ceil;
        int i;
        int i2;
        int ceil2;
        int i3;
        int i4;
        switch (this.a) {
            case 8:
                super.onDraw(canvas);
                eo2 eo2Var = (eo2) this.b;
                jz4 jz4Var = eo2Var.E1;
                float max = Math.max(eo2Var.l1.e, eo2Var.m1.e);
                jz4 jz4Var2 = eo2Var.D1;
                jz4Var2.c(gl.L(42.0f) + eo2Var.O1.b, 0);
                jz4Var2.setBounds(0, 0, getWidth(), gl.L(56.0f) + eo2Var.O1.b);
                int i5 = bkb.Z6;
                jz4Var2.b(bkb.p1(gl.R1(1.0f, 0.8f, max), bkb.v0(i5, eo2Var.J0)));
                jz4Var2.draw(canvas);
                if (eo2Var.H1) {
                    max = 1.0f;
                }
                int U1 = gl.U1(max, gl.L(48.0f) + eo2Var.O1.d, 0);
                int U12 = gl.U1(max, gl.L(72.0f), 0) + eo2Var.O1.d;
                float R1 = gl.R1(0.8f, gl.Q0(eo2Var.O1.d), max);
                jz4Var.c(0, U1);
                jz4Var.setBounds(0, getHeight() - U12, getWidth(), getHeight());
                jz4Var.b(bkb.p1(R1, bkb.v0(i5, eo2Var.J0)));
                jz4Var.draw(canvas);
                return;
            case 9:
                if (((o03) this.b).U1) {
                    canvas.drawRect(o03Var.u0, 0.0f, getMeasuredWidth() - o03Var.u0, 1.0f, bkb.j0);
                    return;
                }
                return;
            case 10:
                tl tlVar = ((ue3) this.b).o4;
                tlVar.setBounds(0, 0, getWidth(), getHeight());
                tlVar.draw(canvas);
                return;
            case 19:
                super.onDraw(canvas);
                h26 h26Var = (h26) this.b;
                if (h26Var.k2 - h26Var.j2 > 1) {
                    Paint U0 = bkb.U0("paintDivider", h26Var.J0);
                    if (U0 == null) {
                        U0 = bkb.j0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    return;
                }
                return;
            case 20:
                canvas.drawColor(bkb.v0(bkb.d7, ((gg7) this.b).J0));
                return;
            case 23:
                g48 g48Var = (g48) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, g48Var.c.size())));
                TextPaint textPaint = g48Var.T;
                int max2 = Math.max(gl.L(16.0f) + ((int) Math.ceil(textPaint.measureText(format))), gl.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                textPaint.setColor(bkb.w0(null, bkb.B5, false));
                Paint paint = g48Var.V;
                paint.setColor(bkb.w0(null, bkb.g5, false));
                RectF rectF = g48Var.U;
                int i6 = max2 / 2;
                rectF.set(measuredWidth - i6, 0.0f, i6 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), paint);
                paint.setColor(bkb.w0(null, bkb.A5, false));
                rectF.set(gl.L(2.0f) + i, gl.L(2.0f), i2 - gl.L(2.0f), getMeasuredHeight() - gl.L(2.0f));
                canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (ceil / 2), gl.L(16.2f), textPaint);
                return;
            case 24:
                u58 u58Var = (u58) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, u58Var.c.size())));
                TextPaint textPaint2 = u58Var.i0;
                int max3 = Math.max(gl.L(16.0f) + ((int) Math.ceil(textPaint2.measureText(format2))), gl.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                textPaint2.setColor(bkb.w0(null, bkb.B5, false));
                Paint paint2 = u58Var.k0;
                paint2.setColor(bkb.w0(null, u58Var.v0, false));
                RectF rectF2 = u58Var.j0;
                int i7 = max3 / 2;
                rectF2.set(measuredWidth2 - i7, 0.0f, i7 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(rectF2, gl.L(12.0f), gl.L(12.0f), paint2);
                paint2.setColor(bkb.w0(null, bkb.A5, false));
                rectF2.set(gl.L(2.0f) + i3, gl.L(2.0f), i4 - gl.L(2.0f), getMeasuredHeight() - gl.L(2.0f));
                canvas.drawRoundRect(rectF2, gl.L(10.0f), gl.L(10.0f), paint2);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), gl.L(16.2f), textPaint2);
                return;
            case 25:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                return;
            case 26:
                super.onDraw(canvas);
                ((x88) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 29:
                canvas.save();
                canvas.translate(gl.N(22.6f), gl.N(21.66f));
                ((ac9) this.b).c.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        switch (this.a) {
            case 0:
                bc bcVar = (bc) this.b;
                if (bcVar.I) {
                    i3 = (bc.z0(bcVar).getMeasuredHeight() + bcVar.J) - gl.L(16.0f);
                } else {
                    int L = gl.L(140.0f) + bcVar.J;
                    if (gl.L(24.0f) + bcVar.E.getMeasuredHeight() > L) {
                        L = gl.L(24.0f) + bcVar.E.getMeasuredHeight();
                    }
                    i3 = L;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i3 - 0.0f), 1073741824));
                return;
            case 1:
                t26 t26Var = ((eo0) this.b).d.G;
                if (t26Var instanceof wb4) {
                    i4 = ((wb4) t26Var).J;
                } else {
                    i4 = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, i4), 1073741824));
                return;
            case 2:
                fy0 fy0Var = (fy0) this.b;
                int i8 = fy0Var.q1;
                if (i8 == 0) {
                    i5 = gl.L(300.0f);
                } else {
                    i5 = (int) (i8 * fy0Var.u1);
                }
                int i9 = i5 - (((fy0Var.A1 - fy0Var.B1) - fy0Var.C1) - fy0Var.D1);
                if (i9 < 1) {
                    i9 = 1;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(((e52) this.b).w.K, 1073741824));
                return;
            case 5:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((k62) ((s20) this.b).e).S0);
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(((f72) ((jr) this.b).d).x, 1073741824));
                return;
            case 13:
                iz4 iz4Var = (iz4) this.b;
                if (iz4Var.I) {
                    i6 = (iz4Var.o0().getMeasuredHeight() + iz4Var.J) - gl.L(16.0f);
                    iz4Var.K = i6;
                } else {
                    int L2 = gl.L(140.0f) + iz4Var.J;
                    if (gl.L(24.0f) + iz4Var.E.getMeasuredHeight() > L2) {
                        L2 = Math.max(L2, (gl.L(24.0f) + iz4Var.E.getMeasuredHeight()) - iz4Var.M);
                    }
                    i6 = L2;
                    iz4Var.K = i6;
                }
                int i10 = (int) (i6 - 0.0f);
                iz4Var.K = i10;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(38.0f));
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((tgb) this.b).j()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((tgb) this.b).h()), gl.L(26.0f)), 1073741824));
                return;
            case 16:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(48.0f) + ((dr5) this.b).c.i2, 1073741824));
                return;
            case 17:
                int L3 = gl.L(48.0f);
                jr5 jr5Var = ((fr5) this.b).n;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L3 + jr5Var.i2 + jr5Var.o2, 1073741824));
                return;
            case 21:
                ((View) getParent()).getMeasuredHeight();
                or7 or7Var = (or7) this.b;
                Integer num = or7Var.d;
                if (num != null) {
                    i7 = num.intValue();
                    or7Var.h = i7;
                } else {
                    or7Var.h = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                return;
            case 27:
                PremiumPreviewFragment premiumPreviewFragment = ((b0) this.b).c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L4 = gl.L(64.0f);
                    if (gl.L(8.0f) + premiumPreviewFragment.V.getMeasuredHeight() > L4) {
                        L4 = premiumPreviewFragment.V.getMeasuredHeight() + gl.L(8.0f);
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
    public final void setAlpha(float f) {
        switch (this.a) {
            case 3:
                super.setAlpha(f);
                View view = ((w71) this.b).b.y.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 11:
                super.setAlpha(f);
                View view2 = ((cj3) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 28:
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
            case 12:
                if (((sv4) this.b) != null) {
                    if (isAttachedToWindow()) {
                        sv4 sv4Var = (sv4) this.b;
                        if (sv4Var.i) {
                            sv4Var.i = false;
                            sv4Var.a();
                            hj3 hj3Var = sv4Var.h;
                            HashSet hashSet = e66.n;
                            if (hashSet != null) {
                                hashSet.remove(hj3Var);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof sv4) {
                    this.b = (sv4) drawable;
                    if (isAttachedToWindow()) {
                        sv4 sv4Var2 = (sv4) this.b;
                        if (!sv4Var2.i) {
                            sv4Var2.i = true;
                            sv4Var2.a();
                            hj3 hj3Var2 = new hj3(sv4Var2, (byte) 12);
                            sv4Var2.h = hj3Var2;
                            e66.a(hj3Var2);
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
            case 2:
                super.setTranslationY(f);
                int i = fy0.R1;
                ((fy0) this.b).b.invalidate();
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public sb(Context context, byte b) {
        super(context);
        this.a = b;
    }

    public sb(fy0 fy0Var, Context context) {
        super(context);
        this.a = (byte) 2;
        this.b = fy0Var;
        setTag(-33024);
    }

    public sb(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
