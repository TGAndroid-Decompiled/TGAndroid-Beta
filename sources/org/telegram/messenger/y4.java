package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f17932a = 0;
    public final long f17933b;
    public final int f17934c;
    public final Object d;
    public final Object e;
    public final Object f17935f;
    public final Object h;
    public final Object f17936n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f17934c = i10;
        this.d = str;
        this.e = inputFile;
        this.f17935f = inputEncryptedFile;
        this.h = bArr;
        this.f17936n = bArr2;
        this.f17933b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17932a) {
            case 0:
                long j3 = this.f17933b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f17934c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f17935f, (byte[]) this.h, (byte[]) this.f17936n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.e, (TLRPC.Chat) this.f17935f, (Runnable[]) this.h, this.f17933b, this.f17934c, (MessagesController.MessagesLoadedCallback) this.f17936n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$186((HashMap) this.f17935f, (String) this.d, (TLObject) this.h, (a0.i) this.f17936n, this.f17933b, this.f17934c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.e = messagesController;
        this.f17935f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f17936n = iVar;
        this.f17933b = j3;
        this.f17934c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f17935f = chat;
        this.h = runnableArr;
        this.f17933b = j3;
        this.f17934c = i10;
        this.f17936n = messagesLoadedCallback;
    }
}
