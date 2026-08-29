package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f19861a = 0;
    public final String f19862b;
    public final boolean f19863c;
    public final boolean d;
    public final Object f19864e;
    public final Object f19865f;
    public final Object h;
    public final Object f19866n;
    public final Object f19867r;
    public final Object f19868s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f19864e = anonymousClass1;
        this.f19863c = z10;
        this.f19862b = str;
        this.d = z11;
        this.f19865f = inputFile;
        this.h = inputEncryptedFile;
        this.f19866n = bArr;
        this.f19867r = bArr2;
        this.f19868s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19861a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f19864e).lambda$didFinishUploadingFile$0(this.f19863c, this.f19862b, this.d, (TLRPC.InputFile) this.f19865f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f19866n, (byte[]) this.f19867r, (FileUploadOperation) this.f19868s);
                return;
            default:
                ((MessagesController) this.f19864e).lambda$openApp$498((org.telegram.ui.ActionBar.o2) this.f19865f, (ye.c) this.h, (boolean[]) this.f19866n, (TLRPC.User) this.f19867r, this.f19862b, this.f19863c, this.d, (TL_bots.BotInfo[]) this.f19868s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.o2 o2Var, ye.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f19864e = messagesController;
        this.f19865f = o2Var;
        this.h = cVar;
        this.f19866n = zArr;
        this.f19867r = user;
        this.f19862b = str;
        this.f19863c = z10;
        this.d = z11;
        this.f19868s = botInfoArr;
    }
}
