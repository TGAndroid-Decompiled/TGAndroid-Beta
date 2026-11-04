package gi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.qr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;
public final class x0 implements Runnable {
    public final int f13812a;
    public final qr f13813b;
    public final ArrayList f13814c;

    public x0(qr qrVar, ArrayList arrayList, int i3) {
        this.f13812a = i3;
        this.f13813b = qrVar;
        this.f13814c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f13812a) {
            case 0:
                qr qrVar = this.f13813b;
                ArrayList arrayList = this.f13814c;
                try {
                    SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
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
                qr qrVar2 = this.f13813b;
                ArrayList arrayList2 = this.f13814c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = qrVar2.f24936b;
                        sQLiteDatabase2.executeFast("DELETE FROM business_links").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList2.get(i3);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                            tL_businessChatLink.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, i3);
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
                qr qrVar3 = this.f13813b;
                ArrayList arrayList3 = this.f13814c;
                try {
                    SQLiteDatabase sQLiteDatabase3 = qrVar3.f24936b;
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
