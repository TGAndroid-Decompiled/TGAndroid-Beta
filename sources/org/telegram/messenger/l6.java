package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class l6 implements Runnable {
    public final int f17732a = 1;
    public final MediaController f17733b;
    public final int f17734c;
    public final int d;
    public final long e;
    public final long f17735f;
    public final MessageSuggestionParams h;
    public final MessageObject f17736n;
    public final MessageObject f17737r;
    public final TL_stories.StoryItem f17738s;
    public final Object v;

    public l6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f17733b = mediaController;
        this.f17734c = i10;
        this.d = i11;
        this.e = j10;
        this.f17735f = j11;
        this.h = messageSuggestionParams;
        this.f17736n = messageObject;
        this.f17737r = messageObject2;
        this.f17738s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f17732a) {
            case 0:
                MessageObject messageObject = this.f17737r;
                TL_stories.StoryItem storyItem = this.f17738s;
                this.f17733b.lambda$prepareResumedRecording$25(this.f17734c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f17735f, this.h, this.f17736n, messageObject, storyItem);
                return;
            default:
                this.f17733b.lambda$startRecording$37(this.f17734c, this.d, this.e, this.f17735f, this.h, this.f17736n, this.f17737r, this.f17738s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public l6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f17733b = mediaController;
        this.f17734c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f17735f = j11;
        this.h = messageSuggestionParams;
        this.f17736n = messageObject;
        this.f17737r = messageObject2;
        this.f17738s = storyItem;
    }
}
