package mh;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class b9 implements Runnable {
    public final int f13763a;
    public final xn f13764b;
    public final long f13765c;
    public final TLRPC.Chat d;

    public b9(xn xnVar, long j10, TLRPC.Chat chat, int i10) {
        this.f13763a = i10;
        this.f13764b = xnVar;
        this.f13765c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f13763a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f13765c;
        xn xnVar = this.f13764b;
        switch (i10) {
            case 0:
                qc.a0(xnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                Pattern pattern = LaunchActivity.f34134y1;
                qc.a0(xnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
