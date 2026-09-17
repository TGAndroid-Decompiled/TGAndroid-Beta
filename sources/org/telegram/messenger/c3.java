package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17344a = 0;
    public final String f17345b;
    public final boolean f17346c;
    public final boolean d;
    public final Object f17347e;
    public final Object f17348f;
    public final Object h;
    public final Object f17349n;
    public final Object f17350r;
    public final Object f17351s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17347e = anonymousClass1;
        this.f17346c = z10;
        this.f17345b = str;
        this.d = z11;
        this.f17348f = inputFile;
        this.h = inputEncryptedFile;
        this.f17349n = bArr;
        this.f17350r = bArr2;
        this.f17351s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17344a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17347e).lambda$didFinishUploadingFile$0(this.f17346c, this.f17345b, this.d, (TLRPC.InputFile) this.f17348f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17349n, (byte[]) this.f17350r, (FileUploadOperation) this.f17351s);
                return;
            default:
                ((MessagesController) this.f17347e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f17348f, (of.e) this.h, (boolean[]) this.f17349n, (TLRPC.User) this.f17350r, this.f17345b, this.f17346c, this.d, (TL_bots.BotInfo[]) this.f17351s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, of.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17347e = messagesController;
        this.f17348f = n2Var;
        this.h = eVar;
        this.f17349n = zArr;
        this.f17350r = user;
        this.f17345b = str;
        this.f17346c = z10;
        this.d = z11;
        this.f17351s = botInfoArr;
    }
}
