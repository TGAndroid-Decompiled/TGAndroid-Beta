package di;

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
import org.telegram.ui.Components.i61;
public final class ea extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f6912d0 = 0;
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
    public g9 T;
    public Utilities.Callback U;
    public m9 V;
    public Utilities.Callback W;
    public ha X;
    public final boolean Y;
    public boolean Z;
    public boolean f6913a0;
    public h1 f6914b;
    public BitmapDrawable f6915b0;
    public TLRPC.InputPeer f6916c;
    public ga f6917c0;
    public final ArrayList d;
    public final HashMap e;
    public int f6918f;
    public final ArrayList h;
    public final ArrayList f6919n;
    public final HashMap f6920r;
    public int f6921s;
    public final HashSet v;
    public boolean f6922w;
    public boolean f6923x;
    public boolean f6924y;

    public ea(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, true);
        boolean z10;
        char c10;
        boolean z11 = true;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        char c11 = 0;
        this.f6918f = 0;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f6919n = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.f6920r = hashMap2;
        this.f6921s = 0;
        this.v = new HashSet();
        this.f6922w = true;
        this.f6923x = true;
        this.f6924y = false;
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
        this.f6921s = m1(arrayList3, hashMap2).size();
        this.f6918f = m1(arrayList, hashMap).size();
        this.f6923x = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", r23);
        this.f6924y = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", z12);
        k1(context);
        this.f6914b.setAdapter(new y8(this, context, 0));
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new x6(11, this, messagesStorage));
        MessagesController.getInstance(this.currentAccount).getStoriesController().P();
        MessagesController.getInstance(this.currentAccount).getStoriesController().R();
    }

    public static void F(ea eaVar) {
        super.dismiss();
    }

    public static int H(ea eaVar) {
        return eaVar.currentAccount;
    }

    public static int I(ea eaVar) {
        return eaVar.currentAccount;
    }

    public static org.telegram.ui.ActionBar.c6 J(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 K(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    public static ArrayList K0(ea eaVar) {
        ArrayList i12 = eaVar.i1();
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

    public static int L(ea eaVar) {
        return eaVar.currentAccount;
    }

    public static int M(ea eaVar) {
        return eaVar.currentAccount;
    }

    public static org.telegram.ui.ActionBar.c6 N(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    public static int O(ea eaVar) {
        return eaVar.currentAccount;
    }

    public static org.telegram.ui.ActionBar.c6 P(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 Q(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 S(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 T(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 U(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.c6 V(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    public static int W(ea eaVar) {
        return eaVar.currentAccount;
    }

    public static int X(ea eaVar) {
        return eaVar.currentAccount;
    }

    public static org.telegram.ui.ActionBar.c6 Y(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    public static ArrayList Z0(ea eaVar) {
        TLRPC.Chat chat;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(eaVar.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (messagesController.canAddToForward(dialog)) {
                if (DialogObject.isUserDialog(dialog.f19220id)) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(dialog.f19220id));
                    if (user != null && !user.bot && user.f19363id != 777000 && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else if (DialogObject.isChatDialog(dialog.f19220id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f19220id))) != null && !ChatObject.isForum(chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public static int a0(ea eaVar) {
        return eaVar.currentAccount;
    }

    public static ArrayList a1(ea eaVar, boolean z10, boolean z11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(eaVar.currentAccount);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(eaVar.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!eaVar.f6913a0) {
                ContactsController.getInstance(eaVar.currentAccount).loadContacts(false, 0L);
            }
            eaVar.f6913a0 = true;
        }
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (DialogObject.isUserDialog(dialog.f19220id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.f19220id));
                if (user2 != null && !user2.bot && user2.f19363id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z10 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.f19363id)) != null))) {
                    hashMap.put(Long.valueOf(user2.f19363id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z11 && DialogObject.isChatDialog(dialog.f19220id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f19220id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                hashMap.put(Long.valueOf(-chat.f19216id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            for (Map.Entry<Long, TLRPC.TL_contact> entry : concurrentHashMap.entrySet()) {
                Long key = entry.getKey();
                key.getClass();
                if (!hashMap.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.f19363id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    hashMap.put(Long.valueOf(user.f19363id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public static int c0(ea eaVar) {
        return eaVar.currentAccount;
    }

    public static int c1(ea eaVar) {
        return eaVar.currentAccount;
    }

    public static ViewGroup d0(ea eaVar) {
        return eaVar.containerView;
    }

    public static boolean e0(ea eaVar) {
        return eaVar.keyboardVisible;
    }

    public static int e1(ea eaVar, TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(eaVar.currentAccount).getChatFull(chat.f19216id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = eaVar.P;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.f19216id))) != null) {
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

    public static org.telegram.ui.ActionBar.c6 s0(ea eaVar) {
        return eaVar.resourcesProvider;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f6914b.getCurrentView();
        if (currentView instanceof x9) {
            return ((x9) currentView).S;
        }
        return true;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h1 h1Var = this.f6914b;
        if (h1Var != null) {
            int i12 = 0;
            if (i10 == NotificationCenter.contactsDidLoad) {
                View[] viewPages = h1Var.getViewPages();
                View view = viewPages[0];
                if (view instanceof x9) {
                    ((x9) view).g(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof x9) {
                    ((x9) view2).g(true);
                }
            } else if (i10 == NotificationCenter.storiesBlocklistUpdate) {
                View[] viewPages2 = h1Var.getViewPages();
                while (i12 < viewPages2.length) {
                    View view3 = viewPages2[i12];
                    if (view3 instanceof x9) {
                        x9 x9Var = (x9) view3;
                        int i13 = x9Var.f8094a;
                        if (i13 == 6) {
                            x9Var.a(true);
                        } else if (i13 == 0) {
                            x9Var.g(true);
                        }
                    }
                    i12++;
                }
            } else if (i10 == NotificationCenter.storiesSendAsUpdate) {
                View[] viewPages3 = h1Var.getViewPages();
                while (i12 < viewPages3.length) {
                    View view4 = viewPages3[i12];
                    if (view4 instanceof x9) {
                        x9 x9Var2 = (x9) view4;
                        if (x9Var2.f8094a == 0) {
                            x9Var2.g(true);
                        }
                    }
                    i12++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        ca caVar;
        Utilities.Callback callback = this.U;
        ArrayList arrayList = this.h;
        HashMap hashMap = this.e;
        ArrayList arrayList2 = this.d;
        HashMap hashMap2 = this.f6920r;
        ArrayList arrayList3 = this.f6919n;
        if (callback != null) {
            int i10 = this.N;
            if (i10 == 3) {
                caVar = new ca(this.N, this.currentAccount, new ArrayList(m1(arrayList3, hashMap2)));
                ArrayList arrayList4 = caVar.f6739c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = caVar.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i10 == 4) {
                caVar = new ca(this.N, this.currentAccount, new ArrayList(m1(arrayList2, hashMap)));
                ArrayList arrayList5 = caVar.f6739c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = caVar.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else if (i10 == 2) {
                caVar = new ca(i10, this.currentAccount, arrayList);
            } else {
                caVar = new ca(i10, this.currentAccount, (ArrayList) null);
            }
            this.U.run(caVar);
            this.U = null;
        }
        org.telegram.ui.Components.sc.h(this.container);
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
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f6923x).putBoolean("story_keep", this.f6924y).apply();
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
        h1 h1Var = this.f6914b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof x9) {
                    ((x9) view).e(false);
                }
            }
        }
    }

    public final void g1() {
        View[] viewPages;
        q9 q9Var;
        for (View view : this.f6914b.getViewPages()) {
            if ((view instanceof x9) && (q9Var = ((x9) view).f8102x) != null) {
                AndroidUtilities.hideKeyboard(q9Var.f6665a);
            }
        }
    }

    public final void h1(ca caVar, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.S != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i10 = 0; i10 < this.S.size(); i10++) {
                String str = (String) this.S.get(i10);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.f19363id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !caVar.b(user)) {
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
                spannableString.setSpan(new i61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.StoryRestrictions);
            alertDialog$Builder.f19548a.T = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder);
            alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new androidx.car.app.utils.a(this, caVar, runnable, 6));
            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
            return;
        }
        View view = this.f6914b.getViewPages()[0];
        if (view instanceof x9) {
            dVar = ((x9) view).v;
        }
        if (dVar != null) {
            dVar.setLoading(true);
        }
        g9 g9Var = this.T;
        if (g9Var != null) {
            g9Var.e(caVar, this.f6922w, this.f6923x, this.f6924y, this.G, this.f6916c, this.H, new x6(13, dVar, runnable), new x8(dVar, 0));
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.f19363id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final bi.x8 j1() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public final void k1(Context context) {
        org.telegram.ui.Components.sc.a(this.container, new z8(0));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        int i10 = org.telegram.ui.ActionBar.g6.f19972h5;
        this.R.setColor(org.telegram.ui.ActionBar.g6.w0(i10, this.resourcesProvider));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(i10, this.resourcesProvider));
        this.containerView = new f9(this, context);
        h1 h1Var = new h1(this, context, 1);
        this.f6914b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.f6914b, w7.a6.e(-1, -1, 119));
    }

    public final void l1(boolean z10) {
        View[] viewPages;
        this.Z = z10;
        h1 h1Var = this.f6914b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof x9) {
                    x9 x9Var = (x9) view;
                    x9Var.g(false);
                    x9Var.e(false);
                }
            }
        }
    }

    public final void n1(int i10) {
        View[] viewPages;
        this.I = i10;
        h1 h1Var = this.f6914b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof x9) {
                    ((x9) view).e(false);
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
        this.f6915b0 = bitmapDrawable;
        h1 h1Var = this.f6914b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof x9) {
                    x9 x9Var = (x9) view;
                    x9Var.g(false);
                    x9Var.e(false);
                }
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f6914b.getCurrentPosition() > 0) {
            g1();
            h1 h1Var = this.f6914b;
            h1Var.D(h1Var.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    public final void p1() {
        this.K = true;
        View[] viewPages = this.f6914b.getViewPages();
        View view = viewPages[0];
        if (view instanceof x9) {
            x9 x9Var = (x9) view;
            x9Var.b(x9Var.f8094a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof x9) {
            x9 x9Var2 = (x9) view2;
            x9Var2.b(x9Var2.f8094a);
        }
    }

    public final void q1(TLRPC.InputPeer inputPeer) {
        this.f6916c = inputPeer;
        this.v.clear();
        View[] viewPages = this.f6914b.getViewPages();
        View view = viewPages[0];
        if (view instanceof x9) {
            x9 x9Var = (x9) view;
            x9Var.b(x9Var.f8094a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof x9) {
            x9 x9Var2 = (x9) view2;
            x9Var2.b(x9Var2.f8094a);
        }
    }

    public final void r1(ca caVar) {
        if (caVar != null) {
            HashMap hashMap = caVar.d;
            int i10 = caVar.f6737a;
            ArrayList arrayList = caVar.f6739c;
            this.N = i10;
            if (i10 == 2) {
                ArrayList arrayList2 = this.h;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i10 == 3) {
                ArrayList arrayList3 = this.f6919n;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.f6920r;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.f6921s = m1(arrayList3, hashMap2).size();
            } else if (i10 == 4) {
                ArrayList arrayList4 = this.d;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.e;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.f6918f = m1(arrayList4, hashMap3).size();
            }
            if (i10 == 5) {
                this.O = true;
                this.M = 5;
                ArrayList arrayList5 = this.J;
                arrayList5.clear();
                arrayList5.addAll(caVar.f6740f);
                this.f6914b.setPosition(1);
            }
            View[] viewPages = this.f6914b.getViewPages();
            View view = viewPages[0];
            if (view instanceof x9) {
                x9 x9Var = (x9) view;
                x9Var.b(x9Var.f8094a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof x9) {
                x9 x9Var2 = (x9) view2;
                x9Var2.b(x9Var2.f8094a);
            }
        }
    }

    public ea(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, true);
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f6918f = 0;
        this.h = new ArrayList();
        this.f6919n = new ArrayList();
        this.f6920r = new HashMap();
        this.f6921s = 0;
        this.v = new HashSet();
        this.f6922w = true;
        this.f6923x = true;
        this.f6924y = false;
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
        this.f6914b.setAdapter(new y8(this, context, 1));
    }
}
