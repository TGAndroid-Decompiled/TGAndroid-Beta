package defpackage;

import android.view.View;
public final class nm implements v46, be3 {
    public final View a;
    public boolean b;
    public boolean c;
    public byte d;
    public int e;

    public nm(View view) {
        this.a = view;
    }

    @Override
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override
    public final int b(boolean z) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nm) {
            return this.a.equals(((nm) obj).a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
