package defpackage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.ui.DataSettingsActivity;
public final class d73 implements DialogInterface.OnClickListener {
    public final DataSettingsActivity a;
    public final SharedPreferences b;
    public final int c;

    public d73(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i) {
        this.a = dataSettingsActivity;
        this.b = sharedPreferences;
        this.c = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        DataSettingsActivity dataSettingsActivity = this.a;
        dataSettingsActivity.getClass();
        if (i != 0) {
            i2 = 3;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        i2 = -1;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 1;
                }
            }
        } else {
            i2 = 0;
        }
        if (i2 != -1) {
            this.b.edit().putInt("VoipDataSaving", i2).commit();
            dataSettingsActivity.V = true;
        }
        t20 t20Var = dataSettingsActivity.a;
        if (t20Var != null) {
            t20Var.g(this.c);
        }
    }
}
