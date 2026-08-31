package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class i3 implements Runnable {
    public final int f18917a = 0;
    public final int f18918b;
    public final long f18919c;
    public final int d;
    public final int f18920e;
    public final Object f18921f;
    public final Serializable h;

    public i3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f18921f = filePathDatabase;
        this.f18919c = j10;
        this.f18918b = i10;
        this.d = i11;
        this.h = str;
        this.f18920e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18917a) {
            case 0:
                int i10 = this.f18920e;
                ((FilePathDatabase) this.f18921f).lambda$putPath$1(this.f18919c, this.f18918b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18920e;
                ((MessagesStorage) this.f18921f).lambda$updateRepliesCount$194(this.f18918b, this.f18919c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public i3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f18921f = messagesStorage;
        this.f18918b = i10;
        this.f18919c = j10;
        this.d = i11;
        this.h = arrayList;
        this.f18920e = i12;
    }
}
