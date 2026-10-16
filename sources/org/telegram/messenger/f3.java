package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class f3 implements Runnable {
    public final int f16904a = 0;
    public final String f16905b;
    public final boolean f16906c;
    public final boolean d;
    public final Object e;
    public final Object f16907f;
    public final Object h;
    public final Object f16908n;
    public final Object f16909r;
    public final Object f16910s;

    public f3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f16906c = z10;
        this.f16905b = str;
        this.d = z11;
        this.f16907f = inputFile;
        this.h = inputEncryptedFile;
        this.f16908n = bArr;
        this.f16909r = bArr2;
        this.f16910s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16904a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f16906c, this.f16905b, this.d, (TLRPC.InputFile) this.f16907f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f16908n, (byte[]) this.f16909r, (FileUploadOperation) this.f16910s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.m2) this.f16907f, (pf.c) this.h, (boolean[]) this.f16908n, (TLRPC.User) this.f16909r, this.f16905b, this.f16906c, this.d, (TL_bots.BotInfo[]) this.f16910s);
                return;
        }
    }

    public f3(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f16907f = m2Var;
        this.h = cVar;
        this.f16908n = zArr;
        this.f16909r = user;
        this.f16905b = str;
        this.f16906c = z10;
        this.d = z11;
        this.f16910s = botInfoArr;
    }
}
