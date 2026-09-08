package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f19692a = 0;
    public final long f19693b;
    public final int f19694c;
    public final Object d;
    public final Object f19695e;
    public final Object f19696f;
    public final Object h;
    public final Object f19697n;

    public y4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19694c = i10;
        this.d = str;
        this.f19695e = inputFile;
        this.f19696f = inputEncryptedFile;
        this.h = bArr;
        this.f19697n = bArr2;
        this.f19693b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19692a) {
            case 0:
                long j3 = this.f19693b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19694c, (String) this.d, (TLRPC.InputFile) this.f19695e, (TLRPC.InputEncryptedFile) this.f19696f, (byte[]) this.h, (byte[]) this.f19697n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f19695e, (TLRPC.Chat) this.f19696f, (Runnable[]) this.h, this.f19693b, this.f19694c, (MessagesController.MessagesLoadedCallback) this.f19697n);
                return;
            default:
                ((MessagesController) this.f19695e).lambda$reloadWebPages$186((HashMap) this.f19696f, (String) this.d, (TLObject) this.h, (a0.i) this.f19697n, this.f19693b, this.f19694c);
                return;
        }
    }

    public y4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19695e = messagesController;
        this.f19696f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f19697n = iVar;
        this.f19693b = j3;
        this.f19694c = i10;
    }

    public y4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19695e = zArr;
        this.f19696f = chat;
        this.h = runnableArr;
        this.f19693b = j3;
        this.f19694c = i10;
        this.f19697n = messagesLoadedCallback;
    }
}
