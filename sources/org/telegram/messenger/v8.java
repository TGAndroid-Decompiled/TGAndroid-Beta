package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class v8 implements Runnable {
    public final int f21800a;
    public final Object f21801b;
    public final long f21802c;
    public final boolean d;
    public final Object f21803e;

    public v8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f21800a = i10;
        this.f21801b = obj;
        this.d = z10;
        this.f21802c = j10;
        this.f21803e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21800a) {
            case 0:
                ((MediaDataController) this.f21801b).lambda$loadFeaturedStickers$57((TLObject) this.f21803e, this.d, this.f21802c);
                return;
            case 1:
                ((MediaDataController) this.f21801b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.f21803e, this.f21802c, this.d);
                return;
            case 2:
                ((MessagesController) this.f21801b).lambda$processUpdates$376(this.d, this.f21802c, (ArrayList) this.f21803e);
                return;
            case 3:
                ((MessagesController) this.f21801b).lambda$getChannelRecommendations$481((TLObject) this.f21803e, this.d, this.f21802c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f21801b).lambda$processLoadedChannelAdmins$66(this.f21802c, (a0.h) this.f21803e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f21801b).lambda$createTaskForMid$115(this.d, this.f21802c, (ArrayList) this.f21803e);
                return;
            case 6:
                ((MessagesStorage) this.f21801b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.z5) this.f21803e, this.d, this.f21802c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f21801b).lambda$seekTo$12(this.f21802c, this.d, (Runnable) this.f21803e);
                return;
            case 8:
                org.telegram.ui.x6.U((org.telegram.ui.x6) this.f21801b, this.d, this.f21802c, (org.telegram.ui.m6) this.f21803e);
                return;
            default:
                ((ProfileActivity) this.f21801b).getMessagesController().getStoriesController().o0(this.f21802c, (ArrayList) this.f21803e, this.d, null);
                return;
        }
    }

    public v8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f21800a = i10;
        this.f21801b = baseController;
        this.f21803e = obj;
        this.d = z10;
        this.f21802c = j10;
    }

    public v8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f21800a = 1;
        this.f21801b = mediaDataController;
        this.f21803e = arrayList;
        this.f21802c = j10;
        this.d = z10;
    }

    public v8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f21800a = i10;
        this.f21801b = notificationCenterDelegate;
        this.f21802c = j10;
        this.f21803e = cloneable;
        this.d = z10;
    }

    public v8(VideoPlayerHolderBase videoPlayerHolderBase, long j10, boolean z10, Runnable runnable) {
        this.f21800a = 7;
        this.f21801b = videoPlayerHolderBase;
        this.f21802c = j10;
        this.d = z10;
        this.f21803e = runnable;
    }
}
