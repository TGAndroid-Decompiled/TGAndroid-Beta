package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17324a = 0;
    public final String f17325b;
    public final boolean f17326c;
    public final boolean d;
    public final Object f17327e;
    public final Object f17328f;
    public final Object h;
    public final Object f17329n;
    public final Object f17330r;
    public final Object f17331s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17327e = anonymousClass1;
        this.f17326c = z10;
        this.f17325b = str;
        this.d = z11;
        this.f17328f = inputFile;
        this.h = inputEncryptedFile;
        this.f17329n = bArr;
        this.f17330r = bArr2;
        this.f17331s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17324a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17327e).lambda$didFinishUploadingFile$0(this.f17326c, this.f17325b, this.d, (TLRPC.InputFile) this.f17328f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17329n, (byte[]) this.f17330r, (FileUploadOperation) this.f17331s);
                return;
            default:
                ((MessagesController) this.f17327e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f17328f, (of.e) this.h, (boolean[]) this.f17329n, (TLRPC.User) this.f17330r, this.f17325b, this.f17326c, this.d, (TL_bots.BotInfo[]) this.f17331s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, of.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17327e = messagesController;
        this.f17328f = n2Var;
        this.h = eVar;
        this.f17329n = zArr;
        this.f17330r = user;
        this.f17325b = str;
        this.f17326c = z10;
        this.d = z11;
        this.f17331s = botInfoArr;
    }
}
