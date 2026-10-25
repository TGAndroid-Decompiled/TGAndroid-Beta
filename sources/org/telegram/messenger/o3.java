package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class o3 implements Runnable {
    public final int f20826a = 0;
    public final int f20827b;
    public final long f20828c;
    public final int d;
    public final int e;
    public final Object f20829f;
    public final Serializable h;

    public o3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f20829f = filePathDatabase;
        this.f20828c = j10;
        this.f20827b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f20826a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f20829f).lambda$putPath$1(this.f20828c, this.f20827b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f20829f).lambda$updateRepliesCount$197(this.f20827b, this.f20828c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public o3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f20829f = messagesStorage;
        this.f20827b = i10;
        this.f20828c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
