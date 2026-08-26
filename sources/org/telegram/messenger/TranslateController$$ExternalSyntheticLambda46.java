package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

public final class TranslateController$$ExternalSyntheticLambda46 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f$0;
    public final TL_stories.StoryItem f$1;
    public final TranslateController.StoryKey f$2;

    public TranslateController$$ExternalSyntheticLambda46(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f$0 = translateController;
        this.f$1 = storyItem;
        this.f$2 = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f$0.lambda$detectStoryLanguage$34(this.f$1, this.f$2, exc);
    }

    @Override
    public void run(String str) {
        this.f$0.lambda$detectStoryLanguage$32(this.f$1, this.f$2, str);
    }
}
