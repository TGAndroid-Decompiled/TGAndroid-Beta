package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cd0;
public final class t5 implements RequestDelegate {
    public final int f15894a;
    public final long f15895b;
    public final Object f15896c;

    public t5(Object obj, long j10, int i10) {
        this.f15894a = i10;
        this.f15896c = obj;
        this.f15895b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15894a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i5.v((t6) this.f15896c, this.f15895b, tLObject, 6));
                return;
            case 1:
                ((ContactsController) this.f15896c).lambda$loadContacts$28(this.f15895b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f15896c).lambda$loadLiveLocations$26(this.f15895b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f15896c).lambda$hasSavedMessages$15(this.f15895b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f15896c).lambda$declineSecretChat$20(this.f15895b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f15896c).lambda$sendGame$47(this.f15895b, tLObject, tL_error);
                return;
            default:
                cd0 cd0Var = (cd0) this.f15896c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new i5.v(cd0Var, tLObject, this.f15895b, 29));
                    return;
                }
                return;
        }
    }
}
