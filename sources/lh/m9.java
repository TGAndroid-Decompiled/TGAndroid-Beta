package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

public final class m9 extends AnimatorListenerAdapter {

    public final int f16398a;

    public final ArrayList f16399b;

    public final gg.k f16400c;

    public m9(gg.k kVar, ArrayList arrayList, int i10) {
        this.f16398a = i10;
        this.f16400c = kVar;
        this.f16399b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16398a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f16399b;
                    int size = arrayList.size();
                    gg.k kVar = this.f16400c;
                    if (i10 >= size) {
                        kVar.getClass();
                        n9 n9Var = (n9) kVar.f7105n;
                        kVar.h.clear();
                        kVar.f7101b = null;
                        kVar.f7102c = false;
                        n9Var.f16440a.setAllowDrawCursor(true);
                        z8 z8Var = n9Var.f16444f;
                        if (z8Var != null) {
                            z8Var.run();
                        }
                        if (n9Var.G) {
                            n9Var.fullScroll(130);
                            n9Var.G = false;
                        }
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
                    ArrayList arrayList2 = this.f16399b;
                    int size2 = arrayList2.size();
                    gg.k kVar2 = this.f16400c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = kVar2.h;
                        n9 n9Var2 = (n9) kVar2.f7105n;
                        arrayList3.clear();
                        kVar2.f7101b = null;
                        kVar2.f7102c = false;
                        n9Var2.f16440a.setAllowDrawCursor(true);
                        z8 z8Var2 = n9Var2.f16444f;
                        if (z8Var2 != null) {
                            z8Var2.run();
                        }
                        if (n9Var2.G) {
                            n9Var2.fullScroll(130);
                            n9Var2.G = false;
                        }
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
