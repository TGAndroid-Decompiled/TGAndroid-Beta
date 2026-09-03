package ih;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class f implements Runnable {
    public final int f7559a;
    public final j f7560b;

    public f(j jVar, int i10) {
        this.f7559a = i10;
        this.f7560b = jVar;
    }

    @Override
    public final void run() {
        switch (this.f7559a) {
            case 0:
                j jVar = this.f7560b;
                if (jVar.f7581j.isEmpty()) {
                    jVar.f7580i = true;
                    j.f7574n = null;
                    i iVar = jVar.f7578f;
                    if (iVar != null) {
                        iVar.f7564a = false;
                        jVar.f7578f = null;
                    }
                    jVar.d.removeView(jVar.e);
                    if (jVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) jVar.d.getParent()).removeView(jVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f7560b.f7581j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
