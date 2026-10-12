package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class l3 implements Runnable {
    public final int f17742a = 0;
    public final int f17743b;
    public final long f17744c;
    public final int d;
    public final int e;
    public final Object f17745f;
    public final Serializable h;

    public l3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f17745f = filePathDatabase;
        this.f17744c = j10;
        this.f17743b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f17742a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f17745f).lambda$putPath$1(this.f17744c, this.f17743b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f17745f).lambda$updateRepliesCount$194(this.f17743b, this.f17744c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public l3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f17745f = messagesStorage;
        this.f17743b = i10;
        this.f17744c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
