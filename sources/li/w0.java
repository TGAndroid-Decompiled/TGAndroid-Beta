package li;

import a8.ae;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
public final class w0 extends z implements p6, r9 {
    public final u6 f17590n;
    public final Paint f17591r;
    public final Paint f17592s;
    public q2 v;
    public boolean f17593w;

    public w0(Context context, u6 u6Var) {
        super(context);
        this.f17591r = new Paint(1);
        this.f17592s = new Paint(1);
        this.f17590n = u6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.vk));
        hashSet.add(Integer.valueOf(y6.f23683uf));
    }

    @Override
    public final void e(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10;
        if (this.f17593w) {
            i10 = 0;
        } else {
            i10 = this.f17654c;
        }
        int g7 = (g() - i10) / 4;
        arrayList.add(ae.a((i10 + g7) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (g() - g7), AndroidUtilities.dp(12.0f)));
    }

    public final int g() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f17593w) {
            i10 = this.f17654c;
        } else {
            i10 = 0;
        }
        return measuredWidth - i10;
    }

    public a getRow() {
        return this.f17652a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        s9 textSelectionHelper;
        if (this.f17593w) {
            i10 = 0;
        } else {
            i10 = this.f17654c;
        }
        int g7 = (g() - i10) / 4;
        int i11 = i10 + g7;
        int g10 = g() - g7;
        q2 q2Var = this.v;
        if (q2Var != null && (textSelectionHelper = q2Var.f17427a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f25412p0 && R <= textSelectionHelper.f25415s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + g10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f17592s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, g10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f17591r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, g10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f17591r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }

    @Override
    public final void updateColors() {
        int i10 = y6.vk;
        u6 u6Var = this.f17590n;
        this.f17591r.setColor(y6.w0(i10, u6Var));
        this.f17592s.setColor(y6.w0(y6.f23683uf, u6Var));
    }
}
