package ai;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.jr;
import org.telegram.ui.sn;
import org.telegram.ui.zv0;
public final class pa implements Runnable {
    public final int f2031a;
    public final int f2032b;
    public final long f2033c;

    public pa(int i10, long j10, int i11) {
        this.f2031a = i11;
        this.f2032b = i10;
        this.f2033c = j10;
    }

    @Override
    public final void run() {
        switch (this.f2031a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    long j10 = this.f2033c;
                    if (j10 >= 0) {
                        U.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f2032b;
                    long j11 = -j10;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)))) {
                        U.presentFragment(new zv0(j11));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j11);
                    bundle.putInt("type", 3);
                    jr jrVar = new jr(bundle);
                    jrVar.x0(MessagesController.getInstance(i10).getChatFull(j11));
                    U.presentFragment(jrVar);
                    return;
                }
                return;
            case 1:
                SendMessagesHelper.getInstance(this.f2032b).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f2033c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 2:
                int i11 = this.f2032b;
                long j12 = this.f2033c;
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
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(sn.V9(this.f2032b, this.f2033c));
                    return;
                }
                return;
        }
    }

    public pa(long j10, int i10, int i11) {
        this.f2031a = i11;
        this.f2033c = j10;
        this.f2032b = i10;
    }
}
