package ci;

import android.os.Bundle;
import org.telegram.ui.wm;
public final class hc extends wm {
    public final boolean f5261sd;
    public final tc f5262td;

    public hc(tc tcVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f5262td = tcVar;
        this.f5261sd = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f5261sd) {
            this.f5262td.show();
        }
    }
}
