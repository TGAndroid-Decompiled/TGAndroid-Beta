package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f27146a;
    public final String f27147b;
    public final float f27148c;

    public ue(String str, int i7, float f10) {
        this.f27146a = i7;
        this.f27147b = str;
        this.f27148c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27146a) {
            case 0:
                t0.f26895b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f27147b, this.f27148c).commit();
                return;
            default:
                t0.f26895b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f27147b, this.f27148c).commit();
                return;
        }
    }
}
