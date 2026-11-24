package defpackage;

import android.widget.SeekBar;
public final class uu6 implements SeekBar.OnSeekBarChangeListener {
    public final o04 a = new o04(this, (byte) 27);
    public final wu6 b;

    public uu6(wu6 wu6Var) {
        this.b = wu6Var;
    }

    @Override
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            short s = wu6.G0;
            ((ew6) seekBar.getTag()).j(i);
        }
    }

    @Override
    public final void onStartTrackingTouch(SeekBar seekBar) {
        wu6 wu6Var = this.b;
        if (wu6Var.d0 != null) {
            wu6Var.b0.removeCallbacks(this.a);
        }
        wu6Var.d0 = (ew6) seekBar.getTag();
    }

    @Override
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.b0.postDelayed(this.a, 500L);
    }
}
