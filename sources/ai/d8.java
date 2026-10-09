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
import org.telegram.ui.hd0;
public final class d8 implements RequestDelegate {
    public final int f831a;
    public final long f832b;
    public final Object f833c;

    public d8(Object obj, long j3, int i10) {
        this.f831a = i10;
        this.f833c = obj;
        this.f832b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f831a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.h0((m9) this.f833c, this.f832b, tLObject, 2));
                return;
            case 1:
                ((ContactsController) this.f833c).lambda$loadContacts$28(this.f832b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f833c).lambda$loadLiveLocations$26(this.f832b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f833c).lambda$hasSavedMessages$15(this.f832b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f833c).lambda$declineSecretChat$20(this.f832b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f833c).lambda$sendGame$50(this.f832b, tLObject, tL_error);
                return;
            default:
                hd0 hd0Var = (hd0) this.f833c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(hd0Var, tLObject, this.f832b, 28));
                    return;
                }
                return;
        }
    }
}
