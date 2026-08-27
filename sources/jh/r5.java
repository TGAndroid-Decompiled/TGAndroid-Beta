package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tc0;
import org.telegram.ui.v90;

public final class r5 implements RequestDelegate {

    public final int f13902a;

    public final long f13903b;

    public final Object f13904c;

    public r5(Object obj, long j10, int i10) {
        this.f13902a = i10;
        this.f13904c = obj;
        this.f13903b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13902a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e5.u((s6) this.f13904c, this.f13903b, tLObject, 6));
                break;
            case 1:
                ((ContactsController) this.f13904c).lambda$loadContacts$28(this.f13903b, tLObject, tL_error);
                break;
            case 2:
                ((LocationController) this.f13904c).lambda$loadLiveLocations$26(this.f13903b, tLObject, tL_error);
                break;
            case 3:
                ((SavedMessagesController) this.f13904c).lambda$hasSavedMessages$15(this.f13903b, tLObject, tL_error);
                break;
            case 4:
                ((SecretChatHelper) this.f13904c).lambda$declineSecretChat$20(this.f13903b, tLObject, tL_error);
                break;
            case 5:
                ((SendMessagesHelper) this.f13904c).lambda$sendGame$47(this.f13903b, tLObject, tL_error);
                break;
            default:
                tc0 tc0Var = (tc0) this.f13904c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new v90(tc0Var, tLObject, this.f13903b));
                }
                break;
        }
    }
}
