package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f26805a;
    public final String f26806b;
    public final float f26807c;

    public ue(String str, int i7, float f10) {
        this.f26805a = i7;
        this.f26806b = str;
        this.f26807c = f10;
    }

    @Override
    public final void run() {
        switch (this.f26805a) {
            case 0:
                t0.f26600b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f26806b, this.f26807c).commit();
                return;
            default:
                t0.f26600b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f26806b, this.f26807c).commit();
                return;
        }
    }
}
