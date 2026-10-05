package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f18019a = 0;
    public final int f18020b;
    public final long f18021c;
    public final int d;
    public final int f18022e;
    public final Object f18023f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f18023f = filePathDatabase;
        this.f18021c = j3;
        this.f18020b = i10;
        this.d = i11;
        this.h = str;
        this.f18022e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18019a) {
            case 0:
                int i10 = this.f18022e;
                ((FilePathDatabase) this.f18023f).lambda$putPath$1(this.f18021c, this.f18020b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18022e;
                ((MessagesStorage) this.f18023f).lambda$updateRepliesCount$194(this.f18020b, this.f18021c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f18023f = messagesStorage;
        this.f18020b = i10;
        this.f18021c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f18022e = i12;
    }
}
