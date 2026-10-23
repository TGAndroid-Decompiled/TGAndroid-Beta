package ci;

import ai.qa;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class v6 {
    public final int f6023a;
    public final long f6024b;
    public final boolean f6025c;
    public boolean d;
    public boolean e;
    public boolean f6026f;
    public final ArrayList f6027g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f6028i;
    public final h7 f6029j;

    public v6(int i10, long j10, h7 h7Var) {
        boolean z10;
        this.f6029j = h7Var;
        this.f6023a = i10;
        this.f6024b = j10;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6025c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f6025c || this.f6029j.i(this.f6024b)) && this.f6026f && this.h.size() < MessagesController.getInstance(this.f6023a).config.storiesAlbumsLimit.get()) {
            return true;
        }
        return false;
    }

    public final a7 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                a7 a7Var = (a7) arrayList.get(i11);
                if (i10 == a7Var.f5152a) {
                    return a7Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final int c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (i10 == ((a7) arrayList.get(i11)).f5152a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.e && !this.f6026f) {
            this.e = true;
            boolean z10 = this.d;
            long j10 = this.f6024b;
            int i10 = this.f6023a;
            if (!z10) {
                MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j10, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        AndroidUtilities.runOnUIThread(new qa(20, v6.this, (List) obj));
                    }

                    public Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new ai.h(this, 8));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f6023a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.f6024b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((a7) obj).f5152a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f6023a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j10 = this.f6024b;
        messagesStorage.saveStoryAlbumsCache(j10, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j10), this);
        }
    }
}
