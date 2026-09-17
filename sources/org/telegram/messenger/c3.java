package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c3 implements Runnable {
    public final int f17317a = 0;
    public final String f17318b;
    public final boolean f17319c;
    public final boolean d;
    public final Object f17320e;
    public final Object f17321f;
    public final Object h;
    public final Object f17322n;
    public final Object f17323r;
    public final Object f17324s;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f17320e = anonymousClass1;
        this.f17319c = z10;
        this.f17318b = str;
        this.d = z11;
        this.f17321f = inputFile;
        this.h = inputEncryptedFile;
        this.f17322n = bArr;
        this.f17323r = bArr2;
        this.f17324s = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17317a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f17320e).lambda$didFinishUploadingFile$0(this.f17319c, this.f17318b, this.d, (TLRPC.InputFile) this.f17321f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.f17322n, (byte[]) this.f17323r, (FileUploadOperation) this.f17324s);
                return;
            default:
                ((MessagesController) this.f17320e).lambda$openApp$498((org.telegram.ui.ActionBar.n2) this.f17321f, (of.e) this.h, (boolean[]) this.f17322n, (TLRPC.User) this.f17323r, this.f17318b, this.f17319c, this.d, (TL_bots.BotInfo[]) this.f17324s);
                return;
        }
    }

    public c3(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, of.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f17320e = messagesController;
        this.f17321f = n2Var;
        this.h = eVar;
        this.f17322n = zArr;
        this.f17323r = user;
        this.f17318b = str;
        this.f17319c = z10;
        this.d = z11;
        this.f17324s = botInfoArr;
    }
}
