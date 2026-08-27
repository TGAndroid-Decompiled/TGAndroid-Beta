package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;

public final class i3 implements Runnable {

    public final int f20545a = 0;

    public final int f20546b;

    public final long f20547c;
    public final int d;

    public final int f20548e;

    public final Object f20549f;
    public final Serializable h;

    public i3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f20549f = filePathDatabase;
        this.f20547c = j10;
        this.f20546b = i10;
        this.d = i11;
        this.h = str;
        this.f20548e = i12;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20545a) {
            case 0:
                ((FilePathDatabase) this.f20549f).lambda$putPath$1(this.f20547c, this.f20546b, this.d, (String) this.h, this.f20548e);
                break;
            default:
                ((MessagesStorage) this.f20549f).lambda$updateRepliesCount$194(this.f20546b, this.f20547c, this.d, (ArrayList) this.h, this.f20548e);
                break;
        }
    }

    public i3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f20549f = messagesStorage;
        this.f20546b = i10;
        this.f20547c = j10;
        this.d = i11;
        this.h = arrayList;
        this.f20548e = i12;
    }
}
