package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d5 implements Runnable {
    public final int f14972a = 0;
    public final long f14973b;
    public final int f14974c;
    public final Object d;
    public final Object e;
    public final Object f14975f;
    public final Object h;
    public final Object f14976n;

    public d5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f14974c = i10;
        this.d = str;
        this.e = inputFile;
        this.f14975f = inputEncryptedFile;
        this.h = bArr;
        this.f14976n = bArr2;
        this.f14973b = j3;
    }

    @Override
    public final void run() {
        switch (this.f14972a) {
            case 0:
                long j3 = this.f14973b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f14974c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f14975f, (byte[]) this.h, (byte[]) this.f14976n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.e, (TLRPC.Chat) this.f14975f, (Runnable[]) this.h, this.f14973b, this.f14974c, (MessagesController.MessagesLoadedCallback) this.f14976n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$186((HashMap) this.f14975f, (String) this.d, (TLObject) this.h, (a0.i) this.f14976n, this.f14973b, this.f14974c);
                return;
        }
    }

    public d5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.e = messagesController;
        this.f14975f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f14976n = iVar;
        this.f14973b = j3;
        this.f14974c = i10;
    }

    public d5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f14975f = chat;
        this.h = runnableArr;
        this.f14973b = j3;
        this.f14974c = i10;
        this.f14976n = messagesLoadedCallback;
    }
}
