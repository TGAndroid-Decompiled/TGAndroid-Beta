package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r9;
import v7.q8;
public final class y0 extends a0 implements org.telegram.ui.ActionBar.z5, q9 {
    public final org.telegram.ui.ActionBar.f6 f11773n;
    public final Paint f11774r;
    public final Paint f11775s;
    public s2 v;
    public boolean f11776w;

    public y0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f11774r = new Paint(1);
        this.f11775s = new Paint(1);
        this.f11773n = f6Var;
        setWillNotDraw(false);
        e();
    }

    @Override
    public final void e() {
        int i10 = j6.vk;
        org.telegram.ui.ActionBar.f6 f6Var = this.f11773n;
        this.f11774r.setColor(j6.v0(i10, f6Var));
        this.f11775s.setColor(j6.v0(j6.f19416uf, f6Var));
    }

    @Override
    public final void f(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10;
        if (this.f11776w) {
            i10 = 0;
        } else {
            i10 = this.f11223c;
        }
        int h = (h() - i10) / 4;
        arrayList.add(q8.a((i10 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f11221a;
    }

    public final int h() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f11776w) {
            i10 = this.f11223c;
        } else {
            i10 = 0;
        }
        return measuredWidth - i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        r9 textSelectionHelper;
        if (this.f11776w) {
            i10 = 0;
        } else {
            i10 = this.f11223c;
        }
        int h = (h() - i10) / 4;
        int i11 = i10 + h;
        int h10 = h() - h;
        s2 s2Var = this.v;
        if (s2Var != null && (textSelectionHelper = s2Var.f11617a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int S = RecyclerView.S(this);
            if (S >= 0 && S >= textSelectionHelper.f20889u0 && S <= textSelectionHelper.f20892x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f11775s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, h10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f11774r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, h10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f11774r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}
