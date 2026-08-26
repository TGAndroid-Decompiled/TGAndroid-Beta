package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesStorage;
import org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda2;

public final class FileLoader$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final long f$3;
    public final long f$4;
    public final Object f$5;

    public FileLoader$$ExternalSyntheticLambda9(FileLoader fileLoader, boolean z, String str, long j, long j2, Float f) {
        this.f$0 = fileLoader;
        this.f$1 = z;
        this.f$2 = str;
        this.f$3 = j;
        this.f$4 = j2;
        this.f$5 = f;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoader) this.f$0).lambda$checkUploadNewDataAvailable$3(this.f$1, (String) this.f$2, this.f$3, this.f$4, (Float) this.f$5);
                break;
            default:
                StoriesController storiesController = (StoriesController) this.f$0;
                storiesController.loadingAllStories.remove(Long.valueOf(this.f$3));
                boolean z = this.f$1;
                long j = this.f$4;
                TL_stories.PeerStories peerStories = z ? (TL_stories.PeerStories) this.f$2 : (TL_stories.PeerStories) storiesController.allStoriesMap.get(j);
                if (peerStories != null) {
                    TLObject tLObject = (TLObject) this.f$5;
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                            for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                                if (peerStories.stories.get(i2).id == tL_stories_stories.stories.get(i).id) {
                                    peerStories.stories.set(i2, tL_stories_stories.stories.get(i));
                                    storiesController.preloadStory(j, tL_stories_stories.stories.get(i));
                                }
                            }
                        }
                        if (!z) {
                            StoriesStorage storiesStorage = storiesController.storiesStorage;
                            storiesStorage.storage.getStorageQueue().postRunnable(new StoriesStorage$$ExternalSyntheticLambda2(storiesStorage, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(storiesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
        }
    }

    public FileLoader$$ExternalSyntheticLambda9(StoriesController storiesController, long j, boolean z, TL_stories.PeerStories peerStories, long j2, TLObject tLObject) {
        this.f$0 = storiesController;
        this.f$3 = j;
        this.f$1 = z;
        this.f$2 = peerStories;
        this.f$4 = j2;
        this.f$5 = tLObject;
    }
}
