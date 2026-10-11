package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17477a = 0;
    public final String f17478b;
    public final boolean f17479c;
    public final boolean d;
    public final Object f17480e;
    public final Object f17481f;
    public final Object h;
    public final Object f17482n;
    public final Object f17483r;
    public final Object f17484s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17480e = anonymousClass1;
        this.f17479c = z10;
        this.f17478b = str;
        this.d = z11;
        this.f17481f = inputFile;
        this.h = inputEncryptedFile;
        this.f17482n = bArr;
        this.f17483r = bArr2;
        this.f17484s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17477a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17480e).lambda$didFinishUploadingFile$0(this.f17479c, this.f17478b, this.d, (TLRPC.InputFile) this.f17481f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17482n, (byte[]) this.f17483r, (FileUploadOperation) this.f17484s);
                return;
            default:
                ((MessagesController) this.f17480e).lambda$openApp$501((org.telegram.ui.ActionBar.m2) this.f17481f, (of.e) this.h, (boolean[]) this.f17482n, (TLRPC.User) this.f17483r, this.f17478b, this.f17479c, this.d, (TL_bots.BotInfo[]) this.f17484s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, of.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17480e = messagesController;
        this.f17481f = m2Var;
        this.h = eVar;
        this.f17482n = zArr;
        this.f17483r = user;
        this.f17478b = str;
        this.f17479c = z10;
        this.d = z11;
        this.f17484s = botInfoArr;
    }
}
