package dh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class f implements Runnable {
    public final int f4584a;
    public final k f4585b;

    public f(k kVar, int i9) {
        this.f4584a = i9;
        this.f4585b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f4584a) {
            case 0:
                k kVar = this.f4585b;
                if (kVar.f4609j.isEmpty()) {
                    kVar.f4608i = true;
                    k.f4601n = null;
                    j jVar = kVar.f4606f;
                    if (jVar != null) {
                        jVar.f4590a = false;
                        kVar.f4606f = null;
                    }
                    kVar.d.removeView(kVar.f4605e);
                    if (kVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) kVar.d.getParent()).removeView(kVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f4585b.f4609j;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    ((View) arrayList.get(i9)).invalidate();
                }
                return;
        }
    }
}
