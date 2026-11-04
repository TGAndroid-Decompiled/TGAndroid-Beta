package l1;

import java.util.LinkedHashMap;
import wd.y1;
public final class u0 implements wd.l0 {
    public final int f17644a;
    public final Object f17645b;
    public final Object f17646c;

    public u0(int i3, Object obj, Object obj2) {
        this.f17644a = i3;
        this.f17645b = obj;
        this.f17646c = obj2;
    }

    @Override
    public final void dispose() {
        switch (this.f17644a) {
            case 0:
                String str = (String) this.f17645b;
                v0 v0Var = (v0) this.f17646c;
                synchronized (w0.f17661b) {
                    LinkedHashMap linkedHashMap = w0.f17662c;
                    w0 w0Var = (w0) linkedHashMap.get(str);
                    if (w0Var != null) {
                        w0Var.f17663a.remove(v0Var);
                        if (w0Var.f17663a.isEmpty()) {
                            linkedHashMap.remove(str);
                            w0Var.stopWatching();
                        }
                    }
                }
                return;
            default:
                ((xd.c) this.f17645b).f58618c.removeCallbacks((y1) this.f17646c);
                return;
        }
    }
}
