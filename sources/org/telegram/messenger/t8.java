package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;

public final class t8 implements Runnable {

    public final int f21616a;

    public final Object f21617b;

    public final long f21618c;
    public final boolean d;

    public final Object f21619e;

    public t8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f21616a = i10;
        this.f21617b = obj;
        this.d = z10;
        this.f21618c = j10;
        this.f21619e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21616a) {
            case 0:
                ((MediaDataController) this.f21617b).lambda$loadFeaturedStickers$57((TLObject) this.f21619e, this.d, this.f21618c);
                break;
            case 1:
                ((MediaDataController) this.f21617b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.f21619e, this.f21618c, this.d);
                break;
            case 2:
                ((MessagesController) this.f21617b).lambda$processUpdates$376(this.d, this.f21618c, (ArrayList) this.f21619e);
                break;
            case 3:
                ((MessagesController) this.f21617b).lambda$getChannelRecommendations$481((TLObject) this.f21619e, this.d, this.f21618c);
                break;
            case 4:
                ((MessagesController) this.f21617b).lambda$processLoadedChannelAdmins$66(this.f21618c, (a0.h) this.f21619e, this.d);
                break;
            case 5:
                ((MessagesStorage) this.f21617b).lambda$createTaskForMid$115(this.d, this.f21618c, (ArrayList) this.f21619e);
                break;
            case 6:
                ((MessagesStorage) this.f21617b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.z5) this.f21619e, this.d, this.f21618c);
                break;
            case 7:
                ((VideoPlayerHolderBase) this.f21617b).lambda$seekTo$12(this.f21618c, this.d, (Runnable) this.f21619e);
                break;
            case 8:
                org.telegram.ui.z6.U((org.telegram.ui.z6) this.f21617b, this.d, this.f21618c, (org.telegram.ui.n6) this.f21619e);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f21617b;
                profileActivity.getMessagesController().getStoriesController().o0(this.f21618c, (ArrayList) this.f21619e, this.d, null);
                break;
        }
    }

    public t8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f21616a = i10;
        this.f21617b = baseController;
        this.f21619e = obj;
        this.d = z10;
        this.f21618c = j10;
    }

    public t8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f21616a = 1;
        this.f21617b = mediaDataController;
        this.f21619e = arrayList;
        this.f21618c = j10;
        this.d = z10;
    }

    public t8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f21616a = i10;
        this.f21617b = notificationCenterDelegate;
        this.f21618c = j10;
        this.f21619e = cloneable;
        this.d = z10;
    }

    public t8(VideoPlayerHolderBase videoPlayerHolderBase, long j10, boolean z10, Runnable runnable) {
        this.f21616a = 7;
        this.f21617b = videoPlayerHolderBase;
        this.f21618c = j10;
        this.d = z10;
        this.f21619e = runnable;
    }
}
