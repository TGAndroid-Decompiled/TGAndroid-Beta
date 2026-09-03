package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bd0;
public final class t5 implements RequestDelegate {
    public final int f17769a;
    public final long f17770b;
    public final Object f17771c;

    public t5(Object obj, long j10, int i10) {
        this.f17769a = i10;
        this.f17771c = obj;
        this.f17770b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17769a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i5.v((t6) this.f17771c, this.f17770b, tLObject, 6));
                return;
            case 1:
                ((ContactsController) this.f17771c).lambda$loadContacts$28(this.f17770b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f17771c).lambda$loadLiveLocations$26(this.f17770b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f17771c).lambda$hasSavedMessages$15(this.f17770b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f17771c).lambda$declineSecretChat$20(this.f17770b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f17771c).lambda$sendGame$47(this.f17770b, tLObject, tL_error);
                return;
            default:
                bd0 bd0Var = (bd0) this.f17771c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new i5.v(bd0Var, tLObject, this.f17770b, 29));
                    return;
                }
                return;
        }
    }
}
