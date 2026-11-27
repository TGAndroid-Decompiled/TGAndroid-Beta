package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class dm7 extends View implements du5 {
    public final Paint a;
    public int b;
    public int c;
    public final lm7 d;

    public dm7(lm7 lm7Var, Context context) {
        super(context);
        this.d = lm7Var;
        this.a = new Paint();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(aob.d6);
        Paint paint = this.a;
        if (paint.getShader() == null || this.b != themedColor || this.c != getHeight()) {
            this.b = themedColor;
            this.c = getHeight();
            int alpha = Color.alpha(themedColor);
            paint.setShader(new LinearGradient(0.0f, c00.d(60.0f, getHeight(), 0), 0.0f, getHeight(), new int[]{vm2.o(themedColor, (alpha * 232) / 285), vm2.o(themedColor, (alpha * 176) / 285), vm2.o(themedColor, (alpha * 96) / 285), vm2.o(themedColor, 0)}, (float[]) null, Shader.TileMode.CLAMP));
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
