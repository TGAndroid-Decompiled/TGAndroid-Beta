package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import v7.c9;
public final class x0 extends a0 implements org.telegram.ui.ActionBar.x5, n9 {
    public final org.telegram.ui.ActionBar.c6 f13615n;
    public final Paint f13616r;
    public final Paint f13617s;
    public s2 v;
    public boolean f13618w;

    public x0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f13616r = new Paint(1);
        this.f13617s = new Paint(1);
        this.f13615n = c6Var;
        setWillNotDraw(false);
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.vk;
        org.telegram.ui.ActionBar.c6 c6Var = this.f13615n;
        this.f13616r.setColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.f13617s.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19924uf, c6Var));
    }

    @Override
    public final void f(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10;
        if (this.f13618w) {
            i10 = 0;
        } else {
            i10 = this.f13125c;
        }
        int h = (h() - i10) / 4;
        arrayList.add(c9.a((i10 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f13123a;
    }

    public final int h() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f13618w) {
            i10 = this.f13125c;
        } else {
            i10 = 0;
        }
        return measuredWidth - i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        o9 textSelectionHelper;
        if (this.f13618w) {
            i10 = 0;
        } else {
            i10 = this.f13125c;
        }
        int h = (h() - i10) / 4;
        int i11 = i10 + h;
        int h10 = h() - h;
        s2 s2Var = this.v;
        if (s2Var != null && (textSelectionHelper = s2Var.f13513a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f21354p0 && R <= textSelectionHelper.f21357s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f13617s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, h10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f13616r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, h10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f13616r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}
