package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class m6 implements Runnable {
    public final int f18938a = 1;
    public final MediaController f18939b;
    public final int f18940c;
    public final int d;
    public final long e;
    public final long f18941f;
    public final MessageSuggestionParams h;
    public final MessageObject f18942n;
    public final MessageObject f18943r;
    public final TL_stories.StoryItem f18944s;
    public final Object v;

    public m6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18939b = mediaController;
        this.f18940c = i10;
        this.d = i11;
        this.e = j10;
        this.f18941f = j11;
        this.h = messageSuggestionParams;
        this.f18942n = messageObject;
        this.f18943r = messageObject2;
        this.f18944s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18938a) {
            case 0:
                MessageObject messageObject = this.f18943r;
                TL_stories.StoryItem storyItem = this.f18944s;
                this.f18939b.lambda$prepareResumedRecording$26(this.f18940c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f18941f, this.h, this.f18942n, messageObject, storyItem);
                return;
            default:
                this.f18939b.lambda$startRecording$38(this.f18940c, this.d, this.e, this.f18941f, this.h, this.f18942n, this.f18943r, this.f18944s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public m6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18939b = mediaController;
        this.f18940c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f18941f = j11;
        this.h = messageSuggestionParams;
        this.f18942n = messageObject;
        this.f18943r = messageObject2;
        this.f18944s = storyItem;
    }
}
