package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class l3 implements Runnable {
    public final int f18136a = 0;
    public final int f18137b;
    public final long f18138c;
    public final int d;
    public final int f18139e;
    public final Object f18140f;
    public final Serializable h;

    public l3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f18140f = filePathDatabase;
        this.f18138c = j3;
        this.f18137b = i10;
        this.d = i11;
        this.h = str;
        this.f18139e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18136a) {
            case 0:
                int i10 = this.f18139e;
                ((FilePathDatabase) this.f18140f).lambda$putPath$1(this.f18138c, this.f18137b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18139e;
                ((MessagesStorage) this.f18140f).lambda$updateRepliesCount$194(this.f18137b, this.f18138c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public l3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f18140f = messagesStorage;
        this.f18137b = i10;
        this.f18138c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f18139e = i12;
    }
}
