package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class m3 implements Runnable {
    public final int f18928a = 0;
    public final int f18929b;
    public final long f18930c;
    public final int d;
    public final int e;
    public final Object f18931f;
    public final Serializable h;

    public m3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f18931f = filePathDatabase;
        this.f18930c = j10;
        this.f18929b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f18928a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f18931f).lambda$putPath$1(this.f18930c, this.f18929b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f18931f).lambda$updateRepliesCount$194(this.f18929b, this.f18930c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public m3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f18931f = messagesStorage;
        this.f18929b = i10;
        this.f18930c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
