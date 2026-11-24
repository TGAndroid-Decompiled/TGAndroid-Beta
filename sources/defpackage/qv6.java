package defpackage;

import android.widget.SeekBar;
public final class qv6 implements SeekBar.OnSeekBarChangeListener {
    public final rv6 a;

    public qv6(rv6 rv6Var) {
        this.a = rv6Var;
    }

    @Override
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        boolean z2;
        if (z) {
            ew6 ew6Var = (ew6) seekBar.getTag();
            jv6 jv6Var = (jv6) this.a.M.get(ew6Var.c);
            if (jv6Var != null) {
                if (i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jv6Var.u(z2);
            }
            ew6Var.j(i);
        }
    }

    @Override
    public final void onStartTrackingTouch(SeekBar seekBar) {
        rv6 rv6Var = this.a;
        if (rv6Var.N != null) {
            rv6Var.I.removeMessages(2);
        }
        rv6Var.N = (ew6) seekBar.getTag();
    }

    @Override
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.I.sendEmptyMessageDelayed(2, 500L);
    }
}
