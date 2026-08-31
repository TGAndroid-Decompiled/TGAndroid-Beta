package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a5 implements Runnable {
    public final int f18103a = 0;
    public final long f18104b;
    public final int f18105c;
    public final Object d;
    public final Object f18106e;
    public final Object f18107f;
    public final Object h;
    public final Object f18108n;

    public a5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f18105c = i10;
        this.d = str;
        this.f18106e = inputFile;
        this.f18107f = inputEncryptedFile;
        this.h = bArr;
        this.f18108n = bArr2;
        this.f18104b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18103a) {
            case 0:
                long j10 = this.f18104b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18105c, (String) this.d, (TLRPC.InputFile) this.f18106e, (TLRPC.InputEncryptedFile) this.f18107f, (byte[]) this.h, (byte[]) this.f18108n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f18106e, (TLRPC.Chat) this.f18107f, (Runnable[]) this.h, this.f18104b, this.f18105c, (MessagesController.MessagesLoadedCallback) this.f18108n);
                return;
            default:
                ((MessagesController) this.f18106e).lambda$reloadWebPages$186((HashMap) this.f18107f, (String) this.d, (TLObject) this.h, (a0.h) this.f18108n, this.f18104b, this.f18105c);
                return;
        }
    }

    public a5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.f18106e = messagesController;
        this.f18107f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18108n = hVar;
        this.f18104b = j10;
        this.f18105c = i10;
    }

    public a5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f18106e = zArr;
        this.f18107f = chat;
        this.h = runnableArr;
        this.f18104b = j10;
        this.f18105c = i10;
        this.f18108n = messagesLoadedCallback;
    }
}
