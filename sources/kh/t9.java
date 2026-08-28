package kh;

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
import org.telegram.ui.Components.i41;
public final class t9 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
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
    public w8 P;
    public Utilities.Callback Q;
    public d9 R;
    public Utilities.Callback S;
    public w9 T;
    public final boolean U;
    public boolean V;
    public boolean W;
    public BitmapDrawable X;
    public v9 Y;
    public j1 f16097b;
    public TLRPC.InputPeer f16098c;
    public final ArrayList d;
    public final HashMap f16099e;
    public int f16100f;
    public final ArrayList h;
    public final ArrayList f16101n;
    public final HashMap f16102r;
    public int f16103s;
    public final HashSet v;
    public boolean f16104w;
    public boolean f16105x;
    public boolean f16106y;

    public t9(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, true, false);
        char c10 = 0;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        HashMap hashMap = new HashMap();
        this.f16099e = hashMap;
        this.f16100f = 0;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f16101n = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.f16102r = hashMap2;
        this.f16103s = 0;
        this.v = new HashSet();
        this.f16104w = true;
        this.f16105x = true;
        this.f16106y = false;
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
        this.M = i9;
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
            int i10 = 0;
            while (i10 < split2.length) {
                String[] split3 = split2[i10].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c10]);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i11 = 1; i11 < split3.length; i11++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i11])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i10++;
                    c10 = 0;
                }
                i10++;
                c10 = 0;
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
                        for (int i12 = 1; i12 < split6.length; i12++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[i12])));
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
        this.f16103s = l1(arrayList3, hashMap2).size();
        this.f16100f = l1(arrayList, hashMap).size();
        this.f16105x = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", false);
        this.f16106y = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", true);
        j1(context);
        this.f16097b.setAdapter(new p8(this, context, 0));
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new ih.j7(28, this, messagesStorage));
        MessagesController.getInstance(this.currentAccount).getStoriesController().P();
        MessagesController.getInstance(this.currentAccount).getStoriesController().R();
    }

    public static void D(t9 t9Var) {
        super.dismiss();
    }

    public static int F(t9 t9Var) {
        return t9Var.currentAccount;
    }

    public static int G(t9 t9Var) {
        return t9Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.b6 H(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.b6 I(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static ArrayList I0(t9 t9Var) {
        ArrayList h12 = t9Var.h1();
        int i9 = 0;
        while (i9 < h12.size()) {
            TLObject tLObject = (TLObject) h12.get(i9);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                h12.remove(i9);
                i9--;
            }
            i9++;
        }
        return h12;
    }

    public static int J(t9 t9Var) {
        return t9Var.currentAccount;
    }

    public static int K(t9 t9Var) {
        return t9Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.b6 L(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static int M(t9 t9Var) {
        return t9Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.b6 N(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.b6 O(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.b6 Q(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.b6 R(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.b6 S(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.b6 T(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static int U(t9 t9Var) {
        return t9Var.currentAccount;
    }

    public static int V(t9 t9Var) {
        return t9Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.b6 W(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.b6 X(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    public static int Y(t9 t9Var) {
        return t9Var.currentAccount;
    }

    public static ArrayList Y0(t9 t9Var) {
        TLRPC.Chat chat;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(t9Var.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i9 = 0; i9 < allDialogs.size(); i9++) {
            TLRPC.Dialog dialog = allDialogs.get(i9);
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

    public static ArrayList Z0(t9 t9Var, boolean z10, boolean z11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(t9Var.currentAccount);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(t9Var.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!t9Var.W) {
                ContactsController.getInstance(t9Var.currentAccount).loadContacts(false, 0L);
            }
            t9Var.W = true;
        }
        for (int i9 = 0; i9 < allDialogs.size(); i9++) {
            TLRPC.Dialog dialog = allDialogs.get(i9);
            if (DialogObject.isUserDialog(dialog.f22384id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.f22384id));
                if (user2 != null && !user2.bot && user2.f22527id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z10 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.f22527id)) != null))) {
                    hashMap.put(Long.valueOf(user2.f22527id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z11 && DialogObject.isChatDialog(dialog.f22384id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f22384id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                hashMap.put(Long.valueOf(-chat.f22380id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            for (Map.Entry<Long, TLRPC.TL_contact> entry : concurrentHashMap.entrySet()) {
                Long key = entry.getKey();
                key.getClass();
                if (!hashMap.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.f22527id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    hashMap.put(Long.valueOf(user.f22527id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public static int a0(t9 t9Var) {
        return t9Var.currentAccount;
    }

    public static ViewGroup b0(t9 t9Var) {
        return t9Var.containerView;
    }

    public static int b1(t9 t9Var) {
        return t9Var.currentAccount;
    }

    public static boolean c0(t9 t9Var) {
        return t9Var.keyboardVisible;
    }

    public static int d1(t9 t9Var, TLRPC.Chat chat) {
        Integer num;
        int i9;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(t9Var.currentAccount).getChatFull(chat.f22380id);
        if (chatFull != null && (i9 = chatFull.participants_count) > 0) {
            return i9;
        }
        HashMap hashMap = t9Var.L;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.f22380id))) != null) {
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

    public static org.telegram.ui.ActionBar.b6 q0(t9 t9Var) {
        return t9Var.resourcesProvider;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f16097b.getCurrentView();
        if (currentView instanceof n9) {
            return ((n9) currentView).O;
        }
        return true;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        j1 j1Var = this.f16097b;
        if (j1Var != null) {
            int i11 = 0;
            if (i9 == NotificationCenter.contactsDidLoad) {
                View[] viewPages = j1Var.getViewPages();
                View view = viewPages[0];
                if (view instanceof n9) {
                    ((n9) view).g(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof n9) {
                    ((n9) view2).g(true);
                }
            } else if (i9 == NotificationCenter.storiesBlocklistUpdate) {
                View[] viewPages2 = j1Var.getViewPages();
                while (i11 < viewPages2.length) {
                    View view3 = viewPages2[i11];
                    if (view3 instanceof n9) {
                        n9 n9Var = (n9) view3;
                        int i12 = n9Var.f15767a;
                        if (i12 == 6) {
                            n9Var.a(true);
                        } else if (i12 == 0) {
                            n9Var.g(true);
                        }
                    }
                    i11++;
                }
            } else if (i9 == NotificationCenter.storiesSendAsUpdate) {
                View[] viewPages3 = j1Var.getViewPages();
                while (i11 < viewPages3.length) {
                    View view4 = viewPages3[i11];
                    if (view4 instanceof n9) {
                        n9 n9Var2 = (n9) view4;
                        if (n9Var2.f15767a == 0) {
                            n9Var2.g(true);
                        }
                    }
                    i11++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        r9 r9Var;
        Utilities.Callback callback = this.Q;
        ArrayList arrayList = this.h;
        HashMap hashMap = this.f16099e;
        ArrayList arrayList2 = this.d;
        HashMap hashMap2 = this.f16102r;
        ArrayList arrayList3 = this.f16101n;
        if (callback != null) {
            int i9 = this.J;
            if (i9 == 3) {
                r9Var = new r9(this.J, this.currentAccount, new ArrayList(l1(arrayList3, hashMap2)));
                ArrayList arrayList4 = r9Var.f15968c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = r9Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i9 == 4) {
                r9Var = new r9(this.J, this.currentAccount, new ArrayList(l1(arrayList2, hashMap)));
                ArrayList arrayList5 = r9Var.f15968c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = r9Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else if (i9 == 2) {
                r9Var = new r9(i9, this.currentAccount, arrayList);
            } else {
                r9Var = new r9(i9, this.currentAccount, (ArrayList) null);
            }
            this.Q.run(r9Var);
            this.Q = null;
        }
        org.telegram.ui.Components.gc.h(this.container);
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
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f16105x).putBoolean("story_keep", this.f16106y).apply();
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
        j1 j1Var = this.f16097b;
        if (j1Var != null) {
            for (View view : j1Var.getViewPages()) {
                if (view instanceof n9) {
                    ((n9) view).e(false);
                }
            }
        }
    }

    public final void f1() {
        View[] viewPages;
        f9 f9Var;
        for (View view : this.f16097b.getViewPages()) {
            if ((view instanceof n9) && (f9Var = ((n9) view).f15776x) != null) {
                AndroidUtilities.hideKeyboard(f9Var.f15889a);
            }
        }
    }

    public final void g1(r9 r9Var, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.O != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i9 = 0; i9 < this.O.size(); i9++) {
                String str = (String) this.O.get(i9);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.f22527id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !r9Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        d dVar = null;
        if (!arrayList.isEmpty() && !z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < Math.min(2, arrayList.size()); i10++) {
                if (i10 > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i10)));
                spannableString.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StoryRestrictions);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder);
            alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new androidx.car.app.utils.a(this, r9Var, runnable, 11));
            j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
            return;
        }
        View view = this.f16097b.getViewPages()[0];
        if (view instanceof n9) {
            dVar = ((n9) view).v;
        }
        if (dVar != null) {
            dVar.setLoading(true);
        }
        w8 w8Var = this.P;
        if (w8Var != null) {
            w8Var.d(r9Var, this.f16104w, this.f16105x, this.f16106y, this.C, this.f16098c, this.D, new o8(0, dVar, runnable), new f1(dVar, 11));
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
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i9);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.f22527id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final ih.v6 i1() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public final void j1(Context context) {
        org.telegram.ui.Components.gc.a(this.container, new bg.z(4));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        this.N.setColor(org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider));
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider));
        this.containerView = new v8(this, context);
        j1 j1Var = new j1(this, context, 1);
        this.f16097b = j1Var;
        int i10 = this.backgroundPaddingLeft;
        j1Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(this.f16097b, g7.e6.e(-1, -1, 119));
    }

    public final void k1(boolean z10) {
        View[] viewPages;
        this.V = z10;
        j1 j1Var = this.f16097b;
        if (j1Var != null) {
            for (View view : j1Var.getViewPages()) {
                if (view instanceof n9) {
                    n9 n9Var = (n9) view;
                    n9Var.g(false);
                    n9Var.e(false);
                }
            }
        }
    }

    public final void m1(int i9) {
        View[] viewPages;
        this.E = i9;
        j1 j1Var = this.f16097b;
        if (j1Var != null) {
            for (View view : j1Var.getViewPages()) {
                if (view instanceof n9) {
                    ((n9) view).e(false);
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
        j1 j1Var = this.f16097b;
        if (j1Var != null) {
            for (View view : j1Var.getViewPages()) {
                if (view instanceof n9) {
                    n9 n9Var = (n9) view;
                    n9Var.g(false);
                    n9Var.e(false);
                }
            }
        }
    }

    public final void o1() {
        this.G = true;
        View[] viewPages = this.f16097b.getViewPages();
        View view = viewPages[0];
        if (view instanceof n9) {
            n9 n9Var = (n9) view;
            n9Var.b(n9Var.f15767a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof n9) {
            n9 n9Var2 = (n9) view2;
            n9Var2.b(n9Var2.f15767a);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f16097b.getCurrentPosition() > 0) {
            f1();
            j1 j1Var = this.f16097b;
            j1Var.D(j1Var.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    public final void p1(TLRPC.InputPeer inputPeer) {
        this.f16098c = inputPeer;
        this.v.clear();
        View[] viewPages = this.f16097b.getViewPages();
        View view = viewPages[0];
        if (view instanceof n9) {
            n9 n9Var = (n9) view;
            n9Var.b(n9Var.f15767a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof n9) {
            n9 n9Var2 = (n9) view2;
            n9Var2.b(n9Var2.f15767a);
        }
    }

    public final void q1(r9 r9Var) {
        if (r9Var != null) {
            HashMap hashMap = r9Var.d;
            int i9 = r9Var.f15966a;
            ArrayList arrayList = r9Var.f15968c;
            this.J = i9;
            if (i9 == 2) {
                ArrayList arrayList2 = this.h;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i9 == 3) {
                ArrayList arrayList3 = this.f16101n;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.f16102r;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.f16103s = l1(arrayList3, hashMap2).size();
            } else if (i9 == 4) {
                ArrayList arrayList4 = this.d;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.f16099e;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.f16100f = l1(arrayList4, hashMap3).size();
            }
            if (i9 == 5) {
                this.K = true;
                this.I = 5;
                ArrayList arrayList5 = this.F;
                arrayList5.clear();
                arrayList5.addAll(r9Var.f15970f);
                this.f16097b.setPosition(1);
            }
            View[] viewPages = this.f16097b.getViewPages();
            View view = viewPages[0];
            if (view instanceof n9) {
                n9 n9Var = (n9) view;
                n9Var.b(n9Var.f15767a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof n9) {
                n9 n9Var2 = (n9) view2;
                n9Var2.b(n9Var2.f15767a);
            }
        }
    }

    public t9(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, true, false);
        this.d = new ArrayList();
        this.f16099e = new HashMap();
        this.f16100f = 0;
        this.h = new ArrayList();
        this.f16101n = new ArrayList();
        this.f16102r = new HashMap();
        this.f16103s = 0;
        this.v = new HashSet();
        this.f16104w = true;
        this.f16105x = true;
        this.f16106y = false;
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
        this.f16097b.setAdapter(new p8(this, context, 1));
    }
}
