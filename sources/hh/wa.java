package hh;

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
import org.telegram.ui.Components.pz0;

public final class wa extends View {

    public final LinearGradient f10307a;

    public final Matrix f10308b;

    public final Paint f10309c;
    public final Paint d;

    public final pz0 f10310e;

    public final org.telegram.ui.ActionBar.c6 f10311f;

    public wa(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f10311f = c6Var;
        this.f10307a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f10308b = new Matrix();
        this.f10309c = new Paint(1);
        this.d = new Paint(1);
        this.f10310e = new pz0(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f10308b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f10307a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f10309c;
        paint.setShader(linearGradient);
        pz0 pz0Var = this.f10310e;
        float fDp = pz0Var.f31697c + AndroidUtilities.dp(30.0f);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.f10311f);
        Paint paint2 = this.d;
        paint2.setColor(iV0);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - fDp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + fDp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - fDp) / 2.0f, 0.0f, (getWidth() + fDp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.f10310e.c((getWidth() - pz0Var.f31697c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
