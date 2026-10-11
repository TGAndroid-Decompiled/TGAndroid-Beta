package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class aa extends AnimatorListenerAdapter {
    public final int f4729a;
    public final ArrayList f4730b;
    public final ba f4731c;

    public aa(ba baVar, ArrayList arrayList, int i10) {
        this.f4729a = i10;
        this.f4731c = baVar;
        this.f4730b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4729a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f4730b;
                    int size = arrayList.size();
                    ba baVar = this.f4731c;
                    if (i10 < size) {
                        baVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        baVar.getClass();
                        ca caVar = (ca) baVar.f4800n;
                        baVar.h.clear();
                        baVar.f4796b = null;
                        baVar.f4797c = false;
                        caVar.f4844a.setAllowDrawCursor(true);
                        m9 m9Var = caVar.f4848f;
                        if (m9Var != null) {
                            m9Var.run();
                        }
                        if (caVar.K) {
                            caVar.fullScroll(130);
                            caVar.K = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f4730b;
                    int size2 = arrayList2.size();
                    ba baVar2 = this.f4731c;
                    if (i11 < size2) {
                        baVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = baVar2.h;
                        ca caVar2 = (ca) baVar2.f4800n;
                        arrayList3.clear();
                        baVar2.f4796b = null;
                        baVar2.f4797c = false;
                        caVar2.f4844a.setAllowDrawCursor(true);
                        m9 m9Var2 = caVar2.f4848f;
                        if (m9Var2 != null) {
                            m9Var2.run();
                        }
                        if (caVar2.K) {
                            caVar2.fullScroll(130);
                            caVar2.K = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
