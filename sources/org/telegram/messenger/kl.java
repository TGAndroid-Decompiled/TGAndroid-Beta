package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18419a;
    public final TL_stories.StoryItem f18420b;
    public final TranslateController.StoryKey f18421c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18419a = translateController;
        this.f18420b = storyItem;
        this.f18421c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18419a.lambda$detectStoryLanguage$34(this.f18420b, this.f18421c, exc);
    }

    @Override
    public void run(String str) {
        this.f18419a.lambda$detectStoryLanguage$32(this.f18420b, this.f18421c, str);
    }
}
