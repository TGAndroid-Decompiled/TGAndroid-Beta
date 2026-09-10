package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class m3 implements Runnable {
    public final int f15749a = 0;
    public final int f15750b;
    public final long f15751c;
    public final int d;
    public final int e;
    public final Object f15752f;
    public final Serializable h;

    public m3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f15752f = filePathDatabase;
        this.f15751c = j3;
        this.f15750b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f15749a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f15752f).lambda$putPath$1(this.f15751c, this.f15750b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f15752f).lambda$updateRepliesCount$194(this.f15750b, this.f15751c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public m3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f15752f = messagesStorage;
        this.f15750b = i10;
        this.f15751c = j3;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
