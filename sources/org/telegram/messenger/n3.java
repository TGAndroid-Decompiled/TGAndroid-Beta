package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class n3 implements Runnable {
    public final int f19020a = 0;
    public final int f19021b;
    public final long f19022c;
    public final int d;
    public final int e;
    public final Object f19023f;
    public final Serializable h;

    public n3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f19023f = filePathDatabase;
        this.f19022c = j10;
        this.f19021b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f19020a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f19023f).lambda$putPath$1(this.f19022c, this.f19021b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f19023f).lambda$updateRepliesCount$194(this.f19021b, this.f19022c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public n3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f19023f = messagesStorage;
        this.f19021b = i10;
        this.f19022c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
