package org.telegram.messenger;
public final class te implements Runnable {
    public final int f27081a;
    public final String f27082b;
    public final float f27083c;

    public te(String str, int i7, float f10) {
        this.f27081a = i7;
        this.f27082b = str;
        this.f27083c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27081a) {
            case 0:
                t0.f27013b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f27082b, this.f27083c).commit();
                return;
            default:
                t0.f27013b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f27082b, this.f27083c).commit();
                return;
        }
    }
}
