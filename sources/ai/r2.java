package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class r2 extends View {
    public final t2 f940a;
    public CharSequence f941b;

    public r2(Context context) {
        super(context);
        t2 t2Var = new t2(this);
        this.f940a = t2Var;
        t2Var.setCallback(this);
    }

    public final void a(int i3, int i10) {
        ((Paint) this.f940a.f40801b).setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{i3, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        int i3;
        this.f941b = str;
        if (z10) {
            i3 = 10;
        } else {
            i3 = 11;
        }
        this.f940a.f(i3, str, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        t2 t2Var = this.f940a;
        t2Var.setBounds(0, 0, width, height);
        t2Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f941b;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f940a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i3) {
        Paint paint = (Paint) this.f940a.f40801b;
        paint.setShader(null);
        paint.setColor(i3);
    }

    public void setStrokeColor(int i3) {
        this.f940a.f982r.setColor(i3);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f940a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
