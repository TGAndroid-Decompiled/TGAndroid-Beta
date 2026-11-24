package defpackage;

import org.telegram.ui.DataSettingsActivity;
public final class u73 implements Runnable {
    public final byte a;
    public final DataSettingsActivity b;

    public u73(DataSettingsActivity dataSettingsActivity, byte b) {
        this.a = b;
        this.b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        ?? r9;
        byte b = this.a;
        DataSettingsActivity dataSettingsActivity = this.b;
        switch (b) {
            case 0:
                dataSettingsActivity.getMediaDataController().G(true);
                return;
            case 1:
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.a != null && (r9 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(r9 == true ? 1 : 0);
                    return;
                }
                return;
            default:
                y71.k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                u73 u73Var = new u73(dataSettingsActivity2, (byte) 1);
                gm.d3(u73Var, 100L);
                y71.d0(new p2c(dataSettingsActivity2, u73Var, System.currentTimeMillis(), (byte) 1));
                return;
        }
    }
}
