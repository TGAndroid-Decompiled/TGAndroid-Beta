package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class d3 implements Runnable {
    public final int f18451a = 0;
    public final String f18452b;
    public final boolean f18453c;
    public final boolean d;
    public final Object f18454e;
    public final Object f18455f;
    public final Object h;
    public final Object f18456n;
    public final Object f18457r;
    public final Object f18458s;

    public d3(FileLoader.AnonymousClass1 anonymousClass1, boolean z4, String str, boolean z10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f18454e = anonymousClass1;
        this.f18453c = z4;
        this.f18452b = str;
        this.d = z10;
        this.f18455f = inputFile;
        this.h = inputEncryptedFile;
        this.f18456n = bArr;
        this.f18457r = bArr2;
        this.f18458s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18451a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f18454e).lambda$didFinishUploadingFile$0(this.f18453c, this.f18452b, this.d, (TLRPC.InputFile) this.f18455f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18456n, (byte[]) this.f18457r, (FileUploadOperation) this.f18458s);
                return;
            default:
                ((MessagesController) this.f18454e).lambda$openApp$498((org.telegram.ui.ActionBar.p2) this.f18455f, (af.f) this.h, (boolean[]) this.f18456n, (TLRPC.User) this.f18457r, this.f18452b, this.f18453c, this.d, (TL_bots.BotInfo[]) this.f18458s);
                return;
        }
    }

    public d3(MessagesController messagesController, org.telegram.ui.ActionBar.p2 p2Var, af.f fVar, boolean[] zArr, TLRPC.User user, String str, boolean z4, boolean z10, TL_bots.BotInfo[] botInfoArr) {
        this.f18454e = messagesController;
        this.f18455f = p2Var;
        this.h = fVar;
        this.f18456n = zArr;
        this.f18457r = user;
        this.f18452b = str;
        this.f18453c = z4;
        this.d = z10;
        this.f18458s = botInfoArr;
    }
}
