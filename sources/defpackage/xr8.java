package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d0;
import org.telegram.ui.e0;
public final class xr8 implements ee, ira, oac, CameraView.CameraViewDelegate, Continuation, g59, ou3, oh9, ni7, k01, kq9, es6, QuickAckDelegate, ue7, fu2, h59, jg8 {
    public final byte a;
    public final Object b;
    public final Object c;

    public xr8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        rs8 rs8Var = (rs8) this.b;
        rs8Var.e.l.remove((TL_stars.SavedStarGift) this.c);
        rs8Var.f(true);
        int i = rs8Var.b;
        int i2 = (j > z8c.h(i).e() ? 1 : (j == z8c.h(i).e() ? 0 : -1));
        lea leaVar = rs8Var.a;
        if (i2 == 0) {
            c41 b0 = c41.b0(leaVar.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = jb6.M0(2131752840, null);
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            u31 O = b0.O(document, M0, jb6.a0(null, null, 2131752841, kt6.m(tL_starGiftUnique.num, ',', sb)));
            O.s = false;
            O.j();
        } else {
            u31 O2 = c41.b0(leaVar.a).O(tL_starGiftUnique.getDocument(), jb6.M0(2131752838, null), jb6.a0(null, null, 2131752839, pg3.r(i, j)));
            O2.s = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.w0.c(true);
        }
    }

    @Override
    public final void accept(Object obj) {
        long max;
        qcb qcbVar = (qcb) this.b;
        AtomicLong atomicLong = (AtomicLong) this.c;
        i53 i53Var = (i53) obj;
        pcb pcbVar = new pcb(i53Var.b, k4f.l3(i53Var.a, i53Var.c));
        qcbVar.c.add(pcbVar);
        long j = i53Var.d;
        if (j != -9223372036854775807L) {
            if (atomicLong.get() == -9223372036854775807L) {
                max = j;
            } else {
                max = Math.max(atomicLong.get(), j);
            }
            atomicLong.set(max);
        }
        long j2 = qcbVar.l;
        if (j2 != -9223372036854775807L && j < j2) {
            return;
        }
        qcbVar.g(pcbVar);
    }

