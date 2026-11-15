package di;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.z51;
public final class x0 implements ToDoubleFunction {
    public final int f9701a;

    public x0(int i7) {
        this.f9701a = i7;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f9701a) {
            case 0:
                return i1.e1((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return i1.e1((TL_stars.starGiftAttributePattern) obj);
            case 2:
                return i1.e1((TL_stars.starGiftAttributeModel) obj);
            case 3:
                return ((z51) obj).f42255a;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return ((TLRPC.TL_topPeer) obj).rating;
            default:
                return ((TLRPC.TL_topPeer) obj).rating;
        }
    }
}
