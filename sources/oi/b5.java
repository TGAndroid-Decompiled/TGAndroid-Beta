package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;
public final class b5 implements u9 {
    public final int f22025a;
    public final Object f22026b;
    public final int f22027c;
    public final int d;

    public b5(Object obj, int i7, int i10, int i11) {
        this.f22025a = i11;
        this.f22026b = obj;
        this.f22027c = i7;
        this.d = i10;
    }

    @Override
    public final Layout a() {
        switch (this.f22025a) {
            case 0:
                return (Layout) this.f22026b;
            case 1:
                return (Layout) this.f22026b;
            case 2:
                return (Layout) this.f22026b;
            default:
                return ((u9) this.f22026b).a();
        }
    }

    @Override
    public final Rect c() {
        switch (this.f22025a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f22025a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((u9) this.f22026b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.f22025a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((u9) this.f22026b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f22025a) {
            case 0:
                return ((Layout) this.f22026b).getText();
            case 1:
                return ((Layout) this.f22026b).getText();
            case 2:
                return ((Layout) this.f22026b).getText();
            default:
                return ((u9) this.f22026b).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f22025a) {
            case 0:
                return this.f22027c;
            case 1:
                return this.f22027c;
            case 2:
                return this.f22027c;
            default:
                return ((u9) this.f22026b).getX() + this.f22027c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f22025a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((u9) this.f22026b).getY() + this.d;
        }
    }
}
