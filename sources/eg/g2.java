package eg;

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
import bg.h3;
import i7.f6;
import j$.util.Map;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xa;
public final class g2 extends xa {
    public final nh.d T;
    public final e2 U;
    public final s3 V;
    public final ig.d W;
    public final Paint X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final HashSet f6003a0;
    public final HashSet f6004b0;
    public final ArrayList f6005c0;
    public final ArrayList f6006d0;
    public final HashMap f6007e0;
    public final ArrayList f6008f0;
    public final ArrayList f6009g0;
    public final LinkedHashMap f6010h0;
    public final d6 f6011i0;
    public String f6012j0;
    public fg.h f6013k0;
    public int f6014l0;
    public final TLRPC.Chat m0;
    public int f6015n0;
    public t f6016o0;
    public int f6017p0;
    public w f6018q0;
    public final ag.q1 f6019r0;

    public g2(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(o2Var, false);
        this.X = new Paint(1);
        this.Y = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z = arrayList;
        this.f6003a0 = new HashSet();
        this.f6004b0 = new HashSet();
        this.f6005c0 = new ArrayList();
        this.f6006d0 = new ArrayList();
        this.f6007e0 = new HashMap();
        this.f6008f0 = new ArrayList();
        this.f6009g0 = new ArrayList();
        this.f6010h0 = new LinkedHashMap();
        this.f6014l0 = AndroidUtilities.dp(134.0f);
        this.f6019r0 = new ag.q1(this, 20);
        this.backgroundPaddingLeft = 0;
        this.m0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.f34660e.getParent()).removeView(this.f34660e);
        ViewGroup viewGroup = this.containerView;
        jr jrVar = jr.h;
        this.f6011i0 = new d6(viewGroup, 0L, 350L, jrVar);
        ig.d dVar = new ig.d(getContext(), this.resourcesProvider);
        this.W = dVar;
        dVar.setOnCloseClickListener(new y1(this, 7));
        dVar.setText(y());
        dVar.setCloseImageVisible(true);
        dVar.f8974e.c(0.0f, false);
        e2 e2Var = new e2(this, getContext(), this.resourcesProvider);
        this.U = e2Var;
        int i10 = g6.f23133h5;
        e2Var.setBackgroundColor(getThemedColor(i10));
        e2Var.setOnSearchTextChange(new c2(this, 0));
        this.V = new s3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(dVar, f6.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(e2Var, f6.f(-2.0f, 55, i12, 0, i12, 0));
        ig.a aVar = new ig.a(getContext(), this.resourcesProvider, (jl0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(g6.v0(i10, this.resourcesProvider));
        nh.d dVar2 = new nh.d(getContext(), this.resourcesProvider, true);
        this.T = dVar2;
        dVar2.setOnClickListener(new b2(this, 1));
        aVar.addView(dVar2, f6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, f6.f(-2.0f, 87, i13, 0, i13, 0));
        fg.h hVar = this.f6013k0;
        jl0 jl0Var = this.d;
        hVar.h = arrayList;
        hVar.f6758f = jl0Var;
        int i14 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new cg.g2(this, 1));
        this.d.setOnItemClickListener(new n(this, 1));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(jrVar);
        lVar.C = false;
        lVar.f6463m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new f2(this, 0));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static void P(g2 g2Var, boolean z10, Pair pair) {
        HashMap hashMap = g2Var.f6007e0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            g2Var.f6008f0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new a2(g2Var, 0));
        }
        if (g2Var.f6015n0 == 3) {
            g2Var.b0(true, true);
            g2Var.X(true);
        }
    }

    public static void Q(g2 g2Var, View view) {
        long j10;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = g2Var.f6010h0;
        e2 e2Var = g2Var.U;
        HashSet hashSet = g2Var.f6003a0;
        if (view instanceof m8) {
            linkedHashMap.clear();
            g2Var.W(true);
        } else if (view instanceof ig.n) {
            ig.n nVar = (ig.n) view;
            TLRPC.User user = nVar.getUser();
            TLRPC.Chat chat = nVar.getChat();
            if (user != null) {
                j10 = user.f22539id;
            } else {
                j10 = -chat.f22392id;
            }
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                Long valueOf = Long.valueOf(j10);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && g2Var.f6015n0 == 1) || (hashSet.size() == q0.f() + 1 && g2Var.f6015n0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                g2Var.Y();
                return;
            }
            e2Var.b(true, hashSet, new y1(g2Var, 1), null);
            g2Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = g2Var.f34662n.getContext();
                c6 c6Var = g2Var.resourcesProvider;
                z1 z1Var = new z1(g2Var, j10, 0);
                y1 y1Var = new y1(g2Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f22714a.N = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f22714a.P = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new a9.s(11, atomicBoolean, y1Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new c(0));
                alertDialog$Builder.j(new g(0, atomicBoolean, z1Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                g2Var.R();
            }
        }
        if (view instanceof ig.c) {
            long hashCode = ((ig.c) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && g2Var.f6015n0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                g2Var.Y();
                return;
            }
            e2Var.b(true, hashSet, new y1(g2Var, 3), g2Var.f6009g0);
            if (!TextUtils.isEmpty(g2Var.f6012j0)) {
                g2Var.f6012j0 = null;
                e2Var.setText("");
                g2Var.b0(false, false);
                g2Var.b0(true, true);
                return;
            }
            g2Var.b0(true, false);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (com.google.android.recaptcha.internal.a.u(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !x3.w(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || x3.w(" ", str, lowerCase2)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        boolean z10;
        this.f6017p0 = i10;
        ig.d dVar = this.W;
        dVar.setTranslationY(Math.max(i10, (((dVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = dVar.getTranslationY() + dVar.getMeasuredHeight();
        e2 e2Var = this.U;
        e2Var.setTranslationY(translationY);
        this.d.setTranslationY((e2Var.getMeasuredHeight() + dVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int v02 = g6.v0(g6.f23133h5, this.resourcesProvider);
        Paint paint = this.X;
        paint.setColor(v02);
        int max = Math.max(0, i10);
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6 d6Var = this.f6011i0;
        int lerp = AndroidUtilities.lerp(max, 0, d6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - d6Var.f27666c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void R() {
        if (!TextUtils.isEmpty(this.f6012j0)) {
            this.f6012j0 = null;
            this.U.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f6019r0);
            ArrayList arrayList = this.f6005c0;
            arrayList.clear();
            arrayList.addAll(q0.e(this.m0.f22392id));
            b0(false, false);
            b0(true, true);
        }
    }

    public final boolean S() {
        String string;
        HashSet hashSet = this.f6003a0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f6004b0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f6015n0;
        Context context = getContext();
        c6 c6Var = this.resourcesProvider;
        y1 y1Var = new y1(this, 0);
        y1 y1Var2 = new y1(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f22714a.N = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries);
                }
            } else {
                string = LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels);
            }
        } else {
            string = LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        }
        alertDialog$Builder.f22714a.P = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new n(y1Var, 0));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new a1.c(y1Var2, 27));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.m0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                d2 d2Var = new d2(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
                    country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new ef.a(d2Var, 2));
                return;
            }
            long j10 = chat.f22392id;
            c2 c2Var = new c2(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f22438q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new d0(messagesController, j10, c2Var, 0));
            return;
        }
        long j11 = chat.f22392id;
        d2 d2Var2 = new d2(this, z10, 0);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = messagesController2.getInputChannel(j11);
        if (str == null) {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsRecent();
        } else {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
        if (str == null) {
            str = "";
        }
        tL_channelParticipantsSearch.f22391q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new h3(1, messagesController2, d2Var2));
    }

    public final void V(int i10, List list) {
        long j10;
        this.f6015n0 = i10;
        this.f6012j0 = null;
        HashSet hashSet = this.f6004b0;
        hashSet.clear();
        HashSet hashSet2 = this.f6003a0;
        hashSet2.clear();
        ArrayList arrayList = this.f6005c0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f6010h0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(q0.e(this.m0.f22392id));
            }
        } else {
            arrayList.addAll(this.f6006d0);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if (tLObject instanceof TLRPC.TL_inputPeerChat) {
                    j10 = -((TLRPC.TL_inputPeerChat) tLObject).chat_id;
                } else {
                    j10 = 0;
                }
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j10 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).f22392id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f22539id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        e2 e2Var = this.U;
        e2Var.setText("");
        e2Var.d.b(false);
        e2Var.b(false, hashSet2, new y1(this, 4), this.f6009g0);
        c0();
        b0(false, true);
        this.W.setText(y());
        Z(false);
        X(false);
    }

    public final void W(boolean z10) {
        HashSet hashSet = this.f6003a0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f6015n0;
            LinkedHashMap linkedHashMap = this.f6010h0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f6009g0;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                            if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                                arrayList.add(tL_help_country);
                            }
                        }
                        w wVar = this.f6018q0;
                        if (wVar != null) {
                            wVar.f6154c.f6191b.D(0);
                            c1 c1Var = wVar.f6152a;
                            ArrayList arrayList3 = c1Var.f5935a0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            c1Var.a0(false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (hashSet.contains(Long.valueOf(-chat.f22392id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                w wVar2 = this.f6018q0;
                if (wVar2 != null) {
                    y yVar = wVar2.f6154c;
                    yVar.f6191b.D(0);
                    c1 c1Var2 = wVar2.f6152a;
                    ArrayList arrayList5 = c1Var2.Y;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    c1Var2.a0(!yVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f22539id))) {
                        arrayList6.add(user);
                    }
                }
            }
            w wVar3 = this.f6018q0;
            if (wVar3 != null) {
                wVar3.f6154c.f6191b.D(0);
                c1 c1Var3 = wVar3.f6152a;
                ArrayList arrayList7 = c1Var3.Z;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = gg.e.f7296s;
                    c1Var3.f5939e0 = 0;
                } else {
                    int i13 = gg.e.f7296s;
                    c1Var3.f5939e0 = 1;
                }
                c1Var3.f5944j0 = 0;
                c1Var3.a0(false, true);
                c1Var3.Z(true);
                c1Var3.M();
            }
        }
    }

    public final void X(boolean z10) {
        jl0 jl0Var = this.d;
        if (z10) {
            uh.n nVar = new uh.n(getContext(), 2, 0.6f);
            nVar.f6373a = 1;
            nVar.f49306p = AndroidUtilities.dp(38.0f);
            jl0Var.getLayoutManager().w0(nVar);
            return;
        }
        jl0Var.u0(0);
    }

    public final void Y() {
        String string;
        int i10 = this.f6015n0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                }
            } else {
                string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) q0.f(), new Object[0]);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        w wVar = this.f6018q0;
        if (wVar != null) {
            new tc(wVar.f6154c.container, wVar.f6153b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void Z(boolean z10) {
        String string;
        nh.d dVar = this.T;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f6015n0;
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.Save);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSaveRecipients);
        }
        dVar.g(string, z10, true);
        HashSet hashSet = this.f6003a0;
        dVar.c(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        fg.h hVar;
        ArrayList arrayList = this.Y;
        arrayList.clear();
        ArrayList arrayList2 = this.Z;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f6015n0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            fg.g gVar = new fg.g(9, false);
            gVar.f6747i = 1;
            gVar.f6748j = i11;
            gVar.f6746g = string;
            arrayList2.add(gVar);
        }
        fg.g gVar2 = new fg.g(10, false);
        s3 s3Var = this.V;
        gVar2.f6755q = s3Var;
        arrayList2.add(gVar2);
        int i12 = this.f6015n0;
        HashSet hashSet = this.f6003a0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f6008f0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f6007e0.get(str)) {
                    if (TextUtils.isEmpty(this.f6012j0) || U(tL_help_country, AndroidUtilities.translitSafe(this.f6012j0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        fg.g gVar3 = new fg.g(6, true);
                        gVar3.f6745f = tL_help_country;
                        gVar3.f6749k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    fg.g gVar4 = new fg.g(7, false);
                    gVar4.f6746g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f6005c0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            fg.g gVar5 = new fg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.f6743c = null;
            gVar5.f6744e = null;
            gVar5.f6749k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new fg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        fg.g gVar6 = new fg.g(-1, false);
        gVar6.f6750l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f6015n0 != 3) {
            s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new b2(this, 0));
        } else if (z10) {
            s3Var.setRightText(null);
        } else {
            r3 r3Var = s3Var.f25639b;
            r3Var.c(null, false, true);
            r3Var.setOnClickListener(null);
            r3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f6013k0) != null) {
            if (z10) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.l();
            }
        }
    }

    public final void b0(boolean z10, boolean z11) {
        a0(z10, z11);
        int i10 = 0;
        while (true) {
            jl0 jl0Var = this.d;
            if (i10 < jl0Var.getChildCount()) {
                View childAt = jl0Var.getChildAt(i10);
                if (childAt instanceof ig.n) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.Z;
                        if (R < arrayList.size()) {
                            fg.g gVar = (fg.g) arrayList.get(R);
                            ig.n nVar = (ig.n) childAt;
                            nVar.c(gVar.f6749k, z10);
                            TLRPC.Chat chat = gVar.f6744e;
                            float f9 = 1.0f;
                            if (chat != null) {
                                if (this.f6013k0.F(chat) > 200) {
                                    f9 = 0.3f;
                                }
                                nVar.i(f9, z10);
                            } else {
                                nVar.i(1.0f, z10);
                            }
                        }
                    }
                    i10++;
                }
                if (childAt instanceof ig.c) {
                    ig.c cVar = (ig.c) childAt;
                    cVar.c(this.f6003a0.contains(Long.valueOf(cVar.getCountry().default_name.hashCode())), true);
                }
                i10++;
            } else {
                Z(z10);
                return;
            }
        }
    }

    public final void c0() {
        String str;
        String formatPluralStringComma;
        int i10 = this.f6015n0;
        s3 s3Var = this.V;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    formatPluralStringComma = "";
                } else {
                    formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                    s3Var.setLayerHeight(1);
                }
            } else {
                formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) q0.f(), new Object[0]);
                s3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.m0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f6013k0.F(chat) - 1));
            s3Var.setLayerHeight(32);
        }
        s3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        t tVar = this.f6016o0;
        if (tVar != null) {
            tVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f6019r0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        fg.h hVar = new fg.h(getContext(), this.resourcesProvider, true);
        this.f6013k0 = hVar;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f6015n0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "";
                }
                return LocaleController.getString(R.string.BoostingSelectCountry);
            }
            return LocaleController.getString(R.string.BoostingAddChannelOrGroup);
        }
        return LocaleController.getString(R.string.GiftPremium);
    }
}
