package mh;

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
import org.telegram.ui.Components.l01;
public final class ra extends View {
    public final LinearGradient f14707a;
    public final Matrix f14708b;
    public final Paint f14709c;
    public final Paint d;
    public final l01 f14710e;
    public final org.telegram.ui.ActionBar.g6 f14711f;

    public ra(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f14711f = g6Var;
        this.f14707a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f14708b = new Matrix();
        this.f14709c = new Paint(1);
        this.d = new Paint(1);
        this.f14710e = new l01(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f14708b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f14707a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f14709c;
        paint.setShader(linearGradient);
        l01 l01Var = this.f14710e;
        float dp = l01Var.f28521c + AndroidUtilities.dp(30.0f);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21660d7, this.f14711f);
        Paint paint2 = this.d;
        paint2.setColor(v02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.f14710e.c((getWidth() - l01Var.f28521c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
