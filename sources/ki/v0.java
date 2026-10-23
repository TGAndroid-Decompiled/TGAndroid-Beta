package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
public final class v0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f15626a;
    public final Paint f15627b;
    public a f15628c;

    public v0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f15627b = new Paint();
        this.f15626a = g6Var;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Fk));
    }

    public a getRow() {
        return this.f15628c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f15627b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.f15627b.setColor(k6.w0(k6.Fk, this.f15626a));
    }
}
