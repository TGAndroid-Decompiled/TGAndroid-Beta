package lh;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class b9 implements Runnable {
    public final int f12158a;
    public final zn f12159b;
    public final long f12160c;
    public final TLRPC.Chat d;

    public b9(zn znVar, long j10, TLRPC.Chat chat, int i10) {
        this.f12158a = i10;
        this.f12159b = znVar;
        this.f12160c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f12158a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f12160c;
        zn znVar = this.f12159b;
        switch (i10) {
            case 0:
                qc.a0(znVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                Pattern pattern = LaunchActivity.f31586y1;
                qc.a0(znVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
