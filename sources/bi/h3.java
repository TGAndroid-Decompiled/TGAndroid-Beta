package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class h3 extends View {
    public final j3 f3695a;
    public CharSequence f3696b;

    public h3(Context context) {
        super(context);
        j3 j3Var = new j3(this, 1.0f);
        this.f3695a = j3Var;
        j3Var.setCallback(this);
    }

    public final void a(int i7, int i10) {
        ((Paint) this.f3695a.f220b).setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        int i7;
        this.f3696b = str;
        if (z10) {
            i7 = 10;
        } else {
            i7 = 11;
        }
        this.f3695a.g(i7, str, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        j3 j3Var = this.f3695a;
        j3Var.setBounds(0, 0, width, height);
        j3Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f3696b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f3695a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i7) {
        this.f3695a.f(i7);
    }

    public void setStrokeColor(int i7) {
        this.f3695a.f3740r.setColor(i7);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f3695a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
