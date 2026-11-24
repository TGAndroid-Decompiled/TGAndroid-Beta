package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.ui.PrivacyControlActivity;
public final class gt2 extends wgb {
    public final byte a0 = 0;
    public final Object b0;

    public gt2(it2 it2Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.b0 = it2Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a0;
        Object obj = this.b0;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int L = gl.L(21.0f);
                it2 it2Var = (it2) obj;
                int measuredHeight = (getMeasuredHeight() - it2Var.V.getMeasuredHeight()) / 2;
                be0 be0Var = it2Var.V;
                be0Var.layout(L, measuredHeight, be0Var.getMeasuredWidth() + L, it2Var.V.getMeasuredHeight() + measuredHeight);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                int L2 = gl.L(21.0f);
                int measuredHeight2 = getMeasuredHeight();
                PrivacyControlActivity privacyControlActivity = ((yj8) obj).d;
                int measuredHeight3 = (measuredHeight2 - privacyControlActivity.x0.getMeasuredHeight()) / 2;
                be0 be0Var2 = privacyControlActivity.x0;
                be0Var2.layout(L2, measuredHeight3, be0Var2.getMeasuredWidth() + L2, privacyControlActivity.x0.getMeasuredHeight() + measuredHeight3);
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
                it2 it2Var = (it2) obj;
                it2Var.V.measure(View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824));
                it2Var.V.setRoundRadius(gl.L(30.0f));
                return;
            default:
                super.onMeasure(i, i2);
                PrivacyControlActivity privacyControlActivity = ((yj8) obj).d;
                privacyControlActivity.x0.measure(View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824));
                privacyControlActivity.x0.setRoundRadius(gl.L(30.0f));
                return;
        }
    }

    public gt2(yj8 yj8Var, Activity activity) {
        super(activity);
        this.b0 = yj8Var;
    }
}
