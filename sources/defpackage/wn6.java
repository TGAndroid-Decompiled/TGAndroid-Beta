package defpackage;

import org.telegram.messenger.a;
public final class wn6 implements Runnable {
    public final byte a;
    public final String b;
    public final float c;

    public wn6(String str, float f, byte b) {
        this.a = b;
        this.b = str;
        this.c = f;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                a.b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.b, this.c).commit();
                return;
            default:
                a.b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.b, this.c).commit();
                return;
        }
    }
}
