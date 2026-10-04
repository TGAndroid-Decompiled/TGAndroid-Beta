package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f18021a = 0;
    public final int f18022b;
    public final long f18023c;
    public final int d;
    public final int f18024e;
    public final Object f18025f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f18025f = filePathDatabase;
        this.f18023c = j3;
        this.f18022b = i10;
        this.d = i11;
        this.h = str;
        this.f18024e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18021a) {
            case 0:
                int i10 = this.f18024e;
                ((FilePathDatabase) this.f18025f).lambda$putPath$1(this.f18023c, this.f18022b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18024e;
                ((MessagesStorage) this.f18025f).lambda$updateRepliesCount$194(this.f18022b, this.f18023c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f18025f = messagesStorage;
        this.f18022b = i10;
        this.f18023c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f18024e = i12;
    }
}
