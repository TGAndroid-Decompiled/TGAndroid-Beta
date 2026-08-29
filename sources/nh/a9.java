package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class a9 extends AnimatorListenerAdapter {
    public final int f17393a;
    public final ArrayList f17394b;
    public final ig.j f17395c;

    public a9(ig.j jVar, ArrayList arrayList, int i10) {
        this.f17393a = i10;
        this.f17395c = jVar;
        this.f17394b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17393a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f17394b;
                    int size = arrayList.size();
                    ig.j jVar = this.f17395c;
                    if (i10 < size) {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        jVar.getClass();
                        b9 b9Var = (b9) jVar.f8992n;
                        jVar.h.clear();
                        jVar.f8988b = null;
                        jVar.f8989c = false;
                        b9Var.f17430a.setAllowDrawCursor(true);
                        o8 o8Var = b9Var.f17434f;
                        if (o8Var != null) {
                            o8Var.run();
                        }
                        if (b9Var.G) {
                            b9Var.fullScroll(130);
                            b9Var.G = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f17394b;
                    int size2 = arrayList2.size();
                    ig.j jVar2 = this.f17395c;
                    if (i11 < size2) {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = jVar2.h;
                        b9 b9Var2 = (b9) jVar2.f8992n;
                        arrayList3.clear();
                        jVar2.f8988b = null;
                        jVar2.f8989c = false;
                        b9Var2.f17430a.setAllowDrawCursor(true);
                        o8 o8Var2 = b9Var2.f17434f;
                        if (o8Var2 != null) {
                            o8Var2.run();
                        }
                        if (b9Var2.G) {
                            b9Var2.fullScroll(130);
                            b9Var2.G = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
