package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class i3 implements Runnable {
    public final int f18118a = 0;
    public final int f18119b;
    public final long f18120c;
    public final int d;
    public final int f18121e;
    public final Object f18122f;
    public final Serializable h;

    public i3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f18122f = filePathDatabase;
        this.f18120c = j3;
        this.f18119b = i10;
        this.d = i11;
        this.h = str;
        this.f18121e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18118a) {
            case 0:
                int i10 = this.f18121e;
                ((FilePathDatabase) this.f18122f).lambda$putPath$1(this.f18120c, this.f18119b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18121e;
                ((MessagesStorage) this.f18122f).lambda$updateRepliesCount$194(this.f18119b, this.f18120c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public i3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f18122f = messagesStorage;
        this.f18119b = i10;
        this.f18120c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f18121e = i12;
    }
}
