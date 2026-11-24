package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class nla implements Runnable {
    public final byte a;
    public final pla b;

    public nla(pla plaVar, byte b) {
        this.a = b;
        this.b = plaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pla plaVar = this.b;
        switch (b) {
            case 0:
                if (plaVar.j.isEmpty()) {
                    plaVar.i = true;
                    pla.n = null;
                    ola olaVar = plaVar.f;
                    if (olaVar != null) {
                        olaVar.a = false;
                        plaVar.f = null;
                    }
                    plaVar.d.removeView(plaVar.e);
                    if (plaVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) plaVar.d.getParent()).removeView(plaVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = plaVar.j;
                for (int i = 0; i < arrayList.size(); i++) {
                    ((View) arrayList.get(i)).invalidate();
                }
                return;
        }
    }
}
