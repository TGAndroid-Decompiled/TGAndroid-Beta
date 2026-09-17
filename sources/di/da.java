package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class da extends AnimatorListenerAdapter {
    public final int f7136a;
    public final ArrayList f7137b;
    public final ea f7138c;

    public da(ea eaVar, ArrayList arrayList, int i10) {
        this.f7136a = i10;
        this.f7138c = eaVar;
        this.f7137b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7136a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f7137b;
                    int size = arrayList.size();
                    ea eaVar = this.f7138c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        fa faVar = (fa) eaVar.f7207n;
                        eaVar.h.clear();
                        eaVar.f7203b = null;
                        eaVar.f7204c = false;
                        faVar.f7267a.setAllowDrawCursor(true);
                        o9 o9Var = faVar.f7271f;
                        if (o9Var != null) {
                            o9Var.run();
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
                    ArrayList arrayList2 = this.f7137b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f7138c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = eaVar2.h;
                        fa faVar2 = (fa) eaVar2.f7207n;
                        arrayList3.clear();
                        eaVar2.f7203b = null;
                        eaVar2.f7204c = false;
                        faVar2.f7267a.setAllowDrawCursor(true);
                        o9 o9Var2 = faVar2.f7271f;
                        if (o9Var2 != null) {
                            o9Var2.run();
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
