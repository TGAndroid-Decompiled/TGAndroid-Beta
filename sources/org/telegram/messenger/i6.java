package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16391a = 1;
    public final MediaController f16392b;
    public final int f16393c;
    public final int d;
    public final long e;
    public final long f16394f;
    public final MessageSuggestionParams h;
    public final MessageObject f16395n;
    public final MessageObject f16396r;
    public final TL_stories.StoryItem f16397s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16392b = mediaController;
        this.f16393c = i10;
        this.d = i11;
        this.e = j3;
        this.f16394f = j10;
        this.h = messageSuggestionParams;
        this.f16395n = messageObject;
        this.f16396r = messageObject2;
        this.f16397s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16391a) {
            case 0:
                MessageObject messageObject = this.f16396r;
                TL_stories.StoryItem storyItem = this.f16397s;
                this.f16392b.lambda$prepareResumedRecording$25(this.f16393c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16394f, this.h, this.f16395n, messageObject, storyItem);
                return;
            default:
                this.f16392b.lambda$startRecording$37(this.f16393c, this.d, this.e, this.f16394f, this.h, this.f16395n, this.f16396r, this.f16397s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16392b = mediaController;
        this.f16393c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16394f = j10;
        this.h = messageSuggestionParams;
        this.f16395n = messageObject;
        this.f16396r = messageObject2;
        this.f16397s = storyItem;
    }
}
