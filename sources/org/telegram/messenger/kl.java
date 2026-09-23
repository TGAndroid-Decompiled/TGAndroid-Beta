package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16610a;
    public final TL_stories.StoryItem f16611b;
    public final TranslateController.StoryKey f16612c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16610a = translateController;
        this.f16611b = storyItem;
        this.f16612c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16610a.lambda$detectStoryLanguage$34(this.f16611b, this.f16612c, exc);
    }

    @Override
    public void run(String str) {
        this.f16610a.lambda$detectStoryLanguage$32(this.f16611b, this.f16612c, str);
    }
}
