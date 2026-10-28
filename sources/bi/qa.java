package bi;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.hw0;
import org.telegram.ui.mr;
import org.telegram.ui.wn;
public final class qa implements Runnable {
    public final int f5299a;
    public final int f5300b;
    public final long f5301c;

    public qa(int i10, long j10, int i11) {
        this.f5299a = i11;
        this.f5300b = i10;
        this.f5301c = j10;
    }

    @Override
    public final void run() {
        switch (this.f5299a) {
            case 0:
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    long j10 = this.f5301c;
                    if (j10 >= 0) {
                        U.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f5300b;
                    long j11 = -j10;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)))) {
                        U.presentFragment(new hw0(j11));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j11);
                    bundle.putInt("type", 3);
                    mr mrVar = new mr(bundle);
                    mrVar.y0(MessagesController.getInstance(i10).getChatFull(j11));
                    U.presentFragment(mrVar);
                    return;
                }
                return;
            case 1:
                SendMessagesHelper.getInstance(this.f5300b).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f5301c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 2:
                int i11 = this.f5300b;
                long j12 = this.f5301c;
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i11).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j12);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(wn.da(this.f5300b, this.f5301c));
                    return;
                }
                return;
        }
    }

    public qa(long j10, int i10, int i11) {
        this.f5299a = i11;
        this.f5301c = j10;
        this.f5300b = i10;
    }
}
