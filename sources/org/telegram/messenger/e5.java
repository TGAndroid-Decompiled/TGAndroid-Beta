package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e5 implements Runnable {
    public final int f18236a = 0;
    public final long f18237b;
    public final int f18238c;
    public final Object d;
    public final Object e;
    public final Object f18239f;
    public final Object h;
    public final Object f18240n;

    public e5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f18238c = i10;
        this.d = str;
        this.e = inputFile;
        this.f18239f = inputEncryptedFile;
        this.h = bArr;
        this.f18240n = bArr2;
        this.f18237b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18236a) {
            case 0:
                long j10 = this.f18237b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18238c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f18239f, (byte[]) this.h, (byte[]) this.f18240n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.e, (TLRPC.Chat) this.f18239f, (Runnable[]) this.h, this.f18237b, this.f18238c, (MessagesController.MessagesLoadedCallback) this.f18240n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$185((HashMap) this.f18239f, (String) this.d, (TLObject) this.h, (a0.h) this.f18240n, this.f18237b, this.f18238c);
                return;
        }
    }

    public e5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = messagesController;
        this.f18239f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18240n = hVar;
        this.f18237b = j10;
        this.f18238c = i10;
    }

    public e5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f18239f = chat;
        this.h = runnableArr;
        this.f18237b = j10;
        this.f18238c = i10;
        this.f18240n = messagesLoadedCallback;
    }
}
