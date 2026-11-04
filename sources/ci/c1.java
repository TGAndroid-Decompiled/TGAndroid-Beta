package ci;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.r51;
public final class c1 implements ToDoubleFunction {
    public final int f4905a;

    public c1(int i3) {
        this.f4905a = i3;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f4905a) {
            case 0:
                return p1.e1((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return p1.e1((TL_stars.starGiftAttributePattern) obj);
            case 2:
                return p1.e1((TL_stars.starGiftAttributeModel) obj);
            case 3:
                return ((r51) obj).f37656a;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return ((TLRPC.TL_topPeer) obj).rating;
            default:
                return ((TLRPC.TL_topPeer) obj).rating;
        }
    }
}
