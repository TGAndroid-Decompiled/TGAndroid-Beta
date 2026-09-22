package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16379a = 1;
    public final MediaController f16380b;
    public final int f16381c;
    public final int d;
    public final long e;
    public final long f16382f;
    public final MessageSuggestionParams h;
    public final MessageObject f16383n;
    public final MessageObject f16384r;
    public final TL_stories.StoryItem f16385s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16380b = mediaController;
        this.f16381c = i10;
        this.d = i11;
        this.e = j3;
        this.f16382f = j10;
        this.h = messageSuggestionParams;
        this.f16383n = messageObject;
        this.f16384r = messageObject2;
        this.f16385s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16379a) {
            case 0:
                MessageObject messageObject = this.f16384r;
                TL_stories.StoryItem storyItem = this.f16385s;
                this.f16380b.lambda$prepareResumedRecording$25(this.f16381c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16382f, this.h, this.f16383n, messageObject, storyItem);
                return;
            default:
                this.f16380b.lambda$startRecording$37(this.f16381c, this.d, this.e, this.f16382f, this.h, this.f16383n, this.f16384r, this.f16385s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16380b = mediaController;
        this.f16381c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16382f = j10;
        this.h = messageSuggestionParams;
        this.f16383n = messageObject;
        this.f16384r = messageObject2;
        this.f16385s = storyItem;
    }
}
