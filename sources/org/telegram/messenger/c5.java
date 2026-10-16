package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c5 implements Runnable {
    public final int f16630a = 0;
    public final long f16631b;
    public final int f16632c;
    public final Object d;
    public final Object e;
    public final Object f16633f;
    public final Object h;
    public final Object f16634n;

    public c5(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f16632c = i10;
        this.d = str;
        this.e = inputFile;
        this.f16633f = inputEncryptedFile;
        this.h = bArr;
        this.f16634n = bArr2;
        this.f16631b = j10;
    }

    @Override
    public final void run() {
        switch (this.f16630a) {
            case 0:
                long j10 = this.f16631b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f16632c, (String) this.d, (TLRPC.InputFile) this.e, (TLRPC.InputEncryptedFile) this.f16633f, (byte[]) this.h, (byte[]) this.f16634n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.e, (TLRPC.Chat) this.f16633f, (Runnable[]) this.h, this.f16631b, this.f16632c, (MessagesController.MessagesLoadedCallback) this.f16634n);
                return;
            default:
                ((MessagesController) this.e).lambda$reloadWebPages$185((HashMap) this.f16633f, (String) this.d, (TLObject) this.h, (a0.h) this.f16634n, this.f16631b, this.f16632c);
                return;
        }
    }

    public c5(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = messagesController;
        this.f16633f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f16634n = hVar;
        this.f16631b = j10;
        this.f16632c = i10;
    }

    public c5(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.e = zArr;
        this.f16633f = chat;
        this.h = runnableArr;
        this.f16631b = j10;
        this.f16632c = i10;
        this.f16634n = messagesLoadedCallback;
    }
}
