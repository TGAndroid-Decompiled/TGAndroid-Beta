package org.telegram.messenger;

import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.tl.TL_stories$TL_myBoost;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.tgnet.tl.TL_stories$TL_premium_getBoostsStatus;
import org.telegram.tgnet.tl.TL_stories$TL_premium_myBoosts;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
public class ChannelBoostsController {
    public static final int BOOSTS_FOR_LEVEL_1 = 1;
    public static final int BOOSTS_FOR_LEVEL_2 = 1;
    private final ConnectionsManager connectionsManager;
    private final int currentAccount;
    private final MessagesController messagesController;

    public ChannelBoostsController(int i) {
        this.currentAccount = i;
        this.messagesController = MessagesController.getInstance(i);
        this.connectionsManager = ConnectionsManager.getInstance(i);
    }

    public void getBoostsStats(long j, final Consumer<TL_stories$TL_premium_boostsStatus> consumer) {
        TL_stories$TL_premium_getBoostsStatus tL_stories$TL_premium_getBoostsStatus = new TL_stories$TL_premium_getBoostsStatus();
        tL_stories$TL_premium_getBoostsStatus.peer = this.messagesController.getInputPeer(j);
        this.connectionsManager.sendRequest(tL_stories$TL_premium_getBoostsStatus, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelBoostsController.lambda$getBoostsStats$1(Consumer.this, tLObject, tLRPC$TL_error);
            }
        });
    }

    public static void lambda$getBoostsStats$1(final Consumer consumer, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelBoostsController.lambda$getBoostsStats$0(TLObject.this, consumer, tLRPC$TL_error);
            }
        });
    }

    public static void lambda$getBoostsStats$0(TLObject tLObject, Consumer consumer, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            consumer.accept((TL_stories$TL_premium_boostsStatus) tLObject);
            return;
        }
        BulletinFactory.showForError(tLRPC$TL_error);
        consumer.accept(null);
    }

    public void userCanBoostChannel(long j, final TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus, final Consumer<CanApplyBoost> consumer) {
        final CanApplyBoost canApplyBoost = new CanApplyBoost();
        canApplyBoost.currentPeer = this.messagesController.getPeer(j);
        canApplyBoost.currentDialogId = j;
        canApplyBoost.currentChat = this.messagesController.getChat(Long.valueOf(-j));
        BoostRepository.getMyBoosts(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChannelBoostsController.lambda$userCanBoostChannel$2(ChannelBoostsController.CanApplyBoost.this, tL_stories$TL_premium_boostsStatus, consumer, (TL_stories$TL_premium_myBoosts) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChannelBoostsController.lambda$userCanBoostChannel$3(ChannelBoostsController.CanApplyBoost.this, consumer, (TLRPC$TL_error) obj);
            }
        });
    }

    public static void lambda$userCanBoostChannel$2(CanApplyBoost canApplyBoost, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus, Consumer consumer, TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts) {
        canApplyBoost.isMaxLvl = tL_stories$TL_premium_boostsStatus.next_level_boosts == 0;
        canApplyBoost.setMyBoosts(tL_stories$TL_premium_myBoosts);
        consumer.accept(canApplyBoost);
    }

    public static void lambda$userCanBoostChannel$3(CanApplyBoost canApplyBoost, Consumer consumer, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
            canApplyBoost.floodWait = Utilities.parseInt((CharSequence) tLRPC$TL_error.text).intValue();
        } else if (tLRPC$TL_error.text.startsWith("BOOSTS_EMPTY")) {
            canApplyBoost.empty = true;
        }
        canApplyBoost.canApply = false;
        consumer.accept(canApplyBoost);
    }

    public void applyBoost(long j, int i, Utilities.Callback<TL_stories$TL_premium_myBoosts> callback, Utilities.Callback<TLRPC$TL_error> callback2) {
        BoostRepository.applyBoost(-j, Arrays.asList(Integer.valueOf(i)), callback, callback2);
    }

    public static class CanApplyBoost {
        public boolean alreadyActive;
        public int boostCount = 0;
        public boolean boostedNow;
        public boolean canApply;
        public TLRPC$Chat currentChat;
        public long currentDialogId;
        public TLRPC$Peer currentPeer;
        public boolean empty;
        public int floodWait;
        public boolean isMaxLvl;
        public TL_stories$TL_premium_myBoosts myBoosts;
        public boolean needSelector;
        public long replaceDialogId;
        public int slot;

        public void setMyBoosts(TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts) {
            this.myBoosts = tL_stories$TL_premium_myBoosts;
            this.boostCount = 0;
            this.slot = 0;
            this.alreadyActive = false;
            this.canApply = false;
            this.needSelector = false;
            this.replaceDialogId = 0L;
            if (tL_stories$TL_premium_myBoosts.my_boosts.isEmpty()) {
                this.empty = true;
            }
            Iterator<TL_stories$TL_myBoost> it = tL_stories$TL_premium_myBoosts.my_boosts.iterator();
            while (it.hasNext()) {
                if (this.currentDialogId == DialogObject.getPeerDialogId(it.next().peer)) {
                    this.boostCount++;
                }
            }
            if (this.boostCount > 0) {
                this.alreadyActive = true;
            }
            Iterator<TL_stories$TL_myBoost> it2 = tL_stories$TL_premium_myBoosts.my_boosts.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TL_stories$TL_myBoost next = it2.next();
                if (next.peer == null) {
                    this.slot = next.slot;
                    break;
                }
            }
            if (this.slot == 0) {
                ArrayList arrayList = new ArrayList();
                Iterator<TL_stories$TL_myBoost> it3 = tL_stories$TL_premium_myBoosts.my_boosts.iterator();
                while (it3.hasNext()) {
                    TL_stories$TL_myBoost next2 = it3.next();
                    TLRPC$Peer tLRPC$Peer = next2.peer;
                    if (tLRPC$Peer != null && DialogObject.getPeerDialogId(tLRPC$Peer) != (-this.currentChat.id)) {
                        arrayList.add(next2);
                    }
                }
                if (arrayList.size() == 1) {
                    TL_stories$TL_myBoost tL_stories$TL_myBoost = (TL_stories$TL_myBoost) arrayList.get(0);
                    this.replaceDialogId = DialogObject.getPeerDialogId(tL_stories$TL_myBoost.peer);
                    this.slot = tL_stories$TL_myBoost.slot;
                    this.canApply = true;
                } else if (arrayList.size() > 1) {
                    this.needSelector = true;
                    if (!MessagesController.getInstance(UserConfig.selectedAccount).giveawayGiftsPurchaseAvailable) {
                        TL_stories$TL_myBoost tL_stories$TL_myBoost2 = (TL_stories$TL_myBoost) arrayList.get(0);
                        this.replaceDialogId = DialogObject.getPeerDialogId(tL_stories$TL_myBoost2.peer);
                        this.slot = tL_stories$TL_myBoost2.slot;
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
}
