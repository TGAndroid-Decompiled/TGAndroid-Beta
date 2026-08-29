package jh;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;
public final class a9 implements Runnable {
    public final int f11744a;
    public final tn f11745b;
    public final long f11746c;
    public final TLRPC.Chat d;

    public a9(tn tnVar, long j10, TLRPC.Chat chat, int i10) {
        this.f11744a = i10;
        this.f11745b = tnVar;
        this.f11746c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f11744a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f11746c;
        tn tnVar = this.f11745b;
        switch (i10) {
            case 0:
                tc.a0(tnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                Pattern pattern = LaunchActivity.f35560x1;
                tc.a0(tnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
