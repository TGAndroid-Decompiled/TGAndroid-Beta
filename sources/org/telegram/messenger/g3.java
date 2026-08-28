package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class g3 implements Runnable {
    public final int f20350a = 0;
    public final int f20351b;
    public final long f20352c;
    public final int d;
    public final int f20353e;
    public final Object f20354f;
    public final Serializable h;

    public g3(FilePathDatabase filePathDatabase, long j10, int i9, int i10, String str, int i11) {
        this.f20354f = filePathDatabase;
        this.f20352c = j10;
        this.f20351b = i9;
        this.d = i10;
        this.h = str;
        this.f20353e = i11;
    }

    @Override
    public final void run() {
        switch (this.f20350a) {
            case 0:
                int i9 = this.f20353e;
                ((FilePathDatabase) this.f20354f).lambda$putPath$1(this.f20352c, this.f20351b, this.d, (String) this.h, i9);
                return;
            default:
                int i10 = this.f20353e;
                ((MessagesStorage) this.f20354f).lambda$updateRepliesCount$194(this.f20351b, this.f20352c, this.d, (ArrayList) this.h, i10);
                return;
        }
    }

    public g3(MessagesStorage messagesStorage, int i9, long j10, int i10, ArrayList arrayList, int i11) {
        this.f20354f = messagesStorage;
        this.f20351b = i9;
        this.f20352c = j10;
        this.d = i10;
        this.h = arrayList;
        this.f20353e = i11;
    }
}
