package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class hl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18561a;
    public final TL_stories.StoryItem f18562b;
    public final TranslateController.StoryKey f18563c;

    public hl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18561a = translateController;
        this.f18562b = storyItem;
        this.f18563c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18561a.lambda$detectStoryLanguage$34(this.f18562b, this.f18563c, exc);
    }

    @Override
    public void run(String str) {
        this.f18561a.lambda$detectStoryLanguage$32(this.f18562b, this.f18563c, str);
    }
}
