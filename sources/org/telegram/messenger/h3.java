package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f20403a = 0;
    public final int f20404b;
    public final long f20405c;
    public final int d;
    public final int f20406e;
    public final Object f20407f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f20407f = filePathDatabase;
        this.f20405c = j10;
        this.f20404b = i10;
        this.d = i11;
        this.h = str;
        this.f20406e = i12;
    }

    @Override
    public final void run() {
        switch (this.f20403a) {
            case 0:
                int i10 = this.f20406e;
                ((FilePathDatabase) this.f20407f).lambda$putPath$1(this.f20405c, this.f20404b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f20406e;
                ((MessagesStorage) this.f20407f).lambda$updateRepliesCount$194(this.f20404b, this.f20405c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f20407f = messagesStorage;
        this.f20404b = i10;
        this.f20405c = j10;
        this.d = i11;
        this.h = arrayList;
        this.f20406e = i12;
    }
}
