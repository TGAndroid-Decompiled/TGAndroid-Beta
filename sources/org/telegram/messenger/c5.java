package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c5 implements Runnable {
    public final int f17240a = 0;
    public final long f17241b;
    public final int f17242c;
    public final Object d;
    public final Object f17243e;
    public final Object f17244f;
    public final Object h;
    public final Object f17245n;

    public c5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f17242c = i10;
        this.d = str;
        this.f17243e = inputFile;
        this.f17244f = inputEncryptedFile;
        this.h = bArr;
        this.f17245n = bArr2;
        this.f17241b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17240a) {
            case 0:
                long j3 = this.f17241b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f17242c, (String) this.d, (TLRPC.InputFile) this.f17243e, (TLRPC.InputEncryptedFile) this.f17244f, (byte[]) this.h, (byte[]) this.f17245n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.f17243e, (TLRPC.Chat) this.f17244f, (Runnable[]) this.h, this.f17241b, this.f17242c, (MessagesController.MessagesLoadedCallback) this.f17245n);
                return;
            default:
                ((MessagesController) this.f17243e).lambda$reloadWebPages$185((HashMap) this.f17244f, (String) this.d, (TLObject) this.h, (a0.i) this.f17245n, this.f17241b, this.f17242c);
                return;
        }
    }

    public c5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f17243e = messagesController;
        this.f17244f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f17245n = iVar;
        this.f17241b = j3;
        this.f17242c = i10;
    }

    public c5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f17243e = zArr;
        this.f17244f = chat;
        this.h = runnableArr;
        this.f17241b = j3;
        this.f17242c = i10;
        this.f17245n = messagesLoadedCallback;
    }
}
