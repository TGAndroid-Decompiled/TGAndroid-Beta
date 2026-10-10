package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17687a;
    public final MessageObject f17688b;
    public final long f17689c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f17687a = translateController;
        this.f17688b = messageObject;
        this.f17689c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17687a.lambda$checkLanguage$15(this.f17688b, this.f17689c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f17689c;
        int i10 = this.d;
        this.f17687a.lambda$checkLanguage$13(this.f17688b, j3, i10, str);
    }
}
