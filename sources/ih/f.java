package ih;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class f implements Runnable {
    public final int f7577a;
    public final j f7578b;

    public f(j jVar, int i10) {
        this.f7577a = i10;
        this.f7578b = jVar;
    }

    @Override
    public final void run() {
        switch (this.f7577a) {
            case 0:
                j jVar = this.f7578b;
                if (jVar.f7599j.isEmpty()) {
                    jVar.f7598i = true;
                    j.f7592n = null;
                    i iVar = jVar.f7596f;
                    if (iVar != null) {
                        iVar.f7582a = false;
                        jVar.f7596f = null;
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
                ArrayList arrayList = this.f7578b.f7599j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
