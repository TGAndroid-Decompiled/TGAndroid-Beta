package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class i3 implements Runnable {
    public final int f17445a = 0;
    public final int f17446b;
    public final long f17447c;
    public final int d;
    public final int e;
    public final Object f17448f;
    public final Serializable h;

    public i3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f17448f = filePathDatabase;
        this.f17447c = j10;
        this.f17446b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f17445a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f17448f).lambda$putPath$1(this.f17447c, this.f17446b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f17448f).lambda$updateRepliesCount$194(this.f17446b, this.f17447c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public i3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f17448f = messagesStorage;
        this.f17446b = i10;
        this.f17447c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
