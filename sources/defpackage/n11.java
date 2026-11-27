package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class n11 extends FrameLayout {
    public final o11 a;

    public n11(o11 o11Var, Context context) {
        super(context);
        this.a = o11Var;
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
        o11 o11Var = this.a;
        super.removeView(view);
        try {
            o11Var.dismiss();
        } catch (Exception unused) {
        }
        v21.h(o11Var.a);
    }

    public void setTouchable(boolean z) {
        o11 o11Var = this.a;
        WindowManager.LayoutParams layoutParams = o11Var.b;
        if (layoutParams == null) {
            return;
        }
        int i = layoutParams.flags;
        if (!z) {
            layoutParams.flags = i | 16;
        } else {
            layoutParams.flags = i & (-17);
        }
        o11Var.getWindow().setAttributes(layoutParams);
    }
}
