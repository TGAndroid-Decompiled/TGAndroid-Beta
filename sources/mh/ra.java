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
import org.telegram.ui.Components.k01;
public final class ra extends View {
    public final LinearGradient f14709a;
    public final Matrix f14710b;
    public final Paint f14711c;
    public final Paint d;
    public final k01 f14712e;
    public final org.telegram.ui.ActionBar.g6 f14713f;

    public ra(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f14713f = g6Var;
        this.f14709a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f14710b = new Matrix();
        this.f14711c = new Paint(1);
        this.d = new Paint(1);
        this.f14712e = new k01(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f14710b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f14709a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f14711c;
        paint.setShader(linearGradient);
        k01 k01Var = this.f14712e;
        float dp = k01Var.f28227c + AndroidUtilities.dp(30.0f);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21662d7, this.f14713f);
        Paint paint2 = this.d;
        paint2.setColor(v02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.f14712e.c((getWidth() - k01Var.f28227c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
