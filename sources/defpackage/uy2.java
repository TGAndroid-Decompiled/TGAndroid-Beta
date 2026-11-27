package defpackage;

import java.nio.charset.Charset;
import org.webrtc.JniCommon;
import org.webrtc.NativeLifecycleLock;
public final class uy2 implements NativeLifecycleLock.NativeDisposer, y2c, b86 {
    public final byte a;

    @Override
    public final Object apply(Object obj) {
        p83.b.getClass();
        return e03.a.O((c03) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override
    public final void dispose(long j) {
        JniCommon.nativeReleaseRef(j);
    }

    @Override
    public final void invoke(Object obj) {
        vj vjVar = (vj) obj;
        switch (this.a) {
            case 15:
                vjVar.getClass();
                return;
            case 16:
                vjVar.getClass();
                return;
            case 17:
                vjVar.getClass();
                return;
            case 18:
                vjVar.getClass();
                return;
            case 19:
                vjVar.getClass();
                return;
            case 20:
                vjVar.getClass();
                return;
            case 21:
                vjVar.getClass();
                return;
            case 22:
                vjVar.getClass();
                return;
            case 23:
                vjVar.getClass();
                return;
            case 24:
                vjVar.getClass();
                return;
            case 25:
                vjVar.getClass();
                return;
            case 26:
                vjVar.getClass();
                return;
            case 27:
                vjVar.getClass();
                return;
            case 28:
                vjVar.getClass();
                return;
            default:
                vjVar.getClass();
                return;
        }
    }

    public uy2(uj ujVar, int i, byte b) {
        this.a = b;
    }

    public uy2(byte b) {
        this.a = b;
    }
}
