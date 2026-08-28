package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc0;
import org.telegram.ui.r90;
public final class v5 implements RequestDelegate {
    public final int f12233a;
    public final long f12234b;
    public final Object f12235c;

    public v5(Object obj, long j10, int i9) {
        this.f12233a = i9;
        this.f12235c = obj;
        this.f12234b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12233a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e5.w((v6) this.f12235c, this.f12234b, tLObject, 6));
                return;
            case 1:
                ((ContactsController) this.f12235c).lambda$loadContacts$28(this.f12234b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f12235c).lambda$loadLiveLocations$26(this.f12234b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f12235c).lambda$hasSavedMessages$15(this.f12234b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f12235c).lambda$declineSecretChat$20(this.f12234b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f12235c).lambda$sendGame$47(this.f12234b, tLObject, tL_error);
                return;
            default:
                pc0 pc0Var = (pc0) this.f12235c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new r90(pc0Var, tLObject, this.f12234b));
                    return;
                }
                return;
        }
    }
}
