package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16855a;
    public final TL_stories.StoryItem f16856b;
    public final TranslateController.StoryKey f16857c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16855a = translateController;
        this.f16856b = storyItem;
        this.f16857c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16855a.lambda$detectStoryLanguage$34(this.f16856b, this.f16857c, exc);
    }

    @Override
    public void run(String str) {
        this.f16855a.lambda$detectStoryLanguage$32(this.f16856b, this.f16857c, str);
    }
}
