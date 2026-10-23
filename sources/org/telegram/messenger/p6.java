package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class p6 implements Runnable {
    public final int f19255a = 1;
    public final MediaController f19256b;
    public final int f19257c;
    public final int d;
    public final long e;
    public final long f19258f;
    public final MessageSuggestionParams h;
    public final MessageObject f19259n;
    public final MessageObject f19260r;
    public final TL_stories.StoryItem f19261s;
    public final Object v;

    public p6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f19256b = mediaController;
        this.f19257c = i10;
        this.d = i11;
        this.e = j10;
        this.f19258f = j11;
        this.h = messageSuggestionParams;
        this.f19259n = messageObject;
        this.f19260r = messageObject2;
        this.f19261s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f19255a) {
            case 0:
                MessageObject messageObject = this.f19260r;
                TL_stories.StoryItem storyItem = this.f19261s;
                this.f19256b.lambda$prepareResumedRecording$27(this.f19257c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f19258f, this.h, this.f19259n, messageObject, storyItem);
                return;
            default:
                this.f19256b.lambda$startRecording$40(this.f19257c, this.d, this.e, this.f19258f, this.h, this.f19259n, this.f19260r, this.f19261s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public p6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f19256b = mediaController;
        this.f19257c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f19258f = j11;
        this.h = messageSuggestionParams;
        this.f19259n = messageObject;
        this.f19260r = messageObject2;
        this.f19261s = storyItem;
    }
}
