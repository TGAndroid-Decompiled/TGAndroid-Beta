package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class h6 implements Runnable {
    public final int f20460a = 1;
    public final MediaController f20461b;
    public final int f20462c;
    public final int d;
    public final long f20463e;
    public final long f20464f;
    public final MessageSuggestionParams h;
    public final MessageObject f20465n;
    public final MessageObject f20466r;
    public final TL_stories.StoryItem f20467s;
    public final Object v;

    public h6(MediaController mediaController, int i9, int i10, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f20461b = mediaController;
        this.f20462c = i9;
        this.d = i10;
        this.f20463e = j10;
        this.f20464f = j11;
        this.h = messageSuggestionParams;
        this.f20465n = messageObject;
        this.f20466r = messageObject2;
        this.f20467s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f20460a) {
            case 0:
                MessageObject messageObject = this.f20466r;
                TL_stories.StoryItem storyItem = this.f20467s;
                this.f20461b.lambda$prepareResumedRecording$25(this.f20462c, (MediaDataController.DraftVoice) this.v, this.d, this.f20463e, this.f20464f, this.h, this.f20465n, messageObject, storyItem);
                return;
            default:
                this.f20461b.lambda$startRecording$37(this.f20462c, this.d, this.f20463e, this.f20464f, this.h, this.f20465n, this.f20466r, this.f20467s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public h6(MediaController mediaController, int i9, MediaDataController.DraftVoice draftVoice, int i10, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f20461b = mediaController;
        this.f20462c = i9;
        this.v = draftVoice;
        this.d = i10;
        this.f20463e = j10;
        this.f20464f = j11;
        this.h = messageSuggestionParams;
        this.f20465n = messageObject;
        this.f20466r = messageObject2;
        this.f20467s = storyItem;
    }
}
