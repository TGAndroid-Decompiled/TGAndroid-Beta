package bi;

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
import org.telegram.ui.Components.s51;
public final class rb extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f3613d0 = 0;
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
    public ma T;
    public Utilities.Callback U;
    public ta V;
    public Utilities.Callback W;
    public ub X;
    public final boolean Y;
    public boolean Z;
    public boolean f3614a0;
    public p1 f3615b;
    public BitmapDrawable f3616b0;
    public TLRPC.InputPeer f3617c;
    public tb f3618c0;
    public final ArrayList d;
    public final HashMap e;
    public int f3619f;
    public final ArrayList h;
    public final ArrayList f3620n;
    public final HashMap f3621r;
    public int f3622s;
    public final HashSet v;
    public boolean f3623w;
    public boolean f3624x;
    public boolean f3625y;

    public rb(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        char c10 = 0;
        this.f3619f = 0;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f3620n = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.f3621r = hashMap2;
        this.f3622s = 0;
        this.v = new HashSet();
        this.f3623w = true;
        this.f3624x = true;
        this.f3625y = false;
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
                        long parseLong = Long.parseLong(split3[c10]);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i12 = 1; i12 < split3.length; i12++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i12])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i11++;
                    c10 = 0;
                }
                i11++;
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
        this.f3622s = l1(arrayList3, hashMap2).size();
        this.f3619f = l1(arrayList, hashMap).size();
        this.f3624x = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", false);
        this.f3625y = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", true);
        j1(context);
        this.f3615b.setAdapter(new ea(this, context, 0));
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new a1.e(26, this, messagesStorage));
        MessagesController.getInstance(this.currentAccount).getStoriesController().P();
        MessagesController.getInstance(this.currentAccount).getStoriesController().R();
    }

    public static void D(rb rbVar) {
        super.dismiss();
    }

    public static int F(rb rbVar) {
        return rbVar.currentAccount;
    }

    public static ArrayList J0(rb rbVar) {
        ArrayList h12 = rbVar.h1();
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

    public static int W(rb rbVar) {
        return rbVar.currentAccount;
    }

    public static org.telegram.ui.ActionBar.f6 X(rb rbVar) {
        return rbVar.resourcesProvider;
    }

    public static ArrayList Y0(rb rbVar) {
        TLRPC.Chat chat;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(rbVar.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (messagesController.canAddToForward(dialog)) {
                if (DialogObject.isUserDialog(dialog.f17199id)) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(dialog.f17199id));
                    if (user != null && !user.bot && user.f17342id != 777000 && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else if (DialogObject.isChatDialog(dialog.f17199id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f17199id))) != null && !ChatObject.isForum(chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public static int Z(rb rbVar) {
        return rbVar.currentAccount;
    }

    public static ArrayList Z0(rb rbVar, boolean z10, boolean z11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(rbVar.currentAccount);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(rbVar.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!rbVar.f3614a0) {
                ContactsController.getInstance(rbVar.currentAccount).loadContacts(false, 0L);
            }
            rbVar.f3614a0 = true;
        }
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (DialogObject.isUserDialog(dialog.f17199id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.f17199id));
                if (user2 != null && !user2.bot && user2.f17342id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z10 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.f17342id)) != null))) {
                    hashMap.put(Long.valueOf(user2.f17342id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z11 && DialogObject.isChatDialog(dialog.f17199id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f17199id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                hashMap.put(Long.valueOf(-chat.f17195id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            for (Map.Entry<Long, TLRPC.TL_contact> entry : concurrentHashMap.entrySet()) {
                Long key = entry.getKey();
                key.getClass();
                if (!hashMap.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.f17342id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    hashMap.put(Long.valueOf(user.f17342id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public static int b0(rb rbVar) {
        return rbVar.currentAccount;
    }

    public static ViewGroup c0(rb rbVar) {
        return rbVar.containerView;
    }

    public static boolean d0(rb rbVar) {
        return rbVar.keyboardVisible;
    }

    public static int d1(rb rbVar, TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(rbVar.currentAccount).getChatFull(chat.f17195id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = rbVar.P;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.f17195id))) != null) {
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

    public static org.telegram.ui.ActionBar.f6 r0(rb rbVar) {
        return rbVar.resourcesProvider;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f3615b.getCurrentView();
        if (currentView instanceof kb) {
            return ((kb) currentView).S;
        }
        return true;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p1 p1Var = this.f3615b;
        if (p1Var != null) {
            int i12 = 0;
            if (i10 == NotificationCenter.contactsDidLoad) {
                View[] viewPages = p1Var.getViewPages();
                View view = viewPages[0];
                if (view instanceof kb) {
                    ((kb) view).g(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof kb) {
                    ((kb) view2).g(true);
                }
            } else if (i10 == NotificationCenter.storiesBlocklistUpdate) {
                View[] viewPages2 = p1Var.getViewPages();
                while (i12 < viewPages2.length) {
                    View view3 = viewPages2[i12];
                    if (view3 instanceof kb) {
                        kb kbVar = (kb) view3;
                        int i13 = kbVar.f3006a;
                        if (i13 == 6) {
                            kbVar.a(true);
                        } else if (i13 == 0) {
                            kbVar.g(true);
                        }
                    }
                    i12++;
                }
            } else if (i10 == NotificationCenter.storiesSendAsUpdate) {
                View[] viewPages3 = p1Var.getViewPages();
                while (i12 < viewPages3.length) {
                    View view4 = viewPages3[i12];
                    if (view4 instanceof kb) {
                        kb kbVar2 = (kb) view4;
                        if (kbVar2.f3006a == 0) {
                            kbVar2.g(true);
                        }
                    }
                    i12++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        pb pbVar;
        Utilities.Callback callback = this.U;
        ArrayList arrayList = this.h;
        HashMap hashMap = this.e;
        ArrayList arrayList2 = this.d;
        HashMap hashMap2 = this.f3621r;
        ArrayList arrayList3 = this.f3620n;
        if (callback != null) {
            int i10 = this.N;
            if (i10 == 3) {
                pbVar = new pb(this.N, this.currentAccount, new ArrayList(l1(arrayList3, hashMap2)));
                ArrayList arrayList4 = pbVar.f3417c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = pbVar.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i10 == 4) {
                pbVar = new pb(this.N, this.currentAccount, new ArrayList(l1(arrayList2, hashMap)));
                ArrayList arrayList5 = pbVar.f3417c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = pbVar.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else if (i10 == 2) {
                pbVar = new pb(i10, this.currentAccount, arrayList);
            } else {
                pbVar = new pb(i10, this.currentAccount, (ArrayList) null);
            }
            this.U.run(pbVar);
            this.U = null;
        }
        org.telegram.ui.Components.pc.h(this.container);
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
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f3624x).putBoolean("story_keep", this.f3625y).apply();
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
        this.E = z10;
        p1 p1Var = this.f3615b;
        if (p1Var != null) {
            for (View view : p1Var.getViewPages()) {
                if (view instanceof kb) {
                    ((kb) view).e(false);
                }
            }
        }
    }

    public final void f1() {
        View[] viewPages;
        db dbVar;
        for (View view : this.f3615b.getViewPages()) {
            if ((view instanceof kb) && (dbVar = ((kb) view).f3014x) != null) {
                AndroidUtilities.hideKeyboard(dbVar.f3334a);
            }
        }
    }

    public final void g1(pb pbVar, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.S != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i10 = 0; i10 < this.S.size(); i10++) {
                String str = (String) this.S.get(i10);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.f17342id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !pbVar.b(user)) {
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
                spannableString.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.StoryRestrictions);
            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder);
            alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new androidx.car.app.utils.a(this, pbVar, runnable, 3));
            hc.b.s(R.string.Cancel, alertDialog$Builder, null);
            return;
        }
        View view = this.f3615b.getViewPages()[0];
        if (view instanceof kb) {
            dVar = ((kb) view).v;
        }
        if (dVar != null) {
            dVar.setLoading(true);
        }
        ma maVar = this.T;
        if (maVar != null) {
            maVar.g(pbVar, this.f3623w, this.f3624x, this.f3625y, this.G, this.f3617c, this.H, new a1.e(28, dVar, runnable), new a3.d(dVar, 27));
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.f17342id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final zh.i5 i1() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public final void j1(Context context) {
        org.telegram.ui.Components.pc.a(this.container, new fa(0));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        int i10 = org.telegram.ui.ActionBar.j6.f17998h5;
        this.R.setColor(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        this.containerView = new la(this, context);
        p1 p1Var = new p1(this, context, 1);
        this.f3615b = p1Var;
        int i11 = this.backgroundPaddingLeft;
        p1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.f3615b, w7.a6.e(-1, -1, 119));
    }

    public final void k1(boolean z10) {
        View[] viewPages;
        this.Z = z10;
        p1 p1Var = this.f3615b;
        if (p1Var != null) {
            for (View view : p1Var.getViewPages()) {
                if (view instanceof kb) {
                    kb kbVar = (kb) view;
                    kbVar.g(false);
                    kbVar.e(false);
                }
            }
        }
    }

    public final void m1(int i10) {
        View[] viewPages;
        this.I = i10;
        p1 p1Var = this.f3615b;
        if (p1Var != null) {
            for (View view : p1Var.getViewPages()) {
                if (view instanceof kb) {
                    ((kb) view).e(false);
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
        this.f3616b0 = bitmapDrawable;
        p1 p1Var = this.f3615b;
        if (p1Var != null) {
            for (View view : p1Var.getViewPages()) {
                if (view instanceof kb) {
                    kb kbVar = (kb) view;
                    kbVar.g(false);
                    kbVar.e(false);
                }
            }
        }
    }

    public final void o1() {
        this.K = true;
        View[] viewPages = this.f3615b.getViewPages();
        View view = viewPages[0];
        if (view instanceof kb) {
            kb kbVar = (kb) view;
            kbVar.b(kbVar.f3006a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof kb) {
            kb kbVar2 = (kb) view2;
            kbVar2.b(kbVar2.f3006a);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f3615b.getCurrentPosition() > 0) {
            f1();
            p1 p1Var = this.f3615b;
            p1Var.D(p1Var.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    public final void p1(TLRPC.InputPeer inputPeer) {
        this.f3617c = inputPeer;
        this.v.clear();
        View[] viewPages = this.f3615b.getViewPages();
        View view = viewPages[0];
        if (view instanceof kb) {
            kb kbVar = (kb) view;
            kbVar.b(kbVar.f3006a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof kb) {
            kb kbVar2 = (kb) view2;
            kbVar2.b(kbVar2.f3006a);
        }
    }

    public final void q1(pb pbVar) {
        if (pbVar != null) {
            HashMap hashMap = pbVar.d;
            int i10 = pbVar.f3415a;
            ArrayList arrayList = pbVar.f3417c;
            this.N = i10;
            if (i10 == 2) {
                ArrayList arrayList2 = this.h;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i10 == 3) {
                ArrayList arrayList3 = this.f3620n;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.f3621r;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.f3622s = l1(arrayList3, hashMap2).size();
            } else if (i10 == 4) {
                ArrayList arrayList4 = this.d;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.e;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.f3619f = l1(arrayList4, hashMap3).size();
            }
            if (i10 == 5) {
                this.O = true;
                this.M = 5;
                ArrayList arrayList5 = this.J;
                arrayList5.clear();
                arrayList5.addAll(pbVar.f3418f);
                this.f3615b.setPosition(1);
            }
            View[] viewPages = this.f3615b.getViewPages();
            View view = viewPages[0];
            if (view instanceof kb) {
                kb kbVar = (kb) view;
                kbVar.b(kbVar.f3006a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof kb) {
                kb kbVar2 = (kb) view2;
                kbVar2.b(kbVar2.f3006a);
            }
        }
    }

    public rb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f3619f = 0;
        this.h = new ArrayList();
        this.f3620n = new ArrayList();
        this.f3621r = new HashMap();
        this.f3622s = 0;
        this.v = new HashSet();
        this.f3623w = true;
        this.f3624x = true;
        this.f3625y = false;
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
        j1(context);
        this.f3615b.setAdapter(new ea(this, context, 1));
    }
}
