package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class f3 implements Runnable {
    public final int f18318a = 0;
    public final String f18319b;
    public final boolean f18320c;
    public final boolean d;
    public final Object e;
    public final Object f18321f;
    public final Object h;
    public final Object f18322n;
    public final Object f18323r;
    public final Object f18324s;

    public f3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18320c = z10;
        this.f18319b = str;
        this.d = z11;
        this.f18321f = inputFile;
        this.h = inputEncryptedFile;
        this.f18322n = bArr;
        this.f18323r = bArr2;
        this.f18324s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18318a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18320c, this.f18319b, this.d, (TLRPC.InputFile) this.f18321f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18322n, (byte[]) this.f18323r, (FileUploadOperation) this.f18324s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f18321f, (pf.c) this.h, (boolean[]) this.f18322n, (TLRPC.User) this.f18323r, this.f18319b, this.f18320c, this.d, (TL_bots.BotInfo[]) this.f18324s);
                return;
        }
    }

    public f3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18321f = n2Var;
        this.h = cVar;
        this.f18322n = zArr;
        this.f18323r = user;
        this.f18319b = str;
        this.f18320c = z10;
        this.d = z11;
        this.f18324s = botInfoArr;
    }
}
