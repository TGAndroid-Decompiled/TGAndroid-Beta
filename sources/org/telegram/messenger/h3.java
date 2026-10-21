package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class h3 implements Runnable {
    public final int f18500a = 0;
    public final String f18501b;
    public final boolean f18502c;
    public final boolean d;
    public final Object e;
    public final Object f18503f;
    public final Object h;
    public final Object f18504n;
    public final Object f18505r;
    public final Object f18506s;

    public h3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18502c = z10;
        this.f18501b = str;
        this.d = z11;
        this.f18503f = inputFile;
        this.h = inputEncryptedFile;
        this.f18504n = bArr;
        this.f18505r = bArr2;
        this.f18506s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18500a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18502c, this.f18501b, this.d, (TLRPC.InputFile) this.f18503f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18504n, (byte[]) this.f18505r, (FileUploadOperation) this.f18506s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f18503f, (pf.c) this.h, (boolean[]) this.f18504n, (TLRPC.User) this.f18505r, this.f18501b, this.f18502c, this.d, (TL_bots.BotInfo[]) this.f18506s);
                return;
        }
    }

    public h3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18503f = n2Var;
        this.h = cVar;
        this.f18504n = zArr;
        this.f18505r = user;
        this.f18501b = str;
        this.f18502c = z10;
        this.d = z11;
        this.f18506s = botInfoArr;
    }
}
