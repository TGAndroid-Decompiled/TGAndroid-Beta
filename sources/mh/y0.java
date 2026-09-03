package mh;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.p71;
public final class y0 implements ToDoubleFunction {
    public final int f15078a;

    public y0(int i10) {
        this.f15078a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f15078a) {
            case 0:
                return i1.P((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return i1.P((TL_stars.starGiftAttributePattern) obj);
            case 2:
                return i1.P((TL_stars.starGiftAttributeModel) obj);
            case 3:
                return ((p71) obj).f29998a;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return ((TLRPC.TL_topPeer) obj).rating;
            default:
                return ((TLRPC.TL_topPeer) obj).rating;
        }
    }
}
