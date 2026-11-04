package ai;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class k0 implements Runnable {
    public final int f756a;
    public final int f757b;
    public final long f758c;
    public final Object d;
    public final Object f759e;
    public final Object f760f;

    public k0(Context context, int i3, m9 m9Var, long j10, Runnable runnable) {
        this.f756a = 0;
        this.d = context;
        this.f757b = i3;
        this.f759e = m9Var;
        this.f758c = j10;
        this.f760f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i3 = this.f756a;
        long j10 = this.f758c;
        int i10 = 0;
        String str = null;
        r4 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = this.f757b;
        Object obj = this.f760f;
        Object obj2 = this.f759e;
        Object obj3 = this.d;
        switch (i3) {
            case 0:
                new d7((Context) obj3, this.f757b, ((m9) obj2).d, null, this.f758c, (Runnable) obj, false, false).show();
                return;
            case 1:
                ci.h0 h0Var = (ci.h0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = ((ci.i0) obj3).f5268a;
                boolean[] zArr = h0Var.d;
                boolean[] zArr2 = h0Var.f5204b;
                ArrayList[] arrayListArr = h0Var.f5203a;
                zArr[i11] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    hp.s1(i12).Y3(starsStatus.users, false);
                    hp.s1(i12).S3(starsStatus.chats, false);
                    arrayListArr[i11].addAll(starsStatus.history);
                    if (arrayListArr[i11].isEmpty() && !zArr2[i11]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr2[i11] = z10;
                    boolean[] zArr3 = h0Var.f5206e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i11] = z11;
                    String[] strArr = h0Var.f5205c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i11] = str;
                    hs.f(i12).k(226, Long.valueOf(j10));
                    return;
                }
                return;
            case 2:
                gi.d dVar = (gi.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f27231id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i13 = this.f757b;
                ConnectionsManager.getInstance(i13).sendRequest(tL_fulfillStarsSubscription, new ci.x(i13, 1, this.f758c, dVar, (org.telegram.ui.ActionBar.t2[]) obj));
                return;
            case 3:
                ei.z6 z6Var = (ei.z6) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str2 = (String) obj;
                int i14 = z6Var.f11274a;
                HashSet hashSet = z6Var.f11291t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    hp.s1(i14).Y3(tL_stories_stories.users, false);
                    hp.s1(i14).S3(tL_stories_stories.chats, false);
                    while (true) {
                        if (i10 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i10).f27240id == i11) {
                                storyItem = tL_stories_stories.stories.get(i10);
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                z6Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = hp.s1(i14).z1(j10);
                    tL_updateStory.story = storyItem;
                    z6Var.c0(tL_updateStory);
                    return;
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (str3.endsWith(":" + j10 + ":" + i11)) {
                            hashSet.remove(str3);
                        }
                    }
                }
                hashSet.add(str2);
                z6Var.f11283l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            default:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (user != null) {
                    q1Var.f29976k7[i11].r(user);
                    q1Var.f29965j7[i11].i0(user, q1Var.f29976k7[i11], null);
                    return;
                } else if (chat != null) {
                    q1Var.f29976k7[i11].q(chat);
                    q1Var.f29965j7[i11].i0(chat, q1Var.f29976k7[i11], null);
                    return;
                } else {
                    q1Var.f29976k7[i11].k(this.f758c, "", "", null);
                    return;
                }
        }
    }

    public k0(Object obj, Object obj2, int i3, Object obj3, long j10, int i10) {
        this.f756a = i10;
        this.d = obj;
        this.f759e = obj2;
        this.f757b = i3;
        this.f760f = obj3;
        this.f758c = j10;
    }
}
