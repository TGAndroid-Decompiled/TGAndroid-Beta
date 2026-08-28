package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class g2 extends View {
    public final i2 f6472a;
    public CharSequence f6473b;

    public g2(Context context) {
        super(context);
        i2 i2Var = new i2(this);
        this.f6472a = i2Var;
        i2Var.setCallback(this);
    }

    public final void a(int i9, int i10) {
        this.f6472a.f29171a.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i9, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        int i9;
        this.f6473b = str;
        if (z10) {
            i9 = 10;
        } else {
            i9 = 11;
        }
        this.f6472a.e(i9, str, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        i2 i2Var = this.f6472a;
        i2Var.setBounds(0, 0, width, height);
        i2Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f6473b;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f6472a.d(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i9) {
        Paint paint = this.f6472a.f29171a;
        paint.setShader(null);
        paint.setColor(i9);
    }

    public void setStrokeColor(int i9) {
        this.f6472a.d.setColor(i9);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f6472a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
