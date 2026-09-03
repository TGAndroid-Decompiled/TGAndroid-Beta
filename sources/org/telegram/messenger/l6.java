package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class l6 implements Runnable {
    public final int f17711a = 1;
    public final MediaController f17712b;
    public final int f17713c;
    public final int d;
    public final long e;
    public final long f17714f;
    public final MessageSuggestionParams h;
    public final MessageObject f17715n;
    public final MessageObject f17716r;
    public final TL_stories.StoryItem f17717s;
    public final Object v;

    public l6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f17712b = mediaController;
        this.f17713c = i10;
        this.d = i11;
        this.e = j10;
        this.f17714f = j11;
        this.h = messageSuggestionParams;
        this.f17715n = messageObject;
        this.f17716r = messageObject2;
        this.f17717s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f17711a) {
            case 0:
                MessageObject messageObject = this.f17716r;
                TL_stories.StoryItem storyItem = this.f17717s;
                this.f17712b.lambda$prepareResumedRecording$25(this.f17713c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f17714f, this.h, this.f17715n, messageObject, storyItem);
                return;
            default:
                this.f17712b.lambda$startRecording$37(this.f17713c, this.d, this.e, this.f17714f, this.h, this.f17715n, this.f17716r, this.f17717s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public l6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f17712b = mediaController;
        this.f17713c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f17714f = j11;
        this.h = messageSuggestionParams;
        this.f17715n = messageObject;
        this.f17716r = messageObject2;
        this.f17717s = storyItem;
    }
}
