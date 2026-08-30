package lh;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class b9 implements Runnable {
    public final int f12174a;
    public final xn f12175b;
    public final long f12176c;
    public final TLRPC.Chat d;

    public b9(xn xnVar, long j10, TLRPC.Chat chat, int i10) {
        this.f12174a = i10;
        this.f12175b = xnVar;
        this.f12176c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f12174a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f12176c;
        xn xnVar = this.f12175b;
        switch (i10) {
            case 0:
                qc.a0(xnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                Pattern pattern = LaunchActivity.f31612y1;
                qc.a0(xnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
