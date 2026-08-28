package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class b3 implements Runnable {
    public final int f19795a = 0;
    public final String f19796b;
    public final boolean f19797c;
    public final boolean d;
    public final Object f19798e;
    public final Object f19799f;
    public final Object h;
    public final Object f19800n;
    public final Object f19801r;
    public final Object f19802s;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f19798e = anonymousClass1;
        this.f19797c = z10;
        this.f19796b = str;
        this.d = z11;
        this.f19799f = inputFile;
        this.h = inputEncryptedFile;
        this.f19800n = bArr;
        this.f19801r = bArr2;
        this.f19802s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19795a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f19798e).lambda$didFinishUploadingFile$0(this.f19797c, this.f19796b, this.d, (TLRPC.InputFile) this.f19799f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f19800n, (byte[]) this.f19801r, (FileUploadOperation) this.f19802s);
                return;
            default:
                ((MessagesController) this.f19798e).lambda$openApp$498((org.telegram.ui.ActionBar.o2) this.f19799f, (ve.d) this.h, (boolean[]) this.f19800n, (TLRPC.User) this.f19801r, this.f19796b, this.f19797c, this.d, (TL_bots.BotInfo[]) this.f19802s);
                return;
        }
    }

    public b3(MessagesController messagesController, org.telegram.ui.ActionBar.o2 o2Var, ve.d dVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f19798e = messagesController;
        this.f19799f = o2Var;
        this.h = dVar;
        this.f19800n = zArr;
        this.f19801r = user;
        this.f19796b = str;
        this.f19797c = z10;
        this.d = z11;
        this.f19802s = botInfoArr;
    }
}
