package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class tb3 implements Runnable {
    public final byte a;
    public final ArrayList b;
    public final zb3 c;

    public tb3(zb3 zb3Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = zb3Var;
        this.b = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        zb3 zb3Var = this.c;
        switch (b) {
            case 0:
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    yb3 yb3Var = (yb3) obj;
                    zb3Var.C(yb3Var.a, yb3Var);
                    zb3Var.w.add(yb3Var);
                }
                arrayList.clear();
                zb3Var.u.remove(arrayList);
                return;
            default:
                int i2 = Integer.MAX_VALUE;
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    i2 = Math.min(i2, ((f89) arrayList.get(size2)).b());
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    f89 f89Var = (f89) arrayList.get(size3);
                    View view = f89Var.a;
                    ViewPropertyAnimator animate = view.animate();
                    zb3Var.y.add(f89Var);
                    animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(zb3Var.h()).setStartDelay((f89Var.b() - i2) * zb3Var.D).setInterpolator(zb3Var.h);
                    animate.setUpdateListener(new rb3(zb3Var, f89Var, (byte) 1));
                    animate.setListener(new ub3(zb3Var, f89Var, view, animate)).start();
                }
                arrayList.clear();
                zb3Var.t.remove(arrayList);
                return;
        }
    }
}
