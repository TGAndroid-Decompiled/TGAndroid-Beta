package defpackage;

import org.telegram.ui.DataSettingsActivity;
public final class b73 implements Runnable {
    public final byte a;
    public final DataSettingsActivity b;

    public b73(DataSettingsActivity dataSettingsActivity, byte b) {
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
                    dataSettingsActivity.r0(r9 == true ? 1 : 0);
                    return;
                }
                return;
            default:
                z61.k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                b73 b73Var = new b73(dataSettingsActivity2, (byte) 1);
                hl.d3(b73Var, 100L);
                z61.c0(new p4c(dataSettingsActivity2, b73Var, System.currentTimeMillis(), (byte) 1));
                return;
        }
    }
}
