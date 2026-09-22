package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16948a;
    public final TL_stories.StoryItem f16949b;
    public final TranslateController.StoryKey f16950c;

    public ll(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16948a = translateController;
        this.f16949b = storyItem;
        this.f16950c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16948a.lambda$detectStoryLanguage$34(this.f16949b, this.f16950c, exc);
    }

    @Override
    public void run(String str) {
        this.f16948a.lambda$detectStoryLanguage$32(this.f16949b, this.f16950c, str);
    }
}
