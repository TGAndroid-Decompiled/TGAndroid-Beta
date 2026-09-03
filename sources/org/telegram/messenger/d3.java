package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class d3 implements Runnable {
    public final int f17004a = 0;
    public final String f17005b;
    public final boolean f17006c;
    public final boolean d;
    public final Object e;
    public final Object f17007f;
    public final Object h;
    public final Object f17008n;
    public final Object f17009r;
    public final Object f17010s;

    public d3(FileLoader.AnonymousClass1 anonymousClass1, boolean z4, String str, boolean z10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f17006c = z4;
        this.f17005b = str;
        this.d = z10;
        this.f17007f = inputFile;
        this.h = inputEncryptedFile;
        this.f17008n = bArr;
        this.f17009r = bArr2;
        this.f17010s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17004a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f17006c, this.f17005b, this.d, (TLRPC.InputFile) this.f17007f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17008n, (byte[]) this.f17009r, (FileUploadOperation) this.f17010s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.p2) this.f17007f, (ze.c) this.h, (boolean[]) this.f17008n, (TLRPC.User) this.f17009r, this.f17005b, this.f17006c, this.d, (TL_bots.BotInfo[]) this.f17010s);
                return;
        }
    }

    public d3(MessagesController messagesController, org.telegram.ui.ActionBar.p2 p2Var, ze.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z4, boolean z10, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f17007f = p2Var;
        this.h = cVar;
        this.f17008n = zArr;
        this.f17009r = user;
        this.f17005b = str;
        this.f17006c = z4;
        this.d = z10;
        this.f17010s = botInfoArr;
    }
}
