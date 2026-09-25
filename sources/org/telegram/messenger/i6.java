package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16628a = 1;
    public final MediaController f16629b;
    public final int f16630c;
    public final int d;
    public final long e;
    public final long f16631f;
    public final MessageSuggestionParams h;
    public final MessageObject f16632n;
    public final MessageObject f16633r;
    public final TL_stories.StoryItem f16634s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16629b = mediaController;
        this.f16630c = i10;
        this.d = i11;
        this.e = j3;
        this.f16631f = j10;
        this.h = messageSuggestionParams;
        this.f16632n = messageObject;
        this.f16633r = messageObject2;
        this.f16634s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16628a) {
            case 0:
                MessageObject messageObject = this.f16633r;
                TL_stories.StoryItem storyItem = this.f16634s;
                this.f16629b.lambda$prepareResumedRecording$25(this.f16630c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16631f, this.h, this.f16632n, messageObject, storyItem);
                return;
            default:
                this.f16629b.lambda$startRecording$37(this.f16630c, this.d, this.e, this.f16631f, this.h, this.f16632n, this.f16633r, this.f16634s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16629b = mediaController;
        this.f16630c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16631f = j10;
        this.h = messageSuggestionParams;
        this.f16632n = messageObject;
        this.f16633r = messageObject2;
        this.f16634s = storyItem;
    }
}
