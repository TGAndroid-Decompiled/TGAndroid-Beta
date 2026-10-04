package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f19863a = 0;
    public final long f19864b;
    public final int f19865c;
    public final Object d;
    public final Object f19866e;
    public final Object f19867f;
    public final Object h;
    public final Object f19868n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19865c = i10;
        this.d = str;
        this.f19866e = inputFile;
        this.f19867f = inputEncryptedFile;
        this.h = bArr;
        this.f19868n = bArr2;
        this.f19864b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19863a) {
            case 0:
                long j3 = this.f19864b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19865c, (String) this.d, (TLRPC.InputFile) this.f19866e, (TLRPC.InputEncryptedFile) this.f19867f, (byte[]) this.h, (byte[]) this.f19868n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f19866e, (TLRPC.Chat) this.f19867f, (Runnable[]) this.h, this.f19864b, this.f19865c, (MessagesController.MessagesLoadedCallback) this.f19868n);
                return;
            default:
                ((MessagesController) this.f19866e).lambda$reloadWebPages$186((HashMap) this.f19867f, (String) this.d, (TLObject) this.h, (a0.i) this.f19868n, this.f19864b, this.f19865c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19866e = messagesController;
        this.f19867f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f19868n = iVar;
        this.f19864b = j3;
        this.f19865c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19866e = zArr;
        this.f19867f = chat;
        this.h = runnableArr;
        this.f19864b = j3;
        this.f19865c = i10;
        this.f19868n = messagesLoadedCallback;
    }
}
