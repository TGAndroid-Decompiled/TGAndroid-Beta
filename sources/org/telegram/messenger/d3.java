package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class d3 implements Runnable {
    public final int f18449a = 0;
    public final String f18450b;
    public final boolean f18451c;
    public final boolean d;
    public final Object f18452e;
    public final Object f18453f;
    public final Object h;
    public final Object f18454n;
    public final Object f18455r;
    public final Object f18456s;

    public d3(FileLoader.AnonymousClass1 anonymousClass1, boolean z4, String str, boolean z10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f18452e = anonymousClass1;
        this.f18451c = z4;
        this.f18450b = str;
        this.d = z10;
        this.f18453f = inputFile;
        this.h = inputEncryptedFile;
        this.f18454n = bArr;
        this.f18455r = bArr2;
        this.f18456s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18449a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f18452e).lambda$didFinishUploadingFile$0(this.f18451c, this.f18450b, this.d, (TLRPC.InputFile) this.f18453f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f18454n, (byte[]) this.f18455r, (FileUploadOperation) this.f18456s);
                return;
            default:
                ((MessagesController) this.f18452e).lambda$openApp$498((org.telegram.ui.ActionBar.p2) this.f18453f, (af.f) this.h, (boolean[]) this.f18454n, (TLRPC.User) this.f18455r, this.f18450b, this.f18451c, this.d, (TL_bots.BotInfo[]) this.f18456s);
                return;
        }
    }

    public d3(MessagesController messagesController, org.telegram.ui.ActionBar.p2 p2Var, af.f fVar, boolean[] zArr, TLRPC.User user, String str, boolean z4, boolean z10, TL_bots.BotInfo[] botInfoArr) {
        this.f18452e = messagesController;
        this.f18453f = p2Var;
        this.h = fVar;
        this.f18454n = zArr;
        this.f18455r = user;
        this.f18450b = str;
        this.f18451c = z4;
        this.d = z10;
        this.f18456s = botInfoArr;
    }
}
