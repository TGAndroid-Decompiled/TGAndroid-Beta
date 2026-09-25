package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16870a;
    public final TL_stories.StoryItem f16871b;
    public final TranslateController.StoryKey f16872c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16870a = translateController;
        this.f16871b = storyItem;
        this.f16872c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16870a.lambda$detectStoryLanguage$34(this.f16871b, this.f16872c, exc);
    }

    @Override
    public void run(String str) {
        this.f16870a.lambda$detectStoryLanguage$32(this.f16871b, this.f16872c, str);
    }
}
