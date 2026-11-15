package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class j2 extends View {
    public final l2 f3624a;
    public CharSequence f3625b;

    public j2(Context context) {
        super(context);
        l2 l2Var = new l2(this);
        this.f3624a = l2Var;
        l2Var.setCallback(this);
    }

    public final void a(int i7, int i10) {
        ((Paint) this.f3624a.f220b).setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        int i7;
        this.f3625b = str;
        if (z10) {
            i7 = 10;
        } else {
            i7 = 11;
        }
        this.f3624a.f(i7, str, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        l2 l2Var = this.f3624a;
        l2Var.setBounds(0, 0, width, height);
        l2Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f3625b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f3624a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i7) {
        Paint paint = (Paint) this.f3624a.f220b;
        paint.setShader(null);
        paint.setColor(i7);
    }

    public void setStrokeColor(int i7) {
        this.f3624a.f3665r.setColor(i7);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f3624a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
