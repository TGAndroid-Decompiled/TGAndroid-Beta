package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Runnable {
    public final int f22083a = 0;
    public final long f22084b;
    public final int f22085c;
    public final Object d;
    public final Object f22086e;
    public final Object f22087f;
    public final Object h;
    public final Object f22088n;

    public x4(int i9, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f22085c = i9;
        this.d = str;
        this.f22086e = inputFile;
        this.f22087f = inputEncryptedFile;
        this.h = bArr;
        this.f22088n = bArr2;
        this.f22084b = j10;
    }

    @Override
    public final void run() {
        switch (this.f22083a) {
            case 0:
                long j10 = this.f22084b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f22085c, (String) this.d, (TLRPC.InputFile) this.f22086e, (TLRPC.InputEncryptedFile) this.f22087f, (byte[]) this.h, (byte[]) this.f22088n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f22086e, (TLRPC.Chat) this.f22087f, (Runnable[]) this.h, this.f22084b, this.f22085c, (MessagesController.MessagesLoadedCallback) this.f22088n);
                return;
            default:
                ((MessagesController) this.f22086e).lambda$reloadWebPages$186((HashMap) this.f22087f, (String) this.d, (TLObject) this.h, (a0.h) this.f22088n, this.f22084b, this.f22085c);
                return;
        }
    }

    public x4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i9) {
        this.f22086e = messagesController;
        this.f22087f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f22088n = hVar;
        this.f22084b = j10;
        this.f22085c = i9;
    }

    public x4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i9, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f22086e = zArr;
        this.f22087f = chat;
        this.h = runnableArr;
        this.f22084b = j10;
        this.f22085c = i9;
        this.f22088n = messagesLoadedCallback;
    }
}
