package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f16525a = 0;
    public final int f16526b;
    public final long f16527c;
    public final int d;
    public final int e;
    public final Object f16528f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f16528f = filePathDatabase;
        this.f16527c = j3;
        this.f16526b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f16525a) {
            case 0:
                int i10 = this.e;
                FilePathDatabase.a((FilePathDatabase) this.f16528f, this.f16527c, this.f16526b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f16528f).lambda$updateRepliesCount$194(this.f16526b, this.f16527c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f16528f = messagesStorage;
        this.f16526b = i10;
        this.f16527c = j3;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
