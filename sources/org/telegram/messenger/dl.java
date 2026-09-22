package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16235a;
    public final MessageObject f16236b;
    public final long f16237c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f16235a = translateController;
        this.f16236b = messageObject;
        this.f16237c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f16235a.lambda$checkLanguage$15(this.f16236b, this.f16237c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f16237c;
        int i10 = this.d;
        this.f16235a.lambda$checkLanguage$13(this.f16236b, j3, i10, str);
    }
}
