package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16872a;
    public final TL_stories.StoryItem f16873b;
    public final TranslateController.StoryKey f16874c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16872a = translateController;
        this.f16873b = storyItem;
        this.f16874c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16872a.lambda$detectStoryLanguage$34(this.f16873b, this.f16874c, exc);
    }

    @Override
    public void run(String str) {
        this.f16872a.lambda$detectStoryLanguage$32(this.f16873b, this.f16874c, str);
    }
}
