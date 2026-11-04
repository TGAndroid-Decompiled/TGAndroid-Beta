package oi;

import android.text.SpannableString;
import java.lang.reflect.Array;
public class e extends SpannableString {
    public volatile boolean f21137a;

    public e(CharSequence charSequence) {
        super(charSequence);
        this.f21137a = false;
    }

    public static Object[] a(e eVar, int i3, Class cls) {
        return super.getSpans(0, i3, cls);
    }

    public static int b(e eVar, Object obj) {
        return super.getSpanStart(obj);
    }

    public static int c(e eVar, Object obj) {
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanEnd(Object obj) {
        if (!this.f21137a) {
            return -1;
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        if (!this.f21137a) {
            return 0;
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        if (!this.f21137a) {
            return -1;
        }
        return super.getSpanStart(obj);
    }

    @Override
    public Object[] getSpans(int i3, int i10, Class cls) {
        if (!this.f21137a) {
            return (Object[]) Array.newInstance(cls, 0);
        }
        return super.getSpans(i3, i10, cls);
    }

    @Override
    public int nextSpanTransition(int i3, int i10, Class cls) {
        if (!this.f21137a) {
            return i10;
        }
        return super.nextSpanTransition(i3, i10, cls);
    }
}
