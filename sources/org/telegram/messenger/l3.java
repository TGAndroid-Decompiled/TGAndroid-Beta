package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class l3 implements Runnable {
    public final int f18838a = 0;
    public final int f18839b;
    public final long f18840c;
    public final int d;
    public final int e;
    public final Object f18841f;
    public final Serializable h;

    public l3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f18841f = filePathDatabase;
        this.f18840c = j10;
        this.f18839b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18838a) {
            case 0:
                int i10 = this.e;
                FilePathDatabase.a((FilePathDatabase) this.f18841f, this.f18840c, this.f18839b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f18841f).lambda$updateRepliesCount$194(this.f18839b, this.f18840c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public l3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f18841f = messagesStorage;
        this.f18839b = i10;
        this.f18840c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
