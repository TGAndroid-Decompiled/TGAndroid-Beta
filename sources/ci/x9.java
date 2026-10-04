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
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zl0;
public final class x9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final i9 E;
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
    public final ea W;
    public int f6303a;
    public final a0.i f6304b;
    public final ArrayList f6305c;
    public final HashMap d;
    public final FrameLayout f6306e;
    public final zl0 f6307f;
    public final s4.c0 h;
    public final t9 f6308n;
    public final v9 f6309r;
    public final View f6310s;
    public final d v;
    public final d f6311w;
    public final q9 f6312x;
    public final org.telegram.ui.Cells.v3 f6313y;

    public x9(ea eaVar, Context context) {
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
        this.W = eaVar;
        this.f6304b = new a0.i();
        this.f6305c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        d6Var = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, d6Var);
        this.f6313y = v3Var;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        q9 q9Var = new q9(this, context, d6Var2, new l9(this, 4));
        this.f6312x = q9Var;
        int i12 = org.telegram.ui.ActionBar.i6.f20894h5;
        q9Var.setBackgroundColor(eaVar.getThemedColor(i12));
        q9Var.setOnSearchTextChange(new m9(this, 3));
        d6Var3 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        i9 i9Var = new i9(context, d6Var3);
        this.E = i9Var;
        i9Var.h = new l9(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6306e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var4 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        zl0 zl0Var = new zl0(context, d6Var4);
        this.f6307f = zl0Var;
        zl0Var.setClipToPadding(false);
        zl0Var.setTranslateSelector(true);
        d6Var5 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        t9 t9Var = new t9(this, context, d6Var5, q9Var, new ai.r5(eaVar, 2));
        this.f6308n = t9Var;
        zl0Var.setAdapter(t9Var);
        t9Var.h = zl0Var;
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setOnScrollListener(new r9(0, this));
        zl0Var.setOnItemClickListener(new ah.b(6, this, context));
        frameLayout.addView(zl0Var, w7.z5.c(-1.0f, -1));
        s9 s9Var = new s9(this);
        s9Var.n(350L);
        s9Var.o(tr.h);
        s9Var.C = false;
        s9Var.f46570m = false;
        zl0Var.setItemAnimator(s9Var);
        frameLayout.addView(q9Var, w7.z5.e(-1, -2, 55));
        frameLayout.addView(v3Var, w7.z5.e(-1, 32, 55));
        addView(i9Var, w7.z5.e(-1, -2, 55));
        v9 v9Var = new v9(this, context);
        this.f6309r = v9Var;
        v9Var.setClickable(true);
        v9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) eaVar).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) eaVar).backgroundPaddingLeft;
        v9Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        d6Var6 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        v9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var6));
        d6Var7 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        d dVar = new d(context, d6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new k9(this, 0));
        dVar.e();
        v9Var.addView(dVar, w7.z5.q(-1, 48, 87));
        d6Var8 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        d dVar2 = new d(context, d6Var8, false);
        this.f6311w = dVar2;
        dVar2.setOnClickListener(new k9(this, 1));
        dVar2.e();
        v9Var.addView(dVar2, w7.z5.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f6310s = view;
        d6Var9 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var9));
        addView(view, w7.z5.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(v9Var, w7.z5.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f6303a == 6) {
            ArrayList arrayList = this.f6305c;
            arrayList.clear();
            i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
            arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
            int i11 = 0;
            while (true) {
                a0.i iVar = this.f6304b;
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
        this.f6303a = i10;
        this.f6304b.b();
        ArrayList arrayList = this.f6305c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        ea eaVar = this.W;
        if (i10 == 4) {
            arrayList.addAll(eaVar.d);
            hashMap.putAll(eaVar.f5052e);
        } else if (i10 == 5) {
            arrayList.addAll(eaVar.J);
        } else if (i10 == 1) {
            ArrayList J0 = ea.J0(eaVar);
            for (int i12 = 0; i12 < J0.size(); i12 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) J0.get(i12)).f20189id, arrayList, i12, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(eaVar.h);
        } else if (i10 == 3) {
            arrayList.addAll(eaVar.f5054n);
            hashMap.putAll(eaVar.f5055r);
        } else if (i10 == 6) {
            a(false);
        }
        this.f6308n.getClass();
        this.h.k1(false);
        i(false);
        q9 q9Var = this.f6312x;
        q9Var.setText("");
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        q9Var.setVisibility(i11);
        q9Var.K = true;
        this.I = null;
        g(false);
        e(false);
        f(false);
        int i13 = this.f6303a;
        zl0 zl0Var = this.f6307f;
        if (i13 != 0) {
            zl0Var.v0(0);
        }
        zl0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -org.telegram.messenger.q.b(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f6312x.J), 0);
        while (true) {
            zl0 zl0Var = this.f6307f;
            if (i10 < zl0Var.getChildCount()) {
                View childAt = zl0Var.getChildAt(i10);
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
        int i11 = this.f6303a;
        int i12 = 0;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        ea eaVar = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j10 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f20189id != 777000 && j10 != 0) {
                    if (z10 && !user.contact) {
                        arrayList2.add(Long.valueOf(j10));
                    } else {
                        arrayList.add(Long.valueOf(j10));
                    }
                    this.f6305c.remove(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var2);
                alertDialog$Builder.f20372a.T = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.o();
                return;
            }
            Context context2 = getContext();
            d6Var = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, d6Var);
            alertDialog$Builder2.f20372a.T = arrayList2.size() + " members are not in your contact list";
            alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new p9(this, j3, arrayList, 0));
            alertDialog$Builder2.h("Cancel", null);
            alertDialog$Builder2.o();
            return;
        }
        this.d.put(Long.valueOf(j3), arrayList);
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            this.f6304b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        i(true);
        e(true);
        f(true);
        this.f6312x.K = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.b2 b2Var;
        if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (b2Var = this.G) != null && this.H == chatFull.f20043id) {
            b2Var.c(350L);
            this.G = null;
            this.H = -1L;
            d(chatFull.f20043id, chatFull.participants);
        }
    }

    public final void e(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12 = this.f6303a;
        ea eaVar = this.W;
        d dVar = this.f6311w;
        int i13 = 0;
        boolean z12 = false;
        d dVar2 = this.v;
        if (i12 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.b(0, z10);
            if (eaVar.L) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (eaVar.Z) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i14 = eaVar.I;
                if (i14 == 1) {
                    if (eaVar.K) {
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
        ArrayList arrayList = this.f6305c;
        if (i12 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        v9 v9Var = this.f6309r;
        if (i12 == 3) {
            int size = ea.l1(arrayList, this.d).size();
            eaVar.f5056s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            v9Var.b(z11, z10);
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
            i10 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
            ai.l9 storiesController = MessagesController.getInstance(i10).getStoriesController();
            if (!storiesController.O) {
                while (true) {
                    a0.i iVar = this.f6304b;
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
            int size2 = ea.l1(eaVar.d, eaVar.f5052e).size();
            eaVar.f5053f = size2;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            v9Var.b(false, z10);
            dVar2.b(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        ea eaVar = this.W;
        ArrayList arrayList2 = eaVar.J;
        HashMap hashMap = eaVar.f5055r;
        ArrayList arrayList3 = eaVar.f5054n;
        ArrayList arrayList4 = eaVar.h;
        HashMap hashMap2 = eaVar.f5052e;
        ArrayList arrayList5 = eaVar.d;
        int i10 = this.f6303a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f6305c;
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
        if (this.f6303a == 3 && (eaVar.N != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    eaVar.N = i11;
                }
            } else {
                this.R = eaVar.N;
                eaVar.N = 3;
            }
        }
        HashSet l1 = ea.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            j9 j9Var = (j9) arrayList.get(i12);
            if (j9Var != null) {
                int i13 = j9Var.f5258i;
                if (i13 > 0) {
                    if (eaVar.N != i13) {
                        z12 = false;
                    }
                    j9Var.f5260k = z12;
                    j9Var.f5261l = false;
                } else {
                    TLRPC.User user = j9Var.f5257g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f20189id));
                        j9Var.f5260k = contains;
                        j9Var.f5261l = (contains || !l1.contains(Long.valueOf(j9Var.f5257g.f20189id))) ? false : false;
                    } else {
                        TLRPC.Chat chat = j9Var.h;
                        if (chat != null) {
                            j9Var.f5260k = hashMap3.containsKey(Long.valueOf(chat.f20042id));
                            j9Var.f5261l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            zl0 zl0Var = this.f6307f;
            if (i14 < zl0Var.getChildCount()) {
                View childAt = zl0Var.getChildAt(i14);
                if ((childAt instanceof da) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    j9 j9Var2 = (j9) arrayList.get(R);
                    da daVar = (da) childAt;
                    if (!j9Var2.f5260k && !j9Var2.f5261l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    daVar.c(z11, z10);
                    TLRPC.Chat chat2 = j9Var2.h;
                    float f7 = 1.0f;
                    if (chat2 != null) {
                        if (ea.d1(eaVar, chat2) > 200) {
                            f7 = 0.3f;
                        }
                        daVar.b(f7, z10);
                    } else {
                        if (j9Var2.f5261l && !j9Var2.f5260k) {
                            f7 = 0.5f;
                        }
                        daVar.b(f7, z10);
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
        throw new UnsupportedOperationException("Method not decompiled: ci.x9.g(boolean):void");
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.v3 v3Var = this.f6313y;
        if (v3Var == null) {
            return;
        }
        if (ea.l1(this.f6305c, this.d).size() > 0) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new k9(this, 2));
        } else if (z10) {
            v3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.u3 u3Var = v3Var.f23552b;
            u3Var.c(null, false, true);
            u3Var.setOnClickListener(null);
            u3Var.setVisibility(0);
        }
    }

    public final void i(boolean z10) {
        int i10;
        q9 q9Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        org.telegram.ui.ActionBar.d6 d6Var;
        HashSet l1 = ea.l1(this.f6305c, this.d);
        int i11 = this.f6303a;
        ea eaVar = this.W;
        if (i11 == 3) {
            eaVar.f5056s = l1.size();
        } else if (i11 == 4) {
            eaVar.f5053f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        while (true) {
            q9Var = this.f6312x;
            ArrayList arrayList4 = q9Var.d;
            arrayList = q9Var.d;
            if (i12 >= arrayList4.size()) {
                break;
            }
            q30 q30Var = (q30) arrayList.get(i12);
            if (!l1.contains(Long.valueOf(q30Var.getUid()))) {
                arrayList2.add(q30Var);
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
                    if (((q30) arrayList.get(i13)).getUid() == longValue) {
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
                        d6Var = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
                        q30 q30Var2 = new q30(context, obj, null, true, d6Var);
                        q30Var2.setOnClickListener(this);
                        arrayList3.add(q30Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        aa aaVar = q9Var.f4780c;
        ArrayList arrayList5 = aaVar.f4712e;
        ArrayList arrayList6 = aaVar.d;
        ArrayList arrayList7 = aaVar.f4713f;
        ba baVar = (ba) aaVar.f4714n;
        baVar.G = true;
        ArrayList arrayList8 = baVar.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = aaVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((q30) arrayList2.get(i14)).setOnClickListener(null);
        }
        aaVar.c();
        if (z10) {
            aaVar.f4711c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            aaVar.f4710b = animatorSet;
            animatorSet.addListener(new z9(aaVar, arrayList2, 0));
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
                q30 q30Var3 = (q30) arrayList2.get(i15);
                arrayList5.add(q30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(q30Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(q30Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(q30Var3, property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                q30 q30Var4 = (q30) arrayList3.get(i16);
                arrayList6.add(q30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(q30Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(q30Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(q30Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                aaVar.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            aaVar.f4710b = null;
            aaVar.f4711c = false;
            baVar.f4778a.setAllowDrawCursor(true);
        }
        for (int i18 = 0; i18 < arrayList3.size(); i18++) {
            aaVar.addView((View) arrayList3.get(i18));
        }
        aaVar.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        float f7 = 1.0f;
        q9 q9Var = this.f6312x;
        if (!z10 && !this.U && getTranslationX() == 0.0f) {
            if (!this.N || Math.abs(this.O - c10) > 1.0f) {
                this.N = true;
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.P = null;
                }
                float translationY = q9Var.getTranslationY();
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
            q9Var.setTranslationY(c10);
        }
        boolean z12 = this.F;
        i9 i9Var = this.E;
        if (!z12) {
            i9Var.setVisibility(8);
            return;
        }
        i9Var.setVisibility(0);
        float f10 = -i9Var.getHeight();
        int i10 = 0;
        while (true) {
            zl0 zl0Var = this.f6307f;
            if (i10 < zl0Var.getChildCount()) {
                View childAt = zl0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f10 = this.f6306e.getPaddingTop() + childAt.getY();
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
            ((org.telegram.ui.ActionBar.g2) i9Var.f5177e).c((z11 || this.f6303a != 0) ? 0.0f : 0.0f, true);
        }
        i9Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
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
        q9 q9Var = this.f6312x;
        if (!q9Var.d.contains(view)) {
            return;
        }
        q30 q30Var = (q30) view;
        if (q30Var.f29885y) {
            q9Var.f4781e = null;
            aa aaVar = q9Var.f4780c;
            ba baVar = (ba) aaVar.f4714n;
            baVar.G = true;
            baVar.d.remove(q30Var);
            q30Var.setOnClickListener(null);
            aaVar.c();
            aaVar.f4711c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            aaVar.f4710b = animatorSet;
            animatorSet.addListener(new ai.z(5, aaVar, q30Var));
            ArrayList arrayList = aaVar.h;
            arrayList.clear();
            arrayList.add(q30Var);
            ArrayList arrayList2 = aaVar.d;
            arrayList2.clear();
            aaVar.f4712e.clear();
            arrayList2.add(q30Var);
            ArrayList arrayList3 = aaVar.f4713f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(q30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(q30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(q30Var, View.ALPHA, 1.0f, 0.0f));
            aaVar.requestLayout();
            long uid = q30Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f6305c;
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
            q30 q30Var2 = q9Var.f4781e;
            if (q30Var2 != null) {
                q30Var2.a();
                q9Var.f4781e = null;
            }
            q9Var.f4781e = q30Var;
            q30Var.b();
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
        ea eaVar = this.W;
        i12 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardHeight;
        if (i12 > 0) {
            i15 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardHeight;
            this.T = i15;
        }
        super.onMeasure(i10, i11);
        int i16 = AndroidUtilities.statusBarHeight;
        if (this.f6303a == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(56.0f);
        }
        this.f6306e.setPadding(0, i16 + dp, 0, 0);
        boolean z17 = this.V;
        z10 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
        zl0 zl0Var = this.f6307f;
        v9 v9Var = this.f6309r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.f6312x.J) > zl0Var.getPaddingTop()) {
                ji.o oVar = new ji.o(getContext(), 2, 0.7f);
                oVar.f46699a = 1;
                oVar.f14237p = -AndroidUtilities.dp(56.0f);
                this.h.w0(oVar);
            }
            int i17 = this.f6303a;
            View view = this.f6310s;
            float f10 = 0.0f;
            if (i17 == 0) {
                z15 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                if (z15) {
                    f7 = this.T;
                } else {
                    f7 = 0.0f;
                }
                v9Var.setTranslationY(f7);
                z16 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                if (z16) {
                    f10 = this.T;
                }
                view.setTranslationY(f10);
            } else {
                z12 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                if (z12) {
                    i13 = this.T;
                } else {
                    i13 = -this.T;
                }
                float f11 = i13;
                ValueAnimator valueAnimator = v9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    v9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                v9Var.d = ofFloat;
                ofFloat.addUpdateListener(new u9(v9Var, 1));
                v9Var.d.addListener(new ai.b(v9Var, 19));
                v9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = v9Var.d;
                tr trVar = org.telegram.ui.ActionBar.p1.f21448w;
                valueAnimator2.setInterpolator(trVar);
                v9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                if (z13) {
                    i14 = this.T;
                } else {
                    i14 = -this.T;
                }
                view.setTranslationY(i14);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(trVar).withEndAction(new l9(this, 2)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
            this.V = z14;
        }
        zl0Var.setPadding(0, 0, 0, v9Var.getMeasuredHeight());
    }
}
