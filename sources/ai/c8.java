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
import org.telegram.ui.fd0;
public final class c8 implements RequestDelegate {
    public final int f653a;
    public final long f654b;
    public final Object f655c;

    public c8(Object obj, long j3, int i10) {
        this.f653a = i10;
        this.f655c = obj;
        this.f654b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f653a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.h0((l9) this.f655c, this.f654b, tLObject, 2));
                return;
            case 1:
                ((ContactsController) this.f655c).lambda$loadContacts$28(this.f654b, tLObject, tL_error);
                return;
            case 2:
                ((LocationController) this.f655c).lambda$loadLiveLocations$26(this.f654b, tLObject, tL_error);
                return;
            case 3:
                ((SavedMessagesController) this.f655c).lambda$hasSavedMessages$15(this.f654b, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f655c).lambda$declineSecretChat$20(this.f654b, tLObject, tL_error);
                return;
            case 5:
                ((SendMessagesHelper) this.f655c).lambda$sendGame$47(this.f654b, tLObject, tL_error);
                return;
            default:
                fd0 fd0Var = (fd0) this.f655c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(fd0Var, tLObject, this.f654b, 27));
                    return;
                }
                return;
        }
    }
}
