package bi;

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
import org.telegram.ui.Components.q11;
public final class nd extends View {
    public final LinearGradient f5156a;
    public final Matrix f5157b;
    public final Paint f5158c;
    public final Paint d;
    public final q11 e;
    public final org.telegram.ui.ActionBar.u6 f5159f;

    public nd(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f5159f = u6Var;
        this.f5156a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f5157b = new Matrix();
        this.f5158c = new Paint(1);
        this.d = new Paint(1);
        this.e = new q11(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f5157b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f5156a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f5158c;
        paint.setShader(linearGradient);
        q11 q11Var = this.e;
        float dp = q11Var.f31790c + AndroidUtilities.dp(30.0f);
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d7, this.f5159f);
        Paint paint2 = this.d;
        paint2.setColor(w02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.e.c((getWidth() - q11Var.f31790c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
