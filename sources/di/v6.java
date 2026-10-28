package di;

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
    public final int f9259a;
    public final long f9260b;
    public final boolean f9261c;
    public boolean d;
    public boolean e;
    public boolean f9262f;
    public final ArrayList f9263g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f9264i;
    public final h7 f9265j;

    public v6(int i10, long j10, h7 h7Var) {
        boolean z10;
        this.f9265j = h7Var;
        this.f9259a = i10;
        this.f9260b = j10;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9261c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f9261c || this.f9265j.i(this.f9260b)) && this.f9262f && this.h.size() < MessagesController.getInstance(this.f9259a).config.storiesAlbumsLimit.get()) {
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
                if (i10 == a7Var.f8375a) {
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
                if (i10 == ((a7) arrayList.get(i11)).f8375a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.e && !this.f9262f) {
            this.e = true;
            boolean z10 = this.d;
            long j10 = this.f9260b;
            int i10 = this.f9259a;
            if (!z10) {
                MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j10, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        AndroidUtilities.runOnUIThread(new b4(4, v6.this, (List) obj));
                    }

                    public Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new bi.i0(this, 7));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f9259a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.f9260b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((a7) obj).f8375a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f9259a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j10 = this.f9260b;
        messagesStorage.saveStoryAlbumsCache(j10, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j10), this);
        }
    }
}
