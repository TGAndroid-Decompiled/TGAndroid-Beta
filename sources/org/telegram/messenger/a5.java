package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a5 implements Runnable {
    public final int f16714a = 0;
    public final long f16715b;
    public final int f16716c;
    public final Object d;
    public final Object e;
    public final Object f16717f;
    public final Object h;
    public final Object f16718n;

    public a5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f16716c = i10;
        this.d = str;
        this.e = inputFile;
        this.f16717f = inputEncryptedFile;
        this.h = bArr;
        this.f16718n = bArr2;
        this.f16715b = j10;
    }

    @Override
    public final void run() {
        switch (this.f16714a) {
            case 0:
                long j10 = this.f16715b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f16716c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f16717f, (byte[]) this.h, (byte[]) this.f16718n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.e, (TLRPC.Chat) this.f16717f, (Runnable[]) this.h, this.f16715b, this.f16716c, (MessagesController.MessagesLoadedCallback) this.f16718n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$186((HashMap) this.f16717f, (String) this.d, (TLObject) this.h, (a0.h) this.f16718n, this.f16715b, this.f16716c);
                return;
        }
    }

    public a5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = messagesController;
        this.f16717f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f16718n = hVar;
        this.f16715b = j10;
        this.f16716c = i10;
    }

    public a5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f16717f = chat;
        this.h = runnableArr;
        this.f16715b = j10;
        this.f16716c = i10;
        this.f16718n = messagesLoadedCallback;
    }
}
