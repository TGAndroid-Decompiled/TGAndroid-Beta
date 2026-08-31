package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.yc0;
public final class p extends LinearLayout {
    public final int f7582a = 0;
    public boolean f7583b;
    public final yc0 f7584c;
    public final Object d;
    public final yc0 f7585e;
    public final yc0 f7586f;

    public p(Context context, x4 x4Var, yc0 yc0Var, n nVar, o oVar) {
        super(context);
        this.f7584c = yc0Var;
        this.f7585e = nVar;
        this.f7586f = oVar;
        this.f7583b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(x4Var.f32944a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f7582a) {
            case 0:
                super.onDraw(canvas);
                canvas.drawText(":", ((n) this.f7585e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f7582a) {
            case 0:
                o oVar = (o) this.f7586f;
                n nVar = (n) this.f7585e;
                this.f7583b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                yc0 yc0Var = this.f7584c;
                yc0Var.setItemCount(i12);
                nVar.setItemCount(i12);
                oVar.setItemCount(i12);
                yc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                oVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f7583b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                yc0 yc0Var2 = (yc0) this.d;
                this.f7583b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                yc0 yc0Var3 = this.f7584c;
                yc0Var3.setItemCount(i13);
                yc0Var2.setItemCount(i13);
                yc0 yc0Var4 = this.f7585e;
                yc0Var4.setItemCount(i13);
                yc0 yc0Var5 = this.f7586f;
                yc0Var5.setItemCount(i13);
                yc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                yc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                yc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                yc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f7583b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f7582a) {
            case 0:
                if (!this.f7583b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f7583b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public p(Context context, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, yc0 yc0Var4) {
        super(context);
        this.f7584c = yc0Var;
        this.d = yc0Var2;
        this.f7585e = yc0Var3;
        this.f7586f = yc0Var4;
        this.f7583b = false;
    }
}
