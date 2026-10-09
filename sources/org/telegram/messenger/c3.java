package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17475a = 0;
    public final String f17476b;
    public final boolean f17477c;
    public final boolean d;
    public final Object f17478e;
    public final Object f17479f;
    public final Object h;
    public final Object f17480n;
    public final Object f17481r;
    public final Object f17482s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17478e = anonymousClass1;
        this.f17477c = z10;
        this.f17476b = str;
        this.d = z11;
        this.f17479f = inputFile;
        this.h = inputEncryptedFile;
        this.f17480n = bArr;
        this.f17481r = bArr2;
        this.f17482s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17475a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17478e).lambda$didFinishUploadingFile$0(this.f17477c, this.f17476b, this.d, (TLRPC.InputFile) this.f17479f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17480n, (byte[]) this.f17481r, (FileUploadOperation) this.f17482s);
                return;
            default:
                ((MessagesController) this.f17478e).lambda$openApp$501((org.telegram.ui.ActionBar.n2) this.f17479f, (of.e) this.h, (boolean[]) this.f17480n, (TLRPC.User) this.f17481r, this.f17476b, this.f17477c, this.d, (TL_bots.BotInfo[]) this.f17482s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, of.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17478e = messagesController;
        this.f17479f = n2Var;
        this.h = eVar;
        this.f17480n = zArr;
        this.f17481r = user;
        this.f17476b = str;
        this.f17477c = z10;
        this.d = z11;
        this.f17482s = botInfoArr;
    }
}
