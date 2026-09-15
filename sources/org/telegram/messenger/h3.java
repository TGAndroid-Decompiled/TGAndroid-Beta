package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f16285a = 0;
    public final int f16286b;
    public final long f16287c;
    public final int d;
    public final int e;
    public final Object f16288f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f16288f = filePathDatabase;
        this.f16287c = j3;
        this.f16286b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f16285a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f16288f).lambda$putPath$1(this.f16287c, this.f16286b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f16288f).lambda$updateRepliesCount$194(this.f16286b, this.f16287c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f16288f = messagesStorage;
        this.f16286b = i10;
        this.f16287c = j3;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
