package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f19665a = 0;
    public final long f19666b;
    public final int f19667c;
    public final Object d;
    public final Object f19668e;
    public final Object f19669f;
    public final Object h;
    public final Object f19670n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19667c = i10;
        this.d = str;
        this.f19668e = inputFile;
        this.f19669f = inputEncryptedFile;
        this.h = bArr;
        this.f19670n = bArr2;
        this.f19666b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19665a) {
            case 0:
                long j3 = this.f19666b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19667c, (String) this.d, (TLRPC.InputFile) this.f19668e, (TLRPC.InputEncryptedFile) this.f19669f, (byte[]) this.h, (byte[]) this.f19670n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f19668e, (TLRPC.Chat) this.f19669f, (Runnable[]) this.h, this.f19666b, this.f19667c, (MessagesController.MessagesLoadedCallback) this.f19670n);
                return;
            default:
                ((MessagesController) this.f19668e).lambda$reloadWebPages$186((HashMap) this.f19669f, (String) this.d, (TLObject) this.h, (a0.i) this.f19670n, this.f19666b, this.f19667c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19668e = messagesController;
        this.f19669f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f19670n = iVar;
        this.f19666b = j3;
        this.f19667c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19668e = zArr;
        this.f19669f = chat;
        this.h = runnableArr;
        this.f19666b = j3;
        this.f19667c = i10;
        this.f19670n = messagesLoadedCallback;
    }
}
