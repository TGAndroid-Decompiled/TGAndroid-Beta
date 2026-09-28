package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f16526a = 0;
    public final int f16527b;
    public final long f16528c;
    public final int d;
    public final int e;
    public final Object f16529f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f16529f = filePathDatabase;
        this.f16528c = j3;
        this.f16527b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f16526a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f16529f).lambda$putPath$1(this.f16528c, this.f16527b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f16529f).lambda$updateRepliesCount$194(this.f16527b, this.f16528c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f16529f = messagesStorage;
        this.f16527b = i10;
        this.f16528c = j3;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
