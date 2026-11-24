package defpackage;

import android.widget.TextView;
public final class sh extends TextView {
    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
