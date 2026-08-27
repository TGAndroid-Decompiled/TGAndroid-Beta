package jh;

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

public final class f6 {

    public final int f13323a;

    public final long f13324b;

    public final boolean f13325c;
    public boolean d;

    public boolean f13326e;

    public boolean f13327f;

    public final ArrayList f13328g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public boolean f13329i;

    public final s6 f13330j;

    public f6(int i10, long j10, s6 s6Var) {
        this.f13330j = s6Var;
        this.f13323a = i10;
        this.f13324b = j10;
        this.f13325c = j10 == UserConfig.getInstance(i10).getClientUserId();
        d();
    }

    public final boolean a() {
        return (this.f13325c || this.f13330j.i(this.f13324b)) && this.f13327f && this.h.size() < MessagesController.getInstance(this.f13323a).config.storiesAlbumsLimit.get();
    }

    public final k6 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                return null;
            }
            k6 k6Var = (k6) arrayList.get(i11);
            if (i10 == k6Var.f13588a) {
                return k6Var;
            }
            i11++;
        }
    }

    public final int c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (i10 == ((k6) arrayList.get(i11)).f13588a) {
                return i11;
            }
            i11++;
        }
    }

    public final void d() {
        if (this.f13326e || this.f13327f) {
            return;
        }
        this.f13326e = true;
        boolean z10 = this.d;
        long j10 = this.f13324b;
        int i10 = this.f13323a;
        if (!z10) {
            MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j10, new Consumer() {
                @Override
                public final void x(Object obj) {
                    AndroidUtilities.runOnUIThread(new hh.m5(27, this.f13305a, (List) obj));
                }

                public Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
        tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new cf.a(this, 13));
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f13323a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.f13324b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((k6) obj).f13588a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f13323a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j10 = this.f13324b;
        messagesStorage.saveStoryAlbumsCache(j10, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j10), this);
        }
    }
}
