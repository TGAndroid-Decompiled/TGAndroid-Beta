package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f16049a = 0;
    public final String f16050b;
    public final boolean f16051c;
    public final boolean d;
    public final Object e;
    public final Object f16052f;
    public final Object h;
    public final Object f16053n;
    public final Object f16054r;
    public final Object f16055s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f16051c = z10;
        this.f16050b = str;
        this.d = z11;
        this.f16052f = inputFile;
        this.h = inputEncryptedFile;
        this.f16053n = bArr;
        this.f16054r = bArr2;
        this.f16055s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16049a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f16051c, this.f16050b, this.d, (TLRPC.InputFile) this.f16052f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f16053n, (byte[]) this.f16054r, (FileUploadOperation) this.f16055s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.m2) this.f16052f, (nf.e) this.h, (boolean[]) this.f16053n, (TLRPC.User) this.f16054r, this.f16050b, this.f16051c, this.d, (TL_bots.BotInfo[]) this.f16055s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f16052f = m2Var;
        this.h = eVar;
        this.f16053n = zArr;
        this.f16054r = user;
        this.f16050b = str;
        this.f16051c = z10;
        this.d = z11;
        this.f16055s = botInfoArr;
    }
}
