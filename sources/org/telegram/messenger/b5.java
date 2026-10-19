package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b5 implements Runnable {
    public final int f17927a = 0;
    public final long f17928b;
    public final int f17929c;
    public final Object d;
    public final Object e;
    public final Object f17930f;
    public final Object h;
    public final Object f17931n;

    public b5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f17929c = i10;
        this.d = str;
        this.e = inputFile;
        this.f17930f = inputEncryptedFile;
        this.h = bArr;
        this.f17931n = bArr2;
        this.f17928b = j10;
    }

    @Override
    public final void run() {
        switch (this.f17927a) {
            case 0:
                long j10 = this.f17928b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f17929c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f17930f, (byte[]) this.h, (byte[]) this.f17931n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.e, (TLRPC.Chat) this.f17930f, (Runnable[]) this.h, this.f17928b, this.f17929c, (MessagesController.MessagesLoadedCallback) this.f17931n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$185((HashMap) this.f17930f, (String) this.d, (TLObject) this.h, (a0.h) this.f17931n, this.f17928b, this.f17929c);
                return;
        }
    }

    public b5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = messagesController;
        this.f17930f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f17931n = hVar;
        this.f17928b = j10;
        this.f17929c = i10;
    }

    public b5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f17930f = chat;
        this.h = runnableArr;
        this.f17928b = j10;
        this.f17929c = i10;
        this.f17931n = messagesLoadedCallback;
    }
}
