package defpackage;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.lang.reflect.Array;
public class yk2 extends SpannableString {
    public static final int b = 0;
    public volatile boolean a;

    public yk2(CharSequence charSequence) {
        super(charSequence);
        this.a = false;
    }

    public final int a(CharacterStyle characterStyle) {
        return super.getSpanEnd(characterStyle);
    }

    public final int b(CharacterStyle characterStyle) {
        return super.getSpanStart(characterStyle);
    }

    public final Object[] c(Class cls, int i) {
        return super.getSpans(0, i, cls);
    }

    @Override
    public int getSpanEnd(Object obj) {
        if (!this.a) {
            return -1;
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        if (!this.a) {
            return 0;
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        if (!this.a) {
            return -1;
        }
        return super.getSpanStart(obj);
    }

    @Override
    public Object[] getSpans(int i, int i2, Class cls) {
        if (!this.a) {
            return (Object[]) Array.newInstance(cls, 0);
        }
        return super.getSpans(i, i2, cls);
    }

    @Override
    public int nextSpanTransition(int i, int i2, Class cls) {
        if (!this.a) {
            return i2;
        }
        return super.nextSpanTransition(i, i2, cls);
    }
}
