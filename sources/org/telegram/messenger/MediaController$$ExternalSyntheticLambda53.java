package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

public final class MediaController$$ExternalSyntheticLambda53 implements Runnable {
    public final int $r8$classId = 1;
    public final MediaController f$0;
    public final int f$1;
    public final Object f$2;
    public final int f$3;
    public final long f$4;
    public final long f$5;
    public final MessageSuggestionParams f$6;
    public final MessageObject f$7;
    public final MessageObject f$8;
    public final TL_stories.StoryItem f$9;

    public MediaController$$ExternalSyntheticLambda53(MediaController mediaController, int i, int i2, long j, long j2, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f$0 = mediaController;
        this.f$1 = i;
        this.f$3 = i2;
        this.f$4 = j;
        this.f$5 = j2;
        this.f$6 = messageSuggestionParams;
        this.f$7 = messageObject;
        this.f$8 = messageObject2;
        this.f$9 = storyItem;
        this.f$2 = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$prepareResumedRecording$25(this.f$1, (MediaDataController.DraftVoice) this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                break;
            default:
                this.f$0.lambda$startRecording$37(this.f$1, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, (SendMessageChatArguments) this.f$2);
                break;
        }
    }

    public MediaController$$ExternalSyntheticLambda53(MediaController mediaController, int i, MediaDataController.DraftVoice draftVoice, int i2, long j, long j2, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f$0 = mediaController;
        this.f$1 = i;
        this.f$2 = draftVoice;
        this.f$3 = i2;
        this.f$4 = j;
        this.f$5 = j2;
        this.f$6 = messageSuggestionParams;
        this.f$7 = messageObject;
        this.f$8 = messageObject2;
        this.f$9 = storyItem;
    }
}
