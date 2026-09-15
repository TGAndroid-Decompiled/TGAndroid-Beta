package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f15992a;
    public final MessageObject f15993b;
    public final long f15994c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f15992a = translateController;
        this.f15993b = messageObject;
        this.f15994c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f15992a.lambda$checkLanguage$15(this.f15993b, this.f15994c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f15994c;
        int i10 = this.d;
        this.f15992a.lambda$checkLanguage$13(this.f15993b, j3, i10, str);
    }
}
