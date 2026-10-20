package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class o6 implements Runnable {
    public final int f19114a = 1;
    public final MediaController f19115b;
    public final int f19116c;
    public final int d;
    public final long e;
    public final long f19117f;
    public final MessageSuggestionParams h;
    public final MessageObject f19118n;
    public final MessageObject f19119r;
    public final TL_stories.StoryItem f19120s;
    public final Object v;

    public o6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f19115b = mediaController;
        this.f19116c = i10;
        this.d = i11;
        this.e = j10;
        this.f19117f = j11;
        this.h = messageSuggestionParams;
        this.f19118n = messageObject;
        this.f19119r = messageObject2;
        this.f19120s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f19114a) {
            case 0:
                MessageObject messageObject = this.f19119r;
                TL_stories.StoryItem storyItem = this.f19120s;
                this.f19115b.lambda$prepareResumedRecording$26(this.f19116c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f19117f, this.h, this.f19118n, messageObject, storyItem);
                return;
            default:
                this.f19115b.lambda$startRecording$38(this.f19116c, this.d, this.e, this.f19117f, this.h, this.f19118n, this.f19119r, this.f19120s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public o6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f19115b = mediaController;
        this.f19116c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f19117f = j11;
        this.h = messageSuggestionParams;
        this.f19118n = messageObject;
        this.f19119r = messageObject2;
        this.f19120s = storyItem;
    }
}
