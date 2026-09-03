package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f19508a;
    public final TL_stories.StoryItem f19509b;
    public final TranslateController.StoryKey f19510c;

    public nl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f19508a = translateController;
        this.f19509b = storyItem;
        this.f19510c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f19508a.lambda$detectStoryLanguage$34(this.f19509b, this.f19510c, exc);
    }

    @Override
    public void run(String str) {
        this.f19508a.lambda$detectStoryLanguage$32(this.f19509b, this.f19510c, str);
    }
}
