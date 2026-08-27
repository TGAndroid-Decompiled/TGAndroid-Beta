package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

public final class j6 implements Runnable {

    public final int f20642a = 1;

    public final MediaController f20643b;

    public final int f20644c;
    public final int d;

    public final long f20645e;

    public final long f20646f;
    public final MessageSuggestionParams h;

    public final MessageObject f20647n;

    public final MessageObject f20648r;

    public final TL_stories.StoryItem f20649s;
    public final Object v;

    public j6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f20643b = mediaController;
        this.f20644c = i10;
        this.d = i11;
        this.f20645e = j10;
        this.f20646f = j11;
        this.h = messageSuggestionParams;
        this.f20647n = messageObject;
        this.f20648r = messageObject2;
        this.f20649s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f20642a) {
            case 0:
                this.f20643b.lambda$prepareResumedRecording$25(this.f20644c, (MediaDataController.DraftVoice) this.v, this.d, this.f20645e, this.f20646f, this.h, this.f20647n, this.f20648r, this.f20649s);
                break;
            default:
                this.f20643b.lambda$startRecording$37(this.f20644c, this.d, this.f20645e, this.f20646f, this.h, this.f20647n, this.f20648r, this.f20649s, (SendMessageChatArguments) this.v);
                break;
        }
    }

    public j6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f20643b = mediaController;
        this.f20644c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f20645e = j10;
        this.f20646f = j11;
        this.h = messageSuggestionParams;
        this.f20647n = messageObject;
        this.f20648r = messageObject2;
        this.f20649s = storyItem;
    }
}
