package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class mb extends AnimatorListenerAdapter {
    public final int f3142a;
    public final ArrayList f3143b;
    public final nb f3144c;

    public mb(nb nbVar, ArrayList arrayList, int i10) {
        this.f3142a = i10;
        this.f3144c = nbVar;
        this.f3143b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3142a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f3143b;
                    int size = arrayList.size();
                    nb nbVar = this.f3144c;
                    if (i10 < size) {
                        nbVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        nbVar.getClass();
                        ob obVar = (ob) nbVar.f3251n;
                        nbVar.h.clear();
                        nbVar.f3248b = null;
                        nbVar.f3249c = false;
                        obVar.f3334a.setAllowDrawCursor(true);
                        sa saVar = obVar.f3337f;
                        if (saVar != null) {
                            saVar.run();
                        }
                        if (obVar.K) {
                            obVar.fullScroll(130);
                            obVar.K = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f3143b;
                    int size2 = arrayList2.size();
                    nb nbVar2 = this.f3144c;
                    if (i11 < size2) {
                        nbVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = nbVar2.h;
                        ob obVar2 = (ob) nbVar2.f3251n;
                        arrayList3.clear();
                        nbVar2.f3248b = null;
                        nbVar2.f3249c = false;
                        obVar2.f3334a.setAllowDrawCursor(true);
                        sa saVar2 = obVar2.f3337f;
                        if (saVar2 != null) {
                            saVar2.run();
                        }
                        if (obVar2.K) {
                            obVar2.fullScroll(130);
                            obVar2.K = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
