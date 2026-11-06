package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f25961a;
    public final String f25962b;
    public final float f25963c;

    public ve(String str, int i7, float f10) {
        this.f25961a = i7;
        this.f25962b = str;
        this.f25963c = f10;
    }

    @Override
    public final void run() {
        switch (this.f25961a) {
            case 0:
                t0.f25555b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f25962b, this.f25963c).commit();
                return;
            default:
                t0.f25555b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f25962b, this.f25963c).commit();
                return;
        }
    }
}
