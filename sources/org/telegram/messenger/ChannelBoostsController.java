package org.telegram.messenger;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_stories_applyBoost;
import org.telegram.tgnet.TLRPC$TL_stories_boostsStatus;
import org.telegram.tgnet.TLRPC$TL_stories_canApplyBoost;
import org.telegram.tgnet.TLRPC$TL_stories_canApplyBoostReplace;
import org.telegram.tgnet.TLRPC$TL_stories_getBoostsStatus;
import org.telegram.ui.Components.BulletinFactory;
public class ChannelBoostsController {
    public static final int BOOSTS_FOR_LEVEL_1 = 1;
    public static final int BOOSTS_FOR_LEVEL_2 = 1;
    private final ConnectionsManager connectionsManager;
    private final int currentAccount;
    private final MessagesController messagesController;

    public static void lambda$applyBoost$4(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public int getTotalBooststToLevel(int i) {
        int i2 = i < 1 ? 0 : 1;
        return i >= 2 ? i2 + 1 : i2;
    }

    public ChannelBoostsController(int i) {
        this.currentAccount = i;
        this.messagesController = MessagesController.getInstance(i);
        this.connectionsManager = ConnectionsManager.getInstance(i);
    }

    public void getBoostsStats(long j, final Consumer<TLRPC$TL_stories_boostsStatus> consumer) {
        TLRPC$TL_stories_getBoostsStatus tLRPC$TL_stories_getBoostsStatus = new TLRPC$TL_stories_getBoostsStatus();
        tLRPC$TL_stories_getBoostsStatus.peer = this.messagesController.getInputPeer(j);
        this.connectionsManager.sendRequest(tLRPC$TL_stories_getBoostsStatus, new RequestDelegate() {
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
            consumer.accept((TLRPC$TL_stories_boostsStatus) tLObject);
            return;
        }
        BulletinFactory.showForError(tLRPC$TL_error);
        consumer.accept(null);
    }

    public void userCanBoostChannel(long j, final Consumer<CanApplyBoost> consumer) {
        TLRPC$TL_stories_canApplyBoost tLRPC$TL_stories_canApplyBoost = new TLRPC$TL_stories_canApplyBoost();
        tLRPC$TL_stories_canApplyBoost.peer = this.messagesController.getInputPeer(j);
        this.connectionsManager.sendRequest(tLRPC$TL_stories_canApplyBoost, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelBoostsController.this.lambda$userCanBoostChannel$3(consumer, tLObject, tLRPC$TL_error);
            }
        }, 1024);
    }

    public void lambda$userCanBoostChannel$3(final Consumer consumer, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelBoostsController.this.lambda$userCanBoostChannel$2(tLObject, tLRPC$TL_error, consumer);
            }
        });
    }

    public void lambda$userCanBoostChannel$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error, Consumer consumer) {
        CanApplyBoost canApplyBoost = new CanApplyBoost();
        if (tLObject != null) {
            canApplyBoost.canApply = true;
            if (tLObject instanceof TLRPC$TL_stories_canApplyBoostReplace) {
                TLRPC$TL_stories_canApplyBoostReplace tLRPC$TL_stories_canApplyBoostReplace = (TLRPC$TL_stories_canApplyBoostReplace) tLObject;
                this.messagesController.putChats(tLRPC$TL_stories_canApplyBoostReplace.chats, false);
                long peerDialogId = DialogObject.getPeerDialogId(tLRPC$TL_stories_canApplyBoostReplace.current_boost);
                canApplyBoost.replaceDialogId = peerDialogId;
                if (peerDialogId == 0 && tLRPC$TL_stories_canApplyBoostReplace.chats.size() > 0) {
                    canApplyBoost.replaceDialogId = -tLRPC$TL_stories_canApplyBoostReplace.chats.get(0).id;
                }
            }
        } else if (tLRPC$TL_error != null) {
            if (tLRPC$TL_error.text.equals("SAME_BOOST_ALREADY_ACTIVE") || tLRPC$TL_error.text.equals("BOOST_NOT_MODIFIED")) {
                canApplyBoost.alreadyActive = true;
            } else if (tLRPC$TL_error.text.equals("PREMIUM_GIFTED_NOT_ALLOWED")) {
                canApplyBoost.giftedPremium = true;
            } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
                canApplyBoost.floodWait = Utilities.parseInt((CharSequence) tLRPC$TL_error.text).intValue();
                canApplyBoost.lastCheckTime = System.currentTimeMillis();
            }
        }
        consumer.accept(canApplyBoost);
    }

    public void applyBoost(long j) {
        TLRPC$TL_stories_applyBoost tLRPC$TL_stories_applyBoost = new TLRPC$TL_stories_applyBoost();
        tLRPC$TL_stories_applyBoost.peer = this.messagesController.getInputPeer(j);
        this.connectionsManager.sendRequest(tLRPC$TL_stories_applyBoost, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelBoostsController.lambda$applyBoost$4(tLObject, tLRPC$TL_error);
            }
        });
    }

    public static class CanApplyBoost {
        public boolean alreadyActive;
        public boolean canApply;
        public int floodWait;
        public boolean giftedPremium;
        private long lastCheckTime;
        public long replaceDialogId;

        public void checkTime() {
            this.floodWait = (int) (this.floodWait - ((System.currentTimeMillis() - this.lastCheckTime) / 1000));
            this.lastCheckTime = System.currentTimeMillis();
            if (this.floodWait < 0) {
                this.floodWait = 0;
                this.canApply = true;
            }
        }
    }
}
