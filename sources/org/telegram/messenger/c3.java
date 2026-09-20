package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f16021a = 0;
    public final String f16022b;
    public final boolean f16023c;
    public final boolean d;
    public final Object e;
    public final Object f16024f;
    public final Object h;
    public final Object f16025n;
    public final Object f16026r;
    public final Object f16027s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f16023c = z10;
        this.f16022b = str;
        this.d = z11;
        this.f16024f = inputFile;
        this.h = inputEncryptedFile;
        this.f16025n = bArr;
        this.f16026r = bArr2;
        this.f16027s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16021a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f16023c, this.f16022b, this.d, (TLRPC.InputFile) this.f16024f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f16025n, (byte[]) this.f16026r, (FileUploadOperation) this.f16027s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f16024f, (nf.e) this.h, (boolean[]) this.f16025n, (TLRPC.User) this.f16026r, this.f16022b, this.f16023c, this.d, (TL_bots.BotInfo[]) this.f16027s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f16024f = n2Var;
        this.h = eVar;
        this.f16025n = zArr;
        this.f16026r = user;
        this.f16022b = str;
        this.f16023c = z10;
        this.d = z11;
        this.f16027s = botInfoArr;
    }
}
