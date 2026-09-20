package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16220a;
    public final MessageObject f16221b;
    public final long f16222c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f16220a = translateController;
        this.f16221b = messageObject;
        this.f16222c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f16220a.lambda$checkLanguage$15(this.f16221b, this.f16222c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f16222c;
        int i10 = this.d;
        this.f16220a.lambda$checkLanguage$13(this.f16221b, j3, i10, str);
    }
}
