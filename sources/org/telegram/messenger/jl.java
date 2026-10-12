package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class jl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18011a;
    public final MessageObject f18012b;
    public final long f18013c;
    public final int d;

    public jl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f18011a = translateController;
        this.f18012b = messageObject;
        this.f18013c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f18011a.lambda$checkLanguage$15(this.f18012b, this.f18013c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f18013c;
        int i10 = this.d;
        this.f18011a.lambda$checkLanguage$13(this.f18012b, j3, i10, str);
    }
}
