package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import v7.g8;
public final class a1 extends b0 implements org.telegram.ui.ActionBar.a6, r9 {
    public final org.telegram.ui.ActionBar.f6 f9443n;
    public final Paint f9444r;
    public final Paint f9445s;
    public v2 v;
    public boolean f9446w;

    public a1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f9444r = new Paint(1);
        this.f9445s = new Paint(1);
        this.f9443n = f6Var;
        setWillNotDraw(false);
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.vk;
        org.telegram.ui.ActionBar.f6 f6Var = this.f9443n;
        this.f9444r.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f9445s.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18245uf, f6Var));
    }

    @Override
    public final void f(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10;
        if (this.f9446w) {
            i10 = 0;
        } else {
            i10 = this.f9466c;
        }
        int h = (h() - i10) / 4;
        arrayList.add(g8.a((i10 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f9464a;
    }

    public final int h() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f9446w) {
            i10 = this.f9466c;
        } else {
            i10 = 0;
        }
        return measuredWidth - i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        s9 textSelectionHelper;
        if (this.f9446w) {
            i10 = 0;
        } else {
            i10 = this.f9466c;
        }
        int h = (h() - i10) / 4;
        int i11 = i10 + h;
        int h10 = h() - h;
        v2 v2Var = this.v;
        if (v2Var != null && (textSelectionHelper = v2Var.f9908a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f20047u0 && R <= textSelectionHelper.f20050x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f9445s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, h10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f9444r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, h10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f9444r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}
