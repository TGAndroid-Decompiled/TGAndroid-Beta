package jh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.Emoji;
public final class d extends ReplacementSpan {
    public final Emoji.EmojiSpan f10098a;

    public d(Emoji.EmojiSpan emojiSpan) {
        this.f10098a = emojiSpan;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return this.f10098a.getSize(paint, charSequence, i10, i11, fontMetricsInt);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
