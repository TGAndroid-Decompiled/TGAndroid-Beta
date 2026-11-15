package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class m extends AnimatorListenerAdapter {
    public final int f1085a;
    public final ArrayList f1086b;
    public final n f1087c;

    public m(n nVar, ArrayList arrayList, int i7) {
        this.f1085a = i7;
        this.f1087c = nVar;
        this.f1086b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1085a) {
            case 0:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f1086b;
                    int size = arrayList.size();
                    n nVar = this.f1087c;
                    if (i7 < size) {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    } else {
                        nVar.getClass();
                        nVar.h.clear();
                        nVar.f1089b = null;
                        nVar.f1090c = false;
                        ((o) nVar.f1093n).f1095b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f1086b;
                    int size2 = arrayList2.size();
                    n nVar2 = this.f1087c;
                    if (i10 < size2) {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        nVar2.h.clear();
                        nVar2.f1089b = null;
                        nVar2.f1090c = false;
                        ((o) nVar2.f1093n).f1095b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
