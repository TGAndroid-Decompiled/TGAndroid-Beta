package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16641a = 1;
    public final MediaController f16642b;
    public final int f16643c;
    public final int d;
    public final long e;
    public final long f16644f;
    public final MessageSuggestionParams h;
    public final MessageObject f16645n;
    public final MessageObject f16646r;
    public final TL_stories.StoryItem f16647s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16642b = mediaController;
        this.f16643c = i10;
        this.d = i11;
        this.e = j3;
        this.f16644f = j10;
        this.h = messageSuggestionParams;
        this.f16645n = messageObject;
        this.f16646r = messageObject2;
        this.f16647s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16641a) {
            case 0:
                MessageObject messageObject = this.f16646r;
                TL_stories.StoryItem storyItem = this.f16647s;
                this.f16642b.lambda$prepareResumedRecording$25(this.f16643c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16644f, this.h, this.f16645n, messageObject, storyItem);
                return;
            default:
                this.f16642b.lambda$startRecording$37(this.f16643c, this.d, this.e, this.f16644f, this.h, this.f16645n, this.f16646r, this.f16647s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16642b = mediaController;
        this.f16643c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16644f = j10;
        this.h = messageSuggestionParams;
        this.f16645n = messageObject;
        this.f16646r = messageObject2;
        this.f16647s = storyItem;
    }
}
