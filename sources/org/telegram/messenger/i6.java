package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f17968a = 1;
    public final MediaController f17969b;
    public final int f17970c;
    public final int d;
    public final long f17971e;
    public final long f17972f;
    public final MessageSuggestionParams h;
    public final MessageObject f17973n;
    public final MessageObject f17974r;
    public final TL_stories.StoryItem f17975s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f17969b = mediaController;
        this.f17970c = i10;
        this.d = i11;
        this.f17971e = j3;
        this.f17972f = j10;
        this.h = messageSuggestionParams;
        this.f17973n = messageObject;
        this.f17974r = messageObject2;
        this.f17975s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f17968a) {
            case 0:
                MessageObject messageObject = this.f17974r;
                TL_stories.StoryItem storyItem = this.f17975s;
                this.f17969b.lambda$prepareResumedRecording$25(this.f17970c, (MediaDataController.DraftVoice) this.v, this.d, this.f17971e, this.f17972f, this.h, this.f17973n, messageObject, storyItem);
                return;
            default:
                this.f17969b.lambda$startRecording$37(this.f17970c, this.d, this.f17971e, this.f17972f, this.h, this.f17973n, this.f17974r, this.f17975s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f17969b = mediaController;
        this.f17970c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f17971e = j3;
        this.f17972f = j10;
        this.h = messageSuggestionParams;
        this.f17973n = messageObject;
        this.f17974r = messageObject2;
        this.f17975s = storyItem;
    }
}
