package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class uf implements Runnable {
    public final int f18416a = 0;
    public final int f18417b;
    public final boolean f18418c;
    public final boolean d;
    public final int e;
    public final f1 f18419f;
    public final Object h;

    public uf(vi viVar, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18419f = viVar;
        this.f18418c = z10;
        this.f18417b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f18416a;
        int i14 = 3;
        int i15 = this.e;
        boolean z10 = this.d;
        boolean z11 = this.f18418c;
        Object obj = this.h;
        int i16 = this.f18417b;
        f1 f1Var = this.f18419f;
        switch (i13) {
            case 0:
                vi viVar = (vi) f1Var;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    SQLiteDatabase sQLiteDatabase = viVar.getMessagesStorage().f16333b;
                    if (z11) {
                        i10 = viVar.getMessagesController().f19126f3;
                    } else {
                        if (i16 != 3 && i16 != 7) {
                            if (i16 == 2) {
                                i10 = viVar.getMessagesController().f19117e3;
                            } else {
                                i10 = viVar.getMessagesController().f19108d3;
                            }
                        }
                        i10 = 200;
                    }
                    sQLiteDatabase.beginTransaction();
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    int size = arrayList.size();
                    if (z11) {
                        i11 = 2;
                    } else if (i16 == 0) {
                        i11 = 3;
                    } else if (i16 == 1) {
                        i11 = 4;
                    } else if (i16 == 3) {
                        i11 = 6;
                    } else if (i16 == 5) {
                        i11 = 7;
                    } else if (i16 == 7) {
                        i11 = 8;
                    } else {
                        i11 = 5;
                    }
                    if (z10) {
                        sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i11).stepThis().dispose();
                    }
                    int i17 = 0;
                    while (i17 < size && i17 != i10) {
                        TLRPC.Document document = (TLRPC.Document) arrayList.get(i17);
                        executeFast.requery();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        int i18 = i15;
                        sb2.append(document.f19800id);
                        executeFast.bindString(1, sb2.toString());
                        executeFast.bindInteger(2, i11);
                        executeFast.bindString(i14, "");
                        executeFast.bindString(4, "");
                        executeFast.bindString(5, "");
                        executeFast.bindInteger(6, 0);
                        executeFast.bindInteger(7, 0);
                        executeFast.bindInteger(8, 0);
                        if (i18 != 0) {
                            i12 = i18;
                        } else {
                            i12 = size - i17;
                        }
                        executeFast.bindInteger(9, i12);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                        document.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(10, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        i17++;
                        i15 = i18;
                        i14 = 3;
                    }
                    executeFast.dispose();
                    sQLiteDatabase.commitTransaction();
                    if (!z10 && arrayList.size() >= i10) {
                        sQLiteDatabase.beginTransaction();
                        while (i10 < arrayList.size()) {
                            sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i10)).f19800id + "' AND type = " + i11).stepThis().dispose();
                            i10++;
                        }
                        sQLiteDatabase.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                ((wp) f1Var).getNotificationCenter().k(18, Integer.valueOf(i16), Integer.valueOf(((TLRPC.messages_Messages) obj).messages.size()), Boolean.valueOf(z11), Boolean.valueOf(z10), Integer.valueOf(i15));
                return;
        }
    }

    public uf(wp wpVar, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18419f = wpVar;
        this.f18417b = i10;
        this.h = messages_messages;
        this.f18418c = z10;
        this.d = z11;
        this.e = i11;
    }
}
