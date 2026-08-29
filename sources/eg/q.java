package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.qc0;
public final class q extends LinearLayout {
    public final int f6113a = 0;
    public boolean f6114b;
    public final qc0 f6115c;
    public final Object d;
    public final qc0 f6116e;
    public final qc0 f6117f;

    public q(Context context, a5 a5Var, qc0 qc0Var, o oVar, p pVar) {
        super(context);
        this.f6115c = qc0Var;
        this.f6116e = oVar;
        this.f6117f = pVar;
        this.f6114b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(a5Var.f26665a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f6113a) {
            case 0:
                super.onDraw(canvas);
                canvas.drawText(":", ((o) this.f6116e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f6113a) {
            case 0:
                p pVar = (p) this.f6117f;
                o oVar = (o) this.f6116e;
                this.f6114b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                qc0 qc0Var = this.f6115c;
                qc0Var.setItemCount(i12);
                oVar.setItemCount(i12);
                pVar.setItemCount(i12);
                qc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                oVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                pVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f6114b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                qc0 qc0Var2 = (qc0) this.d;
                this.f6114b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                qc0 qc0Var3 = this.f6115c;
                qc0Var3.setItemCount(i13);
                qc0Var2.setItemCount(i13);
                qc0 qc0Var4 = this.f6116e;
                qc0Var4.setItemCount(i13);
                qc0 qc0Var5 = this.f6117f;
                qc0Var5.setItemCount(i13);
                qc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                qc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                qc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                qc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f6114b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f6113a) {
            case 0:
                if (!this.f6114b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f6114b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public q(Context context, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, qc0 qc0Var4) {
        super(context);
        this.f6115c = qc0Var;
        this.d = qc0Var2;
        this.f6116e = qc0Var3;
        this.f6117f = qc0Var4;
        this.f6114b = false;
    }
}
