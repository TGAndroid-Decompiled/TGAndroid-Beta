package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16718a;
    public final TL_stories.StoryItem f16719b;
    public final TranslateController.StoryKey f16720c;

    public ll(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16718a = translateController;
        this.f16719b = storyItem;
        this.f16720c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16718a.lambda$detectStoryLanguage$34(this.f16719b, this.f16720c, exc);
    }

    @Override
    public void run(String str) {
        this.f16718a.lambda$detectStoryLanguage$32(this.f16719b, this.f16720c, str);
    }
}
