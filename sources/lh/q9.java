package lh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
import org.telegram.ui.Components.k41;

public final class q9 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
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
    public u8 P;
    public Utilities.Callback Q;
    public a9 R;
    public Utilities.Callback S;
    public t9 T;
    public final boolean U;
    public boolean V;
    public boolean W;
    public BitmapDrawable X;
    public s9 Y;

    public h1 f16593b;

    public TLRPC.InputPeer f16594c;
    public final ArrayList d;

    public final HashMap f16595e;

    public int f16596f;
    public final ArrayList h;

    public final ArrayList f16597n;

    public final HashMap f16598r;

    public int f16599s;
    public final HashSet v;

    public boolean f16600w;

    public boolean f16601x;

    public boolean f16602y;

    public q9(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true, false);
        char c10 = 0;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        HashMap map = new HashMap();
        this.f16595e = map;
        this.f16596f = 0;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f16597n = arrayList3;
        HashMap map2 = new HashMap();
        this.f16598r = map2;
        this.f16599s = 0;
        this.v = new HashSet();
        this.f16600w = true;
        this.f16601x = true;
        this.f16602y = false;
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
            String[] strArrSplit = string.split(",");
            arrayList3.clear();
            for (String str : strArrSplit) {
                try {
                    arrayList3.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        String string2 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] strArrSplit2 = string2.split(";");
            map2.clear();
            int i11 = 0;
            while (i11 < strArrSplit2.length) {
                String[] strArrSplit3 = strArrSplit2[i11].split(",");
                if (strArrSplit3.length > 0) {
                    try {
                        long j10 = Long.parseLong(strArrSplit3[c10]);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i12 = 1; i12 < strArrSplit3.length; i12++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(strArrSplit3[i12])));
                        }
                        map2.put(Long.valueOf(j10), arrayList4);
                    } catch (Exception unused2) {
                    }
                }
                i11++;
                c10 = 0;
            }
        }
        String string3 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] strArrSplit4 = string3.split(",");
            arrayList.clear();
            for (String str2 : strArrSplit4) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] strArrSplit5 = string4.split(";");
            map.clear();
            for (String str3 : strArrSplit5) {
                String[] strArrSplit6 = str3.split(",");
                if (strArrSplit6.length > 0) {
                    try {
                        long j11 = Long.parseLong(strArrSplit6[0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (int i13 = 1; i13 < strArrSplit6.length; i13++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(strArrSplit6[i13])));
                        }
                        map.put(Long.valueOf(j11), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] strArrSplit7 = string5.split(",");
            arrayList2.clear();
            for (String str4 : strArrSplit7) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(str4)));
                } catch (Exception unused5) {
                }
            }
        }
        this.f16599s = l1(arrayList3, map2).size();
        this.f16596f = l1(arrayList, map).size();
        this.f16601x = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", false);
        this.f16602y = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", true);
        j1(context);
        this.f16593b.setAdapter(new n8(this, context, 0));
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new k7(4, this, messagesStorage));
        MessagesController.getInstance(this.currentAccount).getStoriesController().P();
        MessagesController.getInstance(this.currentAccount).getStoriesController().R();
    }

    public static ArrayList J0(q9 q9Var) {
        ArrayList arrayListH1 = q9Var.h1();
        int i10 = 0;
        while (i10 < arrayListH1.size()) {
            TLObject tLObject = (TLObject) arrayListH1.get(i10);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                arrayListH1.remove(i10);
                i10--;
            }
            i10++;
        }
        return arrayListH1;
    }

    public static ArrayList Y0(q9 q9Var) {
        TLRPC.Chat chat;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(q9Var.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (messagesController.canAddToForward(dialog)) {
                if (DialogObject.isUserDialog(dialog.f22384id)) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(dialog.f22384id));
                    if (user != null && !user.bot && user.f22527id != 777000 && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else if (DialogObject.isChatDialog(dialog.f22384id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f22384id))) != null && !ChatObject.isForum(chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList Z0(q9 q9Var, boolean z10, boolean z11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(q9Var.currentAccount);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(q9Var.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!q9Var.W) {
                ContactsController.getInstance(q9Var.currentAccount).loadContacts(false, 0L);
            }
            q9Var.W = true;
        }
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (DialogObject.isUserDialog(dialog.f22384id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.f22384id));
                if (user2 != null && !user2.bot && user2.f22527id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z10 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.f22527id)) != null))) {
                    map.put(Long.valueOf(user2.f22527id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z11 && DialogObject.isChatDialog(dialog.f22384id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f22384id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                map.put(Long.valueOf(-chat.f22380id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<Long, TLRPC.TL_contact>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Long key = it.next().getKey();
                key.getClass();
                if (!map.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.f22527id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    map.put(Long.valueOf(user.f22527id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public static int d1(q9 q9Var, TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(q9Var.currentAccount).getChatFull(chat.f22380id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap map = q9Var.L;
        return (map == null || (num = (Integer) map.get(Long.valueOf(chat.f22380id))) == null) ? chat.participants_count : num.intValue();
    }

    public static HashSet l1(ArrayList arrayList, HashMap map) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                hashSet.addAll((ArrayList) it.next());
            }
        }
        return hashSet;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f16593b.getCurrentView();
        if (currentView instanceof k9) {
            return ((k9) currentView).O;
        }
        return true;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h1 h1Var = this.f16593b;
        if (h1Var == null) {
            return;
        }
        int i12 = 0;
        if (i10 == NotificationCenter.contactsDidLoad) {
            View[] viewPages = h1Var.getViewPages();
            View view = viewPages[0];
            if (view instanceof k9) {
                ((k9) view).g(true);
            }
            View view2 = viewPages[1];
            if (view2 instanceof k9) {
                ((k9) view2).g(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.storiesBlocklistUpdate) {
            if (i10 == NotificationCenter.storiesSendAsUpdate) {
                View[] viewPages2 = h1Var.getViewPages();
                while (i12 < viewPages2.length) {
                    View view3 = viewPages2[i12];
                    if (view3 instanceof k9) {
                        k9 k9Var = (k9) view3;
                        if (k9Var.f16249a == 0) {
                            k9Var.g(true);
                        }
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        View[] viewPages3 = h1Var.getViewPages();
        while (i12 < viewPages3.length) {
            View view4 = viewPages3[i12];
            if (view4 instanceof k9) {
                k9 k9Var2 = (k9) view4;
                int i13 = k9Var2.f16249a;
                if (i13 == 6) {
                    k9Var2.a(true);
                } else if (i13 == 0) {
                    k9Var2.g(true);
                }
            }
            i12++;
        }
    }

    @Override
    public final void dismiss() {
        o9 o9Var;
        Utilities.Callback callback = this.Q;
        ArrayList arrayList = this.h;
        HashMap map = this.f16595e;
        ArrayList arrayList2 = this.d;
        HashMap map2 = this.f16598r;
        ArrayList arrayList3 = this.f16597n;
        if (callback != null) {
            int i10 = this.J;
            if (i10 == 3) {
                o9Var = new o9(this.J, this.currentAccount, new ArrayList(l1(arrayList3, map2)));
                ArrayList arrayList4 = o9Var.f16491c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap map3 = o9Var.d;
                map3.clear();
                map3.putAll(map2);
            } else if (i10 == 4) {
                o9Var = new o9(this.J, this.currentAccount, new ArrayList(l1(arrayList2, map)));
                ArrayList arrayList5 = o9Var.f16491c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap map4 = o9Var.d;
                map4.clear();
                map4.putAll(map);
            } else {
                o9Var = i10 == 2 ? new o9(i10, this.currentAccount, arrayList) : new o9(i10, this.currentAccount, (ArrayList) null);
            }
            this.Q.run(o9Var);
            this.Q = null;
        }
        org.telegram.ui.Components.ec.h(this.container);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map2.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry2 : map.entrySet()) {
            if (sb3.length() > 0) {
                sb3.append(";");
            }
            sb3.append(entry2.getKey());
            sb3.append(",");
            sb3.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f16601x).putBoolean("story_keep", this.f16602y).apply();
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
        this.A = z10;
        h1 h1Var = this.f16593b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof k9) {
                    ((k9) view).e(false);
                }
            }
        }
    }

    public final void f1() {
        c9 c9Var;
        for (View view : this.f16593b.getViewPages()) {
            if ((view instanceof k9) && (c9Var = ((k9) view).f16258x) != null) {
                AndroidUtilities.hideKeyboard(c9Var.f16440a);
            }
        }
    }

    public final void g1(o9 o9Var, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.O != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                String str = (String) this.O.get(i10);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.f22527id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !o9Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.isEmpty() || z10) {
            View view = this.f16593b.getViewPages()[0];
            d dVar = view instanceof k9 ? ((k9) view).v : null;
            if (dVar != null) {
                dVar.setLoading(true);
            }
            u8 u8Var = this.P;
            if (u8Var != null) {
                u8Var.d(o9Var, this.f16600w, this.f16601x, this.f16602y, this.C, this.f16594c, this.D, new k7(6, dVar, runnable), new kh.c(dVar, 18));
                return;
            } else {
                runnable.run();
                return;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i11 = 0; i11 < Math.min(2, arrayList.size()); i11++) {
            if (i11 > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i11)));
            spannableString.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StoryRestrictions);
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder);
        alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new ag.l0(this, o9Var, runnable, 12));
        i0.a.w(R.string.Cancel, alertDialog$Builder, null);
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.f22527id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final jh.s6 i1() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public final void j1(Context context) {
        org.telegram.ui.Components.ec.a(this.container, new cg.w(4));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        this.N.setColor(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider));
        this.containerView = new t8(this, context);
        h1 h1Var = new h1(this, context, 1);
        this.f16593b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.f16593b, h7.z5.e(-1, -1, 119));
    }

    public final void k1(boolean z10) {
        this.V = z10;
        h1 h1Var = this.f16593b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof k9) {
                    k9 k9Var = (k9) view;
                    k9Var.g(false);
                    k9Var.e(false);
                }
            }
        }
    }

    public final void m1(int i10) {
        this.E = i10;
        h1 h1Var = this.f16593b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof k9) {
                    ((k9) view).e(false);
                }
            }
        }
    }

    public final void n1(Bitmap bitmap) {
        this.X = bitmap == null ? null : new BitmapDrawable(bitmap);
        h1 h1Var = this.f16593b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof k9) {
                    k9 k9Var = (k9) view;
                    k9Var.g(false);
                    k9Var.e(false);
                }
            }
        }
    }

    public final void o1() {
        this.G = true;
        View[] viewPages = this.f16593b.getViewPages();
        View view = viewPages[0];
        if (view instanceof k9) {
            k9 k9Var = (k9) view;
            k9Var.b(k9Var.f16249a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof k9) {
            k9 k9Var2 = (k9) view2;
            k9Var2.b(k9Var2.f16249a);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f16593b.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        f1();
        h1 h1Var = this.f16593b;
        h1Var.D(h1Var.getCurrentPosition() - 1);
    }

    public final void p1(TLRPC.InputPeer inputPeer) {
        this.f16594c = inputPeer;
        this.v.clear();
        View[] viewPages = this.f16593b.getViewPages();
        View view = viewPages[0];
        if (view instanceof k9) {
            k9 k9Var = (k9) view;
            k9Var.b(k9Var.f16249a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof k9) {
            k9 k9Var2 = (k9) view2;
            k9Var2.b(k9Var2.f16249a);
        }
    }

    public final void q1(o9 o9Var) {
        if (o9Var == null) {
            return;
        }
        HashMap map = o9Var.d;
        int i10 = o9Var.f16489a;
        ArrayList arrayList = o9Var.f16491c;
        this.J = i10;
        if (i10 == 2) {
            ArrayList arrayList2 = this.h;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        } else if (i10 == 3) {
            ArrayList arrayList3 = this.f16597n;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            HashMap map2 = this.f16598r;
            map2.clear();
            map2.putAll(map);
            this.f16599s = l1(arrayList3, map2).size();
        } else if (i10 == 4) {
            ArrayList arrayList4 = this.d;
            arrayList4.clear();
            arrayList4.addAll(arrayList);
            HashMap map3 = this.f16595e;
            map3.clear();
            map3.putAll(map);
            this.f16596f = l1(arrayList4, map3).size();
        }
        if (i10 == 5) {
            this.K = true;
            this.I = 5;
            ArrayList arrayList5 = this.F;
            arrayList5.clear();
            arrayList5.addAll(o9Var.f16493f);
            this.f16593b.setPosition(1);
        }
        View[] viewPages = this.f16593b.getViewPages();
        View view = viewPages[0];
        if (view instanceof k9) {
            k9 k9Var = (k9) view;
            k9Var.b(k9Var.f16249a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof k9) {
            k9 k9Var2 = (k9) view2;
            k9Var2.b(k9Var2.f16249a);
        }
    }

    public q9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true, false);
        this.d = new ArrayList();
        this.f16595e = new HashMap();
        this.f16596f = 0;
        this.h = new ArrayList();
        this.f16597n = new ArrayList();
        this.f16598r = new HashMap();
        this.f16599s = 0;
        this.v = new HashSet();
        this.f16600w = true;
        this.f16601x = true;
        this.f16602y = false;
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
        this.f16593b.setAdapter(new n8(this, context, 1));
    }
}
