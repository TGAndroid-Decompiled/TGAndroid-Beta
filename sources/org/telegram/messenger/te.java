package org.telegram.messenger;
public final class te implements Runnable {
    public final int f26984a;
    public final String f26985b;
    public final float f26986c;

    public te(String str, int i7, float f10) {
        this.f26984a = i7;
        this.f26985b = str;
        this.f26986c = f10;
    }

    @Override
    public final void run() {
        switch (this.f26984a) {
            case 0:
                t0.f26913b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f26985b, this.f26986c).commit();
                return;
            default:
                t0.f26913b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f26985b, this.f26986c).commit();
                return;
        }
    }
}
