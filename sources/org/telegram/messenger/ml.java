package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f20718a;
    public final TL_stories.StoryItem f20719b;
    public final TranslateController.StoryKey f20720c;

    public ml(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f20718a = translateController;
        this.f20719b = storyItem;
        this.f20720c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f20718a.lambda$detectStoryLanguage$34(this.f20719b, this.f20720c, exc);
    }

    @Override
    public void run(String str) {
        this.f20718a.lambda$detectStoryLanguage$32(this.f20719b, this.f20720c, str);
    }
}
