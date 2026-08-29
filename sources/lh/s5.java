package lh;

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
public final class s5 implements RequestDelegate {
    public final int f16215a;
    public final long f16216b;
    public final Object f16217c;

    public s5(Object obj, long j10, int i10) {
        this.f16215a = i10;
        this.f16217c = obj;
        this.f16216b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16215a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g5.v((s6) this.f16217c, this.f16216b, tLObject, 6));
                return;
            case 1:
                ((ContactsController) this.f16217c).lambda$loadContacts$28(this.f16216b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f16217c).lambda$loadLiveLocations$26(this.f16216b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f16217c).lambda$hasSavedMessages$15(this.f16216b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f16217c).lambda$declineSecretChat$20(this.f16216b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f16217c).lambda$sendGame$47(this.f16216b, tLObject, tL_error);
                return;
            default:
                rc0 rc0Var = (rc0) this.f16217c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new dc0(rc0Var, tLObject, this.f16216b));
                    return;
                }
                return;
        }
    }
}
