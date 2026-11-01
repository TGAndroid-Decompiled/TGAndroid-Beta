package ng;

import android.view.View;
import org.telegram.messenger.r20;
import qg.k;
public final class g implements r20 {
    public final boolean f13780a;

    @Override
    public final void a(Object obj) {
        View view = (View) obj;
        if (view instanceof k) {
            ((k) view).g(this.f13780a, true);
        }
    }
}
