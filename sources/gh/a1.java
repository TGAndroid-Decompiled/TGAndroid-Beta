package gh;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.q61;
public final class a1 implements ToDoubleFunction {
    public final int f7770a;

    public a1(int i9) {
        this.f7770a = i9;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f7770a) {
            case 0:
                return l1.O((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return l1.O((TL_stars.starGiftAttributePattern) obj);
            case 2:
                return l1.O((TL_stars.starGiftAttributeModel) obj);
            case 3:
                return ((q61) obj).f31844a;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return ((TLRPC.TL_topPeer) obj).rating;
            default:
                return ((TLRPC.TL_topPeer) obj).rating;
        }
    }
}
