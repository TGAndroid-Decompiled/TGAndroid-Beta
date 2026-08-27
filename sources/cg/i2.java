package cg;

import ag.z2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import h7.z5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

public final class i2 extends qa {
    public final lh.d T;
    public final g2 U;
    public final s3 V;
    public final gg.d W;
    public final Paint X;
    public final ArrayList Y;
    public final ArrayList Z;

    public final HashSet f2709a0;

    public final HashSet f2710b0;

    public final ArrayList f2711c0;

    public final ArrayList f2712d0;

    public final HashMap f2713e0;

    public final ArrayList f2714f0;

    public final ArrayList f2715g0;

    public final LinkedHashMap f2716h0;

    public final y5 f2717i0;

    public String f2718j0;

    public dg.h f2719k0;

    public int f2720l0;
    public final TLRPC.Chat m0;

    public int f2721n0;

    public s f2722o0;

    public int f2723p0;

    public v f2724q0;

    public final a8.b f2725r0;

    public i2(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(n2Var, false);
        this.X = new Paint(1);
        this.Y = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z = arrayList;
        this.f2709a0 = new HashSet();
        this.f2710b0 = new HashSet();
        this.f2711c0 = new ArrayList();
        this.f2712d0 = new ArrayList();
        this.f2713e0 = new HashMap();
        this.f2714f0 = new ArrayList();
        this.f2715g0 = new ArrayList();
        this.f2716h0 = new LinkedHashMap();
        this.f2720l0 = AndroidUtilities.dp(134.0f);
        this.f2725r0 = new a8.b(this, 9);
        this.backgroundPaddingLeft = 0;
        this.m0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.f31853e.getParent()).removeView(this.f31853e);
        ViewGroup viewGroup = this.containerView;
        er erVar = er.h;
        this.f2717i0 = new y5(viewGroup, 0L, 350L, erVar);
        gg.d dVar = new gg.d(getContext(), this.resourcesProvider);
        this.W = dVar;
        dVar.setOnCloseClickListener(new a2(this, 7));
        dVar.setText(z());
        dVar.setCloseImageVisible(true);
        dVar.f7084e.c(0.0f, false);
        g2 g2Var = new g2(this, getContext(), this.resourcesProvider);
        this.U = g2Var;
        int i10 = g6.f23124h5;
        g2Var.setBackgroundColor(getThemedColor(i10));
        g2Var.setOnSearchTextChange(new e2(this, 0));
        this.V = new s3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(dVar, z5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(g2Var, z5.f(-2.0f, 55, i12, 0, i12, 0));
        gg.a aVar = new gg.a(getContext(), this.resourcesProvider, (zk0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(g6.v0(i10, this.resourcesProvider));
        lh.d dVar2 = new lh.d(getContext(), this.resourcesProvider, true);
        this.T = dVar2;
        dVar2.setOnClickListener(new d2(this, 1));
        aVar.addView(dVar2, z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, z5.f(-2.0f, 87, i13, 0, i13, 0));
        dg.h hVar = this.f2719k0;
        zk0 zk0Var = this.d;
        hVar.h = arrayList;
        hVar.f4963f = zk0Var;
        int i14 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new z2(this, 1));
        this.d.setOnItemClickListener(new a1.c(this, 12));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(erVar);
        lVar.C = false;
        lVar.f5819m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new h2(this, 0));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static void P(i2 i2Var, boolean z10, Pair pair) {
        HashMap map = i2Var.f2713e0;
        if (z10) {
            map.putAll((Map) pair.first);
            i2Var.f2714f0.addAll((Collection) pair.second);
            j$.util.Map.EL.forEach(map, new c2(i2Var, 0));
        }
        if (i2Var.f2721n0 == 3) {
            i2Var.b0(true, true);
            i2Var.X(true);
        }
    }

    public static void Q(i2 i2Var, View view) {
        TLRPC.Chat chat;
        LinkedHashMap linkedHashMap = i2Var.f2716h0;
        g2 g2Var = i2Var.U;
        HashSet hashSet = i2Var.f2709a0;
        if (view instanceof l8) {
            linkedHashMap.clear();
            i2Var.W(true);
        } else if (view instanceof gg.o) {
            gg.o oVar = (gg.o) view;
            TLRPC.User user = oVar.getUser();
            TLRPC.Chat chat2 = oVar.getChat();
            long j10 = user != null ? user.f22527id : -chat2.f22380id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                Long lValueOf = Long.valueOf(j10);
                if (user == null) {
                    chat = user;
                    chat = chat2;
                }
                chat = user;
                linkedHashMap.put(lValueOf, chat);
            }
            if ((hashSet.size() == 11 && i2Var.f2721n0 == 1) || (hashSet.size() == q0.f() + 1 && i2Var.f2721n0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                i2Var.Y();
                return;
            }
            g2Var.b(true, hashSet, new a2(i2Var, 1), null);
            i2Var.b0(true, false);
            if (chat2 != null && !ChatObject.isPublic(chat2) && hashSet.contains(Long.valueOf(j10))) {
                Context context = i2Var.f31855n.getContext();
                c6 c6Var = i2Var.resourcesProvider;
                b2 b2Var = new b2(i2Var, j10, 0);
                a2 a2Var = new a2(i2Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat2);
                alertDialog$Builder.f22702a.N = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup);
                alertDialog$Builder.f22702a.P = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new ag.h0(6, atomicBoolean, a2Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new a9.m(14));
                alertDialog$Builder.j(new g(0, atomicBoolean, b2Var));
                alertDialog$Builder.o();
            } else if (chat2 != null) {
                i2Var.R();
            }
        }
        if (view instanceof gg.c) {
            long jHashCode = ((gg.c) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(jHashCode))) {
                hashSet.remove(Long.valueOf(jHashCode));
            } else {
                hashSet.add(Long.valueOf(jHashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && i2Var.f2721n0 == 3) {
                hashSet.remove(Long.valueOf(jHashCode));
                i2Var.Y();
                return;
            }
            g2Var.b(true, hashSet, new a2(i2Var, 3), i2Var.f2715g0);
            if (TextUtils.isEmpty(i2Var.f2718j0)) {
                i2Var.b0(true, false);
                return;
            }
            i2Var.f2718j0 = null;
            g2Var.setText("");
            i2Var.b0(false, false);
            i2Var.b0(true, true);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!com.google.android.recaptcha.internal.a.u(tL_help_country)) {
            return false;
        }
        String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || org.telegram.messenger.y1.x(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || org.telegram.messenger.y1.x(" ", str, lowerCase2);
    }

    @Override
    public final void D(Canvas canvas, int i10) {
        this.f2723p0 = i10;
        float f10 = AndroidUtilities.statusBarHeight;
        gg.d dVar = this.W;
        dVar.setTranslationY(Math.max(i10, (((dVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f10));
        float translationY = dVar.getTranslationY() + dVar.getMeasuredHeight();
        g2 g2Var = this.U;
        g2Var.setTranslationY(translationY);
        this.d.setTranslationY((g2Var.getMeasuredHeight() + dVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int iV0 = g6.v0(g6.f23124h5, this.resourcesProvider);
        Paint paint = this.X;
        paint.setColor(iV0);
        int iMax = Math.max(0, i10);
        boolean z10 = iMax < AndroidUtilities.statusBarHeight;
        y5 y5Var = this.f2717i0;
        int iLerp = AndroidUtilities.lerp(iMax, 0, y5Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, iLerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float fDp = (1.0f - y5Var.f34812c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, fDp, fDp, paint);
    }

    public final void R() {
        if (TextUtils.isEmpty(this.f2718j0)) {
            return;
        }
        this.f2718j0 = null;
        this.U.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.f2725r0);
        ArrayList arrayList = this.f2711c0;
        arrayList.clear();
        arrayList.addAll(q0.e(this.m0.f22380id));
        b0(false, false);
        b0(true, true);
    }

    public final boolean S() {
        String string;
        HashSet hashSet = this.f2709a0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f2710b0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f2721n0;
        Context context = getContext();
        c6 c6Var = this.resourcesProvider;
        a2 a2Var = new a2(this, 0);
        a2 a2Var2 = new a2(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        if (i10 == 1) {
            string = LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        } else if (i10 != 2) {
            string = i10 != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries);
        } else {
            string = LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels);
        }
        alertDialog$Builder.f22702a.P = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new a1.c(a2Var, 11));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new a1.c(a2Var2, 8));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.Chat chat = this.m0;
        if (i10 == 1) {
            long j10 = chat.f22380id;
            f2 f2Var = new f2(this, z10, 0);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = messagesController.getInputChannel(j10);
            TLRPC.ChannelParticipantsFilter tL_channelParticipantsRecent = str == null ? new TLRPC.TL_channelParticipantsRecent() : new TLRPC.TL_channelParticipantsSearch();
            tL_channels_getParticipants.filter = tL_channelParticipantsRecent;
            if (str == null) {
                str = "";
            }
            tL_channelParticipantsRecent.f22379q = str;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 50;
            connectionsManager.sendRequest(tL_channels_getParticipants, new g0(0, messagesController, f2Var));
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            f2 f2Var2 = new f2(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new cf.a(f2Var2, 2));
            return;
        }
        long j11 = chat.f22380id;
        e2 e2Var = new e2(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f22426q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new c0(messagesController2, j11, e2Var, 0));
    }

    public final void V(int i10, List list) {
        this.f2721n0 = i10;
        this.f2718j0 = null;
        HashSet hashSet = this.f2710b0;
        hashSet.clear();
        HashSet hashSet2 = this.f2709a0;
        hashSet2.clear();
        ArrayList arrayList = this.f2711c0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f2716h0;
        linkedHashMap.clear();
        if (i10 == 1) {
            arrayList.addAll(this.f2712d0);
        } else if (i10 == 2) {
            arrayList.addAll(q0.e(this.m0.f22380id));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                long jHashCode = tLObject instanceof TLRPC.TL_inputPeerChat ? -((TLRPC.TL_inputPeerChat) tLObject).chat_id : 0L;
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    jHashCode = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    jHashCode = -((TLRPC.Chat) tLObject).f22380id;
                }
                if (tLObject instanceof TLRPC.User) {
                    jHashCode = ((TLRPC.User) tLObject).f22527id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    jHashCode = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(jHashCode));
                linkedHashMap.put(Long.valueOf(jHashCode), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        g2 g2Var = this.U;
        g2Var.setText("");
        g2Var.d.b(false);
        g2Var.b(false, hashSet2, new a2(this, 4), this.f2715g0);
        c0();
        b0(false, true);
        this.W.setText(z());
        Z(false);
        X(false);
    }

    public final void W(boolean z10) {
        HashSet hashSet = this.f2709a0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f2721n0;
            LinkedHashMap linkedHashMap = this.f2716h0;
            if (i10 == 1) {
                ArrayList arrayList = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        if (hashSet.contains(Long.valueOf(user.f22527id))) {
                            arrayList.add(user);
                        }
                    }
                }
                v vVar = this.f2724q0;
                if (vVar != null) {
                    vVar.f2837c.f2851b.D(0);
                    d1 d1Var = vVar.f2835a;
                    ArrayList arrayList2 = d1Var.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i11 = eg.e.f5401s;
                        d1Var.f2638e0 = 0;
                    } else {
                        int i12 = eg.e.f5401s;
                        d1Var.f2638e0 = 1;
                    }
                    d1Var.f2643j0 = 0;
                    d1Var.a0(false, true);
                    d1Var.Z(true);
                    d1Var.N();
                    return;
                }
                return;
            }
            if (i10 == 2) {
                ArrayList arrayList3 = new ArrayList();
                for (TLObject tLObject2 : linkedHashMap.values()) {
                    if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (hashSet.contains(Long.valueOf(-chat.f22380id))) {
                            arrayList3.add(chat);
                        }
                    }
                }
                v vVar2 = this.f2724q0;
                if (vVar2 != null) {
                    x xVar = vVar2.f2837c;
                    xVar.f2851b.D(0);
                    d1 d1Var2 = vVar2.f2835a;
                    boolean z11 = !xVar.isKeyboardVisible();
                    ArrayList arrayList4 = d1Var2.Y;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    d1Var2.a0(z11, true);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.f2715g0;
            int size = arrayList6.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList6.get(i13);
                i13++;
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                    arrayList5.add(tL_help_country);
                }
            }
            v vVar3 = this.f2724q0;
            if (vVar3 != null) {
                vVar3.f2837c.f2851b.D(0);
                d1 d1Var3 = vVar3.f2835a;
                ArrayList arrayList7 = d1Var3.f2634a0;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                d1Var3.a0(false, true);
            }
        }
    }

