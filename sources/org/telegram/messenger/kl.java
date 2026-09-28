package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16871a;
    public final TL_stories.StoryItem f16872b;
    public final TranslateController.StoryKey f16873c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16871a = translateController;
        this.f16872b = storyItem;
        this.f16873c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16871a.lambda$detectStoryLanguage$34(this.f16872b, this.f16873c, exc);
    }

    @Override
    public void run(String str) {
        this.f16871a.lambda$detectStoryLanguage$32(this.f16872b, this.f16873c, str);
    }
}
