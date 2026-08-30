package gg;

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
import dg.d3;
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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z5;
public final class f2 extends sa {
    public final ph.d U;
    public final d2 V;
    public final u3 W;
    public final kg.d X;
    public final Paint Y;
    public final ArrayList Z;
    public final ArrayList f6626a0;
    public final HashSet f6627b0;
    public final HashSet f6628c0;
    public final ArrayList f6629d0;
    public final ArrayList f6630e0;
    public final HashMap f6631f0;
    public final ArrayList f6632g0;
    public final ArrayList f6633h0;
    public final LinkedHashMap f6634i0;
    public final z5 f6635j0;
    public String f6636k0;
    public hg.h f6637l0;
    public int m0;
    public final TLRPC.Chat f6638n0;
    public int f6639o0;
    public s f6640p0;
    public int f6641q0;
    public v f6642r0;
    public final androidx.activity.i f6643s0;

    public f2(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(p2Var, false);
        this.Y = new Paint(1);
        this.Z = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f6626a0 = arrayList;
        this.f6627b0 = new HashSet();
        this.f6628c0 = new HashSet();
        this.f6629d0 = new ArrayList();
        this.f6630e0 = new ArrayList();
        this.f6631f0 = new HashMap();
        this.f6632g0 = new ArrayList();
        this.f6633h0 = new ArrayList();
        this.f6634i0 = new LinkedHashMap();
        this.m0 = AndroidUtilities.dp(134.0f);
        this.f6643s0 = new androidx.activity.i(this, 21);
        this.backgroundPaddingLeft = 0;
        this.f6638n0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        nr nrVar = nr.h;
        this.f6635j0 = new z5(viewGroup, 0L, 350L, nrVar);
        kg.d dVar = new kg.d(getContext(), this.resourcesProvider);
        this.X = dVar;
        dVar.setOnCloseClickListener(new x1(this, 7));
        dVar.setText(y());
        dVar.setCloseImageVisible(true);
        dVar.e.c(0.0f, false);
        d2 d2Var = new d2(this, getContext(), this.resourcesProvider);
        this.V = d2Var;
        int i10 = j6.f19977h5;
        d2Var.setBackgroundColor(getThemedColor(i10));
        d2Var.setOnSearchTextChange(new b2(this, 0));
        this.W = new u3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(dVar, b6.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(d2Var, b6.f(-2.0f, 55, i12, 0, i12, 0));
        kg.a aVar = new kg.a(getContext(), this.resourcesProvider, (sl0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(j6.v0(i10, this.resourcesProvider));
        ph.d dVar2 = new ph.d(getContext(), this.resourcesProvider, true);
        this.U = dVar2;
        dVar2.setOnClickListener(new a2(this, 1));
        aVar.addView(dVar2, b6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, b6.f(-2.0f, 87, i13, 0, i13, 0));
        hg.h hVar = this.f6637l0;
        sl0 sl0Var = this.d;
        hVar.h = arrayList;
        hVar.f7102f = sl0Var;
        int i14 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new eg.f2(this, 1));
        this.d.setOnItemClickListener(new f(this, 2));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(nrVar);
        lVar.C = false;
        lVar.f5818m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new e2(this, 0));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static void P(f2 f2Var, boolean z4, Pair pair) {
        HashMap hashMap = f2Var.f6631f0;
        if (z4) {
            hashMap.putAll((Map) pair.first);
            f2Var.f6632g0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new z1(f2Var, 0));
        }
        if (f2Var.f6639o0 == 3) {
            f2Var.b0(true, true);
            f2Var.X(true);
        }
    }

    public static void Q(f2 f2Var, View view) {
        long j10;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = f2Var.f6634i0;
        d2 d2Var = f2Var.V;
        HashSet hashSet = f2Var.f6627b0;
        if (view instanceof o8) {
            linkedHashMap.clear();
            f2Var.W(true);
        } else if (view instanceof kg.n) {
            kg.n nVar = (kg.n) view;
            TLRPC.User user = nVar.getUser();
            TLRPC.Chat chat = nVar.getChat();
            if (user != null) {
                j10 = user.f19331id;
            } else {
                j10 = -chat.f19184id;
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
            if ((hashSet.size() == 11 && f2Var.f6639o0 == 1) || (hashSet.size() == p0.f() + 1 && f2Var.f6639o0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                f2Var.Y();
                return;
            }
            d2Var.b(true, hashSet, new x1(f2Var, 1), null);
            f2Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = f2Var.f28678n.getContext();
                f6 f6Var = f2Var.resourcesProvider;
                y1 y1Var = new y1(f2Var, j10, 0);
                x1 x1Var = new x1(f2Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f19503a.O = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f19503a.Q = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new c1.b(12, atomicBoolean, x1Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new f0.d(9));
                alertDialog$Builder.j(new g(0, atomicBoolean, y1Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                f2Var.R();
            }
        }
        if (view instanceof kg.c) {
            long hashCode = ((kg.c) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && f2Var.f6639o0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                f2Var.Y();
                return;
            }
            d2Var.b(true, hashSet, new x1(f2Var, 3), f2Var.f6633h0);
            if (!TextUtils.isEmpty(f2Var.f6636k0)) {
                f2Var.f6636k0 = null;
                d2Var.setText("");
                f2Var.b0(false, false);
                f2Var.b0(true, true);
                return;
            }
            f2Var.b0(true, false);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (e2.c.s(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !y3.w(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || y3.w(" ", str, lowerCase2)) {
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
        boolean z4;
        this.f6641q0 = i10;
        kg.d dVar = this.X;
        dVar.setTranslationY(Math.max(i10, (((dVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = dVar.getTranslationY() + dVar.getMeasuredHeight();
        d2 d2Var = this.V;
        d2Var.setTranslationY(translationY);
        this.d.setTranslationY((d2Var.getMeasuredHeight() + dVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int v02 = j6.v0(j6.f19977h5, this.resourcesProvider);
        Paint paint = this.Y;
        paint.setColor(v02);
        int max = Math.max(0, i10);
        if (max < AndroidUtilities.statusBarHeight) {
            z4 = true;
        } else {
            z4 = false;
        }
        z5 z5Var = this.f6635j0;
        int lerp = AndroidUtilities.lerp(max, 0, z5Var.e(z4));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - z5Var.f31241c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void R() {
        if (!TextUtils.isEmpty(this.f6636k0)) {
            this.f6636k0 = null;
            this.V.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f6643s0);
            ArrayList arrayList = this.f6629d0;
            arrayList.clear();
            arrayList.addAll(p0.e(this.f6638n0.f19184id));
            b0(false, false);
            b0(true, true);
        }
    }

    public final boolean S() {
        String string;
        HashSet hashSet = this.f6627b0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f6628c0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f6639o0;
        Context context = getContext();
        f6 f6Var = this.resourcesProvider;
        x1 x1Var = new x1(this, 0);
        x1 x1Var2 = new x1(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.f19503a.O = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
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
        alertDialog$Builder.f19503a.Q = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new f(x1Var, 1));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new a1.c(x1Var2, 28));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z4) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f6638n0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                c2 c2Var = new c2(this, z4, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
                    country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new gf.a(c2Var, 2));
                return;
            }
            long j10 = chat.f19184id;
            b2 b2Var = new b2(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f19230q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new c0(messagesController, j10, b2Var, 0));
            return;
        }
        long j11 = chat.f19184id;
        c2 c2Var2 = new c2(this, z4, 0);
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
        tL_channelParticipantsSearch.f19183q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new d3(1, messagesController2, c2Var2));
    }

    public final void V(int i10, List list) {
        long j10;
        this.f6639o0 = i10;
        this.f6636k0 = null;
        HashSet hashSet = this.f6628c0;
        hashSet.clear();
        HashSet hashSet2 = this.f6627b0;
        hashSet2.clear();
        ArrayList arrayList = this.f6629d0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f6634i0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(p0.e(this.f6638n0.f19184id));
            }
        } else {
            arrayList.addAll(this.f6630e0);
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
                    j10 = -((TLRPC.Chat) tLObject).f19184id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f19331id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        d2 d2Var = this.V;
        d2Var.setText("");
        d2Var.d.b(false);
        d2Var.b(false, hashSet2, new x1(this, 4), this.f6633h0);
        c0();
        b0(false, true);
        this.X.setText(y());
        Z(false);
        X(false);
    }

    public final void W(boolean z4) {
        HashSet hashSet = this.f6627b0;
        if (hashSet.size() != 0 || z4) {
            int i10 = this.f6639o0;
            LinkedHashMap linkedHashMap = this.f6634i0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f6633h0;
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
                        v vVar = this.f6642r0;
                        if (vVar != null) {
                            vVar.f6769c.f6804b.D(0);
                            b1 b1Var = vVar.f6767a;
                            ArrayList arrayList3 = b1Var.f6564b0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            b1Var.a0(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f19184id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                v vVar2 = this.f6642r0;
                if (vVar2 != null) {
                    x xVar = vVar2.f6769c;
                    xVar.f6804b.D(0);
                    b1 b1Var2 = vVar2.f6767a;
                    ArrayList arrayList5 = b1Var2.Z;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    b1Var2.a0(!xVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f19331id))) {
                        arrayList6.add(user);
                    }
                }
            }
            v vVar3 = this.f6642r0;
            if (vVar3 != null) {
                vVar3.f6769c.f6804b.D(0);
                b1 b1Var3 = vVar3.f6767a;
                ArrayList arrayList7 = b1Var3.f6563a0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = ig.e.f7506s;
                    b1Var3.f6568f0 = 0;
                } else {
                    int i13 = ig.e.f7506s;
                    b1Var3.f6568f0 = 1;
                }
                b1Var3.f6573k0 = 0;
                b1Var3.a0(false, true);
                b1Var3.Z(true);
                b1Var3.N();
            }
        }
    }

    public final void X(boolean z4) {
        sl0 sl0Var = this.d;
        if (z4) {
            wh.o oVar = new wh.o(getContext(), 2, 0.6f);
            oVar.f5723a = 1;
            oVar.f46638p = AndroidUtilities.dp(38.0f);
            sl0Var.getLayoutManager().w0(oVar);
            return;
        }
        sl0Var.u0(0);
    }

    public final void Y() {
        String string;
        int i10 = this.f6639o0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                }
            } else {
                string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) p0.f(), new Object[0]);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        v vVar = this.f6642r0;
        if (vVar != null) {
            new qc(vVar.f6769c.container, vVar.f6768b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void Z(boolean z4) {
        String string;
        ph.d dVar = this.U;
        boolean z10 = false;
        dVar.setShowZero(false);
        int i10 = this.f6639o0;
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.Save);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSaveRecipients);
        }
        dVar.g(string, z4, true);
        HashSet hashSet = this.f6627b0;
        dVar.c(hashSet.size(), z4);
        if (hashSet.size() > 0) {
            z10 = true;
        }
        dVar.setEnabled(z10);
    }

    public final void a0(boolean z4, boolean z10) {
        int i10;
        hg.h hVar;
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.f6626a0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f6639o0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            hg.g gVar = new hg.g(9, false);
            gVar.f7092i = 1;
            gVar.f7093j = i11;
            gVar.f7091g = string;
            arrayList2.add(gVar);
        }
        hg.g gVar2 = new hg.g(10, false);
        u3 u3Var = this.W;
        gVar2.f7100q = u3Var;
        arrayList2.add(gVar2);
        int i12 = this.f6639o0;
        HashSet hashSet = this.f6627b0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f6632g0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f6631f0.get(str)) {
                    if (TextUtils.isEmpty(this.f6636k0) || U(tL_help_country, AndroidUtilities.translitSafe(this.f6636k0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        hg.g gVar3 = new hg.g(6, true);
                        gVar3.f7090f = tL_help_country;
                        gVar3.f7094k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    hg.g gVar4 = new hg.g(7, false);
                    gVar4.f7091g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f6629d0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            hg.g gVar5 = new hg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.f7089c = null;
            gVar5.e = null;
            gVar5.f7094k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new hg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        hg.g gVar6 = new hg.g(-1, false);
        gVar6.f7095l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f6639o0 != 3) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new a2(this, 0));
        } else if (z4) {
            u3Var.setRightText(null);
        } else {
            t3 t3Var = u3Var.f22387b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
        if (z10 && (hVar = this.f6637l0) != null) {
            if (z4) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.l();
            }
        }
    }

    public final void b0(boolean z4, boolean z10) {
        a0(z4, z10);
        int i10 = 0;
        while (true) {
            sl0 sl0Var = this.d;
            if (i10 < sl0Var.getChildCount()) {
                View childAt = sl0Var.getChildAt(i10);
                if (childAt instanceof kg.n) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.f6626a0;
                        if (R < arrayList.size()) {
                            hg.g gVar = (hg.g) arrayList.get(R);
                            kg.n nVar = (kg.n) childAt;
                            nVar.c(gVar.f7094k, z4);
                            TLRPC.Chat chat = gVar.e;
                            float f10 = 1.0f;
                            if (chat != null) {
                                if (this.f6637l0.F(chat) > 200) {
                                    f10 = 0.3f;
                                }
                                nVar.i(f10, z4);
                            } else {
                                nVar.i(1.0f, z4);
                            }
                        }
                    }
                    i10++;
                }
                if (childAt instanceof kg.c) {
                    kg.c cVar = (kg.c) childAt;
                    cVar.c(this.f6627b0.contains(Long.valueOf(cVar.getCountry().default_name.hashCode())), true);
                }
                i10++;
            } else {
                Z(z4);
                return;
            }
        }
    }

    public final void c0() {
        String str;
        String formatPluralStringComma;
        int i10 = this.f6639o0;
        u3 u3Var = this.W;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    formatPluralStringComma = "";
                } else {
                    formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                    u3Var.setLayerHeight(1);
                }
            } else {
                formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) p0.f(), new Object[0]);
                u3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f6638n0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f6637l0.F(chat) - 1));
            u3Var.setLayerHeight(32);
        }
        u3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        s sVar = this.f6640p0;
        if (sVar != null) {
            sVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f6643s0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        hg.h hVar = new hg.h(getContext(), this.resourcesProvider, true);
        this.f6637l0 = hVar;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f6639o0;
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
