package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16624a = 1;
    public final MediaController f16625b;
    public final int f16626c;
    public final int d;
    public final long e;
    public final long f16627f;
    public final MessageSuggestionParams h;
    public final MessageObject f16628n;
    public final MessageObject f16629r;
    public final TL_stories.StoryItem f16630s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16625b = mediaController;
        this.f16626c = i10;
        this.d = i11;
        this.e = j3;
        this.f16627f = j10;
        this.h = messageSuggestionParams;
        this.f16628n = messageObject;
        this.f16629r = messageObject2;
        this.f16630s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16624a) {
            case 0:
                MessageObject messageObject = this.f16629r;
                TL_stories.StoryItem storyItem = this.f16630s;
                this.f16625b.lambda$prepareResumedRecording$25(this.f16626c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16627f, this.h, this.f16628n, messageObject, storyItem);
                return;
            default:
                this.f16625b.lambda$startRecording$37(this.f16626c, this.d, this.e, this.f16627f, this.h, this.f16628n, this.f16629r, this.f16630s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16625b = mediaController;
        this.f16626c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16627f = j10;
        this.h = messageSuggestionParams;
        this.f16628n = messageObject;
        this.f16629r = messageObject2;
        this.f16630s = storyItem;
    }
}
