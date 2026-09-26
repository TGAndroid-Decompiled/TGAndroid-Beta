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
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.xl0;
public final class y9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final j9 E;
    public boolean F;
    public org.telegram.ui.ActionBar.a2 G;
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
    public final fa W;
    public int f5880a;
    public final a0.i f5881b;
    public final ArrayList f5882c;
    public final HashMap d;
    public final FrameLayout e;
    public final xl0 f5883f;
    public final s4.c0 h;
    public final u9 f5884n;
    public final w9 f5885r;
    public final View f5886s;
    public final d v;
    public final d f5887w;
    public final r9 f5888x;
    public final org.telegram.ui.Cells.v3 f5889y;

    public y9(fa faVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.ActionBar.d6 d6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var6;
        org.telegram.ui.ActionBar.d6 d6Var7;
        org.telegram.ui.ActionBar.d6 d6Var8;
        org.telegram.ui.ActionBar.d6 d6Var9;
        this.W = faVar;
        this.f5881b = new a0.i();
        this.f5882c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        d6Var = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, d6Var);
        this.f5889y = v3Var;
        d6Var2 = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
        r9 r9Var = new r9(this, context, d6Var2, new m9(this, 4));
        this.f5888x = r9Var;
        int i12 = org.telegram.ui.ActionBar.h6.f19129h5;
        r9Var.setBackgroundColor(faVar.getThemedColor(i12));
        r9Var.setOnSearchTextChange(new n9(this, 3));
        d6Var3 = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
        j9 j9Var = new j9(context, d6Var3);
        this.E = j9Var;
        j9Var.h = new m9(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        d6Var4 = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
        xl0 xl0Var = new xl0(context, d6Var4);
        this.f5883f = xl0Var;
        xl0Var.setClipToPadding(false);
        xl0Var.setTranslateSelector(true);
        d6Var5 = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
        u9 u9Var = new u9(this, context, d6Var5, r9Var, new ai.r5(faVar, 2));
        this.f5884n = u9Var;
        xl0Var.setAdapter(u9Var);
        u9Var.h = xl0Var;
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        xl0Var.setLayoutManager(c0Var);
        xl0Var.setOnScrollListener(new s9(this, 0));
        xl0Var.setOnItemClickListener(new ah.b(6, this, context));
        frameLayout.addView(xl0Var, w7.y5.c(-1.0f, -1));
        t9 t9Var = new t9(this);
        t9Var.n(350L);
        t9Var.o(sr.h);
        t9Var.C = false;
        t9Var.f42994m = false;
        xl0Var.setItemAnimator(t9Var);
        frameLayout.addView(r9Var, w7.y5.e(-1, -2, 55));
        frameLayout.addView(v3Var, w7.y5.e(-1, 32, 55));
        addView(j9Var, w7.y5.e(-1, -2, 55));
        w9 w9Var = new w9(this, context);
        this.f5885r = w9Var;
        w9Var.setClickable(true);
        w9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.e3) faVar).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.e3) faVar).backgroundPaddingLeft;
        w9Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        d6Var6 = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
        w9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var6));
        d6Var7 = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
        d dVar = new d(context, d6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new l9(this, 0));
        dVar.e();
        w9Var.addView(dVar, w7.y5.q(-1, 48, 87));
        d6Var8 = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
        d dVar2 = new d(context, d6Var8, false);
        this.f5887w = dVar2;
        dVar2.setOnClickListener(new l9(this, 1));
        dVar2.e();
        w9Var.addView(dVar2, w7.y5.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f5886s = view;
        d6Var9 = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var9));
        addView(view, w7.y5.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(w9Var, w7.y5.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f5880a == 6) {
            ArrayList arrayList = this.f5882c;
            arrayList.clear();
            i10 = ((org.telegram.ui.ActionBar.e3) this.W).currentAccount;
            arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
            int i11 = 0;
            while (true) {
                a0.i iVar = this.f5881b;
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
        this.f5880a = i10;
        this.f5881b.b();
        ArrayList arrayList = this.f5882c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        fa faVar = this.W;
        if (i10 == 4) {
            arrayList.addAll(faVar.d);
            hashMap.putAll(faVar.e);
        } else if (i10 == 5) {
            arrayList.addAll(faVar.J);
        } else if (i10 == 1) {
            ArrayList J0 = fa.J0(faVar);
            for (int i12 = 0; i12 < J0.size(); i12 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) J0.get(i12)).f18482id, arrayList, i12, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(faVar.h);
        } else if (i10 == 3) {
            arrayList.addAll(faVar.f4702n);
            hashMap.putAll(faVar.f4703r);
        } else if (i10 == 6) {
            a(false);
        }
        this.f5884n.getClass();
        this.h.k1(false);
        i(false);
        r9 r9Var = this.f5888x;
        r9Var.setText("");
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        r9Var.setVisibility(i11);
        r9Var.K = true;
        this.I = null;
        g(false);
        e(false);
        f(false);
        int i13 = this.f5880a;
        xl0 xl0Var = this.f5883f;
        if (i13 != 0) {
            xl0Var.u0(0);
        }
        xl0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -org.telegram.messenger.f0.b(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f5888x.J), 0);
        while (true) {
            xl0 xl0Var = this.f5883f;
            if (i10 < xl0Var.getChildCount()) {
                View childAt = xl0Var.getChildAt(i10);
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f5880a;
        int i12 = 0;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        fa faVar = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j10 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f18482id != 777000 && j10 != 0) {
                    if (z10 && !user.contact) {
                        arrayList2.add(Long.valueOf(j10));
                    } else {
                        arrayList.add(Long.valueOf(j10));
                    }
                    this.f5882c.remove(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var2);
                alertDialog$Builder.f18661a.T = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.o();
                return;
            }
            Context context2 = getContext();
            d6Var = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, d6Var);
            alertDialog$Builder2.f18661a.T = arrayList2.size() + " members are not in your contact list";
            alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new q9(this, j3, arrayList, 0));
            alertDialog$Builder2.h("Cancel", null);
            alertDialog$Builder2.o();
            return;
        }
        this.d.put(Long.valueOf(j3), arrayList);
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            this.f5881b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        i(true);
        e(true);
        f(true);
        this.f5888x.K = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.a2 a2Var;
        if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (a2Var = this.G) != null && this.H == chatFull.f18336id) {
            a2Var.c(350L);
            this.G = null;
            this.H = -1L;
            d(chatFull.f18336id, chatFull.participants);
        }
    }

    public final void e(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12 = this.f5880a;
        fa faVar = this.W;
        d dVar = this.f5887w;
        int i13 = 0;
        boolean z12 = false;
        d dVar2 = this.v;
        if (i12 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.b(0, z10);
            if (faVar.L) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (faVar.Z) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i14 = faVar.I;
                if (i14 == 1) {
                    if (faVar.K) {
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
        ArrayList arrayList = this.f5882c;
        if (i12 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        w9 w9Var = this.f5885r;
        if (i12 == 3) {
            int size = fa.l1(arrayList, this.d).size();
            faVar.f4704s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            w9Var.b(z11, z10);
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
            i10 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
            ai.l9 storiesController = MessagesController.getInstance(i10).getStoriesController();
            if (!storiesController.O) {
                while (true) {
                    a0.i iVar = this.f5881b;
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
            int size2 = fa.l1(faVar.d, faVar.e).size();
            faVar.f4701f = size2;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            w9Var.b(false, z10);
            dVar2.b(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        fa faVar = this.W;
        ArrayList arrayList2 = faVar.J;
        HashMap hashMap = faVar.f4703r;
        ArrayList arrayList3 = faVar.f4702n;
        ArrayList arrayList4 = faVar.h;
        HashMap hashMap2 = faVar.e;
        ArrayList arrayList5 = faVar.d;
        int i10 = this.f5880a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f5882c;
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
        if (this.f5880a == 3 && (faVar.N != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    faVar.N = i11;
                }
            } else {
                this.R = faVar.N;
                faVar.N = 3;
            }
        }
        HashSet l1 = fa.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            k9 k9Var = (k9) arrayList.get(i12);
            if (k9Var != null) {
                int i13 = k9Var.f4907i;
                if (i13 > 0) {
                    if (faVar.N != i13) {
                        z12 = false;
                    }
                    k9Var.f4909k = z12;
                    k9Var.f4910l = false;
                } else {
                    TLRPC.User user = k9Var.f4906g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f18482id));
                        k9Var.f4909k = contains;
                        k9Var.f4910l = (contains || !l1.contains(Long.valueOf(k9Var.f4906g.f18482id))) ? false : false;
                    } else {
                        TLRPC.Chat chat = k9Var.h;
                        if (chat != null) {
                            k9Var.f4909k = hashMap3.containsKey(Long.valueOf(chat.f18335id));
                            k9Var.f4910l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            xl0 xl0Var = this.f5883f;
            if (i14 < xl0Var.getChildCount()) {
                View childAt = xl0Var.getChildAt(i14);
                if ((childAt instanceof ea) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    k9 k9Var2 = (k9) arrayList.get(R);
                    ea eaVar = (ea) childAt;
                    if (!k9Var2.f4909k && !k9Var2.f4910l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    eaVar.c(z11, z10);
                    TLRPC.Chat chat2 = k9Var2.h;
                    float f7 = 1.0f;
                    if (chat2 != null) {
                        if (fa.d1(faVar, chat2) > 200) {
                            f7 = 0.3f;
                        }
                        eaVar.b(f7, z10);
                    } else {
                        if (k9Var2.f4910l && !k9Var2.f4909k) {
                            f7 = 0.5f;
                        }
                        eaVar.b(f7, z10);
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
        throw new UnsupportedOperationException("Method not decompiled: ci.y9.g(boolean):void");
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.v3 v3Var = this.f5889y;
        if (v3Var == null) {
            return;
        }
        if (fa.l1(this.f5882c, this.d).size() > 0) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new l9(this, 2));
        } else if (z10) {
            v3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.u3 u3Var = v3Var.f21679b;
            u3Var.c(null, false, true);
            u3Var.setOnClickListener(null);
            u3Var.setVisibility(0);
        }
    }

    public final void i(boolean z10) {
        int i10;
        r9 r9Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        org.telegram.ui.ActionBar.d6 d6Var;
        HashSet l1 = fa.l1(this.f5882c, this.d);
        int i11 = this.f5880a;
        fa faVar = this.W;
        if (i11 == 3) {
            faVar.f4704s = l1.size();
        } else if (i11 == 4) {
            faVar.f4701f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        while (true) {
            r9Var = this.f5888x;
            ArrayList arrayList4 = r9Var.d;
            arrayList = r9Var.d;
            if (i12 >= arrayList4.size()) {
                break;
            }
            o30 o30Var = (o30) arrayList.get(i12);
            if (!l1.contains(Long.valueOf(o30Var.getUid()))) {
                arrayList2.add(o30Var);
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
                    if (((o30) arrayList.get(i13)).getUid() == longValue) {
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
                        d6Var = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
                        o30 o30Var2 = new o30(context, obj, null, true, d6Var);
                        o30Var2.setOnClickListener(this);
                        arrayList3.add(o30Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ba baVar = r9Var.f4449c;
        ArrayList arrayList5 = baVar.e;
        ArrayList arrayList6 = baVar.d;
        ArrayList arrayList7 = baVar.f4419f;
        ca caVar = (ca) baVar.f4420n;
        caVar.G = true;
        ArrayList arrayList8 = caVar.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = baVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((o30) arrayList2.get(i14)).setOnClickListener(null);
        }
        baVar.c();
        if (z10) {
            baVar.f4418c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            baVar.f4417b = animatorSet;
            animatorSet.addListener(new aa(baVar, arrayList2, 0));
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
                o30 o30Var3 = (o30) arrayList2.get(i15);
                arrayList5.add(o30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(o30Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var3, property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                o30 o30Var4 = (o30) arrayList3.get(i16);
                arrayList6.add(o30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(o30Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                baVar.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            baVar.f4417b = null;
            baVar.f4418c = false;
            caVar.f4447a.setAllowDrawCursor(true);
        }
        for (int i18 = 0; i18 < arrayList3.size(); i18++) {
            baVar.addView((View) arrayList3.get(i18));
        }
        baVar.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        float f7 = 1.0f;
        r9 r9Var = this.f5888x;
        if (!z10 && !this.U && getTranslationX() == 0.0f) {
            if (!this.N || Math.abs(this.O - c10) > 1.0f) {
                this.N = true;
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.P = null;
                }
                float translationY = r9Var.getTranslationY();
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
            r9Var.setTranslationY(c10);
        }
        boolean z12 = this.F;
        j9 j9Var = this.E;
        if (!z12) {
            j9Var.setVisibility(8);
            return;
        }
        j9Var.setVisibility(0);
        float f10 = -j9Var.getHeight();
        int i10 = 0;
        while (true) {
            xl0 xl0Var = this.f5883f;
            if (i10 < xl0Var.getChildCount()) {
                View childAt = xl0Var.getChildAt(i10);
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
            ((org.telegram.ui.ActionBar.f2) j9Var.e).c((z11 || this.f5880a != 0) ? 0.0f : 0.0f, true);
        }
        j9Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.e3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onClick(View view) {
        r9 r9Var = this.f5888x;
        if (!r9Var.d.contains(view)) {
            return;
        }
        o30 o30Var = (o30) view;
        if (o30Var.f26928y) {
            r9Var.e = null;
            ba baVar = r9Var.f4449c;
            ca caVar = (ca) baVar.f4420n;
            caVar.G = true;
            caVar.d.remove(o30Var);
            o30Var.setOnClickListener(null);
            baVar.c();
            baVar.f4418c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            baVar.f4417b = animatorSet;
            animatorSet.addListener(new ai.z(5, baVar, o30Var));
            ArrayList arrayList = baVar.h;
            arrayList.clear();
            arrayList.add(o30Var);
            ArrayList arrayList2 = baVar.d;
            arrayList2.clear();
            baVar.e.clear();
            arrayList2.add(o30Var);
            ArrayList arrayList3 = baVar.f4419f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(o30Var, View.ALPHA, 1.0f, 0.0f));
            baVar.requestLayout();
            long uid = o30Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f5882c;
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
            o30 o30Var2 = r9Var.e;
            if (o30Var2 != null) {
                o30Var2.a();
                r9Var.e = null;
            }
            r9Var.e = o30Var;
            o30Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.e3) this.W).currentAccount;
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
        fa faVar = this.W;
        i12 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardHeight;
        if (i12 > 0) {
            i15 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardHeight;
            this.T = i15;
        }
        super.onMeasure(i10, i11);
        int i16 = AndroidUtilities.statusBarHeight;
        if (this.f5880a == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(56.0f);
        }
        this.e.setPadding(0, i16 + dp, 0, 0);
        boolean z17 = this.V;
        z10 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
        xl0 xl0Var = this.f5883f;
        w9 w9Var = this.f5885r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.f5888x.J) > xl0Var.getPaddingTop()) {
                ji.o oVar = new ji.o(getContext(), 2, 0.7f);
                oVar.f43109a = 1;
                oVar.f13094p = -AndroidUtilities.dp(56.0f);
                this.h.w0(oVar);
            }
            int i17 = this.f5880a;
            View view = this.f5886s;
            float f10 = 0.0f;
            if (i17 == 0) {
                z15 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
                if (z15) {
                    f7 = this.T;
                } else {
                    f7 = 0.0f;
                }
                w9Var.setTranslationY(f7);
                z16 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
                if (z16) {
                    f10 = this.T;
                }
                view.setTranslationY(f10);
            } else {
                z12 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
                if (z12) {
                    i13 = this.T;
                } else {
                    i13 = -this.T;
                }
                float f11 = i13;
                ValueAnimator valueAnimator = w9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    w9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                w9Var.d = ofFloat;
                ofFloat.addUpdateListener(new v9(w9Var, 1));
                w9Var.d.addListener(new ai.b(w9Var, 19));
                w9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = w9Var.d;
                sr srVar = org.telegram.ui.ActionBar.o1.f19668w;
                valueAnimator2.setInterpolator(srVar);
                w9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
                if (z13) {
                    i14 = this.T;
                } else {
                    i14 = -this.T;
                }
                view.setTranslationY(i14);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(srVar).withEndAction(new m9(this, 2)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
            this.V = z14;
        }
        xl0Var.setPadding(0, 0, 0, w9Var.getMeasuredHeight());
    }
}
