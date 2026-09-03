package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a5 implements Runnable {
    public final int f18105a = 0;
    public final long f18106b;
    public final int f18107c;
    public final Object d;
    public final Object f18108e;
    public final Object f18109f;
    public final Object h;
    public final Object f18110n;

    public a5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f18107c = i10;
        this.d = str;
        this.f18108e = inputFile;
        this.f18109f = inputEncryptedFile;
        this.h = bArr;
        this.f18110n = bArr2;
        this.f18106b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18105a) {
            case 0:
                long j10 = this.f18106b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18107c, (String) this.d, (TLRPC.InputFile) this.f18108e, (TLRPC.InputEncryptedFile) this.f18109f, (byte[]) this.h, (byte[]) this.f18110n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f18108e, (TLRPC.Chat) this.f18109f, (Runnable[]) this.h, this.f18106b, this.f18107c, (MessagesController.MessagesLoadedCallback) this.f18110n);
                return;
            default:
                ((MessagesController) this.f18108e).lambda$reloadWebPages$186((HashMap) this.f18109f, (String) this.d, (TLObject) this.h, (a0.h) this.f18110n, this.f18106b, this.f18107c);
                return;
        }
    }

    public a5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.f18108e = messagesController;
        this.f18109f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18110n = hVar;
        this.f18106b = j10;
        this.f18107c = i10;
    }

    public a5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f18108e = zArr;
        this.f18109f = chat;
        this.h = runnableArr;
        this.f18106b = j10;
        this.f18107c = i10;
        this.f18110n = messagesLoadedCallback;
    }
}
