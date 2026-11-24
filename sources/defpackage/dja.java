package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class dja extends cja {
    public Activity m0;
    public final Rect n0;
    public int o0;
    public boolean p0;

    public dja(Context context, Activity activity) {
        super(context, null);
        this.n0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.n0;
        getWindowVisibleDisplayFrame(rect);
        int i = 0;
        if (this.p0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i = gl.m;
            }
            return ((height - i) - gl.o1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.m0.getWindow().getDecorView().getHeight() - gl.o1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(gl.L(10.0f), gl.m)) {
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
        this.o0 = Q();
        Point point = gl.q;
        if (point.x > point.y) {
            z = true;
        } else {
            z = false;
        }
        post(new k08((byte) 16, this, z));
    }

    @Override
    public int getKeyboardHeight() {
        return this.o0;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        R();
    }

    public void setActivity(Activity activity) {
        this.m0 = activity;
    }

    public void setWithoutWindow(boolean z) {
        this.p0 = z;
    }
}
