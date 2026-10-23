package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d5 implements Runnable {
    public final int f18163a = 0;
    public final long f18164b;
    public final int f18165c;
    public final Object d;
    public final Object e;
    public final Object f18166f;
    public final Object h;
    public final Object f18167n;

    public d5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f18165c = i10;
        this.d = str;
        this.e = inputFile;
        this.f18166f = inputEncryptedFile;
        this.h = bArr;
        this.f18167n = bArr2;
        this.f18164b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18163a) {
            case 0:
                long j10 = this.f18164b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18165c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f18166f, (byte[]) this.h, (byte[]) this.f18167n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.e, (TLRPC.Chat) this.f18166f, (Runnable[]) this.h, this.f18164b, this.f18165c, (MessagesController.MessagesLoadedCallback) this.f18167n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$185((HashMap) this.f18166f, (String) this.d, (TLObject) this.h, (a0.h) this.f18167n, this.f18164b, this.f18165c);
                return;
        }
    }

    public d5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = messagesController;
        this.f18166f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18167n = hVar;
        this.f18164b = j10;
        this.f18165c = i10;
    }

    public d5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f18166f = chat;
        this.h = runnableArr;
        this.f18164b = j10;
        this.f18165c = i10;
        this.f18167n = messagesLoadedCallback;
    }
}
