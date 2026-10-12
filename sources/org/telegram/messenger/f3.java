package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class f3 implements Runnable {
    public final int f17205a = 0;
    public final String f17206b;
    public final boolean f17207c;
    public final boolean d;
    public final Object e;
    public final Object f17208f;
    public final Object h;
    public final Object f17209n;
    public final Object f17210r;
    public final Object f17211s;

    public f3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = anonymousClass1;
        this.f17207c = z10;
        this.f17206b = str;
        this.d = z11;
        this.f17208f = inputFile;
        this.h = inputEncryptedFile;
        this.f17209n = bArr;
        this.f17210r = bArr2;
        this.f17211s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17205a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.e).lambda$didFinishUploadingFile$0(this.f17207c, this.f17206b, this.d, (TLRPC.InputFile) this.f17208f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17209n, (byte[]) this.f17210r, (FileUploadOperation) this.f17211s);
                return;
            default:
                ((MessagesController) this.e).lambda$openApp$501((org.telegram.ui.ActionBar.m2) this.f17208f, (pf.c) this.h, (boolean[]) this.f17209n, (TLRPC.User) this.f17210r, this.f17206b, this.f17207c, this.d, (TL_bots.BotInfo[]) this.f17211s);
                return;
        }
    }

    public f3(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, pf.c cVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f17208f = m2Var;
        this.h = cVar;
        this.f17209n = zArr;
        this.f17210r = user;
        this.f17206b = str;
        this.f17207c = z10;
        this.d = z11;
        this.f17211s = botInfoArr;
    }
}
