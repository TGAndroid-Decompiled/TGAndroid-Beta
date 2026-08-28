package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class bl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f19894a;
    public final TL_stories.StoryItem f19895b;
    public final TranslateController.StoryKey f19896c;

    public bl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f19894a = translateController;
        this.f19895b = storyItem;
        this.f19896c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f19894a.lambda$detectStoryLanguage$34(this.f19895b, this.f19896c, exc);
    }

    @Override
    public void run(String str) {
        this.f19894a.lambda$detectStoryLanguage$32(this.f19895b, this.f19896c, str);
    }
}
