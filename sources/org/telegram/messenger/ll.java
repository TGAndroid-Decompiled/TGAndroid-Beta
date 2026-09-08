package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18339a;
    public final TL_stories.StoryItem f18340b;
    public final TranslateController.StoryKey f18341c;

    public ll(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18339a = translateController;
        this.f18340b = storyItem;
        this.f18341c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18339a.lambda$detectStoryLanguage$34(this.f18340b, this.f18341c, exc);
    }

    @Override
    public void run(String str) {
        this.f18339a.lambda$detectStoryLanguage$32(this.f18340b, this.f18341c, str);
    }
}
