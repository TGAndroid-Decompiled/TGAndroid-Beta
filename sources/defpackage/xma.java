package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class xma extends wma {
    public Activity g0;
    public final Rect h0;
    public int i0;
    public boolean j0;

    public xma(Context context, Activity activity) {
        super(context, null);
        this.h0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.h0;
        getWindowVisibleDisplayFrame(rect);
        int i = 0;
        if (this.j0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i = hl.m;
            }
            return ((height - i) - hl.o1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.g0.getWindow().getDecorView().getHeight() - hl.o1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(hl.L(10.0f), hl.m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z;
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.i0 = Q();
        Point point = hl.q;
        if (point.x > point.y) {
            z = true;
        } else {
            z = false;
        }
        post(new q38((byte) 16, this, z));
    }

    @Override
    public int getKeyboardHeight() {
        return this.i0;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        R();
    }

    public void setActivity(Activity activity) {
        this.g0 = activity;
    }

    public void setWithoutWindow(boolean z) {
        this.j0 = z;
    }
}
