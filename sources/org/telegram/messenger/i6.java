package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16566a = 1;
    public final MediaController f16567b;
    public final int f16568c;
    public final int d;
    public final long e;
    public final long f16569f;
    public final MessageSuggestionParams h;
    public final MessageObject f16570n;
    public final MessageObject f16571r;
    public final TL_stories.StoryItem f16572s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16567b = mediaController;
        this.f16568c = i10;
        this.d = i11;
        this.e = j3;
        this.f16569f = j10;
        this.h = messageSuggestionParams;
        this.f16570n = messageObject;
        this.f16571r = messageObject2;
        this.f16572s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16566a) {
            case 0:
                MessageObject messageObject = this.f16571r;
                TL_stories.StoryItem storyItem = this.f16572s;
                this.f16567b.lambda$prepareResumedRecording$25(this.f16568c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16569f, this.h, this.f16570n, messageObject, storyItem);
                return;
            default:
                this.f16567b.lambda$startRecording$37(this.f16568c, this.d, this.e, this.f16569f, this.h, this.f16570n, this.f16571r, this.f16572s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16567b = mediaController;
        this.f16568c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16569f = j10;
        this.h = messageSuggestionParams;
        this.f16570n = messageObject;
        this.f16571r = messageObject2;
        this.f16572s = storyItem;
    }
}
