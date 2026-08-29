package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class k6 implements Runnable {
    public final int f20734a = 1;
    public final MediaController f20735b;
    public final int f20736c;
    public final int d;
    public final long f20737e;
    public final long f20738f;
    public final MessageSuggestionParams h;
    public final MessageObject f20739n;
    public final MessageObject f20740r;
    public final TL_stories.StoryItem f20741s;
    public final Object v;

    public k6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f20735b = mediaController;
        this.f20736c = i10;
        this.d = i11;
        this.f20737e = j10;
        this.f20738f = j11;
        this.h = messageSuggestionParams;
        this.f20739n = messageObject;
        this.f20740r = messageObject2;
        this.f20741s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f20734a) {
            case 0:
                MessageObject messageObject = this.f20740r;
                TL_stories.StoryItem storyItem = this.f20741s;
                this.f20735b.lambda$prepareResumedRecording$25(this.f20736c, (MediaDataController.DraftVoice) this.v, this.d, this.f20737e, this.f20738f, this.h, this.f20739n, messageObject, storyItem);
                return;
            default:
                this.f20735b.lambda$startRecording$37(this.f20736c, this.d, this.f20737e, this.f20738f, this.h, this.f20739n, this.f20740r, this.f20741s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public k6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f20735b = mediaController;
        this.f20736c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f20737e = j10;
        this.f20738f = j11;
        this.h = messageSuggestionParams;
        this.f20739n = messageObject;
        this.f20740r = messageObject2;
        this.f20741s = storyItem;
    }
}
