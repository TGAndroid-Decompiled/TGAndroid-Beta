package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class f3 implements Runnable {
    public final int f18332a = 0;
    public final String f18333b;
    public final boolean f18334c;
    public final boolean d;
    public final Object e;
    public final Object f18335f;
    public final Object h;
    public final Object f18336n;
    public final Object f18337r;
    public final Object f18338s;

    public f3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18334c = z10;
        this.f18333b = str;
        this.d = z11;
        this.f18335f = inputFile;
        this.h = inputEncryptedFile;
        this.f18336n = bArr;
        this.f18337r = bArr2;
        this.f18338s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18332a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18334c, this.f18333b, this.d, (TLRPC.InputFile) this.f18335f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18336n, (byte[]) this.f18337r, (FileUploadOperation) this.f18338s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f18335f, (pf.c) this.h, (boolean[]) this.f18336n, (TLRPC.User) this.f18337r, this.f18333b, this.f18334c, this.d, (TL_bots.BotInfo[]) this.f18338s);
                return;
        }
    }

    public f3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18335f = n2Var;
        this.h = cVar;
        this.f18336n = zArr;
        this.f18337r = user;
        this.f18333b = str;
        this.f18334c = z10;
        this.d = z11;
        this.f18338s = botInfoArr;
    }
}
