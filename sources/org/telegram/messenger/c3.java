package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17513a = 0;
    public final String f17514b;
    public final boolean f17515c;
    public final boolean d;
    public final Object f17516e;
    public final Object f17517f;
    public final Object h;
    public final Object f17518n;
    public final Object f17519r;
    public final Object f17520s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17516e = anonymousClass1;
        this.f17515c = z10;
        this.f17514b = str;
        this.d = z11;
        this.f17517f = inputFile;
        this.h = inputEncryptedFile;
        this.f17518n = bArr;
        this.f17519r = bArr2;
        this.f17520s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17513a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17516e).lambda$didFinishUploadingFile$0(this.f17515c, this.f17514b, this.d, (TLRPC.InputFile) this.f17517f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17518n, (byte[]) this.f17519r, (FileUploadOperation) this.f17520s);
                return;
            default:
                ((MessagesController) this.f17516e).lambda$openApp$501((org.telegram.ui.ActionBar.m2) this.f17517f, (of.e) this.h, (boolean[]) this.f17518n, (TLRPC.User) this.f17519r, this.f17514b, this.f17515c, this.d, (TL_bots.BotInfo[]) this.f17520s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, of.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17516e = messagesController;
        this.f17517f = m2Var;
        this.h = eVar;
        this.f17518n = zArr;
        this.f17519r = user;
        this.f17514b = str;
        this.f17515c = z10;
        this.d = z11;
        this.f17520s = botInfoArr;
    }
}
