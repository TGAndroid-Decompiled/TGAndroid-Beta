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
import org.telegram.ui.dc0;
import org.telegram.ui.rc0;
public final class j6 implements RequestDelegate {
    public final int f8697a;
    public final long f8698b;
    public final Object f8699c;

    public j6(Object obj, long j10, int i10) {
        this.f8697a = i10;
        this.f8699c = obj;
        this.f8698b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8697a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.i0((h7) this.f8699c, this.f8698b, tLObject, 5));
                return;
            case 1:
                ((ContactsController) this.f8699c).lambda$loadContacts$28(this.f8698b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f8699c).lambda$loadLiveLocations$26(this.f8698b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f8699c).lambda$hasSavedMessages$15(this.f8698b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f8699c).lambda$declineSecretChat$20(this.f8698b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f8699c).lambda$sendGame$50(this.f8698b, tLObject, tL_error);
                return;
            default:
                rc0 rc0Var = (rc0) this.f8699c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new dc0(rc0Var, tLObject, this.f8698b, 0));
                    return;
                }
                return;
        }
    }
}
