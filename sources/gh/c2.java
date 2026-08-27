package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

public final class c2 extends View {

    public final e2 f7179a;

    public CharSequence f7180b;

    public c2(Context context) {
        super(context);
        e2 e2Var = new e2(this);
        this.f7179a = e2Var;
        e2Var.setCallback(this);
    }

    public final void a(int i10, int i11) {
        this.f7179a.f28431a.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        this.f7180b = str;
        this.f7179a.e(z10 ? 10 : 11, str, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        e2 e2Var = this.f7179a;
        e2Var.setBounds(0, 0, width, height);
        e2Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f7180b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f7179a.d(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i10) {
        Paint paint = this.f7179a.f28431a;
        paint.setShader(null);
        paint.setColor(i10);
    }

    public void setStrokeColor(int i10) {
        this.f7179a.d.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f7179a == drawable || super.verifyDrawable(drawable);
    }
}
