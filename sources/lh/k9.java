package lh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zk0;

public final class k9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final w8 A;
    public boolean B;
    public org.telegram.ui.ActionBar.b2 C;
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
    public final q9 S;

    public int f16249a;

    public final a0.h f16250b;

    public final ArrayList f16251c;
    public final HashMap d;

    public final FrameLayout f16252e;

    public final zk0 f16253f;
    public final f2.k0 h;

    public final f9 f16254n;

    public final i9 f16255r;

    public final View f16256s;
    public final d v;

    public final d f16257w;

    public final c9 f16258x;

    public final org.telegram.ui.Cells.s3 f16259y;

    public k9(q9 q9Var, Context context) {
        super(context);
        this.S = q9Var;
        this.f16250b = new a0.h();
        this.f16251c = new ArrayList();
        this.d = new HashMap();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.N = -1;
        org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider);
        this.f16259y = s3Var;
        c9 c9Var = new c9(this, context, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider, new z8(this, 4));
        this.f16258x = c9Var;
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        c9Var.setBackgroundColor(q9Var.getThemedColor(i10));
        c9Var.setOnSearchTextChange(new a9(this, 3));
        w8 w8Var = new w8(context, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider);
        this.A = w8Var;
        w8Var.h = new z8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16252e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        zk0 zk0Var = new zk0(context, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider);
        this.f16253f = zk0Var;
        zk0Var.setClipToPadding(false);
        zk0Var.setTranslateSelector(true);
        f9 f9Var = new f9(this, context, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider, c9Var, new jh.u3(q9Var, 2));
        this.f16254n = f9Var;
        zk0Var.setAdapter(f9Var);
        f9Var.h = zk0Var;
        f2.k0 k0Var = new f2.k0();
        this.h = k0Var;
        zk0Var.setLayoutManager(k0Var);
        zk0Var.setOnScrollListener(new d9(this, 0));
        zk0Var.setOnItemClickListener(new jh.z1(4, this, context));
        frameLayout.addView(zk0Var, h7.z5.c(-1.0f, -1));
        e9 e9Var = new e9(this);
        e9Var.n(350L);
        e9Var.o(er.h);
        e9Var.C = false;
        e9Var.f5819m = false;
        zk0Var.setItemAnimator(e9Var);
        frameLayout.addView(c9Var, h7.z5.e(-1, -2, 55));
        frameLayout.addView(s3Var, h7.z5.e(-1, 32, 55));
        addView(w8Var, h7.z5.e(-1, -2, 55));
        i9 i9Var = new i9(this, context);
        this.f16255r = i9Var;
        i9Var.setClickable(true);
        i9Var.setOrientation(1);
        i9Var.setPadding(((org.telegram.ui.ActionBar.e3) q9Var).backgroundPaddingLeft + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((org.telegram.ui.ActionBar.e3) q9Var).backgroundPaddingLeft + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        i9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider));
        d dVar = new d(context, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider, true);
        this.v = dVar;
        dVar.setOnClickListener(new y8(this, 0));
        dVar.e();
        i9Var.addView(dVar, h7.z5.q(-1, 48, 87));
        d dVar2 = new d(context, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider, false);
        this.f16257w = dVar2;
        dVar2.setOnClickListener(new y8(this, 1));
        dVar2.e();
        i9Var.addView(dVar2, h7.z5.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f16256s = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider));
        addView(view, h7.z5.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(i9Var, h7.z5.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        if (this.f16249a != 6) {
            return;
        }
        ArrayList arrayList = this.f16251c;
        arrayList.clear();
        arrayList.addAll(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) this.S).currentAccount).getStoriesController().L);
        int i10 = 0;
        while (true) {
            a0.h hVar = this.f16250b;
            if (i10 >= hVar.m()) {
                break;
            }
            long j10 = hVar.j(i10);
            if (!((Boolean) hVar.n(i10)).booleanValue()) {
                arrayList.remove(Long.valueOf(j10));
            } else if (!arrayList.contains(Long.valueOf(j10))) {
                arrayList.add(Long.valueOf(j10));
            }
            i10++;
        }
        if (z10) {
            g(true);
            e(true);
            f(true);
        }
    }

    public final void b(int i10) {
        this.f16249a = i10;
        this.f16250b.b();
        ArrayList arrayList = this.f16251c;
        arrayList.clear();
        HashMap map = this.d;
        map.clear();
        q9 q9Var = this.S;
        if (i10 == 4) {
            arrayList.addAll(q9Var.d);
            map.putAll(q9Var.f16595e);
        } else if (i10 == 5) {
            arrayList.addAll(q9Var.F);
        } else if (i10 == 1) {
            ArrayList arrayListJ0 = q9.J0(q9Var);
            for (int iF = 0; iF < arrayListJ0.size(); iF = com.google.android.recaptcha.internal.a.f(((TLRPC.User) arrayListJ0.get(iF)).f22527id, arrayList, iF, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(q9Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(q9Var.f16597n);
            map.putAll(q9Var.f16598r);
        } else if (i10 == 6) {
            a(false);
        }
        this.f16254n.getClass();
        this.h.k1(false);
        i(false);
        c9 c9Var = this.f16258x;
        c9Var.setText("");
        c9Var.setVisibility(i10 == 0 ? 8 : 0);
        c9Var.G = true;
        this.E = null;
        g(false);
        e(false);
        f(false);
        int i11 = this.f16249a;
        zk0 zk0Var = this.f16253f;
        if (i11 != 0) {
            zk0Var.u0(0);
        }
        zk0Var.requestLayout();
        this.N = -1;
    }

    public final float c() {
        int i10 = 0;
        float f10 = -i0.a.d(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f16258x.F), 0);
        while (true) {
            zk0 zk0Var = this.f16253f;
            if (i10 >= zk0Var.getChildCount()) {
                return f10;
            }
            View childAt = zk0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f10, childAt.getY());
            }
            i10++;
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.f16249a;
        int i11 = 0;
        boolean z10 = i10 == 1 || i10 == 2;
        q9 q9Var = this.S;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i12 = 0; i12 < chatParticipants.participants.size(); i12++) {
                long j11 = chatParticipants.participants.get(i12).user_id;
                TLRPC.User user = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getUser(Long.valueOf(j11));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f22527id != 777000 && j11 != 0) {
                    if (!z10 || user.contact) {
                        arrayList.add(Long.valueOf(j11));
                    } else {
                        arrayList2.add(Long.valueOf(j11));
                    }
                    this.f16251c.remove(Long.valueOf(j11));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j10), arrayList);
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                this.f16250b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            i(true);
            e(true);
            f(true);
            this.f16258x.G = true;
            return;
        }
        if (arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider);
            alertDialog$Builder.f22702a.P = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.o();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider);
        alertDialog$Builder2.f22702a.P = arrayList2.size() + " members are not in your contact list";
        alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new c3.f(this, j10, arrayList, 4));
        alertDialog$Builder2.h("Cancel", null);
        alertDialog$Builder2.o();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.b2 b2Var;
        if (i10 != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (b2Var = this.C) == null || this.D != chatFull.f22381id) {
            return;
        }
        b2Var.c(350L);
        this.C = null;
        this.D = -1L;
        d(chatFull.f22381id, chatFull.participants);
    }

    public final void e(boolean z10) {
        int i10 = this.f16249a;
        q9 q9Var = this.S;
        d dVar = this.f16257w;
        int i11 = 0;
        d dVar2 = this.v;
        if (i10 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (q9Var.H || q9Var.V) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i12 = q9Var.E;
                if (i12 == 1) {
                    dVar2.g(LocaleController.getString(q9Var.G ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z10, true);
                } else {
                    dVar2.g(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i12), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f16251c;
        if (i10 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        i9 i9Var = this.f16255r;
        if (i10 == 3) {
            int size = q9.l1(arrayList, this.d).size();
            q9Var.f16599s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            i9Var.b(size <= 0, z10);
            dVar2.c(size, z10);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i10 == 2) {
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
            return;
        }
        if (i10 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        if (i10 != 6) {
            if (i10 == 4) {
                int size2 = q9.l1(q9Var.d, q9Var.f16595e).size();
                q9Var.f16596f = size2;
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.setShowZero(false);
                i9Var.b(false, z10);
                dVar2.c(size2, z10);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
        jh.s6 storiesController = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getStoriesController();
        if (!storiesController.O) {
            while (true) {
                a0.h hVar = this.f16250b;
                if (i11 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i11);
                ((Boolean) hVar.n(i11)).getClass();
                storiesController.L.contains(Long.valueOf(j10));
                i11++;
            }
        } else {
            dVar2.c(arrayList.size(), z10);
        }
        dVar.setVisibility(8);
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int iR;
        q9 q9Var = this.S;
        ArrayList arrayList2 = q9Var.F;
        HashMap map = q9Var.f16598r;
        ArrayList arrayList3 = q9Var.f16597n;
        ArrayList arrayList4 = q9Var.h;
        HashMap map2 = q9Var.f16595e;
        ArrayList arrayList5 = q9Var.d;
        int i10 = this.f16249a;
        HashMap map3 = this.d;
        ArrayList arrayList6 = this.f16251c;
        if (i10 == 4) {
            arrayList5.clear();
            map2.clear();
            arrayList5.addAll(arrayList6);
            map2.putAll(map3);
        } else if (i10 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i10 == 3) {
            arrayList3.clear();
            map.clear();
            arrayList3.addAll(arrayList6);
            map.putAll(map3);
        } else if (i10 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.f16249a == 3 && (q9Var.J != 3 || (arrayList6.isEmpty() && map3.isEmpty()))) {
            if (arrayList6.isEmpty() && map3.isEmpty()) {
                int i11 = this.N;
                if (i11 != -1) {
                    q9Var.J = i11;
                }
            } else {
                this.N = q9Var.J;
                q9Var.J = 3;
            }
        }
        HashSet hashSetL1 = q9.l1(arrayList6, map3);
        int i12 = 0;
        while (true) {
            arrayList = this.H;
            if (i12 >= arrayList.size()) {
                break;
            }
            x8 x8Var = (x8) arrayList.get(i12);
            if (x8Var != null) {
                int i13 = x8Var.f17042i;
                if (i13 > 0) {
                    x8Var.f17044k = q9Var.J == i13;
                    x8Var.f17045l = false;
                } else {
                    TLRPC.User user = x8Var.f17041g;
                    if (user != null) {
                        boolean zContains = arrayList6.contains(Long.valueOf(user.f22527id));
                        x8Var.f17044k = zContains;
                        x8Var.f17045l = !zContains && hashSetL1.contains(Long.valueOf(x8Var.f17041g.f22527id));
                    } else {
                        TLRPC.Chat chat = x8Var.h;
                        if (chat != null) {
                            x8Var.f17044k = map3.containsKey(Long.valueOf(chat.f22380id));
                            x8Var.f17045l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            zk0 zk0Var = this.f16253f;
            if (i14 >= zk0Var.getChildCount()) {
                h(z10);
                return;
            }
            View childAt = zk0Var.getChildAt(i14);
            if ((childAt instanceof p9) && (iR = RecyclerView.R(childAt)) >= 0 && iR < arrayList.size()) {
                x8 x8Var2 = (x8) arrayList.get(iR);
                p9 p9Var = (p9) childAt;
                p9Var.c(x8Var2.f17044k || x8Var2.f17045l, z10);
                TLRPC.Chat chat2 = x8Var2.h;
                float f10 = 1.0f;
                if (chat2 != null) {
                    p9Var.b(q9.d1(q9Var, chat2) > 200 ? 0.3f : 1.0f, z10);
                } else {
                    if (x8Var2.f17045l && !x8Var2.f17044k) {
                        f10 = 0.5f;
                    }
                    p9Var.b(f10, z10);
                }
            }
            i14++;
        }
    }

    public final void g(boolean z10) {
        float fDp;
        float fDp2;
        boolean zIsEmpty;
        f9 f9Var;
        String lowerCase;
        int i10;
        boolean z11;
        boolean z12;
        ArrayList arrayListZ0;
        ArrayList arrayList;
        HashMap map;
        ArrayList arrayList2;
        boolean z13;
        int i11;
        int i12;
        zk0 zk0Var;
        float fDp3;
        float f10;
        int i13;
        TLObject tLObject;
        int i14;
        TLRPC.Chat chat;
        String lowerCase2;
        String lowerCase3;
        ArrayList<TLRPC.TL_username> arrayList3;
        int i15;
        TLRPC.TL_username tL_username;
        boolean z14;
        String lowerCase4;
        boolean zContains;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        int i18;
        TLObject tLObject2;
        int i19;
        int i20;
        int i21;
        boolean z17;
        boolean zContains2;
        boolean z18;
        int i22;
        boolean z19;
        int i23;
        TLObject tLObject3;
        boolean z20;
        boolean zContainsKey;
        boolean z21;
        boolean zIsChannelAndNotMegaGroup;
        int i24;
        int i25;
        String pluralString;
        float f11;
        boolean z22;
        String str;
        x8 x8Var;
        boolean z23;
        int i26;
        String pluralString2;
        int i27;
        x8 x8Var2;
        String pluralString3;
        int i28;
        q9 q9Var = this.S;
        ArrayList arrayList4 = q9Var.f16597n;
        ArrayList arrayList5 = q9Var.d;
        ArrayList arrayList6 = q9Var.h;
        HashSet hashSet = q9Var.v;
        ArrayList arrayList7 = this.G;
        arrayList7.clear();
        ArrayList arrayList8 = this.H;
        arrayList7.addAll(arrayList8);
        arrayList8.clear();
        int i29 = this.f16249a;
        org.telegram.ui.Cells.s3 s3Var = this.f16259y;
        if (i29 != 0) {
            w8 w8Var = this.A;
            if (i29 == 1) {
                w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                w8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) w8Var.f17016e).c(0.0f, false);
                arrayList8.add(x8.d());
                arrayList8.add(x8.c());
                float fDp4 = AndroidUtilities.dp(56.0f) + 0.0f;
                arrayList8.size();
                arrayList8.add(x8.e());
                float fDp5 = fDp4 + AndroidUtilities.dp(150.0f);
                arrayList8.add(x8.f());
                fDp2 = AndroidUtilities.dp(32.0f) + fDp5;
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                h(z10);
                this.B = true;
            } else if (i29 == 2) {
                w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                w8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) w8Var.f17016e).c(0.0f, false);
                arrayList8.add(x8.d());
                arrayList8.add(x8.c());
                float fDp6 = AndroidUtilities.dp(56.0f) + 0.0f;
                arrayList8.size();
                arrayList8.add(x8.e());
                float fDp7 = fDp6 + AndroidUtilities.dp(150.0f);
                arrayList8.add(x8.f());
                fDp2 = AndroidUtilities.dp(32.0f) + fDp7;
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                h(z10);
                this.B = true;
            } else if (i29 == 3) {
                w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                w8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) w8Var.f17016e).c(0.0f, false);
                arrayList8.add(x8.d());
                arrayList8.add(x8.c());
                float fDp8 = AndroidUtilities.dp(56.0f) + 0.0f;
                arrayList8.size();
                arrayList8.add(x8.e());
                float fDp9 = fDp8 + AndroidUtilities.dp(150.0f);
                arrayList8.add(x8.f());
                fDp2 = AndroidUtilities.dp(32.0f) + fDp9;
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                h(z10);
                this.B = true;
            } else {
                if (i29 != 5) {
                    if (i29 == 6) {
                        w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                        w8Var.d(true);
                        ((org.telegram.ui.ActionBar.g2) w8Var.f17016e).c(0.0f, false);
                        arrayList8.add(x8.d());
                        arrayList8.add(x8.c());
                        float fDp10 = AndroidUtilities.dp(56.0f) + 0.0f;
                        arrayList8.size();
                        arrayList8.add(x8.e());
                        float fDp11 = fDp10 + AndroidUtilities.dp(150.0f);
                        arrayList8.add(x8.f());
                        fDp2 = AndroidUtilities.dp(32.0f) + fDp11;
                        s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                        h(z10);
                        this.B = true;
                    } else if (i29 == 4) {
                        w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                        w8Var.d(true);
                        ((org.telegram.ui.ActionBar.g2) w8Var.f17016e).c(0.0f, false);
                        arrayList8.add(x8.d());
                        arrayList8.add(x8.c());
                        float fDp12 = AndroidUtilities.dp(56.0f) + 0.0f;
                        arrayList8.size();
                        arrayList8.add(x8.e());
                        float fDp13 = fDp12 + AndroidUtilities.dp(150.0f);
                        arrayList8.add(x8.f());
                        fDp = fDp13 + AndroidUtilities.dp(32.0f);
                        s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                        h(z10);
                        this.B = true;
                    }
                    zIsEmpty = TextUtils.isEmpty(this.E);
                    if (this.f16249a != 0) {
                        lowerCase = AndroidUtilities.translitSafe(this.E).toLowerCase();
                        i10 = this.f16249a;
                        if (i10 == 5) {
                            arrayListZ0 = q9.Y0(q9Var);
                        } else {
                            if (i10 != 1 || i10 == 2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (q9Var.U || !(i10 == 3 || i10 == 6)) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            arrayListZ0 = q9.Z0(q9Var, z11, z12);
                        }
                        arrayList = this.f16251c;
                        map = this.d;
                        HashSet hashSetL1 = q9.l1(arrayList, map);
                        arrayList2 = this.F;
                        if (zIsEmpty) {
                            if (!z10) {
                                arrayList2.clear();
                                i23 = 0;
                                while (i23 < arrayListZ0.size()) {
                                    tLObject3 = (TLObject) arrayListZ0.get(i23);
                                    if (tLObject3 instanceof TLRPC.User) {
                                        z20 = zIsEmpty;
                                        zContainsKey = arrayList.contains(Long.valueOf(((TLRPC.User) tLObject3).f22527id));
                                    } else {
                                        z20 = zIsEmpty;
                                        if (tLObject3 instanceof TLRPC.Chat) {
                                            zContainsKey = map.containsKey(Long.valueOf(((TLRPC.Chat) tLObject3).f22380id));
                                        } else {
                                            zContainsKey = false;
                                        }
                                    }
                                    if (zContainsKey) {
                                        arrayList2.add(tLObject3);
                                    }
                                    i23++;
                                    zIsEmpty = z20;
                                }
                            }
                            z13 = zIsEmpty;
                            i17 = 0;
                            i18 = 0;
                            while (i17 < arrayList2.size()) {
                                tLObject2 = (TLObject) arrayList2.get(i17);
                                if (tLObject2 instanceof TLRPC.User) {
                                    TLRPC.User user = (TLRPC.User) tLObject2;
                                    zContains2 = arrayList.contains(Long.valueOf(user.f22527id));
                                    i19 = i17;
                                    i20 = i18;
                                    if (zContains2 && hashSetL1.contains(Long.valueOf(user.f22527id))) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    x8 x8VarI = x8.i(user, zContains2, z18);
                                    i22 = this.f16249a;
                                    if (i22 != 2 || i22 == 4) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    x8VarI.f17046m = z19;
                                    arrayList8.add(x8VarI);
                                    fDp += AndroidUtilities.dp(56.0f);
                                } else {
                                    i19 = i17;
                                    i20 = i18;
                                    if (tLObject2 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                                        boolean zContainsKey2 = map.containsKey(Long.valueOf(chat2.f22380id));
                                        float f12 = fDp;
                                        x8 x8Var3 = new x8(3, true);
                                        x8Var3.h = chat2;
                                        x8Var3.f17044k = zContainsKey2;
                                        i21 = this.f16249a;
                                        if (i21 != 2 || i21 == 4) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        x8Var3.f17046m = z17;
                                        arrayList8.add(x8Var3);
                                        fDp = f12 + AndroidUtilities.dp(56.0f);
                                    } else {
                                        i18 = i20;
                                    }
                                    i17 = i19 + 1;
                                }
                                i18 = i20 + 1;
                                i17 = i19 + 1;
                            }
                            i11 = i18;
                        } else {
                            z13 = zIsEmpty;
                            i11 = 0;
                        }
                        i12 = 0;
                        while (i12 < arrayListZ0.size()) {
                            tLObject = (TLObject) arrayListZ0.get(i12);
                            if (z13 || !arrayList2.contains(tLObject)) {
                                if (TextUtils.isEmpty(lowerCase)) {
                                    i14 = i12;
                                    z14 = true;
                                } else if (tLObject instanceof TLRPC.User) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject;
                                    lowerCase4 = AndroidUtilities.translitSafe(UserObject.getUserName(user2)).toLowerCase();
                                    if (!lowerCase4.startsWith(lowerCase) || org.telegram.messenger.y1.x(" ", lowerCase, lowerCase4)) {
                                        i14 = i12;
                                    } else {
                                        String lowerCase5 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user2)).toLowerCase();
                                        if (lowerCase5.startsWith(lowerCase) || org.telegram.messenger.y1.x(" ", lowerCase, lowerCase5)) {
                                            i14 = i12;
                                        } else {
                                            ArrayList<TLRPC.TL_username> arrayList9 = user2.usernames;
                                            if (arrayList9 != null) {
                                                int i30 = 0;
                                                while (true) {
                                                    if (i30 < arrayList9.size()) {
                                                        TLRPC.TL_username tL_username2 = arrayList9.get(i30);
                                                        i14 = i12;
                                                        if (!tL_username2.active || !AndroidUtilities.translitSafe(tL_username2.username).toLowerCase().startsWith(lowerCase)) {
                                                            i30++;
                                                            i12 = i14;
                                                        }
                                                    }
                                                }
                                            }
                                            i14 = i12;
                                            z14 = false;
                                        }
                                    }
                                    z14 = true;
                                } else {
                                    i14 = i12;
                                    if (tLObject instanceof TLRPC.Chat) {
                                        chat = (TLRPC.Chat) tLObject;
                                        lowerCase2 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                                        if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.y1.x(" ", lowerCase, lowerCase2)) {
                                            lowerCase3 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                                            if (!lowerCase3.startsWith(lowerCase) && !org.telegram.messenger.y1.x(" ", lowerCase, lowerCase3)) {
                                                arrayList3 = chat.usernames;
                                                if (arrayList3 != null) {
                                                    i15 = 0;
                                                    while (true) {
                                                        if (i15 < arrayList3.size()) {
                                                            tL_username = arrayList3.get(i15);
                                                            if (tL_username.active || !AndroidUtilities.translitSafe(tL_username.username).toLowerCase().startsWith(lowerCase)) {
                                                                i15++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z14 = true;
                                    }
                                    z14 = false;
                                }
                                if (z14) {
                                    if (tLObject instanceof TLRPC.User) {
                                        TLRPC.User user3 = (TLRPC.User) tLObject;
                                        zContains = arrayList.contains(Long.valueOf(user3.f22527id));
                                        if (zContains && hashSetL1.contains(Long.valueOf(user3.f22527id))) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        x8 x8VarI2 = x8.i(user3, zContains, z15);
                                        i16 = this.f16249a;
                                        if (i16 != 2 || i16 == 4) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        x8VarI2.f17046m = z16;
                                        arrayList8.add(x8VarI2);
                                        fDp += AndroidUtilities.dp(56.0f);
                                        i11++;
                                    } else if (tLObject instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat3 = (TLRPC.Chat) tLObject;
                                        boolean zContainsKey3 = map.containsKey(Long.valueOf(chat3.f22380id));
                                        x8 x8Var4 = new x8(3, true);
                                        x8Var4.h = chat3;
                                        x8Var4.f17044k = zContainsKey3;
                                        int i31 = this.f16249a;
                                        x8Var4.f17046m = i31 != 2 || i31 == 4;
                                        arrayList8.add(x8Var4);
                                        fDp += AndroidUtilities.dp(56.0f);
                                        i11++;
                                    }
                                }
                                i12 = i14 + 1;
                            } else {
                                i14 = i12;
                            }
                            i12 = i14 + 1;
                        }
                        if (!z13) {
                            if (i11 == 0) {
                                arrayList8.add(new x8(5, false));
                                fDp += AndroidUtilities.dp(150.0f);
                            }
                            zk0Var = this.f16253f;
                            if (zk0Var != null) {
                                int measuredHeight = (zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop()) - zk0Var.getPaddingBottom();
                                if (((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible) {
                                    i13 = this.P;
                                } else {
                                    i13 = 0;
                                }
                                fDp3 = measuredHeight + i13;
                            } else {
                                fDp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                            }
                            f10 = fDp3 - fDp;
                            if (f10 > 0.0f) {
                                x8 x8Var5 = new x8(-1, false);
                                x8Var5.f17049p = (int) f10;
                                arrayList8.add(x8Var5);
                            }
                        }
                    }
                    if (this.h.f5725t) {
                        Collections.reverse(arrayList8);
                    }
                    f9Var = this.f16254n;
                    if (f9Var != null) {
                        if (z10 || q9Var.J == 0) {
                            f9Var.l();
                        } else {
                            f9Var.E(arrayList7, arrayList8);
                        }
                    }
                    this.f16252e.invalidate();
                }
                w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                w8Var.d(q9Var.K);
                ((org.telegram.ui.ActionBar.g2) w8Var.f17016e).c(0.0f, false);
                arrayList8.add(x8.d());
                arrayList8.add(x8.c());
                float fDp14 = AndroidUtilities.dp(56.0f) + 0.0f;
                arrayList8.size();
                arrayList8.add(x8.e());
                float fDp15 = fDp14 + AndroidUtilities.dp(150.0f);
                arrayList8.add(x8.f());
                fDp2 = AndroidUtilities.dp(32.0f) + fDp15;
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                h(z10);
                this.B = true;
            }
            fDp = fDp2;
            zIsEmpty = TextUtils.isEmpty(this.E);
            if (this.f16249a != 0) {
                lowerCase = AndroidUtilities.translitSafe(this.E).toLowerCase();
                i10 = this.f16249a;
                if (i10 == 5) {
                    arrayListZ0 = q9.Y0(q9Var);
                } else {
                    if (i10 != 1) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (q9Var.U) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    arrayListZ0 = q9.Z0(q9Var, z11, z12);
                }
                arrayList = this.f16251c;
                map = this.d;
                HashSet hashSetL2 = q9.l1(arrayList, map);
                arrayList2 = this.F;
                if (zIsEmpty) {
                    if (!z10) {
                        arrayList2.clear();
                        i23 = 0;
                        while (i23 < arrayListZ0.size()) {
                            tLObject3 = (TLObject) arrayListZ0.get(i23);
                            if (tLObject3 instanceof TLRPC.User) {
                                z20 = zIsEmpty;
                                zContainsKey = arrayList.contains(Long.valueOf(((TLRPC.User) tLObject3).f22527id));
                            } else {
                                z20 = zIsEmpty;
                                if (tLObject3 instanceof TLRPC.Chat) {
                                    zContainsKey = map.containsKey(Long.valueOf(((TLRPC.Chat) tLObject3).f22380id));
                                } else {
                                    zContainsKey = false;
                                }
                            }
                            if (zContainsKey) {
                                arrayList2.add(tLObject3);
                            }
                            i23++;
                            zIsEmpty = z20;
                        }
                    }
                    z13 = zIsEmpty;
                    i17 = 0;
                    i18 = 0;
                    while (i17 < arrayList2.size()) {
                        tLObject2 = (TLObject) arrayList2.get(i17);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user4 = (TLRPC.User) tLObject2;
                            zContains2 = arrayList.contains(Long.valueOf(user4.f22527id));
                            i19 = i17;
                            i20 = i18;
                            if (zContains2) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            x8 x8VarI3 = x8.i(user4, zContains2, z18);
                            i22 = this.f16249a;
                            if (i22 != 2) {
                                z19 = true;
                            } else {
                                z19 = true;
                            }
                            x8VarI3.f17046m = z19;
                            arrayList8.add(x8VarI3);
                            fDp += AndroidUtilities.dp(56.0f);
                        } else {
                            i19 = i17;
                            i20 = i18;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat4 = (TLRPC.Chat) tLObject2;
                                boolean zContainsKey4 = map.containsKey(Long.valueOf(chat4.f22380id));
                                float f13 = fDp;
                                x8 x8Var6 = new x8(3, true);
                                x8Var6.h = chat4;
                                x8Var6.f17044k = zContainsKey4;
                                i21 = this.f16249a;
                                if (i21 != 2) {
                                    z17 = true;
                                } else {
                                    z17 = true;
                                }
                                x8Var6.f17046m = z17;
                                arrayList8.add(x8Var6);
                                fDp = f13 + AndroidUtilities.dp(56.0f);
                            } else {
                                i18 = i20;
                            }
                            i17 = i19 + 1;
                        }
                        i18 = i20 + 1;
                        i17 = i19 + 1;
                    }
                    i11 = i18;
                } else {
                    z13 = zIsEmpty;
                    i11 = 0;
                }
                i12 = 0;
                while (i12 < arrayListZ0.size()) {
                    tLObject = (TLObject) arrayListZ0.get(i12);
                    if (z13) {
                        if (TextUtils.isEmpty(lowerCase)) {
                            i14 = i12;
                            z14 = true;
                        } else if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user5 = (TLRPC.User) tLObject;
                            lowerCase4 = AndroidUtilities.translitSafe(UserObject.getUserName(user5)).toLowerCase();
                            if (lowerCase4.startsWith(lowerCase)) {
                                i14 = i12;
                            } else {
                                i14 = i12;
                            }
                            z14 = true;
                        } else {
                            i14 = i12;
                            if (tLObject instanceof TLRPC.Chat) {
                                chat = (TLRPC.Chat) tLObject;
                                lowerCase2 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                                if (!lowerCase2.startsWith(lowerCase)) {
                                    lowerCase3 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                                    if (!lowerCase3.startsWith(lowerCase)) {
                                        arrayList3 = chat.usernames;
                                        if (arrayList3 != null) {
                                            i15 = 0;
                                            while (true) {
                                                if (i15 < arrayList3.size()) {
                                                    tL_username = arrayList3.get(i15);
                                                    if (tL_username.active) {
                                                    }
                                                    i15++;
                                                }
                                            }
                                        }
                                    }
                                }
                                z14 = true;
                            }
                            z14 = false;
                        }
                        if (z14) {
                            if (tLObject instanceof TLRPC.User) {
                                TLRPC.User user6 = (TLRPC.User) tLObject;
                                zContains = arrayList.contains(Long.valueOf(user6.f22527id));
                                if (zContains) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                x8 x8VarI4 = x8.i(user6, zContains, z15);
                                i16 = this.f16249a;
                                if (i16 != 2) {
                                    z16 = true;
                                } else {
                                    z16 = true;
                                }
                                x8VarI4.f17046m = z16;
                                arrayList8.add(x8VarI4);
                                fDp += AndroidUtilities.dp(56.0f);
                                i11++;
                            } else if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
                                boolean zContainsKey5 = map.containsKey(Long.valueOf(chat5.f22380id));
                                x8 x8Var7 = new x8(3, true);
                                x8Var7.h = chat5;
                                x8Var7.f17044k = zContainsKey5;
                                int i32 = this.f16249a;
                                x8Var7.f17046m = i32 != 2 || i32 == 4;
                                arrayList8.add(x8Var7);
                                fDp += AndroidUtilities.dp(56.0f);
                                i11++;
                            }
                        }
                    } else {
                        if (TextUtils.isEmpty(lowerCase)) {
                            i14 = i12;
                            z14 = true;
                        } else if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user7 = (TLRPC.User) tLObject;
                            lowerCase4 = AndroidUtilities.translitSafe(UserObject.getUserName(user7)).toLowerCase();
                            if (lowerCase4.startsWith(lowerCase)) {
                                i14 = i12;
                            } else {
                                i14 = i12;
                            }
                            z14 = true;
                        } else {
                            i14 = i12;
                            if (tLObject instanceof TLRPC.Chat) {
                                chat = (TLRPC.Chat) tLObject;
                                lowerCase2 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                                if (!lowerCase2.startsWith(lowerCase)) {
                                    lowerCase3 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                                    if (!lowerCase3.startsWith(lowerCase)) {
                                        arrayList3 = chat.usernames;
                                        if (arrayList3 != null) {
                                            i15 = 0;
                                            while (true) {
                                                if (i15 < arrayList3.size()) {
                                                    tL_username = arrayList3.get(i15);
                                                    if (tL_username.active) {
                                                    }
                                                    i15++;
                                                }
                                            }
                                        }
                                    }
                                }
                                z14 = true;
                            }
                            z14 = false;
                        }
                        if (z14) {
                            if (tLObject instanceof TLRPC.User) {
                                TLRPC.User user8 = (TLRPC.User) tLObject;
                                zContains = arrayList.contains(Long.valueOf(user8.f22527id));
                                if (zContains) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                x8 x8VarI5 = x8.i(user8, zContains, z15);
                                i16 = this.f16249a;
                                if (i16 != 2) {
                                    z16 = true;
                                } else {
                                    z16 = true;
                                }
                                x8VarI5.f17046m = z16;
                                arrayList8.add(x8VarI5);
                                fDp += AndroidUtilities.dp(56.0f);
                                i11++;
                            } else if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat6 = (TLRPC.Chat) tLObject;
                                boolean zContainsKey6 = map.containsKey(Long.valueOf(chat6.f22380id));
                                x8 x8Var8 = new x8(3, true);
                                x8Var8.h = chat6;
                                x8Var8.f17044k = zContainsKey6;
                                int i33 = this.f16249a;
                                x8Var8.f17046m = i33 != 2 || i33 == 4;
                                arrayList8.add(x8Var8);
                                fDp += AndroidUtilities.dp(56.0f);
                                i11++;
                            }
                        }
                    }
                    i12 = i14 + 1;
                }
                if (!z13) {
                    if (i11 == 0) {
                        arrayList8.add(new x8(5, false));
                        fDp += AndroidUtilities.dp(150.0f);
                    }
                    zk0Var = this.f16253f;
                    if (zk0Var != null) {
                        int measuredHeight2 = (zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop()) - zk0Var.getPaddingBottom();
                        if (((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible) {
                            i13 = this.P;
                        } else {
                            i13 = 0;
                        }
                        fDp3 = measuredHeight2 + i13;
                    } else {
                        fDp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                    }
                    f10 = fDp3 - fDp;
                    if (f10 > 0.0f) {
                        x8 x8Var9 = new x8(-1, false);
                        x8Var9.f17049p = (int) f10;
                        arrayList8.add(x8Var9);
                    }
                }
            }
            if (this.h.f5725t) {
                Collections.reverse(arrayList8);
            }
            f9Var = this.f16254n;
            if (f9Var != null) {
                if (z10) {
                    f9Var.l();
                } else {
                    f9Var.l();
                }
            }
            this.f16252e.invalidate();
        }
        this.B = false;
        s3Var.setVisibility(8);
        ArrayList arrayList10 = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getStoriesController().T;
        x8 x8Var10 = new x8(-1, false);
        x8Var10.f17048o = 24;
        arrayList8.add(x8Var10);
        if (q9Var.H) {
            String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
            x8 x8Var11 = new x8(11, false);
            x8Var11.f17039e = string;
            arrayList8.add(x8Var11);
            x8Var10.f17048o = AndroidUtilities.dp(72.0f) + x8Var10.f17048o;
        } else {
            if (q9Var.B && (q9Var.V || arrayList10 == null || arrayList10.size() <= 1)) {
                String string2 = q9Var.V ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(q9Var.G ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
                if (q9Var.G) {
                    pluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
                } else {
                    int i34 = q9Var.M;
                    pluralString = i34 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i34 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
                }
                x8 x8Var12 = new x8(4, false);
                x8Var12.f17039e = string2;
                x8Var12.f17040f = pluralString;
                arrayList8.add(x8Var12);
                x8Var10.f17048o = AndroidUtilities.dp(72.0f) + x8Var10.f17048o;
            } else {
                String string3 = LocaleController.getString(q9Var.G ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
                x8 x8Var13 = new x8(8, false);
                x8Var13.f17039e = string3;
                arrayList8.add(x8Var13);
                x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
                TLRPC.InputPeer inputPeer = q9Var.f16594c;
                if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                    x8 x8VarI6 = x8.i(UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getCurrentUser(), false, false);
                    x8VarI6.f17047n = true;
                    arrayList8.add(x8VarI6);
                    x8Var10.f17048o = AndroidUtilities.dp(62.0f) + x8Var10.f17048o;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                    x8 x8VarI7 = x8.i(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getUser(Long.valueOf(q9Var.f16594c.user_id)), false, false);
                    x8VarI7.f17047n = true;
                    arrayList8.add(x8VarI7);
                    x8Var10.f17048o = AndroidUtilities.dp(62.0f) + x8Var10.f17048o;
                } else {
                    if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                        TLRPC.Chat chat7 = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getChat(Long.valueOf(q9Var.f16594c.channel_id));
                        x8 x8Var14 = new x8(3, true);
                        x8Var14.h = chat7;
                        x8Var14.f17044k = false;
                        x8Var14.f17047n = true;
                        arrayList8.add(x8Var14);
                        zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat7);
                        x8Var10.f17048o = AndroidUtilities.dp(104.0f) + x8Var10.f17048o;
                    } else {
                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat chat8 = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getChat(Long.valueOf(q9Var.f16594c.chat_id));
                            x8 x8Var15 = new x8(3, true);
                            x8Var15.h = chat8;
                            x8Var15.f17044k = false;
                            x8Var15.f17047n = true;
                            arrayList8.add(x8Var15);
                            x8Var10.f17048o = AndroidUtilities.dp(104.0f) + x8Var10.f17048o;
                            zIsChannelAndNotMegaGroup = false;
                        }
                        x8 x8VarG = x8.g(null);
                        if (z21) {
                            i24 = 1;
                        } else {
                            i24 = 2;
                        }
                        x8VarG.f17038c = i24;
                        arrayList8.add(x8VarG);
                        x8Var10.f17048o = AndroidUtilities.dp(12.0f) + x8Var10.f17048o;
                        if (z21) {
                            if (q9Var.G) {
                                i25 = R.string.StoryLivePrivacyWhoCanView;
                            } else {
                                i25 = R.string.StoryPrivacyWhoCanView;
                            }
                            String string4 = LocaleController.getString(i25);
                            x8 x8Var16 = new x8(8, false);
                            x8Var16.f17039e = string4;
                            arrayList8.add(x8Var16);
                            x8Var10.f17048o = AndroidUtilities.dp(40.0f) + x8Var10.f17048o;
                        }
                    }
                    z21 = false;
                    x8 x8VarG2 = x8.g(null);
                    if (z21) {
                        i24 = 1;
                    } else {
                        i24 = 2;
                    }
                    x8VarG2.f17038c = i24;
                    arrayList8.add(x8VarG2);
                    x8Var10.f17048o = AndroidUtilities.dp(12.0f) + x8Var10.f17048o;
                    if (z21) {
                        if (q9Var.G) {
                            i25 = R.string.StoryLivePrivacyWhoCanView;
                        } else {
                            i25 = R.string.StoryPrivacyWhoCanView;
                        }
                        String string5 = LocaleController.getString(i25);
                        x8 x8Var17 = new x8(8, false);
                        x8Var17.f17039e = string5;
                        arrayList8.add(x8Var17);
                        x8Var10.f17048o = AndroidUtilities.dp(40.0f) + x8Var10.f17048o;
                    }
                }
                zIsChannelAndNotMegaGroup = false;
                z21 = true;
                x8 x8VarG3 = x8.g(null);
                if (z21) {
                    i24 = 1;
                } else {
                    i24 = 2;
                }
                x8VarG3.f17038c = i24;
                arrayList8.add(x8VarG3);
                x8Var10.f17048o = AndroidUtilities.dp(12.0f) + x8Var10.f17048o;
                if (z21) {
                    if (q9Var.G) {
                        i25 = R.string.StoryLivePrivacyWhoCanView;
                    } else {
                        i25 = R.string.StoryPrivacyWhoCanView;
                    }
                    String string6 = LocaleController.getString(i25);
                    x8 x8Var18 = new x8(8, false);
                    x8Var18.f17039e = string6;
                    arrayList8.add(x8Var18);
                    x8Var10.f17048o = AndroidUtilities.dp(40.0f) + x8Var10.f17048o;
                }
            }
            if (z21 || q9Var.H) {
                f11 = 80.0f;
            } else {
                x8 x8VarH = x8.h(4, q9Var.f16596f, q9Var.J == 4);
                arrayList8.add(x8VarH);
                x8Var10.f17048o = AndroidUtilities.dp(56.0f) + x8Var10.f17048o;
                f11 = 80.0f;
                if (q9Var.f16596f == 1) {
                    if (arrayList5.size() != 1) {
                        for (ArrayList arrayList11 : q9Var.f16595e.values()) {
                            if (arrayList11.size() >= 1) {
                                x8VarH.f17041g = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getUser((Long) arrayList11.get(0));
                                break;
                            }
                        }
                    } else {
                        x8VarH.f17041g = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getUser((Long) arrayList5.get(0));
                    }
                }
                x8 x8VarH2 = x8.h(2, arrayList6.size(), q9Var.J == 2);
                arrayList8.add(x8VarH2);
                x8Var10.f17048o = AndroidUtilities.dp(56.0f) + x8Var10.f17048o;
                if (arrayList6.size() == 1) {
                    x8VarH2.f17041g = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getUser((Long) arrayList6.get(0));
                }
                ArrayList arrayListJ0 = q9.J0(q9Var);
                x8 x8VarH3 = x8.h(1, arrayListJ0.size(), q9Var.J == 1);
                arrayList8.add(x8VarH3);
                x8Var10.f17048o = AndroidUtilities.dp(56.0f) + x8Var10.f17048o;
                if (arrayListJ0.size() == 1 && (arrayListJ0.get(0) instanceof TLRPC.User)) {
                    x8VarH3.f17041g = (TLRPC.User) arrayListJ0.get(0);
                }
                x8 x8VarH4 = x8.h(3, q9Var.f16599s, q9Var.J == 3);
                arrayList8.add(x8VarH4);
                x8Var10.f17048o = AndroidUtilities.dp(56.0f) + x8Var10.f17048o;
                if (q9Var.f16599s == 1) {
                    if (arrayList4.size() != 1) {
                        for (ArrayList arrayList12 : q9Var.f16598r.values()) {
                            if (arrayList12.size() >= 1) {
                                x8VarH4.f17041g = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getUser((Long) arrayList12.get(0));
                                break;
                            }
                        }
                    } else {
                        x8VarH4.f17041g = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getUser((Long) arrayList4.get(0));
                    }
                }
                int i35 = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getStoriesController().N;
                arrayList8.add(x8.g(AndroidUtilities.replaceSingleTag(i35 <= 0 ? LocaleController.getString(q9Var.G ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(q9Var.G ? "StoryLiveBlockList" : "StoryBlockList", i35, new Object[0]), org.telegram.ui.ActionBar.g6.gc, 0, new z8(this, 3), ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider)));
                x8Var10.f17048o = AndroidUtilities.dp(80.0f) + x8Var10.f17048o;
            }
            if (!q9Var.V) {
                if (q9Var.G && !q9Var.H) {
                    if (q9Var.C) {
                        arrayList8.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                        x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
                        arrayList8.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                        x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
                        arrayList8.add(x8.g(null));
                        x8Var10.f17048o = AndroidUtilities.dp(12.0f) + x8Var10.f17048o;
                    } else {
                        arrayList8.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                        x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
                        arrayList8.add(x8.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                        x8Var10.f17048o = AndroidUtilities.dp(30.0f) + x8Var10.f17048o;
                    }
                }
                if (q9Var.G) {
                    String string7 = LocaleController.getString(R.string.StoryLiveAllowComments);
                    boolean z24 = q9Var.f16600w;
                    x8 x8Var19 = new x8(7, false);
                    x8Var19.f17038c = 2;
                    x8Var19.f17039e = string7;
                    x8Var19.f17044k = z24;
                    arrayList8.add(x8Var19);
                    x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
                }
                if (!q9Var.H) {
                    String string8 = LocaleController.getString(R.string.StoryAllowScreenshots);
                    boolean z25 = q9Var.f16601x;
                    x8 x8Var20 = new x8(7, false);
                    x8Var20.f17038c = 0;
                    x8Var20.f17039e = string8;
                    x8Var20.f17044k = z25;
                    arrayList8.add(x8Var20);
                    x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
                }
                if (!q9Var.G && !q9Var.H) {
                    if (z21) {
                        i28 = R.string.StoryKeep;
                    } else if (zIsChannelAndNotMegaGroup) {
                        i28 = R.string.StoryKeepChannel;
                    } else {
                        i28 = R.string.StoryKeepGroup;
                    }
                    String string9 = LocaleController.getString(i28);
                    boolean z26 = q9Var.f16602y;
                    x8 x8Var21 = new x8(7, false);
                    x8Var21.f17038c = 1;
                    x8Var21.f17039e = string9;
                    x8Var21.f17044k = z26;
                    arrayList8.add(x8Var21);
                    x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
                }
            }
            z22 = q9Var.G;
            str = "StoryKeepGroupInfo";
            if (!z22 || q9Var.H) {
                arrayList8.add(x8.g(null));
                x8Var10.f17048o = AndroidUtilities.dp(12.0f) + x8Var10.f17048o;
            } else if (!q9Var.V && q9Var.A && q9Var.Y != null) {
                if (z22) {
                    pluralString3 = LocaleController.getString(z21 ? R.string.StoryLiveKeepInfo : zIsChannelAndNotMegaGroup ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                } else {
                    String str2 = z21 ? "StoryKeepInfo" : zIsChannelAndNotMegaGroup ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                    int i36 = q9Var.M;
                    if (i36 == Integer.MAX_VALUE) {
                        i36 = 86400;
                    }
                    pluralString3 = LocaleController.formatPluralString(str2, i36 / 3600, new Object[0]);
                }
                arrayList8.add(x8.g(pluralString3));
                x8Var10.f17048o = AndroidUtilities.dp(f11) + x8Var10.f17048o;
            }
            if (q9Var.f16602y || q9Var.G || q9Var.H) {
                x8Var = x8Var10;
            } else {
                TLRPC.InputPeer inputPeer2 = q9Var.f16594c;
                long peerDialogId = inputPeer2 != null ? DialogObject.getPeerDialogId(inputPeer2) : UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getClientUserId();
                q9Var.i1().B(peerDialogId, true);
                StringBuilder sb2 = new StringBuilder();
                if (hashSet.isEmpty()) {
                    sb2.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                    x8Var2 = x8Var10;
                } else {
                    x8Var2 = x8Var10;
                    if (hashSet.size() < 3) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            jh.k6 k6VarB = q9Var.i1().B(peerDialogId, true).b(((Integer) it.next()).intValue());
                            if (k6VarB != null) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(k6VarB.f13589b);
                            }
                            it = it2;
                        }
                    } else {
                        sb2.append(LocaleController.formatPluralString("StoriesAlbumCount", hashSet.size(), new Object[0]));
                    }
                }
                arrayList8.add(x8.b(LocaleController.getString(R.string.StoriesAlbum), sb2, 1));
                x8Var = x8Var2;
                x8Var.f17048o = AndroidUtilities.dp(50.0f) + x8Var.f17048o;
            }
            if (!q9Var.V && ((!q9Var.A || q9Var.Y == null) && !(z23 = q9Var.G) && !q9Var.H)) {
                if (z23) {
                    if (z21) {
                        i27 = R.string.StoryLiveKeepInfo;
                    } else if (zIsChannelAndNotMegaGroup) {
                        i27 = R.string.StoryLiveKeepChannelInfo;
                    } else {
                        i27 = R.string.StoryLiveKeepGroupInfo;
                    }
                    pluralString2 = LocaleController.getString(i27);
                } else {
                    if (z21) {
                        str = "StoryKeepInfo";
                    } else if (zIsChannelAndNotMegaGroup) {
                        str = "StoryKeepChannelInfo";
                    }
                    i26 = q9Var.M;
                    if (i26 == Integer.MAX_VALUE) {
                        i26 = 86400;
                    }
                    pluralString2 = LocaleController.formatPluralString(str, i26 / 3600, new Object[0]);
                }
                arrayList8.add(x8.g(pluralString2));
                x8Var.f17048o = AndroidUtilities.dp(f11) + x8Var.f17048o;
            }
            if (q9Var.f16602y && q9Var.A && q9Var.Y != null) {
                String string10 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable = q9Var.X;
                x8 x8Var22 = new x8(9, false);
                x8Var22.f17039e = string10;
                x8Var22.d = bitmapDrawable;
                x8Var22.f17050q = 0;
                arrayList8.add(x8Var22);
                x8Var.f17048o = AndroidUtilities.dp(50.0f) + x8Var.f17048o;
                arrayList8.add(x8.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                x8Var.f17048o = AndroidUtilities.dp(72.0f) + x8Var.f17048o;
            }
            if (q9Var.H) {
                arrayList8.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                x8Var.f17048o = AndroidUtilities.dp(50.0f) + x8Var.f17048o;
                arrayList8.add(x8.g(null));
                x8Var.f17048o = AndroidUtilities.dp(52.0f) + x8Var.f17048o;
            }
            if (q9Var.G && q9Var.f16600w) {
                String string11 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                x8 x8Var23 = new x8(8, false);
                x8Var23.f17039e = string11;
                arrayList8.add(x8Var23);
                x8Var.f17048o = AndroidUtilities.dp(40.0f) + x8Var.f17048o;
                x8 x8Var24 = new x8(10, false);
                x8Var24.f17050q = 8;
                arrayList8.add(x8Var24);
                x8Var.f17048o = AndroidUtilities.dp(75.0f) + x8Var.f17048o;
                arrayList8.add(x8.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                x8Var.f17048o = AndroidUtilities.dp(50.0f) + x8Var.f17048o;
            }
        }
        zIsChannelAndNotMegaGroup = false;
        z21 = true;
        if (z21) {
            f11 = 80.0f;
        } else {
            f11 = 80.0f;
        }
        if (!q9Var.V) {
            if (q9Var.G) {
                if (q9Var.C) {
                    arrayList8.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                    x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
                    arrayList8.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                    x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
                    arrayList8.add(x8.g(null));
                    x8Var10.f17048o = AndroidUtilities.dp(12.0f) + x8Var10.f17048o;
                } else {
                    arrayList8.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                    x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
                    arrayList8.add(x8.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                    x8Var10.f17048o = AndroidUtilities.dp(30.0f) + x8Var10.f17048o;
                }
            }
            if (q9Var.G) {
                String string12 = LocaleController.getString(R.string.StoryLiveAllowComments);
                boolean z27 = q9Var.f16600w;
                x8 x8Var110 = new x8(7, false);
                x8Var110.f17038c = 2;
                x8Var110.f17039e = string12;
                x8Var110.f17044k = z27;
                arrayList8.add(x8Var110);
                x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
            }
            if (!q9Var.H) {
                String string13 = LocaleController.getString(R.string.StoryAllowScreenshots);
                boolean z28 = q9Var.f16601x;
                x8 x8Var25 = new x8(7, false);
                x8Var25.f17038c = 0;
                x8Var25.f17039e = string13;
                x8Var25.f17044k = z28;
                arrayList8.add(x8Var25);
                x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
            }
            if (!q9Var.G) {
                if (z21) {
                    i28 = R.string.StoryKeep;
                } else if (zIsChannelAndNotMegaGroup) {
                    i28 = R.string.StoryKeepChannel;
                } else {
                    i28 = R.string.StoryKeepGroup;
                }
                String string14 = LocaleController.getString(i28);
                boolean z29 = q9Var.f16602y;
                x8 x8Var26 = new x8(7, false);
                x8Var26.f17038c = 1;
                x8Var26.f17039e = string14;
                x8Var26.f17044k = z29;
                arrayList8.add(x8Var26);
                x8Var10.f17048o = AndroidUtilities.dp(50.0f) + x8Var10.f17048o;
            }
        }
        z22 = q9Var.G;
        str = "StoryKeepGroupInfo";
        if (z22) {
            arrayList8.add(x8.g(null));
            x8Var10.f17048o = AndroidUtilities.dp(12.0f) + x8Var10.f17048o;
        } else {
            arrayList8.add(x8.g(null));
            x8Var10.f17048o = AndroidUtilities.dp(12.0f) + x8Var10.f17048o;
        }
        if (q9Var.f16602y) {
            x8Var = x8Var10;
        } else {
            x8Var = x8Var10;
        }
        if (!q9Var.V) {
            if (z23) {
                if (z21) {
                    i27 = R.string.StoryLiveKeepInfo;
                } else if (zIsChannelAndNotMegaGroup) {
                    i27 = R.string.StoryLiveKeepChannelInfo;
                } else {
                    i27 = R.string.StoryLiveKeepGroupInfo;
                }
                pluralString2 = LocaleController.getString(i27);
            } else {
                if (z21) {
                    str = "StoryKeepInfo";
                } else if (zIsChannelAndNotMegaGroup) {
                    str = "StoryKeepChannelInfo";
                }
                i26 = q9Var.M;
                if (i26 == Integer.MAX_VALUE) {
                    i26 = 86400;
                }
                pluralString2 = LocaleController.formatPluralString(str, i26 / 3600, new Object[0]);
            }
            arrayList8.add(x8.g(pluralString2));
            x8Var.f17048o = AndroidUtilities.dp(f11) + x8Var.f17048o;
        }
        if (q9Var.f16602y) {
            String string15 = LocaleController.getString(R.string.StoryEditCover);
            BitmapDrawable bitmapDrawable2 = q9Var.X;
            x8 x8Var27 = new x8(9, false);
            x8Var27.f17039e = string15;
            x8Var27.d = bitmapDrawable2;
            x8Var27.f17050q = 0;
            arrayList8.add(x8Var27);
            x8Var.f17048o = AndroidUtilities.dp(50.0f) + x8Var.f17048o;
            arrayList8.add(x8.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
            x8Var.f17048o = AndroidUtilities.dp(72.0f) + x8Var.f17048o;
        }
        if (q9Var.H) {
            arrayList8.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
            x8Var.f17048o = AndroidUtilities.dp(50.0f) + x8Var.f17048o;
            arrayList8.add(x8.g(null));
            x8Var.f17048o = AndroidUtilities.dp(52.0f) + x8Var.f17048o;
        }
        if (q9Var.G) {
            String string16 = LocaleController.getString(R.string.LiveStoryPricePerComment);
            x8 x8Var28 = new x8(8, false);
            x8Var28.f17039e = string16;
            arrayList8.add(x8Var28);
            x8Var.f17048o = AndroidUtilities.dp(40.0f) + x8Var.f17048o;
            x8 x8Var29 = new x8(10, false);
            x8Var29.f17050q = 8;
            arrayList8.add(x8Var29);
            x8Var.f17048o = AndroidUtilities.dp(75.0f) + x8Var.f17048o;
            arrayList8.add(x8.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
            x8Var.f17048o = AndroidUtilities.dp(50.0f) + x8Var.f17048o;
        }
        fDp = 0.0f;
        zIsEmpty = TextUtils.isEmpty(this.E);
        if (this.f16249a != 0) {
            lowerCase = AndroidUtilities.translitSafe(this.E).toLowerCase();
            i10 = this.f16249a;
            if (i10 == 5) {
                arrayListZ0 = q9.Y0(q9Var);
            } else {
                if (i10 != 1) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (q9Var.U) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                arrayListZ0 = q9.Z0(q9Var, z11, z12);
            }
            arrayList = this.f16251c;
            map = this.d;
            HashSet hashSetL3 = q9.l1(arrayList, map);
            arrayList2 = this.F;
            if (zIsEmpty) {
                if (!z10) {
                    arrayList2.clear();
                    i23 = 0;
                    while (i23 < arrayListZ0.size()) {
                        tLObject3 = (TLObject) arrayListZ0.get(i23);
                        if (tLObject3 instanceof TLRPC.User) {
                            z20 = zIsEmpty;
                            zContainsKey = arrayList.contains(Long.valueOf(((TLRPC.User) tLObject3).f22527id));
                        } else {
                            z20 = zIsEmpty;
                            if (tLObject3 instanceof TLRPC.Chat) {
                                zContainsKey = map.containsKey(Long.valueOf(((TLRPC.Chat) tLObject3).f22380id));
                            } else {
                                zContainsKey = false;
                            }
                        }
                        if (zContainsKey) {
                            arrayList2.add(tLObject3);
                        }
                        i23++;
                        zIsEmpty = z20;
                    }
                }
                z13 = zIsEmpty;
                i17 = 0;
                i18 = 0;
                while (i17 < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i17);
                    if (tLObject2 instanceof TLRPC.User) {
                        TLRPC.User user9 = (TLRPC.User) tLObject2;
                        zContains2 = arrayList.contains(Long.valueOf(user9.f22527id));
                        i19 = i17;
                        i20 = i18;
                        if (zContains2) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        x8 x8VarI8 = x8.i(user9, zContains2, z18);
                        i22 = this.f16249a;
                        if (i22 != 2) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        x8VarI8.f17046m = z19;
                        arrayList8.add(x8VarI8);
                        fDp += AndroidUtilities.dp(56.0f);
                    } else {
                        i19 = i17;
                        i20 = i18;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat9 = (TLRPC.Chat) tLObject2;
                            boolean zContainsKey7 = map.containsKey(Long.valueOf(chat9.f22380id));
                            float f14 = fDp;
                            x8 x8Var30 = new x8(3, true);
                            x8Var30.h = chat9;
                            x8Var30.f17044k = zContainsKey7;
                            i21 = this.f16249a;
                            if (i21 != 2) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            x8Var30.f17046m = z17;
                            arrayList8.add(x8Var30);
                            fDp = f14 + AndroidUtilities.dp(56.0f);
                        } else {
                            i18 = i20;
                        }
                        i17 = i19 + 1;
                    }
                    i18 = i20 + 1;
                    i17 = i19 + 1;
                }
                i11 = i18;
            } else {
                z13 = zIsEmpty;
                i11 = 0;
            }
            i12 = 0;
            while (i12 < arrayListZ0.size()) {
                tLObject = (TLObject) arrayListZ0.get(i12);
                if (z13) {
                    if (TextUtils.isEmpty(lowerCase)) {
                        i14 = i12;
                        z14 = true;
                    } else if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user10 = (TLRPC.User) tLObject;
                        lowerCase4 = AndroidUtilities.translitSafe(UserObject.getUserName(user10)).toLowerCase();
                        if (lowerCase4.startsWith(lowerCase)) {
                            i14 = i12;
                        } else {
                            i14 = i12;
                        }
                        z14 = true;
                    } else {
                        i14 = i12;
                        if (tLObject instanceof TLRPC.Chat) {
                            chat = (TLRPC.Chat) tLObject;
                            lowerCase2 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                            if (!lowerCase2.startsWith(lowerCase)) {
                                lowerCase3 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                                if (!lowerCase3.startsWith(lowerCase)) {
                                    arrayList3 = chat.usernames;
                                    if (arrayList3 != null) {
                                        i15 = 0;
                                        while (true) {
                                            if (i15 < arrayList3.size()) {
                                                tL_username = arrayList3.get(i15);
                                                if (tL_username.active) {
                                                }
                                                i15++;
                                            }
                                        }
                                    }
                                }
                            }
                            z14 = true;
                        }
                        z14 = false;
                    }
                    if (z14) {
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user11 = (TLRPC.User) tLObject;
                            zContains = arrayList.contains(Long.valueOf(user11.f22527id));
                            if (zContains) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            x8 x8VarI9 = x8.i(user11, zContains, z15);
                            i16 = this.f16249a;
                            if (i16 != 2) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            x8VarI9.f17046m = z16;
                            arrayList8.add(x8VarI9);
                            fDp += AndroidUtilities.dp(56.0f);
                            i11++;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat10 = (TLRPC.Chat) tLObject;
                            boolean zContainsKey8 = map.containsKey(Long.valueOf(chat10.f22380id));
                            x8 x8Var31 = new x8(3, true);
                            x8Var31.h = chat10;
                            x8Var31.f17044k = zContainsKey8;
                            int i37 = this.f16249a;
                            x8Var31.f17046m = i37 != 2 || i37 == 4;
                            arrayList8.add(x8Var31);
                            fDp += AndroidUtilities.dp(56.0f);
                            i11++;
                        }
                    }
                } else {
                    if (TextUtils.isEmpty(lowerCase)) {
                        i14 = i12;
                        z14 = true;
                    } else if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user12 = (TLRPC.User) tLObject;
                        lowerCase4 = AndroidUtilities.translitSafe(UserObject.getUserName(user12)).toLowerCase();
                        if (lowerCase4.startsWith(lowerCase)) {
                            i14 = i12;
                        } else {
                            i14 = i12;
                        }
                        z14 = true;
                    } else {
                        i14 = i12;
                        if (tLObject instanceof TLRPC.Chat) {
                            chat = (TLRPC.Chat) tLObject;
                            lowerCase2 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                            if (!lowerCase2.startsWith(lowerCase)) {
                                lowerCase3 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                                if (!lowerCase3.startsWith(lowerCase)) {
                                    arrayList3 = chat.usernames;
                                    if (arrayList3 != null) {
                                        i15 = 0;
                                        while (true) {
                                            if (i15 < arrayList3.size()) {
                                                tL_username = arrayList3.get(i15);
                                                if (tL_username.active) {
                                                }
                                                i15++;
                                            }
                                        }
                                    }
                                }
                            }
                            z14 = true;
                        }
                        z14 = false;
                    }
                    if (z14) {
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user13 = (TLRPC.User) tLObject;
                            zContains = arrayList.contains(Long.valueOf(user13.f22527id));
                            if (zContains) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            x8 x8VarI10 = x8.i(user13, zContains, z15);
                            i16 = this.f16249a;
                            if (i16 != 2) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            x8VarI10.f17046m = z16;
                            arrayList8.add(x8VarI10);
                            fDp += AndroidUtilities.dp(56.0f);
                            i11++;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat11 = (TLRPC.Chat) tLObject;
                            boolean zContainsKey9 = map.containsKey(Long.valueOf(chat11.f22380id));
                            x8 x8Var32 = new x8(3, true);
                            x8Var32.h = chat11;
                            x8Var32.f17044k = zContainsKey9;
                            int i38 = this.f16249a;
                            x8Var32.f17046m = i38 != 2 || i38 == 4;
                            arrayList8.add(x8Var32);
                            fDp += AndroidUtilities.dp(56.0f);
                            i11++;
                        }
                    }
                }
                i12 = i14 + 1;
            }
            if (!z13) {
                if (i11 == 0) {
                    arrayList8.add(new x8(5, false));
                    fDp += AndroidUtilities.dp(150.0f);
                }
                zk0Var = this.f16253f;
                if (zk0Var != null) {
                    int measuredHeight3 = (zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop()) - zk0Var.getPaddingBottom();
                    if (((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible) {
                        i13 = this.P;
                    } else {
                        i13 = 0;
                    }
                    fDp3 = measuredHeight3 + i13;
                } else {
                    fDp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                }
                f10 = fDp3 - fDp;
                if (f10 > 0.0f) {
                    x8 x8Var33 = new x8(-1, false);
                    x8Var33.f17049p = (int) f10;
                    arrayList8.add(x8Var33);
                }
            }
        }
        if (this.h.f5725t) {
            Collections.reverse(arrayList8);
        }
        f9Var = this.f16254n;
        if (f9Var != null) {
            if (z10) {
                f9Var.l();
            } else {
                f9Var.l();
            }
        }
        this.f16252e.invalidate();
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.s3 s3Var = this.f16259y;
        if (s3Var == null) {
            return;
        }
        if (q9.l1(this.f16251c, this.d).size() > 0) {
            s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new y8(this, 2));
            return;
        }
        if (z10) {
            s3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.r3 r3Var = s3Var.f25628b;
        r3Var.c(null, false, true);
        r3Var.setOnClickListener(null);
        r3Var.setVisibility(0);
    }

    public final void i(boolean z10) {
        c9 c9Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        HashSet<Long> hashSetL1 = q9.l1(this.f16251c, this.d);
        int i10 = this.f16249a;
        q9 q9Var = this.S;
        if (i10 == 3) {
            q9Var.f16599s = hashSetL1.size();
        } else if (i10 == 4) {
            q9Var.f16596f = hashSetL1.size();
        }
        MessagesController messagesController = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            c9Var = this.f16258x;
            ArrayList arrayList4 = c9Var.d;
            arrayList = c9Var.d;
            if (i12 >= arrayList4.size()) {
                break;
            }
            a30 a30Var = (a30) arrayList.get(i12);
            if (!hashSetL1.contains(Long.valueOf(a30Var.getUid()))) {
                arrayList2.add(a30Var);
            }
            i12++;
        }
        for (Long l10 : hashSetL1) {
            long jLongValue = l10.longValue();
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    Object user = jLongValue >= 0 ? messagesController.getUser(l10) : messagesController.getChat(l10);
                    if (user != null) {
                        a30 a30Var2 = new a30(getContext(), user, null, true, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider);
                        a30Var2.setOnClickListener(this);
                        arrayList3.add(a30Var2);
                        break;
                    }
                    break;
                }
                if (((a30) arrayList.get(i13)).getUid() == jLongValue) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        gg.k kVar = c9Var.f16442c;
        ArrayList arrayList5 = kVar.f7103e;
        ArrayList arrayList6 = kVar.d;
        ArrayList arrayList7 = kVar.f7104f;
        n9 n9Var = (n9) kVar.f7105n;
        n9Var.C = true;
        ArrayList arrayList8 = n9Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = kVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((a30) arrayList2.get(i14)).setOnClickListener(null);
        }
        kVar.c();
        if (z10) {
            kVar.f7102c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            kVar.f7101b = animatorSet;
            animatorSet.addListener(new m9(kVar, arrayList2, i11));
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
                a30 a30Var3 = (a30) arrayList2.get(i15);
                arrayList5.add(a30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                a30 a30Var4 = (a30) arrayList3.get(i16);
                arrayList6.add(a30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                kVar.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            kVar.f7101b = null;
            kVar.f7102c = false;
            n9Var.f16440a.setAllowDrawCursor(true);
        }
        while (i11 < arrayList3.size()) {
            kVar.addView((View) arrayList3.get(i11));
            i11++;
        }
        kVar.requestLayout();
    }

    public final void j() {
        float fC = c();
        boolean z10 = this.I;
        int i10 = 8;
        boolean z11 = false;
        c9 c9Var = this.f16258x;
        if (z10 || this.Q || getTranslationX() != 0.0f) {
            this.J = false;
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            c9Var.setTranslationY(fC);
        } else if (!this.J || Math.abs(this.K - fC) > 1.0f) {
            this.J = true;
            ValueAnimator valueAnimator2 = this.L;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.L = null;
            }
            float translationY = c9Var.getTranslationY();
            this.K = fC;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, fC);
            this.L = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new m2(this, i10));
            this.L.addListener(new ag.r1(this, 29));
            this.L.setInterpolator(new LinearInterpolator());
            this.L.setDuration(180L);
            this.L.start();
        }
        boolean z12 = this.B;
        w8 w8Var = this.A;
        if (!z12) {
            w8Var.setVisibility(8);
            return;
        }
        w8Var.setVisibility(0);
        float paddingTop = -w8Var.getHeight();
        int i11 = 0;
        while (true) {
            zk0 zk0Var = this.f16253f;
            if (i11 >= zk0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = zk0Var.getChildAt(i11);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                paddingTop = this.f16252e.getPaddingTop() + childAt.getY();
                break;
            }
            i11++;
        }
        if (this.M != z11) {
            this.M = z11;
            ((org.telegram.ui.ActionBar.g2) w8Var.f17016e).c((z11 || this.f16249a != 0) ? 0.0f : 1.0f, true);
        }
        w8Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, paddingTop));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(((org.telegram.ui.ActionBar.e3) this.S).currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onClick(View view) {
        c9 c9Var = this.f16258x;
        if (!c9Var.d.contains(view)) {
            return;
        }
        a30 a30Var = (a30) view;
        if (!a30Var.f26618y) {
            a30 a30Var2 = c9Var.f16443e;
            if (a30Var2 != null) {
                a30Var2.a();
                c9Var.f16443e = null;
            }
            c9Var.f16443e = a30Var;
            a30Var.b();
            return;
        }
        c9Var.f16443e = null;
        gg.k kVar = c9Var.f16442c;
        n9 n9Var = (n9) kVar.f7105n;
        n9Var.C = true;
        n9Var.d.remove(a30Var);
        a30Var.setOnClickListener(null);
        kVar.c();
        kVar.f7102c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        kVar.f7101b = animatorSet;
        animatorSet.addListener(new ag.x1(9, kVar, a30Var));
        ArrayList arrayList = kVar.h;
        arrayList.clear();
        arrayList.add(a30Var);
        ArrayList arrayList2 = kVar.d;
        arrayList2.clear();
        kVar.f7103e.clear();
        arrayList2.add(a30Var);
        ArrayList arrayList3 = kVar.f7104f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
        kVar.requestLayout();
        long uid = a30Var.getUid();
        Iterator it = this.d.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList4 = this.f16251c;
            if (!zHasNext) {
                arrayList4.remove(Long.valueOf(uid));
                f(true);
                e(true);
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                    it.remove();
                    arrayList4.addAll((Collection) entry.getValue());
                    arrayList4.remove(Long.valueOf(uid));
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(((org.telegram.ui.ActionBar.e3) this.S).currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        q9 q9Var = this.S;
        if (((org.telegram.ui.ActionBar.e3) q9Var).keyboardHeight > 0) {
            this.P = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardHeight;
        }
        super.onMeasure(i10, i11);
        this.f16252e.setPadding(0, AndroidUtilities.statusBarHeight + (this.f16249a == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
        boolean z10 = this.R;
        boolean z11 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
        zk0 zk0Var = this.f16253f;
        i9 i9Var = this.f16255r;
        if (z10 != z11) {
            float fC = c();
            int i12 = 2;
            if (((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible && fC + Math.min(AndroidUtilities.dp(150.0f), this.f16258x.F) > zk0Var.getPaddingTop()) {
                sh.n nVar = new sh.n(getContext(), 2, 0.7f);
                nVar.f5731a = 1;
                nVar.f47990p = -AndroidUtilities.dp(56.0f);
                this.h.w0(nVar);
            }
            int i13 = this.f16249a;
            View view = this.f16256s;
            if (i13 == 0) {
                i9Var.setTranslationY(((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible ? this.P : 0.0f);
                view.setTranslationY(((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible ? this.P : 0.0f);
            } else {
                float f10 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible ? this.P : -this.P;
                ValueAnimator valueAnimator = i9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    i9Var.d = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                i9Var.d = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new g9(i9Var, 1));
                i9Var.d.addListener(new h9(i9Var, 0));
                i9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = i9Var.d;
                er erVar = org.telegram.ui.ActionBar.p1.f23706w;
                valueAnimator2.setInterpolator(erVar);
                i9Var.d.start();
                view.setTranslationY(((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible ? this.P : -this.P);
                this.Q = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(erVar).withEndAction(new z8(this, i12)).start();
            }
            this.R = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
        }
        zk0Var.setPadding(0, 0, 0, i9Var.getMeasuredHeight());
    }
}
