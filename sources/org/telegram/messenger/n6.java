package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class n6 implements Runnable {
    public final int f19020a = 1;
    public final MediaController f19021b;
    public final int f19022c;
    public final int d;
    public final long e;
    public final long f19023f;
    public final MessageSuggestionParams h;
    public final MessageObject f19024n;
    public final MessageObject f19025r;
    public final TL_stories.StoryItem f19026s;
    public final Object v;

    public n6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f19021b = mediaController;
        this.f19022c = i10;
        this.d = i11;
        this.e = j10;
        this.f19023f = j11;
        this.h = messageSuggestionParams;
        this.f19024n = messageObject;
        this.f19025r = messageObject2;
        this.f19026s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f19020a) {
            case 0:
                MessageObject messageObject = this.f19025r;
                TL_stories.StoryItem storyItem = this.f19026s;
                this.f19021b.lambda$prepareResumedRecording$26(this.f19022c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f19023f, this.h, this.f19024n, messageObject, storyItem);
                return;
            default:
                this.f19021b.lambda$startRecording$38(this.f19022c, this.d, this.e, this.f19023f, this.h, this.f19024n, this.f19025r, this.f19026s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public n6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f19021b = mediaController;
        this.f19022c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f19023f = j11;
        this.h = messageSuggestionParams;
        this.f19024n = messageObject;
        this.f19025r = messageObject2;
        this.f19026s = storyItem;
    }
}
