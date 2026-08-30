package e0;

import android.app.Notification;
import android.app.Person;
public abstract class w {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z4) {
        return messagingStyle.setGroupConversation(z4);
    }
}
