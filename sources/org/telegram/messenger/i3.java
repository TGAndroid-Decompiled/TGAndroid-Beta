package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class i3 implements Runnable {
    public final int f18119a = 0;
    public final int f18120b;
    public final long f18121c;
    public final int d;
    public final int f18122e;
    public final Object f18123f;
    public final Serializable h;

    public i3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f18123f = filePathDatabase;
        this.f18121c = j3;
        this.f18120b = i10;
        this.d = i11;
        this.h = str;
        this.f18122e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18119a) {
            case 0:
                int i10 = this.f18122e;
                ((FilePathDatabase) this.f18123f).lambda$putPath$1(this.f18121c, this.f18120b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18122e;
                ((MessagesStorage) this.f18123f).lambda$updateRepliesCount$194(this.f18120b, this.f18121c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public i3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f18123f = messagesStorage;
        this.f18120b = i10;
        this.f18121c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f18122e = i12;
    }
}
