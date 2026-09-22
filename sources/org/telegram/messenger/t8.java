package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class t8 implements Runnable {
    public final int f17369a;
    public final Object f17370b;
    public final long f17371c;
    public final boolean d;
    public final Object e;

    public t8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f17369a = i10;
        this.f17370b = obj;
        this.d = z10;
        this.f17371c = j3;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17369a) {
            case 0:
                ((MediaDataController) this.f17370b).lambda$loadFeaturedStickers$57((TLObject) this.e, this.d, this.f17371c);
                return;
            case 1:
                ((MediaDataController) this.f17370b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.e, this.f17371c, this.d);
                return;
            case 2:
                ((MessagesController) this.f17370b).lambda$processUpdates$376(this.d, this.f17371c, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.f17370b).lambda$getChannelRecommendations$481((TLObject) this.e, this.d, this.f17371c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f17370b).lambda$processLoadedChannelAdmins$66(this.f17371c, (a0.i) this.e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f17370b).lambda$createTaskForMid$115(this.d, this.f17371c, (ArrayList) this.e);
                return;
            case 6:
                ((MessagesStorage) this.f17370b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.b6) this.e, this.d, this.f17371c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f17370b).lambda$seekTo$12(this.f17371c, this.d, (Runnable) this.e);
                return;
            case 8:
                org.telegram.ui.z6.U((org.telegram.ui.z6) this.f17370b, this.d, this.f17371c, (org.telegram.ui.n6) this.e);
                return;
            default:
                ((ProfileActivity) this.f17370b).getMessagesController().getStoriesController().o0(this.f17371c, (ArrayList) this.e, this.d, null);
                return;
        }
    }

    public t8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f17369a = i10;
        this.f17370b = baseController;
        this.e = obj;
        this.d = z10;
        this.f17371c = j3;
    }

    public t8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f17369a = 1;
        this.f17370b = mediaDataController;
        this.e = arrayList;
        this.f17371c = j3;
        this.d = z10;
    }

    public t8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f17369a = i10;
        this.f17370b = notificationCenterDelegate;
        this.f17371c = j3;
        this.e = cloneable;
        this.d = z10;
    }

    public t8(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f17369a = 7;
        this.f17370b = videoPlayerHolderBase;
        this.f17371c = j3;
        this.d = z10;
        this.e = runnable;
    }
}
