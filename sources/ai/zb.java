package ai;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class zb implements Runnable {
    public final int f2548a;
    public final sn f2549b;
    public final long f2550c;
    public final TLRPC.Chat d;

    public zb(sn snVar, long j10, TLRPC.Chat chat, int i10) {
        this.f2548a = i10;
        this.f2549b = snVar;
        this.f2550c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f2548a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f2550c;
        sn snVar = this.f2549b;
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
