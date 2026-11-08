package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f25972a;
    public final String f25973b;
    public final float f25974c;

    public ve(String str, int i7, float f10) {
        this.f25972a = i7;
        this.f25973b = str;
        this.f25974c = f10;
    }

    @Override
    public final void run() {
        switch (this.f25972a) {
            case 0:
                t0.f25566b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f25973b, this.f25974c).commit();
                return;
            default:
                t0.f25566b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f25973b, this.f25974c).commit();
                return;
        }
    }
}
