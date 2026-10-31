package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.p4;
public final class o extends LinearLayout {
    public final int f13197a = 1;
    public boolean f13198b;
    public final ac0 f13199c;
    public final Object d;
    public final ac0 e;
    public final ac0 f13200f;

    public o(Context context, p4 p4Var, ac0 ac0Var, m mVar, n nVar) {
        super(context);
        this.f13199c = ac0Var;
        this.e = mVar;
        this.f13200f = nVar;
        this.f13198b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.i0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setColor(p4Var.f29279a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f13197a) {
            case 0:
                super.onDraw(canvas);
                canvas.drawText(":", ((m) this.e).getRight() - org.telegram.messenger.i0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.i0.L(11.0f), (TextPaint) this.d);
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
        switch (this.f13197a) {
            case 0:
                n nVar = (n) this.f13200f;
                m mVar = (m) this.e;
                this.f13198b = true;
                Point point = org.telegram.messenger.i0.f16026q;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                ac0 ac0Var = this.f13199c;
                ac0Var.setItemCount(i12);
                mVar.setItemCount(i12);
                nVar.setItemCount(i12);
                ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                mVar.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                nVar.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                this.f13198b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                ac0 ac0Var2 = (ac0) this.d;
                this.f13198b = true;
                Point point2 = org.telegram.messenger.i0.f16026q;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                ac0 ac0Var3 = this.f13199c;
                ac0Var3.setItemCount(i13);
                ac0Var2.setItemCount(i13);
                ac0 ac0Var4 = this.e;
                ac0Var4.setItemCount(i13);
                ac0 ac0Var5 = this.f13200f;
                ac0Var5.setItemCount(i13);
                ac0Var3.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                ac0Var2.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                ac0Var4.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                ac0Var5.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                this.f13198b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f13197a) {
            case 0:
                if (!this.f13198b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f13198b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public o(Context context, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, ac0 ac0Var4) {
        super(context);
        this.f13199c = ac0Var;
        this.d = ac0Var2;
        this.e = ac0Var3;
        this.f13200f = ac0Var4;
        this.f13198b = false;
    }
}
