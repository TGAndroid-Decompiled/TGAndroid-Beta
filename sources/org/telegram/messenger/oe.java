package org.telegram.messenger;
public final class oe implements Runnable {
    public final int f24528a;
    public final String f24529b;
    public final float f24530c;

    public oe(String str, int i3, float f10) {
        this.f24528a = i3;
        this.f24529b = str;
        this.f24530c = f10;
    }

    @Override
    public final void run() {
        switch (this.f24528a) {
            case 0:
                t0.f25457b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f24529b, this.f24530c).commit();
                return;
            default:
                t0.f25457b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f24529b, this.f24530c).commit();
                return;
        }
    }
}
