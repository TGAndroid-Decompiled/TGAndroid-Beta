package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class m extends AnimatorListenerAdapter {
    public final int f1087a;
    public final ArrayList f1088b;
    public final n f1089c;

    public m(n nVar, ArrayList arrayList, int i7) {
        this.f1087a = i7;
        this.f1089c = nVar;
        this.f1088b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1087a) {
            case 0:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f1088b;
                    int size = arrayList.size();
                    n nVar = this.f1089c;
                    if (i7 < size) {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    } else {
                        nVar.getClass();
                        nVar.h.clear();
                        nVar.f1091b = null;
                        nVar.f1092c = false;
                        ((o) nVar.f1095n).f1097b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f1088b;
                    int size2 = arrayList2.size();
                    n nVar2 = this.f1089c;
                    if (i10 < size2) {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        nVar2.h.clear();
                        nVar2.f1091b = null;
                        nVar2.f1092c = false;
                        ((o) nVar2.f1095n).f1097b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
