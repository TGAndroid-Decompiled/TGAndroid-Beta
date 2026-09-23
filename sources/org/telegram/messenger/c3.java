package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f15790a = 0;
    public final String f15791b;
    public final boolean f15792c;
    public final boolean d;
    public final Object e;
    public final Object f15793f;
    public final Object h;
    public final Object f15794n;
    public final Object f15795r;
    public final Object f15796s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f15792c = z10;
        this.f15791b = str;
        this.d = z11;
        this.f15793f = inputFile;
        this.h = inputEncryptedFile;
        this.f15794n = bArr;
        this.f15795r = bArr2;
        this.f15796s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f15790a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f15792c, this.f15791b, this.d, (TLRPC.InputFile) this.f15793f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f15794n, (byte[]) this.f15795r, (FileUploadOperation) this.f15796s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f15793f, (nf.e) this.h, (boolean[]) this.f15794n, (TLRPC.User) this.f15795r, this.f15791b, this.f15792c, this.d, (TL_bots.BotInfo[]) this.f15796s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f15793f = n2Var;
        this.h = eVar;
        this.f15794n = zArr;
        this.f15795r = user;
        this.f15791b = str;
        this.f15792c = z10;
        this.d = z11;
        this.f15796s = botInfoArr;
    }
}
