package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c5 implements Runnable {
    public final int f17239a = 0;
    public final long f17240b;
    public final int f17241c;
    public final Object d;
    public final Object f17242e;
    public final Object f17243f;
    public final Object h;
    public final Object f17244n;

    public c5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f17241c = i10;
        this.d = str;
        this.f17242e = inputFile;
        this.f17243f = inputEncryptedFile;
        this.h = bArr;
        this.f17244n = bArr2;
        this.f17240b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17239a) {
            case 0:
                long j3 = this.f17240b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f17241c, (String) this.d, (TLRPC.InputFile) this.f17242e, (TLRPC.InputEncryptedFile) this.f17243f, (byte[]) this.h, (byte[]) this.f17244n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.f17242e, (TLRPC.Chat) this.f17243f, (Runnable[]) this.h, this.f17240b, this.f17241c, (MessagesController.MessagesLoadedCallback) this.f17244n);
                return;
            default:
                ((MessagesController) this.f17242e).lambda$reloadWebPages$185((HashMap) this.f17243f, (String) this.d, (TLObject) this.h, (a0.i) this.f17244n, this.f17240b, this.f17241c);
                return;
        }
    }

    public c5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f17242e = messagesController;
        this.f17243f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f17244n = iVar;
        this.f17240b = j3;
        this.f17241c = i10;
    }

    public c5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f17242e = zArr;
        this.f17243f = chat;
        this.h = runnableArr;
        this.f17240b = j3;
        this.f17241c = i10;
        this.f17244n = messagesLoadedCallback;
    }
}
