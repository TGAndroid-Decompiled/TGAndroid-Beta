package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f15796a = 0;
    public final String f15797b;
    public final boolean f15798c;
    public final boolean d;
    public final Object e;
    public final Object f15799f;
    public final Object h;
    public final Object f15800n;
    public final Object f15801r;
    public final Object f15802s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f15798c = z10;
        this.f15797b = str;
        this.d = z11;
        this.f15799f = inputFile;
        this.h = inputEncryptedFile;
        this.f15800n = bArr;
        this.f15801r = bArr2;
        this.f15802s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f15796a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f15798c, this.f15797b, this.d, (TLRPC.InputFile) this.f15799f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f15800n, (byte[]) this.f15801r, (FileUploadOperation) this.f15802s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f15799f, (nf.e) this.h, (boolean[]) this.f15800n, (TLRPC.User) this.f15801r, this.f15797b, this.f15798c, this.d, (TL_bots.BotInfo[]) this.f15802s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f15799f = n2Var;
        this.h = eVar;
        this.f15800n = zArr;
        this.f15801r = user;
        this.f15797b = str;
        this.f15798c = z10;
        this.d = z11;
        this.f15802s = botInfoArr;
    }
}
