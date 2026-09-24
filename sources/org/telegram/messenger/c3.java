package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f16033a = 0;
    public final String f16034b;
    public final boolean f16035c;
    public final boolean d;
    public final Object e;
    public final Object f16036f;
    public final Object h;
    public final Object f16037n;
    public final Object f16038r;
    public final Object f16039s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f16035c = z10;
        this.f16034b = str;
        this.d = z11;
        this.f16036f = inputFile;
        this.h = inputEncryptedFile;
        this.f16037n = bArr;
        this.f16038r = bArr2;
        this.f16039s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16033a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f16035c, this.f16034b, this.d, (TLRPC.InputFile) this.f16036f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f16037n, (byte[]) this.f16038r, (FileUploadOperation) this.f16039s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.m2) this.f16036f, (nf.e) this.h, (boolean[]) this.f16037n, (TLRPC.User) this.f16038r, this.f16034b, this.f16035c, this.d, (TL_bots.BotInfo[]) this.f16039s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f16036f = m2Var;
        this.h = eVar;
        this.f16037n = zArr;
        this.f16038r = user;
        this.f16034b = str;
        this.f16035c = z10;
        this.d = z11;
        this.f16039s = botInfoArr;
    }
}
