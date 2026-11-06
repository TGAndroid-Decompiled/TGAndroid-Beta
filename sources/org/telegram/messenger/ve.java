package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f25969a;
    public final String f25970b;
    public final float f25971c;

    public ve(String str, int i7, float f10) {
        this.f25969a = i7;
        this.f25970b = str;
        this.f25971c = f10;
    }

    @Override
    public final void run() {
        switch (this.f25969a) {
            case 0:
                t0.f25563b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f25970b, this.f25971c).commit();
                return;
            default:
                t0.f25563b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f25970b, this.f25971c).commit();
                return;
        }
    }
}
