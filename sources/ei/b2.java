package ei;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.sr;
import org.telegram.ui.sw0;
import org.telegram.ui.zn;
public final class b2 implements Runnable {
    public final int f8963a;
    public final int f8964b;
    public final long f8965c;

    public b2(int i10, long j3, int i11) {
        this.f8963a = i11;
        this.f8964b = i10;
        this.f8965c = j3;
    }

    @Override
    public final void run() {
        switch (this.f8963a) {
            case 0:
                SendMessagesHelper.getInstance(this.f8964b).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f8965c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 1:
                int i10 = this.f8964b;
                long j3 = this.f8965c;
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i10).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j3);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 2:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(zn.V9(this.f8964b, this.f8965c));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    long j10 = this.f8965c;
                    if (j10 >= 0) {
                        U2.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i11 = this.f8964b;
                    long j11 = -j10;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i11).getChat(Long.valueOf(j11)))) {
                        U2.presentFragment(new sw0(j11));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j11);
                    bundle.putInt("type", 3);
                    sr srVar = new sr(bundle);
                    srVar.x0(MessagesController.getInstance(i11).getChatFull(j11));
                    U2.presentFragment(srVar);
                    return;
                }
                return;
        }
    }

    public b2(long j3, int i10, int i11) {
        this.f8963a = i11;
        this.f8965c = j3;
        this.f8964b = i10;
    }
}
