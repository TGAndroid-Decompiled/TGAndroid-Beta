package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.ui.PrivacyControlActivity;
public final class ru2 extends xib {
    public final byte a0 = 1;
    public final Object b0;

    public ru2(tu2 tu2Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.b0 = tu2Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a0;
        Object obj = this.b0;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int L = gm.L(21.0f);
                tu2 tu2Var = (tu2) obj;
                int measuredHeight = (getMeasuredHeight() - tu2Var.V.getMeasuredHeight()) / 2;
                bf0 bf0Var = tu2Var.V;
                bf0Var.layout(L, measuredHeight, bf0Var.getMeasuredWidth() + L, tu2Var.V.getMeasuredHeight() + measuredHeight);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                int L2 = gm.L(21.0f);
                int measuredHeight2 = getMeasuredHeight();
                PrivacyControlActivity privacyControlActivity = ((bm8) obj).d;
                int measuredHeight3 = (measuredHeight2 - privacyControlActivity.x0.getMeasuredHeight()) / 2;
                bf0 bf0Var2 = privacyControlActivity.x0;
                bf0Var2.layout(L2, measuredHeight3, bf0Var2.getMeasuredWidth() + L2, privacyControlActivity.x0.getMeasuredHeight() + measuredHeight3);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a0;
        Object obj = this.b0;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                tu2 tu2Var = (tu2) obj;
                tu2Var.V.measure(View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), 1073741824));
                tu2Var.V.setRoundRadius(gm.L(30.0f));
                return;
            default:
                super.onMeasure(i, i2);
                PrivacyControlActivity privacyControlActivity = ((bm8) obj).d;
                privacyControlActivity.x0.measure(View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), 1073741824));
                privacyControlActivity.x0.setRoundRadius(gm.L(30.0f));
                return;
        }
    }

    public ru2(bm8 bm8Var, Activity activity) {
        super(activity);
        this.b0 = bm8Var;
    }
}
