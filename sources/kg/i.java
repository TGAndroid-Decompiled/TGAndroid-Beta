package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class i extends AnimatorListenerAdapter {
    public final int f10537a;
    public final ArrayList f10538b;
    public final j f10539c;

    public i(j jVar, ArrayList arrayList, int i10) {
        this.f10537a = i10;
        this.f10539c = jVar;
        this.f10538b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10537a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f10538b;
                    int size = arrayList.size();
                    j jVar = this.f10539c;
                    if (i10 < size) {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        jVar.getClass();
                        jVar.h.clear();
                        jVar.f10541b = null;
                        jVar.f10542c = false;
                        ((k) jVar.f10544n).f10546b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f10538b;
                    int size2 = arrayList2.size();
                    j jVar2 = this.f10539c;
                    if (i11 < size2) {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        jVar2.h.clear();
                        jVar2.f10541b = null;
                        jVar2.f10542c = false;
                        ((k) jVar2.f10544n).f10546b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
