package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nz0;
public final class wa extends View {
    public final LinearGradient f9120a;
    public final Matrix f9121b;
    public final Paint f9122c;
    public final Paint d;
    public final nz0 f9123e;
    public final org.telegram.ui.ActionBar.b6 f9124f;

    public wa(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f9124f = b6Var;
        this.f9120a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f9121b = new Matrix();
        this.f9122c = new Paint(1);
        this.d = new Paint(1);
        this.f9123e = new nz0(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f9121b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f9120a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f9122c;
        paint.setShader(linearGradient);
        nz0 nz0Var = this.f9123e;
        float dp = nz0Var.f31223c + AndroidUtilities.dp(30.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, this.f9124f);
        Paint paint2 = this.d;
        paint2.setColor(v02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.f9123e.c((getWidth() - nz0Var.f31223c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
