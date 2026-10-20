package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class g3 implements Runnable {
    public final int f18408a = 0;
    public final String f18409b;
    public final boolean f18410c;
    public final boolean d;
    public final Object e;
    public final Object f18411f;
    public final Object h;
    public final Object f18412n;
    public final Object f18413r;
    public final Object f18414s;

    public g3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18410c = z10;
        this.f18409b = str;
        this.d = z11;
        this.f18411f = inputFile;
        this.h = inputEncryptedFile;
        this.f18412n = bArr;
        this.f18413r = bArr2;
        this.f18414s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18408a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18410c, this.f18409b, this.d, (TLRPC.InputFile) this.f18411f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18412n, (byte[]) this.f18413r, (FileUploadOperation) this.f18414s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f18411f, (pf.c) this.h, (boolean[]) this.f18412n, (TLRPC.User) this.f18413r, this.f18409b, this.f18410c, this.d, (TL_bots.BotInfo[]) this.f18414s);
                return;
        }
    }

    public g3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18411f = n2Var;
        this.h = cVar;
        this.f18412n = zArr;
        this.f18413r = user;
        this.f18409b = str;
        this.f18410c = z10;
        this.d = z11;
        this.f18414s = botInfoArr;
    }
}
