package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class m21 extends FrameLayout {
    public final n21 a;

    public m21(n21 n21Var, Context context) {
        super(context);
        this.a = n21Var;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.a.b;
    }

    @Override
    public final void removeView(View view) {
        n21 n21Var = this.a;
        super.removeView(view);
        try {
            n21Var.dismiss();
        } catch (Exception unused) {
        }
        u31.h(n21Var.a);
    }

    public void setTouchable(boolean z) {
        n21 n21Var = this.a;
        WindowManager.LayoutParams layoutParams = n21Var.b;
        if (layoutParams == null) {
            return;
        }
        int i = layoutParams.flags;
        if (!z) {
            layoutParams.flags = i | 16;
        } else {
            layoutParams.flags = i & (-17);
        }
        n21Var.getWindow().setAttributes(layoutParams);
    }
}
