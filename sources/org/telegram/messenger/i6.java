package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16625a = 1;
    public final MediaController f16626b;
    public final int f16627c;
    public final int d;
    public final long e;
    public final long f16628f;
    public final MessageSuggestionParams h;
    public final MessageObject f16629n;
    public final MessageObject f16630r;
    public final TL_stories.StoryItem f16631s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16626b = mediaController;
        this.f16627c = i10;
        this.d = i11;
        this.e = j3;
        this.f16628f = j10;
        this.h = messageSuggestionParams;
        this.f16629n = messageObject;
        this.f16630r = messageObject2;
        this.f16631s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16625a) {
            case 0:
                MessageObject messageObject = this.f16630r;
                TL_stories.StoryItem storyItem = this.f16631s;
                this.f16626b.lambda$prepareResumedRecording$25(this.f16627c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16628f, this.h, this.f16629n, messageObject, storyItem);
                return;
            default:
                this.f16626b.lambda$startRecording$37(this.f16627c, this.d, this.e, this.f16628f, this.h, this.f16629n, this.f16630r, this.f16631s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16626b = mediaController;
        this.f16627c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16628f = j10;
        this.h = messageSuggestionParams;
        this.f16629n = messageObject;
        this.f16630r = messageObject2;
        this.f16631s = storyItem;
    }
}
