package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

public final class j extends AnimatorListenerAdapter {

    public final int f7097a;

    public final ArrayList f7098b;

    public final k f7099c;

    public j(k kVar, ArrayList arrayList, int i10) {
        this.f7097a = i10;
        this.f7099c = kVar;
        this.f7098b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7097a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f7098b;
                    int size = arrayList.size();
                    k kVar = this.f7099c;
                    if (i10 >= size) {
                        kVar.getClass();
                        kVar.h.clear();
                        kVar.f7101b = null;
                        kVar.f7102c = false;
                        ((l) kVar.f7105n).f7107b.setAllowDrawCursor(true);
                    } else {
                        kVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                    break;
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f7098b;
                    int size2 = arrayList2.size();
                    k kVar2 = this.f7099c;
                    if (i11 >= size2) {
                        kVar2.h.clear();
                        kVar2.f7101b = null;
                        kVar2.f7102c = false;
                        ((l) kVar2.f7105n).f7107b.setAllowDrawCursor(true);
                    } else {
                        kVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                    break;
                }
                break;
        }
    }
}
