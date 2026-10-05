package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f19868a = 0;
    public final long f19869b;
    public final int f19870c;
    public final Object d;
    public final Object f19871e;
    public final Object f19872f;
    public final Object h;
    public final Object f19873n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19870c = i10;
        this.d = str;
        this.f19871e = inputFile;
        this.f19872f = inputEncryptedFile;
        this.h = bArr;
        this.f19873n = bArr2;
        this.f19869b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19868a) {
            case 0:
                long j3 = this.f19869b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19870c, (String) this.d, (TLRPC.InputFile) this.f19871e, (TLRPC.InputEncryptedFile) this.f19872f, (byte[]) this.h, (byte[]) this.f19873n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f19871e, (TLRPC.Chat) this.f19872f, (Runnable[]) this.h, this.f19869b, this.f19870c, (MessagesController.MessagesLoadedCallback) this.f19873n);
                return;
            default:
                ((MessagesController) this.f19871e).lambda$reloadWebPages$186((HashMap) this.f19872f, (String) this.d, (TLObject) this.h, (a0.i) this.f19873n, this.f19869b, this.f19870c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19871e = messagesController;
        this.f19872f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f19873n = iVar;
        this.f19869b = j3;
        this.f19870c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19871e = zArr;
        this.f19872f = chat;
        this.h = runnableArr;
        this.f19869b = j3;
        this.f19870c = i10;
        this.f19873n = messagesLoadedCallback;
    }
}
