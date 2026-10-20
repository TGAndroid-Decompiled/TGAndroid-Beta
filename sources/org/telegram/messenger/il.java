package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class il implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18651a;
    public final TL_stories.StoryItem f18652b;
    public final TranslateController.StoryKey f18653c;

    public il(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18651a = translateController;
        this.f18652b = storyItem;
        this.f18653c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18651a.lambda$detectStoryLanguage$34(this.f18652b, this.f18653c, exc);
    }

    @Override
    public void run(String str) {
        this.f18651a.lambda$detectStoryLanguage$32(this.f18652b, this.f18653c, str);
    }
}
