package li;

import android.text.SpannableString;
import java.lang.reflect.Array;
public class e extends SpannableString {
    public volatile boolean f15611a;

    public e(CharSequence charSequence) {
        super(charSequence);
        this.f15611a = false;
    }

    public static Object[] a(e eVar, int i10, Class cls) {
        return super.getSpans(0, i10, cls);
    }

    public static int b(e eVar, Object obj) {
        return super.getSpanStart(obj);
    }

    public static int c(e eVar, Object obj) {
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanEnd(Object obj) {
        if (!this.f15611a) {
            return -1;
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        if (!this.f15611a) {
            return 0;
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        if (!this.f15611a) {
            return -1;
        }
        return super.getSpanStart(obj);
    }

    @Override
    public Object[] getSpans(int i10, int i11, Class cls) {
        if (!this.f15611a) {
            return (Object[]) Array.newInstance(cls, 0);
        }
        return super.getSpans(i10, i11, cls);
    }

    @Override
    public int nextSpanTransition(int i10, int i11, Class cls) {
        if (!this.f15611a) {
            return i11;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }
}
