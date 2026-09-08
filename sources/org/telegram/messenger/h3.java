package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class h3 implements Runnable {
    public final int f17858a = 0;
    public final int f17859b;
    public final long f17860c;
    public final int d;
    public final int f17861e;
    public final Object f17862f;
    public final Serializable h;

    public h3(FilePathDatabase filePathDatabase, long j3, int i10, int i11, String str, int i12) {
        this.f17862f = filePathDatabase;
        this.f17860c = j3;
        this.f17859b = i10;
        this.d = i11;
        this.h = str;
        this.f17861e = i12;
    }

    @Override
    public final void run() {
        switch (this.f17858a) {
            case 0:
                int i10 = this.f17861e;
                FilePathDatabase.a((FilePathDatabase) this.f17862f, this.f17860c, this.f17859b, this.d, (String) this.h, i10);
                return;
            default:
                int i11 = this.f17861e;
                ((MessagesStorage) this.f17862f).lambda$updateRepliesCount$194(this.f17859b, this.f17860c, this.d, (ArrayList) this.h, i11);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, int i10, long j3, int i11, ArrayList arrayList, int i12) {
        this.f17862f = messagesStorage;
        this.f17859b = i10;
        this.f17860c = j3;
        this.d = i11;
        this.h = arrayList;
        this.f17861e = i12;
    }
}
