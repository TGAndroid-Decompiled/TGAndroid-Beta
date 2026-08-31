package jh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class f implements Runnable {
    public final int f10105a;
    public final j f10106b;

    public f(j jVar, int i10) {
        this.f10105a = i10;
        this.f10106b = jVar;
    }

    @Override
    public final void run() {
        switch (this.f10105a) {
            case 0:
                j jVar = this.f10106b;
                if (jVar.f10129j.isEmpty()) {
                    jVar.f10128i = true;
                    j.f10121n = null;
                    i iVar = jVar.f10126f;
                    if (iVar != null) {
                        iVar.f10110a = false;
                        jVar.f10126f = null;
                    }
                    jVar.d.removeView(jVar.f10125e);
                    if (jVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) jVar.d.getParent()).removeView(jVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f10106b.f10129j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
