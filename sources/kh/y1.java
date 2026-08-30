package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class y1 extends View {
    public final b2 f10955a;
    public CharSequence f10956b;

    public y1(Context context) {
        super(context);
        b2 b2Var = new b2(this);
        this.f10955a = b2Var;
        b2Var.setCallback(this);
    }

    public final void a(int i10, int i11) {
        this.f10955a.f27967a.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z4) {
        int i10;
        this.f10956b = str;
        if (z4) {
            i10 = 10;
        } else {
            i10 = 11;
        }
        this.f10955a.e(i10, str, z4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        b2 b2Var = this.f10955a;
        b2Var.setBounds(0, 0, width, height);
        b2Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f10956b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f10955a.d(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i10) {
        Paint paint = this.f10955a.f27967a;
        paint.setShader(null);
        paint.setColor(i10);
    }

    public void setStrokeColor(int i10) {
        this.f10955a.d.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f10955a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
