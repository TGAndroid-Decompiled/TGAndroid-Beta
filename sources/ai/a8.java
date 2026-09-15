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
public final class a8 implements RequestDelegate {
    public final int f520a;
    public final long f521b;
    public final Object f522c;

    public a8(Object obj, long j3, int i10) {
        this.f520a = i10;
        this.f522c = obj;
        this.f521b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f520a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.h0((l9) this.f522c, this.f521b, tLObject, 2));
                return;
            case 1:
                ((ContactsController) this.f522c).lambda$loadContacts$28(this.f521b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f522c).lambda$loadLiveLocations$26(this.f521b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f522c).lambda$hasSavedMessages$15(this.f521b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f522c).lambda$declineSecretChat$20(this.f521b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f522c).lambda$sendGame$47(this.f521b, tLObject, tL_error);
                return;
            default:
                id0 id0Var = (id0) this.f522c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(id0Var, tLObject, this.f521b, 28));
                    return;
                }
                return;
        }
    }
}