    @Override
    public final Object apply(Object obj) {
        fl8[] values;
        mq9 mq9Var = (mq9) this.b;
        rb0 rb0Var = (rb0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        qa0 qa0Var = mq9Var.d;
        ArrayList d = mq9Var.d(sQLiteDatabase, rb0Var, qa0Var.b);
        for (fl8 fl8Var : fl8.values()) {
            if (fl8Var != rb0Var.c) {
                int size = qa0Var.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(mq9Var.d(sQLiteDatabase, rb0Var.b(fl8Var), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < d.size(); i++) {
            sb.append(((eb0) d.get(i)).a);
            if (i < d.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new lq9(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            eb0 eb0Var = (eb0) listIterator.next();
            long j2 = eb0Var.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                oa0 c = eb0Var.c.c();
                for (lq9 lq9Var : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.a(lq9Var.a, lq9Var.b);
                }
                listIterator.set(new eb0(j2, eb0Var.b, c.b()));
            }
        }
        return d;
    }

    @Override
    public final void b(Canvas canvas) {
        View view = (View) this.c;
        tj9 tj9Var = ((nj9) this.b).X;
        AtomicReference atomicReference = tj9Var.E;
        StaticLayout staticLayout = tj9Var.b;
        ArrayList arrayList = tj9Var.x;
        rna.g(view, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        gn.drawAnimatedEmojis(canvas, tj9Var.b, tj9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public final void c(TLRPC.MessageMedia messageMedia) {
        krb krbVar = (krb) this.b;
        yv1 yv1Var = (yv1) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = krbVar.H.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        krbVar.H.k.media = messageMedia;
        yv1Var.getSendMessagesHelper().s(krbVar.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public final void cancel() {
        ((bq9) this.b).b.removeCallbacks((up9) this.c);
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        TL_stars.SavedStarGift savedStarGift;
        AlertDialog$Builder alertDialog$Builder;
        ?? r3;
        ok okVar;
        long e;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i6 = 0;
        switch (this.a) {
            case 7:
                yb9 yb9Var = (yb9) this.b;
                xb9 xb9Var = (xb9) this.c;
                c6c G = yb9Var.d2.G(i - 1);
                if (G != null) {
                    Object obj = G.H;
                    if (obj instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                        boolean z4 = G.s;
                        if (!TextUtils.isEmpty(starGift.gift_address) && yb9Var.c2 && !oc7.r1(yb9Var.a).l4.w.f) {
                            alertDialog$Builder = new AlertDialog$Builder(0, yb9Var.J0, yb9Var.getContext());
                            r3 = 0;
                            alertDialog$Builder.a.S = jb6.M0(2131749725, null);
                            alertDialog$Builder.a.U = jb6.M0(2131749726, null);
                        } else {
                            if (z4) {
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.H;
                                    he heVar = new he(3, null, yb9Var.getContext());
                                    heVar.q(400L);
                                    long e2 = z8c.h(yb9Var.a).e();
                                    if (tL_starGiftUnique.resale_ton_only) {
                                        okVar = ok.b;
                                    } else {
                                        okVar = ok.a;
                                    }
                                    ok okVar2 = okVar;
                                    jva.u(yb9Var.a, okVar2).E(tL_starGiftUnique, e2, null, true, new c28(yb9Var, heVar, okVar2, tL_starGiftUnique, e2));
                                    return;
                                }
                            } else {
                                ArrayList arrayList2 = xb9Var.b.l;
                                int size = arrayList2.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 < size) {
                                        Object obj2 = arrayList2.get(i7);
                                        i7++;
                                        savedStarGift = (TL_stars.SavedStarGift) obj2;
                                        if (savedStarGift.gift == starGift) {
                                        }
                                    } else {
                                        savedStarGift = null;
                                    }
                                }
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(yb9Var.a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(yb9Var.getContext());
                                    r3 = 0;
                                    alertDialog$Builder.a.S = jb6.M0(2131749688, null);
                                    alertDialog$Builder.a.U = gm.S2(jb6.a0(null, null, 2131749689, jb6.x(savedStarGift.can_craft_at, true)));
                                }
                            }
                            yb9Var.a2.a(starGift);
                            yb9Var.dismiss();
                            return;
                        }
                        b10.t(r3, 2131747564, alertDialog$Builder, r3);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                v7b v7bVar = (v7b) this.b;
                Context context = (Context) this.c;
                ArrayList arrayList3 = v7bVar.M;
                vh6 vh6Var = v7bVar.b;
                o7b o7bVar = v7bVar.y;
                HashMap hashMap = v7bVar.d;
                ArrayList arrayList4 = v7bVar.c;
                a8b a8bVar = v7bVar.a0;
                dy0 dy0Var = a8bVar.c;
                if (i >= 0 && i < arrayList3.size()) {
                    k7b k7bVar = (k7b) arrayList3.get(i);
                    int i8 = k7bVar.a;
                    if (i8 == 3) {
                        if (k7bVar.n && a8bVar.z1) {
                            new h7b(context, a8bVar.a, a8bVar.E1, a8bVar.m1, new n7b(v7bVar, (byte) 0), a8bVar.J0).show();
                            return;
                        }
                        byte b = k7bVar.i;
                        if (b == 1) {
                            if (a8bVar.H1 == 1 || a8bVar.H0().isEmpty()) {
                                a8bVar.G1 = 1;
                                a8bVar.l1.E(1);
                            }
                            a8bVar.H1 = 1;
                            v7bVar.g(true);
                            return;
                        } else if (b == 3) {
                            if (a8bVar.H1 == 3 || (a8bVar.r1.isEmpty() && a8bVar.s1.isEmpty())) {
                                a8bVar.G1 = 3;
                                a8bVar.l1.E(1);
                            }
                            a8bVar.H1 = 3;
                            v7bVar.g(true);
                            return;
                        } else if (b == 2) {
                            if (a8bVar.H1 == 2) {
                                a8bVar.G1 = 2;
                                a8bVar.l1.E(1);
                            }
                            a8bVar.H1 = 2;
                            v7bVar.g(true);
                            return;
                        } else if (b == 4) {
                            if (a8bVar.H1 == 4) {
                                a8bVar.G1 = 4;
                                a8bVar.l1.E(1);
                            }
                            a8bVar.H1 = 4;
                            v7bVar.g(true);
                            return;
                        } else {
                            if (b > 0) {
                                arrayList4.clear();
                                hashMap.clear();
                                a8bVar.H1 = k7bVar.i;
                                o7bVar.d.a();
                                z3 = true;
                            } else {
                                TLRPC.Chat chat = k7bVar.h;
                                if (chat != null) {
                                    long j = chat.id;
                                    int i9 = a8b.X1;
                                    if (a8bVar.J0(chat) > 200) {
                                        try {
                                            v7bVar.performHapticFeedback(3, 1);
                                        } catch (Throwable unused) {
                                        }
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, a8bVar.J0, v7bVar.getContext());
                                        alertDialog$Builder2.a.S = jb6.M0(2131749151, null);
                                        alertDialog$Builder2.a.U = jb6.M0(2131749150, null);
                                        b10.t(null, 2131747564, alertDialog$Builder2, null);
                                    } else if (hashMap.containsKey(Long.valueOf(j))) {
                                        ArrayList arrayList5 = (ArrayList) hashMap.get(Long.valueOf(j));
                                        if (arrayList5 != null) {
                                            int size2 = arrayList5.size();
                                            while (i6 < size2) {
                                                Object obj3 = arrayList5.get(i6);
                                                i6++;
                                                vh6Var.k(Boolean.FALSE, ((Long) obj3).longValue());
                                            }
                                        }
                                        hashMap.remove(Long.valueOf(j));
                                        v7bVar.j(true);
                                    } else {
                                        TLRPC.Chat L0 = oc7.r1(a8bVar.a).L0(Long.valueOf(j));
                                        TLRPC.ChatFull M0 = oc7.r1(a8bVar.a).M0(j);
                                        if (M0 != null && (chatParticipants = M0.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && M0.participants.participants.size() >= M0.participants_count - 1) {
                                            v7bVar.e(j, M0.participants);
                                        } else {
                                            he heVar2 = v7bVar.H;
                                            if (heVar2 != null) {
                                                heVar2.dismiss();
                                                v7bVar.H = null;
                                            }
                                            v7bVar.I = j;
                                            he heVar3 = new he(3, a8bVar.J0, v7bVar.getContext());
                                            v7bVar.H = heVar3;
                                            heVar3.q(50L);
                                            cf7 Y = cf7.Y(a8bVar.a);
                                            Y.a.c(new nz8(v7bVar, L0, Y, j));
                                        }
                                        if (!TextUtils.isEmpty(v7bVar.J)) {
                                            o7bVar.setText("");
                                            v7bVar.J = null;
                                            v7bVar.h(false);
                                        }
                                    }
                                } else {
                                    TLRPC.User user = k7bVar.g;
                                    if (user != null) {
                                        if (v7bVar.a == 0) {
                                            a8bVar.H1 = 0;
                                        }
                                        long j2 = user.id;
                                        HashSet hashSet = new HashSet(arrayList4);
                                        if (arrayList4.contains(Long.valueOf(j2))) {
                                            Iterator it = hashMap.entrySet().iterator();
                                            while (it.hasNext()) {
                                                Map.Entry entry = (Map.Entry) it.next();
                                                if (((ArrayList) entry.getValue()).contains(Long.valueOf(j2))) {
                                                    it.remove();
                                                    hashSet.addAll((Collection) entry.getValue());
                                                }
                                            }
                                            hashSet.remove(Long.valueOf(j2));
                                            vh6Var.k(Boolean.FALSE, j2);
                                        } else {
                                            Iterator it2 = hashMap.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                Map.Entry entry2 = (Map.Entry) it2.next();
                                                if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j2))) {
                                                    it2.remove();
                                                    hashSet.addAll((Collection) entry2.getValue());
                                                }
                                            }
                                            hashSet.add(Long.valueOf(j2));
                                            if (!TextUtils.isEmpty(v7bVar.J)) {
                                                o7bVar.setText("");
                                                v7bVar.J = null;
                                                v7bVar.h(false);
                                            }
                                            vh6Var.k(Boolean.TRUE, j2);
                                        }
                                        arrayList4.clear();
                                        arrayList4.addAll(hashSet);
                                        z3 = true;
                                        v7bVar.j(true);
                                    }
                                }
                                z3 = true;
                            }
                            v7bVar.g(z3);
                            v7bVar.f(z3);
                            o7bVar.M = z3;
                            return;
                        }
                    } else if (i8 == 7) {
                        if (view instanceof xib) {
                            xib xibVar = (xib) view;
                            xibVar.setChecked(!xibVar.d());
                            k7bVar.k = xibVar.d();
                            byte b2 = k7bVar.c;
                            if (b2 == 0) {
                                boolean d = xibVar.d();
                                a8bVar.w1 = d;
                                if (a8bVar.H1 == 4) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                ylb ylbVar = a8bVar.J0;
                                if (d) {
                                    c41 c41Var = new c41(dy0Var, ylbVar);
                                    if (z2) {
                                        i5 = 2131744355;
                                    } else {
                                        i5 = 2131744356;
                                    }
                                    u31 G2 = c41Var.G(2131624056, 4, jb6.M0(i5, null));
                                    G2.j = 5000;
                                    G2.k(true);
                                    return;
                                }
                                c41 c41Var2 = new c41(dy0Var, ylbVar);
                                if (z2) {
                                    i4 = 2131744369;
                                } else {
                                    i4 = 2131744370;
                                }
                                u31 G3 = c41Var2.G(2131624113, 4, jb6.M0(i4, null));
                                G3.j = 5000;
                                G3.k(true);
                                return;
                            } else if (b2 == 1) {
                                boolean d2 = xibVar.d();
                                a8bVar.x1 = d2;
                                boolean z5 = a8bVar.m1 instanceof TLRPC.TL_inputPeerChannel;
                                ylb ylbVar2 = a8bVar.J0;
                                if (d2) {
                                    c41 c41Var3 = new c41(dy0Var, ylbVar2);
                                    if (z5) {
                                        i3 = 2131744393;
                                    } else {
                                        i3 = 2131744357;
                                    }
                                    u31 G4 = c41Var3.G(2131624103, 4, jb6.M0(i3, null));
                                    G4.j = 5000;
                                    z = true;
                                    G4.k(true);
                                } else {
                                    c41 c41Var4 = new c41(dy0Var, ylbVar2);
                                    if (z5) {
                                        i2 = 2131744394;
                                    } else {
                                        i2 = 2131744371;
                                    }
                                    u31 G5 = c41Var4.G(2131624021, 4, jb6.M0(i2, null));
                                    G5.j = 5000;
                                    z = true;
                                    G5.k(true);
                                }
                                v7bVar.h(z);
                                return;
                            } else if (b2 == 2) {
                                a8bVar.v1 = xibVar.d();
                                v7bVar.h(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (i8 == 9) {
                        byte b3 = k7bVar.q;
                        if (b3 == 0) {
                            f8b f8bVar = a8bVar.W1;
                            if (f8bVar != null) {
                                f8bVar.run();
                                return;
                            }
                            return;
                        } else if (b3 == 1) {
                            TLRPC.InputPeer inputPeer = a8bVar.m1;
                            if (inputPeer != null) {
                                e = pg3.m(inputPeer);
                            } else {
                                e = z8c.h(a8bVar.a).e();
                            }
                            int i10 = a8b.X1;
                            bu5 G6 = bu5.G(v7bVar, a8bVar.J0, view);
                            G6.b(2131232052, jb6.M0(2131744474, null), new toa(v7bVar, e, (byte) 5), false);
                            G6.j();
                            bu5.e(G6, oc7.r1(a8bVar.a).N1().A(e, true), a8bVar.u1, false, null, new ts9(v7bVar, G6, (byte) 14));
                            G6.a0();
                            return;
                        } else if (b3 == 5) {
                            Context context2 = v7bVar.getContext();
                            int i11 = a8b.X1;
                            he heVar4 = new he(3, a8bVar.J0, context2);
                            heVar4.q(500L);
                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                            getgroupcallstreamrtmpurl.live_story = true;
                            TLRPC.InputPeer inputPeer2 = a8bVar.m1;
                            if (inputPeer2 == null) {
                                inputPeer2 = new TLRPC.TL_inputPeerSelf();
                            }
                            getgroupcallstreamrtmpurl.peer = inputPeer2;
                            ConnectionsManager.getInstance(a8bVar.a).sendRequest(getgroupcallstreamrtmpurl, new fm8(v7bVar, heVar4, getgroupcallstreamrtmpurl, (byte) 22));
                            return;
                        } else if (b3 == 6) {
                            a8bVar.A1 = false;
                            v7bVar.h(true);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                ((ThemeActivity) this.b).z0((Context) this.c, view, i, f);
                return;
        }
    }

    @Override
    public final void f(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (!((ds6) arrayList.get(i)).a.startsWith("animated_")) {
                    String c = gw3.c(((ds6) arrayList.get(i)).a);
                    if (gw3.g(c) != null) {
                        linkedHashSet.add(c);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public final boolean g(int i, View view) {
        String str;
        d0 d0Var = (d0) this.b;
        e0 e0Var = (e0) this.c;
        ThemeActivity themeActivity = d0Var.e;
        if (i >= 0 && i < e0Var.e.size()) {
            amb ambVar = (amb) e0Var.e.get(i);
            if (ambVar.a >= 100 && !ambVar.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = jb6.M0(2131747530, "OpenInEditor");
                String M02 = jb6.M0(2131745160, "ShareTheme");
                TLRPC.TL_theme tL_theme = ambVar.r;
                if (tL_theme != null && tL_theme.creator) {
                    str = jb6.M0(2131743830, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {M0, M02, str, jb6.M0(2131751423, "DeleteTheme")};
                rn5 rn5Var = new rn5(d0Var, ambVar, e0Var, (byte) 1);
                he heVar = alertDialog$Builder.a;
                heVar.Q = charSequenceArr;
                heVar.R = new int[]{2131232122, 2131232369, 2131232209, 2131232114};
                heVar.N = rn5Var;
                themeActivity.showDialog(heVar);
                heVar.l(heVar.O0.size() - 1, cmb.w0(null, cmb.p7, false), cmb.w0(null, cmb.o7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        boolean z;
        boolean z2;
        us8 us8Var = (us8) this.b;
        b61 b61Var = (b61) this.c;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        long j = ((TL_stars.SavedStarGift) ((c6c) obj).H).gift.id;
        if (us8Var.l1 == j) {
            us8Var.l1 = 0L;
            j = 0;
        } else {
            us8Var.l1 = j;
        }
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        b61Var.setEnabled(z);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof j28) {
                    j28 j28Var = (j28) childAt;
                    if (us8Var.l1 == j28Var.getGiftId()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    j28Var.b(z2, true);
                }
            }
        }
    }

    @Override
    public final void m() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                ((sd9) obj2).i();
                ((rd9) obj).j2();
                return;
            default:
                kk9 kk9Var = (kk9) obj2;
                nk9 nk9Var = (nk9) obj;
                TL_iv.pageTableCell pagetablecell = nk9Var.b;
                if (pagetablecell != null) {
                    fhb.d(pagetablecell, nk9Var.a.getText());
                }
                kg9 kg9Var = kk9Var.F;
                if (kg9Var != null && kk9Var.a != null) {
                    kg9Var.a.W3();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onCameraInit() {
        zx8 zx8Var = (zx8) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (!zx8Var.W && !zx8Var.i0 && !zx8Var.m0) {
            zx8Var.i0 = true;
            zx8Var.h0.postDelayed(zx8Var.z0, 150L);
        }
    }

    @Override
    public final void p(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void r(he heVar, int i) {
        boolean z;
        boolean z2;
        tk5 tk5Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                fs8 fs8Var = (fs8) obj2;
                qac qacVar = (qac) obj;
                String obj3 = fs8Var.getText().toString();
                if (obj3.length() > 0 && obj3.length() <= 12) {
                    qacVar.a(obj3);
                    heVar.dismiss();
                    return;
                }
                gm.z3(fs8Var);
                return;
            case 15:
                sj3 sj3Var = (sj3) obj2;
                sj3Var.getClass();
                heVar.dismiss();
                sj3Var.M0.getDownloadController().j((ArrayList) obj);
                sj3Var.R(false);
                return;
            case 18:
                k0a k0aVar = (k0a) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    k0aVar.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    jq9 jq9Var = new jq9(k0aVar, user, twoStepVerificationActivity, (byte) 2);
                    twoStepVerificationActivity.a0 = (byte) 0;
                    twoStepVerificationActivity.c0 = jq9Var;
                    S.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 21:
                ((Runnable) obj2).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = hs6.b0((TLRPC.StickerSet) obj);
                ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_stickers_deleteStickerSet, new nf2((byte) 9));
                return;
            case 24:
                ((ThemeActivity) obj2).y0((b7b) obj);
                return;
            default:
                d0 d0Var = (d0) obj2;
                bmb bmbVar = (bmb) obj;
                d0Var.getClass();
                oc7 r1 = oc7.r1(bmbVar.F);
                if (bmbVar == cmb.J) {
                    z = true;
                } else {
                    z = false;
                }
                r1.C4(bmbVar, null, z, true);
                HashMap hashMap = cmb.H;
                if (bmbVar.b == null) {
                    z2 = false;
                } else {
                    if (cmb.I == bmbVar) {
                        cmb.t(cmb.L, true, false);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bmbVar == cmb.J) {
                        cmb.J = (bmb) hashMap.get("Dark Blue");
                    }
                    bmbVar.s();
                    cmb.G.remove(bmbVar);
                    hashMap.remove(bmbVar.a);
                    xlb xlbVar = bmbVar.j0;
                    if (xlbVar != null) {
                        xlbVar.a();
                    }
                    cmb.F.remove(bmbVar);
                    new File(bmbVar.b).delete();
                    cmb.w1(true, false);
                }
                if (z2) {
                    tk5Var = ((d) d0Var.e).parentLayout;
                    ((ActionBarLayout) tk5Var).W(true, true);
                }
                nm7.e().k(270, new Object[0]);
                return;
        }
    }

    @Override
    public final void run() {
        TLRPC.Message message = (TLRPC.Message) this.c;
        gm.c3(new y3a((a6a) this.b, message, message.id, (byte) 1));
    }

    @Override
    public final Object then(Task task) {
        mj4 mj4Var = (mj4) this.b;
        String str = (String) this.c;
        synchronized (mj4Var) {
            ((qt) mj4Var.c).remove(str);
        }
        return task;
    }

    @Override
    public final boolean u(View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void z(boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 20:
                nha nhaVar = (nha) obj2;
                d dVar = nhaVar.y1;
                dVar.finishFragment();
                dVar.getNotificationCenter().n((jm7) dVar, 4);
                dVar.getNotificationCenter().k(4, new Object[0]);
                dVar.getNotificationCenter().k(181, Long.valueOf(nhaVar.m1), (TLRPC.User) obj, null, Boolean.valueOf(z));
                dVar.getMessagesController().V4(false);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                sxb sxbVar = ((cxb) obj2).b;
                sxbVar.getNotificationCenter().n(sxbVar, 4);
                sxbVar.getNotificationCenter().k(4, new Object[0]);
                sxbVar.finishFragment();
                sxbVar.getNotificationCenter().k(181, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z));
                return;
        }
    }

    @Override
    public final void run(long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        ((zg9) this.b).a((String) this.c, tL_inlineButtonTypeUserProfile);
    }

    private final void e(View view, float f, float f2) {
    }

    private final void h(View view, float f, float f2) {
    }

    private final void i(View view, float f, float f2) {
    }
}
