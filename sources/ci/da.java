package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class da extends AnimatorListenerAdapter {
    public final int f4538a;
    public final ArrayList f4539b;
    public final ea f4540c;

    public da(ea eaVar, ArrayList arrayList, int i10) {
        this.f4538a = i10;
        this.f4540c = eaVar;
        this.f4539b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4538a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f4539b;
                    int size = arrayList.size();
                    ea eaVar = this.f4540c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        fa faVar = (fa) eaVar.f4608n;
                        eaVar.h.clear();
                        eaVar.f4605b = null;
                        eaVar.f4606c = false;
                        faVar.f4666a.setAllowDrawCursor(true);
                        p9 p9Var = faVar.f4669f;
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
                    ArrayList arrayList2 = this.f4539b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f4540c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = eaVar2.h;
                        fa faVar2 = (fa) eaVar2.f4608n;
                        arrayList3.clear();
                        eaVar2.f4605b = null;
                        eaVar2.f4606c = false;
                        faVar2.f4666a.setAllowDrawCursor(true);
                        p9 p9Var2 = faVar2.f4669f;
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
