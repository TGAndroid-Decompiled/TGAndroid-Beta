package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f17849a = 0;
    public final int f17850b;
    public final long f17851c;
    public final int d;
    public final int f17852e;
    public final Object f17853f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f17853f = filePathDatabase;
        this.f17851c = j3;
        this.f17850b = i10;
        this.d = i11;
        this.h = str;
        this.f17852e = i12;
    }

    @Override
    public final void run() {
        switch (this.f17849a) {
            case 0:
                int i10 = this.f17852e;
                FilePathDatabase.a((FilePathDatabase) this.f17853f, this.f17851c, this.f17850b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f17852e;
                ((MessagesStorage) this.f17853f).lambda$updateRepliesCount$194(this.f17850b, this.f17851c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f17853f = messagesStorage;
        this.f17850b = i10;
        this.f17851c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f17852e = i12;
    }
}
