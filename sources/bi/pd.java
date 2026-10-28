package bi;

import android.os.Bundle;
import org.telegram.ui.wn;
public final class pd extends wn {
    public final boolean f5252od;
    public final be f5253pd;

    public pd(be beVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f5253pd = beVar;
        this.f5252od = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f5252od) {
            this.f5253pd.show();
        }
    }
}
