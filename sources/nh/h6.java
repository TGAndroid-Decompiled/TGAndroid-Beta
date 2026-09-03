package nh;

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
public final class h6 {
    public final int f15364a;
    public final long f15365b;
    public final boolean f15366c;
    public boolean d;
    public boolean e;
    public boolean f15367f;
    public final ArrayList f15368g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f15369i;
    public final t6 f15370j;

    public h6(int i10, long j10, t6 t6Var) {
        boolean z4;
        this.f15370j = t6Var;
        this.f15364a = i10;
        this.f15365b = j10;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f15366c = z4;
        d();
    }

    public final boolean a() {
        if ((this.f15366c || this.f15370j.i(this.f15365b)) && this.f15367f && this.h.size() < MessagesController.getInstance(this.f15364a).config.storiesAlbumsLimit.get()) {
            return true;
        }
        return false;
    }

    public final m6 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                m6 m6Var = (m6) arrayList.get(i11);
                if (i10 == m6Var.f15598a) {
                    return m6Var;
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
                if (i10 == ((m6) arrayList.get(i11)).f15598a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.e && !this.f15367f) {
            this.e = true;
            boolean z4 = this.d;
            long j10 = this.f15365b;
            int i10 = this.f15364a;
            if (!z4) {
                MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j10, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        AndroidUtilities.runOnUIThread(new n4(3, h6.this, (List) obj));
                    }

                    public Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new ff.a(this, 13));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f15364a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.f15365b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((m6) obj).f15598a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z4) {
        int i10 = this.f15364a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j10 = this.f15365b;
        messagesStorage.saveStoryAlbumsCache(j10, arrayList);
        if (z4) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j10), this);
        }
    }
}
