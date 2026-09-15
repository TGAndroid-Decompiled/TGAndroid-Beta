package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import v7.p8;
public final class y0 extends a0 implements org.telegram.ui.ActionBar.z5, p9 {
    public final org.telegram.ui.ActionBar.e6 f11769n;
    public final Paint f11770r;
    public final Paint f11771s;
    public s2 v;
    public boolean f11772w;

    public y0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f11770r = new Paint(1);
        this.f11771s = new Paint(1);
        this.f11769n = e6Var;
        setWillNotDraw(false);
        e();
    }

    @Override
    public final void e() {
        int i10 = i6.vk;
        org.telegram.ui.ActionBar.e6 e6Var = this.f11769n;
        this.f11770r.setColor(i6.v0(i10, e6Var));
        this.f11771s.setColor(i6.v0(i6.f19157uf, e6Var));
    }

    @Override
    public final void f(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10;
        if (this.f11772w) {
            i10 = 0;
        } else {
            i10 = this.f11219c;
        }
        int h = (h() - i10) / 4;
        arrayList.add(p8.a((i10 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f11217a;
    }

    public final int h() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f11772w) {
            i10 = this.f11219c;
        } else {
            i10 = 0;
        }
        return measuredWidth - i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        q9 textSelectionHelper;
        if (this.f11772w) {
            i10 = 0;
        } else {
            i10 = this.f11219c;
        }
        int h = (h() - i10) / 4;
        int i11 = i10 + h;
        int h10 = h() - h;
        s2 s2Var = this.v;
        if (s2Var != null && (textSelectionHelper = s2Var.f11613a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f20618u0 && R <= textSelectionHelper.f20621x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f11771s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, h10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f11770r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, h10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f11770r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}
