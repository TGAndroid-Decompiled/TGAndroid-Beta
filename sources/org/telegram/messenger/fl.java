package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class fl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f20123a;
    public final MessageObject f20124b;
    public final long f20125c;
    public final int d;

    public fl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f20123a = translateController;
        this.f20124b = messageObject;
        this.f20125c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f20123a.lambda$checkLanguage$15(this.f20124b, this.f20125c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f20125c;
        int i10 = this.d;
        this.f20123a.lambda$checkLanguage$13(this.f20124b, j10, i10, str);
    }
}
