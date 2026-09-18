package ci;

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
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wl0;
public final class ba extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final m9 E;
    public boolean F;
    public org.telegram.ui.ActionBar.b2 G;
    public long H;
    public String I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public float O;
    public ValueAnimator P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public final ia W;
    public int f4401a;
    public final a0.i f4402b;
    public final ArrayList f4403c;
    public final HashMap d;
    public final FrameLayout e;
    public final wl0 f4404f;
    public final s4.c0 h;
    public final x9 f4405n;
    public final z9 f4406r;
    public final View f4407s;
    public final d v;
    public final d f4408w;
    public final u9 f4409x;
    public final org.telegram.ui.Cells.v3 f4410y;

    public ba(ia iaVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        org.telegram.ui.ActionBar.e6 e6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var6;
        org.telegram.ui.ActionBar.e6 e6Var7;
        org.telegram.ui.ActionBar.e6 e6Var8;
        org.telegram.ui.ActionBar.e6 e6Var9;
        this.W = iaVar;
        this.f4402b = new a0.i();
        this.f4403c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        e6Var = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, e6Var);
        this.f4410y = v3Var;
        e6Var2 = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
        u9 u9Var = new u9(this, context, e6Var2, new p9(this, 4));
        this.f4409x = u9Var;
        int i12 = org.telegram.ui.ActionBar.j6.f19133h5;
        u9Var.setBackgroundColor(iaVar.getThemedColor(i12));
        u9Var.setOnSearchTextChange(new q9(this, 3));
        e6Var3 = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
        m9 m9Var = new m9(context, e6Var3);
        this.E = m9Var;
        m9Var.h = new p9(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        e6Var4 = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
        wl0 wl0Var = new wl0(context, e6Var4);
        this.f4404f = wl0Var;
        wl0Var.setClipToPadding(false);
        wl0Var.setTranslateSelector(true);
        e6Var5 = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
        x9 x9Var = new x9(this, context, e6Var5, u9Var, new ai.s5(iaVar, 2));
        this.f4405n = x9Var;
        wl0Var.setAdapter(x9Var);
        x9Var.h = wl0Var;
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        wl0Var.setLayoutManager(c0Var);
        wl0Var.setOnScrollListener(new v9(this, 0));
        wl0Var.setOnItemClickListener(new ah.b(6, this, context));
        frameLayout.addView(wl0Var, w7.y5.c(-1.0f, -1));
        w9 w9Var = new w9(this);
        w9Var.n(350L);
        w9Var.o(qr.h);
        w9Var.C = false;
        w9Var.f42964m = false;
        wl0Var.setItemAnimator(w9Var);
        frameLayout.addView(u9Var, w7.y5.e(-1, -2, 55));
        frameLayout.addView(v3Var, w7.y5.e(-1, 32, 55));
        addView(m9Var, w7.y5.e(-1, -2, 55));
        z9 z9Var = new z9(this, context);
        this.f4406r = z9Var;
        z9Var.setClickable(true);
        z9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) iaVar).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) iaVar).backgroundPaddingLeft;
        z9Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        e6Var6 = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
        z9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var6));
        e6Var7 = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
        d dVar = new d(context, e6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new o9(this, 0));
        dVar.e();
        z9Var.addView(dVar, w7.y5.q(-1, 48, 87));
        e6Var8 = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
        d dVar2 = new d(context, e6Var8, false);
        this.f4408w = dVar2;
        dVar2.setOnClickListener(new o9(this, 1));
        dVar2.e();
        z9Var.addView(dVar2, w7.y5.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f4407s = view;
        e6Var9 = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var9));
        addView(view, w7.y5.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(z9Var, w7.y5.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f4401a == 6) {
            ArrayList arrayList = this.f4403c;
            arrayList.clear();
            i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
            arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
            int i11 = 0;
            while (true) {
                a0.i iVar = this.f4402b;
                if (i11 >= iVar.m()) {
                    break;
                }
                long j3 = iVar.j(i11);
                if (((Boolean) iVar.n(i11)).booleanValue()) {
                    if (!arrayList.contains(Long.valueOf(j3))) {
                        arrayList.add(Long.valueOf(j3));
                    }
                } else {
                    arrayList.remove(Long.valueOf(j3));
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
        this.f4401a = i10;
        this.f4402b.b();
        ArrayList arrayList = this.f4403c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        ia iaVar = this.W;
        if (i10 == 4) {
            arrayList.addAll(iaVar.d);
            hashMap.putAll(iaVar.e);
        } else if (i10 == 5) {
            arrayList.addAll(iaVar.J);
        } else if (i10 == 1) {
            ArrayList J0 = ia.J0(iaVar);
            for (int i12 = 0; i12 < J0.size(); i12 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) J0.get(i12)).f18443id, arrayList, i12, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(iaVar.h);
        } else if (i10 == 3) {
            arrayList.addAll(iaVar.f4811n);
            hashMap.putAll(iaVar.f4812r);
        } else if (i10 == 6) {
            a(false);
        }
        this.f4405n.getClass();
        this.h.k1(false);
        i(false);
        u9 u9Var = this.f4409x;
        u9Var.setText("");
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        u9Var.setVisibility(i11);
        u9Var.K = true;
        this.I = null;
        g(false);
        e(false);
        f(false);
        int i13 = this.f4401a;
        wl0 wl0Var = this.f4404f;
        if (i13 != 0) {
            wl0Var.v0(0);
        }
        wl0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -org.telegram.messenger.q.c(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f4409x.J), 0);
        while (true) {
            wl0 wl0Var = this.f4404f;
            if (i10 < wl0Var.getChildCount()) {
                View childAt = wl0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f7, childAt.getY());
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public final void d(long j3, TLRPC.ChatParticipants chatParticipants) {
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f4401a;
        int i12 = 0;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        ia iaVar = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j10 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f18443id != 777000 && j10 != 0) {
                    if (z10 && !user.contact) {
                        arrayList2.add(Long.valueOf(j10));
                    } else {
                        arrayList.add(Long.valueOf(j10));
                    }
                    this.f4403c.remove(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                e6Var2 = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var2);
                alertDialog$Builder.f18622a.T = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.o();
                return;
            }
            Context context2 = getContext();
            e6Var = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, e6Var);
            alertDialog$Builder2.f18622a.T = arrayList2.size() + " members are not in your contact list";
            alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new t9(this, j3, arrayList, 0));
            alertDialog$Builder2.h("Cancel", null);
            alertDialog$Builder2.o();
            return;
        }
        this.d.put(Long.valueOf(j3), arrayList);
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            this.f4402b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        i(true);
        e(true);
        f(true);
        this.f4409x.K = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.b2 b2Var;
        if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (b2Var = this.G) != null && this.H == chatFull.f18297id) {
            b2Var.c(350L);
            this.G = null;
            this.H = -1L;
            d(chatFull.f18297id, chatFull.participants);
        }
    }

    public final void e(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12 = this.f4401a;
        ia iaVar = this.W;
        d dVar = this.f4408w;
        int i13 = 0;
        boolean z12 = false;
        d dVar2 = this.v;
        if (i12 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.b(0, z10);
            if (iaVar.L) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (iaVar.Z) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i14 = iaVar.I;
                if (i14 == 1) {
                    if (iaVar.K) {
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
        ArrayList arrayList = this.f4403c;
        if (i12 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        z9 z9Var = this.f4406r;
        if (i12 == 3) {
            int size = ia.l1(arrayList, this.d).size();
            iaVar.f4813s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            z9Var.b(z11, z10);
            dVar2.b(size, z10);
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
                dVar2.b(0, z10);
            } else {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z10, true);
                dVar2.b(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i12 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
        } else if (i12 == 6) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            i10 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
            ai.l9 storiesController = MessagesController.getInstance(i10).getStoriesController();
            if (!storiesController.O) {
                while (true) {
                    a0.i iVar = this.f4402b;
                    if (i13 >= iVar.m()) {
                        break;
                    }
                    long j3 = iVar.j(i13);
                    ((Boolean) iVar.n(i13)).getClass();
                    storiesController.L.contains(Long.valueOf(j3));
                    i13++;
                }
            } else {
                dVar2.b(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i12 == 4) {
            int size2 = ia.l1(iaVar.d, iaVar.e).size();
            iaVar.f4810f = size2;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            z9Var.b(false, z10);
            dVar2.b(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int S;
        boolean z11;
        ia iaVar = this.W;
        ArrayList arrayList2 = iaVar.J;
        HashMap hashMap = iaVar.f4812r;
        ArrayList arrayList3 = iaVar.f4811n;
        ArrayList arrayList4 = iaVar.h;
        HashMap hashMap2 = iaVar.e;
        ArrayList arrayList5 = iaVar.d;
        int i10 = this.f4401a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f4403c;
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
        if (this.f4401a == 3 && (iaVar.N != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    iaVar.N = i11;
                }
            } else {
                this.R = iaVar.N;
                iaVar.N = 3;
            }
        }
        HashSet l1 = ia.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            n9 n9Var = (n9) arrayList.get(i12);
            if (n9Var != null) {
                int i13 = n9Var.f5082i;
                if (i13 > 0) {
                    if (iaVar.N != i13) {
                        z12 = false;
                    }
                    n9Var.f5084k = z12;
                    n9Var.f5085l = false;
                } else {
                    TLRPC.User user = n9Var.f5081g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f18443id));
                        n9Var.f5084k = contains;
                        n9Var.f5085l = (contains || !l1.contains(Long.valueOf(n9Var.f5081g.f18443id))) ? false : false;
                    } else {
                        TLRPC.Chat chat = n9Var.h;
                        if (chat != null) {
                            n9Var.f5084k = hashMap3.containsKey(Long.valueOf(chat.f18296id));
                            n9Var.f5085l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            wl0 wl0Var = this.f4404f;
            if (i14 < wl0Var.getChildCount()) {
                View childAt = wl0Var.getChildAt(i14);
                if ((childAt instanceof ha) && (S = RecyclerView.S(childAt)) >= 0 && S < arrayList.size()) {
                    n9 n9Var2 = (n9) arrayList.get(S);
                    ha haVar = (ha) childAt;
                    if (!n9Var2.f5084k && !n9Var2.f5085l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    haVar.c(z11, z10);
                    TLRPC.Chat chat2 = n9Var2.h;
                    float f7 = 1.0f;
                    if (chat2 != null) {
                        if (ia.d1(iaVar, chat2) > 200) {
                            f7 = 0.3f;
                        }
                        haVar.b(f7, z10);
                    } else {
                        if (n9Var2.f5085l && !n9Var2.f5084k) {
                            f7 = 0.5f;
                        }
                        haVar.b(f7, z10);
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
        throw new UnsupportedOperationException("Method not decompiled: ci.ba.g(boolean):void");
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.v3 v3Var = this.f4410y;
        if (v3Var == null) {
            return;
        }
        if (ia.l1(this.f4403c, this.d).size() > 0) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new o9(this, 2));
        } else if (z10) {
            v3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.u3 u3Var = v3Var.f21644b;
            u3Var.c(null, false, true);
            u3Var.setOnClickListener(null);
            u3Var.setVisibility(0);
        }
    }

    public final void i(boolean z10) {
        int i10;
        u9 u9Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        org.telegram.ui.ActionBar.e6 e6Var;
        HashSet l1 = ia.l1(this.f4403c, this.d);
        int i11 = this.f4401a;
        ia iaVar = this.W;
        if (i11 == 3) {
            iaVar.f4813s = l1.size();
        } else if (i11 == 4) {
            iaVar.f4810f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        while (true) {
            u9Var = this.f4409x;
            ArrayList arrayList4 = u9Var.d;
            arrayList = u9Var.d;
            if (i12 >= arrayList4.size()) {
                break;
            }
            m30 m30Var = (m30) arrayList.get(i12);
            if (!l1.contains(Long.valueOf(m30Var.getUid()))) {
                arrayList2.add(m30Var);
            }
            i12++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    if (((m30) arrayList.get(i13)).getUid() == longValue) {
                        break;
                    }
                    i13++;
                } else {
                    if (longValue >= 0) {
                        chat = messagesController.getUser(l4);
                    } else {
                        chat = messagesController.getChat(l4);
                    }
                    Object obj = chat;
                    if (obj != null) {
                        Context context = getContext();
                        e6Var = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
                        m30 m30Var2 = new m30(context, obj, null, true, e6Var);
                        m30Var2.setOnClickListener(this);
                        arrayList3.add(m30Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ea eaVar = u9Var.f4671c;
        ArrayList arrayList5 = eaVar.e;
        ArrayList arrayList6 = eaVar.d;
        ArrayList arrayList7 = eaVar.f4610f;
        fa faVar = (fa) eaVar.f4611n;
        faVar.G = true;
        ArrayList arrayList8 = faVar.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = eaVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((m30) arrayList2.get(i14)).setOnClickListener(null);
        }
        eaVar.c();
        if (z10) {
            eaVar.f4609c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            eaVar.f4608b = animatorSet;
            animatorSet.addListener(new da(eaVar, arrayList2, 0));
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
                m30 m30Var3 = (m30) arrayList2.get(i15);
                arrayList5.add(m30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(m30Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(m30Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(m30Var3, property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                m30 m30Var4 = (m30) arrayList3.get(i16);
                arrayList6.add(m30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(m30Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(m30Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(m30Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                eaVar.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            eaVar.f4608b = null;
            eaVar.f4609c = false;
            faVar.f4669a.setAllowDrawCursor(true);
        }
        for (int i18 = 0; i18 < arrayList3.size(); i18++) {
            eaVar.addView((View) arrayList3.get(i18));
        }
        eaVar.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        float f7 = 1.0f;
        u9 u9Var = this.f4409x;
        if (!z10 && !this.U && getTranslationX() == 0.0f) {
            if (!this.N || Math.abs(this.O - c10) > 1.0f) {
                this.N = true;
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.P = null;
                }
                float translationY = u9Var.getTranslationY();
                this.O = c10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
                this.P = ofFloat;
                ofFloat.addUpdateListener(new ai.a(this, 25));
                this.P.addListener(new ai.b(this, 18));
                this.P.setInterpolator(new LinearInterpolator());
                this.P.setDuration(180L);
                this.P.start();
            }
        } else {
            this.N = false;
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.P = null;
            }
            u9Var.setTranslationY(c10);
        }
        boolean z12 = this.F;
        m9 m9Var = this.E;
        if (!z12) {
            m9Var.setVisibility(8);
            return;
        }
        m9Var.setVisibility(0);
        float f10 = -m9Var.getHeight();
        int i10 = 0;
        while (true) {
            wl0 wl0Var = this.f4404f;
            if (i10 < wl0Var.getChildCount()) {
                View childAt = wl0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f10 = this.e.getPaddingTop() + childAt.getY();
                    break;
                }
                i10++;
            } else {
                z11 = true;
                break;
            }
        }
        if (this.Q != z11) {
            this.Q = z11;
            ((org.telegram.ui.ActionBar.g2) m9Var.e).c((z11 || this.f4401a != 0) ? 0.0f : 0.0f, true);
        }
        m9Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onClick(View view) {
        u9 u9Var = this.f4409x;
        if (!u9Var.d.contains(view)) {
            return;
        }
        m30 m30Var = (m30) view;
        if (m30Var.f26305y) {
            u9Var.e = null;
            ea eaVar = u9Var.f4671c;
            fa faVar = (fa) eaVar.f4611n;
            faVar.G = true;
            faVar.d.remove(m30Var);
            m30Var.setOnClickListener(null);
            eaVar.c();
            eaVar.f4609c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            eaVar.f4608b = animatorSet;
            animatorSet.addListener(new ai.z(5, eaVar, m30Var));
            ArrayList arrayList = eaVar.h;
            arrayList.clear();
            arrayList.add(m30Var);
            ArrayList arrayList2 = eaVar.d;
            arrayList2.clear();
            eaVar.e.clear();
            arrayList2.add(m30Var);
            ArrayList arrayList3 = eaVar.f4610f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(m30Var, View.ALPHA, 1.0f, 0.0f));
            eaVar.requestLayout();
            long uid = m30Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f4403c;
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
            m30 m30Var2 = u9Var.e;
            if (m30Var2 != null) {
                m30Var2.a();
                u9Var.e = null;
            }
            u9Var.e = m30Var;
            m30Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
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
        float f7;
        boolean z16;
        int i15;
        ia iaVar = this.W;
        i12 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardHeight;
        if (i12 > 0) {
            i15 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardHeight;
            this.T = i15;
        }
        super.onMeasure(i10, i11);
        int i16 = AndroidUtilities.statusBarHeight;
        if (this.f4401a == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(56.0f);
        }
        this.e.setPadding(0, i16 + dp, 0, 0);
        boolean z17 = this.V;
        z10 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
        wl0 wl0Var = this.f4404f;
        z9 z9Var = this.f4406r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.f4409x.J) > wl0Var.getPaddingTop()) {
                ji.o oVar = new ji.o(getContext(), 2, 0.7f);
                oVar.f43079a = 1;
                oVar.f13105p = -AndroidUtilities.dp(56.0f);
                this.h.w0(oVar);
            }
            int i17 = this.f4401a;
            View view = this.f4407s;
            float f10 = 0.0f;
            if (i17 == 0) {
                z15 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                if (z15) {
                    f7 = this.T;
                } else {
                    f7 = 0.0f;
                }
                z9Var.setTranslationY(f7);
                z16 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                if (z16) {
                    f10 = this.T;
                }
                view.setTranslationY(f10);
            } else {
                z12 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                if (z12) {
                    i13 = this.T;
                } else {
                    i13 = -this.T;
                }
                float f11 = i13;
                ValueAnimator valueAnimator = z9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    z9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                z9Var.d = ofFloat;
                ofFloat.addUpdateListener(new y9(z9Var, 1));
                z9Var.d.addListener(new ai.b(z9Var, 19));
                z9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = z9Var.d;
                qr qrVar = org.telegram.ui.ActionBar.p1.f19667w;
                valueAnimator2.setInterpolator(qrVar);
                z9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                if (z13) {
                    i14 = this.T;
                } else {
                    i14 = -this.T;
                }
                view.setTranslationY(i14);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(qrVar).withEndAction(new p9(this, 2)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
            this.V = z14;
        }
        wl0Var.setPadding(0, 0, 0, z9Var.getMeasuredHeight());
    }
}
