package nh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class e implements Runnable {
    public final int f13814a;
    public final h f13815b;

    public e(h hVar, int i10) {
        this.f13814a = i10;
        this.f13815b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f13814a) {
            case 0:
                h hVar = this.f13815b;
                if (hVar.f13835j.isEmpty()) {
                    hVar.f13834i = true;
                    h.f13828n = null;
                    g gVar = hVar.f13832f;
                    if (gVar != null) {
                        gVar.f13818a = false;
                        hVar.f13832f = null;
                    }
                    hVar.d.removeView(hVar.e);
                    if (hVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) hVar.d.getParent()).removeView(hVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f13815b.f13835j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
