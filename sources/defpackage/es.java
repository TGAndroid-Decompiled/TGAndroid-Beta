package defpackage;

import java.util.function.IntSupplier;
import org.telegram.tgnet.ConnectionsManager;
public final class es implements IntSupplier {
    public final byte a;
    public final Object b;

    public es(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final int getAsInt() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((gs) obj).l3.f() << 1;
            case 1:
                return ((gs) obj).n3.f() << 1;
            case 2:
                if (!ConnectionsManager.getInstance(((gs) obj).b).isTestBackend()) {
                    return 20;
                }
                return 5;
            case 3:
                if (!ConnectionsManager.getInstance(((gs) obj).b).isTestBackend()) {
                    return 20;
                }
                return 5;
            case 4:
                if (ConnectionsManager.getInstance(((gs) obj).b).isTestBackend()) {
                    return 5;
                }
                return 100;
            case 5:
                if (ConnectionsManager.getInstance(((gs) obj).b).isTestBackend()) {
                    return 10;
                }
                return 30;
            default:
                return on2.f(((pp9) obj).U, -1290001879, 1375731712);
        }
    }
}
