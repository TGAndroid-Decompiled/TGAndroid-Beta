package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f16036a = 0;
    public final String f16037b;
    public final boolean f16038c;
    public final boolean d;
    public final Object e;
    public final Object f16039f;
    public final Object h;
    public final Object f16040n;
    public final Object f16041r;
    public final Object f16042s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f16038c = z10;
        this.f16037b = str;
        this.d = z11;
        this.f16039f = inputFile;
        this.h = inputEncryptedFile;
        this.f16040n = bArr;
        this.f16041r = bArr2;
        this.f16042s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16036a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f16038c, this.f16037b, this.d, (TLRPC.InputFile) this.f16039f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f16040n, (byte[]) this.f16041r, (FileUploadOperation) this.f16042s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f16039f, (nf.e) this.h, (boolean[]) this.f16040n, (TLRPC.User) this.f16041r, this.f16037b, this.f16038c, this.d, (TL_bots.BotInfo[]) this.f16042s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f16039f = n2Var;
        this.h = eVar;
        this.f16040n = zArr;
        this.f16041r = user;
        this.f16037b = str;
        this.f16038c = z10;
        this.d = z11;
        this.f16042s = botInfoArr;
    }
}
