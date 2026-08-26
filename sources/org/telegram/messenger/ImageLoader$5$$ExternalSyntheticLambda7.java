package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ImageLoader$5$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId = 0;
    public final int f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final long f$6;

    public ImageLoader$5$$ExternalSyntheticLambda7(int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
        this.f$0 = i;
        this.f$1 = str;
        this.f$2 = inputFile;
        this.f$3 = inputEncryptedFile;
        this.f$4 = bArr;
        this.f$5 = bArr2;
        this.f$6 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f$0, (String) this.f$1, (TLRPC.InputFile) this.f$2, (TLRPC.InputEncryptedFile) this.f$3, (byte[]) this.f$4, (byte[]) this.f$5, this.f$6);
                break;
            case 1:
                ((MessagesController) this.f$1).lambda$ensureMessagesLoaded$459((boolean[]) this.f$2, (TLRPC.Chat) this.f$3, (Runnable[]) this.f$4, this.f$6, this.f$0, (MessagesController.MessagesLoadedCallback) this.f$5);
                break;
            default:
                ((MessagesController) this.f$2).lambda$reloadWebPages$186((HashMap) this.f$3, (String) this.f$1, (TLObject) this.f$4, (LongSparseArray) this.f$5, this.f$6, this.f$0);
                break;
        }
    }

    public ImageLoader$5$$ExternalSyntheticLambda7(MessagesController messagesController, HashMap map, String str, TLObject tLObject, LongSparseArray longSparseArray, long j, int i) {
        this.f$2 = messagesController;
        this.f$3 = map;
        this.f$1 = str;
        this.f$4 = tLObject;
        this.f$5 = longSparseArray;
        this.f$6 = j;
        this.f$0 = i;
    }

    public ImageLoader$5$$ExternalSyntheticLambda7(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j, int i, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f$1 = messagesController;
        this.f$2 = zArr;
        this.f$3 = chat;
        this.f$4 = runnableArr;
        this.f$6 = j;
        this.f$0 = i;
        this.f$5 = messagesLoadedCallback;
    }
}
