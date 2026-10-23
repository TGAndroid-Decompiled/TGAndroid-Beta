package ai;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class bc implements Runnable {
    public final int f1049a;
    public final sn f1050b;
    public final long f1051c;
    public final TLRPC.Chat d;

    public bc(sn snVar, long j10, TLRPC.Chat chat, int i10) {
        this.f1049a = i10;
        this.f1050b = snVar;
        this.f1051c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f1049a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f1051c;
        sn snVar = this.f1050b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                Pattern pattern = LaunchActivity.E1;
                org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
