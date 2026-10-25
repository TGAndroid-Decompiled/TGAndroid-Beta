package bi;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class ia implements Runnable {
    public final int f4841a;
    public final un f4842b;
    public final long f4843c;
    public final TLRPC.Chat d;

    public ia(un unVar, long j10, TLRPC.Chat chat, int i10) {
        this.f4841a = i10;
        this.f4842b = unVar;
        this.f4843c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f4841a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f4843c;
        un unVar = this.f4842b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.wc.b0(unVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.ui.Components.wc.b0(unVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
