package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class w7b extends AnimatorListenerAdapter {
    public final byte a;
    public final ArrayList b;
    public final i1a c;

    public w7b(i1a i1aVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = i1aVar;
        this.b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i1a i1aVar = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    i1aVar.removeView((View) arrayList.get(i));
                }
                i1aVar.getClass();
                x7b x7bVar = (x7b) i1aVar.n;
                i1aVar.h.clear();
                i1aVar.b = null;
                i1aVar.c = false;
                x7bVar.b.setAllowDrawCursor(true);
                m7b m7bVar = x7bVar.h;
                if (m7bVar != null) {
                    m7bVar.run();
                }
                if (x7bVar.M) {
                    x7bVar.fullScroll(130);
                    x7bVar.M = false;
                    return;
                }
                return;
            default:
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    i1aVar.removeView((View) arrayList.get(i2));
                }
                ArrayList arrayList2 = i1aVar.h;
                x7b x7bVar2 = (x7b) i1aVar.n;
                arrayList2.clear();
                i1aVar.b = null;
                i1aVar.c = false;
                x7bVar2.b.setAllowDrawCursor(true);
                m7b m7bVar2 = x7bVar2.h;
                if (m7bVar2 != null) {
                    m7bVar2.run();
                }
                if (x7bVar2.M) {
                    x7bVar2.fullScroll(130);
                    x7bVar2.M = false;
                    return;
                }
                return;
        }
    }
}
