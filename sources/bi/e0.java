package bi;

import android.content.Context;
import android.os.RemoteException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.n31;
public final class e0 implements Runnable {
    public final int f3449a;
    public final int f3450b;
    public final long f3451c;
    public final Object d;
    public final Object f3452e;
    public final Object f3453f;

    public e0(Context context, int i7, r9 r9Var, long j3, Runnable runnable) {
        this.f3449a = 0;
        this.d = context;
        this.f3450b = i7;
        this.f3452e = r9Var;
        this.f3451c = j3;
        this.f3453f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        org.telegram.utils.twidget.b h12;
        org.telegram.utils.twidget.b h13;
        org.telegram.utils.twidget.b h14;
        int i7 = 0;
        String str = null;
        org.telegram.utils.twidget.b bVar = null;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        switch (this.f3449a) {
            case 0:
                new u6((Context) this.d, this.f3450b, ((r9) this.f3452e).d, null, this.f3451c, (Runnable) this.f3453f, false, false).show();
                return;
            case 1:
                di.d0 d0Var = (di.d0) this.f3452e;
                int i10 = this.f3450b;
                TLObject tLObject = (TLObject) this.f3453f;
                long j3 = this.f3451c;
                int i11 = ((di.e0) this.d).f8430a;
                boolean[] zArr = d0Var.d;
                boolean[] zArr2 = d0Var.f8381b;
                ArrayList[] arrayListArr = d0Var.f8380a;
                zArr[i10] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    np.s1(i11).Y3(starsStatus.users, false);
                    np.s1(i11).S3(starsStatus.chats, false);
                    arrayListArr[i10].addAll(starsStatus.history);
                    if (arrayListArr[i10].isEmpty() && !zArr2[i10]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr2[i10] = z10;
                    boolean[] zArr3 = d0Var.f8383e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i10] = z11;
                    String[] strArr = d0Var.f8382c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i10] = str;
                    ns.f(i11).k(226, Long.valueOf(j3));
                    return;
                }
                return;
            case 2:
                hi.d dVar = (hi.d) this.d;
                int i12 = this.f3450b;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.f3453f;
                long j10 = this.f3451c;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) this.f3452e).f28281id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                ConnectionsManager.getInstance(i12).sendRequest(tL_fulfillStarsSubscription, new di.v(i12, 1, j10, dVar, u2VarArr));
                return;
            case 3:
                fi.s6 s6Var = (fi.s6) this.d;
                TLObject tLObject2 = (TLObject) this.f3452e;
                int i13 = this.f3450b;
                String str2 = (String) this.f3453f;
                long j11 = this.f3451c;
                int i14 = s6Var.f12319a;
                HashSet hashSet = s6Var.f12336t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    np.s1(i14).Y3(tL_stories_stories.users, false);
                    np.s1(i14).S3(tL_stories_stories.chats, false);
                    while (true) {
                        if (i7 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i7).f28290id == i13) {
                                storyItem = tL_stories_stories.stories.get(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                s6Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j11;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = np.s1(i14).z1(j11);
                    tL_updateStory.story = storyItem;
                    s6Var.c0(tL_updateStory);
                    return;
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (str3.endsWith(":" + j11 + ":" + i13)) {
                            hashSet.remove(str3);
                        }
                    }
                }
                hashSet.add(str2);
                s6Var.f12328l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 4:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                TLRPC.User user = (TLRPC.User) this.f3452e;
                int i15 = this.f3450b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f3453f;
                long j12 = this.f3451c;
                if (user != null) {
                    q1Var.f31053l7[i15].r(user);
                    q1Var.f31041k7[i15].i0(user, q1Var.f31053l7[i15], null);
                    return;
                } else if (chat != null) {
                    q1Var.f31053l7[i15].q(chat);
                    q1Var.f31041k7[i15].i0(chat, q1Var.f31053l7[i15], null);
                    return;
                } else {
                    q1Var.f31053l7[i15].k(j12, "", "", null);
                    return;
                }
            default:
                org.telegram.utils.twidget.l1 l1Var = (org.telegram.utils.twidget.l1) this.d;
                long j13 = this.f3451c;
                int i16 = this.f3450b;
                String str4 = (String) this.f3452e;
                String str5 = (String) this.f3453f;
                if (l1Var.f54318w) {
                    org.telegram.utils.twidget.d1.f54204a.execute(new n31(l1Var, j13, 2));
                    return;
                }
                l1Var.v = j13;
                int i17 = l1Var.G;
                if (i17 != i16 && i17 > 0) {
                    org.telegram.utils.twidget.u0 u0Var = l1Var.f54301c;
                    float f10 = i17 / l1Var.f54308l;
                    org.telegram.utils.twidget.r0 r0Var = (org.telegram.utils.twidget.r0) u0Var.f54414e.get(Long.valueOf(j13));
                    if (r0Var == null) {
                        h14 = null;
                    } else {
                        h14 = r0Var.h1();
                    }
                    if (h14 != null) {
                        try {
                            h14.H0(r0Var.d, f10);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                if (!l1Var.B.equals(str4)) {
                    org.telegram.utils.twidget.u0 u0Var2 = l1Var.f54301c;
                    byte[] bytes = l1Var.B.getBytes(StandardCharsets.UTF_8);
                    org.telegram.utils.twidget.r0 r0Var2 = (org.telegram.utils.twidget.r0) u0Var2.f54414e.get(Long.valueOf(j13));
                    if (r0Var2 == null) {
                        h13 = null;
                    } else {
                        h13 = r0Var2.h1();
                    }
                    if (h13 != null) {
                        try {
                            h13.f0(r0Var2.d, bytes);
                        } catch (RemoteException unused2) {
                        }
                    }
                }
                if (l1Var.f54307k != null && !l1Var.f54307k.equals(str5)) {
                    org.telegram.utils.twidget.u0 u0Var3 = l1Var.f54301c;
                    byte[] bytes2 = l1Var.f54307k.getBytes(StandardCharsets.UTF_8);
                    org.telegram.utils.twidget.r0 r0Var3 = (org.telegram.utils.twidget.r0) u0Var3.f54414e.get(Long.valueOf(j13));
                    if (r0Var3 == null) {
                        h12 = null;
                    } else {
                        h12 = r0Var3.h1();
                    }
                    if (h12 != null) {
                        try {
                            h12.d1(r0Var3.d, bytes2);
                        } catch (RemoteException unused3) {
                        }
                    }
                }
                l1Var.C = true;
                org.telegram.utils.twidget.u0 u0Var4 = l1Var.f54301c;
                boolean z12 = l1Var.F;
                org.telegram.utils.twidget.r0 r0Var4 = (org.telegram.utils.twidget.r0) u0Var4.f54414e.get(Long.valueOf(j13));
                if (r0Var4 != null) {
                    bVar = r0Var4.h1();
                }
                if (bVar != null) {
                    try {
                        bVar.v0(r0Var4.d, z12);
                    } catch (RemoteException unused4) {
                    }
                }
                l1Var.d();
                return;
        }
    }

    public e0(Object obj, Object obj2, int i7, Object obj3, long j3, int i10) {
        this.f3449a = i10;
        this.d = obj;
        this.f3452e = obj2;
        this.f3450b = i7;
        this.f3453f = obj3;
        this.f3451c = j3;
    }

    public e0(org.telegram.utils.twidget.l1 l1Var, long j3, int i7, String str, String str2) {
        this.f3449a = 5;
        this.d = l1Var;
        this.f3451c = j3;
        this.f3450b = i7;
        this.f3452e = str;
        this.f3453f = str2;
    }
}
