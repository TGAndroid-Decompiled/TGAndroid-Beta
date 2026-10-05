package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17497a = 0;
    public final String f17498b;
    public final boolean f17499c;
    public final boolean d;
    public final Object f17500e;
    public final Object f17501f;
    public final Object h;
    public final Object f17502n;
    public final Object f17503r;
    public final Object f17504s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17500e = anonymousClass1;
        this.f17499c = z10;
        this.f17498b = str;
        this.d = z11;
        this.f17501f = inputFile;
        this.h = inputEncryptedFile;
        this.f17502n = bArr;
        this.f17503r = bArr2;
        this.f17504s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17497a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17500e).lambda$didFinishUploadingFile$0(this.f17499c, this.f17498b, this.d, (TLRPC.InputFile) this.f17501f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17502n, (byte[]) this.f17503r, (FileUploadOperation) this.f17504s);
                return;
            default:
                ((MessagesController) this.f17500e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f17501f, (nf.e) this.h, (boolean[]) this.f17502n, (TLRPC.User) this.f17503r, this.f17498b, this.f17499c, this.d, (TL_bots.BotInfo[]) this.f17504s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17500e = messagesController;
        this.f17501f = n2Var;
        this.h = eVar;
        this.f17502n = zArr;
        this.f17503r = user;
        this.f17498b = str;
        this.f17499c = z10;
        this.d = z11;
        this.f17504s = botInfoArr;
    }
}
