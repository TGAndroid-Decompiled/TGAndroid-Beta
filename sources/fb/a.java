package fb;

import a5.m;
import java.util.Arrays;
import x5.l;
public final class a {
    public final String f6035a;
    public final float f6036b;
    public final int f6037c;
    public final String d;

    public a(float f10, int i9, String str, String str2) {
        int i10 = i7.b.f10941a;
        this.f6035a = str == null ? "" : str;
        this.f6036b = f10;
        this.f6037c = i9;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (l.l(this.f6035a, aVar.f6035a) && Float.compare(this.f6036b, aVar.f6036b) == 0 && this.f6037c == aVar.f6037c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6035a, Float.valueOf(this.f6036b), Integer.valueOf(this.f6037c), this.d});
    }

    public final String toString() {
        m mVar = new m(a.class.getSimpleName(), 26);
        m mVar2 = new m(25, false);
        ((m) mVar.d).d = mVar2;
        mVar.d = mVar2;
        mVar2.f99c = this.f6035a;
        mVar2.f98b = "text";
        String valueOf = String.valueOf(this.f6036b);
        m mVar3 = new m(25, false);
        ((m) mVar.d).d = mVar3;
        mVar.d = mVar3;
        mVar3.f99c = valueOf;
        mVar3.f98b = "confidence";
        String valueOf2 = String.valueOf(this.f6037c);
        m mVar4 = new m(25, false);
        ((m) mVar.d).d = mVar4;
        mVar4.f99c = valueOf2;
        mVar4.f98b = "index";
        m mVar5 = new m(25, false);
        mVar4.d = mVar5;
        mVar.d = mVar5;
        mVar5.f99c = this.d;
        mVar5.f98b = "mid";
        return mVar.toString();
    }
}
