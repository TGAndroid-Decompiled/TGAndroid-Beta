package defpackage;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import org.telegram.ui.LaunchActivity;
public final class c45 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final byte a;
    public final Object b;

    public c45(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((if4) obj).run();
                return;
            case 1:
                ((mx5) obj).d();
                return;
            case 2:
                String str = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder l = hg9.l(measuredHeight, "height = ", " displayHeight = ");
                Point point = gm.q;
                b10.p(point.y, l);
                int i = (measuredHeight - gm.n) - gm.m;
                if (i > gm.L(100.0f) && i < point.y && gm.L(100.0f) + i > point.y) {
                    point.y = i;
                    if (e21.a) {
                        b10.p(point.y, new StringBuilder("fix display size y to "));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                rob robVar = (rob) obj;
                robVar.R = SystemClock.elapsedRealtime() + 1500;
                robVar.m0.invalidate();
                return;
            default:
                nsc nscVar = (nsc) obj;
                PopupWindow popupWindow = nscVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    nscVar.c();
                    return;
                }
                return;
        }
    }
}
