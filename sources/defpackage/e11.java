package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class e11 extends FrameLayout {
    public final f11 a;

    public e11(f11 f11Var, Context context) {
        super(context);
        this.a = f11Var;
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
        f11 f11Var = this.a;
        super.removeView(view);
        try {
            f11Var.dismiss();
        } catch (Exception unused) {
        }
        m21.h(f11Var.a);
    }

    public void setTouchable(boolean z) {
        f11 f11Var = this.a;
        WindowManager.LayoutParams layoutParams = f11Var.b;
        if (layoutParams == null) {
            return;
        }
        int i = layoutParams.flags;
        if (!z) {
            layoutParams.flags = i | 16;
        } else {
            layoutParams.flags = i & (-17);
        }
        f11Var.getWindow().setAttributes(layoutParams);
    }
}
