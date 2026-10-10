package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17479a = 0;
    public final String f17480b;
    public final boolean f17481c;
    public final boolean d;
    public final Object f17482e;
    public final Object f17483f;
    public final Object h;
    public final Object f17484n;
    public final Object f17485r;
    public final Object f17486s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17482e = anonymousClass1;
        this.f17481c = z10;
        this.f17480b = str;
        this.d = z11;
        this.f17483f = inputFile;
        this.h = inputEncryptedFile;
        this.f17484n = bArr;
        this.f17485r = bArr2;
        this.f17486s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17479a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17482e).lambda$didFinishUploadingFile$0(this.f17481c, this.f17480b, this.d, (TLRPC.InputFile) this.f17483f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17484n, (byte[]) this.f17485r, (FileUploadOperation) this.f17486s);
                return;
            default:
                ((MessagesController) this.f17482e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f17483f, (of.e) this.h, (boolean[]) this.f17484n, (TLRPC.User) this.f17485r, this.f17480b, this.f17481c, this.d, (TL_bots.BotInfo[]) this.f17486s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, of.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17482e = messagesController;
        this.f17483f = n2Var;
        this.h = eVar;
        this.f17484n = zArr;
        this.f17485r = user;
        this.f17480b = str;
        this.f17481c = z10;
        this.d = z11;
        this.f17486s = botInfoArr;
    }
}
