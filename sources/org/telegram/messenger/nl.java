package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17969a;
    public final TL_stories.StoryItem f17970b;
    public final TranslateController.StoryKey f17971c;

    public nl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f17969a = translateController;
        this.f17970b = storyItem;
        this.f17971c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f17969a.lambda$detectStoryLanguage$34(this.f17970b, this.f17971c, exc);
    }

    @Override
    public void run(String str) {
        this.f17969a.lambda$detectStoryLanguage$32(this.f17970b, this.f17971c, str);
    }
}
