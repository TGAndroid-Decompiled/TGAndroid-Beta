package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16865a;
    public final TL_stories.StoryItem f16866b;
    public final TranslateController.StoryKey f16867c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16865a = translateController;
        this.f16866b = storyItem;
        this.f16867c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16865a.lambda$detectStoryLanguage$34(this.f16866b, this.f16867c, exc);
    }

    @Override
    public void run(String str) {
        this.f16865a.lambda$detectStoryLanguage$32(this.f16866b, this.f16867c, str);
    }
}
