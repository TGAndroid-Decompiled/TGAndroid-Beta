package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class n6 implements Runnable {
    public final int f19017a = 1;
    public final MediaController f19018b;
    public final int f19019c;
    public final int d;
    public final long e;
    public final long f19020f;
    public final MessageSuggestionParams h;
    public final MessageObject f19021n;
    public final MessageObject f19022r;
    public final TL_stories.StoryItem f19023s;
    public final Object v;

    public n6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f19018b = mediaController;
        this.f19019c = i10;
        this.d = i11;
        this.e = j10;
        this.f19020f = j11;
        this.h = messageSuggestionParams;
        this.f19021n = messageObject;
        this.f19022r = messageObject2;
        this.f19023s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f19017a) {
            case 0:
                MessageObject messageObject = this.f19022r;
                TL_stories.StoryItem storyItem = this.f19023s;
                this.f19018b.lambda$prepareResumedRecording$26(this.f19019c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f19020f, this.h, this.f19021n, messageObject, storyItem);
                return;
            default:
                this.f19018b.lambda$startRecording$38(this.f19019c, this.d, this.e, this.f19020f, this.h, this.f19021n, this.f19022r, this.f19023s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public n6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f19018b = mediaController;
        this.f19019c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f19020f = j11;
        this.h = messageSuggestionParams;
        this.f19021n = messageObject;
        this.f19022r = messageObject2;
        this.f19023s = storyItem;
    }
}
