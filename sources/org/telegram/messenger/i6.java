package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16613a = 1;
    public final MediaController f16614b;
    public final int f16615c;
    public final int d;
    public final long e;
    public final long f16616f;
    public final MessageSuggestionParams h;
    public final MessageObject f16617n;
    public final MessageObject f16618r;
    public final TL_stories.StoryItem f16619s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16614b = mediaController;
        this.f16615c = i10;
        this.d = i11;
        this.e = j3;
        this.f16616f = j10;
        this.h = messageSuggestionParams;
        this.f16617n = messageObject;
        this.f16618r = messageObject2;
        this.f16619s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16613a) {
            case 0:
                MessageObject messageObject = this.f16618r;
                TL_stories.StoryItem storyItem = this.f16619s;
                this.f16614b.lambda$prepareResumedRecording$25(this.f16615c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16616f, this.h, this.f16617n, messageObject, storyItem);
                return;
            default:
                this.f16614b.lambda$startRecording$37(this.f16615c, this.d, this.e, this.f16616f, this.h, this.f16617n, this.f16618r, this.f16619s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16614b = mediaController;
        this.f16615c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16616f = j10;
        this.h = messageSuggestionParams;
        this.f16617n = messageObject;
        this.f16618r = messageObject2;
        this.f16619s = storyItem;
    }
}
