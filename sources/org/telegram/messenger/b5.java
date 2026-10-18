package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b5 implements Runnable {
    public final int f17930a = 0;
    public final long f17931b;
    public final int f17932c;
    public final Object d;
    public final Object e;
    public final Object f17933f;
    public final Object h;
    public final Object f17934n;

    public b5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f17932c = i10;
        this.d = str;
        this.e = inputFile;
        this.f17933f = inputEncryptedFile;
        this.h = bArr;
        this.f17934n = bArr2;
        this.f17931b = j10;
    }

    @Override
    public final void run() {
        switch (this.f17930a) {
            case 0:
                long j10 = this.f17931b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f17932c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f17933f, (byte[]) this.h, (byte[]) this.f17934n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.e, (TLRPC.Chat) this.f17933f, (Runnable[]) this.h, this.f17931b, this.f17932c, (MessagesController.MessagesLoadedCallback) this.f17934n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$185((HashMap) this.f17933f, (String) this.d, (TLObject) this.h, (a0.h) this.f17934n, this.f17931b, this.f17932c);
                return;
        }
    }

    public b5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = messagesController;
        this.f17933f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f17934n = hVar;
        this.f17931b = j10;
        this.f17932c = i10;
    }

    public b5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f17933f = chat;
        this.h = runnableArr;
        this.f17931b = j10;
        this.f17932c = i10;
        this.f17934n = messagesLoadedCallback;
    }
}
