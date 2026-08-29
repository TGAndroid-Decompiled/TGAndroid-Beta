package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class i extends AnimatorListenerAdapter {
    public final int f8984a;
    public final ArrayList f8985b;
    public final j f8986c;

    public i(j jVar, ArrayList arrayList, int i10) {
        this.f8984a = i10;
        this.f8986c = jVar;
        this.f8985b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8984a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f8985b;
                    int size = arrayList.size();
                    j jVar = this.f8986c;
                    if (i10 < size) {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        jVar.getClass();
                        jVar.h.clear();
                        jVar.f8988b = null;
                        jVar.f8989c = false;
                        ((k) jVar.f8992n).f8994b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f8985b;
                    int size2 = arrayList2.size();
                    j jVar2 = this.f8986c;
                    if (i11 < size2) {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        jVar2.h.clear();
                        jVar2.f8988b = null;
                        jVar2.f8989c = false;
                        ((k) jVar2.f8992n).f8994b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
