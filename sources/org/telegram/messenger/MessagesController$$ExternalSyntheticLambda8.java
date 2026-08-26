package org.telegram.messenger;

import android.content.SharedPreferences;
import androidx.collection.LongSparseArray;
import java.io.FileNotFoundException;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;

public final class MessagesController$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;
    public final int f$5;
    public final long f$6;

    public MessagesController$$ExternalSyntheticLambda8(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j, TLRPC.Chat chat, LongSparseArray longSparseArray, int i, long j2) {
        this.f$0 = messagesController;
        this.f$1 = updates_channeldifference;
        this.f$2 = j;
        this.f$3 = chat;
        this.f$4 = longSparseArray;
        this.f$5 = i;
        this.f$6 = j2;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f$1, this.f$2, (TLRPC.Chat) this.f$3, (LongSparseArray) this.f$4, this.f$5, this.f$6);
                break;
            default:
                ((ItemOptions) this.f$0).dismiss();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f$5);
                StringBuilder sb = new StringBuilder("sound_enabled_");
                long j = this.f$2;
                long j2 = this.f$6;
                boolean z = notificationsSettings.getBoolean(MessagesController$$ExternalSyntheticOutline1.m(j, j2, sb), true);
                notificationsSettings.edit().putBoolean(MessagesController$$ExternalSyntheticOutline1.m(j, j2, new StringBuilder("sound_enabled_")), !z).apply();
                ((ItemOptions) this.f$1).dismiss();
                BaseFragment baseFragment = (BaseFragment) this.f$3;
                if (BulletinFactory.canShowBulletin(baseFragment)) {
                    BulletinFactory.createSoundEnabledBulletin(z ? 1 : 0, baseFragment, (Theme.ResourcesProvider) this.f$4).show();
                }
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda8(ItemOptions itemOptions, int i, long j, long j2, ItemOptions itemOptions2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = itemOptions;
        this.f$5 = i;
        this.f$2 = j;
        this.f$6 = j2;
        this.f$1 = itemOptions2;
        this.f$3 = baseFragment;
        this.f$4 = resourcesProvider;
    }
}
