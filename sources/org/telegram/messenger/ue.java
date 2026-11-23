package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f27182a;
    public final String f27183b;
    public final float f27184c;

    public ue(String str, int i7, float f10) {
        this.f27182a = i7;
        this.f27183b = str;
        this.f27184c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27182a) {
            case 0:
                t0.f26931b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f27183b, this.f27184c).commit();
                return;
            default:
                t0.f26931b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f27183b, this.f27184c).commit();
                return;
        }
    }
}
