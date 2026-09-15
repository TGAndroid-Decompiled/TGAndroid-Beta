package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16382a = 1;
    public final MediaController f16383b;
    public final int f16384c;
    public final int d;
    public final long e;
    public final long f16385f;
    public final MessageSuggestionParams h;
    public final MessageObject f16386n;
    public final MessageObject f16387r;
    public final TL_stories.StoryItem f16388s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16383b = mediaController;
        this.f16384c = i10;
        this.d = i11;
        this.e = j3;
        this.f16385f = j10;
        this.h = messageSuggestionParams;
        this.f16386n = messageObject;
        this.f16387r = messageObject2;
        this.f16388s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16382a) {
            case 0:
                MessageObject messageObject = this.f16387r;
                TL_stories.StoryItem storyItem = this.f16388s;
                this.f16383b.lambda$prepareResumedRecording$25(this.f16384c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16385f, this.h, this.f16386n, messageObject, storyItem);
                return;
            default:
                this.f16383b.lambda$startRecording$37(this.f16384c, this.d, this.e, this.f16385f, this.h, this.f16386n, this.f16387r, this.f16388s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16383b = mediaController;
        this.f16384c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16385f = j10;
        this.h = messageSuggestionParams;
        this.f16386n = messageObject;
        this.f16387r = messageObject2;
        this.f16388s = storyItem;
    }
}
