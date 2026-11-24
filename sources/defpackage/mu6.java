package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;
public final class mu6 implements Animation.AnimationListener {
    public final byte a;
    public final wu6 b;

    public mu6(wu6 wu6Var, byte b) {
        this.a = b;
        this.b = wu6Var;
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
                wu6 wu6Var = this.b;
                OverlayListView overlayListView = wu6Var.V;
                ArrayList arrayList = overlayListView.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    it7 it7Var = (it7) obj;
                    if (!it7Var.j) {
                        it7Var.i = overlayListView.getDrawingTime();
                        it7Var.j = true;
                    }
                }
                wu6Var.V.postDelayed(wu6Var.F0, wu6Var.y0);
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
