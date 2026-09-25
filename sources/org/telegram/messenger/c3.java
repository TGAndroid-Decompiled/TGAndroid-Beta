package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f16048a = 0;
    public final String f16049b;
    public final boolean f16050c;
    public final boolean d;
    public final Object e;
    public final Object f16051f;
    public final Object h;
    public final Object f16052n;
    public final Object f16053r;
    public final Object f16054s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f16050c = z10;
        this.f16049b = str;
        this.d = z11;
        this.f16051f = inputFile;
        this.h = inputEncryptedFile;
        this.f16052n = bArr;
        this.f16053r = bArr2;
        this.f16054s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16048a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f16050c, this.f16049b, this.d, (TLRPC.InputFile) this.f16051f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f16052n, (byte[]) this.f16053r, (FileUploadOperation) this.f16054s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.m2) this.f16051f, (nf.e) this.h, (boolean[]) this.f16052n, (TLRPC.User) this.f16053r, this.f16049b, this.f16050c, this.d, (TL_bots.BotInfo[]) this.f16054s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f16051f = m2Var;
        this.h = eVar;
        this.f16052n = zArr;
        this.f16053r = user;
        this.f16049b = str;
        this.f16050c = z10;
        this.d = z11;
        this.f16054s = botInfoArr;
    }
}
