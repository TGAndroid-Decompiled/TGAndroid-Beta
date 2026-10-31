package bi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;
public final class o5 implements u9 {
    public final int f3267a;
    public final Object f3268b;
    public final int f3269c;
    public final int d;

    public o5(Object obj, int i10, int i11, int i12) {
        this.f3267a = i12;
        this.f3268b = obj;
        this.f3269c = i10;
        this.d = i11;
    }

    @Override
    public final Layout a() {
        switch (this.f3267a) {
            case 0:
                return (Layout) this.f3268b;
            case 1:
                return (Layout) this.f3268b;
            case 2:
                return (Layout) this.f3268b;
            default:
                return ((u9) this.f3268b).a();
        }
    }

    @Override
    public final Rect c() {
        switch (this.f3267a) {
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
        switch (this.f3267a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((u9) this.f3268b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.f3267a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((u9) this.f3268b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f3267a) {
            case 0:
                return ((Layout) this.f3268b).getText();
            case 1:
                return ((Layout) this.f3268b).getText();
            case 2:
                return ((Layout) this.f3268b).getText();
            default:
                return ((u9) this.f3268b).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f3267a) {
            case 0:
                return this.f3269c;
            case 1:
                return this.f3269c;
            case 2:
                return this.f3269c;
            default:
                return ((u9) this.f3268b).getX() + this.f3269c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f3267a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((u9) this.f3268b).getY() + this.d;
        }
    }
}
