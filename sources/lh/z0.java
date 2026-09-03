package lh;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.o71;
public final class z0 implements ToDoubleFunction {
    public final int f13407a;

    public z0(int i10) {
        this.f13407a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f13407a) {
            case 0:
                return j1.P((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return j1.P((TL_stars.starGiftAttributePattern) obj);
            case 2:
                return j1.P((TL_stars.starGiftAttributeModel) obj);
            case 3:
                return ((o71) obj).f27473a;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return ((TLRPC.TL_topPeer) obj).rating;
            default:
                return ((TLRPC.TL_topPeer) obj).rating;
        }
    }
}
