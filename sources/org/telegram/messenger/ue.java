package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f26807a;
    public final String f26808b;
    public final float f26809c;

    public ue(String str, int i7, float f10) {
        this.f26807a = i7;
        this.f26808b = str;
        this.f26809c = f10;
    }

    @Override
    public final void run() {
        switch (this.f26807a) {
            case 0:
                t0.f26609b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f26808b, this.f26809c).commit();
                return;
            default:
                t0.f26609b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f26808b, this.f26809c).commit();
                return;
        }
    }
}
