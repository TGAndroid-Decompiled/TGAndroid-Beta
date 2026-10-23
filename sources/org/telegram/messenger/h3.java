package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class h3 implements Runnable {
    public final int f18568a = 0;
    public final String f18569b;
    public final boolean f18570c;
    public final boolean d;
    public final Object e;
    public final Object f18571f;
    public final Object h;
    public final Object f18572n;
    public final Object f18573r;
    public final Object f18574s;

    public h3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18570c = z10;
        this.f18569b = str;
        this.d = z11;
        this.f18571f = inputFile;
        this.h = inputEncryptedFile;
        this.f18572n = bArr;
        this.f18573r = bArr2;
        this.f18574s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18568a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18570c, this.f18569b, this.d, (TLRPC.InputFile) this.f18571f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18572n, (byte[]) this.f18573r, (FileUploadOperation) this.f18574s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.o2) this.f18571f, (pf.c) this.h, (boolean[]) this.f18572n, (TLRPC.User) this.f18573r, this.f18569b, this.f18570c, this.d, (TL_bots.BotInfo[]) this.f18574s);
                return;
        }
    }

    public h3(MessagesController messagesController, org.telegram.ui.ActionBar.o2 o2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18571f = o2Var;
        this.h = cVar;
        this.f18572n = zArr;
        this.f18573r = user;
        this.f18569b = str;
        this.f18570c = z10;
        this.d = z11;
        this.f18574s = botInfoArr;
    }
}
