package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class n3 implements Runnable {
    public final int f19009a = 0;
    public final int f19010b;
    public final long f19011c;
    public final int d;
    public final int e;
    public final Object f19012f;
    public final Serializable h;

    public n3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f19012f = filePathDatabase;
        this.f19011c = j10;
        this.f19010b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        switch (this.f19009a) {
            case 0:
                int i10 = this.e;
                ((FilePathDatabase) this.f19012f).lambda$putPath$1(this.f19011c, this.f19010b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.e;
                ((MessagesStorage) this.f19012f).lambda$updateRepliesCount$194(this.f19010b, this.f19011c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public n3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f19012f = messagesStorage;
        this.f19010b = i10;
        this.f19011c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
