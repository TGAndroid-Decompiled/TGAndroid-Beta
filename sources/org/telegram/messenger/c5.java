package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c5 implements Runnable {
    public final int f18016a = 0;
    public final long f18017b;
    public final int f18018c;
    public final Object d;
    public final Object e;
    public final Object f18019f;
    public final Object h;
    public final Object f18020n;

    public c5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f18018c = i10;
        this.d = str;
        this.e = inputFile;
        this.f18019f = inputEncryptedFile;
        this.h = bArr;
        this.f18020n = bArr2;
        this.f18017b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18016a) {
            case 0:
                long j10 = this.f18017b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18018c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f18019f, (byte[]) this.h, (byte[]) this.f18020n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.e, (TLRPC.Chat) this.f18019f, (Runnable[]) this.h, this.f18017b, this.f18018c, (MessagesController.MessagesLoadedCallback) this.f18020n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$185((HashMap) this.f18019f, (String) this.d, (TLObject) this.h, (a0.h) this.f18020n, this.f18017b, this.f18018c);
                return;
        }
    }

    public c5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = messagesController;
        this.f18019f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18020n = hVar;
        this.f18017b = j10;
        this.f18018c = i10;
    }

    public c5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f18019f = chat;
        this.h = runnableArr;
        this.f18017b = j10;
        this.f18018c = i10;
        this.f18020n = messagesLoadedCallback;
    }
}
