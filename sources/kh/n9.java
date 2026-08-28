package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.wk0;
public final class n9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final z8 A;
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
    public final t9 S;
    public int f15767a;
    public final a0.h f15768b;
    public final ArrayList f15769c;
    public final HashMap d;
    public final FrameLayout f15770e;
    public final wk0 f15771f;
    public final f2.m0 h;
    public final j9 f15772n;
    public final l9 f15773r;
    public final View f15774s;
    public final d v;
    public final d f15775w;
    public final f9 f15776x;
    public final org.telegram.ui.Cells.v3 f15777y;

    public n9(t9 t9Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        org.telegram.ui.ActionBar.b6 b6Var5;
        int i9;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var6;
        org.telegram.ui.ActionBar.b6 b6Var7;
        org.telegram.ui.ActionBar.b6 b6Var8;
        org.telegram.ui.ActionBar.b6 b6Var9;
        this.S = t9Var;
        this.f15768b = new a0.h();
        this.f15769c = new ArrayList();
        this.d = new HashMap();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.N = -1;
        b6Var = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, b6Var);
        this.f15777y = v3Var;
        b6Var2 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        f9 f9Var = new f9(this, context, b6Var2, new c9(this, 4));
        this.f15776x = f9Var;
        int i11 = org.telegram.ui.ActionBar.f6.f23072h5;
        f9Var.setBackgroundColor(t9Var.getThemedColor(i11));
        f9Var.setOnSearchTextChange(new d9(this, 3));
        b6Var3 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        z8 z8Var = new z8(context, b6Var3);
        this.A = z8Var;
        z8Var.h = new c9(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15770e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        b6Var4 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        wk0 wk0Var = new wk0(context, b6Var4);
        this.f15771f = wk0Var;
        wk0Var.setClipToPadding(false);
        wk0Var.setTranslateSelector(true);
        b6Var5 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        j9 j9Var = new j9(this, context, b6Var5, f9Var, new ih.y3(t9Var, 2));
        this.f15772n = j9Var;
        wk0Var.setAdapter(j9Var);
        j9Var.h = wk0Var;
        f2.m0 m0Var = new f2.m0();
        this.h = m0Var;
        wk0Var.setLayoutManager(m0Var);
        wk0Var.setOnScrollListener(new g9(this, 0));
        wk0Var.setOnItemClickListener(new ih.v3(3, this, context));
        frameLayout.addView(wk0Var, g7.e6.c(-1.0f, -1));
        h9 h9Var = new h9(this);
        h9Var.n(350L);
        h9Var.o(gr.h);
        h9Var.C = false;
        h9Var.f5532m = false;
        wk0Var.setItemAnimator(h9Var);
        frameLayout.addView(f9Var, g7.e6.e(-1, -2, 55));
        frameLayout.addView(v3Var, g7.e6.e(-1, 32, 55));
        addView(z8Var, g7.e6.e(-1, -2, 55));
        l9 l9Var = new l9(this, context);
        this.f15773r = l9Var;
        l9Var.setClickable(true);
        l9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i9 = ((org.telegram.ui.ActionBar.f3) t9Var).backgroundPaddingLeft;
        int i12 = i9 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) t9Var).backgroundPaddingLeft;
        l9Var.setPadding(i12, dp2, i10 + dp3, AndroidUtilities.dp(10.0f));
        b6Var6 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        l9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var6));
        b6Var7 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        d dVar = new d(context, b6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new b9(this, 0));
        dVar.e();
        l9Var.addView(dVar, g7.e6.q(-1, 48, 87));
        b6Var8 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        d dVar2 = new d(context, b6Var8, false);
        this.f15775w = dVar2;
        dVar2.setOnClickListener(new b9(this, 1));
        dVar2.e();
        l9Var.addView(dVar2, g7.e6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f15774s = view;
        b6Var9 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var9));
        addView(view, g7.e6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(l9Var, g7.e6.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i9;
        if (this.f15767a == 6) {
            ArrayList arrayList = this.f15769c;
            arrayList.clear();
            i9 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
            arrayList.addAll(MessagesController.getInstance(i9).getStoriesController().L);
            int i10 = 0;
            while (true) {
                a0.h hVar = this.f15768b;
                if (i10 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i10);
                if (((Boolean) hVar.n(i10)).booleanValue()) {
                    if (!arrayList.contains(Long.valueOf(j10))) {
                        arrayList.add(Long.valueOf(j10));
                    }
                } else {
                    arrayList.remove(Long.valueOf(j10));
                }
                i10++;
            }
            if (z10) {
                g(true);
                e(true);
                f(true);
            }
        }
    }

    public final void b(int i9) {
        int i10;
        this.f15767a = i9;
        this.f15768b.b();
        ArrayList arrayList = this.f15769c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        t9 t9Var = this.S;
        if (i9 == 4) {
            arrayList.addAll(t9Var.d);
            hashMap.putAll(t9Var.f16099e);
        } else if (i9 == 5) {
            arrayList.addAll(t9Var.F);
        } else if (i9 == 1) {
            ArrayList I0 = t9.I0(t9Var);
            for (int i11 = 0; i11 < I0.size(); i11 = aa.d.g(((TLRPC.User) I0.get(i11)).f22527id, arrayList, i11, 1)) {
            }
        } else if (i9 == 2) {
            arrayList.addAll(t9Var.h);
        } else if (i9 == 3) {
            arrayList.addAll(t9Var.f16101n);
            hashMap.putAll(t9Var.f16102r);
        } else if (i9 == 6) {
            a(false);
        }
        this.f15772n.getClass();
        this.h.k1(false);
        i(false);
        f9 f9Var = this.f15776x;
        f9Var.setText("");
        if (i9 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f9Var.setVisibility(i10);
        f9Var.G = true;
        this.E = null;
        g(false);
        e(false);
        f(false);
        int i12 = this.f15767a;
        wk0 wk0Var = this.f15771f;
        if (i12 != 0) {
            wk0Var.u0(0);
        }
        wk0Var.requestLayout();
        this.N = -1;
    }

    public final float c() {
        int i9 = 0;
        float f10 = -org.telegram.messenger.l0.b(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f15776x.F), 0);
        while (true) {
            wk0 wk0Var = this.f15771f;
            if (i9 < wk0Var.getChildCount()) {
                View childAt = wk0Var.getChildAt(i9);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f10, childAt.getY());
                }
                i9++;
            } else {
                return f10;
            }
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        boolean z10;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        int i9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.f15767a;
        int i11 = 0;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        t9 t9Var = this.S;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i12 = 0; i12 < chatParticipants.participants.size(); i12++) {
                long j11 = chatParticipants.participants.get(i12).user_id;
                i9 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j11));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f22527id != 777000 && j11 != 0) {
                    if (z10 && !user.contact) {
                        arrayList2.add(Long.valueOf(j11));
                    } else {
                        arrayList.add(Long.valueOf(j11));
                    }
                    this.f15769c.remove(Long.valueOf(j11));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                b6Var2 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var2);
                alertDialog$Builder.f22702a.P = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.o();
                return;
            }
            Context context2 = getContext();
            b6Var = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, b6Var);
            alertDialog$Builder2.f22702a.P = arrayList2.size() + " members are not in your contact list";
            alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new b9.a(this, j10, arrayList, 4));
            alertDialog$Builder2.h("Cancel", null);
            alertDialog$Builder2.o();
            return;
        }
        this.d.put(Long.valueOf(j10), arrayList);
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            this.f15768b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        i(true);
        e(true);
        f(true);
        this.f15776x.G = true;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.c2 c2Var;
        if (i9 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (c2Var = this.C) != null && this.D == chatFull.f22381id) {
            c2Var.c(350L);
            this.C = null;
            this.D = -1L;
            d(chatFull.f22381id, chatFull.participants);
        }
    }

    public final void e(boolean z10) {
        int i9;
        boolean z11;
        int i10;
        int i11 = this.f15767a;
        t9 t9Var = this.S;
        d dVar = this.f15775w;
        int i12 = 0;
        boolean z12 = false;
        d dVar2 = this.v;
        if (i11 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (t9Var.H) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (t9Var.V) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i13 = t9Var.E;
                if (i13 == 1) {
                    if (t9Var.G) {
                        i10 = R.string.StoryLivePrivacyButtonPost;
                    } else {
                        i10 = R.string.StoryPrivacyButtonPost;
                    }
                    dVar2.g(LocaleController.getString(i10), z10, true);
                } else {
                    dVar2.g(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i13), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f15769c;
        if (i11 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        l9 l9Var = this.f15773r;
        if (i11 == 3) {
            int size = t9.l1(arrayList, this.d).size();
            t9Var.f16103s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            l9Var.b(z11, z10);
            dVar2.c(size, z10);
            if (size > 0) {
                z12 = true;
            }
            dVar2.setEnabled(z12);
            dVar.setVisibility(8);
        } else if (i11 == 2) {
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
        } else if (i11 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
        } else if (i11 == 6) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            i9 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
            ih.v6 storiesController = MessagesController.getInstance(i9).getStoriesController();
            if (!storiesController.O) {
                while (true) {
                    a0.h hVar = this.f15768b;
                    if (i12 >= hVar.m()) {
                        break;
                    }
                    long j10 = hVar.j(i12);
                    ((Boolean) hVar.n(i12)).getClass();
                    storiesController.L.contains(Long.valueOf(j10));
                    i12++;
                }
            } else {
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i11 == 4) {
            int size2 = t9.l1(t9Var.d, t9Var.f16099e).size();
            t9Var.f16100f = size2;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            l9Var.b(false, z10);
            dVar2.c(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        t9 t9Var = this.S;
        ArrayList arrayList2 = t9Var.F;
        HashMap hashMap = t9Var.f16102r;
        ArrayList arrayList3 = t9Var.f16101n;
        ArrayList arrayList4 = t9Var.h;
        HashMap hashMap2 = t9Var.f16099e;
        ArrayList arrayList5 = t9Var.d;
        int i9 = this.f15767a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f15769c;
        if (i9 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i9 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i9 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i9 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.f15767a == 3 && (t9Var.J != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i10 = this.N;
                if (i10 != -1) {
                    t9Var.J = i10;
                }
            } else {
                this.N = t9Var.J;
                t9Var.J = 3;
            }
        }
        HashSet l1 = t9.l1(arrayList6, hashMap3);
        int i11 = 0;
        while (true) {
            arrayList = this.H;
            boolean z12 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            a9 a9Var = (a9) arrayList.get(i11);
            if (a9Var != null) {
                int i12 = a9Var.f14958i;
                if (i12 > 0) {
                    if (t9Var.J != i12) {
                        z12 = false;
                    }
                    a9Var.f14960k = z12;
                    a9Var.f14961l = false;
                } else {
                    TLRPC.User user = a9Var.f14957g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f22527id));
                        a9Var.f14960k = contains;
                        a9Var.f14961l = (contains || !l1.contains(Long.valueOf(a9Var.f14957g.f22527id))) ? false : false;
                    } else {
                        TLRPC.Chat chat = a9Var.h;
                        if (chat != null) {
                            a9Var.f14960k = hashMap3.containsKey(Long.valueOf(chat.f22380id));
                            a9Var.f14961l = false;
                        }
                    }
                }
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            wk0 wk0Var = this.f15771f;
            if (i13 < wk0Var.getChildCount()) {
                View childAt = wk0Var.getChildAt(i13);
                if ((childAt instanceof s9) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    a9 a9Var2 = (a9) arrayList.get(R);
                    s9 s9Var = (s9) childAt;
                    if (!a9Var2.f14960k && !a9Var2.f14961l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    s9Var.c(z11, z10);
                    TLRPC.Chat chat2 = a9Var2.h;
                    float f10 = 1.0f;
                    if (chat2 != null) {
                        if (t9.d1(t9Var, chat2) > 200) {
                            f10 = 0.3f;
                        }
                        s9Var.b(f10, z10);
                    } else {
                        if (a9Var2.f14961l && !a9Var2.f14960k) {
                            f10 = 0.5f;
                        }
                        s9Var.b(f10, z10);
                    }
                }
                i13++;
            } else {
                h(z10);
                return;
            }
        }
    }

    public final void g(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: kh.n9.g(boolean):void");
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.v3 v3Var = this.f15777y;
        if (v3Var == null) {
            return;
        }
        if (t9.l1(this.f15769c, this.d).size() > 0) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new b9(this, 2));
        } else if (z10) {
            v3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.u3 u3Var = v3Var.f25787b;
            u3Var.c(null, false, true);
            u3Var.setOnClickListener(null);
            u3Var.setVisibility(0);
        }
    }

    public final void i(boolean z10) {
        int i9;
        f9 f9Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        org.telegram.ui.ActionBar.b6 b6Var;
        HashSet l1 = t9.l1(this.f15769c, this.d);
        int i10 = this.f15767a;
        t9 t9Var = this.S;
        if (i10 == 3) {
            t9Var.f16103s = l1.size();
        } else if (i10 == 4) {
            t9Var.f16100f = l1.size();
        }
        i9 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i9);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        while (true) {
            f9Var = this.f15776x;
            ArrayList arrayList4 = f9Var.d;
            arrayList = f9Var.d;
            if (i11 >= arrayList4.size()) {
                break;
            }
            w20 w20Var = (w20) arrayList.get(i11);
            if (!l1.contains(Long.valueOf(w20Var.getUid()))) {
                arrayList2.add(w20Var);
            }
            i11++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i12 = 0;
            while (true) {
                if (i12 < arrayList.size()) {
                    if (((w20) arrayList.get(i12)).getUid() == longValue) {
                        break;
                    }
                    i12++;
                } else {
                    if (longValue >= 0) {
                        chat = messagesController.getUser(l10);
                    } else {
                        chat = messagesController.getChat(l10);
                    }
                    Object obj = chat;
                    if (obj != null) {
                        Context context = getContext();
                        b6Var = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                        w20 w20Var2 = new w20(context, obj, null, true, b6Var);
                        w20Var2.setOnClickListener(this);
                        arrayList3.add(w20Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        fg.l lVar = f9Var.f15891c;
        ArrayList arrayList5 = lVar.f6306e;
        ArrayList arrayList6 = lVar.d;
        ArrayList arrayList7 = lVar.f6307f;
        q9 q9Var = (q9) lVar.f6308n;
        q9Var.C = true;
        ArrayList arrayList8 = q9Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = lVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((w20) arrayList2.get(i13)).setOnClickListener(null);
        }
        lVar.c();
        if (z10) {
            lVar.f6305c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            lVar.f6304b = animatorSet;
            animatorSet.addListener(new p9(lVar, arrayList2, 0));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i14 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i14 >= size) {
                    break;
                }
                w20 w20Var3 = (w20) arrayList2.get(i14);
                arrayList5.add(w20Var3);
                arrayList7.add(ObjectAnimator.ofFloat(w20Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(w20Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(w20Var3, property, 1.0f, 0.0f));
                i14++;
            }
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                w20 w20Var4 = (w20) arrayList3.get(i15);
                arrayList6.add(w20Var4);
                arrayList7.add(ObjectAnimator.ofFloat(w20Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(w20Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(w20Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                lVar.removeView((View) arrayList2.get(i16));
            }
            arrayList9.clear();
            lVar.f6304b = null;
            lVar.f6305c = false;
            q9Var.f15889a.setAllowDrawCursor(true);
        }
        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
            lVar.addView((View) arrayList3.get(i17));
        }
        lVar.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.I;
        boolean z11 = false;
        float f10 = 1.0f;
        f9 f9Var = this.f15776x;
        if (!z10 && !this.Q && getTranslationX() == 0.0f) {
            if (!this.J || Math.abs(this.K - c10) > 1.0f) {
                this.J = true;
                ValueAnimator valueAnimator = this.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.L = null;
                }
                float translationY = f9Var.getTranslationY();
                this.K = c10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new g4(this, 5));
                this.L.addListener(new ag.e(this, 27));
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
            f9Var.setTranslationY(c10);
        }
        boolean z12 = this.B;
        z8 z8Var = this.A;
        if (!z12) {
            z8Var.setVisibility(8);
            return;
        }
        z8Var.setVisibility(0);
        float f11 = -z8Var.getHeight();
        int i9 = 0;
        while (true) {
            wk0 wk0Var = this.f15771f;
            if (i9 < wk0Var.getChildCount()) {
                View childAt = wk0Var.getChildAt(i9);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f11 = this.f15770e.getPaddingTop() + childAt.getY();
                    break;
                }
                i9++;
            } else {
                z11 = true;
                break;
            }
        }
        if (this.M != z11) {
            this.M = z11;
            ((org.telegram.ui.ActionBar.h2) z8Var.f16469e).c((z11 || this.f15767a != 0) ? 0.0f : 0.0f, true);
        }
        z8Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f11));
    }

    @Override
    public final void onAttachedToWindow() {
        int i9;
        super.onAttachedToWindow();
        i9 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onClick(View view) {
        f9 f9Var = this.f15776x;
        if (!f9Var.d.contains(view)) {
            return;
        }
        w20 w20Var = (w20) view;
        if (w20Var.f34088y) {
            f9Var.f15892e = null;
            fg.l lVar = f9Var.f15891c;
            q9 q9Var = (q9) lVar.f6308n;
            q9Var.C = true;
            q9Var.d.remove(w20Var);
            w20Var.setOnClickListener(null);
            lVar.c();
            lVar.f6305c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            lVar.f6304b = animatorSet;
            animatorSet.addListener(new fg.j(7, lVar, w20Var));
            ArrayList arrayList = lVar.h;
            arrayList.clear();
            arrayList.add(w20Var);
            ArrayList arrayList2 = lVar.d;
            arrayList2.clear();
            lVar.f6306e.clear();
            arrayList2.add(w20Var);
            ArrayList arrayList3 = lVar.f6307f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(w20Var, View.ALPHA, 1.0f, 0.0f));
            lVar.requestLayout();
            long uid = w20Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f15769c;
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
            w20 w20Var2 = f9Var.f15892e;
            if (w20Var2 != null) {
                w20Var2.a();
                f9Var.f15892e = null;
            }
            f9Var.f15892e = w20Var;
            w20Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        int i9;
        super.onDetachedFromWindow();
        i9 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        boolean z15;
        float f10;
        boolean z16;
        int i14;
        t9 t9Var = this.S;
        i11 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardHeight;
        if (i11 > 0) {
            i14 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardHeight;
            this.P = i14;
        }
        super.onMeasure(i9, i10);
        int i15 = AndroidUtilities.statusBarHeight;
        if (this.f15767a == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(56.0f);
        }
        this.f15770e.setPadding(0, i15 + dp, 0, 0);
        boolean z17 = this.R;
        z10 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
        wk0 wk0Var = this.f15771f;
        l9 l9Var = this.f15773r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.f15776x.F) > wk0Var.getPaddingTop()) {
                rh.n nVar = new rh.n(getContext(), 2, 0.7f);
                nVar.f5443a = 1;
                nVar.f47269p = -AndroidUtilities.dp(56.0f);
                this.h.w0(nVar);
            }
            int i16 = this.f15767a;
            View view = this.f15774s;
            float f11 = 0.0f;
            if (i16 == 0) {
                z15 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                if (z15) {
                    f10 = this.P;
                } else {
                    f10 = 0.0f;
                }
                l9Var.setTranslationY(f10);
                z16 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                if (z16) {
                    f11 = this.P;
                }
                view.setTranslationY(f11);
            } else {
                z12 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                if (z12) {
                    i12 = this.P;
                } else {
                    i12 = -this.P;
                }
                float f12 = i12;
                ValueAnimator valueAnimator = l9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    l9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                l9Var.d = ofFloat;
                ofFloat.addUpdateListener(new k9(l9Var, 1));
                l9Var.d.addListener(new ag.e(l9Var, 28));
                l9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = l9Var.d;
                gr grVar = org.telegram.ui.ActionBar.q1.f23713w;
                valueAnimator2.setInterpolator(grVar);
                l9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                if (z13) {
                    i13 = this.P;
                } else {
                    i13 = -this.P;
                }
                view.setTranslationY(i13);
                this.Q = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(grVar).withEndAction(new c9(this, 2)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
            this.R = z14;
        }
        wk0Var.setPadding(0, 0, 0, l9Var.getMeasuredHeight());
    }
}
