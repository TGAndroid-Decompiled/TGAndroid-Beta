package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f25976a;
    public final String f25977b;
    public final float f25978c;

    public ve(String str, int i7, float f10) {
        this.f25976a = i7;
        this.f25977b = str;
        this.f25978c = f10;
    }

    @Override
    public final void run() {
        switch (this.f25976a) {
            case 0:
                t0.f25570b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f25977b, this.f25978c).commit();
                return;
            default:
                t0.f25570b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f25977b, this.f25978c).commit();
                return;
        }
    }
}
