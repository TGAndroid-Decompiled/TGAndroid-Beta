package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f18612a;
    public final String f18613b;
    public final float f18614c;

    public ve(String str, int i10, float f7) {
        this.f18612a = i10;
        this.f18613b = str;
        this.f18614c = f7;
    }

    @Override
    public final void run() {
        switch (this.f18612a) {
            case 0:
                w0.f18945b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f18613b, this.f18614c).commit();
                return;
            default:
                w0.f18945b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.f18613b, this.f18614c).commit();
                return;
        }
    }
}
