package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;

public final class FilePathDatabase$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final long f$1;
    public final int f$2;
    public final int f$3;
    public final Serializable f$4;
    public final int f$5;

    public FilePathDatabase$$ExternalSyntheticLambda2(FilePathDatabase filePathDatabase, long j, int i, int i2, String str, int i3) {
        this.f$0 = filePathDatabase;
        this.f$1 = j;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = str;
        this.f$5 = i3;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((FilePathDatabase) this.f$0).lambda$putPath$1(this.f$1, this.f$2, this.f$3, (String) this.f$4, this.f$5);
                break;
            default:
                ((MessagesStorage) this.f$0).lambda$updateRepliesCount$194(this.f$2, this.f$1, this.f$3, (ArrayList) this.f$4, this.f$5);
                break;
        }
    }

    public FilePathDatabase$$ExternalSyntheticLambda2(MessagesStorage messagesStorage, int i, long j, int i2, ArrayList arrayList, int i3) {
        this.f$0 = messagesStorage;
        this.f$2 = i;
        this.f$1 = j;
        this.f$3 = i2;
        this.f$4 = arrayList;
        this.f$5 = i3;
    }
}
