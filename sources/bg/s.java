package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.w4;
public final class s extends LinearLayout {
    public final int f1947a = 1;
    public boolean f1948b;
    public final bc0 f1949c;
    public final Object d;
    public final bc0 f1950e;
    public final bc0 f1951f;

    public s(Context context, w4 w4Var, bc0 bc0Var, q qVar, r rVar) {
        super(context);
        this.f1949c = bc0Var;
        this.f1950e = qVar;
        this.f1951f = rVar;
        this.f1948b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(w4Var.f34092a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f1947a) {
            case 0:
                super.onDraw(canvas);
                canvas.drawText(":", ((q) this.f1950e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        switch (this.f1947a) {
            case 0:
                r rVar = (r) this.f1951f;
                q qVar = (q) this.f1950e;
                this.f1948b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                bc0 bc0Var = this.f1949c;
                bc0Var.setItemCount(i11);
                qVar.setItemCount(i11);
                rVar.setItemCount(i11);
                bc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                qVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                rVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                this.f1948b = false;
                super.onMeasure(i9, i10);
                return;
            default:
                bc0 bc0Var2 = (bc0) this.d;
                this.f1948b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                bc0 bc0Var3 = this.f1949c;
                bc0Var3.setItemCount(i12);
                bc0Var2.setItemCount(i12);
                bc0 bc0Var4 = this.f1950e;
                bc0Var4.setItemCount(i12);
                bc0 bc0Var5 = this.f1951f;
                bc0Var5.setItemCount(i12);
                bc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                bc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                bc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                bc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f1948b = false;
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f1947a) {
            case 0:
                if (!this.f1948b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f1948b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public s(Context context, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, bc0 bc0Var4) {
        super(context);
        this.f1949c = bc0Var;
        this.d = bc0Var2;
        this.f1950e = bc0Var3;
        this.f1951f = bc0Var4;
        this.f1948b = false;
    }
}
