package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f16042a = 0;
    public final String f16043b;
    public final boolean f16044c;
    public final boolean d;
    public final Object e;
    public final Object f16045f;
    public final Object h;
    public final Object f16046n;
    public final Object f16047r;
    public final Object f16048s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f16044c = z10;
        this.f16043b = str;
        this.d = z11;
        this.f16045f = inputFile;
        this.h = inputEncryptedFile;
        this.f16046n = bArr;
        this.f16047r = bArr2;
        this.f16048s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16042a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f16044c, this.f16043b, this.d, (TLRPC.InputFile) this.f16045f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f16046n, (byte[]) this.f16047r, (FileUploadOperation) this.f16048s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.o2) this.f16045f, (nf.e) this.h, (boolean[]) this.f16046n, (TLRPC.User) this.f16047r, this.f16043b, this.f16044c, this.d, (TL_bots.BotInfo[]) this.f16048s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.o2 o2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f16045f = o2Var;
        this.h = eVar;
        this.f16046n = zArr;
        this.f16047r = user;
        this.f16043b = str;
        this.f16044c = z10;
        this.d = z11;
        this.f16048s = botInfoArr;
    }
}
