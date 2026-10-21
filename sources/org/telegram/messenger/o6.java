package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class o6 implements Runnable {
    public final int f19111a = 1;
    public final MediaController f19112b;
    public final int f19113c;
    public final int d;
    public final long e;
    public final long f19114f;
    public final MessageSuggestionParams h;
    public final MessageObject f19115n;
    public final MessageObject f19116r;
    public final TL_stories.StoryItem f19117s;
    public final Object v;

    public o6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f19112b = mediaController;
        this.f19113c = i10;
        this.d = i11;
        this.e = j10;
        this.f19114f = j11;
        this.h = messageSuggestionParams;
        this.f19115n = messageObject;
        this.f19116r = messageObject2;
        this.f19117s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f19111a) {
            case 0:
                MessageObject messageObject = this.f19116r;
                TL_stories.StoryItem storyItem = this.f19117s;
                this.f19112b.lambda$prepareResumedRecording$26(this.f19113c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f19114f, this.h, this.f19115n, messageObject, storyItem);
                return;
            default:
                this.f19112b.lambda$startRecording$38(this.f19113c, this.d, this.e, this.f19114f, this.h, this.f19115n, this.f19116r, this.f19117s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public o6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f19112b = mediaController;
        this.f19113c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f19114f = j11;
        this.h = messageSuggestionParams;
        this.f19115n = messageObject;
        this.f19116r = messageObject2;
        this.f19117s = storyItem;
    }
}
