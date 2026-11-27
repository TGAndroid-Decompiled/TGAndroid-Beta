package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class s9b extends AnimatorListenerAdapter {
    public final byte a;
    public final ArrayList b;
    public final a3a c;

    public s9b(a3a a3aVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = a3aVar;
        this.b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a3a a3aVar = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    a3aVar.removeView((View) arrayList.get(i));
                }
                a3aVar.getClass();
                t9b t9bVar = (t9b) a3aVar.n;
                a3aVar.h.clear();
                a3aVar.b = null;
                a3aVar.c = false;
                t9bVar.b.setAllowDrawCursor(true);
                i9b i9bVar = t9bVar.h;
                if (i9bVar != null) {
                    i9bVar.run();
                }
                if (t9bVar.M) {
                    t9bVar.fullScroll(130);
                    t9bVar.M = false;
                    return;
                }
                return;
            default:
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    a3aVar.removeView((View) arrayList.get(i2));
                }
                ArrayList arrayList2 = a3aVar.h;
                t9b t9bVar2 = (t9b) a3aVar.n;
                arrayList2.clear();
                a3aVar.b = null;
                a3aVar.c = false;
                t9bVar2.b.setAllowDrawCursor(true);
                i9b i9bVar2 = t9bVar2.h;
                if (i9bVar2 != null) {
                    i9bVar2.run();
                }
                if (t9bVar2.M) {
                    t9bVar2.fullScroll(130);
                    t9bVar2.M = false;
                    return;
                }
                return;
        }
    }
}
