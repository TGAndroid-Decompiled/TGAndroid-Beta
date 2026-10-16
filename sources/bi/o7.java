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
import org.telegram.ui.ld0;
public final class o7 implements RequestDelegate {
    public final int f3425a;
    public final long f3426b;
    public final Object f3427c;

    public o7(Object obj, long j10, int i10) {
        this.f3425a = i10;
        this.f3427c = obj;
        this.f3426b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3425a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.i0((x8) this.f3427c, this.f3426b, tLObject, 2));
                return;
            case 1:
                ((ContactsController) this.f3427c).lambda$loadContacts$28(this.f3426b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f3427c).lambda$loadLiveLocations$26(this.f3426b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f3427c).lambda$hasSavedMessages$15(this.f3426b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f3427c).lambda$declineSecretChat$20(this.f3426b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f3427c).lambda$sendGame$50(this.f3426b, tLObject, tL_error);
                return;
            default:
                ld0 ld0Var = (ld0) this.f3427c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.i0(ld0Var, tLObject, this.f3426b, 27));
                    return;
                }
                return;
        }
    }
}
