package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class da extends AnimatorListenerAdapter {
    public final int f7108a;
    public final ArrayList f7109b;
    public final ea f7110c;

    public da(ea eaVar, ArrayList arrayList, int i10) {
        this.f7108a = i10;
        this.f7110c = eaVar;
        this.f7109b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7108a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f7109b;
                    int size = arrayList.size();
                    ea eaVar = this.f7110c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        fa faVar = (fa) eaVar.f7179n;
                        eaVar.h.clear();
                        eaVar.f7175b = null;
                        eaVar.f7176c = false;
                        faVar.f7239a.setAllowDrawCursor(true);
                        o9 o9Var = faVar.f7243f;
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
                    ArrayList arrayList2 = this.f7109b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f7110c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = eaVar2.h;
                        fa faVar2 = (fa) eaVar2.f7179n;
                        arrayList3.clear();
                        eaVar2.f7175b = null;
                        eaVar2.f7176c = false;
                        faVar2.f7239a.setAllowDrawCursor(true);
                        o9 o9Var2 = faVar2.f7243f;
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
