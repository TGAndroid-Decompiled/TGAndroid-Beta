package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f18283a;
    public final String f18284b;
    public final float f18285c;

    public ue(String str, int i10, float f7) {
        this.f18283a = i10;
        this.f18284b = str;
        this.f18285c = f7;
    }

    @Override
    public final void run() {
        switch (this.f18283a) {
            case 0:
                w0.f19025b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f18284b, this.f18285c).commit();
                return;
            default:
                w0.f19025b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f18284b, this.f18285c).commit();
                return;
        }
    }
}
