package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class l3 implements Runnable {
    public final int f18837a = 0;
    public final int f18838b;
    public final long f18839c;
    public final int d;
    public final int e;
    public final Object f18840f;
    public final Serializable h;

    public l3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f18840f = filePathDatabase;
        this.f18839c = j10;
        this.f18838b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18837a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f18840f).lambda$putPath$1(this.f18839c, this.f18838b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f18840f).lambda$updateRepliesCount$194(this.f18838b, this.f18839c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public l3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f18840f = messagesStorage;
        this.f18838b = i10;
        this.f18839c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
