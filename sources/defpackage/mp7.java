package defpackage;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class mp7 implements ToDoubleFunction {
    public final byte a;

    public mp7(byte b) {
        this.a = b;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
            case 0:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return gra.a1((TL_stars.starGiftAttributeBackdrop) obj);
            case 4:
                return gra.a1((TL_stars.starGiftAttributePattern) obj);
            case 5:
                return gra.a1((TL_stars.starGiftAttributeModel) obj);
            default:
                return ((bgc) obj).a;
        }
    }
}
