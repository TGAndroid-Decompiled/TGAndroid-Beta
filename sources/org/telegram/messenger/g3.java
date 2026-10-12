package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class g3 implements Runnable {
    public final int f17643a = 0;
    public final String f17644b;
    public final boolean f17645c;
    public final boolean d;
    public final Object f17646e;
    public final Object f17647f;
    public final Object h;
    public final Object f17648n;
    public final Object f17649r;
    public final Object f17650s;

    public g3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17646e = anonymousClass1;
        this.f17645c = z10;
        this.f17644b = str;
        this.d = z11;
        this.f17647f = inputFile;
        this.h = inputEncryptedFile;
        this.f17648n = bArr;
        this.f17649r = bArr2;
        this.f17650s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17643a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17646e).lambda$didFinishUploadingFile$0(this.f17645c, this.f17644b, this.d, (TLRPC.InputFile) this.f17647f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17648n, (byte[]) this.f17649r, (FileUploadOperation) this.f17650s);
                return;
            default:
                ((MessagesController) this.f17646e).lambda$openApp$501((org.telegram.ui.ActionBar.m2) this.f17647f, (of.e) this.h, (boolean[]) this.f17648n, (TLRPC.User) this.f17649r, this.f17644b, this.f17645c, this.d, (TL_bots.BotInfo[]) this.f17650s);
                return;
        }
    }

    public g3(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, of.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17646e = messagesController;
        this.f17647f = m2Var;
        this.h = eVar;
        this.f17648n = zArr;
        this.f17649r = user;
        this.f17644b = str;
        this.f17645c = z10;
        this.d = z11;
        this.f17650s = botInfoArr;
    }
}
