package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f19862a = 0;
    public final long f19863b;
    public final int f19864c;
    public final Object d;
    public final Object f19865e;
    public final Object f19866f;
    public final Object h;
    public final Object f19867n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19864c = i10;
        this.d = str;
        this.f19865e = inputFile;
        this.f19866f = inputEncryptedFile;
        this.h = bArr;
        this.f19867n = bArr2;
        this.f19863b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19862a) {
            case 0:
                long j3 = this.f19863b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19864c, (String) this.d, (TLRPC.InputFile) this.f19865e, (TLRPC.InputEncryptedFile) this.f19866f, (byte[]) this.h, (byte[]) this.f19867n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f19865e, (TLRPC.Chat) this.f19866f, (Runnable[]) this.h, this.f19863b, this.f19864c, (MessagesController.MessagesLoadedCallback) this.f19867n);
                return;
            default:
                ((MessagesController) this.f19865e).lambda$reloadWebPages$186((HashMap) this.f19866f, (String) this.d, (TLObject) this.h, (a0.i) this.f19867n, this.f19863b, this.f19864c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19865e = messagesController;
        this.f19866f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f19867n = iVar;
        this.f19863b = j3;
        this.f19864c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19865e = zArr;
        this.f19866f = chat;
        this.h = runnableArr;
        this.f19863b = j3;
        this.f19864c = i10;
        this.f19867n = messagesLoadedCallback;
    }
}
