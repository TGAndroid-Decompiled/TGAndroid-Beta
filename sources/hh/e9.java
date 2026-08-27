package hh;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class e9 implements Runnable {

    public final int f9224a;

    public final rn f9225b;

    public final long f9226c;
    public final TLRPC.Chat d;

    public e9(rn rnVar, long j10, TLRPC.Chat chat, int i10) {
        this.f9224a = i10;
        this.f9225b = rnVar;
        this.f9226c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f9224a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f9226c;
        rn rnVar = this.f9225b;
        switch (i10) {
            case 0:
                mc.a0(rnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                break;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                mc.a0(rnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                break;
        }
    }
}
