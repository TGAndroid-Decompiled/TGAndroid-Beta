package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b2 extends View {
    public int f5094a;
    public float f5095b;
    public final c2 f5096c;

    public b2(c2 c2Var, Context context) {
        super(context);
        this.f5096c = c2Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new f2.x0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c2 c2Var = this.f5096c;
        c2Var.U2.setColor(this.f5094a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f5095b != 0.0f) {
            min -= (c2Var.V2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f5095b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        c2.w1(width, height, min, this.f5094a, canvas);
        if (this.f5095b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            c2Var.V2.setColor(this.f5094a);
            c2Var.V2.setAlpha(255);
            canvas.drawCircle(width, height, min2, c2Var.V2);
        }
    }
}
