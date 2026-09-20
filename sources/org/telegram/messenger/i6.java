package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16614a = 1;
    public final MediaController f16615b;
    public final int f16616c;
    public final int d;
    public final long e;
    public final long f16617f;
    public final MessageSuggestionParams h;
    public final MessageObject f16618n;
    public final MessageObject f16619r;
    public final TL_stories.StoryItem f16620s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16615b = mediaController;
        this.f16616c = i10;
        this.d = i11;
        this.e = j3;
        this.f16617f = j10;
        this.h = messageSuggestionParams;
        this.f16618n = messageObject;
        this.f16619r = messageObject2;
        this.f16620s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16614a) {
            case 0:
                MessageObject messageObject = this.f16619r;
                TL_stories.StoryItem storyItem = this.f16620s;
                this.f16615b.lambda$prepareResumedRecording$25(this.f16616c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16617f, this.h, this.f16618n, messageObject, storyItem);
                return;
            default:
                this.f16615b.lambda$startRecording$37(this.f16616c, this.d, this.e, this.f16617f, this.h, this.f16618n, this.f16619r, this.f16620s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16615b = mediaController;
        this.f16616c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16617f = j10;
        this.h = messageSuggestionParams;
        this.f16618n = messageObject;
        this.f16619r = messageObject2;
        this.f16620s = storyItem;
    }
}
