package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dd0;
public final class c8 implements RequestDelegate {
    public final int f650a;
    public final long f651b;
    public final Object f652c;

    public c8(Object obj, long j3, int i10) {
        this.f650a = i10;
        this.f652c = obj;
        this.f651b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f650a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.h0((l9) this.f652c, this.f651b, tLObject, 2));
                return;
            case 1:
                ((ContactsController) this.f652c).lambda$loadContacts$28(this.f651b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f652c).lambda$loadLiveLocations$26(this.f651b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f652c).lambda$hasSavedMessages$15(this.f651b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f652c).lambda$declineSecretChat$20(this.f651b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f652c).lambda$sendGame$47(this.f651b, tLObject, tL_error);
                return;
            default:
                dd0 dd0Var = (dd0) this.f652c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(dd0Var, tLObject, this.f651b, 28));
                    return;
                }
                return;
        }
    }
}
