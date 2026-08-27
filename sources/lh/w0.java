package lh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

public final class w0 implements Runnable {

    public final int f16965a;

    public final MessagesStorage f16966b;

    public final ArrayList f16967c;

    public w0(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f16965a = i10;
        this.f16966b = messagesStorage;
        this.f16967c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16965a) {
            case 0:
                MessagesStorage messagesStorage = this.f16966b;
                ArrayList arrayList = this.f16967c;
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    if (database == null) {
                        return;
                    }
                    database.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 1:
                MessagesStorage messagesStorage2 = this.f16966b;
                ArrayList arrayList2 = this.f16967c;
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
                try {
                    SQLiteDatabase database2 = messagesStorage2.getDatabase();
                    database2.executeFast("DELETE FROM business_links").stepThis().dispose();
                    sQLitePreparedStatementExecuteFast = database2.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList2.get(i10);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                        tL_businessChatLink.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.requery();
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.bindInteger(2, i10);
                        sQLitePreparedStatementExecuteFast.step();
                    }
                    if (sQLitePreparedStatementExecuteFast == null) {
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    if (sQLitePreparedStatementExecuteFast == null) {
                        return;
                    }
                } finally {
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                }
                return;
            default:
                MessagesStorage messagesStorage3 = this.f16966b;
                ArrayList arrayList3 = this.f16967c;
                try {
                    messagesStorage3.getDatabase().executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + TextUtils.join(", ", arrayList3) + ")").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
