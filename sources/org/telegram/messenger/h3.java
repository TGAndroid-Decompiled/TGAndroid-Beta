package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f17831a = 0;
    public final int f17832b;
    public final long f17833c;
    public final int d;
    public final int f17834e;
    public final Object f17835f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f17835f = filePathDatabase;
        this.f17833c = j3;
        this.f17832b = i10;
        this.d = i11;
        this.h = str;
        this.f17834e = i12;
    }

    @Override
    public final void run() {
        switch (this.f17831a) {
            case 0:
                int i10 = this.f17834e;
                FilePathDatabase.a((FilePathDatabase) this.f17835f, this.f17833c, this.f17832b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f17834e;
                ((MessagesStorage) this.f17835f).lambda$updateRepliesCount$194(this.f17832b, this.f17833c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f17835f = messagesStorage;
        this.f17832b = i10;
        this.f17833c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f17834e = i12;
    }
}
