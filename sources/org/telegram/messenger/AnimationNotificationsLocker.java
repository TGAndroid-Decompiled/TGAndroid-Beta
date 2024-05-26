package org.telegram.messenger;
public class AnimationNotificationsLocker {
    final int[] allowedNotifications;
    int currentAccount;
    boolean disabled;
    int globalNotificationsIndex;
    int notificationsIndex;

    public AnimationNotificationsLocker() {
        this(null);
    }

    public AnimationNotificationsLocker(int[] iArr) {
        this.currentAccount = UserConfig.selectedAccount;
        this.notificationsIndex = -1;
        this.globalNotificationsIndex = -1;
        this.allowedNotifications = iArr;
    }

    public void lock() {
        if (this.disabled) {
            return;
        }
        int i = UserConfig.selectedAccount;
        if (this.currentAccount != i) {
            NotificationCenter.getInstance(i).onAnimationFinish(this.notificationsIndex);
            this.notificationsIndex = -1;
            this.currentAccount = i;
        }
        this.notificationsIndex = NotificationCenter.getInstance(i).setAnimationInProgress(this.notificationsIndex, this.allowedNotifications);
        this.globalNotificationsIndex = NotificationCenter.getGlobalInstance().setAnimationInProgress(this.globalNotificationsIndex, this.allowedNotifications);
    }

    public void unlock() {
        if (this.disabled) {
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).onAnimationFinish(this.notificationsIndex);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.globalNotificationsIndex);
    }

    public void disable() {
        this.disabled = true;
    }
}
