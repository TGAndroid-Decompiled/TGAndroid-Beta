package eh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class f implements Runnable {

    public final int f5483a;

    public final j f5484b;

    public f(j jVar, int i10) {
        this.f5483a = i10;
        this.f5484b = jVar;
    }

    @Override
    public final void run() {
        switch (this.f5483a) {
            case 0:
                j jVar = this.f5484b;
                if (jVar.f5507j.isEmpty()) {
                    jVar.f5506i = true;
                    j.f5499n = null;
                    i iVar = jVar.f5504f;
                    if (iVar != null) {
                        iVar.f5488a = false;
                        jVar.f5504f = null;
                    }
                    jVar.d.removeView(jVar.f5503e);
                    if (jVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) jVar.d.getParent()).removeView(jVar.d);
                    }
                }
                break;
            default:
                ArrayList arrayList = this.f5484b.f5507j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                break;
        }
    }
}
