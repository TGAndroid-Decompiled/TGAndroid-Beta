package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class f3 implements Runnable {
    public final int f18337a = 0;
    public final String f18338b;
    public final boolean f18339c;
    public final boolean d;
    public final Object e;
    public final Object f18340f;
    public final Object h;
    public final Object f18341n;
    public final Object f18342r;
    public final Object f18343s;

    public f3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18339c = z10;
        this.f18338b = str;
        this.d = z11;
        this.f18340f = inputFile;
        this.h = inputEncryptedFile;
        this.f18341n = bArr;
        this.f18342r = bArr2;
        this.f18343s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18337a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18339c, this.f18338b, this.d, (TLRPC.InputFile) this.f18340f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18341n, (byte[]) this.f18342r, (FileUploadOperation) this.f18343s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f18340f, (pf.c) this.h, (boolean[]) this.f18341n, (TLRPC.User) this.f18342r, this.f18338b, this.f18339c, this.d, (TL_bots.BotInfo[]) this.f18343s);
                return;
        }
    }

    public f3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18340f = n2Var;
        this.h = cVar;
        this.f18341n = zArr;
        this.f18342r = user;
        this.f18338b = str;
        this.f18339c = z10;
        this.d = z11;
        this.f18343s = botInfoArr;
    }
}
