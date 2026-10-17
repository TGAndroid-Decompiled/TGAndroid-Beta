package ai;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g81;
public final class o1 implements ToDoubleFunction {
    public final int f1938a;

    public o1(int i10) {
        this.f1938a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f1938a) {
            case 0:
                return a2.Q((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return a2.Q((TL_stars.starGiftAttributePattern) obj);
            case 2:
                return a2.Q((TL_stars.starGiftAttributeModel) obj);
            case 3:
                return ((g81) obj).f26507a;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return ((TLRPC.TL_topPeer) obj).rating;
            default:
                return ((TLRPC.TL_topPeer) obj).rating;
        }
    }
}
