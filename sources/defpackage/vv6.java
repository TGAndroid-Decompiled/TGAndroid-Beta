package defpackage;

import android.widget.SeekBar;
public final class vv6 implements SeekBar.OnSeekBarChangeListener {
    public final wv6 a;

    public vv6(wv6 wv6Var) {
        this.a = wv6Var;
    }

    @Override
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        boolean z2;
        if (z) {
            jw6 jw6Var = (jw6) seekBar.getTag();
            ov6 ov6Var = (ov6) this.a.M.get(jw6Var.c);
            if (ov6Var != null) {
                if (i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ov6Var.u(z2);
            }
            jw6Var.j(i);
        }
    }

    @Override
    public final void onStartTrackingTouch(SeekBar seekBar) {
        wv6 wv6Var = this.a;
        if (wv6Var.N != null) {
            wv6Var.I.removeMessages(2);
        }
        wv6Var.N = (jw6) seekBar.getTag();
    }

    @Override
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.I.sendEmptyMessageDelayed(2, 500L);
    }
}
