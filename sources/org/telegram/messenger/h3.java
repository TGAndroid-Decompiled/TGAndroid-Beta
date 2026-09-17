package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f17876a = 0;
    public final int f17877b;
    public final long f17878c;
    public final int d;
    public final int f17879e;
    public final Object f17880f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f17880f = filePathDatabase;
        this.f17878c = j3;
        this.f17877b = i10;
        this.d = i11;
        this.h = str;
        this.f17879e = i12;
    }

    @Override
    public final void run() {
        switch (this.f17876a) {
            case 0:
                int i10 = this.f17879e;
                FilePathDatabase.a((FilePathDatabase) this.f17880f, this.f17878c, this.f17877b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f17879e;
                ((MessagesStorage) this.f17880f).lambda$updateRepliesCount$194(this.f17877b, this.f17878c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f17880f = messagesStorage;
        this.f17877b = i10;
        this.f17878c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f17879e = i12;
    }
}
