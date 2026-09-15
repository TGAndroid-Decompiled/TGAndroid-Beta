package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class da extends AnimatorListenerAdapter {
    public final int f4536a;
    public final ArrayList f4537b;
    public final ea f4538c;

    public da(ea eaVar, ArrayList arrayList, int i10) {
        this.f4536a = i10;
        this.f4538c = eaVar;
        this.f4537b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4536a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f4537b;
                    int size = arrayList.size();
                    ea eaVar = this.f4538c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        fa faVar = (fa) eaVar.f4606n;
                        eaVar.h.clear();
                        eaVar.f4603b = null;
                        eaVar.f4604c = false;
                        faVar.f4664a.setAllowDrawCursor(true);
                        p9 p9Var = faVar.f4667f;
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
                    ArrayList arrayList2 = this.f4537b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f4538c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = eaVar2.h;
                        fa faVar2 = (fa) eaVar2.f4606n;
                        arrayList3.clear();
                        eaVar2.f4603b = null;
                        eaVar2.f4604c = false;
                        faVar2.f4664a.setAllowDrawCursor(true);
                        p9 p9Var2 = faVar2.f4667f;
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
