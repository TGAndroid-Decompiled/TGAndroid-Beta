package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g2 extends View {
    public int f2262a;
    public float f2263b;
    public final h2 f2264c;

    public g2(h2 h2Var, Context context) {
        super(context);
        this.f2264c = h2Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new f2.x0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        h2 h2Var = this.f2264c;
        h2Var.T2.setColor(this.f2262a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f2263b != 0.0f) {
            min -= (h2Var.U2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f2263b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        h2.x1(width, height, min, this.f2262a, canvas);
        if (this.f2263b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            h2Var.U2.setColor(this.f2262a);
            h2Var.U2.setAlpha(255);
            canvas.drawCircle(width, height, min2, h2Var.U2);
        }
    }
}
