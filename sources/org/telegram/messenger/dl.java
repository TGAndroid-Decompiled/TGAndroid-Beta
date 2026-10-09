package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17683a;
    public final MessageObject f17684b;
    public final long f17685c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f17683a = translateController;
        this.f17684b = messageObject;
        this.f17685c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17683a.lambda$checkLanguage$15(this.f17684b, this.f17685c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f17685c;
        int i10 = this.d;
        this.f17683a.lambda$checkLanguage$13(this.f17684b, j3, i10, str);
    }
}
