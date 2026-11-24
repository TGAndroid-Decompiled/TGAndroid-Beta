package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.q;
public final class nt1 extends bf0 {
    public final byte H = 1;
    public Object I;
    public Object J;
    public Object K;

    public nt1(ae2 ae2Var, Context context, rna rnaVar) {
        super(context);
        this.K = ae2Var;
        this.J = rnaVar;
        this.I = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.H) {
            case 1:
                rna rnaVar = (rna) this.J;
                Path path = (Path) this.I;
                super.draw(canvas);
                if (((ae2) this.K).h) {
                    path.rewind();
                    RectF rectF = gm.P;
                    ImageReceiver imageReceiver = this.a;
                    rectF.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), this.a.x());
                    path.addRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    rnaVar.h(on2.p(-1, 82));
                    ImageReceiver imageReceiver2 = this.a;
                    rnaVar.setBounds((int) imageReceiver2.L0, (int) imageReceiver2.M0, (int) imageReceiver2.w(), (int) this.a.x());
                    rnaVar.draw(canvas);
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
                rna rnaVar = (rna) this.J;
                Path path = (Path) this.I;
                super.onDraw(canvas);
                if (this.r) {
                    canvas.save();
                    RectF rectF = gm.P;
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
                    rnaVar.h(on2.p(-1, 82));
                    rnaVar.setBounds(0, 0, getWidth(), getHeight());
                    rnaVar.draw(canvas);
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
                ef1 ef1Var = (ef1) this.J;
                super.onDraw(canvas);
                if (((q) this.K).o0) {
                    float min = Math.min(getWidth(), getHeight()) * 0.5f;
                    RectF rectF2 = gm.P;
                    rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF2, min, min, (Paint) this.I);
                    rectF2.inset(gm.L(1.0f), gm.L(1.0f));
                    ef1Var.f = getWidth();
                    ef1Var.a(min, canvas, rectF2, null);
                    invalidate();
                    return;
                }
                return;
        }
    }

    public nt1(Context context) {
        super(context);
    }

    public nt1(q qVar, Context context, Paint paint) {
        super(context);
        this.K = qVar;
        this.I = paint;
        this.J = new ef1();
    }
}
