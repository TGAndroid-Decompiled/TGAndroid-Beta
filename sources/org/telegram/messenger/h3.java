package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f18020a = 0;
    public final int f18021b;
    public final long f18022c;
    public final int d;
    public final int f18023e;
    public final Object f18024f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f18024f = filePathDatabase;
        this.f18022c = j3;
        this.f18021b = i10;
        this.d = i11;
        this.h = str;
        this.f18023e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18020a) {
            case 0:
                int i10 = this.f18023e;
                ((FilePathDatabase) this.f18024f).lambda$putPath$1(this.f18022c, this.f18021b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18023e;
                ((MessagesStorage) this.f18024f).lambda$updateRepliesCount$194(this.f18021b, this.f18022c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f18024f = messagesStorage;
        this.f18021b = i10;
        this.f18022c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f18023e = i12;
    }
}
