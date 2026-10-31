package di;

import android.text.SpannableString;
import java.lang.reflect.Array;
public class f extends SpannableString {
    public volatile boolean f5961a;

    public f(CharSequence charSequence) {
        super(charSequence);
        this.f5961a = false;
    }

    public static Object[] a(f fVar, int i10, Class cls) {
        return super.getSpans(0, i10, cls);
    }

    public static int b(f fVar, Object obj) {
        return super.getSpanStart(obj);
    }

    public static int c(f fVar, Object obj) {
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanEnd(Object obj) {
        if (!this.f5961a) {
            return -1;
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        if (!this.f5961a) {
            return 0;
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        if (!this.f5961a) {
            return -1;
        }
        return super.getSpanStart(obj);
    }

    @Override
    public Object[] getSpans(int i10, int i11, Class cls) {
        if (!this.f5961a) {
            return (Object[]) Array.newInstance(cls, 0);
        }
        return super.getSpans(i10, i11, cls);
    }

    @Override
    public int nextSpanTransition(int i10, int i11, Class cls) {
        if (!this.f5961a) {
            return i11;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }
}
