package gh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class f implements Runnable {
    public final int f7375a;
    public final j f7376b;

    public f(j jVar, int i10) {
        this.f7375a = i10;
        this.f7376b = jVar;
    }

    @Override
    public final void run() {
        switch (this.f7375a) {
            case 0:
                j jVar = this.f7376b;
                if (jVar.f7399j.isEmpty()) {
                    jVar.f7398i = true;
                    j.f7391n = null;
                    i iVar = jVar.f7396f;
                    if (iVar != null) {
                        iVar.f7380a = false;
                        jVar.f7396f = null;
                    }
                    jVar.d.removeView(jVar.f7395e);
                    if (jVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) jVar.d.getParent()).removeView(jVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f7376b.f7399j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
