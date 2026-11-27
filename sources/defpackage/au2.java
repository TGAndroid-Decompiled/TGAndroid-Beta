package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.ui.PrivacyControlActivity;
public final class au2 extends skb {
    public final byte a0 = 0;
    public final Object b0;

    public au2(cu2 cu2Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.b0 = cu2Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a0;
        Object obj = this.b0;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int L = hl.L(21.0f);
                cu2 cu2Var = (cu2) obj;
                int measuredHeight = (getMeasuredHeight() - cu2Var.V.getMeasuredHeight()) / 2;
                de0 de0Var = cu2Var.V;
                de0Var.layout(L, measuredHeight, de0Var.getMeasuredWidth() + L, cu2Var.V.getMeasuredHeight() + measuredHeight);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                int L2 = hl.L(21.0f);
                int measuredHeight2 = getMeasuredHeight();
                PrivacyControlActivity privacyControlActivity = ((mn8) obj).d;
                int measuredHeight3 = (measuredHeight2 - privacyControlActivity.x0.getMeasuredHeight()) / 2;
                de0 de0Var2 = privacyControlActivity.x0;
                de0Var2.layout(L2, measuredHeight3, de0Var2.getMeasuredWidth() + L2, privacyControlActivity.x0.getMeasuredHeight() + measuredHeight3);
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
                cu2 cu2Var = (cu2) obj;
                cu2Var.V.measure(View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), 1073741824));
                cu2Var.V.setRoundRadius(hl.L(30.0f));
                return;
            default:
                super.onMeasure(i, i2);
                PrivacyControlActivity privacyControlActivity = ((mn8) obj).d;
                privacyControlActivity.x0.measure(View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), 1073741824));
                privacyControlActivity.x0.setRoundRadius(hl.L(30.0f));
                return;
        }
    }

    public au2(mn8 mn8Var, Activity activity) {
        super(activity);
        this.b0 = mn8Var;
    }
}
