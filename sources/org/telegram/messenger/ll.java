package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18312a;
    public final TL_stories.StoryItem f18313b;
    public final TranslateController.StoryKey f18314c;

    public ll(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18312a = translateController;
        this.f18313b = storyItem;
        this.f18314c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18312a.lambda$detectStoryLanguage$34(this.f18313b, this.f18314c, exc);
    }

    @Override
    public void run(String str) {
        this.f18312a.lambda$detectStoryLanguage$32(this.f18313b, this.f18314c, str);
    }
}
