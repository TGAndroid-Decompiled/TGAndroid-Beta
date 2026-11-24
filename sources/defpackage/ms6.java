package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;
public final class ms6 implements Animation.AnimationListener {
    public final byte a;
    public final ws6 b;

    public ms6(ws6 ws6Var, byte b) {
        this.a = b;
        this.b = ws6Var;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                this.b.j(true);
                return;
            default:
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                return;
            default:
                ws6 ws6Var = this.b;
                OverlayListView overlayListView = ws6Var.V;
                ArrayList arrayList = overlayListView.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    hr7 hr7Var = (hr7) obj;
                    if (!hr7Var.j) {
                        hr7Var.i = overlayListView.getDrawingTime();
                        hr7Var.j = true;
                    }
                }
                ws6Var.V.postDelayed(ws6Var.F0, ws6Var.y0);
                return;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
