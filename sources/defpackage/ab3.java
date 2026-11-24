package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class ab3 implements Runnable {
    public final byte a;
    public final ArrayList b;
    public final gb3 c;

    public ab3(gb3 gb3Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = gb3Var;
        this.b = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        gb3 gb3Var = this.c;
        switch (b) {
            case 0:
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    fb3 fb3Var = (fb3) obj;
                    gb3Var.C(fb3Var.a, fb3Var);
                    gb3Var.w.add(fb3Var);
                }
                arrayList.clear();
                gb3Var.u.remove(arrayList);
                return;
            default:
                int i2 = Integer.MAX_VALUE;
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    i2 = Math.min(i2, ((s49) arrayList.get(size2)).b());
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    s49 s49Var = (s49) arrayList.get(size3);
                    View view = s49Var.a;
                    ViewPropertyAnimator animate = view.animate();
                    gb3Var.y.add(s49Var);
                    animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(gb3Var.h()).setStartDelay((s49Var.b() - i2) * gb3Var.D).setInterpolator(gb3Var.h);
                    animate.setUpdateListener(new ya3(gb3Var, s49Var, (byte) 1));
                    animate.setListener(new bb3(gb3Var, s49Var, view, animate)).start();
                }
                arrayList.clear();
                gb3Var.t.remove(arrayList);
                return;
        }
    }
}
