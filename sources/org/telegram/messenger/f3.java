package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class f3 implements Runnable {
    public final int f18340a = 0;
    public final String f18341b;
    public final boolean f18342c;
    public final boolean d;
    public final Object e;
    public final Object f18343f;
    public final Object h;
    public final Object f18344n;
    public final Object f18345r;
    public final Object f18346s;

    public f3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18342c = z10;
        this.f18341b = str;
        this.d = z11;
        this.f18343f = inputFile;
        this.h = inputEncryptedFile;
        this.f18344n = bArr;
        this.f18345r = bArr2;
        this.f18346s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18340a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18342c, this.f18341b, this.d, (TLRPC.InputFile) this.f18343f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18344n, (byte[]) this.f18345r, (FileUploadOperation) this.f18346s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f18343f, (pf.c) this.h, (boolean[]) this.f18344n, (TLRPC.User) this.f18345r, this.f18341b, this.f18342c, this.d, (TL_bots.BotInfo[]) this.f18346s);
                return;
        }
    }

    public f3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18343f = n2Var;
        this.h = cVar;
        this.f18344n = zArr;
        this.f18345r = user;
        this.f18341b = str;
        this.f18342c = z10;
        this.d = z11;
        this.f18346s = botInfoArr;
    }
}
