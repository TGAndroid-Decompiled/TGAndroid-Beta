package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18411a;
    public final TL_stories.StoryItem f18412b;
    public final TranslateController.StoryKey f18413c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18411a = translateController;
        this.f18412b = storyItem;
        this.f18413c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18411a.lambda$detectStoryLanguage$34(this.f18412b, this.f18413c, exc);
    }

    @Override
    public void run(String str) {
        this.f18411a.lambda$detectStoryLanguage$32(this.f18412b, this.f18413c, str);
    }
}
