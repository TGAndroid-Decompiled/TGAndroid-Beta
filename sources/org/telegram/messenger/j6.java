package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class j6 implements Runnable {
    public final int f18234a = 1;
    public final MediaController f18235b;
    public final int f18236c;
    public final int d;
    public final long f18237e;
    public final long f18238f;
    public final MessageSuggestionParams h;
    public final MessageObject f18239n;
    public final MessageObject f18240r;
    public final TL_stories.StoryItem f18241s;
    public final Object v;

    public j6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18235b = mediaController;
        this.f18236c = i10;
        this.d = i11;
        this.f18237e = j3;
        this.f18238f = j10;
        this.h = messageSuggestionParams;
        this.f18239n = messageObject;
        this.f18240r = messageObject2;
        this.f18241s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18234a) {
            case 0:
                MessageObject messageObject = this.f18240r;
                TL_stories.StoryItem storyItem = this.f18241s;
                this.f18235b.lambda$prepareResumedRecording$25(this.f18236c, (MediaDataController.DraftVoice) this.v, this.d, this.f18237e, this.f18238f, this.h, this.f18239n, messageObject, storyItem);
                return;
            default:
                this.f18235b.lambda$startRecording$37(this.f18236c, this.d, this.f18237e, this.f18238f, this.h, this.f18239n, this.f18240r, this.f18241s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public j6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18235b = mediaController;
        this.f18236c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f18237e = j3;
        this.f18238f = j10;
        this.h = messageSuggestionParams;
        this.f18239n = messageObject;
        this.f18240r = messageObject2;
        this.f18241s = storyItem;
    }
}
