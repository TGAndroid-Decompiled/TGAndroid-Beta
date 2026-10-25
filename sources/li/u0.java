package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class u0 extends View implements p6 {
    public final u6 f17505a;
    public final Paint f17506b;
    public a f17507c;

    public u0(Context context, u6 u6Var) {
        super(context);
        this.f17506b = new Paint();
        this.f17505a = u6Var;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Fk));
    }

    public a getRow() {
        return this.f17507c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f17506b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.f17506b.setColor(y6.w0(y6.Fk, this.f17505a));
    }
}
