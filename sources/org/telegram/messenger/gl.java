package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

public final class gl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {

    public final TranslateController f20421a;

    public final TL_stories.StoryItem f20422b;

    public final TranslateController.StoryKey f20423c;

    public gl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f20421a = translateController;
        this.f20422b = storyItem;
        this.f20423c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f20421a.lambda$detectStoryLanguage$34(this.f20422b, this.f20423c, exc);
    }

    @Override
    public void run(String str) {
        this.f20421a.lambda$detectStoryLanguage$32(this.f20422b, this.f20423c, str);
    }
}
