package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class jl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18010a;
    public final MessageObject f18011b;
    public final long f18012c;
    public final int d;

    public jl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f18010a = translateController;
        this.f18011b = messageObject;
        this.f18012c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f18010a.lambda$checkLanguage$15(this.f18011b, this.f18012c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f18012c;
        int i10 = this.d;
        this.f18010a.lambda$checkLanguage$13(this.f18011b, j3, i10, str);
    }
}
