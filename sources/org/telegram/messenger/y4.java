package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f18176a = 0;
    public final long f18177b;
    public final int f18178c;
    public final Object d;
    public final Object e;
    public final Object f18179f;
    public final Object h;
    public final Object f18180n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f18178c = i10;
        this.d = str;
        this.e = inputFile;
        this.f18179f = inputEncryptedFile;
        this.h = bArr;
        this.f18180n = bArr2;
        this.f18177b = j3;
    }

    @Override
    public final void run() {
        switch (this.f18176a) {
            case 0:
                long j3 = this.f18177b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18178c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f18179f, (byte[]) this.h, (byte[]) this.f18180n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.e, (TLRPC.Chat) this.f18179f, (Runnable[]) this.h, this.f18177b, this.f18178c, (MessagesController.MessagesLoadedCallback) this.f18180n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$186((HashMap) this.f18179f, (String) this.d, (TLObject) this.h, (a0.i) this.f18180n, this.f18177b, this.f18178c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.e = messagesController;
        this.f18179f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18180n = iVar;
        this.f18177b = j3;
        this.f18178c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f18179f = chat;
        this.h = runnableArr;
        this.f18177b = j3;
        this.f18178c = i10;
        this.f18180n = messagesLoadedCallback;
    }
}
