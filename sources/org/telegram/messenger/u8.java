package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class u8 implements Runnable {
    public final int f17671a;
    public final Object f17672b;
    public final long f17673c;
    public final boolean d;
    public final Object e;

    public u8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f17671a = i10;
        this.f17672b = obj;
        this.d = z10;
        this.f17673c = j3;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17671a) {
            case 0:
                ((MediaDataController) this.f17672b).lambda$loadFeaturedStickers$57((TLObject) this.e, this.d, this.f17673c);
                return;
            case 1:
                ((MediaDataController) this.f17672b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.e, this.f17673c, this.d);
                return;
            case 2:
                ((MessagesController) this.f17672b).lambda$processUpdates$376(this.d, this.f17673c, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.f17672b).lambda$getChannelRecommendations$481((TLObject) this.e, this.d, this.f17673c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f17672b).lambda$processLoadedChannelAdmins$66(this.f17673c, (a0.i) this.e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f17672b).lambda$createTaskForMid$115(this.d, this.f17673c, (ArrayList) this.e);
                return;
            case 6:
                ((MessagesStorage) this.f17672b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.z5) this.e, this.d, this.f17673c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f17672b).lambda$seekTo$12(this.f17673c, this.d, (Runnable) this.e);
                return;
            case 8:
                org.telegram.ui.z6.U((org.telegram.ui.z6) this.f17672b, this.d, this.f17673c, (org.telegram.ui.m6) this.e);
                return;
            default:
                ((ProfileActivity) this.f17672b).getMessagesController().getStoriesController().o0(this.f17673c, (ArrayList) this.e, this.d, null);
                return;
        }
    }

    public u8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f17671a = i10;
        this.f17672b = baseController;
        this.e = obj;
        this.d = z10;
        this.f17673c = j3;
    }

    public u8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f17671a = 1;
        this.f17672b = mediaDataController;
        this.e = arrayList;
        this.f17673c = j3;
        this.d = z10;
    }

    public u8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f17671a = i10;
        this.f17672b = notificationCenterDelegate;
        this.f17673c = j3;
        this.e = cloneable;
        this.d = z10;
    }

    public u8(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f17671a = 7;
        this.f17672b = videoPlayerHolderBase;
        this.f17673c = j3;
        this.d = z10;
        this.e = runnable;
    }
}
