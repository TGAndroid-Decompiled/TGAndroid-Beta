package nh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class e implements Runnable {
    public final int f13815a;
    public final h f13816b;

    public e(h hVar, int i10) {
        this.f13815a = i10;
        this.f13816b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f13815a) {
            case 0:
                h hVar = this.f13816b;
                if (hVar.f13836j.isEmpty()) {
                    hVar.f13835i = true;
                    h.f13829n = null;
                    g gVar = hVar.f13833f;
                    if (gVar != null) {
                        gVar.f13819a = false;
                        hVar.f13833f = null;
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
                ArrayList arrayList = this.f13816b.f13836j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
