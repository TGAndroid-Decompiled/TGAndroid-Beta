package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m6 implements RequestDelegate {
    public final int f8569a;
    public final v7 f8570b;

    public m6(v7 v7Var, int i9) {
        this.f8569a = i9;
        this.f8570b = v7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8569a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t6(this.f8570b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new t6(this.f8570b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t6(this.f8570b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new t6(this.f8570b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t6(this.f8570b, tLObject, 4));
                return;
        }
    }
}
