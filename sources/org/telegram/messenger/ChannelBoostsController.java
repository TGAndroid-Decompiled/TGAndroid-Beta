package org.telegram.messenger;

import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.LaunchActivity;

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

    public void getBoostsStats(long j, final Consumer consumer) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.messagesController.getInputPeer(j);
        this.connectionsManager.sendRequest(tL_premium_getBoostsStatus, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChannelBoostsController.$r8$lambda$4kR6chzkmjvJRhfUBkGHu8w7IOM(tLObject, consumer, tL_error);
                    }
                });
            }
        });
    }

    public static void $r8$lambda$4kR6chzkmjvJRhfUBkGHu8w7IOM(TLObject tLObject, Consumer consumer, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            consumer.accept((TL_stories.TL_premium_boostsStatus) tLObject);
            return;
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (tL_error != null && lastFragment != null && "CHANNEL_PRIVATE".equals(tL_error.text)) {
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity == null || !launchActivity.isFinishing()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getContext(), lastFragment.getResourceProvider());
                builder.setTitle(LocaleController.getString(R.string.AppName));
                HashMap map = new HashMap();
                int i = Theme.key_dialogTopBackground;
                map.put("info1", Integer.valueOf(Theme.getColor(i)));
                map.put("info2", Integer.valueOf(Theme.getColor(i)));
                builder.setTopAnimation(R.raw.not_available, 52, false, Theme.getColor(i), map);
                builder.setTopAnimationIsNew(true);
                builder.setTitle(LocaleController.getString(R.string.ChannelPrivate));
                builder.setMessage(LocaleController.getString(R.string.ChannelCantOpenPrivate2));
                builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
                builder.show();
            }
        } else {
            BulletinFactory.global().showForError(tL_error);
        }
        consumer.accept(null);
    }

    public void userCanBoostChannel(long j, final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, final Consumer consumer) {
        final CanApplyBoost canApplyBoost = new CanApplyBoost();
        canApplyBoost.currentPeer = this.messagesController.getPeer(j);
        canApplyBoost.currentDialogId = j;
        canApplyBoost.currentChat = this.messagesController.getChat(Long.valueOf(-j));
        BoostRepository.getMyBoosts(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChannelBoostsController.m375$r8$lambda$QUjpU3jxTyAfx8XRNTCZyEH0Y(canApplyBoost, tL_premium_boostsStatus, consumer, (TL_stories.TL_premium_myBoosts) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChannelBoostsController.$r8$lambda$oW_gfsAhJrrtLw4E3Qd76I9WHRs(canApplyBoost, consumer, (TLRPC.TL_error) obj);
            }
        });
    }

    public static void m375$r8$lambda$QUjpU3jxTyAfx8XRNTCZyEH0Y(CanApplyBoost canApplyBoost, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, Consumer consumer, TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        canApplyBoost.isMaxLvl = tL_premium_boostsStatus.next_level_boosts <= 0;
        canApplyBoost.setMyBoosts(tL_premium_myBoosts);
        consumer.accept(canApplyBoost);
    }

    public static void $r8$lambda$oW_gfsAhJrrtLw4E3Qd76I9WHRs(CanApplyBoost canApplyBoost, Consumer consumer, TLRPC.TL_error tL_error) {
        if (tL_error.text.startsWith("FLOOD_WAIT")) {
            canApplyBoost.floodWait = Utilities.parseInt((CharSequence) tL_error.text).intValue();
        } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
            canApplyBoost.empty = true;
        }
        canApplyBoost.canApply = false;
        consumer.accept(canApplyBoost);
    }

    public void applyBoost(long j, int i, Utilities.Callback<TL_stories.TL_premium_myBoosts> callback, Utilities.Callback<TLRPC.TL_error> callback2) {
        BoostRepository.applyBoost(-j, Arrays.asList(Integer.valueOf(i)), callback, callback2);
    }

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
            int i = 0;
            while (i < size) {
                TL_stories.TL_myBoost tL_myBoost = arrayList.get(i);
                i++;
                if (this.currentDialogId == DialogObject.getPeerDialogId(tL_myBoost.peer)) {
                    this.boostCount++;
                }
            }
            if (this.boostCount > 0) {
                this.alreadyActive = true;
            }
            ArrayList<TL_stories.TL_myBoost> arrayList2 = tL_premium_myBoosts.my_boosts;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                TL_stories.TL_myBoost tL_myBoost2 = arrayList2.get(i2);
                i2++;
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
                int i3 = 0;
                while (i3 < size3) {
                    TL_stories.TL_myBoost tL_myBoost4 = arrayList4.get(i3);
                    i3++;
                    TL_stories.TL_myBoost tL_myBoost5 = tL_myBoost4;
                    TLRPC.Peer peer = tL_myBoost5.peer;
                    if (peer != null && DialogObject.getPeerDialogId(peer) != (-this.currentChat.id)) {
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
                    if (!BoostRepository.isMultiBoostsAvailable()) {
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
}
