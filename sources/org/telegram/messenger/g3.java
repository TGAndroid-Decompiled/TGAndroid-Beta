package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class g3 implements Runnable {
    public final int f17642a = 0;
    public final String f17643b;
    public final boolean f17644c;
    public final boolean d;
    public final Object f17645e;
    public final Object f17646f;
    public final Object h;
    public final Object f17647n;
    public final Object f17648r;
    public final Object f17649s;

    public g3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17645e = anonymousClass1;
        this.f17644c = z10;
        this.f17643b = str;
        this.d = z11;
        this.f17646f = inputFile;
        this.h = inputEncryptedFile;
        this.f17647n = bArr;
        this.f17648r = bArr2;
        this.f17649s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17642a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17645e).lambda$didFinishUploadingFile$0(this.f17644c, this.f17643b, this.d, (TLRPC.InputFile) this.f17646f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17647n, (byte[]) this.f17648r, (FileUploadOperation) this.f17649s);
                return;
            default:
                ((MessagesController) this.f17645e).lambda$openApp$501((org.telegram.ui.ActionBar.m2) this.f17646f, (of.e) this.h, (boolean[]) this.f17647n, (TLRPC.User) this.f17648r, this.f17643b, this.f17644c, this.d, (TL_bots.BotInfo[]) this.f17649s);
                return;
        }
    }

    public g3(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, of.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17645e = messagesController;
        this.f17646f = m2Var;
        this.h = eVar;
        this.f17647n = zArr;
        this.f17648r = user;
        this.f17643b = str;
        this.f17644c = z10;
        this.d = z11;
        this.f17649s = botInfoArr;
    }
}
