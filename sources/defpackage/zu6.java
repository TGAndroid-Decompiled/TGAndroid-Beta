package defpackage;

import android.widget.SeekBar;
public final class zu6 implements SeekBar.OnSeekBarChangeListener {
    public final zz3 a = new zz3(this, (byte) 27);
    public final bv6 b;

    public zu6(bv6 bv6Var) {
        this.b = bv6Var;
    }

    @Override
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            short s = bv6.G0;
            ((jw6) seekBar.getTag()).j(i);
        }
    }

    @Override
    public final void onStartTrackingTouch(SeekBar seekBar) {
        bv6 bv6Var = this.b;
        if (bv6Var.d0 != null) {
            bv6Var.b0.removeCallbacks(this.a);
        }
        bv6Var.d0 = (jw6) seekBar.getTag();
    }

    @Override
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.b0.postDelayed(this.a, 500L);
    }
}
