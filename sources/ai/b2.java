package ai;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;
public final class b2 extends d7 {
    public final b3 f507s2;

    public b2(b3 b3Var, Context context, int i3, TL_stars.StarGift starGift, long j10, l1 l1Var, boolean z10, boolean z11) {
        super(context, i3, starGift, null, j10, l1Var, z10, z11);
        this.f507s2 = b3Var;
    }

    @Override
    public final fc e1() {
        b3 b3Var = this.f507s2;
        return new fc(b3Var.f28589c, b3Var.J0);
    }
}
