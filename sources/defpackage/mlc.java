package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgress2;
public final class mlc implements n37 {
    public final rc2 a;
    public final r59 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final h22 i;
    public final ylb j;
    public float k;
    public float l;

    public mlc(rc2 rc2Var, ms1 ms1Var, r59 r59Var, h22 h22Var, ylb ylbVar) {
        this.j = ylbVar;
        this.a = rc2Var;
        this.i = h22Var;
        this.b = r59Var;
        rc2Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = ms1Var.getRecordCircle();
        this.g = recordCircle;
        if (recordCircle != null) {
            this.c = recordCircle.M;
            recordCircle.N = true;
            recordCircle.O = true;
        }
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, gm.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = rc2Var.getMessageObject().m1;
        ((ArrayList) h22Var.c).add(this);
        h22Var.a();
        ((ViewGroup) h22Var.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new vjc(this, h22Var, (byte) 2));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new llc(this, rc2Var, h22Var));
        if (rc2Var.getSeekBarWaveform() != null) {
            gx9 seekBarWaveform = rc2Var.getSeekBarWaveform();
            seekBarWaveform.v.e(true, 0.0f);
            rc2 rc2Var2 = seekBarWaveform.n;
            if (rc2Var2 != null) {
                rc2Var2.invalidate();
            }
        }
    }

    @Override
    public final void a(final Canvas canvas) {
        float f;
        float x;
        final float y;
        float y2;
        float x2;
        float f2;
        float f3;
        final float f4 = this.d;
        if (f4 > 0.6f) {
            f = 1.0f;
        } else {
            f = f4 / 0.6f;
        }
        ChatActivityEnterView.RecordCircle recordCircle = this.g;
        h22 h22Var = this.i;
        if (recordCircle == null) {
            x = 0.0f;
            y = 0.0f;
        } else {
            x = (recordCircle.getX() + recordCircle.K) - h22Var.getX();
            y = (recordCircle.getY() + recordCircle.L) - h22Var.getY();
        }
        rc2 rc2Var = this.a;
        int i = rc2Var.getMessageObject().m1;
        int i2 = this.h;
        r59 r59Var = this.b;
        if (i != i2) {
            x2 = this.k;
            y2 = this.l;
        } else {
            y2 = (r59Var.getY() + (rc2Var.getY() + rc2Var.getRadialProgress().a.centerY())) - h22Var.getY();
            x2 = (r59Var.getX() + (rc2Var.getX() + rc2Var.getRadialProgress().a.centerX())) - h22Var.getX();
        }
        this.k = x2;
        this.l = y2;
        float interpolation = d53.f.getInterpolation(f4);
        float interpolation2 = d53.h.getInterpolation(f4);
        final float f5 = (x2 * interpolation2) + ((1.0f - interpolation2) * x);
        float f6 = 1.0f - interpolation;
        final float f7 = (y2 * interpolation) + (y * f6);
        float height = rc2Var.getRadialProgress().a.height() / 2.0f;
        float f8 = (height * interpolation) + (this.c * f6);
        r59Var.getY();
        h22Var.getY();
        r59Var.getMeasuredHeight();
        if (h22Var.getMeasuredHeight() > 0) {
            h22Var.getMeasuredHeight();
        }
        int i3 = rc2Var.getRadialProgress().p;
        int i4 = cmb.Tf;
        ylb ylbVar = this.j;
        float f9 = f;
        int v0 = cmb.v0(i4, ylbVar);
        if (i3 < 0) {
            i3 = i4;
        }
        int f10 = on2.f(interpolation, v0, cmb.v0(i3, ylbVar));
        Paint paint = this.e;
        paint.setColor(f10);
        if (recordCircle != null) {
            float f11 = 1.0f - f9;
            fl0 fl0Var = recordCircle.h;
            fl0 fl0Var2 = recordCircle.n;
            f2 = x;
            float interpolation3 = d53.g.getInterpolation(recordCircle.I);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f12 = chatActivityEnterView.Y4;
            if (f12 > 0.7f) {
                f3 = 1.0f;
            } else {
                f3 = f12 / 0.7f;
            }
            canvas.save();
            float f13 = ((fl0Var2.t * 1.4f) + 0.878f) * chatActivityEnterView.W4 * f3 * interpolation3 * f11;
            canvas.scale(f13, f13, f5, f7);
            fl0Var2.a(f5, f7, canvas, fl0Var2.d);
            canvas.restore();
            float f14 = ((fl0Var.t * 1.4f) + 0.926f) * chatActivityEnterView.W4 * f3 * interpolation3 * f11;
            canvas.save();
            canvas.scale(f14, f14, f5, f7);
            fl0Var.a(f5, f7, canvas, fl0Var.d);
            canvas.restore();
        } else {
            f2 = x;
        }
        canvas.drawCircle(f5, f7, f8, paint);
        canvas.save();
        final float f15 = f8 / height;
        canvas.scale(f15, f15, f5, f7);
        final float centerX = f5 - rc2Var.getRadialProgress().a.centerX();
        final float centerY = f7 - rc2Var.getRadialProgress().a.centerY();
        canvas.translate(centerX, centerY);
        rc2Var.getRadialProgress().E = interpolation;
        rc2Var.getRadialProgress().B = false;
        final float f16 = f2;
        rc2Var.E1(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                float f17;
                Canvas canvas2;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                mlc mlcVar = mlc.this;
                RadialProgress2 radialProgress = mlcVar.a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f18 = centerX;
                float f19 = centerY;
                canvas3.translate(-f18, -f19);
                float f20 = f15;
                float f21 = 1.0f / f20;
                float f22 = f5;
                float f23 = f7;
                canvas3.scale(f21, f21, f22, f23);
                ChatActivityEnterView.RecordCircle recordCircle2 = mlcVar.g;
                if (recordCircle2 != null) {
                    int i5 = (int) f16;
                    int i6 = (int) y;
                    float f24 = 1.0f - f4;
                    recordCircle2.b();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z = chatActivityEnterView2.h5;
                    Rect rect = chatActivityEnterView2.I4;
                    Drawable drawable4 = null;
                    if (z) {
                        if (recordCircle2.f != 1.0f) {
                            if (chatActivityEnterView2.d1) {
                                drawable3 = chatActivityEnterView2.F4;
                            } else {
                                drawable3 = chatActivityEnterView2.E4;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.G4;
                        f17 = f24;
                        canvas2 = canvas3;
                        rect.set(aq1.A(2, i5, drawable2), aq1.y(2, i6, drawable2), aq1.w(2, i5, drawable2), aq1.i(2, i6, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(aq1.A(2, i5, drawable4), aq1.y(2, i6, drawable4), aq1.w(2, i5, drawable4), aq1.i(2, i6, drawable4));
                        }
                    } else {
                        f17 = f24;
                        canvas2 = canvas3;
                        if (chatActivityEnterView2.d1) {
                            drawable = chatActivityEnterView2.F4;
                        } else {
                            drawable = chatActivityEnterView2.E4;
                        }
                        drawable2 = drawable;
                        rect.set(i5 - gm.L(12.0f), i6 - gm.L(12.0f), gm.L(12.0f) + i5, gm.L(12.0f) + i6);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    float f25 = 1.0f;
                    float L = (recordCircle2.M - gm.L(19.0f)) / Math.max(1.0f, recordCircle2.r - gm.L(19.0f));
                    if (L < 0.0f) {
                        f25 = 0.0f;
                    } else if (L <= 1.0f) {
                        f25 = L;
                    }
                    recordCircle2.d0 = f25;
                    canvas3 = canvas2;
                    recordCircle2.c(canvas3, drawable5, drawable6, recordCircle2.f, (int) (255.0f * f17));
                }
                canvas3.scale(f20, f20, f22, f23);
                canvas3.translate(f18, f19);
            }
        });
        rc2Var.getRadialProgress().B = true;
        rc2Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
