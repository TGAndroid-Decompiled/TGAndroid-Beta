package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class i extends AnimatorListenerAdapter {
    public final int f12551a;
    public final ArrayList f12552b;
    public final j f12553c;

    public i(j jVar, ArrayList arrayList, int i10) {
        this.f12551a = i10;
        this.f12553c = jVar;
        this.f12552b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12551a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f12552b;
                    int size = arrayList.size();
                    j jVar = this.f12553c;
                    if (i10 < size) {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        jVar.getClass();
                        jVar.h.clear();
                        jVar.f12555b = null;
                        jVar.f12556c = false;
                        ((k) jVar.f12559n).f12561b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f12552b;
                    int size2 = arrayList2.size();
                    j jVar2 = this.f12553c;
                    if (i11 < size2) {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        jVar2.h.clear();
                        jVar2.f12555b = null;
                        jVar2.f12556c = false;
                        ((k) jVar2.f12559n).f12561b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
