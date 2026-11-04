package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f24368a = 1;
    public final int f24369b;
    public final boolean f24370c;
    public final boolean d;
    public final int f24371e;
    public final c1 f24372f;
    public final Object h;

    public nf(li liVar, boolean z10, int i3, ArrayList arrayList, boolean z11, int i10) {
        this.f24372f = liVar;
        this.f24370c = z10;
        this.f24369b = i3;
        this.h = arrayList;
        this.d = z11;
        this.f24371e = i10;
    }

    @Override
    public final void run() {
        int i3;
        int i10;
        int i11;
        int i12 = this.f24368a;
        int i13 = 3;
        int i14 = this.f24371e;
        boolean z10 = this.d;
        boolean z11 = this.f24370c;
        Object obj = this.h;
        int i15 = this.f24369b;
        c1 c1Var = this.f24372f;
        switch (i12) {
            case 0:
                li liVar = (li) c1Var;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().f24936b;
                    if (z11) {
                        i3 = liVar.getMessagesController().f23014g3;
                    } else {
                        if (i15 != 3 && i15 != 7) {
                            if (i15 == 2) {
                                i3 = liVar.getMessagesController().f23005f3;
                            } else {
                                i3 = liVar.getMessagesController().f22995e3;
                            }
                        }
                        i3 = 200;
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
                    while (i16 < size && i16 != i3) {
                        TLRPC.Document document = (TLRPC.Document) arrayList.get(i16);
                        executeFast.requery();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        int i17 = i14;
                        sb2.append(document.f27007id);
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
                    if (!z10 && arrayList.size() >= i3) {
                        sQLiteDatabase.beginTransaction();
                        while (i3 < arrayList.size()) {
                            sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i3)).f27007id + "' AND type = " + i10).stepThis().dispose();
                            i3++;
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
                ((hp) c1Var).getNotificationCenter().k(18, Integer.valueOf(i15), Integer.valueOf(((TLRPC.messages_Messages) obj).messages.size()), Boolean.valueOf(z11), Boolean.valueOf(z10), Integer.valueOf(i14));
                return;
        }
    }

    public nf(hp hpVar, int i3, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i10) {
        this.f24372f = hpVar;
        this.f24369b = i3;
        this.h = messages_messages;
        this.f24370c = z10;
        this.d = z11;
        this.f24371e = i10;
    }
}
