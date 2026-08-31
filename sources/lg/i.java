package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class i extends AnimatorListenerAdapter {
    public final int f12549a;
    public final ArrayList f12550b;
    public final j f12551c;

    public i(j jVar, ArrayList arrayList, int i10) {
        this.f12549a = i10;
        this.f12551c = jVar;
        this.f12550b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12549a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f12550b;
                    int size = arrayList.size();
                    j jVar = this.f12551c;
                    if (i10 < size) {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        jVar.getClass();
                        jVar.h.clear();
                        jVar.f12553b = null;
                        jVar.f12554c = false;
                        ((k) jVar.f12557n).f12559b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f12550b;
                    int size2 = arrayList2.size();
                    j jVar2 = this.f12551c;
                    if (i11 < size2) {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        jVar2.h.clear();
                        jVar2.f12553b = null;
                        jVar2.f12554c = false;
                        ((k) jVar2.f12557n).f12559b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
