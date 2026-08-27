package hh;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.s61;

public final class a1 implements ToDoubleFunction {

    public final int f8942a;

    public a1(int i10) {
        this.f8942a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f8942a) {
            case 0:
                return l1.P((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return l1.P((TL_stars.starGiftAttributePattern) obj);
            case 2:
                return l1.P((TL_stars.starGiftAttributeModel) obj);
            case 3:
                return ((s61) obj).f32346a;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return ((TLRPC.TL_topPeer) obj).rating;
            default:
                return ((TLRPC.TL_topPeer) obj).rating;
        }
    }
}
