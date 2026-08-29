package cg;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.sa0;
public final class a1 extends FrameLayout implements y0 {
    public final c6 f3064a;
    public final ArrayList f3065b;
    public final z0 f3066c;
    public final z0 d;
    public final z0 f3067e;
    public final boolean f3068f;

    public a1(Context context, c6 c6Var) {
        super(context);
        sa0[] values;
        this.f3065b = new ArrayList();
        this.f3064a = c6Var;
        for (sa0 sa0Var : sa0.values()) {
            if (sa0Var.f42334e) {
                this.f3065b.add(sa0Var);
            }
            if (this.f3065b.size() == 3) {
                break;
            }
        }
        if (this.f3065b.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.f3068f = true;
            return;
        }
        this.f3066c = a(context, 0);
        this.d = a(context, 1);
        this.f3067e = a(context, 2);
        setClipChildren(false);
    }

    public final z0 a(Context context, int i10) {
        sa0 sa0Var = (sa0) this.f3065b.get(i10);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        r2 r2Var = new r2(20);
        qVar.f3469e = r2Var;
        Paint paint = new Paint(1);
        qVar.f3470f = paint;
        r2Var.f3345r = 12;
        r2Var.f3346s = 8;
        r2Var.f3347t = 6;
        if (i10 == 1) {
            r2Var.N = 1001;
        }
        if (i10 == 0) {
            r2Var.N = 1002;
        }
        r2Var.O = this.f3064a;
        r2Var.P = g6.Zj;
        r2Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(f6.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        qVar.setForeground(sa0Var.f42333c);
        qVar.setBackgroundResource(sa0Var.f42332b);
        qVar.setPadding(AndroidUtilities.dp(8.0f));
        qVar.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3068f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int dp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f3066c.getLayoutParams();
        layoutParams.height = dp;
        layoutParams.width = dp;
        float f9 = dp;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f9);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = dp;
        layoutParams2.width = dp;
        int i12 = (int) (f9 * 0.95f);
        layoutParams2.rightMargin = i12;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f3067e.getLayoutParams();
        layoutParams3.height = dp;
        layoutParams3.width = dp;
        layoutParams3.leftMargin = i12;
    }

    @Override
    public void setOffset(float f9) {
        if (this.f3068f) {
            return;
        }
        float abs = Math.abs(f9 / getMeasuredWidth());
        float interpolation = jr.f29802i.getInterpolation(abs);
        int right = getRight();
        z0 z0Var = this.f3067e;
        z0Var.setTranslationX(((z0Var.getWidth() * 1.5f) + (right - z0Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        z0Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float f10 = 1.0f;
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        z0Var.setScaleX(clamp);
        z0Var.setScaleY(clamp);
        int top = getTop();
        z0 z0Var2 = this.f3066c;
        z0Var2.setTranslationY((((top - z0Var2.getTop()) - (z0Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        z0Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        z0Var2.setScaleX(clamp2);
        z0Var2.setScaleY(clamp2);
        float interpolation2 = jr.f29801g.getInterpolation(abs);
        int left = getLeft();
        z0 z0Var3 = this.d;
        z0Var3.setTranslationX((((left - z0Var3.getLeft()) - (z0Var3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        z0Var3.setTranslationY(((z0Var3.getHeight() * 2.5f) + (getBottom() - z0Var3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float clamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, abs), 1.0f, 0.0f);
        z0Var3.setScaleX(clamp3);
        z0Var3.setScaleY(clamp3);
        if (abs < 0.4f) {
            f10 = abs / 0.4f;
        }
        z0Var.h = f10;
        z0Var2.h = f10;
        z0Var3.h = f10;
    }
}
