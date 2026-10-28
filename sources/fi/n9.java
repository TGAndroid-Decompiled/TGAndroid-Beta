package fi;

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
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.r61;
public final class n9 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f11308d0 = 0;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final ArrayList J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public HashMap P;
    public int Q;
    public final Paint R;
    public ArrayList S;
    public r8 T;
    public Utilities.Callback U;
    public x8 V;
    public Utilities.Callback W;
    public q9 X;
    public final boolean Y;
    public boolean Z;
    public boolean f11309a0;
    public h1 f11310b;
    public BitmapDrawable f11311b0;
    public TLRPC.InputPeer f11312c;
    public p9 f11313c0;
    public final ArrayList d;
    public final HashMap e;
    public int f11314f;
    public final ArrayList h;
    public final ArrayList f11315n;
    public final HashMap f11316r;
    public int f11317s;
    public final HashSet v;
    public boolean f11318w;
    public boolean f11319x;
    public boolean f11320y;

    public n9(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, true);
        boolean z10;
        char c10;
        boolean z11 = true;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        char c11 = 0;
        this.f11314f = 0;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f11315n = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.f11316r = hashMap2;
        this.f11317s = 0;
        this.v = new HashSet();
        this.f11318w = true;
        this.f11319x = true;
        this.f11320y = false;
        this.E = true;
        this.F = true;
        this.G = false;
        this.H = 0;
        this.I = 1;
        this.J = new ArrayList();
        this.M = 1;
        this.N = 4;
        this.P = new HashMap();
        this.Q = 86400;
        this.R = new Paint(1);
        this.Y = true;
        this.Z = false;
        this.Q = i10;
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
                        long parseLong = Long.parseLong(split3[c11]);
                        z10 = z11;
                        ArrayList arrayList4 = new ArrayList();
                        c10 = c11;
                        for (int i12 = z10; i12 < split3.length; i12++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i12])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i11++;
                    c11 = c10;
                    z11 = z10;
                }
                z10 = z11;
                c10 = c11;
                i11++;
                c11 = c10;
                z11 = z10;
            }
        }
        boolean z12 = z11;
        ?? r23 = c11;
        String string3 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] split4 = string3.split(",");
            arrayList.clear();
            for (int i13 = r23 == true ? 1 : 0; i13 < split4.length; i13++) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(split4[i13])));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (int i14 = r23 == true ? 1 : 0; i14 < split5.length; i14++) {
                String[] split6 = split5[i14].split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[r23 == true ? 1 : 0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (int i15 = z12; i15 < split6.length; i15++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[i15])));
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
            for (int i16 = r23 == true ? 1 : 0; i16 < split7.length; i16++) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(split7[i16])));
                } catch (Exception unused5) {
                }
            }
        }
        this.f11317s = m1(arrayList3, hashMap2).size();
        this.f11314f = m1(arrayList, hashMap).size();
        this.f11319x = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", r23);
        this.f11320y = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", z12);
        k1(context);
        this.f11310b.setAdapter(new j8(this, context, 0));
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new e2.q0(20, this, messagesStorage));
        MessagesController.getInstance(this.currentAccount).getStoriesController().S();
        MessagesController.getInstance(this.currentAccount).getStoriesController().U();
    }

    public static void D(n9 n9Var) {
        super.dismiss();
    }

    public static int G(n9 n9Var) {
        return n9Var.currentAccount;
    }

    public static ArrayList K0(n9 n9Var) {
        ArrayList i12 = n9Var.i1();
        int i10 = 0;
        while (i10 < i12.size()) {
            TLObject tLObject = (TLObject) i12.get(i10);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                i12.remove(i10);
                i10--;
            }
            i10++;
        }
        return i12;
    }

    public static int W(n9 n9Var) {
        return n9Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.u6 X(n9 n9Var) {
        return n9Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.u6 Y(n9 n9Var) {
        return n9Var.resourcesProvider;
    }

    public static ArrayList Z0(n9 n9Var) {
        TLRPC.Chat chat;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(n9Var.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (messagesController.canAddToForward(dialog)) {
                if (DialogObject.isUserDialog(dialog.f22032id)) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(dialog.f22032id));
                    if (user != null && !user.bot && user.f22177id != 777000 && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else if (DialogObject.isChatDialog(dialog.f22032id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f22032id))) != null && !ChatObject.isForum(chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList a1(n9 n9Var, boolean z10, boolean z11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(n9Var.currentAccount);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(n9Var.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!n9Var.f11309a0) {
                ContactsController.getInstance(n9Var.currentAccount).loadContacts(false, 0L);
            }
            n9Var.f11309a0 = true;
        }
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (DialogObject.isUserDialog(dialog.f22032id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.f22032id));
                if (user2 != null && !user2.bot && user2.f22177id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z10 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.f22177id)) != null))) {
                    hashMap.put(Long.valueOf(user2.f22177id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z11 && DialogObject.isChatDialog(dialog.f22032id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f22032id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                hashMap.put(Long.valueOf(-chat.f22028id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            for (Map.Entry<Long, TLRPC.TL_contact> entry : concurrentHashMap.entrySet()) {
                Long key = entry.getKey();
                key.getClass();
                if (!hashMap.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.f22177id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    hashMap.put(Long.valueOf(user.f22177id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public static ViewGroup c0(n9 n9Var) {
        return n9Var.containerView;
    }

    public static boolean d0(n9 n9Var) {
        return n9Var.keyboardVisible;
    }

    public static int e1(n9 n9Var, TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(n9Var.currentAccount).getChatFull(chat.f22028id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = n9Var.P;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.f22028id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public static HashSet m1(ArrayList arrayList, HashMap hashMap) {
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

    public static org.telegram.ui.ActionBar.u6 r0(n9 n9Var) {
        return n9Var.resourcesProvider;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f11310b.getCurrentView();
        if (currentView instanceof g9) {
            return ((g9) currentView).S;
        }
        return true;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h1 h1Var = this.f11310b;
        if (h1Var != null) {
            int i12 = 0;
            if (i10 == NotificationCenter.contactsDidLoad) {
                View[] viewPages = h1Var.getViewPages();
                View view = viewPages[0];
                if (view instanceof g9) {
                    ((g9) view).g(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof g9) {
                    ((g9) view2).g(true);
                }
            } else if (i10 == NotificationCenter.storiesBlocklistUpdate) {
                View[] viewPages2 = h1Var.getViewPages();
                while (i12 < viewPages2.length) {
                    View view3 = viewPages2[i12];
                    if (view3 instanceof g9) {
                        g9 g9Var = (g9) view3;
                        int i13 = g9Var.f10919a;
                        if (i13 == 6) {
                            g9Var.a(true);
                        } else if (i13 == 0) {
                            g9Var.g(true);
                        }
                    }
                    i12++;
                }
            } else if (i10 == NotificationCenter.storiesSendAsUpdate) {
                View[] viewPages3 = h1Var.getViewPages();
                while (i12 < viewPages3.length) {
                    View view4 = viewPages3[i12];
                    if (view4 instanceof g9) {
                        g9 g9Var2 = (g9) view4;
                        if (g9Var2.f10919a == 0) {
                            g9Var2.g(true);
                        }
                    }
                    i12++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        l9 l9Var;
        Utilities.Callback callback = this.U;
        ArrayList arrayList = this.h;
        HashMap hashMap = this.e;
        ArrayList arrayList2 = this.d;
        HashMap hashMap2 = this.f11316r;
        ArrayList arrayList3 = this.f11315n;
        if (callback != null) {
            int i10 = this.N;
            if (i10 == 3) {
                l9Var = new l9(this.N, this.currentAccount, new ArrayList(m1(arrayList3, hashMap2)));
                ArrayList arrayList4 = l9Var.f11182c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = l9Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i10 == 4) {
                l9Var = new l9(this.N, this.currentAccount, new ArrayList(m1(arrayList2, hashMap)));
                ArrayList arrayList5 = l9Var.f11182c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = l9Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else if (i10 == 2) {
                l9Var = new l9(i10, this.currentAccount, arrayList);
            } else {
                l9Var = new l9(i10, this.currentAccount, (ArrayList) null);
            }
            this.U.run(l9Var);
            this.U = null;
        }
        org.telegram.ui.Components.qc.h(this.container);
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
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f11319x).putBoolean("story_keep", this.f11320y).apply();
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
        super.dismissInternal();
    }

    public final void f1(boolean z10) {
        View[] viewPages;
        this.E = z10;
        h1 h1Var = this.f11310b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof g9) {
                    ((g9) view).e(false);
                }
            }
        }
    }

    public final void g1() {
        View[] viewPages;
        z8 z8Var;
        for (View view : this.f11310b.getViewPages()) {
            if ((view instanceof g9) && (z8Var = ((g9) view).f10927x) != null) {
                AndroidUtilities.hideKeyboard(z8Var.f11123b);
            }
        }
    }

    public final void h1(l9 l9Var, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.S != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i10 = 0; i10 < this.S.size(); i10++) {
                String str = (String) this.S.get(i10);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.f22177id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !l9Var.b(user)) {
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
                spannableString.setSpan(new r61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.StoryRestrictions);
            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder);
            alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new androidx.car.app.utils.a(this, l9Var, runnable, 7));
            ic.a.r(R.string.Cancel, alertDialog$Builder, null);
            return;
        }
        View view = this.f11310b.getViewPages()[0];
        if (view instanceof g9) {
            dVar = ((g9) view).v;
        }
        if (dVar != null) {
            dVar.setLoading(true);
        }
        r8 r8Var = this.T;
        if (r8Var != null) {
            r8Var.b(l9Var, this.f11318w, this.f11319x, this.f11320y, this.G, this.f11312c, this.H, new e2.q0(22, dVar, runnable), new di.s8(dVar, 25));
        } else {
            runnable.run();
        }
    }

    public final ArrayList i1() {
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.f22177id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final di.h7 j1() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public final void k1(Context context) {
        org.telegram.ui.Components.qc.a(this.container, new k8(0));
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.storiesSendAsUpdate);
        int i10 = org.telegram.ui.ActionBar.y6.f23428h5;
        this.R.setColor(org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider));
        fixNavigationBarKey(i10);
        this.containerView = new q8(this, context);
        h1 h1Var = new h1(this, context, 1);
        this.f11310b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.f11310b, kb1.i(-1, -1, 119));
    }

    public final void l1(boolean z10) {
        View[] viewPages;
        this.Z = z10;
        h1 h1Var = this.f11310b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof g9) {
                    g9 g9Var = (g9) view;
                    g9Var.g(false);
                    g9Var.e(false);
                }
            }
        }
    }

    public final void n1(int i10) {
        View[] viewPages;
        this.I = i10;
        h1 h1Var = this.f11310b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof g9) {
                    ((g9) view).e(false);
                }
            }
        }
    }

    public final void o1(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        View[] viewPages;
        if (bitmap == null) {
            bitmapDrawable = null;
        } else {
            bitmapDrawable = new BitmapDrawable(bitmap);
        }
        this.f11311b0 = bitmapDrawable;
        h1 h1Var = this.f11310b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof g9) {
                    g9 g9Var = (g9) view;
                    g9Var.g(false);
                    g9Var.e(false);
                }
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f11310b.getCurrentPosition() > 0) {
            g1();
            h1 h1Var = this.f11310b;
            h1Var.E(h1Var.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            this.R.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, this.resourcesProvider));
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p1() {
        this.K = true;
        View[] viewPages = this.f11310b.getViewPages();
        View view = viewPages[0];
        if (view instanceof g9) {
            g9 g9Var = (g9) view;
            g9Var.b(g9Var.f10919a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof g9) {
            g9 g9Var2 = (g9) view2;
            g9Var2.b(g9Var2.f10919a);
        }
    }

    public final void q1(TLRPC.InputPeer inputPeer) {
        this.f11312c = inputPeer;
        this.v.clear();
        View[] viewPages = this.f11310b.getViewPages();
        View view = viewPages[0];
        if (view instanceof g9) {
            g9 g9Var = (g9) view;
            g9Var.b(g9Var.f10919a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof g9) {
            g9 g9Var2 = (g9) view2;
            g9Var2.b(g9Var2.f10919a);
        }
    }

    public final void r1(l9 l9Var) {
        if (l9Var != null) {
            HashMap hashMap = l9Var.d;
            int i10 = l9Var.f11180a;
            ArrayList arrayList = l9Var.f11182c;
            this.N = i10;
            if (i10 == 2) {
                ArrayList arrayList2 = this.h;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i10 == 3) {
                ArrayList arrayList3 = this.f11315n;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.f11316r;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.f11317s = m1(arrayList3, hashMap2).size();
            } else if (i10 == 4) {
                ArrayList arrayList4 = this.d;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.e;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.f11314f = m1(arrayList4, hashMap3).size();
            }
            if (i10 == 5) {
                this.O = true;
                this.M = 5;
                ArrayList arrayList5 = this.J;
                arrayList5.clear();
                arrayList5.addAll(l9Var.f11183f);
                this.f11310b.setPosition(1);
            }
            View[] viewPages = this.f11310b.getViewPages();
            View view = viewPages[0];
            if (view instanceof g9) {
                g9 g9Var = (g9) view;
                g9Var.b(g9Var.f10919a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof g9) {
                g9 g9Var2 = (g9) view2;
                g9Var2.b(g9Var2.f10919a);
            }
        }
    }

    public n9(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, true);
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f11314f = 0;
        this.h = new ArrayList();
        this.f11315n = new ArrayList();
        this.f11316r = new HashMap();
        this.f11317s = 0;
        this.v = new HashSet();
        this.f11318w = true;
        this.f11319x = true;
        this.f11320y = false;
        this.E = true;
        this.F = true;
        this.G = false;
        this.H = 0;
        this.I = 1;
        this.J = new ArrayList();
        this.M = 1;
        this.N = 4;
        this.P = new HashMap();
        this.Q = 86400;
        this.R = new Paint(1);
        this.Y = true;
        this.Z = false;
        k1(context);
        this.f11310b.setAdapter(new j8(this, context, 1));
    }
}
