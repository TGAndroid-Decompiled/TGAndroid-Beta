package e0;

import android.app.Notification;
import android.app.Person;
public abstract class t {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z9) {
        return messagingStyle.setGroupConversation(z9);
    }
}
