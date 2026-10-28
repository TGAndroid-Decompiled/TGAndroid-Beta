package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g5 implements Runnable {
    public final int f20136a = 0;
    public final long f20137b;
    public final int f20138c;
    public final Object d;
    public final Object e;
    public final Object f20139f;
    public final Object h;
    public final Object f20140n;

    public g5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f20138c = i10;
        this.d = str;
        this.e = inputFile;
        this.f20139f = inputEncryptedFile;
        this.h = bArr;
        this.f20140n = bArr2;
        this.f20137b = j10;
    }

    @Override
    public final void run() {
        switch (this.f20136a) {
            case 0:
                long j10 = this.f20137b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f20138c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f20139f, (byte[]) this.h, (byte[]) this.f20140n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$465((boolean[]) this.e, (TLRPC.Chat) this.f20139f, (Runnable[]) this.h, this.f20137b, this.f20138c, (MessagesController.MessagesLoadedCallback) this.f20140n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$185((HashMap) this.f20139f, (String) this.d, (TLObject) this.h, (a0.h) this.f20140n, this.f20137b, this.f20138c);
                return;
        }
    }

    public g5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = messagesController;
        this.f20139f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f20140n = hVar;
        this.f20137b = j10;
        this.f20138c = i10;
    }

    public g5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f20139f = chat;
        this.h = runnableArr;
        this.f20137b = j10;
        this.f20138c = i10;
        this.f20140n = messagesLoadedCallback;
    }
}
