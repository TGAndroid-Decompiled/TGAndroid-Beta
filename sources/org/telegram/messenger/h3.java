package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f18014a = 0;
    public final int f18015b;
    public final long f18016c;
    public final int d;
    public final int f18017e;
    public final Object f18018f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f18018f = filePathDatabase;
        this.f18016c = j3;
        this.f18015b = i10;
        this.d = i11;
        this.h = str;
        this.f18017e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18014a) {
            case 0:
                int i10 = this.f18017e;
                ((FilePathDatabase) this.f18018f).lambda$putPath$1(this.f18016c, this.f18015b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f18017e;
                ((MessagesStorage) this.f18018f).lambda$updateRepliesCount$194(this.f18015b, this.f18016c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f18018f = messagesStorage;
        this.f18015b = i10;
        this.f18016c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f18017e = i12;
    }
}
