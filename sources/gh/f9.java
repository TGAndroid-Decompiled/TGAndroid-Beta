package gh;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class f9 implements Runnable {
    public final int f8083a;
    public final qn f8084b;
    public final long f8085c;
    public final TLRPC.Chat d;

    public f9(qn qnVar, long j10, TLRPC.Chat chat, int i9) {
        this.f8083a = i9;
        this.f8084b = qnVar;
        this.f8085c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i9 = this.f8083a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f8085c;
        qn qnVar = this.f8084b;
        switch (i9) {
            case 0:
                oc.a0(qnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                Pattern pattern = LaunchActivity.f35493x1;
                oc.a0(qnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
