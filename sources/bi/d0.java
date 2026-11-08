package bi;

import android.content.Context;
import android.os.RemoteException;
import java.nio.charset.StandardCharsets;
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
import org.telegram.ui.p31;
public final class d0 implements Runnable {
    public final int f3632a;
    public final int f3633b;
    public final long f3634c;
    public final Object d;
    public final Object f3635e;
    public final Object f3636f;

    public d0(Context context, int i7, org.telegram.messenger.s9 s9Var, long j3, Runnable runnable) {
        this.f3632a = 5;
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
        org.telegram.utils.twidget.b h12;
        org.telegram.utils.twidget.b h13;
        org.telegram.utils.twidget.b h14;
        int i7 = 0;
        String str = null;
        org.telegram.utils.twidget.b bVar = null;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        switch (this.f3632a) {
            case 0:
                m0 m0Var = (m0) this.f3635e;
                int i10 = this.f3633b;
                TLObject tLObject = (TLObject) this.f3636f;
                long j3 = this.f3634c;
                int i11 = ((n0) this.d).f4384a;
                boolean[] zArr = m0Var.d;
                boolean[] zArr2 = m0Var.f4302b;
                ArrayList[] arrayListArr = m0Var.f4301a;
                zArr[i10] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    qp.s1(i11).Y3(starsStatus.users, false);
                    qp.s1(i11).S3(starsStatus.chats, false);
                    arrayListArr[i10].addAll(starsStatus.history);
                    if (arrayListArr[i10].isEmpty() && !zArr2[i10]) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    zArr2[i10] = z9;
                    boolean[] zArr3 = m0Var.f4304e;
                    if ((starsStatus.flags & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zArr3[i10] = z10;
                    String[] strArr = m0Var.f4303c;
                    if (!z10) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i10] = str;
                    qs.f(i11).k(226, Long.valueOf(j3));
                    return;
                }
                return;
            case 1:
                fi.d dVar = (fi.d) this.d;
                int i12 = this.f3633b;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.f3636f;
                long j10 = this.f3634c;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) this.f3635e).f27186id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                ConnectionsManager.getInstance(i12).sendRequest(tL_fulfillStarsSubscription, new b0(i12, 1, j10, dVar, v2VarArr));
                return;
            case 2:
                di.y6 y6Var = (di.y6) this.d;
                TLObject tLObject2 = (TLObject) this.f3636f;
                int i13 = this.f3633b;
                String str2 = (String) this.f3635e;
                long j11 = this.f3634c;
                int i14 = y6Var.f9963a;
                HashSet hashSet = y6Var.f9980t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    qp.s1(i14).Y3(tL_stories_stories.users, false);
                    qp.s1(i14).S3(tL_stories_stories.chats, false);
                    while (true) {
                        if (i7 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i7).f27195id == i13) {
                                storyItem = tL_stories_stories.stories.get(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                y6Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j11;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = qp.s1(i14).z1(j11);
                    tL_updateStory.story = storyItem;
                    y6Var.c0(tL_updateStory);
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
                y6Var.f9972l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                TLRPC.User user = (TLRPC.User) this.f3635e;
                int i15 = this.f3633b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f3636f;
                long j12 = this.f3634c;
                if (user != null) {
                    q1Var.f29906k7[i15].r(user);
                    q1Var.f29893j7[i15].i0(user, q1Var.f29906k7[i15], null);
                    return;
                } else if (chat != null) {
                    q1Var.f29906k7[i15].q(chat);
                    q1Var.f29893j7[i15].i0(chat, q1Var.f29906k7[i15], null);
                    return;
                } else {
                    q1Var.f29906k7[i15].k(j12, "", "", null);
                    return;
                }
            case 4:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.d;
                long j13 = this.f3634c;
                int i16 = this.f3633b;
                String str4 = (String) this.f3635e;
                String str5 = (String) this.f3636f;
                if (i1Var.f52854w) {
                    org.telegram.utils.twidget.a1.f52753a.execute(new p31(i1Var, j13, 2));
                    return;
                }
                i1Var.v = j13;
                int i17 = i1Var.G;
                if (i17 != i16 && i17 > 0) {
                    org.telegram.utils.twidget.r0 r0Var = i1Var.f52837c;
                    float f10 = i17 / i1Var.f52844l;
                    org.telegram.utils.twidget.o0 o0Var = (org.telegram.utils.twidget.o0) r0Var.f52958e.get(Long.valueOf(j13));
                    if (o0Var == null) {
                        h14 = null;
                    } else {
                        h14 = o0Var.h1();
                    }
                    if (h14 != null) {
                        try {
                            h14.G0(o0Var.d, f10);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                if (!i1Var.B.equals(str4)) {
                    org.telegram.utils.twidget.r0 r0Var2 = i1Var.f52837c;
                    byte[] bytes = i1Var.B.getBytes(StandardCharsets.UTF_8);
                    org.telegram.utils.twidget.o0 o0Var2 = (org.telegram.utils.twidget.o0) r0Var2.f52958e.get(Long.valueOf(j13));
                    if (o0Var2 == null) {
                        h13 = null;
                    } else {
                        h13 = o0Var2.h1();
                    }
                    if (h13 != null) {
                        try {
                            h13.e0(o0Var2.d, bytes);
                        } catch (RemoteException unused2) {
                        }
                    }
                }
                if (i1Var.f52843k != null && !i1Var.f52843k.equals(str5)) {
                    org.telegram.utils.twidget.r0 r0Var3 = i1Var.f52837c;
                    byte[] bytes2 = i1Var.f52843k.getBytes(StandardCharsets.UTF_8);
                    org.telegram.utils.twidget.o0 o0Var3 = (org.telegram.utils.twidget.o0) r0Var3.f52958e.get(Long.valueOf(j13));
                    if (o0Var3 == null) {
                        h12 = null;
                    } else {
                        h12 = o0Var3.h1();
                    }
                    if (h12 != null) {
                        try {
                            h12.d1(o0Var3.d, bytes2);
                        } catch (RemoteException unused3) {
                        }
                    }
                }
                i1Var.C = true;
                org.telegram.utils.twidget.r0 r0Var4 = i1Var.f52837c;
                boolean z11 = i1Var.F;
                org.telegram.utils.twidget.o0 o0Var4 = (org.telegram.utils.twidget.o0) r0Var4.f52958e.get(Long.valueOf(j13));
                if (o0Var4 != null) {
                    bVar = o0Var4.h1();
                }
                if (bVar != null) {
                    try {
                        bVar.u0(o0Var4.d, z11);
                    } catch (RemoteException unused4) {
                    }
                }
                i1Var.d();
                return;
            default:
                new zh.a4((Context) this.d, this.f3633b, ((org.telegram.messenger.s9) this.f3635e).d, null, this.f3634c, (Runnable) this.f3636f, false, false).show();
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

    public d0(org.telegram.utils.twidget.i1 i1Var, long j3, int i7, String str, String str2) {
        this.f3632a = 4;
        this.d = i1Var;
        this.f3634c = j3;
        this.f3633b = i7;
        this.f3635e = str;
        this.f3636f = str2;
    }
}
