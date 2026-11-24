package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class pka extends SpannableStringBuilder {
    public final Class a;
    public final ArrayList b;

    public pka(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.b = new ArrayList();
        kre.a(cls, "watcherClass cannot be null");
        this.a = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((oka) arrayList.get(i)).b.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((oka) arrayList.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    public final oka c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                oka okaVar = (oka) arrayList.get(i);
                if (okaVar.a == obj) {
                    return okaVar;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.a == obj.getClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((oka) arrayList.get(i)).b.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final int getSpanEnd(Object obj) {
        oka c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public final int getSpanFlags(Object obj) {
        oka c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public final int getSpanStart(Object obj) {
        oka c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanStart(obj);
    }

    @Override
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.a == cls) {
            oka[] okaVarArr = (oka[]) super.getSpans(i, i2, oka.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, okaVarArr.length);
            for (int i3 = 0; i3 < okaVarArr.length; i3++) {
                objArr[i3] = okaVarArr[i3].a;
            }
            return objArr;
        }
        return super.getSpans(i, i2, cls);
    }

    @Override
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || this.a == cls) ? oka.class : oka.class);
    }

    @Override
    public final void removeSpan(Object obj) {
        oka okaVar;
        if (d(obj)) {
            okaVar = c(obj);
            if (okaVar != null) {
                obj = okaVar;
            }
        } else {
            okaVar = null;
        }
        super.removeSpan(obj);
        if (okaVar != null) {
            this.b.remove(okaVar);
        }
    }

    @Override
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        e();
        return this;
    }

    @Override
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (d(obj)) {
            oka okaVar = new oka(obj);
            this.b.add(okaVar);
            obj = okaVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override
    public final CharSequence subSequence(int i, int i2) {
        return new pka(this.a, this, i, i2);
    }

    @Override
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override
    public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override
    public final Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        e();
        return this;
    }

    public pka(Class cls, pka pkaVar, int i, int i2) {
        super(pkaVar, i, i2);
        this.b = new ArrayList();
        kre.a(cls, "watcherClass cannot be null");
        this.a = cls;
    }
}
