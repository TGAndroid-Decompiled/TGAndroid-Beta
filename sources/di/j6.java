package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bc0;
import org.telegram.ui.pc0;
public final class j6 implements RequestDelegate {
    public final int f8698a;
    public final long f8699b;
    public final Object f8700c;

    public j6(Object obj, long j10, int i10) {
        this.f8698a = i10;
        this.f8700c = obj;
        this.f8699b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8698a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.i0((h7) this.f8700c, this.f8699b, tLObject, 5));
                return;
            case 1:
                ((ContactsController) this.f8700c).lambda$loadContacts$28(this.f8699b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f8700c).lambda$loadLiveLocations$26(this.f8699b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f8700c).lambda$hasSavedMessages$15(this.f8699b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f8700c).lambda$declineSecretChat$20(this.f8699b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f8700c).lambda$sendGame$50(this.f8699b, tLObject, tL_error);
                return;
            default:
                pc0 pc0Var = (pc0) this.f8700c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new bc0(pc0Var, tLObject, this.f8699b, 0));
                    return;
                }
                return;
        }
    }
}
