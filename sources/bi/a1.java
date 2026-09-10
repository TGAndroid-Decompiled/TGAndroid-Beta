package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;
public final class a1 implements Runnable {
    public final int f2299a;
    public final MessagesStorage f2300b;
    public final ArrayList f2301c;

    public a1(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f2299a = i10;
        this.f2300b = messagesStorage;
        this.f2301c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f2299a) {
            case 0:
                MessagesStorage messagesStorage = this.f2300b;
                ArrayList arrayList = this.f2301c;
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    if (database != null) {
                        database.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                MessagesStorage messagesStorage2 = this.f2300b;
                ArrayList arrayList2 = this.f2301c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase database2 = messagesStorage2.getDatabase();
                        database2.executeFast("DELETE FROM business_links").stepThis().dispose();
                        sQLitePreparedStatement = database2.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList2.get(i10);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                            tL_businessChatLink.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, i10);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            default:
                MessagesStorage messagesStorage3 = this.f2300b;
                ArrayList arrayList3 = this.f2301c;
                try {
                    SQLiteDatabase database3 = messagesStorage3.getDatabase();
                    String join = TextUtils.join(", ", arrayList3);
                    database3.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
