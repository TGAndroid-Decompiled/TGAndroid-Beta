package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class d0 implements Runnable {
    public final int f3632a;
    public final int f3633b;
    public final long f3634c;
    public final Object d;
    public final Object f3635e;
    public final Object f3636f;

    public d0(Context context, int i7, org.telegram.messenger.s9 s9Var, long j3, Runnable runnable) {
        this.f3632a = 4;
        this.d = context;
        this.f3633b = i7;
        this.f3635e = s9Var;
        this.f3634c = j3;
        this.f3636f = runnable;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        int i7 = this.f3632a;
        long j3 = this.f3634c;
        int i10 = 0;
        String str = null;
        r5 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = this.f3633b;
        Object obj = this.f3636f;
        Object obj2 = this.f3635e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                m0 m0Var = (m0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = ((n0) obj3).f4384a;
                boolean[] zArr = m0Var.d;
                boolean[] zArr2 = m0Var.f4302b;
                ArrayList[] arrayListArr = m0Var.f4301a;
                zArr[i11] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    qp.s1(i12).Y3(starsStatus.users, false);
                    qp.s1(i12).S3(starsStatus.chats, false);
                    arrayListArr[i11].addAll(starsStatus.history);
                    if (arrayListArr[i11].isEmpty() && !zArr2[i11]) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    zArr2[i11] = z9;
                    boolean[] zArr3 = m0Var.f4304e;
                    if ((starsStatus.flags & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zArr3[i11] = z10;
                    String[] strArr = m0Var.f4303c;
                    if (!z10) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i11] = str;
                    qs.f(i12).k(226, Long.valueOf(j3));
                    return;
                }
                return;
            case 1:
                fi.d dVar = (fi.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f27182id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i13 = this.f3633b;
                ConnectionsManager.getInstance(i13).sendRequest(tL_fulfillStarsSubscription, new b0(i13, 1, this.f3634c, dVar, (org.telegram.ui.ActionBar.v2[]) obj));
                return;
            case 2:
                di.y6 y6Var = (di.y6) obj3;
                TLObject tLObject2 = (TLObject) obj;
                String str2 = (String) obj2;
                int i14 = y6Var.f9963a;
                HashSet hashSet = y6Var.f9980t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    qp.s1(i14).Y3(tL_stories_stories.users, false);
                    qp.s1(i14).S3(tL_stories_stories.chats, false);
                    while (true) {
                        if (i10 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i10).f27191id == i11) {
                                storyItem = tL_stories_stories.stories.get(i10);
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                y6Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j3;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = qp.s1(i14).z1(j3);
                    tL_updateStory.story = storyItem;
                    y6Var.c0(tL_updateStory);
                    return;
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (str3.endsWith(":" + j3 + ":" + i11)) {
                            hashSet.remove(str3);
                        }
                    }
                }
                hashSet.add(str2);
                y6Var.f9972l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (user != null) {
                    q1Var.f29901k7[i11].r(user);
                    q1Var.f29888j7[i11].i0(user, q1Var.f29901k7[i11], null);
                    return;
                } else if (chat != null) {
                    q1Var.f29901k7[i11].q(chat);
                    q1Var.f29888j7[i11].i0(chat, q1Var.f29901k7[i11], null);
                    return;
                } else {
                    q1Var.f29901k7[i11].k(this.f3634c, "", "", null);
                    return;
                }
            default:
                new zh.b4((Context) obj3, this.f3633b, ((org.telegram.messenger.s9) obj2).d, null, this.f3634c, (Runnable) obj, false, false).show();
                return;
        }
    }

    public d0(di.y6 y6Var, TLObject tLObject, int i7, String str, long j3) {
        this.f3632a = 2;
        this.d = y6Var;
        this.f3636f = tLObject;
        this.f3633b = i7;
        this.f3635e = str;
        this.f3634c = j3;
    }

    public d0(Object obj, Object obj2, int i7, Object obj3, long j3, int i10) {
        this.f3632a = i10;
        this.d = obj;
        this.f3635e = obj2;
        this.f3633b = i7;
        this.f3636f = obj3;
        this.f3634c = j3;
    }
}
