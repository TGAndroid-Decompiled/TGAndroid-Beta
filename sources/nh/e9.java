package nh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t41;
public final class e9 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int Z = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final ArrayList F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public HashMap L;
    public int M;
    public final Paint N;
    public ArrayList O;
    public j8 P;
    public Utilities.Callback Q;
    public p8 R;
    public Utilities.Callback S;
    public h9 T;
    public final boolean U;
    public boolean V;
    public boolean W;
    public BitmapDrawable X;
    public g9 Y;
    public g1 f17603b;
    public TLRPC.InputPeer f17604c;
    public final ArrayList d;
    public final HashMap f17605e;
    public int f17606f;
    public final ArrayList h;
    public final ArrayList f17607n;
    public final HashMap f17608r;
    public int f17609s;
    public final HashSet v;
    public boolean f17610w;
    public boolean f17611x;
    public boolean f17612y;

    public e9(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true, false);
        char c3 = 0;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        HashMap hashMap = new HashMap();
        this.f17605e = hashMap;
        this.f17606f = 0;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f17607n = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.f17608r = hashMap2;
        this.f17609s = 0;
        this.v = new HashSet();
        this.f17610w = true;
        this.f17611x = true;
        this.f17612y = false;
        this.A = true;
        this.B = true;
        this.C = false;
        this.D = 0;
        this.E = 1;
        this.F = new ArrayList();
        this.I = 1;
        this.J = 4;
        this.L = new HashMap();
        this.M = 86400;
        this.N = new Paint(1);
        this.U = true;
        this.V = false;
        this.M = i10;
        String string = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_contacts", null);
        if (string != null) {
            String[] split = string.split(",");
            arrayList3.clear();
            for (String str : split) {
                try {
                    arrayList3.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        String string2 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i11 = 0;
            while (i11 < split2.length) {
                String[] split3 = split2[i11].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c3]);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i12 = 1; i12 < split3.length; i12++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i12])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i11++;
                    c3 = 0;
                }
                i11++;
                c3 = 0;
            }
        }
        String string3 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] split4 = string3.split(",");
            arrayList.clear();
            for (String str2 : split4) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (String str3 : split5) {
                String[] split6 = str3.split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (int i13 = 1; i13 < split6.length; i13++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[i13])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] split7 = string5.split(",");
            arrayList2.clear();
            for (String str4 : split7) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(str4)));
                } catch (Exception unused5) {
                }
            }
        }
        this.f17609s = l1(arrayList3, hashMap2).size();
        this.f17606f = l1(arrayList, hashMap).size();
        this.f17611x = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", false);
        this.f17612y = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", true);
        j1(context);
        this.f17603b.setAdapter(new c8(this, context, 0));
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new b6(11, this, messagesStorage));
        MessagesController.getInstance(this.currentAccount).getStoriesController().P();
        MessagesController.getInstance(this.currentAccount).getStoriesController().R();
    }

    public static void D(e9 e9Var) {
        super.dismiss();
    }

    public static int F(e9 e9Var) {
        return e9Var.currentAccount;
    }

    public static int G(e9 e9Var) {
        return e9Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.c6 H(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 I(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    public static int J(e9 e9Var) {
        return e9Var.currentAccount;
    }

    public static ArrayList J0(e9 e9Var) {
        ArrayList h12 = e9Var.h1();
        int i10 = 0;
        while (i10 < h12.size()) {
            TLObject tLObject = (TLObject) h12.get(i10);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                h12.remove(i10);
                i10--;
            }
            i10++;
        }
        return h12;
    }

    public static int K(e9 e9Var) {
        return e9Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.c6 L(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    public static int M(e9 e9Var) {
        return e9Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.c6 O(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 P(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 R(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 S(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 T(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 U(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    public static int V(e9 e9Var) {
        return e9Var.currentAccount;
    }

    public static int W(e9 e9Var) {
        return e9Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.c6 X(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    public static ArrayList Y0(e9 e9Var) {
        TLRPC.Chat chat;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(e9Var.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (messagesController.canAddToForward(dialog)) {
                if (DialogObject.isUserDialog(dialog.f22396id)) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(dialog.f22396id));
                    if (user != null && !user.bot && user.f22539id != 777000 && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else if (DialogObject.isChatDialog(dialog.f22396id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f22396id))) != null && !ChatObject.isForum(chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public static int Z(e9 e9Var) {
        return e9Var.currentAccount;
    }

    public static ArrayList Z0(e9 e9Var, boolean z10, boolean z11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(e9Var.currentAccount);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(e9Var.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!e9Var.W) {
                ContactsController.getInstance(e9Var.currentAccount).loadContacts(false, 0L);
            }
            e9Var.W = true;
        }
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (DialogObject.isUserDialog(dialog.f22396id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.f22396id));
                if (user2 != null && !user2.bot && user2.f22539id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z10 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.f22539id)) != null))) {
                    hashMap.put(Long.valueOf(user2.f22539id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z11 && DialogObject.isChatDialog(dialog.f22396id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f22396id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                hashMap.put(Long.valueOf(-chat.f22392id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            for (Map.Entry<Long, TLRPC.TL_contact> entry : concurrentHashMap.entrySet()) {
                Long key = entry.getKey();
                key.getClass();
                if (!hashMap.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.f22539id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    hashMap.put(Long.valueOf(user.f22539id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public static int b0(e9 e9Var) {
        return e9Var.currentAccount;
    }

    public static int b1(e9 e9Var) {
        return e9Var.currentAccount;
    }

    public static ViewGroup c0(e9 e9Var) {
        return e9Var.containerView;
    }

    public static boolean d0(e9 e9Var) {
        return e9Var.keyboardVisible;
    }

    public static int d1(e9 e9Var, TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(e9Var.currentAccount).getChatFull(chat.f22392id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = e9Var.L;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.f22392id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public static HashSet l1(ArrayList arrayList, HashMap hashMap) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        if (hashMap != null) {
            for (ArrayList arrayList2 : hashMap.values()) {
                hashSet.addAll(arrayList2);
            }
        }
        return hashSet;
    }

    public static org.telegram.ui.ActionBar.c6 r0(e9 e9Var) {
        return e9Var.resourcesProvider;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f17603b.getCurrentView();
        if (currentView instanceof y8) {
            return ((y8) currentView).O;
        }
        return true;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g1 g1Var = this.f17603b;
        if (g1Var != null) {
            int i12 = 0;
            if (i10 == NotificationCenter.contactsDidLoad) {
                View[] viewPages = g1Var.getViewPages();
                View view = viewPages[0];
                if (view instanceof y8) {
                    ((y8) view).g(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof y8) {
                    ((y8) view2).g(true);
                }
            } else if (i10 == NotificationCenter.storiesBlocklistUpdate) {
                View[] viewPages2 = g1Var.getViewPages();
                while (i12 < viewPages2.length) {
                    View view3 = viewPages2[i12];
                    if (view3 instanceof y8) {
                        y8 y8Var = (y8) view3;
                        int i13 = y8Var.f18901a;
                        if (i13 == 6) {
                            y8Var.a(true);
                        } else if (i13 == 0) {
                            y8Var.g(true);
                        }
                    }
                    i12++;
                }
            } else if (i10 == NotificationCenter.storiesSendAsUpdate) {
                View[] viewPages3 = g1Var.getViewPages();
                while (i12 < viewPages3.length) {
                    View view4 = viewPages3[i12];
                    if (view4 instanceof y8) {
                        y8 y8Var2 = (y8) view4;
                        if (y8Var2.f18901a == 0) {
                            y8Var2.g(true);
                        }
                    }
                    i12++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        c9 c9Var;
        Utilities.Callback callback = this.Q;
        ArrayList arrayList = this.h;
        HashMap hashMap = this.f17605e;
        ArrayList arrayList2 = this.d;
        HashMap hashMap2 = this.f17608r;
        ArrayList arrayList3 = this.f17607n;
        if (callback != null) {
            int i10 = this.J;
            if (i10 == 3) {
                c9Var = new c9(this.J, this.currentAccount, new ArrayList(l1(arrayList3, hashMap2)));
                ArrayList arrayList4 = c9Var.f17483c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = c9Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i10 == 4) {
                c9Var = new c9(this.J, this.currentAccount, new ArrayList(l1(arrayList2, hashMap)));
                ArrayList arrayList5 = c9Var.f17483c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = c9Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else if (i10 == 2) {
                c9Var = new c9(i10, this.currentAccount, arrayList);
            } else {
                c9Var = new c9(i10, this.currentAccount, (ArrayList) null);
            }
            this.Q.run(c9Var);
            this.Q = null;
        }
        mc.h(this.container);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (sb3.length() > 0) {
                sb3.append(";");
            }
            sb3.append(entry2.getKey());
            sb3.append(",");
            sb3.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f17611x).putBoolean("story_keep", this.f17612y).apply();
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
        super.dismissInternal();
    }

    public final void e1(boolean z10) {
        View[] viewPages;
        this.A = z10;
        g1 g1Var = this.f17603b;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof y8) {
                    ((y8) view).e(false);
                }
            }
        }
    }

    public final void f1() {
        View[] viewPages;
        r8 r8Var;
        for (View view : this.f17603b.getViewPages()) {
            if ((view instanceof y8) && (r8Var = ((y8) view).f18910x) != null) {
                AndroidUtilities.hideKeyboard(r8Var.f17430a);
            }
        }
    }

    public final void g1(c9 c9Var, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.O != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                String str = (String) this.O.get(i10);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.f22539id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !c9Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        d dVar = null;
        if (!arrayList.isEmpty() && !z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < Math.min(2, arrayList.size()); i11++) {
                if (i11 > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i11)));
                spannableString.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.StoryRestrictions);
            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder);
            alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new androidx.car.app.utils.a(this, c9Var, runnable, 12));
            j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
            return;
        }
        View view = this.f17603b.getViewPages()[0];
        if (view instanceof y8) {
            dVar = ((y8) view).v;
        }
        if (dVar != null) {
            dVar.setLoading(true);
        }
        j8 j8Var = this.P;
        if (j8Var != null) {
            j8Var.e(c9Var, this.f17610w, this.f17611x, this.f17612y, this.C, this.f17604c, this.D, new b6(13, dVar, runnable), new m6(dVar, 2));
        } else {
            runnable.run();
        }
    }

    public final ArrayList h1() {
        TLRPC.User user;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(this.currentAccount).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(this.currentAccount).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i10);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.f22539id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final lh.s6 i1() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public final void j1(Context context) {
        mc.a(this.container, new eg.x(4));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        this.N.setColor(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider));
        this.containerView = new i8(this, context);
        g1 g1Var = new g1(this, context, 1);
        this.f17603b = g1Var;
        int i11 = this.backgroundPaddingLeft;
        g1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.f17603b, i7.f6.e(-1, -1, 119));
    }

    public final void k1(boolean z10) {
        View[] viewPages;
        this.V = z10;
        g1 g1Var = this.f17603b;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof y8) {
                    y8 y8Var = (y8) view;
                    y8Var.g(false);
                    y8Var.e(false);
                }
            }
        }
    }

    public final void m1(int i10) {
        View[] viewPages;
        this.E = i10;
        g1 g1Var = this.f17603b;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof y8) {
                    ((y8) view).e(false);
                }
            }
        }
    }

    public final void n1(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        View[] viewPages;
        if (bitmap == null) {
            bitmapDrawable = null;
        } else {
            bitmapDrawable = new BitmapDrawable(bitmap);
        }
        this.X = bitmapDrawable;
        g1 g1Var = this.f17603b;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof y8) {
                    y8 y8Var = (y8) view;
                    y8Var.g(false);
                    y8Var.e(false);
                }
            }
        }
    }

    public final void o1() {
        this.G = true;
        View[] viewPages = this.f17603b.getViewPages();
        View view = viewPages[0];
        if (view instanceof y8) {
            y8 y8Var = (y8) view;
            y8Var.b(y8Var.f18901a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof y8) {
            y8 y8Var2 = (y8) view2;
            y8Var2.b(y8Var2.f18901a);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f17603b.getCurrentPosition() > 0) {
            f1();
            g1 g1Var = this.f17603b;
            g1Var.D(g1Var.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    public final void p1(TLRPC.InputPeer inputPeer) {
        this.f17604c = inputPeer;
        this.v.clear();
        View[] viewPages = this.f17603b.getViewPages();
        View view = viewPages[0];
        if (view instanceof y8) {
            y8 y8Var = (y8) view;
            y8Var.b(y8Var.f18901a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof y8) {
            y8 y8Var2 = (y8) view2;
            y8Var2.b(y8Var2.f18901a);
        }
    }

    public final void q1(c9 c9Var) {
        if (c9Var != null) {
            HashMap hashMap = c9Var.d;
            int i10 = c9Var.f17481a;
            ArrayList arrayList = c9Var.f17483c;
            this.J = i10;
            if (i10 == 2) {
                ArrayList arrayList2 = this.h;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i10 == 3) {
                ArrayList arrayList3 = this.f17607n;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.f17608r;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.f17609s = l1(arrayList3, hashMap2).size();
            } else if (i10 == 4) {
                ArrayList arrayList4 = this.d;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.f17605e;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.f17606f = l1(arrayList4, hashMap3).size();
            }
            if (i10 == 5) {
                this.K = true;
                this.I = 5;
                ArrayList arrayList5 = this.F;
                arrayList5.clear();
                arrayList5.addAll(c9Var.f17485f);
                this.f17603b.setPosition(1);
            }
            View[] viewPages = this.f17603b.getViewPages();
            View view = viewPages[0];
            if (view instanceof y8) {
                y8 y8Var = (y8) view;
                y8Var.b(y8Var.f18901a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof y8) {
                y8 y8Var2 = (y8) view2;
                y8Var2.b(y8Var2.f18901a);
            }
        }
    }

    public e9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true, false);
        this.d = new ArrayList();
        this.f17605e = new HashMap();
        this.f17606f = 0;
        this.h = new ArrayList();
        this.f17607n = new ArrayList();
        this.f17608r = new HashMap();
        this.f17609s = 0;
        this.v = new HashSet();
        this.f17610w = true;
        this.f17611x = true;
        this.f17612y = false;
        this.A = true;
        this.B = true;
        this.C = false;
        this.D = 0;
        this.E = 1;
        this.F = new ArrayList();
        this.I = 1;
        this.J = 4;
        this.L = new HashMap();
        this.M = 86400;
        this.N = new Paint(1);
        this.U = true;
        this.V = false;
        j1(context);
        this.f17603b.setAdapter(new c8(this, context, 1));
    }
}
