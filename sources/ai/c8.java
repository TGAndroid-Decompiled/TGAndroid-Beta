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
import org.telegram.ui.gd0;
public final class c8 implements RequestDelegate {
    public final int f705a;
    public final long f706b;
    public final Object f707c;

    public c8(Object obj, long j3, int i10) {
        this.f705a = i10;
        this.f707c = obj;
        this.f706b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f705a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.h0((l9) this.f707c, this.f706b, tLObject, 2));
                return;
            case 1:
                ((ContactsController) this.f707c).lambda$loadContacts$28(this.f706b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f707c).lambda$loadLiveLocations$26(this.f706b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f707c).lambda$hasSavedMessages$15(this.f706b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f707c).lambda$declineSecretChat$20(this.f706b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f707c).lambda$sendGame$47(this.f706b, tLObject, tL_error);
                return;
            default:
                gd0 gd0Var = (gd0) this.f707c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(gd0Var, tLObject, this.f706b, 27));
                    return;
                }
                return;
        }
    }
}
