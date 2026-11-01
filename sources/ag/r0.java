package ag;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;
public final class r0 implements Runnable {
    public final int f693a;
    public final is f694b;
    public final ArrayList f695c;

    public r0(is isVar, ArrayList arrayList, int i10) {
        this.f693a = i10;
        this.f694b = isVar;
        this.f695c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f693a) {
            case 0:
                is isVar = this.f694b;
                ArrayList arrayList = this.f695c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                        sQLiteDatabase.executeFast("DELETE FROM business_links").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i10);
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
                    } catch (Exception e) {
                        f8.g(e, true);
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
            case 1:
                is isVar2 = this.f694b;
                ArrayList arrayList2 = this.f695c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = isVar2.f16333b;
                    String join = TextUtils.join(", ", arrayList2);
                    sQLiteDatabase2.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            default:
                is isVar3 = this.f694b;
                ArrayList arrayList3 = this.f695c;
                try {
                    SQLiteDatabase sQLiteDatabase3 = isVar3.f16333b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList3) + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
        }
    }
}
