package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f19861a = 0;
    public final long f19862b;
    public final int f19863c;
    public final Object d;
    public final Object f19864e;
    public final Object f19865f;
    public final Object h;
    public final Object f19866n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19863c = i10;
        this.d = str;
        this.f19864e = inputFile;
        this.f19865f = inputEncryptedFile;
        this.h = bArr;
        this.f19866n = bArr2;
        this.f19862b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19861a) {
            case 0:
                long j3 = this.f19862b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19863c, (String) this.d, (TLRPC.InputFile) this.f19864e, (TLRPC.InputEncryptedFile) this.f19865f, (byte[]) this.h, (byte[]) this.f19866n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f19864e, (TLRPC.Chat) this.f19865f, (Runnable[]) this.h, this.f19862b, this.f19863c, (MessagesController.MessagesLoadedCallback) this.f19866n);
                return;
            default:
                ((MessagesController) this.f19864e).lambda$reloadWebPages$186((HashMap) this.f19865f, (String) this.d, (TLObject) this.h, (a0.i) this.f19866n, this.f19862b, this.f19863c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19864e = messagesController;
        this.f19865f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f19866n = iVar;
        this.f19862b = j3;
        this.f19863c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19864e = zArr;
        this.f19865f = chat;
        this.h = runnableArr;
        this.f19862b = j3;
        this.f19863c = i10;
        this.f19866n = messagesLoadedCallback;
    }
}
