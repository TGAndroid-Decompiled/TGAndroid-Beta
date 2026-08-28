package dh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.Emoji;
public final class d extends ReplacementSpan {
    public final Emoji.EmojiSpan f4577a;

    public d(Emoji.EmojiSpan emojiSpan) {
        this.f4577a = emojiSpan;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return this.f4577a.getSize(paint, charSequence, i9, i10, fontMetricsInt);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }
}
