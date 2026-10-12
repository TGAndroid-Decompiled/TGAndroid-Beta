package fi;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.fo;
import org.telegram.ui.yr;
import org.telegram.ui.zw0;
public final class a2 implements Runnable {
    public final int f9161a;
    public final int f9162b;
    public final long f9163c;

    public a2(int i10, long j10, int i11) {
        this.f9161a = i11;
        this.f9162b = i10;
        this.f9163c = j10;
    }

    @Override
    public final void run() {
        switch (this.f9161a) {
            case 0:
                SendMessagesHelper.getInstance(this.f9162b).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f9163c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 1:
                int i10 = this.f9162b;
                long j10 = this.f9163c;
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i10).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j10);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 2:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(fo.V9(this.f9162b, this.f9163c));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    long j11 = this.f9163c;
                    if (j11 >= 0) {
                        U2.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i11 = this.f9162b;
                    long j12 = -j11;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i11).getChat(Long.valueOf(j12)))) {
                        U2.presentFragment(new zw0(j12));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j12);
                    bundle.putInt("type", 3);
                    yr yrVar = new yr(bundle);
                    yrVar.x0(MessagesController.getInstance(i11).getChatFull(j12));
                    U2.presentFragment(yrVar);
                    return;
                }
                return;
        }
    }

    public a2(long j10, int i10, int i11) {
        this.f9161a = i11;
        this.f9163c = j10;
        this.f9162b = i10;
    }
}
