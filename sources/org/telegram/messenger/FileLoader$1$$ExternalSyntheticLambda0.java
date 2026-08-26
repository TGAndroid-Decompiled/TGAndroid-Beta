package org.telegram.messenger;

import java.util.ArrayList;

public final class FileLoader$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final boolean f$3;

    public FileLoader$1$$ExternalSyntheticLambda0(FileLoader.AnonymousClass1 anonymousClass1, boolean z, String str, boolean z2) {
        this.$r8$classId = 0;
        this.f$0 = anonymousClass1;
        this.f$1 = z;
        this.f$2 = str;
        this.f$3 = z2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f$0).lambda$didFailedUploadingFile$1(this.f$1, (String) this.f$2, this.f$3);
                break;
            case 1:
                ((MessagesStorage) this.f$0).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f$2, this.f$1, this.f$3);
                break;
            default:
                ((MessagesStorage) this.f$0).lambda$updateUsers$215((ArrayList) this.f$2, this.f$1, this.f$3);
                break;
        }
    }

    public FileLoader$1$$ExternalSyntheticLambda0(MessagesStorage messagesStorage, Object obj, boolean z, boolean z2, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$2 = obj;
        this.f$1 = z;
        this.f$3 = z2;
    }
}
