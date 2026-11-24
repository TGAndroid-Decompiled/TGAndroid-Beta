package defpackage;

import org.telegram.ui.DataSettingsActivity;
public final class i63 implements Runnable {
    public final byte a;
    public final DataSettingsActivity b;

    public i63(DataSettingsActivity dataSettingsActivity, byte b) {
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
                r61.k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                i63 i63Var = new i63(dataSettingsActivity2, (byte) 1);
                gl.d3(i63Var, 100L);
                r61.c0(new p0c(dataSettingsActivity2, i63Var, System.currentTimeMillis(), (byte) 1));
                return;
        }
    }
}
