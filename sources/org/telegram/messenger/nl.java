package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f19506a;
    public final TL_stories.StoryItem f19507b;
    public final TranslateController.StoryKey f19508c;

    public nl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f19506a = translateController;
        this.f19507b = storyItem;
        this.f19508c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f19506a.lambda$detectStoryLanguage$34(this.f19507b, this.f19508c, exc);
    }

    @Override
    public void run(String str) {
        this.f19506a.lambda$detectStoryLanguage$32(this.f19507b, this.f19508c, str);
    }
}
