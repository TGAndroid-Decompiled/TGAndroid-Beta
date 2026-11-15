package di;

import android.os.Bundle;
import org.telegram.ui.an;
public final class wb extends an {
    public final boolean f9697ud;
    public final ic f9698vd;

    public wb(ic icVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f9698vd = icVar;
        this.f9697ud = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f9697ud) {
            this.f9698vd.show();
        }
    }
}
