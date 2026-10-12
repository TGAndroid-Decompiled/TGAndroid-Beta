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
import org.telegram.ui.nd0;
public final class o7 implements RequestDelegate {
    public final int f3421a;
    public final long f3422b;
    public final Object f3423c;

    public o7(Object obj, long j10, int i10) {
        this.f3421a = i10;
        this.f3423c = obj;
        this.f3422b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3421a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.i0((x8) this.f3423c, this.f3422b, tLObject, 2));
                return;
            case 1:
                ((ContactsController) this.f3423c).lambda$loadContacts$28(this.f3422b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f3423c).lambda$loadLiveLocations$26(this.f3422b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f3423c).lambda$hasSavedMessages$15(this.f3422b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f3423c).lambda$declineSecretChat$20(this.f3422b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f3423c).lambda$sendGame$50(this.f3422b, tLObject, tL_error);
                return;
            default:
                nd0 nd0Var = (nd0) this.f3423c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.i0(nd0Var, tLObject, this.f3422b, 27));
                    return;
                }
                return;
        }
    }
}
