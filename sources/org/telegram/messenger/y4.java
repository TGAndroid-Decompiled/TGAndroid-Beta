package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f18196a = 0;
    public final long f18197b;
    public final int f18198c;
    public final Object d;
    public final Object e;
    public final Object f18199f;
    public final Object h;
    public final Object f18200n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f18198c = i10;
        this.d = str;
        this.e = inputFile;
        this.f18199f = inputEncryptedFile;
        this.h = bArr;
        this.f18200n = bArr2;
        this.f18197b = j3;
    }

    @Override
    public final void run() {
        switch (this.f18196a) {
            case 0:
                long j3 = this.f18197b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18198c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f18199f, (byte[]) this.h, (byte[]) this.f18200n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.e, (TLRPC.Chat) this.f18199f, (Runnable[]) this.h, this.f18197b, this.f18198c, (MessagesController.MessagesLoadedCallback) this.f18200n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$186((HashMap) this.f18199f, (String) this.d, (TLObject) this.h, (a0.i) this.f18200n, this.f18197b, this.f18198c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.e = messagesController;
        this.f18199f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18200n = iVar;
        this.f18197b = j3;
        this.f18198c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f18199f = chat;
        this.h = runnableArr;
        this.f18197b = j3;
        this.f18198c = i10;
        this.f18200n = messagesLoadedCallback;
    }
}
