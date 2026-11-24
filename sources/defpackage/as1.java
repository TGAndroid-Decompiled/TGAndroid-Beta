package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.q;
public final class as1 extends be0 {
    public final byte H = 0;
    public Object I;
    public Object J;
    public Object K;

    public as1(pc2 pc2Var, Context context, qla qlaVar) {
        super(context);
        this.K = pc2Var;
        this.J = qlaVar;
        this.I = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.H) {
            case 1:
                qla qlaVar = (qla) this.J;
                Path path = (Path) this.I;
                super.draw(canvas);
                if (((pc2) this.K).h) {
                    path.rewind();
                    RectF rectF = gl.P;
                    ImageReceiver imageReceiver = this.a;
                    rectF.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), this.a.x());
                    path.addRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    qlaVar.h(bm2.o(-1, 82));
                    ImageReceiver imageReceiver2 = this.a;
                    qlaVar.setBounds((int) imageReceiver2.L0, (int) imageReceiver2.M0, (int) imageReceiver2.w(), (int) this.a.x());
                    qlaVar.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                float[] fArr = (float[]) this.K;
                qla qlaVar = (qla) this.J;
                Path path = (Path) this.I;
                super.onDraw(canvas);
                if (this.r) {
                    canvas.save();
                    RectF rectF = gl.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] iArr = this.a.X0;
                    float f = iArr[0];
                    fArr[1] = f;
                    fArr[0] = f;
                    float f2 = iArr[1];
                    fArr[3] = f2;
                    fArr[2] = f2;
                    float f3 = iArr[2];
                    fArr[5] = f3;
                    fArr[4] = f3;
                    float f4 = iArr[3];
                    fArr[7] = f4;
                    fArr[6] = f4;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    qlaVar.h(bm2.o(-1, 82));
                    qlaVar.setBounds(0, 0, getWidth(), getHeight());
                    qlaVar.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
            case 1:
            default:
                super.onDraw(canvas);
                return;
            case 2:
                wd1 wd1Var = (wd1) this.J;
                super.onDraw(canvas);
                if (((q) this.K).o0) {
                    float min = Math.min(getWidth(), getHeight()) * 0.5f;
                    RectF rectF2 = gl.P;
                    rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF2, min, min, (Paint) this.I);
                    rectF2.inset(gl.L(1.0f), gl.L(1.0f));
                    wd1Var.f = getWidth();
                    wd1Var.a(min, canvas, rectF2, null);
                    invalidate();
                    return;
                }
                return;
        }
    }

    public as1(Context context) {
        super(context);
    }

    public as1(q qVar, Context context, Paint paint) {
        super(context);
        this.K = qVar;
        this.I = paint;
        this.J = new wd1();
    }
}
