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
import org.telegram.ui.id0;
public final class d8 implements RequestDelegate {
    public final int f829a;
    public final long f830b;
    public final Object f831c;

    public d8(Object obj, long j3, int i10) {
        this.f829a = i10;
        this.f831c = obj;
        this.f830b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f829a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.h0((m9) this.f831c, this.f830b, tLObject, 2));
                return;
            case 1:
                ((ContactsController) this.f831c).lambda$loadContacts$28(this.f830b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f831c).lambda$loadLiveLocations$26(this.f830b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f831c).lambda$hasSavedMessages$15(this.f830b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f831c).lambda$declineSecretChat$20(this.f830b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f831c).lambda$sendGame$50(this.f830b, tLObject, tL_error);
                return;
            default:
                id0 id0Var = (id0) this.f831c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(id0Var, tLObject, this.f830b, 28));
                    return;
                }
                return;
        }
    }
}
