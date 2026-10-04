package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17492a = 0;
    public final String f17493b;
    public final boolean f17494c;
    public final boolean d;
    public final Object f17495e;
    public final Object f17496f;
    public final Object h;
    public final Object f17497n;
    public final Object f17498r;
    public final Object f17499s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17495e = anonymousClass1;
        this.f17494c = z10;
        this.f17493b = str;
        this.d = z11;
        this.f17496f = inputFile;
        this.h = inputEncryptedFile;
        this.f17497n = bArr;
        this.f17498r = bArr2;
        this.f17499s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17492a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17495e).lambda$didFinishUploadingFile$0(this.f17494c, this.f17493b, this.d, (TLRPC.InputFile) this.f17496f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17497n, (byte[]) this.f17498r, (FileUploadOperation) this.f17499s);
                return;
            default:
                ((MessagesController) this.f17495e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f17496f, (nf.e) this.h, (boolean[]) this.f17497n, (TLRPC.User) this.f17498r, this.f17493b, this.f17494c, this.d, (TL_bots.BotInfo[]) this.f17499s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17495e = messagesController;
        this.f17496f = n2Var;
        this.h = eVar;
        this.f17497n = zArr;
        this.f17498r = user;
        this.f17493b = str;
        this.f17494c = z10;
        this.d = z11;
        this.f17499s = botInfoArr;
    }
}
