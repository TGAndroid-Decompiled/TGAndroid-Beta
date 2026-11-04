package mi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.s9;
public final class c5 implements s9 {
    public final int f19546a;
    public final Object f19547b;
    public final int f19548c;
    public final int d;

    public c5(Object obj, int i3, int i10, int i11) {
        this.f19546a = i11;
        this.f19547b = obj;
        this.f19548c = i3;
        this.d = i10;
    }

    @Override
    public final Layout a() {
        switch (this.f19546a) {
            case 0:
                return (Layout) this.f19547b;
            case 1:
                return (Layout) this.f19547b;
            case 2:
                return (Layout) this.f19547b;
            default:
                return ((s9) this.f19547b).a();
        }
    }

    @Override
    public final Rect c() {
        switch (this.f19546a) {
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
        switch (this.f19546a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((s9) this.f19547b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.f19546a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((s9) this.f19547b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f19546a) {
            case 0:
                return ((Layout) this.f19547b).getText();
            case 1:
                return ((Layout) this.f19547b).getText();
            case 2:
                return ((Layout) this.f19547b).getText();
            default:
                return ((s9) this.f19547b).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f19546a) {
            case 0:
                return this.f19548c;
            case 1:
                return this.f19548c;
            case 2:
                return this.f19548c;
            default:
                return ((s9) this.f19547b).getX() + this.f19548c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f19546a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((s9) this.f19547b).getY() + this.d;
        }
    }
}
