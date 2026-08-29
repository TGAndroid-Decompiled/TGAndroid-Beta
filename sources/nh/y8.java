package nh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
public final class y8 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final l8 A;
    public boolean B;
    public org.telegram.ui.ActionBar.c2 C;
    public long D;
    public String E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public boolean I;
    public boolean J;
    public float K;
    public ValueAnimator L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public final e9 S;
    public int f18901a;
    public final a0.h f18902b;
    public final ArrayList f18903c;
    public final HashMap d;
    public final FrameLayout f18904e;
    public final jl0 f18905f;
    public final f2.j0 h;
    public final u8 f18906n;
    public final w8 f18907r;
    public final View f18908s;
    public final d v;
    public final d f18909w;
    public final r8 f18910x;
    public final org.telegram.ui.Cells.s3 f18911y;

    public y8(e9 e9Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.ActionBar.c6 c6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var6;
        org.telegram.ui.ActionBar.c6 c6Var7;
        org.telegram.ui.ActionBar.c6 c6Var8;
        org.telegram.ui.ActionBar.c6 c6Var9;
        this.S = e9Var;
        this.f18902b = new a0.h();
        this.f18903c = new ArrayList();
        this.d = new HashMap();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.N = -1;
        c6Var = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, c6Var);
        this.f18911y = s3Var;
        c6Var2 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        r8 r8Var = new r8(this, context, c6Var2, new o8(this, 4));
        this.f18910x = r8Var;
        int i12 = org.telegram.ui.ActionBar.g6.f23133h5;
        r8Var.setBackgroundColor(e9Var.getThemedColor(i12));
        r8Var.setOnSearchTextChange(new p8(this, 3));
        c6Var3 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        l8 l8Var = new l8(context, c6Var3);
        this.A = l8Var;
        l8Var.h = new o8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18904e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        c6Var4 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        jl0 jl0Var = new jl0(context, c6Var4);
        this.f18905f = jl0Var;
        jl0Var.setClipToPadding(false);
        jl0Var.setTranslateSelector(true);
        c6Var5 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        u8 u8Var = new u8(this, context, c6Var5, r8Var, new lh.t3(e9Var, 2));
        this.f18906n = u8Var;
        jl0Var.setAdapter(u8Var);
        u8Var.h = jl0Var;
        f2.j0 j0Var = new f2.j0();
        this.h = j0Var;
        jl0Var.setLayoutManager(j0Var);
        jl0Var.setOnScrollListener(new s8(this, 0));
        jl0Var.setOnItemClickListener(new kg.w(6, this, context));
        frameLayout.addView(jl0Var, i7.f6.c(-1.0f, -1));
        t8 t8Var = new t8(this);
        t8Var.n(350L);
        t8Var.o(jr.h);
        t8Var.C = false;
        t8Var.f6463m = false;
        jl0Var.setItemAnimator(t8Var);
        frameLayout.addView(r8Var, i7.f6.e(-1, -2, 55));
        frameLayout.addView(s3Var, i7.f6.e(-1, 32, 55));
        addView(l8Var, i7.f6.e(-1, -2, 55));
        w8 w8Var = new w8(this, context);
        this.f18907r = w8Var;
        w8Var.setClickable(true);
        w8Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) e9Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) e9Var).backgroundPaddingLeft;
        w8Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        c6Var6 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var6));
        c6Var7 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        d dVar = new d(context, c6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new n8(this, 0));
        dVar.e();
        w8Var.addView(dVar, i7.f6.q(-1, 48, 87));
        c6Var8 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        d dVar2 = new d(context, c6Var8, false);
        this.f18909w = dVar2;
        dVar2.setOnClickListener(new n8(this, 1));
        dVar2.e();
        w8Var.addView(dVar2, i7.f6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f18908s = view;
        c6Var9 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var9));
        addView(view, i7.f6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(w8Var, i7.f6.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f18901a == 6) {
            ArrayList arrayList = this.f18903c;
            arrayList.clear();
            i10 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
            arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
            int i11 = 0;
            while (true) {
                a0.h hVar = this.f18902b;
                if (i11 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i11);
                if (((Boolean) hVar.n(i11)).booleanValue()) {
                    if (!arrayList.contains(Long.valueOf(j10))) {
                        arrayList.add(Long.valueOf(j10));
                    }
                } else {
                    arrayList.remove(Long.valueOf(j10));
                }
                i11++;
            }
            if (z10) {
                g(true);
                e(true);
                f(true);
            }
        }
    }

    public final void b(int i10) {
        int i11;
        this.f18901a = i10;
        this.f18902b.b();
        ArrayList arrayList = this.f18903c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        e9 e9Var = this.S;
        if (i10 == 4) {
            arrayList.addAll(e9Var.d);
            hashMap.putAll(e9Var.f17605e);
        } else if (i10 == 5) {
            arrayList.addAll(e9Var.F);
        } else if (i10 == 1) {
            ArrayList J0 = e9.J0(e9Var);
            for (int i12 = 0; i12 < J0.size(); i12 = a4.w.g(((TLRPC.User) J0.get(i12)).f22539id, arrayList, i12, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(e9Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(e9Var.f17607n);
            hashMap.putAll(e9Var.f17608r);
        } else if (i10 == 6) {
            a(false);
        }
        this.f18906n.getClass();
        this.h.k1(false);
        i(false);
        r8 r8Var = this.f18910x;
        r8Var.setText("");
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        r8Var.setVisibility(i11);
        r8Var.G = true;
        this.E = null;
        g(false);
        e(false);
        f(false);
        int i13 = this.f18901a;
        jl0 jl0Var = this.f18905f;
        if (i13 != 0) {
            jl0Var.u0(0);
        }
        jl0Var.requestLayout();
        this.N = -1;
    }

    public final float c() {
        int i10 = 0;
        float f9 = -j7.l1.d(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f18910x.F), 0);
        while (true) {
            jl0 jl0Var = this.f18905f;
            if (i10 < jl0Var.getChildCount()) {
                View childAt = jl0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f9, childAt.getY());
                }
                i10++;
            } else {
                return f9;
            }
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f18901a;
        int i12 = 0;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        e9 e9Var = this.S;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f22539id != 777000 && j11 != 0) {
                    if (z10 && !user.contact) {
                        arrayList2.add(Long.valueOf(j11));
                    } else {
                        arrayList.add(Long.valueOf(j11));
                    }
                    this.f18903c.remove(Long.valueOf(j11));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                c6Var2 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var2);
                alertDialog$Builder.f22714a.P = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.o();
                return;
            }
            Context context2 = getContext();
            c6Var = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, c6Var);
            alertDialog$Builder2.f22714a.P = arrayList2.size() + " members are not in your contact list";
            alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new d9.a(this, j10, arrayList, 4));
            alertDialog$Builder2.h("Cancel", null);
            alertDialog$Builder2.o();
            return;
        }
        this.d.put(Long.valueOf(j10), arrayList);
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            this.f18902b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        i(true);
        e(true);
        f(true);
        this.f18910x.G = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.c2 c2Var;
        if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (c2Var = this.C) != null && this.D == chatFull.f22393id) {
            c2Var.c(350L);
            this.C = null;
            this.D = -1L;
            d(chatFull.f22393id, chatFull.participants);
        }
    }

    public final void e(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12 = this.f18901a;
        e9 e9Var = this.S;
        d dVar = this.f18909w;
        int i13 = 0;
        boolean z12 = false;
        d dVar2 = this.v;
        if (i12 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (e9Var.H) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (e9Var.V) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i14 = e9Var.E;
                if (i14 == 1) {
                    if (e9Var.G) {
                        i11 = R.string.StoryLivePrivacyButtonPost;
                    } else {
                        i11 = R.string.StoryPrivacyButtonPost;
                    }
                    dVar2.g(LocaleController.getString(i11), z10, true);
                } else {
                    dVar2.g(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i14), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f18903c;
        if (i12 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        w8 w8Var = this.f18907r;
        if (i12 == 3) {
            int size = e9.l1(arrayList, this.d).size();
            e9Var.f17609s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            w8Var.b(z11, z10);
            dVar2.c(size, z10);
            if (size > 0) {
                z12 = true;
            }
            dVar2.setEnabled(z12);
            dVar.setVisibility(8);
        } else if (i12 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.c(0, z10);
            } else {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z10, true);
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i12 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
        } else if (i12 == 6) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            i10 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
            lh.s6 storiesController = MessagesController.getInstance(i10).getStoriesController();
            if (!storiesController.O) {
                while (true) {
                    a0.h hVar = this.f18902b;
                    if (i13 >= hVar.m()) {
                        break;
                    }
                    long j10 = hVar.j(i13);
                    ((Boolean) hVar.n(i13)).getClass();
                    storiesController.L.contains(Long.valueOf(j10));
                    i13++;
                }
            } else {
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i12 == 4) {
            int size2 = e9.l1(e9Var.d, e9Var.f17605e).size();
            e9Var.f17606f = size2;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            w8Var.b(false, z10);
            dVar2.c(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        e9 e9Var = this.S;
        ArrayList arrayList2 = e9Var.F;
        HashMap hashMap = e9Var.f17608r;
        ArrayList arrayList3 = e9Var.f17607n;
        ArrayList arrayList4 = e9Var.h;
        HashMap hashMap2 = e9Var.f17605e;
        ArrayList arrayList5 = e9Var.d;
        int i10 = this.f18901a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f18903c;
        if (i10 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i10 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i10 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i10 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.f18901a == 3 && (e9Var.J != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.N;
                if (i11 != -1) {
                    e9Var.J = i11;
                }
            } else {
                this.N = e9Var.J;
                e9Var.J = 3;
            }
        }
        HashSet l1 = e9.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.H;
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            m8 m8Var = (m8) arrayList.get(i12);
            if (m8Var != null) {
                int i13 = m8Var.f18141i;
                if (i13 > 0) {
                    if (e9Var.J != i13) {
                        z12 = false;
                    }
                    m8Var.f18143k = z12;
                    m8Var.f18144l = false;
                } else {
                    TLRPC.User user = m8Var.f18140g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f22539id));
                        m8Var.f18143k = contains;
                        m8Var.f18144l = (contains || !l1.contains(Long.valueOf(m8Var.f18140g.f22539id))) ? false : false;
                    } else {
                        TLRPC.Chat chat = m8Var.h;
                        if (chat != null) {
                            m8Var.f18143k = hashMap3.containsKey(Long.valueOf(chat.f22392id));
                            m8Var.f18144l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            jl0 jl0Var = this.f18905f;
            if (i14 < jl0Var.getChildCount()) {
                View childAt = jl0Var.getChildAt(i14);
                if ((childAt instanceof d9) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    m8 m8Var2 = (m8) arrayList.get(R);
                    d9 d9Var = (d9) childAt;
                    if (!m8Var2.f18143k && !m8Var2.f18144l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    d9Var.c(z11, z10);
                    TLRPC.Chat chat2 = m8Var2.h;
                    float f9 = 1.0f;
                    if (chat2 != null) {
                        if (e9.d1(e9Var, chat2) > 200) {
                            f9 = 0.3f;
                        }
                        d9Var.b(f9, z10);
                    } else {
                        if (m8Var2.f18144l && !m8Var2.f18143k) {
                            f9 = 0.5f;
                        }
                        d9Var.b(f9, z10);
                    }
                }
                i14++;
            } else {
                h(z10);
                return;
            }
        }
    }

    public final void g(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: nh.y8.g(boolean):void");
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.s3 s3Var = this.f18911y;
        if (s3Var == null) {
            return;
        }
        if (e9.l1(this.f18903c, this.d).size() > 0) {
            s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new n8(this, 2));
        } else if (z10) {
            s3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.r3 r3Var = s3Var.f25639b;
            r3Var.c(null, false, true);
            r3Var.setOnClickListener(null);
            r3Var.setVisibility(0);
        }
    }

    public final void i(boolean z10) {
        int i10;
        r8 r8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        org.telegram.ui.ActionBar.c6 c6Var;
        HashSet l1 = e9.l1(this.f18903c, this.d);
        int i11 = this.f18901a;
        e9 e9Var = this.S;
        if (i11 == 3) {
            e9Var.f17609s = l1.size();
        } else if (i11 == 4) {
            e9Var.f17606f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        while (true) {
            r8Var = this.f18910x;
            ArrayList arrayList4 = r8Var.d;
            arrayList = r8Var.d;
            if (i12 >= arrayList4.size()) {
                break;
            }
            j30 j30Var = (j30) arrayList.get(i12);
            if (!l1.contains(Long.valueOf(j30Var.getUid()))) {
                arrayList2.add(j30Var);
            }
            i12++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    if (((j30) arrayList.get(i13)).getUid() == longValue) {
                        break;
                    }
                    i13++;
                } else {
                    if (longValue >= 0) {
                        chat = messagesController.getUser(l10);
                    } else {
                        chat = messagesController.getChat(l10);
                    }
                    Object obj = chat;
                    if (obj != null) {
                        Context context = getContext();
                        c6Var = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
                        j30 j30Var2 = new j30(context, obj, null, true, c6Var);
                        j30Var2.setOnClickListener(this);
                        arrayList3.add(j30Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ig.j jVar = r8Var.f17432c;
        ArrayList arrayList5 = jVar.f8990e;
        ArrayList arrayList6 = jVar.d;
        ArrayList arrayList7 = jVar.f8991f;
        b9 b9Var = (b9) jVar.f8992n;
        b9Var.C = true;
        ArrayList arrayList8 = b9Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = jVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((j30) arrayList2.get(i14)).setOnClickListener(null);
        }
        jVar.c();
        if (z10) {
            jVar.f8989c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.f8988b = animatorSet;
            animatorSet.addListener(new a9(jVar, arrayList2, 0));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i15 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i15 >= size) {
                    break;
                }
                j30 j30Var3 = (j30) arrayList2.get(i15);
                arrayList5.add(j30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(j30Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(j30Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(j30Var3, property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                j30 j30Var4 = (j30) arrayList3.get(i16);
                arrayList6.add(j30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(j30Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(j30Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(j30Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                jVar.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            jVar.f8988b = null;
            jVar.f8989c = false;
            b9Var.f17430a.setAllowDrawCursor(true);
        }
        for (int i18 = 0; i18 < arrayList3.size(); i18++) {
            jVar.addView((View) arrayList3.get(i18));
        }
        jVar.requestLayout();
    }

    public final void j() {
        float c3 = c();
        boolean z10 = this.I;
        boolean z11 = false;
        float f9 = 1.0f;
        r8 r8Var = this.f18910x;
        if (!z10 && !this.Q && getTranslationX() == 0.0f) {
            if (!this.J || Math.abs(this.K - c3) > 1.0f) {
                this.J = true;
                ValueAnimator valueAnimator = this.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.L = null;
                }
                float translationY = r8Var.getTranslationY();
                this.K = c3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c3);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new lh.d5(this, 14));
                this.L.addListener(new q5(this, 3));
                this.L.setInterpolator(new LinearInterpolator());
                this.L.setDuration(180L);
                this.L.start();
            }
        } else {
            this.J = false;
            ValueAnimator valueAnimator2 = this.L;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.L = null;
            }
            r8Var.setTranslationY(c3);
        }
        boolean z12 = this.B;
        l8 l8Var = this.A;
        if (!z12) {
            l8Var.setVisibility(8);
            return;
        }
        l8Var.setVisibility(0);
        float f10 = -l8Var.getHeight();
        int i10 = 0;
        while (true) {
            jl0 jl0Var = this.f18905f;
            if (i10 < jl0Var.getChildCount()) {
                View childAt = jl0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f10 = this.f18904e.getPaddingTop() + childAt.getY();
                    break;
                }
                i10++;
            } else {
                z11 = true;
                break;
            }
        }
        if (this.M != z11) {
            this.M = z11;
            ((org.telegram.ui.ActionBar.h2) l8Var.f18050e).c((z11 || this.f18901a != 0) ? 0.0f : 0.0f, true);
        }
        l8Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onClick(View view) {
        r8 r8Var = this.f18910x;
        if (!r8Var.d.contains(view)) {
            return;
        }
        j30 j30Var = (j30) view;
        if (j30Var.f29540y) {
            r8Var.f17433e = null;
            ig.j jVar = r8Var.f17432c;
            b9 b9Var = (b9) jVar.f8992n;
            b9Var.C = true;
            b9Var.d.remove(j30Var);
            j30Var.setOnClickListener(null);
            jVar.c();
            jVar.f8989c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.f8988b = animatorSet;
            animatorSet.addListener(new bg.c3(10, jVar, j30Var));
            ArrayList arrayList = jVar.h;
            arrayList.clear();
            arrayList.add(j30Var);
            ArrayList arrayList2 = jVar.d;
            arrayList2.clear();
            jVar.f8990e.clear();
            arrayList2.add(j30Var);
            ArrayList arrayList3 = jVar.f8991f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(j30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(j30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(j30Var, View.ALPHA, 1.0f, 0.0f));
            jVar.requestLayout();
            long uid = j30Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f18903c;
                if (hasNext) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                        it.remove();
                        arrayList4.addAll((Collection) entry.getValue());
                        arrayList4.remove(Long.valueOf(uid));
                    }
                } else {
                    arrayList4.remove(Long.valueOf(uid));
                    f(true);
                    e(true);
                    return;
                }
            }
        } else {
            j30 j30Var2 = r8Var.f17433e;
            if (j30Var2 != null) {
                j30Var2.a();
                r8Var.f17433e = null;
            }
            r8Var.f17433e = j30Var;
            j30Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        boolean z15;
        float f9;
        boolean z16;
        int i15;
        e9 e9Var = this.S;
        i12 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardHeight;
        if (i12 > 0) {
            i15 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardHeight;
            this.P = i15;
        }
        super.onMeasure(i10, i11);
        int i16 = AndroidUtilities.statusBarHeight;
        if (this.f18901a == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(56.0f);
        }
        this.f18904e.setPadding(0, i16 + dp, 0, 0);
        boolean z17 = this.R;
        z10 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
        jl0 jl0Var = this.f18905f;
        w8 w8Var = this.f18907r;
        if (z17 != z10) {
            float c3 = c();
            z11 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
            if (z11 && c3 + Math.min(AndroidUtilities.dp(150.0f), this.f18910x.F) > jl0Var.getPaddingTop()) {
                uh.n nVar = new uh.n(getContext(), 2, 0.7f);
                nVar.f6373a = 1;
                nVar.f49306p = -AndroidUtilities.dp(56.0f);
                this.h.w0(nVar);
            }
            int i17 = this.f18901a;
            View view = this.f18908s;
            float f10 = 0.0f;
            if (i17 == 0) {
                z15 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                if (z15) {
                    f9 = this.P;
                } else {
                    f9 = 0.0f;
                }
                w8Var.setTranslationY(f9);
                z16 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                if (z16) {
                    f10 = this.P;
                }
                view.setTranslationY(f10);
            } else {
                z12 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                if (z12) {
                    i13 = this.P;
                } else {
                    i13 = -this.P;
                }
                float f11 = i13;
                ValueAnimator valueAnimator = w8Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    w8Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                w8Var.d = ofFloat;
                ofFloat.addUpdateListener(new v8(w8Var, 1));
                w8Var.d.addListener(new q5(w8Var, 4));
                w8Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = w8Var.d;
                jr jrVar = org.telegram.ui.ActionBar.q1.f23735w;
                valueAnimator2.setInterpolator(jrVar);
                w8Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                if (z13) {
                    i14 = this.P;
                } else {
                    i14 = -this.P;
                }
                view.setTranslationY(i14);
                this.Q = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(jrVar).withEndAction(new o8(this, 2)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
            this.R = z14;
        }
        jl0Var.setPadding(0, 0, 0, w8Var.getMeasuredHeight());
    }
}
