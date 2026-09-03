package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xc0;
public final class p extends LinearLayout {
    public final int f6717a = 0;
    public boolean f6718b;
    public final xc0 f6719c;
    public final Object d;
    public final xc0 e;
    public final xc0 f6720f;

    public p(Context context, x4 x4Var, xc0 xc0Var, n nVar, o oVar) {
        super(context);
        this.f6719c = xc0Var;
        this.e = nVar;
        this.f6720f = oVar;
        this.f6718b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(x4Var.f30461a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f6717a) {
            case 0:
                super.onDraw(canvas);
                canvas.drawText(":", ((n) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f6717a) {
            case 0:
                o oVar = (o) this.f6720f;
                n nVar = (n) this.e;
                this.f6718b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                xc0 xc0Var = this.f6719c;
                xc0Var.setItemCount(i12);
                nVar.setItemCount(i12);
                oVar.setItemCount(i12);
                xc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                oVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f6718b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                xc0 xc0Var2 = (xc0) this.d;
                this.f6718b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                xc0 xc0Var3 = this.f6719c;
                xc0Var3.setItemCount(i13);
                xc0Var2.setItemCount(i13);
                xc0 xc0Var4 = this.e;
                xc0Var4.setItemCount(i13);
                xc0 xc0Var5 = this.f6720f;
                xc0Var5.setItemCount(i13);
                xc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                xc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                xc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                xc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f6718b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f6717a) {
            case 0:
                if (!this.f6718b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f6718b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public p(Context context, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, xc0 xc0Var4) {
        super(context);
        this.f6719c = xc0Var;
        this.d = xc0Var2;
        this.e = xc0Var3;
        this.f6720f = xc0Var4;
        this.f6718b = false;
    }
}
