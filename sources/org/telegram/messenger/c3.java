package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f15988a = 0;
    public final String f15989b;
    public final boolean f15990c;
    public final boolean d;
    public final Object e;
    public final Object f15991f;
    public final Object h;
    public final Object f15992n;
    public final Object f15993r;
    public final Object f15994s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f15990c = z10;
        this.f15989b = str;
        this.d = z11;
        this.f15991f = inputFile;
        this.h = inputEncryptedFile;
        this.f15992n = bArr;
        this.f15993r = bArr2;
        this.f15994s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f15988a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f15990c, this.f15989b, this.d, (TLRPC.InputFile) this.f15991f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f15992n, (byte[]) this.f15993r, (FileUploadOperation) this.f15994s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f15991f, (nf.e) this.h, (boolean[]) this.f15992n, (TLRPC.User) this.f15993r, this.f15989b, this.f15990c, this.d, (TL_bots.BotInfo[]) this.f15994s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f15991f = n2Var;
        this.h = eVar;
        this.f15992n = zArr;
        this.f15993r = user;
        this.f15989b = str;
        this.f15990c = z10;
        this.d = z11;
        this.f15994s = botInfoArr;
    }
}
