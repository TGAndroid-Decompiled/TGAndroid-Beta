package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class i3 implements Runnable {
    public final int f20302a = 0;
    public final String f20303b;
    public final boolean f20304c;
    public final boolean d;
    public final Object e;
    public final Object f20305f;
    public final Object h;
    public final Object f20306n;
    public final Object f20307r;
    public final Object f20308s;

    public i3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f20304c = z10;
        this.f20303b = str;
        this.d = z11;
        this.f20305f = inputFile;
        this.h = inputEncryptedFile;
        this.f20306n = bArr;
        this.f20307r = bArr2;
        this.f20308s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f20302a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f20304c, this.f20303b, this.d, (TLRPC.InputFile) this.f20305f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f20306n, (byte[]) this.f20307r, (FileUploadOperation) this.f20308s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$503((org.telegram.ui.ActionBar.r2) this.f20305f, (qf.c) this.h, (boolean[]) this.f20306n, (TLRPC.User) this.f20307r, this.f20303b, this.f20304c, this.d, (TL_bots.BotInfo[]) this.f20308s);
                return;
        }
    }

    public i3(MessagesController messagesController, org.telegram.ui.ActionBar.r2 r2Var, qf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f20305f = r2Var;
        this.h = cVar;
        this.f20306n = zArr;
        this.f20307r = user;
        this.f20303b = str;
        this.f20304c = z10;
        this.d = z11;
        this.f20308s = botInfoArr;
    }
}
