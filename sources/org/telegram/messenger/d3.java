package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

public final class d3 implements Runnable {

    public final int f20010a = 0;

    public final String f20011b;

    public final boolean f20012c;
    public final boolean d;

    public final Object f20013e;

    public final Object f20014f;
    public final Object h;

    public final Object f20015n;

    public final Object f20016r;

    public final Object f20017s;

    public d3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f20013e = anonymousClass1;
        this.f20012c = z10;
        this.f20011b = str;
        this.d = z11;
        this.f20014f = inputFile;
        this.h = inputEncryptedFile;
        this.f20015n = bArr;
        this.f20016r = bArr2;
        this.f20017s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f20010a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f20013e).lambda$didFinishUploadingFile$0(this.f20012c, this.f20011b, this.d, (TLRPC.InputFile) this.f20014f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f20015n, (byte[]) this.f20016r, (FileUploadOperation) this.f20017s);
                break;
            default:
                ((MessagesController) this.f20013e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f20014f, (we.d) this.h, (boolean[]) this.f20015n, (TLRPC.User) this.f20016r, this.f20011b, this.f20012c, this.d, (TL_bots.BotInfo[]) this.f20017s);
                break;
        }
    }

    public d3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, we.d dVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f20013e = messagesController;
        this.f20014f = n2Var;
        this.h = dVar;
        this.f20015n = zArr;
        this.f20016r = user;
        this.f20011b = str;
        this.f20012c = z10;
        this.d = z11;
        this.f20017s = botInfoArr;
    }
}
