package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class h3 implements Runnable {
    public final int f15327a = 0;
    public final String f15328b;
    public final boolean f15329c;
    public final boolean d;
    public final Object e;
    public final Object f15330f;
    public final Object h;
    public final Object f15331n;
    public final Object f15332r;
    public final Object f15333s;

    public h3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f15329c = z10;
        this.f15328b = str;
        this.d = z11;
        this.f15330f = inputFile;
        this.h = inputEncryptedFile;
        this.f15331n = bArr;
        this.f15332r = bArr2;
        this.f15333s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f15327a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f15329c, this.f15328b, this.d, (TLRPC.InputFile) this.f15330f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f15331n, (byte[]) this.f15332r, (FileUploadOperation) this.f15333s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.p2) this.f15330f, (nf.e) this.h, (boolean[]) this.f15331n, (TLRPC.User) this.f15332r, this.f15328b, this.f15329c, this.d, (TL_bots.BotInfo[]) this.f15333s);
                return;
        }
    }

    public h3(MessagesController messagesController, org.telegram.ui.ActionBar.p2 p2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f15330f = p2Var;
        this.h = eVar;
        this.f15331n = zArr;
        this.f15332r = user;
        this.f15328b = str;
        this.f15329c = z10;
        this.d = z11;
        this.f15333s = botInfoArr;
    }
}
