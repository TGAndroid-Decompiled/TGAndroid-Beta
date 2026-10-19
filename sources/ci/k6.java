package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nc0;
import org.telegram.ui.yb0;
public final class k6 implements RequestDelegate {
    public final int f5566a;
    public final long f5567b;
    public final Object f5568c;

    public k6(Object obj, long j10, int i10) {
        this.f5566a = i10;
        this.f5568c = obj;
        this.f5567b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5566a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.i0((i7) this.f5568c, this.f5567b, tLObject, 5));
                return;
            case 1:
                ((ContactsController) this.f5568c).lambda$loadContacts$28(this.f5567b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f5568c).lambda$loadLiveLocations$26(this.f5567b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f5568c).lambda$hasSavedMessages$15(this.f5567b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f5568c).lambda$declineSecretChat$20(this.f5567b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f5568c).lambda$sendGame$50(this.f5567b, tLObject, tL_error);
                return;
            default:
                nc0 nc0Var = (nc0) this.f5568c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new yb0(nc0Var, tLObject, this.f5567b, 0));
                    return;
                }
                return;
        }
    }
}
