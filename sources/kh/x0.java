package kh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;
public final class x0 implements Runnable {
    public final int f16334a;
    public final MessagesStorage f16335b;
    public final ArrayList f16336c;

    public x0(int i9, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f16334a = i9;
        this.f16335b = messagesStorage;
        this.f16336c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16334a) {
            case 0:
                MessagesStorage messagesStorage = this.f16335b;
                ArrayList arrayList = this.f16336c;
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    if (database != null) {
                        database.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                MessagesStorage messagesStorage2 = this.f16335b;
                ArrayList arrayList2 = this.f16336c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase database2 = messagesStorage2.getDatabase();
                        database2.executeFast("DELETE FROM business_links").stepThis().dispose();
                        sQLitePreparedStatement = database2.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList2.get(i9);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                            tL_businessChatLink.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, i9);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            default:
                MessagesStorage messagesStorage3 = this.f16335b;
                ArrayList arrayList3 = this.f16336c;
                try {
                    SQLiteDatabase database3 = messagesStorage3.getDatabase();
                    String join = TextUtils.join(", ", arrayList3);
                    database3.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
        }
    }
}
