package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
public final class x0 extends a0 implements org.telegram.ui.ActionBar.z5, p9 {
    public final org.telegram.ui.ActionBar.f6 f14321n;
    public final Paint f14322r;
    public final Paint f14323s;
    public r2 v;
    public boolean f14324w;

    public x0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f14322r = new Paint(1);
        this.f14323s = new Paint(1);
        this.f14321n = f6Var;
        setWillNotDraw(false);
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.j6.vk;
        org.telegram.ui.ActionBar.f6 f6Var = this.f14321n;
        this.f14322r.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f14323s.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20981uf, f6Var));
    }

    @Override
    public final void f(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10;
        if (this.f14324w) {
            i10 = 0;
        } else {
            i10 = this.f13751c;
        }
        int h = (h() - i10) / 4;
        arrayList.add(w7.g.a((i10 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f13749a;
    }

    public final int h() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f14324w) {
            i10 = this.f13751c;
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
        if (this.f14324w) {
            i10 = 0;
        } else {
            i10 = this.f13751c;
        }
        int h = (h() - i10) / 4;
        int i11 = i10 + h;
        int h10 = h() - h;
        r2 r2Var = this.v;
        if (r2Var != null && (textSelectionHelper = r2Var.f14143a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f22500u0 && R <= textSelectionHelper.f22503x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f14323s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, h10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f14322r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, h10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f14322r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}
