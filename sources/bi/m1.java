package bi;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.z81;
public final class m1 implements ToDoubleFunction {
    public final int f5071a;

    public m1(int i10) {
        this.f5071a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f5071a) {
            case 0:
                return x1.R((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return x1.R((TL_stars.starGiftAttributePattern) obj);
            case 2:
                return x1.R((TL_stars.starGiftAttributeModel) obj);
            case 3:
                return ((z81) obj).f35292a;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return ((TLRPC.TL_topPeer) obj).rating;
            default:
                return ((TLRPC.TL_topPeer) obj).rating;
        }
    }
}
