package mg;

import java.util.HashMap;
import org.telegram.messenger.r20;
public final class j0 implements Runnable {
    public final int f13169a;
    public final r20 f13170b;
    public final HashMap f13171c;

    public j0(r20 r20Var, HashMap hashMap, int i10) {
        this.f13169a = i10;
        this.f13170b = r20Var;
        this.f13171c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f13169a) {
            case 0:
                this.f13170b.a(this.f13171c);
                return;
            default:
                this.f13170b.a(this.f13171c);
                return;
        }
    }
}
