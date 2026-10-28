package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class i3 implements Runnable {
    public final int f20297a = 0;
    public final String f20298b;
    public final boolean f20299c;
    public final boolean d;
    public final Object e;
    public final Object f20300f;
    public final Object h;
    public final Object f20301n;
    public final Object f20302r;
    public final Object f20303s;

    public i3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f20299c = z10;
        this.f20298b = str;
        this.d = z11;
        this.f20300f = inputFile;
        this.h = inputEncryptedFile;
        this.f20301n = bArr;
        this.f20302r = bArr2;
        this.f20303s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f20297a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f20299c, this.f20298b, this.d, (TLRPC.InputFile) this.f20300f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f20301n, (byte[]) this.f20302r, (FileUploadOperation) this.f20303s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$504((org.telegram.ui.ActionBar.r2) this.f20300f, (qf.c) this.h, (boolean[]) this.f20301n, (TLRPC.User) this.f20302r, this.f20298b, this.f20299c, this.d, (TL_bots.BotInfo[]) this.f20303s);
                return;
        }
    }

    public i3(MessagesController messagesController, org.telegram.ui.ActionBar.r2 r2Var, qf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f20300f = r2Var;
        this.h = cVar;
        this.f20301n = zArr;
        this.f20302r = user;
        this.f20298b = str;
        this.f20299c = z10;
        this.d = z11;
        this.f20303s = botInfoArr;
    }
}
