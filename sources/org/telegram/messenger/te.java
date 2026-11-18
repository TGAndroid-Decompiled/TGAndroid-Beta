package org.telegram.messenger;
public final class te implements Runnable {
    public final int f26986a;
    public final String f26987b;
    public final float f26988c;

    public te(String str, int i7, float f10) {
        this.f26986a = i7;
        this.f26987b = str;
        this.f26988c = f10;
    }

    @Override
    public final void run() {
        switch (this.f26986a) {
            case 0:
                t0.f26915b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f26987b, this.f26988c).commit();
                return;
            default:
                t0.f26915b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f26987b, this.f26988c).commit();
                return;
        }
    }
}
