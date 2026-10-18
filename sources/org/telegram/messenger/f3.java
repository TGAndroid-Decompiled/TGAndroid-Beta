package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class f3 implements Runnable {
    public final int f18315a = 0;
    public final String f18316b;
    public final boolean f18317c;
    public final boolean d;
    public final Object e;
    public final Object f18318f;
    public final Object h;
    public final Object f18319n;
    public final Object f18320r;
    public final Object f18321s;

    public f3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18317c = z10;
        this.f18316b = str;
        this.d = z11;
        this.f18318f = inputFile;
        this.h = inputEncryptedFile;
        this.f18319n = bArr;
        this.f18320r = bArr2;
        this.f18321s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18315a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18317c, this.f18316b, this.d, (TLRPC.InputFile) this.f18318f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18319n, (byte[]) this.f18320r, (FileUploadOperation) this.f18321s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f18318f, (pf.c) this.h, (boolean[]) this.f18319n, (TLRPC.User) this.f18320r, this.f18316b, this.f18317c, this.d, (TL_bots.BotInfo[]) this.f18321s);
                return;
        }
    }

    public f3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18318f = n2Var;
        this.h = cVar;
        this.f18319n = zArr;
        this.f18320r = user;
        this.f18316b = str;
        this.f18317c = z10;
        this.d = z11;
        this.f18321s = botInfoArr;
    }
}
