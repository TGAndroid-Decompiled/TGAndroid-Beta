package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f18177a = 0;
    public final long f18178b;
    public final int f18179c;
    public final Object d;
    public final Object e;
    public final Object f18180f;
    public final Object h;
    public final Object f18181n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f18179c = i10;
        this.d = str;
        this.e = inputFile;
        this.f18180f = inputEncryptedFile;
        this.h = bArr;
        this.f18181n = bArr2;
        this.f18178b = j3;
    }

    @Override
    public final void run() {
        switch (this.f18177a) {
            case 0:
                long j3 = this.f18178b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f18179c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f18180f, (byte[]) this.h, (byte[]) this.f18181n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.e, (TLRPC.Chat) this.f18180f, (Runnable[]) this.h, this.f18178b, this.f18179c, (MessagesController.MessagesLoadedCallback) this.f18181n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$186((HashMap) this.f18180f, (String) this.d, (TLObject) this.h, (a0.i) this.f18181n, this.f18178b, this.f18179c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.e = messagesController;
        this.f18180f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f18181n = iVar;
        this.f18178b = j3;
        this.f18179c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f18180f = chat;
        this.h = runnableArr;
        this.f18178b = j3;
        this.f18179c = i10;
        this.f18181n = messagesLoadedCallback;
    }
}
