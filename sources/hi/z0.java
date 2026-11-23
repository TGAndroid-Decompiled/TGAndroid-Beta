package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ur;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;
public final class z0 implements Runnable {
    public final int f15828a;
    public final ur f15829b;
    public final ArrayList f15830c;

    public z0(ur urVar, ArrayList arrayList, int i7) {
        this.f15828a = i7;
        this.f15829b = urVar;
        this.f15830c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15828a) {
            case 0:
                ur urVar = this.f15829b;
                ArrayList arrayList = this.f15830c;
                try {
                    SQLiteDatabase sQLiteDatabase = urVar.f27252b;
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
                ur urVar2 = this.f15829b;
                ArrayList arrayList2 = this.f15830c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = urVar2.f27252b;
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
                ur urVar3 = this.f15829b;
                ArrayList arrayList3 = this.f15830c;
                try {
                    SQLiteDatabase sQLiteDatabase3 = urVar3.f27252b;
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
