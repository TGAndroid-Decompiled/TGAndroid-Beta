package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f17921a = 0;
    public final long f17922b;
    public final int f17923c;
    public final Object d;
    public final Object e;
    public final Object f17924f;
    public final Object h;
    public final Object f17925n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f17923c = i10;
        this.d = str;
        this.e = inputFile;
        this.f17924f = inputEncryptedFile;
        this.h = bArr;
        this.f17925n = bArr2;
        this.f17922b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17921a) {
            case 0:
                long j3 = this.f17922b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f17923c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f17924f, (byte[]) this.h, (byte[]) this.f17925n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.e, (TLRPC.Chat) this.f17924f, (Runnable[]) this.h, this.f17922b, this.f17923c, (MessagesController.MessagesLoadedCallback) this.f17925n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$186((HashMap) this.f17924f, (String) this.d, (TLObject) this.h, (a0.i) this.f17925n, this.f17922b, this.f17923c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.e = messagesController;
        this.f17924f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f17925n = iVar;
        this.f17922b = j3;
        this.f17923c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f17924f = chat;
        this.h = runnableArr;
        this.f17922b = j3;
        this.f17923c = i10;
        this.f17925n = messagesLoadedCallback;
    }
}
