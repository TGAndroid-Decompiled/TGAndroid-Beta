package defpackage;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import org.telegram.ui.LaunchActivity;
public final class c25 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final byte a;
    public final Object b;

    public c25(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((jf4) obj).run();
                return;
            case 1:
                ((mv5) obj).d();
                return;
            case 2:
                String str = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder m = de9.m(measuredHeight, "height = ", " displayHeight = ");
                Point point = gl.q;
                b00.p(point.y, m);
                int i = (measuredHeight - gl.n) - gl.m;
                if (i > gl.L(100.0f) && i < point.y && gl.L(100.0f) + i > point.y) {
                    point.y = i;
                    if (w01.a) {
                        b00.p(point.y, new StringBuilder("fix display size y to "));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                qmb qmbVar = (qmb) obj;
                qmbVar.R = SystemClock.elapsedRealtime() + 1500;
                qmbVar.m0.invalidate();
                return;
            default:
                lqc lqcVar = (lqc) obj;
                PopupWindow popupWindow = lqcVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    lqcVar.c();
                    return;
                }
                return;
        }
    }
}
