package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17494a = 0;
    public final String f17495b;
    public final boolean f17496c;
    public final boolean d;
    public final Object f17497e;
    public final Object f17498f;
    public final Object h;
    public final Object f17499n;
    public final Object f17500r;
    public final Object f17501s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17497e = anonymousClass1;
        this.f17496c = z10;
        this.f17495b = str;
        this.d = z11;
        this.f17498f = inputFile;
        this.h = inputEncryptedFile;
        this.f17499n = bArr;
        this.f17500r = bArr2;
        this.f17501s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17494a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17497e).lambda$didFinishUploadingFile$0(this.f17496c, this.f17495b, this.d, (TLRPC.InputFile) this.f17498f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17499n, (byte[]) this.f17500r, (FileUploadOperation) this.f17501s);
                return;
            default:
                ((MessagesController) this.f17497e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f17498f, (nf.e) this.h, (boolean[]) this.f17499n, (TLRPC.User) this.f17500r, this.f17495b, this.f17496c, this.d, (TL_bots.BotInfo[]) this.f17501s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17497e = messagesController;
        this.f17498f = n2Var;
        this.h = eVar;
        this.f17499n = zArr;
        this.f17500r = user;
        this.f17495b = str;
        this.f17496c = z10;
        this.d = z11;
        this.f17501s = botInfoArr;
    }
}
