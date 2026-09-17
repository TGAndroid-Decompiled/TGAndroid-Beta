package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id0;
public final class j7 implements RequestDelegate {
    public final int f3141a;
    public final long f3142b;
    public final Object f3143c;

    public j7(Object obj, long j3, int i10) {
        this.f3141a = i10;
        this.f3143c = obj;
        this.f3142b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3141a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.g0((u8) this.f3143c, this.f3142b, tLObject, 2));
                return;
            case 1:
                ((ContactsController) this.f3143c).lambda$loadContacts$28(this.f3142b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f3143c).lambda$loadLiveLocations$26(this.f3142b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f3143c).lambda$hasSavedMessages$15(this.f3142b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f3143c).lambda$declineSecretChat$20(this.f3142b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f3143c).lambda$sendGame$47(this.f3142b, tLObject, tL_error);
                return;
            default:
                id0 id0Var = (id0) this.f3143c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.g0(id0Var, tLObject, this.f3142b, 28));
                    return;
                }
                return;
        }
    }
}
