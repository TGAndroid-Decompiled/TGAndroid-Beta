package ni;

import android.text.SpannableString;
import java.lang.reflect.Array;
public class g extends SpannableString {
    public volatile boolean f20623a;

    public g(CharSequence charSequence) {
        super(charSequence);
        this.f20623a = false;
    }

    public static Object[] a(g gVar, int i7, Class cls) {
        return super.getSpans(0, i7, cls);
    }

    public static int b(g gVar, Object obj) {
        return super.getSpanStart(obj);
    }

    public static int c(g gVar, Object obj) {
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanEnd(Object obj) {
        if (!this.f20623a) {
            return -1;
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        if (!this.f20623a) {
            return 0;
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        if (!this.f20623a) {
            return -1;
        }
        return super.getSpanStart(obj);
    }

    @Override
    public Object[] getSpans(int i7, int i10, Class cls) {
        if (!this.f20623a) {
            return (Object[]) Array.newInstance(cls, 0);
        }
        return super.getSpans(i7, i10, cls);
    }

    @Override
    public int nextSpanTransition(int i7, int i10, Class cls) {
        if (!this.f20623a) {
            return i10;
        }
        return super.nextSpanTransition(i7, i10, cls);
    }
}
