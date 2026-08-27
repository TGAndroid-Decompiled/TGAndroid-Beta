package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.w4;

public final class p extends LinearLayout {

    public final int f2793a = 1;

    public boolean f2794b;

    public final fc0 f2795c;
    public final Object d;

    public final fc0 f2796e;

    public final fc0 f2797f;

    public p(Context context, w4 w4Var, fc0 fc0Var, n nVar, o oVar) {
        super(context);
        this.f2795c = fc0Var;
        this.f2796e = nVar;
        this.f2797f = oVar;
        this.f2794b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(w4Var.f34103a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f2793a) {
            case 0:
                super.onDraw(canvas);
                canvas.drawText(":", ((n) this.f2796e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f2793a) {
            case 0:
                o oVar = (o) this.f2797f;
                n nVar = (n) this.f2796e;
                this.f2794b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                fc0 fc0Var = this.f2795c;
                fc0Var.setItemCount(i12);
                nVar.setItemCount(i12);
                oVar.setItemCount(i12);
                fc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                oVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f2794b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                fc0 fc0Var2 = (fc0) this.d;
                this.f2794b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                fc0 fc0Var3 = this.f2795c;
                fc0Var3.setItemCount(i13);
                fc0Var2.setItemCount(i13);
                fc0 fc0Var4 = this.f2796e;
                fc0Var4.setItemCount(i13);
                fc0 fc0Var5 = this.f2797f;
                fc0Var5.setItemCount(i13);
                fc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                fc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                fc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                fc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f2794b = false;
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f2793a) {
            case 0:
                if (!this.f2794b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.f2794b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    public p(Context context, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, fc0 fc0Var4) {
        super(context);
        this.f2795c = fc0Var;
        this.d = fc0Var2;
        this.f2796e = fc0Var3;
        this.f2797f = fc0Var4;
        this.f2794b = false;
    }
}
