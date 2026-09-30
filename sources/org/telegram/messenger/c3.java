package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f16065a = 0;
    public final String f16066b;
    public final boolean f16067c;
    public final boolean d;
    public final Object e;
    public final Object f16068f;
    public final Object h;
    public final Object f16069n;
    public final Object f16070r;
    public final Object f16071s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f16067c = z10;
        this.f16066b = str;
        this.d = z11;
        this.f16068f = inputFile;
        this.h = inputEncryptedFile;
        this.f16069n = bArr;
        this.f16070r = bArr2;
        this.f16071s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16065a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f16067c, this.f16066b, this.d, (TLRPC.InputFile) this.f16068f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f16069n, (byte[]) this.f16070r, (FileUploadOperation) this.f16071s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.m2) this.f16068f, (nf.e) this.h, (boolean[]) this.f16069n, (TLRPC.User) this.f16070r, this.f16066b, this.f16067c, this.d, (TL_bots.BotInfo[]) this.f16071s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f16068f = m2Var;
        this.h = eVar;
        this.f16069n = zArr;
        this.f16070r = user;
        this.f16066b = str;
        this.f16067c = z10;
        this.d = z11;
        this.f16071s = botInfoArr;
    }
}
