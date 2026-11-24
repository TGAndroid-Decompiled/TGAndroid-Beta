package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class ov4 extends View {
    public final qv4 a;
    public String b;

    public ov4(Context context) {
        super(context);
        qv4 qv4Var = new qv4(this, 1.0f);
        this.a = qv4Var;
        qv4Var.setCallback(this);
    }

    public final void a(int i, int i2) {
        ((Paint) this.a.b).setShader(new LinearGradient(0.0f, 0.0f, gl.L(48.0f), gl.L(48.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z) {
        int i;
        this.b = str;
        if (z) {
            i = 10;
        } else {
            i = 11;
        }
        this.a.g(i, str, z);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        qv4 qv4Var = this.a;
        qv4Var.setBounds(0, 0, width, height);
        qv4Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gl.L(50.0f), gl.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i) {
        this.a.f(i);
    }

    public void setStrokeColor(int i) {
        this.a.r.setColor(i);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
