package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b5 implements Runnable {
    public final int f17914a = 0;
    public final long f17915b;
    public final int f17916c;
    public final Object d;
    public final Object e;
    public final Object f17917f;
    public final Object h;
    public final Object f17918n;

    public b5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f17916c = i10;
        this.d = str;
        this.e = inputFile;
        this.f17917f = inputEncryptedFile;
        this.h = bArr;
        this.f17918n = bArr2;
        this.f17915b = j10;
    }

    @Override
    public final void run() {
        switch (this.f17914a) {
            case 0:
                long j10 = this.f17915b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f17916c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f17917f, (byte[]) this.h, (byte[]) this.f17918n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.e, (TLRPC.Chat) this.f17917f, (Runnable[]) this.h, this.f17915b, this.f17916c, (MessagesController.MessagesLoadedCallback) this.f17918n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$185((HashMap) this.f17917f, (String) this.d, (TLObject) this.h, (a0.h) this.f17918n, this.f17915b, this.f17916c);
                return;
        }
    }

    public b5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = messagesController;
        this.f17917f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f17918n = hVar;
        this.f17915b = j10;
        this.f17916c = i10;
    }

    public b5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f17917f = chat;
        this.h = runnableArr;
        this.f17915b = j10;
        this.f17916c = i10;
        this.f17918n = messagesLoadedCallback;
    }
}
