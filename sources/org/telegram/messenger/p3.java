package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class p3 implements Runnable {
    public final int f20914a = 0;
    public final int f20915b;
    public final long f20916c;
    public final int d;
    public final int e;
    public final Object f20917f;
    public final Serializable h;

    public p3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f20917f = filePathDatabase;
        this.f20916c = j10;
        this.f20915b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f20914a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f20917f).lambda$putPath$1(this.f20916c, this.f20915b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f20917f).lambda$updateRepliesCount$198(this.f20915b, this.f20916c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public p3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f20917f = messagesStorage;
        this.f20915b = i10;
        this.f20916c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
