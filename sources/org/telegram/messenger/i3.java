package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class i3 implements Runnable {
    public final int f18919a = 0;
    public final int f18920b;
    public final long f18921c;
    public final int d;
    public final int f18922e;
    public final Object f18923f;
    public final Serializable h;

    public i3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f18923f = filePathDatabase;
        this.f18921c = j10;
        this.f18920b = i10;
        this.d = i11;
        this.h = str;
        this.f18922e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18919a) {
            case 0:
                int i10 = this.f18922e;
                ((FilePathDatabase) this.f18923f).lambda$putPath$1(this.f18921c, this.f18920b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18922e;
                ((MessagesStorage) this.f18923f).lambda$updateRepliesCount$194(this.f18920b, this.f18921c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public i3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f18923f = messagesStorage;
        this.f18920b = i10;
        this.f18921c = j10;
        this.d = i11;
        this.h = arrayList;
        this.f18922e = i12;
    }
}
