package ai;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class ac implements Runnable {
    public final int f975a;
    public final sn f976b;
    public final long f977c;
    public final TLRPC.Chat d;

    public ac(sn snVar, long j10, TLRPC.Chat chat, int i10) {
        this.f975a = i10;
        this.f976b = snVar;
        this.f977c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f975a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f977c;
        sn snVar = this.f976b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
