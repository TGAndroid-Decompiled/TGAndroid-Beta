package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17722a;
    public final MessageObject f17723b;
    public final long f17724c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f17722a = translateController;
        this.f17723b = messageObject;
        this.f17724c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17722a.lambda$checkLanguage$15(this.f17723b, this.f17724c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f17724c;
        int i10 = this.d;
        this.f17722a.lambda$checkLanguage$13(this.f17723b, j3, i10, str);
    }
}
