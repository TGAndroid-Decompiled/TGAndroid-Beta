package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class i3 implements Runnable {
    public final int f18155a = 0;
    public final int f18156b;
    public final long f18157c;
    public final int d;
    public final int f18158e;
    public final Object f18159f;
    public final Serializable h;

    public i3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f18159f = filePathDatabase;
        this.f18157c = j3;
        this.f18156b = i10;
        this.d = i11;
        this.h = str;
        this.f18158e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18155a) {
            case 0:
                int i10 = this.f18158e;
                ((FilePathDatabase) this.f18159f).lambda$putPath$1(this.f18157c, this.f18156b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18158e;
                ((MessagesStorage) this.f18159f).lambda$updateRepliesCount$194(this.f18156b, this.f18157c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public i3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f18159f = messagesStorage;
        this.f18156b = i10;
        this.f18157c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f18158e = i12;
    }
}
