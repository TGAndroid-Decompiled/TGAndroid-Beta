package org.telegram.messenger;

import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.BaseFragment;

public final class FileLoader$1$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final boolean f$1;
    public final String f$2;
    public final boolean f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;
    public final Object f$8;

    public FileLoader$1$$ExternalSyntheticLambda1(FileLoader.AnonymousClass1 anonymousClass1, boolean z, String str, boolean z2, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.f$0 = anonymousClass1;
        this.f$1 = z;
        this.f$2 = str;
        this.f$3 = z2;
        this.f$4 = inputFile;
        this.f$5 = inputEncryptedFile;
        this.f$6 = bArr;
        this.f$7 = bArr2;
        this.f$8 = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoader.AnonymousClass1) this.f$0).lambda$didFinishUploadingFile$0(this.f$1, this.f$2, this.f$3, (TLRPC.InputFile) this.f$4, (TLRPC.InputEncryptedFile) this.f$5, (byte[]) this.f$6, (byte[]) this.f$7, (FileUploadOperation) this.f$8);
                break;
            default:
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f$8;
                ((MessagesController) this.f$0).lambda$openApp$498((BaseFragment) this.f$4, (Browser.Progress) this.f$5, (boolean[]) this.f$6, (TLRPC.User) this.f$7, this.f$2, this.f$1, this.f$3, botInfoArr);
                break;
        }
    }

    public FileLoader$1$$ExternalSyntheticLambda1(MessagesController messagesController, BaseFragment baseFragment, Browser.Progress progress, boolean[] zArr, TLRPC.User user, String str, boolean z, boolean z2, TL_bots.BotInfo[] botInfoArr) {
        this.f$0 = messagesController;
        this.f$4 = baseFragment;
        this.f$5 = progress;
        this.f$6 = zArr;
        this.f$7 = user;
        this.f$2 = str;
        this.f$1 = z;
        this.f$3 = z2;
        this.f$8 = botInfoArr;
    }
}
