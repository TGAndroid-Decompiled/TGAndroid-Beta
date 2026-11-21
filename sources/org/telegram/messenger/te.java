package org.telegram.messenger;
public final class te implements Runnable {
    public final int f27012a;
    public final String f27013b;
    public final float f27014c;

    public te(String str, int i7, float f10) {
        this.f27012a = i7;
        this.f27013b = str;
        this.f27014c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27012a) {
            case 0:
                t0.f26941b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f27013b, this.f27014c).commit();
                return;
            default:
                t0.f26941b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f27013b, this.f27014c).commit();
                return;
        }
    }
}
