package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ql implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18729a;
    public final TL_stories.StoryItem f18730b;
    public final TranslateController.StoryKey f18731c;

    public ql(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18729a = translateController;
        this.f18730b = storyItem;
        this.f18731c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18729a.lambda$detectStoryLanguage$34(this.f18730b, this.f18731c, exc);
    }

    @Override
    public void run(String str) {
        this.f18729a.lambda$detectStoryLanguage$32(this.f18730b, this.f18731c, str);
    }
}
