package di;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n61;
public final class w0 implements ToDoubleFunction {
    public final int f9970a;

    public w0(int i7) {
        this.f9970a = i7;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f9970a) {
            case 0:
                return h1.f1((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return h1.f1((TL_stars.starGiftAttributePattern) obj);
            case 2:
                return h1.f1((TL_stars.starGiftAttributeModel) obj);
            case 3:
                return ((n61) obj).f37816a;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return ((TLRPC.TL_topPeer) obj).rating;
            default:
                return ((TLRPC.TL_topPeer) obj).rating;
        }
    }
}
