package lh;

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
    public final a2 f13118a;
    public CharSequence f13119b;

    public y1(Context context) {
        super(context);
        a2 a2Var = new a2(this);
        this.f13118a = a2Var;
        a2Var.setCallback(this);
    }

    public final void a(int i10, int i11) {
        this.f13118a.f30869a.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z4) {
        int i10;
        this.f13119b = str;
        if (z4) {
            i10 = 10;
        } else {
            i10 = 11;
        }
        this.f13118a.e(i10, str, z4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        a2 a2Var = this.f13118a;
        a2Var.setBounds(0, 0, width, height);
        a2Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f13119b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f13118a.d(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i10) {
        Paint paint = this.f13118a.f30869a;
        paint.setShader(null);
        paint.setColor(i10);
    }

    public void setStrokeColor(int i10) {
        this.f13118a.d.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f13118a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