    public final void X(boolean z10) {
        zk0 zk0Var = this.d;
        if (!z10) {
            zk0Var.u0(0);
            return;
        }
        sh.n nVar = new sh.n(getContext(), 2, 0.6f);
        nVar.f5731a = 1;
        nVar.f47990p = AndroidUtilities.dp(38.0f);
        zk0Var.getLayoutManager().w0(nVar);
    }

    public final void Y() {
        String string;
        int i10 = this.f2721n0;
        if (i10 == 1) {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        } else if (i10 != 2) {
            string = i10 != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
        } else {
            string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) q0.f(), new Object[0]);
        }
        v vVar = this.f2724q0;
        if (vVar != null) {
            new mc(vVar.f2837c.container, vVar.f2836b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void Z(boolean z10) {
        String string;
        lh.d dVar = this.T;
        dVar.setShowZero(false);
        int i10 = this.f2721n0;
        if (i10 != 1) {
            string = (i10 == 2 || i10 == 3) ? LocaleController.getString(R.string.Save) : "";
        } else {
            string = LocaleController.getString(R.string.BoostingSaveRecipients);
        }
        dVar.g(string, z10, true);
        HashSet hashSet = this.f2709a0;
        dVar.c(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void a0(boolean z10, boolean z11) {
        int iDp;
        dg.h hVar;
        ArrayList arrayList = this.Y;
        arrayList.clear();
        ArrayList arrayList2 = this.Z;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f2721n0 == 1) {
            int i10 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            dg.g gVar = new dg.g(9, false);
            gVar.f4952i = 1;
            gVar.f4953j = i10;
            gVar.f4951g = string;
            arrayList2.add(gVar);
        }
        dg.g gVar2 = new dg.g(10, false);
        s3 s3Var = this.V;
        gVar2.f4960q = s3Var;
        arrayList2.add(gVar2);
        int i11 = this.f2721n0;
        HashSet hashSet = this.f2709a0;
        if (i11 == 3) {
            ArrayList arrayList3 = this.f2714f0;
            int size = arrayList3.size();
            iDp = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f2713e0.get(str)) {
                    if (TextUtils.isEmpty(this.f2718j0) || U(tL_help_country, AndroidUtilities.translitSafe(this.f2718j0).toLowerCase())) {
                        iDp += AndroidUtilities.dp(44.0f);
                        boolean zContains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        dg.g gVar3 = new dg.g(6, true);
                        gVar3.f4950f = tL_help_country;
                        gVar3.f4954k = zContains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    int iDp2 = AndroidUtilities.dp(32.0f) + iDp;
                    String upperCase = str.toUpperCase();
                    dg.g gVar4 = new dg.g(7, false);
                    gVar4.f4951g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    iDp = iDp2;
                }
                arrayList3 = arrayList5;
            }
        } else {
            iDp = 0;
        }
        ArrayList arrayList6 = this.f2711c0;
        int size2 = arrayList6.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList6.get(i13);
            i13++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            iDp += AndroidUtilities.dp(56.0f);
            boolean zContains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            dg.g gVar5 = new dg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.f4948c = null;
            gVar5.f4949e = null;
            gVar5.f4954k = zContains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new dg.g(5, false));
            iDp += AndroidUtilities.dp(150.0f);
        }
        int iMax = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - iDp);
        dg.g gVar6 = new dg.g(-1, false);
        gVar6.f4955l = iMax;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f2721n0 != 3) {
            s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new d2(this, 0));
        } else if (z10) {
            s3Var.setRightText(null);
        } else {
            r3 r3Var = s3Var.f25628b;
            r3Var.c(null, false, true);
            r3Var.setOnClickListener(null);
            r3Var.setVisibility(0);
        }
        if (!z11 || (hVar = this.f2719k0) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList, arrayList2);
        } else {
            hVar.l();
        }
    }

    public final void b0(boolean z10, boolean z11) {
        a0(z10, z11);
        int i10 = 0;
        while (true) {
            zk0 zk0Var = this.d;
            if (i10 >= zk0Var.getChildCount()) {
                Z(z10);
                return;
            }
            View childAt = zk0Var.getChildAt(i10);
            if (childAt instanceof gg.o) {
                int iR = RecyclerView.R(childAt) - 1;
                if (iR >= 0) {
                    ArrayList arrayList = this.Z;
                    if (iR < arrayList.size()) {
                        dg.g gVar = (dg.g) arrayList.get(iR);
                        gg.o oVar = (gg.o) childAt;
                        oVar.c(gVar.f4954k, z10);
                        TLRPC.Chat chat = gVar.f4949e;
                        if (chat != null) {
                            oVar.i(this.f2719k0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            oVar.i(1.0f, z10);
                        }
                        if (childAt instanceof gg.c) {
                            gg.c cVar = (gg.c) childAt;
                            cVar.c(this.f2709a0.contains(Long.valueOf(cVar.getCountry().default_name.hashCode())), true);
                        }
                    }
                }
            } else if (childAt instanceof gg.c) {
                gg.c cVar2 = (gg.c) childAt;
                cVar2.c(this.f2709a0.contains(Long.valueOf(cVar2.getCountry().default_name.hashCode())), true);
            }
            i10++;
        }
    }

    public final void c0() {
        String pluralStringComma;
        int i10 = this.f2721n0;
        s3 s3Var = this.V;
        if (i10 == 1) {
            TLRPC.Chat chat = this.m0;
            pluralStringComma = LocaleController.formatPluralStringComma(ChatObject.isChannelAndNotMegaGroup(chat) ? "Subscribers" : "Members", Math.max(0, this.f2719k0.F(chat) - 1));
            s3Var.setLayerHeight(32);
        } else if (i10 == 2) {
            pluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) q0.f(), new Object[0]);
            s3Var.setLayerHeight(32);
        } else if (i10 != 3) {
            pluralStringComma = "";
        } else {
            pluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
            s3Var.setLayerHeight(1);
        }
        s3Var.setText(pluralStringComma);
    }

    @Override
    public final void dismiss() {
        s sVar = this.f2722o0;
        if (sVar != null) {
            sVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f2725r0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        dg.h hVar = new dg.h(getContext(), this.resourcesProvider, true);
        this.f2719k0 = hVar;
        return hVar;
    }

    @Override
    public final CharSequence z() {
        int i10 = this.f2721n0;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        if (i10 != 2) {
            return i10 != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry);
        }
        return LocaleController.getString(R.string.BoostingAddChannelOrGroup);
    }
}
