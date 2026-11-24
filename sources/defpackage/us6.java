package defpackage;

import android.widget.SeekBar;
public final class us6 implements SeekBar.OnSeekBarChangeListener {
    public final ez3 a = new ez3(this, (byte) 27);
    public final ws6 b;

    public us6(ws6 ws6Var) {
        this.b = ws6Var;
    }

    @Override
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            short s = ws6.G0;
            ((eu6) seekBar.getTag()).j(i);
        }
    }

    @Override
    public final void onStartTrackingTouch(SeekBar seekBar) {
        ws6 ws6Var = this.b;
        if (ws6Var.d0 != null) {
            ws6Var.b0.removeCallbacks(this.a);
        }
        ws6Var.d0 = (eu6) seekBar.getTag();
    }

    @Override
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.b0.postDelayed(this.a, 500L);
    }
}
