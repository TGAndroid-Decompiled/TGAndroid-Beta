package jh;

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
import org.telegram.ui.Components.zz0;
public final class qa extends View {
    public final LinearGradient f12679a;
    public final Matrix f12680b;
    public final Paint f12681c;
    public final Paint d;
    public final zz0 f12682e;
    public final org.telegram.ui.ActionBar.c6 f12683f;

    public qa(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f12683f = c6Var;
        this.f12679a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f12680b = new Matrix();
        this.f12681c = new Paint(1);
        this.d = new Paint(1);
        this.f12682e = new zz0(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f12680b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f12679a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f12681c;
        paint.setShader(linearGradient);
        zz0 zz0Var = this.f12682e;
        float dp = zz0Var.f35462c + AndroidUtilities.dp(30.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, this.f12683f);
        Paint paint2 = this.d;
        paint2.setColor(v02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.f12682e.c((getWidth() - zz0Var.f35462c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
