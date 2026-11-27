package defpackage;

import java.util.function.IntSupplier;
import org.telegram.tgnet.ConnectionsManager;
public final class fr implements IntSupplier {
    public final byte a;
    public final Object b;

    public fr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final int getAsInt() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((hr) obj).t3.f() << 1;
            case 1:
                return ((hr) obj).v3.f() << 1;
            case 2:
                if (!ConnectionsManager.getInstance(((hr) obj).b).isTestBackend()) {
                    return 20;
                }
                return 5;
            case 3:
                if (!ConnectionsManager.getInstance(((hr) obj).b).isTestBackend()) {
                    return 20;
                }
                return 5;
            case 4:
                if (ConnectionsManager.getInstance(((hr) obj).b).isTestBackend()) {
                    return 5;
                }
                return 100;
            case 5:
                if (ConnectionsManager.getInstance(((hr) obj).b).isTestBackend()) {
                    return 10;
                }
                return 30;
            default:
                return vm2.f(((er9) obj).U, -1290001879, 1375731712);
        }
    }
}
