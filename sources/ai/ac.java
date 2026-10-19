package ai;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class ac implements Runnable {
    public final int f974a;
    public final qn f975b;
    public final long f976c;
    public final TLRPC.Chat d;

    public ac(qn qnVar, long j10, TLRPC.Chat chat, int i10) {
        this.f974a = i10;
        this.f975b = qnVar;
        this.f976c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f974a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f976c;
        qn qnVar = this.f975b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
