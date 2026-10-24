package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class h3 implements Runnable {
    public final int f18548a = 0;
    public final String f18549b;
    public final boolean f18550c;
    public final boolean d;
    public final Object e;
    public final Object f18551f;
    public final Object h;
    public final Object f18552n;
    public final Object f18553r;
    public final Object f18554s;

    public h3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f18550c = z10;
        this.f18549b = str;
        this.d = z11;
        this.f18551f = inputFile;
        this.h = inputEncryptedFile;
        this.f18552n = bArr;
        this.f18553r = bArr2;
        this.f18554s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18548a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f18550c, this.f18549b, this.d, (TLRPC.InputFile) this.f18551f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18552n, (byte[]) this.f18553r, (FileUploadOperation) this.f18554s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.o2) this.f18551f, (pf.c) this.h, (boolean[]) this.f18552n, (TLRPC.User) this.f18553r, this.f18549b, this.f18550c, this.d, (TL_bots.BotInfo[]) this.f18554s);
                return;
        }
    }

    public h3(MessagesController messagesController, org.telegram.ui.ActionBar.o2 o2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f18551f = o2Var;
        this.h = cVar;
        this.f18552n = zArr;
        this.f18553r = user;
        this.f18549b = str;
        this.f18550c = z10;
        this.d = z11;
        this.f18554s = botInfoArr;
    }
}
