package bi;

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
public final class f8 {
    public final int f2979a;
    public final long f2980b;
    public final boolean f2981c;
    public boolean d;
    public boolean f2982e;
    public boolean f2983f;
    public final ArrayList f2984g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f2985i;
    public final u8 f2986j;

    public f8(int i10, long j3, u8 u8Var) {
        boolean z10;
        this.f2986j = u8Var;
        this.f2979a = i10;
        this.f2980b = j3;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2981c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f2981c || this.f2986j.i(this.f2980b)) && this.f2983f && this.h.size() < MessagesController.getInstance(this.f2979a).config.storiesAlbumsLimit.get()) {
            return true;
        }
        return false;
    }

    public final m8 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                m8 m8Var = (m8) arrayList.get(i11);
                if (i10 == m8Var.f3321a) {
                    return m8Var;
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
                if (i10 == ((m8) arrayList.get(i11)).f3321a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f2982e && !this.f2983f) {
            this.f2982e = true;
            boolean z10 = this.d;
            long j3 = this.f2980b;
            int i10 = this.f2979a;
            if (!z10) {
                MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j3, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        AndroidUtilities.runOnUIThread(new a1.e(25, f8.this, (List) obj));
                    }

                    public Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new v7(this, 2));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f2979a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.f2980b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((m8) obj).f3321a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f2979a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j3 = this.f2980b;
        messagesStorage.saveStoryAlbumsCache(j3, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j3), this);
        }
    }
}
