package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f15800a = 0;
    public final String f15801b;
    public final boolean f15802c;
    public final boolean d;
    public final Object e;
    public final Object f15803f;
    public final Object h;
    public final Object f15804n;
    public final Object f15805r;
    public final Object f15806s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f15802c = z10;
        this.f15801b = str;
        this.d = z11;
        this.f15803f = inputFile;
        this.h = inputEncryptedFile;
        this.f15804n = bArr;
        this.f15805r = bArr2;
        this.f15806s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f15800a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f15802c, this.f15801b, this.d, (TLRPC.InputFile) this.f15803f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f15804n, (byte[]) this.f15805r, (FileUploadOperation) this.f15806s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f15803f, (nf.e) this.h, (boolean[]) this.f15804n, (TLRPC.User) this.f15805r, this.f15801b, this.f15802c, this.d, (TL_bots.BotInfo[]) this.f15806s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f15803f = n2Var;
        this.h = eVar;
        this.f15804n = zArr;
        this.f15805r = user;
        this.f15801b = str;
        this.f15802c = z10;
        this.d = z11;
        this.f15806s = botInfoArr;
    }
}
