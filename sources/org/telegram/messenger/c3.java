package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f15809a = 0;
    public final String f15810b;
    public final boolean f15811c;
    public final boolean d;
    public final Object e;
    public final Object f15812f;
    public final Object h;
    public final Object f15813n;
    public final Object f15814r;
    public final Object f15815s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f15811c = z10;
        this.f15810b = str;
        this.d = z11;
        this.f15812f = inputFile;
        this.h = inputEncryptedFile;
        this.f15813n = bArr;
        this.f15814r = bArr2;
        this.f15815s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f15809a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f15811c, this.f15810b, this.d, (TLRPC.InputFile) this.f15812f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f15813n, (byte[]) this.f15814r, (FileUploadOperation) this.f15815s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.o2) this.f15812f, (nf.e) this.h, (boolean[]) this.f15813n, (TLRPC.User) this.f15814r, this.f15810b, this.f15811c, this.d, (TL_bots.BotInfo[]) this.f15815s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.o2 o2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f15812f = o2Var;
        this.h = eVar;
        this.f15813n = zArr;
        this.f15814r = user;
        this.f15810b = str;
        this.f15811c = z10;
        this.d = z11;
        this.f15815s = botInfoArr;
    }
}
