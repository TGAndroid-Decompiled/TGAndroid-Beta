package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class h6 implements Runnable {
    public final int f17888a = 1;
    public final MediaController f17889b;
    public final int f17890c;
    public final int d;
    public final long f17891e;
    public final long f17892f;
    public final MessageSuggestionParams h;
    public final MessageObject f17893n;
    public final MessageObject f17894r;
    public final TL_stories.StoryItem f17895s;
    public final Object v;

    public h6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f17889b = mediaController;
        this.f17890c = i10;
        this.d = i11;
        this.f17891e = j3;
        this.f17892f = j10;
        this.h = messageSuggestionParams;
        this.f17893n = messageObject;
        this.f17894r = messageObject2;
        this.f17895s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f17888a) {
            case 0:
                MessageObject messageObject = this.f17894r;
                TL_stories.StoryItem storyItem = this.f17895s;
                this.f17889b.lambda$prepareResumedRecording$25(this.f17890c, (MediaDataController.DraftVoice) this.v, this.d, this.f17891e, this.f17892f, this.h, this.f17893n, messageObject, storyItem);
                return;
            default:
                this.f17889b.lambda$startRecording$37(this.f17890c, this.d, this.f17891e, this.f17892f, this.h, this.f17893n, this.f17894r, this.f17895s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public h6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f17889b = mediaController;
        this.f17890c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f17891e = j3;
        this.f17892f = j10;
        this.h = messageSuggestionParams;
        this.f17893n = messageObject;
        this.f17894r = messageObject2;
        this.f17895s = storyItem;
    }
}
