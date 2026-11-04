package bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class k extends AnimatorListenerAdapter {
    public final int f3324a;
    public final ArrayList f3325b;
    public final l f3326c;

    public k(l lVar, ArrayList arrayList, int i3) {
        this.f3324a = i3;
        this.f3326c = lVar;
        this.f3325b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3324a) {
            case 0:
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.f3325b;
                    int size = arrayList.size();
                    l lVar = this.f3326c;
                    if (i3 < size) {
                        lVar.removeView((View) arrayList.get(i3));
                        i3++;
                    } else {
                        lVar.getClass();
                        lVar.h.clear();
                        lVar.f3328b = null;
                        lVar.f3329c = false;
                        ((m) lVar.f3332n).f3334b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f3325b;
                    int size2 = arrayList2.size();
                    l lVar2 = this.f3326c;
                    if (i10 < size2) {
                        lVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        lVar2.h.clear();
                        lVar2.f3328b = null;
                        lVar2.f3329c = false;
                        ((m) lVar2.f3332n).f3334b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
