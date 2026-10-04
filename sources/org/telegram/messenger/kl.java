package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18413a;
    public final TL_stories.StoryItem f18414b;
    public final TranslateController.StoryKey f18415c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18413a = translateController;
        this.f18414b = storyItem;
        this.f18415c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18413a.lambda$detectStoryLanguage$34(this.f18414b, this.f18415c, exc);
    }

    @Override
    public void run(String str) {
        this.f18413a.lambda$detectStoryLanguage$32(this.f18414b, this.f18415c, str);
    }
}
