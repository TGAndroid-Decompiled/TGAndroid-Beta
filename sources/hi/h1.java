package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.tr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;
public final class h1 implements Runnable {
    public final int f14572a;
    public final tr f14573b;
    public final ArrayList f14574c;

    public h1(tr trVar, ArrayList arrayList, int i7) {
        this.f14572a = i7;
        this.f14573b = trVar;
        this.f14574c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f14572a) {
            case 0:
                tr trVar = this.f14573b;
                ArrayList arrayList = this.f14574c;
                try {
                    SQLiteDatabase sQLiteDatabase = trVar.f27151b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                tr trVar2 = this.f14573b;
                ArrayList arrayList2 = this.f14574c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = trVar2.f27151b;
                        sQLiteDatabase2.executeFast("DELETE FROM business_links").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList2.get(i7);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                            tL_businessChatLink.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, i7);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
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
                tr trVar3 = this.f14573b;
                ArrayList arrayList3 = this.f14574c;
                try {
                    SQLiteDatabase sQLiteDatabase3 = trVar3.f27151b;
                    String join = TextUtils.join(", ", arrayList3);
                    sQLiteDatabase3.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
