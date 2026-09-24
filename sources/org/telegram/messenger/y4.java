package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f18162a = 0;
    public final long f18163b;
    public final int f18164c;
    public final Object d;
    public final Object e;
    public final Object f18165f;
    public final Object h;
    public final Object f18166n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f18164c = i10;
        this.d = str;
        this.e = inputFile;
        this.f18165f = inputEncryptedFile;
        this.h = bArr;
        this.f18166n = bArr2;
        this.f18163b = j3;
    }

    @Override
    public final void run() {
        switch (this.f18162a) {
            case 0:
                long j3 = this.f18163b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18164c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f18165f, (byte[]) this.h, (byte[]) this.f18166n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.e, (TLRPC.Chat) this.f18165f, (Runnable[]) this.h, this.f18163b, this.f18164c, (MessagesController.MessagesLoadedCallback) this.f18166n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$186((HashMap) this.f18165f, (String) this.d, (TLObject) this.h, (a0.i) this.f18166n, this.f18163b, this.f18164c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.e = messagesController;
        this.f18165f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18166n = iVar;
        this.f18163b = j3;
        this.f18164c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f18165f = chat;
        this.h = runnableArr;
        this.f18163b = j3;
        this.f18164c = i10;
        this.f18166n = messagesLoadedCallback;
    }
}
