package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;
public final class b5 implements u9 {
    public final int f22022a;
    public final Object f22023b;
    public final int f22024c;
    public final int d;

    public b5(Object obj, int i7, int i10, int i11) {
        this.f22022a = i11;
        this.f22023b = obj;
        this.f22024c = i7;
        this.d = i10;
    }

    @Override
    public final Layout a() {
        switch (this.f22022a) {
            case 0:
                return (Layout) this.f22023b;
            case 1:
                return (Layout) this.f22023b;
            case 2:
                return (Layout) this.f22023b;
            default:
                return ((u9) this.f22023b).a();
        }
    }

    @Override
    public final Rect c() {
        switch (this.f22022a) {
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
        switch (this.f22022a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((u9) this.f22023b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.f22022a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((u9) this.f22023b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f22022a) {
            case 0:
                return ((Layout) this.f22023b).getText();
            case 1:
                return ((Layout) this.f22023b).getText();
            case 2:
                return ((Layout) this.f22023b).getText();
            default:
                return ((u9) this.f22023b).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f22022a) {
            case 0:
                return this.f22024c;
            case 1:
                return this.f22024c;
            case 2:
                return this.f22024c;
            default:
                return ((u9) this.f22023b).getX() + this.f22024c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f22022a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((u9) this.f22023b).getY() + this.d;
        }
    }
}
