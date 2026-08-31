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
    public final int f17767a;
    public final long f17768b;
    public final Object f17769c;

    public t5(Object obj, long j10, int i10) {
        this.f17767a = i10;
        this.f17769c = obj;
        this.f17768b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17767a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i5.v((t6) this.f17769c, this.f17768b, tLObject, 6));
                return;
            case 1:
                ((ContactsController) this.f17769c).lambda$loadContacts$28(this.f17768b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f17769c).lambda$loadLiveLocations$26(this.f17768b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f17769c).lambda$hasSavedMessages$15(this.f17768b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f17769c).lambda$declineSecretChat$20(this.f17768b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f17769c).lambda$sendGame$47(this.f17768b, tLObject, tL_error);
                return;
            default:
                bd0 bd0Var = (bd0) this.f17769c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new i5.v(bd0Var, tLObject, this.f17768b, 29));
                    return;
                }
                return;
        }
    }
}
