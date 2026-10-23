package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d5 implements Runnable {
    public final int f18227a = 0;
    public final long f18228b;
    public final int f18229c;
    public final Object d;
    public final Object e;
    public final Object f18230f;
    public final Object h;
    public final Object f18231n;

    public d5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f18229c = i10;
        this.d = str;
        this.e = inputFile;
        this.f18230f = inputEncryptedFile;
        this.h = bArr;
        this.f18231n = bArr2;
        this.f18228b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18227a) {
            case 0:
                long j10 = this.f18228b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18229c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f18230f, (byte[]) this.h, (byte[]) this.f18231n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.e, (TLRPC.Chat) this.f18230f, (Runnable[]) this.h, this.f18228b, this.f18229c, (MessagesController.MessagesLoadedCallback) this.f18231n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$185((HashMap) this.f18230f, (String) this.d, (TLObject) this.h, (a0.h) this.f18231n, this.f18228b, this.f18229c);
                return;
        }
    }

    public d5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = messagesController;
        this.f18230f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18231n = hVar;
        this.f18228b = j10;
        this.f18229c = i10;
    }

    public d5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f18230f = chat;
        this.h = runnableArr;
        this.f18228b = j10;
        this.f18229c = i10;
        this.f18231n = messagesLoadedCallback;
    }
}
