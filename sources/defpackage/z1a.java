package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class z1a extends View {
    public final Paint a;
    public int b;
    public LinearGradient c;
    public final b2a d;

    public z1a(b2a b2aVar, Context context) {
        super(context);
        this.d = b2aVar;
        this.a = new Paint(1);
        this.b = aob.v0(aob.h5, b2aVar.J0);
        this.c = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(68.0f), new int[]{aob.p1(0.0f, this.b), this.b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int v0 = aob.v0(aob.h5, this.d.J0);
        if (v0 != this.b) {
            this.b = v0;
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(68.0f), new int[]{aob.p1(0.0f, v0), v0}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.c;
        Paint paint = this.a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
