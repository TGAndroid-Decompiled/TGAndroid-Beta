package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class i3 implements Runnable {
    public final int f18114a = 0;
    public final int f18115b;
    public final long f18116c;
    public final int d;
    public final int f18117e;
    public final Object f18118f;
    public final Serializable h;

    public i3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f18118f = filePathDatabase;
        this.f18116c = j3;
        this.f18115b = i10;
        this.d = i11;
        this.h = str;
        this.f18117e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18114a) {
            case 0:
                int i10 = this.f18117e;
                ((FilePathDatabase) this.f18118f).lambda$putPath$1(this.f18116c, this.f18115b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18117e;
                ((MessagesStorage) this.f18118f).lambda$updateRepliesCount$194(this.f18115b, this.f18116c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public i3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f18118f = messagesStorage;
        this.f18115b = i10;
        this.f18116c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f18117e = i12;
    }
}
