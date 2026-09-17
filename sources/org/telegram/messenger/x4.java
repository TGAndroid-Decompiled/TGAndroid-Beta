package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Runnable {
    public final int f19586a = 0;
    public final long f19587b;
    public final int f19588c;
    public final Object d;
    public final Object f19589e;
    public final Object f19590f;
    public final Object h;
    public final Object f19591n;

    public x4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19588c = i10;
        this.d = str;
        this.f19589e = inputFile;
        this.f19590f = inputEncryptedFile;
        this.h = bArr;
        this.f19591n = bArr2;
        this.f19587b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19586a) {
            case 0:
                long j3 = this.f19587b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19588c, (String) this.d, (TLRPC.InputFile) this.f19589e, (TLRPC.InputEncryptedFile) this.f19590f, (byte[]) this.h, (byte[]) this.f19591n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f19589e, (TLRPC.Chat) this.f19590f, (Runnable[]) this.h, this.f19587b, this.f19588c, (MessagesController.MessagesLoadedCallback) this.f19591n);
                return;
            default:
                ((MessagesController) this.f19589e).lambda$reloadWebPages$186((HashMap) this.f19590f, (String) this.d, (TLObject) this.h, (a0.i) this.f19591n, this.f19587b, this.f19588c);
                return;
        }
    }

    public x4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19589e = messagesController;
        this.f19590f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f19591n = iVar;
        this.f19587b = j3;
        this.f19588c = i10;
    }

    public x4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19589e = zArr;
        this.f19590f = chat;
        this.h = runnableArr;
        this.f19587b = j3;
        this.f19588c = i10;
        this.f19591n = messagesLoadedCallback;
    }
}
