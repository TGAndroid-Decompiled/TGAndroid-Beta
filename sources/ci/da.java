package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class da extends AnimatorListenerAdapter {
    public final int f4540a;
    public final ArrayList f4541b;
    public final ea f4542c;

    public da(ea eaVar, ArrayList arrayList, int i10) {
        this.f4540a = i10;
        this.f4542c = eaVar;
        this.f4541b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4540a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f4541b;
                    int size = arrayList.size();
                    ea eaVar = this.f4542c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        fa faVar = (fa) eaVar.f4610n;
                        eaVar.h.clear();
                        eaVar.f4607b = null;
                        eaVar.f4608c = false;
                        faVar.f4668a.setAllowDrawCursor(true);
                        p9 p9Var = faVar.f4671f;
                        if (p9Var != null) {
                            p9Var.run();
                        }
                        if (faVar.K) {
                            faVar.fullScroll(130);
                            faVar.K = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f4541b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f4542c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = eaVar2.h;
                        fa faVar2 = (fa) eaVar2.f4610n;
                        arrayList3.clear();
                        eaVar2.f4607b = null;
                        eaVar2.f4608c = false;
                        faVar2.f4668a.setAllowDrawCursor(true);
                        p9 p9Var2 = faVar2.f4671f;
                        if (p9Var2 != null) {
                            p9Var2.run();
                        }
                        if (faVar2.K) {
                            faVar2.fullScroll(130);
                            faVar2.K = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
