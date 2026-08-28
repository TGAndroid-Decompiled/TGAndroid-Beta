package fg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class k extends AnimatorListenerAdapter {
    public final int f6300a;
    public final ArrayList f6301b;
    public final l f6302c;

    public k(l lVar, ArrayList arrayList, int i9) {
        this.f6300a = i9;
        this.f6302c = lVar;
        this.f6301b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6300a) {
            case 0:
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = this.f6301b;
                    int size = arrayList.size();
                    l lVar = this.f6302c;
                    if (i9 < size) {
                        lVar.removeView((View) arrayList.get(i9));
                        i9++;
                    } else {
                        lVar.getClass();
                        lVar.h.clear();
                        lVar.f6304b = null;
                        lVar.f6305c = false;
                        ((m) lVar.f6308n).f6310b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f6301b;
                    int size2 = arrayList2.size();
                    l lVar2 = this.f6302c;
                    if (i10 < size2) {
                        lVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        lVar2.h.clear();
                        lVar2.f6304b = null;
                        lVar2.f6305c = false;
                        ((m) lVar2.f6308n).f6310b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
