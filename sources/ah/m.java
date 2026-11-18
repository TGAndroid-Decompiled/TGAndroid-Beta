package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class m extends AnimatorListenerAdapter {
    public final int f1084a;
    public final ArrayList f1085b;
    public final n f1086c;

    public m(n nVar, ArrayList arrayList, int i7) {
        this.f1084a = i7;
        this.f1086c = nVar;
        this.f1085b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1084a) {
            case 0:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f1085b;
                    int size = arrayList.size();
                    n nVar = this.f1086c;
                    if (i7 < size) {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    } else {
                        nVar.getClass();
                        nVar.h.clear();
                        nVar.f1088b = null;
                        nVar.f1089c = false;
                        ((o) nVar.f1092n).f1094b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f1085b;
                    int size2 = arrayList2.size();
                    n nVar2 = this.f1086c;
                    if (i10 < size2) {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        nVar2.h.clear();
                        nVar2.f1088b = null;
                        nVar2.f1089c = false;
                        ((o) nVar2.f1092n).f1094b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
