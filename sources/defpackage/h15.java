package defpackage;

import android.app.Person;
import android.media.session.MediaSessionManager;
public abstract class h15 {
    public static Person.Builder a() {
        return new Person.Builder();
    }

    public static void b(int i, int i2, String str) {
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }
}
