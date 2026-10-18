package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ac0;
import org.telegram.ui.pc0;
public final class j6 implements RequestDelegate {
    public final int f5471a;
    public final long f5472b;
    public final Object f5473c;

    public j6(Object obj, long j10, int i10) {
        this.f5471a = i10;
        this.f5473c = obj;
        this.f5472b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5471a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.i0((h7) this.f5473c, this.f5472b, tLObject, 5));
                return;
            case 1:
                ((ContactsController) this.f5473c).lambda$loadContacts$28(this.f5472b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f5473c).lambda$loadLiveLocations$26(this.f5472b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f5473c).lambda$hasSavedMessages$15(this.f5472b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f5473c).lambda$declineSecretChat$20(this.f5472b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f5473c).lambda$sendGame$50(this.f5472b, tLObject, tL_error);
                return;
            default:
                pc0 pc0Var = (pc0) this.f5473c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ac0(pc0Var, tLObject, this.f5472b, 0));
                    return;
                }
                return;
        }
    }
}
