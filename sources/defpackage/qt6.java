package defpackage;

import android.widget.SeekBar;
public final class qt6 implements SeekBar.OnSeekBarChangeListener {
    public final rt6 a;

    public qt6(rt6 rt6Var) {
        this.a = rt6Var;
    }

    @Override
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        boolean z2;
        if (z) {
            eu6 eu6Var = (eu6) seekBar.getTag();
            jt6 jt6Var = (jt6) this.a.M.get(eu6Var.c);
            if (jt6Var != null) {
                if (i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jt6Var.u(z2);
            }
            eu6Var.j(i);
        }
    }

    @Override
    public final void onStartTrackingTouch(SeekBar seekBar) {
        rt6 rt6Var = this.a;
        if (rt6Var.N != null) {
            rt6Var.I.removeMessages(2);
        }
        rt6Var.N = (eu6) seekBar.getTag();
    }

    @Override
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.I.sendEmptyMessageDelayed(2, 500L);
    }
}
