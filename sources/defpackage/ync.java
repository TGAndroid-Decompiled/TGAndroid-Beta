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
public final class ync implements u37 {
    public final wb2 a;
    public final d79 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final m12 i;
    public final vnb j;
    public float k;
    public float l;

    public ync(wb2 wb2Var, nr1 nr1Var, d79 d79Var, m12 m12Var, vnb vnbVar) {
        this.j = vnbVar;
        this.a = wb2Var;
        this.i = m12Var;
        this.b = d79Var;
        wb2Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = nr1Var.getRecordCircle();
        this.g = recordCircle;
        if (recordCircle != null) {
            this.c = recordCircle.M;
            recordCircle.N = true;
            recordCircle.O = true;
        }
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, hl.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = wb2Var.getMessageObject().m1;
        ((ArrayList) m12Var.c).add(this);
        m12Var.a();
        ((ViewGroup) m12Var.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new cmc(this, m12Var, (byte) 2));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new xnc(this, wb2Var, m12Var));
        if (wb2Var.getSeekBarWaveform() != null) {
            xy9 seekBarWaveform = wb2Var.getSeekBarWaveform();
            seekBarWaveform.v.e(true, 0.0f);
            wb2 wb2Var2 = seekBarWaveform.n;
            if (wb2Var2 != null) {
                wb2Var2.invalidate();
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
        m12 m12Var = this.i;
        if (recordCircle == null) {
            x = 0.0f;
            y = 0.0f;
        } else {
            x = (recordCircle.getX() + recordCircle.K) - m12Var.getX();
            y = (recordCircle.getY() + recordCircle.L) - m12Var.getY();
        }
        wb2 wb2Var = this.a;
        int i = wb2Var.getMessageObject().m1;
        int i2 = this.h;
        d79 d79Var = this.b;
        if (i != i2) {
            x2 = this.k;
            y2 = this.l;
        } else {
            y2 = (d79Var.getY() + (wb2Var.getY() + wb2Var.getRadialProgress().a.centerY())) - m12Var.getY();
            x2 = (d79Var.getX() + (wb2Var.getX() + wb2Var.getRadialProgress().a.centerX())) - m12Var.getX();
        }
        this.k = x2;
        this.l = y2;
        float interpolation = k43.f.getInterpolation(f4);
        float interpolation2 = k43.h.getInterpolation(f4);
        final float f5 = (x2 * interpolation2) + ((1.0f - interpolation2) * x);
        float f6 = 1.0f - interpolation;
        final float f7 = (y2 * interpolation) + (y * f6);
        float height = wb2Var.getRadialProgress().a.height() / 2.0f;
        float f8 = (height * interpolation) + (this.c * f6);
        d79Var.getY();
        m12Var.getY();
        d79Var.getMeasuredHeight();
        if (m12Var.getMeasuredHeight() > 0) {
            m12Var.getMeasuredHeight();
        }
        int i3 = wb2Var.getRadialProgress().p;
        int i4 = aob.Pe;
        vnb vnbVar = this.j;
        float f9 = f;
        int v0 = aob.v0(i4, vnbVar);
        if (i3 < 0) {
            i3 = i4;
        }
        int f10 = vm2.f(interpolation, v0, aob.v0(i3, vnbVar));
        Paint paint = this.e;
        paint.setColor(f10);
        if (recordCircle != null) {
            float f11 = 1.0f - f9;
            gk0 gk0Var = recordCircle.h;
            gk0 gk0Var2 = recordCircle.n;
            f2 = x;
            float interpolation3 = k43.g.getInterpolation(recordCircle.I);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f12 = chatActivityEnterView.X4;
            if (f12 > 0.7f) {
                f3 = 1.0f;
            } else {
                f3 = f12 / 0.7f;
            }
            canvas.save();
            float f13 = ((gk0Var2.t * 1.4f) + 0.878f) * chatActivityEnterView.V4 * f3 * interpolation3 * f11;
            canvas.scale(f13, f13, f5, f7);
            gk0Var2.a(f5, f7, canvas, gk0Var2.d);
            canvas.restore();
            float f14 = ((gk0Var.t * 1.4f) + 0.926f) * chatActivityEnterView.V4 * f3 * interpolation3 * f11;
            canvas.save();
            canvas.scale(f14, f14, f5, f7);
            gk0Var.a(f5, f7, canvas, gk0Var.d);
            canvas.restore();
        } else {
            f2 = x;
        }
        canvas.drawCircle(f5, f7, f8, paint);
        canvas.save();
        final float f15 = f8 / height;
        canvas.scale(f15, f15, f5, f7);
        final float centerX = f5 - wb2Var.getRadialProgress().a.centerX();
        final float centerY = f7 - wb2Var.getRadialProgress().a.centerY();
        canvas.translate(centerX, centerY);
        wb2Var.getRadialProgress().E = interpolation;
        wb2Var.getRadialProgress().B = false;
        final float f16 = f2;
        wb2Var.E1(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                float f17;
                Canvas canvas2;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                ync yncVar = ync.this;
                RadialProgress2 radialProgress = yncVar.a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = yncVar.g;
                if (recordCircle2 != null) {
                    int i5 = (int) f16;
                    int i6 = (int) y;
                    float f24 = 1.0f - f4;
                    recordCircle2.b();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z = chatActivityEnterView2.j5;
                    Rect rect = chatActivityEnterView2.H4;
                    Drawable drawable4 = null;
                    if (z) {
                        if (recordCircle2.f != 1.0f) {
                            if (chatActivityEnterView2.d1) {
                                drawable3 = chatActivityEnterView2.E4;
                            } else {
                                drawable3 = chatActivityEnterView2.D4;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.F4;
                        f17 = f24;
                        canvas2 = canvas3;
                        rect.set(bp1.A(2, i5, drawable2), bp1.y(2, i6, drawable2), bp1.w(2, i5, drawable2), bp1.i(2, i6, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(bp1.A(2, i5, drawable4), bp1.y(2, i6, drawable4), bp1.w(2, i5, drawable4), bp1.i(2, i6, drawable4));
                        }
                    } else {
                        f17 = f24;
                        canvas2 = canvas3;
                        if (chatActivityEnterView2.d1) {
                            drawable = chatActivityEnterView2.E4;
                        } else {
                            drawable = chatActivityEnterView2.D4;
                        }
                        drawable2 = drawable;
                        rect.set(i5 - hl.L(12.0f), i6 - hl.L(12.0f), hl.L(12.0f) + i5, hl.L(12.0f) + i6);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    recordCircle2.d0 = ChatActivityEnterView.RecordCircle.c((recordCircle2.M - hl.L(19.0f)) / Math.max(1.0f, recordCircle2.r - hl.L(19.0f)));
                    canvas3 = canvas2;
                    recordCircle2.d(canvas3, drawable5, drawable6, recordCircle2.f, (int) (255.0f * f17));
                }
                canvas3.scale(f20, f20, f22, f23);
                canvas3.translate(f18, f19);
            }
        });
        wb2Var.getRadialProgress().B = true;
        wb2Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
