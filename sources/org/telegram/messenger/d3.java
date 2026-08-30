package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class d3 implements Runnable {
    public final int f17021a = 0;
    public final String f17022b;
    public final boolean f17023c;
    public final boolean d;
    public final Object e;
    public final Object f17024f;
    public final Object h;
    public final Object f17025n;
    public final Object f17026r;
    public final Object f17027s;

    public d3(FileLoader.AnonymousClass1 anonymousClass1, boolean z4, String str, boolean z10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f17023c = z4;
        this.f17022b = str;
        this.d = z10;
        this.f17024f = inputFile;
        this.h = inputEncryptedFile;
        this.f17025n = bArr;
        this.f17026r = bArr2;
        this.f17027s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17021a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f17023c, this.f17022b, this.d, (TLRPC.InputFile) this.f17024f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17025n, (byte[]) this.f17026r, (FileUploadOperation) this.f17027s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.p2) this.f17024f, (af.f) this.h, (boolean[]) this.f17025n, (TLRPC.User) this.f17026r, this.f17022b, this.f17023c, this.d, (TL_bots.BotInfo[]) this.f17027s);
                return;
        }
    }

    public d3(MessagesController messagesController, org.telegram.ui.ActionBar.p2 p2Var, af.f fVar, boolean[] zArr, TLRPC.User user, String str, boolean z4, boolean z10, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f17024f = p2Var;
        this.h = fVar;
        this.f17025n = zArr;
        this.f17026r = user;
        this.f17022b = str;
        this.f17023c = z4;
        this.d = z10;
        this.f17027s = botInfoArr;
    }
}
