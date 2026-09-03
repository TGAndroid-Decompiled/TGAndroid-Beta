package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d2 extends View {
    public int f4455a;
    public float f4456b;
    public final e2 f4457c;

    public d2(e2 e2Var, Context context) {
        super(context);
        this.f4457c = e2Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new f2.w0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e2 e2Var = this.f4457c;
        e2Var.U2.setColor(this.f4455a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f4456b != 0.0f) {
            min -= (e2Var.V2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f4456b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        e2.w1(width, height, min, this.f4455a, canvas);
        if (this.f4456b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            e2Var.V2.setColor(this.f4455a);
            e2Var.V2.setAlpha(255);
            canvas.drawCircle(width, height, min2, e2Var.V2);
        }
    }
}
