package mg;

import java.util.HashMap;
import org.telegram.messenger.q20;
public final class j0 implements Runnable {
    public final int f13168a;
    public final q20 f13169b;
    public final HashMap f13170c;

    public j0(q20 q20Var, HashMap hashMap, int i10) {
        this.f13168a = i10;
        this.f13169b = q20Var;
        this.f13170c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f13168a) {
            case 0:
                this.f13169b.a(this.f13170c);
                return;
            default:
                this.f13169b.a(this.f13170c);
                return;
        }
    }
}
