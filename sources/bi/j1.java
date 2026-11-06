package bi;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.x51;
public final class j1 implements ToDoubleFunction {
    public final int f4076a;

    public j1(int i7) {
        this.f4076a = i7;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f4076a) {
            case 0:
                return w1.e1((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return w1.e1((TL_stars.starGiftAttributePattern) obj);
            case 2:
                return w1.e1((TL_stars.starGiftAttributeModel) obj);
            case 3:
                return ((x51) obj).f40185a;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return ((TLRPC.TL_topPeer) obj).rating;
            default:
                return ((TLRPC.TL_topPeer) obj).rating;
        }
    }
}
