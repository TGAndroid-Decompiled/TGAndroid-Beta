package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18259a;
    public final TL_stories.StoryItem f18260b;
    public final TranslateController.StoryKey f18261c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18259a = translateController;
        this.f18260b = storyItem;
        this.f18261c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18259a.lambda$detectStoryLanguage$34(this.f18260b, this.f18261c, exc);
    }

    @Override
    public void run(String str) {
        this.f18259a.lambda$detectStoryLanguage$32(this.f18260b, this.f18261c, str);
    }
}
