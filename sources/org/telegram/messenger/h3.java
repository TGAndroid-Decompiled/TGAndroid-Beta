package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class h3 implements Runnable {
    public final int f18483a = 0;
    public final String f18484b;
    public final boolean f18485c;
    public final boolean d;
    public final Object e;
    public final Object f18486f;
    public final Object h;
    public final Object f18487n;
    public final Object f18488r;
    public final Object f18489s;

    public h3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18485c = z10;
        this.f18484b = str;
        this.d = z11;
        this.f18486f = inputFile;
        this.h = inputEncryptedFile;
        this.f18487n = bArr;
        this.f18488r = bArr2;
        this.f18489s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18483a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18485c, this.f18484b, this.d, (TLRPC.InputFile) this.f18486f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18487n, (byte[]) this.f18488r, (FileUploadOperation) this.f18489s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f18486f, (pf.c) this.h, (boolean[]) this.f18487n, (TLRPC.User) this.f18488r, this.f18484b, this.f18485c, this.d, (TL_bots.BotInfo[]) this.f18489s);
                return;
        }
    }

    public h3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18486f = n2Var;
        this.h = cVar;
        this.f18487n = zArr;
        this.f18488r = user;
        this.f18484b = str;
        this.f18485c = z10;
        this.d = z11;
        this.f18489s = botInfoArr;
    }
}
