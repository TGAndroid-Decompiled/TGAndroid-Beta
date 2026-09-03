package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class i3 implements Runnable {
    public final int f17426a = 0;
    public final int f17427b;
    public final long f17428c;
    public final int d;
    public final int e;
    public final Object f17429f;
    public final Serializable h;

    public i3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f17429f = filePathDatabase;
        this.f17428c = j10;
        this.f17427b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f17426a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f17429f).lambda$putPath$1(this.f17428c, this.f17427b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f17429f).lambda$updateRepliesCount$194(this.f17427b, this.f17428c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public i3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f17429f = messagesStorage;
        this.f17427b = i10;
        this.f17428c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
