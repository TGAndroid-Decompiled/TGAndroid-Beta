package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17297a = 0;
    public final String f17298b;
    public final boolean f17299c;
    public final boolean d;
    public final Object f17300e;
    public final Object f17301f;
    public final Object h;
    public final Object f17302n;
    public final Object f17303r;
    public final Object f17304s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17300e = anonymousClass1;
        this.f17299c = z10;
        this.f17298b = str;
        this.d = z11;
        this.f17301f = inputFile;
        this.h = inputEncryptedFile;
        this.f17302n = bArr;
        this.f17303r = bArr2;
        this.f17304s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17297a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17300e).lambda$didFinishUploadingFile$0(this.f17299c, this.f17298b, this.d, (TLRPC.InputFile) this.f17301f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17302n, (byte[]) this.f17303r, (FileUploadOperation) this.f17304s);
                return;
            default:
                ((MessagesController) this.f17300e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f17301f, (of.e) this.h, (boolean[]) this.f17302n, (TLRPC.User) this.f17303r, this.f17298b, this.f17299c, this.d, (TL_bots.BotInfo[]) this.f17304s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, of.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17300e = messagesController;
        this.f17301f = n2Var;
        this.h = eVar;
        this.f17302n = zArr;
        this.f17303r = user;
        this.f17298b = str;
        this.f17299c = z10;
        this.d = z11;
        this.f17304s = botInfoArr;
    }
}
