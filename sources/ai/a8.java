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
import org.telegram.ui.jd0;
public final class a8 implements RequestDelegate {
    public final int f525a;
    public final long f526b;
    public final Object f527c;

    public a8(Object obj, long j3, int i10) {
        this.f525a = i10;
        this.f527c = obj;
        this.f526b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f525a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.h0((l9) this.f527c, this.f526b, tLObject, 2));
                return;
            case 1:
                ((ContactsController) this.f527c).lambda$loadContacts$28(this.f526b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f527c).lambda$loadLiveLocations$26(this.f526b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f527c).lambda$hasSavedMessages$15(this.f526b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f527c).lambda$declineSecretChat$20(this.f526b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f527c).lambda$sendGame$47(this.f526b, tLObject, tL_error);
                return;
            default:
                jd0 jd0Var = (jd0) this.f527c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(jd0Var, tLObject, this.f526b, 28));
                    return;
                }
                return;
        }
    }
}
