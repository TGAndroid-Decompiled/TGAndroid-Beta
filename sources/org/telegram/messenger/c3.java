package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17495a = 0;
    public final String f17496b;
    public final boolean f17497c;
    public final boolean d;
    public final Object f17498e;
    public final Object f17499f;
    public final Object h;
    public final Object f17500n;
    public final Object f17501r;
    public final Object f17502s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17498e = anonymousClass1;
        this.f17497c = z10;
        this.f17496b = str;
        this.d = z11;
        this.f17499f = inputFile;
        this.h = inputEncryptedFile;
        this.f17500n = bArr;
        this.f17501r = bArr2;
        this.f17502s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17495a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17498e).lambda$didFinishUploadingFile$0(this.f17497c, this.f17496b, this.d, (TLRPC.InputFile) this.f17499f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17500n, (byte[]) this.f17501r, (FileUploadOperation) this.f17502s);
                return;
            default:
                ((MessagesController) this.f17498e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f17499f, (nf.e) this.h, (boolean[]) this.f17500n, (TLRPC.User) this.f17501r, this.f17496b, this.f17497c, this.d, (TL_bots.BotInfo[]) this.f17502s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17498e = messagesController;
        this.f17499f = n2Var;
        this.h = eVar;
        this.f17500n = zArr;
        this.f17501r = user;
        this.f17496b = str;
        this.f17497c = z10;
        this.d = z11;
        this.f17502s = botInfoArr;
    }
}
