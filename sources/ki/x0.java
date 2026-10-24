package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
public final class x0 extends a0 implements org.telegram.ui.ActionBar.b6, n9 {
    public final org.telegram.ui.ActionBar.g6 f15698n;
    public final Paint f15699r;
    public final Paint f15700s;
    public s2 v;
    public boolean f15701w;

    public x0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f15699r = new Paint(1);
        this.f15700s = new Paint(1);
        this.f15698n = g6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.vk));
        hashSet.add(Integer.valueOf(k6.f21508uf));
    }

    @Override
    public final void e(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10;
        if (this.f15701w) {
            i10 = 0;
        } else {
            i10 = this.f15159c;
        }
        int g10 = (g() - i10) / 4;
        arrayList.add(w7.j.a((i10 + g10) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (g() - g10), AndroidUtilities.dp(12.0f)));
    }

    public final int g() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f15701w) {
            i10 = this.f15159c;
        } else {
            i10 = 0;
        }
        return measuredWidth - i10;
    }

    public a getRow() {
        return this.f15157a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        o9 textSelectionHelper;
        if (this.f15701w) {
            i10 = 0;
        } else {
            i10 = this.f15159c;
        }
        int g10 = (g() - i10) / 4;
        int i11 = i10 + g10;
        int g11 = g() - g10;
        s2 s2Var = this.v;
        if (s2Var != null && (textSelectionHelper = s2Var.f15560a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f22862p0 && R <= textSelectionHelper.f22865s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + g11, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f15700s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, g11, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f15699r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, g11, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f15699r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }

    @Override
    public final void updateColors() {
        int i10 = k6.vk;
        org.telegram.ui.ActionBar.g6 g6Var = this.f15698n;
        this.f15699r.setColor(k6.w0(i10, g6Var));
        this.f15700s.setColor(k6.w0(k6.f21508uf, g6Var));
    }
}
