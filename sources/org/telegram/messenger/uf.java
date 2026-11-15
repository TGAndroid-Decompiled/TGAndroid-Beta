package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class uf implements Runnable {
    public final int f26808a = 1;
    public final int f26809b;
    public final boolean f26810c;
    public final boolean d;
    public final int f26811e;
    public final c1 f26812f;
    public final Object h;

    public uf(si siVar, boolean z10, int i7, ArrayList arrayList, boolean z11, int i10) {
        this.f26812f = siVar;
        this.f26810c = z10;
        this.f26809b = i7;
        this.h = arrayList;
        this.d = z11;
        this.f26811e = i10;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12 = this.f26808a;
        int i13 = 3;
        int i14 = this.f26811e;
        boolean z10 = this.d;
        boolean z11 = this.f26810c;
        Object obj = this.h;
        int i15 = this.f26809b;
        c1 c1Var = this.f26812f;
        switch (i12) {
            case 0:
                si siVar = (si) c1Var;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().f27222b;
                    if (z11) {
                        i7 = siVar.getMessagesController().f25285g3;
                    } else {
                        if (i15 != 3 && i15 != 7) {
                            if (i15 == 2) {
                                i7 = siVar.getMessagesController().f25276f3;
                            } else {
                                i7 = siVar.getMessagesController().f25266e3;
                            }
                        }
                        i7 = 200;
                    }
                    sQLiteDatabase.beginTransaction();
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    int size = arrayList.size();
                    if (z11) {
                        i10 = 2;
                    } else if (i15 == 0) {
                        i10 = 3;
                    } else if (i15 == 1) {
                        i10 = 4;
                    } else if (i15 == 3) {
                        i10 = 6;
                    } else if (i15 == 5) {
                        i10 = 7;
                    } else if (i15 == 7) {
                        i10 = 8;
                    } else {
                        i10 = 5;
                    }
                    if (z10) {
                        sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i10).stepThis().dispose();
                    }
                    int i16 = 0;
                    while (i16 < size && i16 != i7) {
                        TLRPC.Document document = (TLRPC.Document) arrayList.get(i16);
                        executeFast.requery();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        int i17 = i14;
                        sb2.append(document.f28057id);
                        executeFast.bindString(1, sb2.toString());
                        executeFast.bindInteger(2, i10);
                        executeFast.bindString(i13, "");
                        executeFast.bindString(4, "");
                        executeFast.bindString(5, "");
                        executeFast.bindInteger(6, 0);
                        executeFast.bindInteger(7, 0);
                        executeFast.bindInteger(8, 0);
                        if (i17 != 0) {
                            i11 = i17;
                        } else {
                            i11 = size - i16;
                        }
                        executeFast.bindInteger(9, i11);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                        document.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(10, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        i16++;
                        i14 = i17;
                        i13 = 3;
                    }
                    executeFast.dispose();
                    sQLiteDatabase.commitTransaction();
                    if (!z10 && arrayList.size() >= i7) {
                        sQLiteDatabase.beginTransaction();
                        while (i7 < arrayList.size()) {
                            sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i7)).f28057id + "' AND type = " + i10).stepThis().dispose();
                            i7++;
                        }
                        sQLiteDatabase.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ((np) c1Var).getNotificationCenter().k(18, Integer.valueOf(i15), Integer.valueOf(((TLRPC.messages_Messages) obj).messages.size()), Boolean.valueOf(z11), Boolean.valueOf(z10), Integer.valueOf(i14));
                return;
        }
    }

    public uf(np npVar, int i7, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i10) {
        this.f26812f = npVar;
        this.f26809b = i7;
        this.h = messages_messages;
        this.f26810c = z10;
        this.d = z11;
        this.f26811e = i10;
    }
}
