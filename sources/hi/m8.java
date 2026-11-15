package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class m8 extends AnimatorListenerAdapter {
    public final int f14707a;
    public final ArrayList f14708b;
    public final ah.n f14709c;

    public m8(ah.n nVar, ArrayList arrayList, int i7) {
        this.f14707a = i7;
        this.f14709c = nVar;
        this.f14708b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14707a) {
            case 0:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f14708b;
                    int size = arrayList.size();
                    ah.n nVar = this.f14709c;
                    if (i7 < size) {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    } else {
                        nVar.getClass();
                        n8 n8Var = (n8) nVar.f1093n;
                        nVar.h.clear();
                        nVar.f1089b = null;
                        nVar.f1090c = false;
                        n8Var.f14769b.setAllowDrawCursor(true);
                        b8 b8Var = n8Var.h;
                        if (b8Var != null) {
                            b8Var.run();
                        }
                        if (n8Var.M) {
                            n8Var.fullScroll(130);
                            n8Var.M = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f14708b;
                    int size2 = arrayList2.size();
                    ah.n nVar2 = this.f14709c;
                    if (i10 < size2) {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        ArrayList arrayList3 = nVar2.h;
                        n8 n8Var2 = (n8) nVar2.f1093n;
                        arrayList3.clear();
                        nVar2.f1089b = null;
                        nVar2.f1090c = false;
                        n8Var2.f14769b.setAllowDrawCursor(true);
                        b8 b8Var2 = n8Var2.h;
                        if (b8Var2 != null) {
                            b8Var2.run();
                        }
                        if (n8Var2.M) {
                            n8Var2.fullScroll(130);
                            n8Var2.M = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
