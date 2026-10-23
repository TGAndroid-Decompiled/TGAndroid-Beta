package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class h3 implements Runnable {
    public final int f18502a = 0;
    public final String f18503b;
    public final boolean f18504c;
    public final boolean d;
    public final Object e;
    public final Object f18505f;
    public final Object h;
    public final Object f18506n;
    public final Object f18507r;
    public final Object f18508s;

    public h3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18504c = z10;
        this.f18503b = str;
        this.d = z11;
        this.f18505f = inputFile;
        this.h = inputEncryptedFile;
        this.f18506n = bArr;
        this.f18507r = bArr2;
        this.f18508s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18502a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18504c, this.f18503b, this.d, (TLRPC.InputFile) this.f18505f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18506n, (byte[]) this.f18507r, (FileUploadOperation) this.f18508s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f18505f, (pf.c) this.h, (boolean[]) this.f18506n, (TLRPC.User) this.f18507r, this.f18503b, this.f18504c, this.d, (TL_bots.BotInfo[]) this.f18508s);
                return;
        }
    }

    public h3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18505f = n2Var;
        this.h = cVar;
        this.f18506n = zArr;
        this.f18507r = user;
        this.f18503b = str;
        this.f18504c = z10;
        this.d = z11;
        this.f18508s = botInfoArr;
    }
}
