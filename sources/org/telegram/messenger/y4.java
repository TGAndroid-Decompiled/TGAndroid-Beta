package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f18170a = 0;
    public final long f18171b;
    public final int f18172c;
    public final Object d;
    public final Object e;
    public final Object f18173f;
    public final Object h;
    public final Object f18174n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f18172c = i10;
        this.d = str;
        this.e = inputFile;
        this.f18173f = inputEncryptedFile;
        this.h = bArr;
        this.f18174n = bArr2;
        this.f18171b = j3;
    }

    @Override
    public final void run() {
        switch (this.f18170a) {
            case 0:
                long j3 = this.f18171b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18172c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f18173f, (byte[]) this.h, (byte[]) this.f18174n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.e, (TLRPC.Chat) this.f18173f, (Runnable[]) this.h, this.f18171b, this.f18172c, (MessagesController.MessagesLoadedCallback) this.f18174n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$186((HashMap) this.f18173f, (String) this.d, (TLObject) this.h, (a0.i) this.f18174n, this.f18171b, this.f18172c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.e = messagesController;
        this.f18173f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18174n = iVar;
        this.f18171b = j3;
        this.f18172c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f18173f = chat;
        this.h = runnableArr;
        this.f18171b = j3;
        this.f18172c = i10;
        this.f18174n = messagesLoadedCallback;
    }
}
