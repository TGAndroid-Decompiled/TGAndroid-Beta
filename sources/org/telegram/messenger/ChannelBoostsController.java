package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class ChannelBoostsController {
    public static final int BOOSTS_FOR_LEVEL_1 = 1;
    public static final int BOOSTS_FOR_LEVEL_2 = 1;
    private final ConnectionsManager connectionsManager;
    private final int currentAccount;
    private final MessagesController messagesController;

    public static class CanApplyBoost {
        public boolean alreadyActive;
        public int boostCount = 0;
        public boolean boostedNow;
        public boolean canApply;
        public TLRPC.Chat currentChat;
        public long currentDialogId;
        public TLRPC.Peer currentPeer;
        public boolean empty;
        public int floodWait;
        public boolean isMaxLvl;
        public TL_stories.TL_premium_myBoosts myBoosts;
        public boolean needSelector;
        public long replaceDialogId;
        public int slot;

        public CanApplyBoost copy() {
            CanApplyBoost canApplyBoost = new CanApplyBoost();
            canApplyBoost.canApply = this.canApply;
            canApplyBoost.empty = this.empty;
            canApplyBoost.replaceDialogId = this.replaceDialogId;
            canApplyBoost.alreadyActive = this.alreadyActive;
            canApplyBoost.needSelector = this.needSelector;
            canApplyBoost.slot = this.slot;
            canApplyBoost.myBoosts = this.myBoosts;
            canApplyBoost.boostCount = this.boostCount;
            canApplyBoost.currentPeer = this.currentPeer;
            canApplyBoost.currentDialogId = this.currentDialogId;
            canApplyBoost.currentChat = this.currentChat;
            canApplyBoost.isMaxLvl = this.isMaxLvl;
            return canApplyBoost;
        }

        public void setMyBoosts(TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
            this.myBoosts = tL_premium_myBoosts;
            this.boostCount = 0;
            this.slot = 0;
            this.alreadyActive = false;
            this.canApply = false;
            this.needSelector = false;
            this.replaceDialogId = 0L;
            if (tL_premium_myBoosts.my_boosts.isEmpty()) {
                this.empty = true;
            }
            ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stories.TL_myBoost tL_myBoost = arrayList.get(i10);
                i10++;
                if (this.currentDialogId == DialogObject.getPeerDialogId(tL_myBoost.peer)) {
                    this.boostCount++;
                }
            }
            if (this.boostCount > 0) {
                this.alreadyActive = true;
            }
            ArrayList<TL_stories.TL_myBoost> arrayList2 = tL_premium_myBoosts.my_boosts;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                TL_stories.TL_myBoost tL_myBoost2 = arrayList2.get(i11);
                i11++;
                TL_stories.TL_myBoost tL_myBoost3 = tL_myBoost2;
                if (tL_myBoost3.peer == null) {
                    this.slot = tL_myBoost3.slot;
                    break;
                }
            }
            if (this.slot == 0) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList<TL_stories.TL_myBoost> arrayList4 = tL_premium_myBoosts.my_boosts;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (i12 < size3) {
                    TL_stories.TL_myBoost tL_myBoost4 = arrayList4.get(i12);
                    i12++;
                    TL_stories.TL_myBoost tL_myBoost5 = tL_myBoost4;
                    TLRPC.Peer peer = tL_myBoost5.peer;
                    if (peer != null && DialogObject.getPeerDialogId(peer) != (-this.currentChat.f20845id)) {
                        arrayList3.add(tL_myBoost5);
                    }
                }
                if (arrayList3.size() == 1 && ((TL_stories.TL_myBoost) arrayList3.get(0)).cooldown_until_date == 0) {
                    TL_stories.TL_myBoost tL_myBoost6 = (TL_stories.TL_myBoost) arrayList3.get(0);
                    this.replaceDialogId = DialogObject.getPeerDialogId(tL_myBoost6.peer);
                    this.slot = tL_myBoost6.slot;
                    this.canApply = true;
                } else if (arrayList3.size() >= 1) {
                    this.needSelector = true;
                    if (!hg.p0.i()) {
                        TL_stories.TL_myBoost tL_myBoost7 = (TL_stories.TL_myBoost) arrayList3.get(0);
                        this.replaceDialogId = DialogObject.getPeerDialogId(tL_myBoost7.peer);
                        this.slot = tL_myBoost7.slot;
                    }
                    this.canApply = true;
                } else {
                    this.canApply = false;
                }
            } else {
                this.canApply = true;
            }
            if (this.isMaxLvl) {
                this.canApply = false;
            }
        }
    }

    public ChannelBoostsController(int i10) {
        this.currentAccount = i10;
        this.messagesController = MessagesController.getInstance(i10);
        this.connectionsManager = ConnectionsManager.getInstance(i10);
    }

    public static void a(h5.d dVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        lambda$getBoostsStats$0(tLObject, dVar, tL_error);
    }

    public static void lambda$getBoostsStats$0(TLObject tLObject, h5.d dVar, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            dVar.accept((TL_stories.TL_premium_boostsStatus) tLObject);
            return;
        }
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (tL_error != null && R != null && "CHANNEL_PRIVATE".equals(tL_error.text)) {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity == null || !launchActivity.isFinishing()) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
                HashMap hashMap = new HashMap();
                int i10 = org.telegram.ui.ActionBar.k6.L5;
                hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
                hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
                alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.k6.w0(null, i10, false), hashMap);
                alertDialog$Builder.f21168a.T = true;
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.ChannelPrivate);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.ChannelCantOpenPrivate2);
                l.d.C(R.string.Close, alertDialog$Builder, null);
            }
        } else {
            org.telegram.ui.Components.qc.X().d0(tL_error, false);
        }
        dVar.accept(null);
    }

    public static void lambda$getBoostsStats$1(h5.d dVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new g0(tLObject, dVar, tL_error, 11));
    }

    public static void lambda$userCanBoostChannel$2(CanApplyBoost canApplyBoost, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, h5.d dVar, TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        boolean z4;
        if (tL_premium_boostsStatus.next_level_boosts <= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        canApplyBoost.isMaxLvl = z4;
        canApplyBoost.setMyBoosts(tL_premium_myBoosts);
        dVar.accept(canApplyBoost);
    }

    public static void lambda$userCanBoostChannel$3(CanApplyBoost canApplyBoost, h5.d dVar, TLRPC.TL_error tL_error) {
        if (tL_error.text.startsWith("FLOOD_WAIT")) {
            canApplyBoost.floodWait = Utilities.parseInt((CharSequence) tL_error.text).intValue();
        } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
            canApplyBoost.empty = true;
        }
        canApplyBoost.canApply = false;
        dVar.accept(canApplyBoost);
    }

    public void applyBoost(long j10, int i10, Utilities.Callback<TL_stories.TL_premium_myBoosts> callback, Utilities.Callback<TLRPC.TL_error> callback2) {
        hg.p0.a(-j10, Arrays.asList(Integer.valueOf(i10)), callback, callback2);
    }

    public void getBoostsStats(long j10, h5.d dVar) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.messagesController.getInputPeer(j10);
        this.connectionsManager.sendRequest(tL_premium_getBoostsStatus, new h0(dVar, 1));
    }

    public void userCanBoostChannel(long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, h5.d dVar) {
        CanApplyBoost canApplyBoost = new CanApplyBoost();
        canApplyBoost.currentPeer = this.messagesController.getPeer(j10);
        canApplyBoost.currentDialogId = j10;
        canApplyBoost.currentChat = this.messagesController.getChat(Long.valueOf(-j10));
        h2 h2Var = new h2(canApplyBoost, tL_premium_boostsStatus, dVar, 1);
        w wVar = new w(1, canApplyBoost, dVar);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new hg.y((Utilities.Callback) wVar, MessagesController.getInstance(UserConfig.selectedAccount), (Utilities.Callback) h2Var, 1));
    }
}
